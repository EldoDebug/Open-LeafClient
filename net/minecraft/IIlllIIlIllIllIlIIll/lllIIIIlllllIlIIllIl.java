package net.minecraft.IIlllIIlIllIllIlIIll;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.net.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lllIIIIlllllIlIIllIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public lllIIIIlllllIlIIllIl() {
        this.IlIlIlIlIlllllllllIl = Collections.synchronizedList((List<Object>)Lists.newArrayList());
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        if (s != null && !s.startsWith("0.0.0.0") && !s.isEmpty()) {
            final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll = IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(s);
            final net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(InetAddress.getByName(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), false);
            this.IlIlIlIlIlllllllllIl.add(llllIIIIlIIIlIlllIll2);
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this, illlIIlIllIllIlIIll, llllIIIIlIIIlIlllIll2, s));
            try {
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
            }
            catch (Throwable t) {
                lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll.error((Object)t);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        synchronized (this.IlIlIlIlIlllllllllIl) {
            final Iterator<net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll> iterator = (Iterator<net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll>)this.IlIlIlIlIlllllllllIl.iterator();
            while (iterator.hasNext()) {
                final net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = iterator.next();
                if (illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI()) {
                    illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll();
                }
                else {
                    iterator.remove();
                    illlIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl();
                }
            }
        }
        // monitorexit(this.IlIlIlIlIlllllllllIl)
    }
    
    public void IlIlIlIlIlllllllllIl() {
        synchronized (this.IlIlIlIlIlllllllllIl) {
            final Iterator<net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll> iterator = (Iterator<net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll>)this.IlIlIlIlIlllllllllIl.iterator();
            while (iterator.hasNext()) {
                final net.minecraft.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = iterator.next();
                if (illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI()) {
                    iterator.remove();
                    illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl("Cancelled"));
                }
            }
        }
        // monitorexit(this.IlIlIlIlIlllllllllIl)
    }
}
