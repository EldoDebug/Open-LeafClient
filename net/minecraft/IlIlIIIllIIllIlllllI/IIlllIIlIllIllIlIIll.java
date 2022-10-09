package net.minecraft.IlIlIIIllIIllIlllllI;

import io.netty.util.*;
import java.util.*;
import java.util.concurrent.locks.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import io.netty.handler.timeout.*;
import org.apache.commons.lang3.*;
import io.netty.util.concurrent.*;
import io.netty.channel.local.*;
import java.net.*;
import io.netty.channel.epoll.*;
import io.netty.channel.socket.nio.*;
import io.netty.channel.*;
import java.io.*;
import javax.crypto.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.security.*;
import io.netty.bootstrap.*;

public class IIlllIIlIllIllIlIIll extends SimpleChannelInboundHandler
{
    private static final Logger llllIIIlIlllIlIIIIIl;
    public static final Marker llllIIIIlIIIlIlllIll;
    public static final Marker IlIlIlIlIlllllllllIl;
    public static final AttributeKey llIllIIIIIllIlIIIIlI;
    public static final llllIllllIllllIlIlII IlIIIlIlIIIllIlIlIIl;
    public static final llllIllllIllllIlIlII IlIlIIIllIllIIIIIllI;
    public static final llllIllllIllllIlIlII IllIIlllIIIIlllIIlIl;
    private final IllIIlllIIIIlllIIlIl lIIIIlIIIIIlllIllIII;
    private final Queue lIIIlllIIIllIIIllIII;
    private final ReentrantReadWriteLock llIIlIIIlIIIllIlIIIl;
    private Channel llIllIlIIIIllIlIIllI;
    private SocketAddress lIlIlIIIllIIllIIIllI;
    private llllIIIlIlllIlIIIIIl IlIlIIIllIIllIlllllI;
    private llIIIIIIlIllIIlIIIll IIIIlllIIIIIIlIIIlll;
    private boolean llllIIllllIlIlIIIIll;
    private boolean IlIllIlIlIIIlIlIlIII;
    
    static {
        llllIIIlIlllIlIIIIIl = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = MarkerManager.getMarker("NETWORK");
        IlIlIlIlIlllllllllIl = MarkerManager.getMarker("NETWORK_PACKETS", IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
        llIllIIIIIllIlIIIIlI = AttributeKey.valueOf("protocol");
        IlIIIlIlIIIllIlIlIIl = new lllIIIIlllllIlIIllIl();
        IlIlIIIllIllIIIIIllI = new IlIlIIIIIIlllIlIllIl();
        IllIIlllIIIIlllIIlIl = new IIllIIllIIIlIlIIIIlI();
    }
    
    public IIlllIIlIllIllIlIIll(final IllIIlllIIIIlllIIlIl liiiIlIIIIIlllIllIII) {
        this.lIIIlllIIIllIIIllIII = Queues.newConcurrentLinkedQueue();
        this.llIIlIIIlIIIllIlIIIl = new ReentrantReadWriteLock();
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext ctx) {
        super.channelActive(ctx);
        this.llIllIlIIIIllIlIIllI = ctx.channel();
        this.lIlIlIIIllIIllIIIllI = this.llIllIlIIIIllIlIIllI.remoteAddress();
        try {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        }
        catch (Throwable t) {
            IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl.fatal((Object)t);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIllIlIIIIllIlIIllI.attr((AttributeKey<llllIIIIlIIIlIlllIll>)IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI).set(llllIIIIlIIIlIlllIll);
        this.llIllIlIIIIllIlIIllI.config().setAutoRead(true);
        IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl.debug("Enabled auto read");
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext channelHandlerContext) {
        this.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("disconnect.endOfStream", new Object[0]));
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext channelHandlerContext, final Throwable t) {
        net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI;
        if (t instanceof TimeoutException) {
            illIIllIIIlIlIIIIlI = new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("disconnect.timeout", new Object[0]);
        }
        else {
            illIIllIIIlIlIIIIlI = new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("disconnect.genericReason", new Object[] { "Internal Exception: " + t });
        }
        this.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
    }
    
    protected void llllIIIIlIIIlIlllIll(final ChannelHandlerContext channelHandlerContext, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (this.llIllIlIIIIllIlIIllI.isOpen()) {
            try {
                ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI);
            }
            catch (IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {}
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl ilIlIIIllIIllIlllllI) {
        Validate.notNull((Object)ilIlIIIllIIllIlllllI, "packetListener", new Object[0]);
        IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl.debug("Set listener of {} to {}", new Object[] { this, ilIlIIIllIIllIlllllI });
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (this.IlIlIIIllIllIIIIIllI()) {
            this.llIllIlIIIIllIlIIllI();
            this.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll, null);
        }
        else {
            this.llIIlIIIlIIIllIlIIIl.writeLock().lock();
            try {
                this.lIIIlllIIIllIIIllIII.add(new IIlIIIIlllIlllllIlII(ilIIIIIllIlIIIlIIll, (GenericFutureListener[])null));
            }
            finally {
                this.llIIlIIIlIIIllIlIIIl.writeLock().unlock();
            }
            this.llIIlIIIlIIIllIlIIIl.writeLock().unlock();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final GenericFutureListener genericFutureListener, final GenericFutureListener... array) {
        if (this.IlIlIIIllIllIIIIIllI()) {
            this.llIllIlIIIIllIlIIllI();
            this.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll, (GenericFutureListener[])ArrayUtils.add((Object[])array, 0, (Object)genericFutureListener));
        }
        else {
            this.llIIlIIIlIIIllIlIIIl.writeLock().lock();
            try {
                this.lIIIlllIIIllIIIllIII.add(new IIlIIIIlllIlllllIlII(ilIIIIIllIlIIIlIIll, (GenericFutureListener[])ArrayUtils.add((Object[])array, 0, (Object)genericFutureListener)));
            }
            finally {
                this.llIIlIIIlIIIllIlIIIl.writeLock().unlock();
            }
            this.llIIlIIIlIIIllIlIIIl.writeLock().unlock();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final GenericFutureListener[] array) {
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.llIllIlIIIIllIlIIllI.attr((AttributeKey<llllIIIIlIIIlIlllIll>)IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI).get();
        if (llllIIIIlIIIlIlllIll2 != llllIIIIlIIIlIlllIll) {
            IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl.debug("Disabled auto read");
            this.llIllIlIIIIllIlIIllI.config().setAutoRead(false);
        }
        if (this.llIllIlIIIIllIlIIllI.eventLoop().inEventLoop()) {
            if (llllIIIIlIIIlIlllIll != llllIIIIlIIIlIlllIll2) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            }
            final ChannelFuture writeAndFlush = this.llIllIlIIIIllIlIIllI.writeAndFlush(ilIIIIIllIlIIIlIIll);
            if (array != null) {
                writeAndFlush.addListeners((GenericFutureListener<? extends Future<? super Void>>[])array);
            }
            writeAndFlush.addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE);
        }
        else {
            this.llIllIlIIIIllIlIIllI.eventLoop().execute(new IIIlIIIlIlIIlllIIlll(this, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, ilIIIIIllIlIIIlIIll, array));
        }
    }
    
    private void llIllIlIIIIllIlIIllI() {
        if (this.llIllIlIIIIllIlIIllI != null && this.llIllIlIIIIllIlIIllI.isOpen()) {
            this.llIIlIIIlIIIllIlIIIl.readLock().lock();
            try {
                while (!this.lIIIlllIIIllIIIllIII.isEmpty()) {
                    final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII = this.lIIIlllIIIllIIIllIII.poll();
                    this.llllIIIIlIIIlIlllIll(ilIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll, ilIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl);
                }
            }
            finally {
                this.llIIlIIIlIIIllIlIIIl.readLock().unlock();
            }
            this.llIIlIIIlIIIllIlIIIl.readLock().unlock();
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llIllIlIIIIllIlIIllI();
        if (this.IlIlIIIllIIllIlllllI instanceof llIIIllIlIllIllIIIIl) {
            ((llIIIllIlIllIllIIIIl)this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll();
        }
        this.llIllIlIIIIllIlIIllI.flush();
    }
    
    public SocketAddress IlIlIlIlIlllllllllIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll iiiIlllIIIIIIlIIIlll) {
        if (this.llIllIlIIIIllIlIIllI.isOpen()) {
            this.llIllIlIIIIllIlIIllI.close().awaitUninterruptibly();
            this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        }
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIIIIllIlIIllI instanceof LocalChannel || this.llIllIlIIIIllIlIIllI instanceof LocalServerChannel;
    }
    
    public static IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final InetAddress inetHost, final int inetPort, final boolean b) {
        final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = new IIlllIIlIllIllIlIIll(net.minecraft.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl);
        Serializable channelClass;
        llllIllllIllllIlIlII llllIllllIllllIlIlII;
        if (Epoll.isAvailable() && b) {
            channelClass = EpollSocketChannel.class;
            llllIllllIllllIlIlII = IIlllIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI;
        }
        else {
            channelClass = NioSocketChannel.class;
            llllIllllIllllIlIlII = IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl;
        }
        new Bootstrap().group((EventLoopGroup)llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI()).handler(new IlIlIIIlIIlIlIIlllIl(illlIIlIllIllIlIIll)).channel((Class<? extends Channel>)channelClass).connect(inetHost, inetPort).syncUninterruptibly();
        return illlIIlIllIllIlIIll;
    }
    
    public static IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final SocketAddress remoteAddress) {
        final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = new IIlllIIlIllIllIlIIll(net.minecraft.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl);
        ((AbstractBootstrap<Bootstrap, C>)new Bootstrap()).group((EventLoopGroup)IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI()).handler(new IlllllllIIIlIIIlIlII(illlIIlIllIllIlIIll)).channel(LocalChannel.class).connect(remoteAddress).syncUninterruptibly();
        return illlIIlIllIllIlIIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final SecretKey secretKey) {
        this.llllIIllllIlIlIIIIll = true;
        this.llIllIlIIIIllIlIIllI.pipeline().addBefore("splitter", "decrypt", new IIIIlllIIIIIIlIIIlll(lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2, secretKey)));
        this.llIllIlIIIIllIlIIllI.pipeline().addBefore("prepender", "encrypt", new llllIIllllIlIlIIIIll(lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1, secretKey)));
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.llIllIlIIIIllIlIIllI != null && this.llIllIlIIIIllIlIIllI.isOpen();
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.llIllIlIIIIllIlIIllI == null;
    }
    
    public llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public llIIIIIIlIllIIlIIIll lIIIIlIIIIIlllIllIII() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public void lIIIlllIIIllIIIllIII() {
        this.llIllIlIIIIllIlIIllI.config().setAutoRead(false);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (n >= 0) {
            if (this.llIllIlIIIIllIlIIllI.pipeline().get("decompress") instanceof lIlIlIIIllIIllIIIllI) {
                ((lIlIlIIIllIIllIIIllI)this.llIllIlIIIIllIlIIllI.pipeline().get("decompress")).llllIIIIlIIIlIlllIll(n);
            }
            else {
                this.llIllIlIIIIllIlIIllI.pipeline().addBefore("decoder", "decompress", new lIlIlIIIllIIllIIIllI(n));
            }
            if (this.llIllIlIIIIllIlIIllI.pipeline().get("compress") instanceof IlIlIIIllIIllIlllllI) {
                ((IlIlIIIllIIllIlllllI)this.llIllIlIIIIllIlIIllI.pipeline().get("decompress")).llllIIIIlIIIlIlllIll(n);
            }
            else {
                this.llIllIlIIIIllIlIIllI.pipeline().addBefore("encoder", "compress", new IlIlIIIllIIllIlllllI(n));
            }
        }
        else {
            if (this.llIllIlIIIIllIlIIllI.pipeline().get("decompress") instanceof lIlIlIIIllIIllIIIllI) {
                this.llIllIlIIIIllIlIIllI.pipeline().remove("decompress");
            }
            if (this.llIllIlIIIIllIlIIllI.pipeline().get("compress") instanceof IlIlIIIllIIllIlllllI) {
                this.llIllIlIIIIllIlIIllI.pipeline().remove("compress");
            }
        }
    }
    
    public void llIIlIIIlIIIllIlIIIl() {
        if (this.llIllIlIIIIllIlIIllI != null && !this.llIllIlIIIIllIlIIllI.isOpen()) {
            if (!this.IlIllIlIlIIIlIlIlIII) {
                this.IlIllIlIlIIIlIlIlIII = true;
                if (this.lIIIIlIIIIIlllIllIII() != null) {
                    this.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII());
                }
                else if (this.llllIIIlIlllIlIIIIIl() != null) {
                    this.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl("Disconnected"));
                }
            }
            else {
                IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl.warn("handleDisconnection() called twice");
            }
        }
    }
}
