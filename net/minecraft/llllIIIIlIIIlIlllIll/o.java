package net.minecraft.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class o extends lIllIlIIIllllllIIlII
{
    public static final IlIIIlIlIIIllIlIlIIl IllIllIIIIlIIlIlllII;
    
    static {
        IllIllIIIIlIIlIlllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("variant", aa.class, (Predicate)new p());
    }
    
    public o() {
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(o.IIllllIIIlIIIIIIllIl, true).llllIIIIlIIIlIlllIll(o.IIIIIIIIIlllIllIlIlI, true));
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() != this) {
            return super.IlIlIIIllIllIIIIIllI(llIIlIIIlIIIllIlIIIl);
        }
        final aa aa = (aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII);
        return (aa == net.minecraft.llllIIIIlIIIlIlllIll.aa.IlIlIlIlIlllllllllIl) ? net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() : ((aa == net.minecraft.llllIIIIlIIIlIlllIll.aa.llIllIIIIIllIlIIIIlI) ? net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl() : super.IlIlIIIllIllIIIIIllI(llIIlIIIlIIIllIlIIIl));
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
            final aa aa = (aa)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII);
            if (aa == net.minecraft.llllIIIIlIIIlIlllIll.aa.IlIlIlIlIlllllllllIl) {
                return net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
            }
            if (aa == net.minecraft.llllIIIIlIIIlIlllIll.aa.llIllIIIIIllIlIIIIlI) {
                return net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
            }
        }
        return super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, n);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII) == aa.llllIIIIlIIIlIlllIll && illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(n) == 0) {
            net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI, 1, 0));
        }
    }
    
    @Override
    protected int lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII) == aa.IlIIIlIlIIIllIlIlIIl) ? 40 : super.lIIIlllIIIllIIIllIII(llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, aa.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, aa.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()));
        list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, aa.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()));
    }
    
    @Override
    protected lllIIIIlIlIllIIlIIIl IllIIlllIIIIlllIIlIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this), 1, ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII)).IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, this.IlIlIIIllIllIIIIIllI(n)).llllIIIIlIIIlIlllIll(o.IIIIIIIIIlllIllIlIlI, (n & 0x4) == 0x0).llllIIIIlIIIlIlllIll(o.IIllllIIIlIIIIIIllIl, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII)).IlIlIlIlIlllllllllIl();
        if (!(boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IIIIIIIIIlllIllIlIlI)) {
            n |= 0x4;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IIllllIIIlIIIIIIllIl)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    public aa IlIlIIIllIllIIIIIllI(final int n) {
        return aa.llllIIIIlIIIlIlllIll((n & 0x3) % 4);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { o.IllIllIIIIlIIlIlllII, o.IIllllIIIlIIIIIIllIl, o.IIIIIIIIIlllIllIlIlI });
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && llllIIIIlIIIlIlllIll.p() != null && llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIlIllllIIlIllI[llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this)]);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this), 1, ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII)).IlIlIlIlIlllllllllIl()));
        }
        else {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl);
        }
    }
}
