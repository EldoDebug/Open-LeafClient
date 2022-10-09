package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.client.*;
import net.optifine.expr.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public enum lIIIIlIIIIIlllIllIII implements llIllIlIIIIllIlIIllI
{
    llllIIIIlIIIlIlllIll("IS_ALIVE", 0, "is_alive"), 
    IlIlIlIlIlllllllllIl("IS_BURNING", 1, "is_burning"), 
    llIllIIIIIllIlIIIIlI("IS_CHILD", 2, "is_child"), 
    IlIIIlIlIIIllIlIlIIl("IS_GLOWING", 3, "is_glowing"), 
    IlIlIIIllIllIIIIIllI("IS_HURT", 4, "is_hurt"), 
    IllIIlllIIIIlllIIlIl("IS_IN_LAVA", 5, "is_in_lava"), 
    llllIIIlIlllIlIIIIIl("IS_IN_WATER", 6, "is_in_water"), 
    lIIIIlIIIIIlllIllIII("IS_INVISIBLE", 7, "is_invisible"), 
    lIIIlllIIIllIIIllIII("IS_ON_GROUND", 8, "is_on_ground"), 
    llIIlIIIlIIIllIlIIIl("IS_RIDDEN", 9, "is_ridden"), 
    llIllIlIIIIllIlIIllI("IS_RIDING", 10, "is_riding"), 
    lIlIlIIIllIIllIIIllI("IS_SNEAKING", 11, "is_sneaking"), 
    IlIlIIIllIIllIlllllI("IS_SPRINTING", 12, "is_sprinting"), 
    IIIIlllIIIIIIlIIIlll("IS_WET", 13, "is_wet");
    
    private String llllIIllllIlIlIIIIll;
    private lllIllIIIllllllIllll IlIllIlIlIIIlIlIlIII;
    private static final lIIIIlIIIIIlllIllIII[] IIlllIIlIllIllIlIIll;
    private static volatile /* synthetic */ int[] lllIIIIlllllIlIIllIl;
    
    static {
        IlIlIIIIIIlllIlIllIl = new lIIIIlIIIIIlllIllIII[] { lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI, lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI, lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl, lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl, lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII, lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII, lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl, lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI, lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI, lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI, lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll };
        IIlllIIlIllIllIlIIll = values();
    }
    
    private lIIIIlIIIIIlllIllIII(final String s, final int n, final String llllIIllllIlIlIIIIll) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl();
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    @Override
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        final llIllIIIIIllIlIIIIlI llIllIlIIIIllIlIIllI = this.IlIllIlIlIIIlIlIlIII.llIllIlIIIIllIlIIllI;
        if (llIllIlIIIIllIlIIllI == null) {
            return false;
        }
        if (llIllIlIIIIllIlIIllI instanceof IIllIIIlIIlIlIlIIIII) {
            final lllIIIIlllllIlIIllIl lIlIlIIIllIIllIIIllI = ((IIllIIIlIIlIlIlIIIII)llIllIlIIIIllIlIIllI).lIlIlIIIllIIllIIIllI;
            if (lIlIlIIIllIIllIIIllI == null) {
                return false;
            }
            switch (IlIIIlIlIIIllIlIlIIl()[this.ordinal()]) {
                case 1: {
                    return lIlIlIIIllIIllIIIllI.llllIllllIllllIlIlII();
                }
                case 2: {
                    return lIlIlIIIllIIllIIIllI.lIIIIIlIlIIIlIIIIlIl();
                }
                case 3: {
                    return lIlIlIIIllIIllIIIllI.e_();
                }
                case 5: {
                    return lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll > 0;
                }
                case 6: {
                    return lIlIlIIIllIIllIIIllI.llIIIllIlIllIllIIIIl();
                }
                case 7: {
                    return lIlIlIIIllIIllIIIllI.llIIIlIlllIllIIlIllI();
                }
                case 8: {
                    return lIlIlIIIllIIllIIIllI.IIIIIIIllllIlIIIIIII();
                }
                case 9: {
                    return lIlIlIIIllIIllIIIllI.IIIIIllIIIIlIIIIllIl;
                }
                case 10: {
                    return lIlIlIIIllIIllIIIllI.IIllIIllIIIlIlIIIIlI != null;
                }
                case 11: {
                    return lIlIlIIIllIIllIIIllI.IIllIIIlIIIIlIIlIIII();
                }
                case 12: {
                    return lIlIlIIIllIIllIIIllI.IIIIIllIIIIlIIIIllIl();
                }
                case 13: {
                    return lIlIlIIIllIIllIIIllI.IIIllIIllIIIIIIlIIlI();
                }
                case 14: {
                    return lIlIlIIIllIIllIIIllI.lIIIIlIlIllllIIlIllI();
                }
            }
        }
        return false;
    }
    
    public static lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return null;
        }
        for (int i = 0; i < lIIIIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll.length; ++i) {
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = lIIIIlIIIIIlllIllIII.IIlllIIlIllIllIlIIll[i];
            if (liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl().equals(s)) {
                return liiiIlIIIIIlllIllIII;
            }
        }
        return null;
    }
    
    static /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl() {
        final int[] lllIIIIlllllIlIIllIl = lIIIIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl;
        if (lllIIIIlllllIlIIllIl != null) {
            return lllIIIIlllllIlIIllIl;
        }
        final int[] lllIIIIlllllIlIIllIl2 = new int[values().length];
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            lllIIIIlllllIlIIllIl2[lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        return lIIIIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl2;
    }
}
