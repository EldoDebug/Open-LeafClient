package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public enum IllIIlllIIIIlllIIlIl
{
    llllIIIIlIIIlIlllIll("POS_X", 0, "tx"), 
    IlIlIlIlIlllllllllIl("POS_Y", 1, "ty"), 
    llIllIIIIIllIlIIIIlI("POS_Z", 2, "tz"), 
    IlIIIlIlIIIllIlIlIIl("ANGLE_X", 3, "rx"), 
    IlIlIIIllIllIIIIIllI("ANGLE_Y", 4, "ry"), 
    IllIIlllIIIIlllIIlIl("ANGLE_Z", 5, "rz"), 
    llllIIIlIlllIlIIIIIl("OFFSET_X", 6, "ox"), 
    lIIIIlIIIIIlllIllIII("OFFSET_Y", 7, "oy"), 
    lIIIlllIIIllIIIllIII("OFFSET_Z", 8, "oz"), 
    llIIlIIIlIIIllIlIIIl("SCALE_X", 9, "sx"), 
    llIllIlIIIIllIlIIllI("SCALE_Y", 10, "sy"), 
    lIlIlIIIllIIllIIIllI("SCALE_Z", 11, "sz");
    
    private String IIIIlllIIIIIIlIIIlll;
    public static IllIIlllIIIIlllIIlIl[] IlIlIIIllIIllIlllllI;
    private static volatile /* synthetic */ int[] llllIIllllIlIlIIIIll;
    
    static {
        IlIllIlIlIIIlIlIlIII = new IllIIlllIIIIlllIIlIl[] { IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl, IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI, IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI, IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl, IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl, IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII, IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII, IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl, IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI, IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI };
        IllIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI = values();
    }
    
    private IllIIlllIIIIlllIIlIl(final String s, final int n, final String iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IIIIlllIIIIIIlIIIlll;
    }
    
    public float llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        switch (IlIlIlIlIlllllllllIl()[this.ordinal()]) {
            case 1: {
                return ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
            }
            case 2: {
                return ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
            }
            case 3: {
                return ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
            }
            case 4: {
                return ilIIIIIllIlIIIlIIll.IllIIlllIIIIlllIIlIl;
            }
            case 5: {
                return ilIIIIIllIlIIIlIIll.llllIIIlIlllIlIIIIIl;
            }
            case 6: {
                return ilIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII;
            }
            case 7: {
                return ilIIIIIllIlIIIlIIll.llllIIllllIlIlIIIIll;
            }
            case 8: {
                return ilIIIIIllIlIIIlIIll.IlIllIlIlIIIlIlIlIII;
            }
            case 9: {
                return ilIIIIIllIlIIIlIIll.IIlllIIlIllIllIlIIll;
            }
            case 10: {
                return ilIIIIIllIlIIIlIIll.IIllIIllIIIlIlIIIIlI;
            }
            case 11: {
                return ilIIIIIllIlIIIlIIll.IIIlIIIlIlIIlllIIlll;
            }
            case 12: {
                return ilIIIIIllIlIIIlIIll.IlIlIIIlIIlIlIIlllIl;
            }
            default: {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("GetFloat not supported for: " + this);
                return 0.0f;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final float n) {
        switch (IlIlIlIlIlllllllllIl()[this.ordinal()]) {
            case 1: {
                ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI = n;
            }
            case 2: {
                ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl = n;
            }
            case 3: {
                ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI = n;
            }
            case 4: {
                ilIIIIIllIlIIIlIIll.IllIIlllIIIIlllIIlIl = n;
            }
            case 5: {
                ilIIIIIllIlIIIlIIll.llllIIIlIlllIlIIIIIl = n;
            }
            case 6: {
                ilIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII = n;
            }
            case 7: {
                ilIIIIIllIlIIIlIIll.llllIIllllIlIlIIIIll = n;
            }
            case 8: {
                ilIIIIIllIlIIIlIIll.IlIllIlIlIIIlIlIlIII = n;
            }
            case 9: {
                ilIIIIIllIlIIIlIIll.IIlllIIlIllIllIlIIll = n;
            }
            case 10: {
                ilIIIIIllIlIIIlIIll.IIllIIllIIIlIlIIIIlI = n;
            }
            case 11: {
                ilIIIIIllIlIIIlIIll.IIIlIIIlIlIIlllIIlll = n;
            }
            case 12: {
                ilIIIIIllIlIIIlIIll.IlIlIIIlIIlIlIIlllIl = n;
            }
            default: {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("SetFloat not supported for: " + this);
            }
        }
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final String s) {
        for (int i = 0; i < IllIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI.length; ++i) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = IllIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI[i];
            if (illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll().equals(s)) {
                return illIIlllIIIIlllIIlIl;
            }
        }
        return null;
    }
    
    static /* synthetic */ int[] IlIlIlIlIlllllllllIl() {
        final int[] llllIIllllIlIlIIIIll = IllIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll;
        if (llllIIllllIlIlIIIIll != null) {
            return llllIIllllIlIlIIIIll;
        }
        final int[] llllIIllllIlIlIIIIll2 = new int[values().length];
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            llllIIllllIlIlIIIIll2[IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        return IllIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll2;
    }
}
