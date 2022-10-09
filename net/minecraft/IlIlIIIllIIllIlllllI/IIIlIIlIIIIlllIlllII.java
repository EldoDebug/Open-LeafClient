package net.minecraft.IlIlIIIllIIllIlllllI;

import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import io.netty.channel.epoll.*;
import io.netty.channel.socket.nio.*;
import java.io.*;
import java.net.*;
import io.netty.channel.local.*;
import io.netty.channel.*;
import java.util.*;
import java.util.concurrent.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import io.netty.util.concurrent.*;
import io.netty.bootstrap.*;

public class IIIlIIlIIIIlllIlllII
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    public static final llllIllllIllllIlIlII llllIIIIlIIIlIlllIll;
    public static final llllIllllIllllIlIlII IlIlIlIlIlllllllllIl;
    public static final llllIllllIllllIlIlII llIllIIIIIllIlIIIIlI;
    private final llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    public volatile boolean IlIIIlIlIIIllIlIlIIl;
    private final List llllIIIlIlllIlIIIIIl;
    private final List lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new IlIlIllllllllIIIIlII();
        IlIlIlIlIlllllllllIl = new IIlllIlIIllIlIlIlIIl();
        llIllIIIIIllIlIIIIlI = new llIIIlIlIllIIlIlIlII();
    }
    
    public IIIlIIlIIIIlllIlllII(final llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl) {
        this.llllIIIlIlllIlIIIIIl = Collections.synchronizedList((List<Object>)Lists.newArrayList());
        this.lIIIIlIIIIIlllIllIII = Collections.synchronizedList((List<Object>)Lists.newArrayList());
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl = true;
    }
    
    public void llllIIIIlIIIlIlllIll(final InetAddress inetHost, final int inetPort) {
        synchronized (this.llllIIIlIlllIlIIIIIl) {
            Serializable channelClass;
            llllIllllIllllIlIlII llllIllllIllllIlIlII;
            if (Epoll.isAvailable() && this.IllIIlllIIIIlllIIlIl.IlIIllIIllIIllIIlIIl()) {
                channelClass = EpollServerSocketChannel.class;
                llllIllllIllllIlIlII = IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl;
                IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.info("Using epoll channel type");
            }
            else {
                channelClass = NioServerSocketChannel.class;
                llllIllllIllllIlIlII = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;
                IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.info("Using default channel type");
            }
            this.llllIIIlIlllIlIIIIIl.add(((AbstractBootstrap<ServerBootstrap, Channel>)new ServerBootstrap()).channel((Class<? extends Channel>)channelClass).childHandler(new lllllIlIIIlIlIIlllII(this)).group((EventLoopGroup)llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI()).localAddress(inetHost, inetPort).bind().syncUninterruptibly());
        }
        // monitorexit(this.llllIIIlIlllIlIIIIIl)
    }
    
    public SocketAddress llllIIIIlIIIlIlllIll() {
        final ChannelFuture syncUninterruptibly;
        synchronized (this.llllIIIlIlllIlIIIIIl) {
            syncUninterruptibly = ((AbstractBootstrap<ServerBootstrap, C>)((AbstractBootstrap<ServerBootstrap, Channel>)new ServerBootstrap()).channel(LocalServerChannel.class).childHandler(new lIllllllIIllIlIlIlII(this)).group((EventLoopGroup)IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI())).localAddress(LocalAddress.ANY).bind().syncUninterruptibly();
            this.llllIIIlIlllIlIIIIIl.add(syncUninterruptibly);
        }
        // monitorexit(this.llllIIIlIlllIlIIIIIl)
        return syncUninterruptibly.channel().localAddress();
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIIIlIlIIIllIlIlIIl = false;
        for (final ChannelFuture channelFuture : this.llllIIIlIlllIlIIIIIl) {
            try {
                channelFuture.channel().close().sync();
            }
            catch (InterruptedException ex) {
                IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.error("Interrupted whilst closing channel");
            }
        }
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        synchronized (this.lIIIIlIIIIIlllIllIII) {
            final Iterator<IIlllIIlIllIllIlIIll> iterator = (Iterator<IIlllIIlIllIllIlIIll>)this.lIIIIlIIIIIlllIllIII.iterator();
            while (iterator.hasNext()) {
                final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = iterator.next();
                if (!illlIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl()) {
                    if (!illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI()) {
                        iterator.remove();
                        illlIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl();
                    }
                    else {
                        try {
                            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll();
                        }
                        catch (Exception ex) {
                            if (illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI()) {
                                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ex, "Ticking memory connection");
                                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Ticking connection").llllIIIIlIIIlIlllIll("Connection", new llIIlllIIlllIIllIllI(this, illlIIlIllIllIlIIll));
                                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
                            }
                            IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.warn("Failed to handle packet for " + illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(), (Throwable)ex);
                            final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl("Internal server error");
                            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(new llIllIIlllllllllllll(ilIlIIIIIIlllIlIllIl), new IIlllIIIlIlllIIlllII(this, illlIIlIllIllIlIIll, ilIlIIIIIIlllIlIllIl), new GenericFutureListener[0]);
                            illlIIlIllIllIlIIll.lIIIlllIIIllIIIllIII();
                        }
                    }
                }
            }
        }
        // monitorexit(this.lIIIIlIIIIIlllIllIII)
    }
    
    public llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
