package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class di extends llllIIIIlIIIlIlllIll
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    public static final IlIlIlIlIlllllllllIl IlllIIIIlIIIlIlIlIIl;
    public static final IlIlIlIlIlllllllllIl lllIllIIIllllllIllll;
    public static final IlIlIlIlIlllllllllIl llIllIlIlIIIIIIIllII;
    public static final IlIlIlIlIlllllllllIl IIlIlIlIIlIllIIIIIIl;
    public static final IlIlIlIlIlllllllllIl IllIllIIIIlIIlIlllII;
    public static final IlIlIlIlIlllllllllIl IlIllllIIlIIlIlIlIll;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("powered");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("suspended");
        IlllIIIIlIIIlIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("attached");
        lllIllIIIllllllIllll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("disarmed");
        llIllIlIlIIIIIIIllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("north");
        IIlIlIlIIlIllIIIIIIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("east");
        IllIllIIIIlIIlIlllII = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("south");
        IlIllllIIlIIlIlIlIll = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("west");
    }
    
    public di() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(di.IIIIIIIIIlllIllIlIlI, false).llllIIIIlIIIlIlllIll(di.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl, false).llllIIIIlIIIlIlllIll(di.lllIllIIIllllllIllll, false).llllIIIIlIIIlIlllIll(di.llIllIlIlIIIIIIIllII, false).llllIIIIlIIIlIlllIll(di.IIlIlIlIIlIllIIIIIIl, false).llllIIIIlIIIlIlllIll(di.IllIllIIIIlIIlIlllII, false).llllIIIIlIIIlIlllIll(di.IlIllllIIlIIlIlIlIll, false));
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.llIllIlIlIIIIIIIllII, llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI)).llllIIIIlIIIlIlllIll(di.IIlIlIlIIlIllIIIIIIl, llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl)).llllIIIIlIIIlIlllIll(di.IllIllIIIIlIIlIlllII, llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl)).llllIIIIlIIIlIlllIll(di.IlIllllIIlIIlIlIlIll, llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI));
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
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
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if ((boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.IIllllIIIlIIIIIIllIl) != !net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl())) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final boolean booleanValue = (boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl);
        if (!(boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(di.IIllllIIIlIIIIIIllIl)) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
        }
        else if (!booleanValue) {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.0f, 0.0625f, 0.0f, 1.0f, 0.15625f, 1.0f);
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(di.IIllllIIIlIIIIIIllIl, !net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()));
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 3);
        this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.IIIIIIIIIlllIllIlIlI, true));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && llllIIIIlIIIlIlllIll.p() != null && llllIIIIlIIIlIlllIll.p().llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.lllIllIIIllllllIllll, true), 4);
        }
    }
    
    private void IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        lllIllIIIllllllIllll[] array;
        for (int length = (array = new lllIllIIIllllllIllll[] { net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI }).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = array[i];
            int j = 1;
            while (j < 42) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, j);
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V) {
                    if (ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(dj.IIIIIIIIIlllIllIlIlI) == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI()) {
                        net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2, false, true, j, llIIlIIIlIIIllIlIIIl);
                        break;
                    }
                    break;
                }
                else {
                    if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W) {
                        break;
                    }
                    ++j;
                }
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !(boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.IIIIIIIIIlllIllIlIlI)) {
            this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (boolean)illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(di.IIIIIIIIIlllIllIlIlI)) {
            this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        }
    }
    
    private void lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final boolean booleanValue = (boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(di.IIIIIIIIIlllIllIlIlI);
        boolean b = false;
        final List ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(null, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.IlIlIllllllllIIIIlII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.IIlllIlIIllIlIlIlIIl, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIIlIlIllIIlIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + this.lllllIlIIIlIlIIlllII, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + this.lIllllllIIllIlIlIlII, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + this.llIIlllIIlllIIllIllI));
        if (!ilIlIlIlIlllllllllIl3.isEmpty()) {
            final Iterator<llIllIIIIIllIlIIIIlI> iterator = ilIlIlIlIlllllllllIl3.iterator();
            while (iterator.hasNext()) {
                if (!iterator.next().IIlIlllIlIlllIlIllll()) {
                    b = true;
                    break;
                }
            }
        }
        if (b != booleanValue) {
            final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(di.IIIIIIIIIlllIllIlIlI, b);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 3);
            this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        }
        if (b) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII));
        }
    }
    
    public static boolean llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll));
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V) {
            return ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(dj.IIIIIIIIIlllIllIlIlI) == lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI();
        }
        return llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.W && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.IIllllIIIlIIIIIIllIl) == (boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(di.IIllllIIIlIIIIIIllIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(di.IIIIIIIIIlllIllIlIlI, (n & 0x1) > 0).llllIIIIlIIIlIlllIll(di.IIllllIIIlIIIIIIllIl, (n & 0x2) > 0).llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl, (n & 0x4) > 0).llllIIIIlIIIlIlllIll(di.lllIllIIIllllllIllll, (n & 0x8) > 0);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0;
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.IIIIIIIIIlllIllIlIlI)) {
            n |= 0x1;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.IIllllIIIlIIIIIIllIl)) {
            n |= 0x2;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.IlllIIIIlIIIlIlIlIIl)) {
            n |= 0x4;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(di.lllIllIIIllllllIllll)) {
            n |= 0x8;
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { di.IIIIIIIIIlllIllIlIlI, di.IIllllIIIlIIIIIIllIl, di.IlllIIIIlIIIlIlIlIIl, di.lllIllIIIllllllIllll, di.llIllIlIlIIIIIIIllII, di.IIlIlIlIIlIllIIIIIIl, di.IlIllllIIlIIlIlIlIll, di.IllIllIIIIlIIlIlllII });
    }
}
