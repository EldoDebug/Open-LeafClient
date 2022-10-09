package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum lIllIIlIlIlllllIIIII implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DOWN_X", 0, 0, "down_x", lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll), 
    IlIlIlIlIlllllllllIl("EAST", 1, 1, "east", lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl), 
    llIllIIIIIllIlIIIIlI("WEST", 2, 2, "west", lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI), 
    IlIIIlIlIIIllIlIlIIl("SOUTH", 3, 3, "south", lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl), 
    IlIlIIIllIllIIIIIllI("NORTH", 4, 4, "north", lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI), 
    IllIIlllIIIIlllIIlIl("UP_Z", 5, 5, "up_z", lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl), 
    llllIIIlIlllIlIIIIIl("UP_X", 6, 6, "up_x", lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl), 
    lIIIIlIIIIIlllIllIII("DOWN_Z", 7, 7, "down_z", lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll);
    
    private static final lIllIIlIlIlllllIIIII[] lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    private final String llIllIlIIIIllIlIIllI;
    private final lllIllIIIllllllIllll lIlIlIIIllIIllIIIllI;
    private static volatile /* synthetic */ int[] IlIlIIIllIIllIlllllI;
    private static volatile /* synthetic */ int[] IIIIlllIIIIIIlIIIlll;
    
    static {
        llllIIllllIlIlIIIIll = new lIllIIlIlIlllllIIIII[] { lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll, lIllIIlIlIlllllIIIII.IlIlIlIlIlllllllllIl, lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI, lIllIIlIlIlllllIIIII.IlIIIlIlIIIllIlIlIIl, lIllIIlIlIlllllIIIII.IlIlIIIllIllIIIIIllI, lIllIIlIlIlllllIIIII.IllIIlllIIIIlllIIlIl, lIllIIlIlIlllllIIIII.llllIIIlIlllIlIIIIIl, lIllIIlIlIlllllIIIII.lIIIIlIIIIIlllIllIII };
        lIIIlllIIIllIIIllIII = new lIllIIlIlIlllllIIIII[values().length];
        lIllIIlIlIlllllIIIII[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lIllIIlIlIlllllIIIII lIllIIlIlIlllllIIIII = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.lIllIIlIlIlllllIIIII.lIIIlllIIIllIIIllIII[lIllIIlIlIlllllIIIII.IlIlIlIlIlllllllllIl()] = lIllIIlIlIlllllIIIII;
        }
    }
    
    private lIllIIlIlIlllllIIIII(final String s, final int n, final int llIIlIIIlIIIllIlIIIl, final String llIllIlIIIIllIlIIllI, final lllIllIIIllllllIllll lIlIlIIIllIIllIIIllI) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public String toString() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public static lIllIIlIlIlllllIIIII llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= lIllIIlIlIlllllIIIII.lIIIlllIIIllIIIllIII.length) {
            n = 0;
        }
        return lIllIIlIlIlllllIIIII.lIIIlllIIIllIIIllIII[n];
    }
    
    public static lIllIIlIlIlllllIIIII llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIllIIIllllllIllll lllIllIIIllllllIllll2) {
        switch (IlIlIIIllIllIIIIIllI()[lllIllIIIllllllIllll.ordinal()]) {
            case 1: {
                switch (IlIIIlIlIIIllIlIlIIl()[lllIllIIIllllllIllll2.lIlIlIIIllIIllIIIllI().ordinal()]) {
                    case 1: {
                        return lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll;
                    }
                    case 3: {
                        return lIllIIlIlIlllllIIIII.lIIIIlIIIIIlllIllIII;
                    }
                    default: {
                        throw new IllegalArgumentException("Invalid entityFacing " + lllIllIIIllllllIllll2 + " for facing " + lllIllIIIllllllIllll);
                    }
                }
                break;
            }
            case 2: {
                switch (IlIIIlIlIIIllIlIlIIl()[lllIllIIIllllllIllll2.lIlIlIIIllIIllIIIllI().ordinal()]) {
                    case 1: {
                        return lIllIIlIlIlllllIIIII.llllIIIlIlllIlIIIIIl;
                    }
                    case 3: {
                        return lIllIIlIlIlllllIIIII.IllIIlllIIIIlllIIlIl;
                    }
                    default: {
                        throw new IllegalArgumentException("Invalid entityFacing " + lllIllIIIllllllIllll2 + " for facing " + lllIllIIIllllllIllll);
                    }
                }
                break;
            }
            case 3: {
                return lIllIIlIlIlllllIIIII.IlIlIIIllIllIIIIIllI;
            }
            case 4: {
                return lIllIIlIlIlllllIIIII.IlIIIlIlIIIllIlIlIIl;
            }
            case 5: {
                return lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI;
            }
            case 6: {
                return lIllIIlIlIlllllIIIII.IlIlIlIlIlllllllllIl;
            }
            default: {
                throw new IllegalArgumentException("Invalid facing: " + lllIllIIIllllllIllll);
            }
        }
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    static /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl() {
        final int[] ilIlIIIllIIllIlllllI = lIllIIlIlIlllllIIIII.IlIlIIIllIIllIlllllI;
        if (ilIlIIIllIIllIlllllI != null) {
            return ilIlIIIllIIllIlllllI;
        }
        final int[] ilIlIIIllIIllIlllllI2 = new int[llIllIlIlIIIIIIIllII.values().length];
        try {
            ilIlIIIllIIllIlllllI2[llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIIIllIIllIlllllI2[llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIIIllIIllIlllllI2[llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return lIllIIlIlIlllllIIIII.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI2;
    }
    
    static /* synthetic */ int[] IlIlIIIllIllIIIIIllI() {
        final int[] iiiIlllIIIIIIlIIIlll = lIllIIlIlIlllllIIIII.IIIIlllIIIIIIlIIIlll;
        if (iiiIlllIIIIIIlIIIlll != null) {
            return iiiIlllIIIIIIlIIIlll;
        }
        final int[] iiiIlllIIIIIIlIIIlll2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            iiiIlllIIIIIIlIIIlll2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            iiiIlllIIIIIIlIIIlll2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            iiiIlllIIIIIIlIIIlll2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            iiiIlllIIIIIIlIIIlll2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            iiiIlllIIIIIIlIIIlll2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            iiiIlllIIIIIIlIIIlll2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lIllIIlIlIlllllIIIII.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll2;
    }
}
