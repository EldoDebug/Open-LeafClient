package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;

public class lllIllIIIllllllIllll extends IIllllIIIlIIIIIIllIl
{
    public static final IllIIlllIIIIlllIIlIl IIIIIIIIIlllIllIlIlI;
    private final boolean IIllllIIIlIIIIIIllIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("power", 0, 15);
    }
    
    public lllIllIIIllllllIllll(final boolean iIllllIIIlIIIIIIllIl) {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        this.IIllllIIIlIIIIIIllIl = iIllllIIIlIIIIIIllIl;
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI, 0));
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        this.llIllIIIIIllIlIIIIlI(0.2f);
        this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIlIlIlllllllllIl("daylightDetector");
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.375f, 1.0f);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI);
    }
    
    public void lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            final int n = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl) - illlllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII();
            final float ilIIIlIlIIIllIlIlIIl = illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(1.0f);
            int llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(Math.round(n * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl + (((ilIIIlIlIIIllIlIlIIl < 3.1415927f) ? 0.0f : 6.2831855f) - ilIIIlIlIIIllIlIlIIl) * 0.2f)), 0, 15);
            if (this.IIllllIIIlIIIIIIllIl) {
                llllIIIIlIIIlIlllIll = 15 - llllIIIIlIIIlIlllIll;
            }
            if ((int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI) != llllIIIIlIIIlIlllIll) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI, llllIIIIlIIIlIlllIll), 3);
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (!llllIIIIlIIIlIlllIll.as()) {
            return super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll, n, n2, n3);
        }
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        if (this.IIllllIIIlIIIIIIllIl) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ap.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI)), 4);
            net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ap.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        }
        else {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aq.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI)), 4);
            net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aq.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        }
        return true;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ap);
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ap);
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return 3;
    }
    
    @Override
    public boolean IIIlIIlIIIIlllIlllII() {
        return true;
    }
    
    @Override
    public net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        return new IIlllIIlIllIllIlIIll();
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI, n);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { lllIllIIIllllllIllll.IIIIIIIIIlllIllIlIlI });
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        if (!this.IIllllIIIlIIIIIIllIl) {
            super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, list);
        }
    }
}
