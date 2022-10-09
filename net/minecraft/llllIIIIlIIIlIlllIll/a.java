package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum a implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("X", 0, "x"), 
    IlIlIlIlIlllllllllIl("Y", 1, "y"), 
    llIllIIIIIllIlIIIIlI("Z", 2, "z"), 
    IlIIIlIlIIIllIlIlIIl("NONE", 3, "none");
    
    private final String IlIlIIIllIllIIIIIllI;
    private static volatile /* synthetic */ int[] IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new a[] { a.llllIIIIlIIIlIlllIll, a.IlIlIlIlIlllllllllIl, a.llIllIIIIIllIlIIIIlI, a.IlIIIlIlIIIllIlIlIIl };
    }
    
    private a(final String s, final int n, final String ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public static a llllIIIIlIIIlIlllIll(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        switch (IlIlIlIlIlllllllllIl()[llIllIlIlIIIIIIIllII.ordinal()]) {
            case 1: {
                return a.llllIIIIlIIIlIlllIll;
            }
            case 2: {
                return a.IlIlIlIlIlllllllllIl;
            }
            case 3: {
                return a.llIllIIIIIllIlIIIIlI;
            }
            default: {
                return a.IlIIIlIlIIIllIlIlIIl;
            }
        }
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] illIIlllIIIIlllIIlIl = a.IllIIlllIIIIlllIIlIl;
        if (illIIlllIIIIlllIIlIl != null) {
            return illIIlllIIIIlllIIlIl;
        }
        final int[] illIIlllIIIIlllIIlIl2 = new int[llIllIlIlIIIIIIIllII.values().length];
        try {
            illIIlllIIIIlllIIlIl2[llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illIIlllIIIIlllIIlIl2[llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illIIlllIIIIlllIIlIl2[llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        return a.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
    }
}
