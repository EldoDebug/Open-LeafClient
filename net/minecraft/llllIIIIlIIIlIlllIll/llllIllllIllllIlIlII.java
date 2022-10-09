package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIllllIllllIlIlII extends IIlIlIlIIlIllIIIIIIl
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("open");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("powered");
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("in_wall");
    }
    
    public llllIllllIllllIlIlII(final aa aa) {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, aa.llIllIIIIIllIlIIIIlI());
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.lllIllIIIllllllIllll, false));
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIllIlIlIIIIIIIllII lIlIlIIIllIIllIIIllI2 = ((lllIllIIIllllllIllll)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl)).lIlIlIIIllIIllIIIllI();
        if ((lIlIlIIIllIIllIIIllI2 == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI && (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad)) || (lIlIlIIIllIIllIIIllI2 == llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll && (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad))) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.lllIllIIIllllllIllll, true);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl() && super.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI)) {
            return null;
        }
        return (((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl)).lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) ? new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.375f, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 1, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.625f) : new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.375f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.625f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 1);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (((lllIllIIIllllllIllll)lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl)).lIlIlIIIllIIllIIIllI() == llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.375f, 1.0f, 1.0f, 0.625f);
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.375f, 0.0f, 0.0f, 0.625f, 1.0f, 1.0f);
        }
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (boolean)lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3, final int n4, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl, lllIIIIlllllIlIIllIl.lIllIIlIlIlllllIIIII()).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.lllIllIIIllllllIllll, false);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI)) {
            llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI, false);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 2);
        }
        else {
            final lllIllIIIllllllIllll llllIIIIlIIIlIlllIll2 = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll);
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl) == llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI()) {
                llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl, llllIIIIlIIIlIlllIll2);
            }
            llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI, true);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 2);
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ((boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI)) ? 1003 : 1006, ilIlIlIlIlllllllllIl, 0);
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final boolean iiIlIIlIIIIlllIlllII = illlllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII(ilIlIlIlIlllllllllIl);
            if (iiIlIIlIIIIlllIlllII || llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII()) {
                if (iiIlIIlIIIIlllIlllII && !(boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI) && !(boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI, true).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl, true), 2);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1003, ilIlIlIlIlllllllllIl, 0);
                }
                else if (!iiIlIIlIIIIlllIlllII && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI) && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl, false), 2);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1006, ilIlIlIlIlllllllllIl, 0);
                }
                else if (iiIlIIlIIIIlllIlllII != (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl, iiIlIIlIIIIlllIlllII), 2);
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return true;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(n)).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI, (n & 0x4) != 0x0).llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl, (n & 0x8) != 0x0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl)).llIllIIIIIllIlIIIIlI();
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl)) {
            n |= 0x8;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI)) {
            n |= 0x4;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { llllIllllIllllIlIlII.IlllIIIIlIIIlIlIlIIl, llllIllllIllllIlIlII.IIIIIIIIIlllIllIlIlI, llllIllllIllllIlIlII.IIllllIIIlIIIIIIllIl, llllIllllIllllIlIlII.lllIllIIIllllllIllll });
    }
}
