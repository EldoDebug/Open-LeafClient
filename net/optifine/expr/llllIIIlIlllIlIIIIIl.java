package net.optifine.expr;

import net.optifine.shaders.llIllIIIIIllIlIIIIlI.*;

public class llllIIIlIlllIlIIIIIl implements IlIlIIIllIIllIlllllI
{
    private lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll;
    private llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private static volatile /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl;
    
    public llllIIIlIlllIlIIIIIl(final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll, final llIIlIIIlIIIllIlIIIl[] ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = -1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public float IlIlIlIlIlllllllllIl() {
        final llIIlIIIlIIIllIlIIIl[] ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
        switch (llIllIIIIIllIlIIIIlI()[this.llllIIIIlIIIlIlllIll.ordinal()]) {
            case 46: {
                if (!(ilIlIlIlIlllllllllIl[0] instanceof llllIIIIlIIIlIlllIll)) {
                    final float llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 0);
                    final float n = (ilIlIlIlIlllllllllIl.length > 1) ? llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 1) : 1.0f;
                    final float n2 = (ilIlIlIlIlllllllllIl.length > 2) ? llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 2) : n;
                    if (this.llIllIIIIIllIlIIIIlI < 0) {
                        this.llIllIIIIIllIlIIIIlI = IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll();
                    }
                    return IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll, n, n2);
                }
                break;
            }
        }
        return this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl);
    }
    
    private static float llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl[] array, final int n) {
        return ((IlIlIIIllIIllIlllllI)array[n]).IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll + "()";
    }
    
    static /* synthetic */ int[] llIllIIIIIllIlIIIIlI() {
        final int[] ilIIIlIlIIIllIlIlIIl = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;
        if (ilIIIlIlIIIllIlIlIIl != null) {
            return ilIIIlIlIIIllIlIlIIl;
        }
        final int[] ilIIIlIlIIIllIlIlIIl2 = new int[lIIIlllIIIllIIIllIII.values().length];
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ordinal()] = 20;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIIllllllIllIIIlllIl.ordinal()] = 35;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIlIlIlIIlIllIIIIIIl.ordinal()] = 43;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl.ordinal()] = 22;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl.ordinal()] = 19;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.lllIllIIIllllllIllll.ordinal()] = 41;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IllIllIIIIlIIlIlllII.ordinal()] = 44;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlllllllIIIlIIIlIlII.ordinal()] = 23;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIIlIlIIIlIIlIlIlII.ordinal()] = 48;
        }
        catch (NoSuchFieldError noSuchFieldError15) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll.ordinal()] = 21;
        }
        catch (NoSuchFieldError noSuchFieldError16) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llIIlllIIlllIIllIllI.ordinal()] = 31;
        }
        catch (NoSuchFieldError noSuchFieldError17) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIlIIIIlllIlllllIlII.ordinal()] = 24;
        }
        catch (NoSuchFieldError noSuchFieldError18) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIIIIllIIIIlIIIIllIl.ordinal()] = 37;
        }
        catch (NoSuchFieldError noSuchFieldError19) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIIIIIIIIlllIllIlIlI.ordinal()] = 38;
        }
        catch (NoSuchFieldError noSuchFieldError20) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIlIIIIIllIlIIIlIIll.ordinal()] = 33;
        }
        catch (NoSuchFieldError noSuchFieldError21) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIllllIIlIIlIlIlIll.ordinal()] = 45;
        }
        catch (NoSuchFieldError noSuchFieldError22) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII.ordinal()] = 25;
        }
        catch (NoSuchFieldError noSuchFieldError23) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.lllIIIIlllllIlIIllIl.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError24) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIlllIIlIllIllIlIIll.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError25) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError26) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError27) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError28) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError29) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llllllIllIllIlIllllI.ordinal()] = 34;
        }
        catch (NoSuchFieldError noSuchFieldError30) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llIllIlIlIIIIIIIllII.ordinal()] = 42;
        }
        catch (NoSuchFieldError noSuchFieldError31) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIIIlIIIllllIlIlIlI.ordinal()] = 36;
        }
        catch (NoSuchFieldError noSuchFieldError32) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError33) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError34) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIlIllllllllIIIIlII.ordinal()] = 26;
        }
        catch (NoSuchFieldError noSuchFieldError35) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIlllIlIIllIlIlIlIIl.ordinal()] = 27;
        }
        catch (NoSuchFieldError noSuchFieldError36) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llIIIlIlIllIIlIlIlII.ordinal()] = 28;
        }
        catch (NoSuchFieldError noSuchFieldError37) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.ordinal()] = 29;
        }
        catch (NoSuchFieldError noSuchFieldError38) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError39) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIllllIIIlIIIIIIllIl.ordinal()] = 39;
        }
        catch (NoSuchFieldError noSuchFieldError40) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlllIIIIlIIIlIlIlIIl.ordinal()] = 40;
        }
        catch (NoSuchFieldError noSuchFieldError41) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IllIllIlllIllllIIllI.ordinal()] = 46;
        }
        catch (NoSuchFieldError noSuchFieldError42) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.lIllllllIIllIlIlIlII.ordinal()] = 30;
        }
        catch (NoSuchFieldError noSuchFieldError43) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError44) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII.ordinal()] = 32;
        }
        catch (NoSuchFieldError noSuchFieldError45) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError46) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError47) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.llIlIIIIIlIIlIlIIlll.ordinal()] = 47;
        }
        catch (NoSuchFieldError noSuchFieldError48) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IllIlIIllIllIIlIllII.ordinal()] = 49;
        }
        catch (NoSuchFieldError noSuchFieldError49) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.lIIlIIIlIllIlIllIIIl.ordinal()] = 50;
        }
        catch (NoSuchFieldError noSuchFieldError50) {}
        try {
            ilIIIlIlIIIllIlIlIIl2[lIIIlllIIIllIIIllIII.IIlIIIlllIllIllIlIII.ordinal()] = 51;
        }
        catch (NoSuchFieldError noSuchFieldError51) {}
        return llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl2;
    }
}
