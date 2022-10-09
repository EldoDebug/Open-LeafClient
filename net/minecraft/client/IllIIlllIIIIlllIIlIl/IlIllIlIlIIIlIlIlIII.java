package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import com.google.common.base.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import java.net.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import io.netty.channel.socket.nio.*;
import io.netty.channel.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import io.netty.bootstrap.*;

public class IlIllIlIlIIIlIlIlIII
{
    private static final Splitter llllIIIIlIIIlIlllIll;
    private static final Logger IlIlIlIlIlllllllllIl;
    private final List llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = Splitter.on('\0').limit(6);
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public IlIllIlIlIIIlIlIlIII() {
        this.llIllIIIIIllIlIIIIlI = Collections.synchronizedList((List<Object>)Lists.newArrayList());
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl);
        final IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll2 = IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(InetAddress.getByName(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), false);
        this.llIllIIIIIllIlIIIIlI.add(llllIIIIlIIIlIlllIll2);
        illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl = "Pinging...";
        illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = -1L;
        illIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII = null;
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new net.minecraft.client.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll(this, llllIIIIlIIIlIlllIll2, illIIlllIIIIlllIIlIl));
        try {
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(47, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI));
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        }
        catch (Throwable t) {
            IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl.error((Object)t);
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl);
        ((AbstractBootstrap<Bootstrap, C>)new Bootstrap()).group((EventLoopGroup)IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI()).handler(new lllIIIIlllllIlIIllIl(this, llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl)).channel(NioSocketChannel.class).connect(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
    }
    
    public void llllIIIIlIIIlIlllIll() {
        synchronized (this.llIllIIIIIllIlIIIIlI) {
            final Iterator<IIlllIIlIllIllIlIIll> iterator = (Iterator<IIlllIIlIllIllIlIIll>)this.llIllIIIIIllIlIIIIlI.iterator();
            while (iterator.hasNext()) {
                final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = iterator.next();
                if (illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI()) {
                    illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll();
                }
                else {
                    iterator.remove();
                    illlIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl();
                }
            }
        }
        // monitorexit(this.llIllIIIIIllIlIIIIlI)
    }
    
    public void IlIlIlIlIlllllllllIl() {
        synchronized (this.llIllIIIIIllIlIIIIlI) {
            final Iterator<IIlllIIlIllIllIlIIll> iterator = (Iterator<IIlllIIlIllIllIlIIll>)this.llIllIIIIIllIlIIIIlI.iterator();
            while (iterator.hasNext()) {
                final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = iterator.next();
                if (illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI()) {
                    iterator.remove();
                    illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl("Cancelled"));
                }
            }
        }
        // monitorexit(this.llIllIIIIIllIlIIIIlI)
    }
}
