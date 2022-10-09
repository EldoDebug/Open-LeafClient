package net.minecraft.client.IllIIlllIIIIlllIIlIl;

import com.google.common.collect.*;
import java.net.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI
{
    private List IlIlIlIlIlllllllllIl;
    boolean llllIIIIlIIIlIlllIll;
    
    public llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
    }
    
    public synchronized boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public synchronized void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = false;
    }
    
    public synchronized List llIllIIIIIllIlIIIIlI() {
        return Collections.unmodifiableList((List<?>)this.IlIlIlIlIlllllllllIl);
    }
    
    public synchronized void llllIIIIlIIIlIlllIll(final String s, final InetAddress inetAddress) {
        final String llllIIIIlIIIlIlllIll = lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(s);
        final String ilIlIlIlIlllllllllIl = lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(s);
        if (ilIlIlIlIlllllllllIl != null) {
            final String string = String.valueOf(inetAddress.getHostAddress()) + ":" + ilIlIlIlIlllllllllIl;
            boolean b = false;
            for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 : this.IlIlIlIlIlllllllllIl) {
                if (ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl().equals(string)) {
                    ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
                    b = true;
                    break;
                }
            }
            if (!b) {
                this.IlIlIlIlIlllllllllIl.add(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, string));
                this.llllIIIIlIIIlIlllIll = true;
            }
        }
    }
}
