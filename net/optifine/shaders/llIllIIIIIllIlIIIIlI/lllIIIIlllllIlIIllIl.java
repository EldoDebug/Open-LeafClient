package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import net.optifine.expr.*;

public enum lllIIIIlllllIlIIllIl
{
    llllIIIIlIIIlIlllIll("BOOL", 0), 
    IlIlIlIlIlllllllllIl("INT", 1), 
    llIllIIIIIllIlIIIIlI("FLOAT", 2), 
    IlIIIlIlIIIllIlIlIIl("VEC2", 3), 
    IlIlIIIllIllIIIIIllI("VEC3", 4), 
    IllIIlllIIIIlllIIlIl("VEC4", 5);
    
    private static volatile /* synthetic */ int[] llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new lllIIIIlllllIlIIllIl[] { lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll, lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl, lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI, lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl, lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI, lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl };
    }
    
    private lllIIIIlllllIlIIllIl(final String s, final int n) {
    }
    
    public IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final String s) {
        switch (llllIIIIlIIIlIlllIll()[this.ordinal()]) {
            case 1: {
                return new lIIIIlIIIIIlllIllIII(s);
            }
            case 2: {
                return new lIIIIlIIIIIlllIllIII(s);
            }
            case 3: {
                return new llllIIIlIlllIlIIIIIl(s);
            }
            case 4: {
                return new lIIIlllIIIllIIIllIII(s);
            }
            case 5: {
                return new llIllIlIIIIllIlIIllI(s);
            }
            case 6: {
                return new lIlIlIIIllIIllIIIllI(s);
            }
            default: {
                throw new RuntimeException("Unknown uniform type: " + this);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        switch (llllIIIIlIIIlIlllIll()[this.ordinal()]) {
            case 1: {
                this.llllIIIIlIIIlIlllIll((net.optifine.expr.llIllIlIIIIllIlIIllI)llIIlIIIlIIIllIlIIIl, (lIIIIlIIIIIlllIllIII)iiiIlllIIIIIIlIIIlll);
            }
            case 2: {
                this.llllIIIIlIIIlIlllIll((IlIlIIIllIIllIlllllI)llIIlIIIlIIIllIlIIIl, (lIIIIlIIIIIlllIllIII)iiiIlllIIIIIIlIIIlll);
            }
            case 3: {
                this.llllIIIIlIIIlIlllIll((IlIlIIIllIIllIlllllI)llIIlIIIlIIIllIlIIIl, (llllIIIlIlllIlIIIIIl)iiiIlllIIIIIIlIIIlll);
            }
            case 4: {
                this.llllIIIIlIIIlIlllIll((net.optifine.expr.IIIIlllIIIIIIlIIIlll)llIIlIIIlIIIllIlIIIl, (lIIIlllIIIllIIIllIII)iiiIlllIIIIIIlIIIlll);
            }
            case 5: {
                this.llllIIIIlIIIlIlllIll((net.optifine.expr.IIIIlllIIIIIIlIIIlll)llIIlIIIlIIIllIlIIIl, (llIllIlIIIIllIlIIllI)iiiIlllIIIIIIlIIIlll);
            }
            case 6: {
                this.llllIIIIlIIIlIlllIll((net.optifine.expr.IIIIlllIIIIIIlIIIlll)llIIlIIIlIIIllIlIIIl, (lIlIlIIIllIIllIIIllI)iiiIlllIIIIIIlIIIlll);
            }
            default: {
                throw new RuntimeException("Unknown uniform type: " + this);
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.optifine.expr.llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI() ? 1 : 0);
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl((int)ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl());
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl());
    }
    
    private void llllIIIIlIIIlIlllIll(final net.optifine.expr.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final float[] ilIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl.length != 2) {
            throw new RuntimeException("Value length is not 2, length: " + ilIlIlIlIlllllllllIl.length);
        }
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl[0], ilIlIlIlIlllllllllIl[1]);
    }
    
    private void llllIIIIlIIIlIlllIll(final net.optifine.expr.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final float[] ilIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl.length != 3) {
            throw new RuntimeException("Value length is not 3, length: " + ilIlIlIlIlllllllllIl.length);
        }
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl[0], ilIlIlIlIlllllllllIl[1], ilIlIlIlIlllllllllIl[2]);
    }
    
    private void llllIIIIlIIIlIlllIll(final net.optifine.expr.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final float[] ilIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl.length != 4) {
            throw new RuntimeException("Value length is not 4, length: " + ilIlIlIlIlllllllllIl.length);
        }
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl[0], ilIlIlIlIlllllllllIl[1], ilIlIlIlIlllllllllIl[2], ilIlIlIlIlllllllllIl[3]);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        switch (llllIIIIlIIIlIlllIll()[this.ordinal()]) {
            case 1: {
                return ilIlIIIllIllIIIIIllI == net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
            }
            case 2: {
                return ilIlIIIllIllIIIIIllI == net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
            }
            case 3: {
                return ilIlIIIllIllIIIIIllI == net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
            }
            case 4:
            case 5:
            case 6: {
                return ilIlIIIllIllIIIIIllI == net.optifine.expr.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
            }
            default: {
                throw new RuntimeException("Unknown uniform type: " + this);
            }
        }
    }
    
    public static lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl(final String s) {
        final lllIIIIlllllIlIIllIl[] values = values();
        for (int i = 0; i < values.length; ++i) {
            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = values[i];
            if (lllIIIIlllllIlIIllIl.name().toLowerCase().equals(s)) {
                return lllIIIIlllllIlIIllIl;
            }
        }
        return null;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] llllIIIlIlllIlIIIIIl = lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl;
        if (llllIIIlIlllIlIIIIIl != null) {
            return llllIIIlIlllIlIIIIIl;
        }
        final int[] llllIIIlIlllIlIIIIIl2 = new int[values().length];
        try {
            llllIIIlIlllIlIIIIIl2[lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllIIIlIlllIlIIIIIl2[lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl2;
    }
}
