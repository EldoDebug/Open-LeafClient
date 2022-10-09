package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class dc extends IIlIIIIlllIlllllIlII implements dt
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("type", dd.class);
    }
    
    protected dc() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI, dd.llllIIIIlIIIlIlllIll));
        final float n = 0.4f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.8f, 0.5f + n);
    }
    
    @Override
    public int IIlIIIIlllIlllllIlII() {
        return net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(0.5, 1.0);
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return true;
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() != this) {
            return super.IlIlIIIllIllIIIIIllI(llIIlIIIlIIIllIlIIIl);
        }
        return (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI) == dd.llllIIIIlIIIlIlllIll) ? 16777215 : net.minecraft.IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(0.5, 1.0);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return (random.nextInt(8) == 0) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl : null;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n, final Random random) {
        return 1 + random.nextInt(n * 2 + 1);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && llllIIIIlIIIlIlllIll.p() != null && llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIlIllllIIlIllI[llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this)]);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, 1, ((dd)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl()));
        }
        else {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl2);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        for (int i = 1; i < 3; ++i) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, i));
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI) != dd.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return true;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl = net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI;
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI) == dd.llIllIIIIIllIlIIIIlI) {
            lIlIlIlllIIlIlIlllIl = net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl;
        }
        if (net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
            net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl, 2);
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI, dd.llllIIIIlIIIlIlllIll(n));
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return ((dd)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(dc.IIIIIIIIIlllIllIlIlI)).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { dc.IIIIIIIIIlllIllIlIlI });
    }
    
    @Override
    public IllIIlllIIIIlllIIlIl llIllIlIlIIIIIIIllII() {
        return net.minecraft.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI;
    }
}
