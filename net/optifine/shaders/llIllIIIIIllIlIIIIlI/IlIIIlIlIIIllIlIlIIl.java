package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.optifine.expr.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public enum IlIIIlIlIIIllIlIlIIl implements llIllIlIIIIllIlIIllI
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
    private static final IlIIIlIlIIIllIlIlIIl[] IIlllIIlIllIllIlIIll;
    private static volatile /* synthetic */ int[] lllIIIIlllllIlIIllIl;
    
    static {
        IlIlIIIIIIlllIlIllIl = new IlIIIlIlIIIllIlIlIIl[] { IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll, IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl, IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI, IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl, IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI, IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl, IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl, IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII, IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII, IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl, IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI, IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI, IlIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI, IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll };
        IIlllIIlIllIllIlIIll = values();
    }
    
    private IlIIIlIlIIIllIlIlIIl(final String s, final int n, final String llllIIllllIlIlIIIIll) {
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
        final llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = Minecraft.getMinecraft().lIIIIlIlIllllIIlIllI();
        if (liiiIlIlIllllIIlIllI instanceof lllIIIIlllllIlIIllIl) {
            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)liiiIlIlIllllIIlIllI;
            switch (IlIIIlIlIIIllIlIlIIl()[this.ordinal()]) {
                case 1: {
                    return lllIIIIlllllIlIIllIl.llllIllllIllllIlIlII();
                }
                case 2: {
                    return lllIIIIlllllIlIIllIl.lIIIIIlIlIIIlIIIIlIl();
                }
                case 3: {
                    return lllIIIIlllllIlIIllIl.e_();
                }
                case 5: {
                    return lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll > 0;
                }
                case 6: {
                    return lllIIIIlllllIlIIllIl.llIIIllIlIllIllIIIIl();
                }
                case 7: {
                    return lllIIIIlllllIlIIllIl.llIIIlIlllIllIIlIllI();
                }
                case 8: {
                    return lllIIIIlllllIlIIllIl.IIIIIIIllllIlIIIIIII();
                }
                case 9: {
                    return lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl;
                }
                case 10: {
                    return lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI != null;
                }
                case 11: {
                    return lllIIIIlllllIlIIllIl.IIllIIIlIIIIlIIlIIII();
                }
                case 12: {
                    return lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl();
                }
                case 13: {
                    return lllIIIIlllllIlIIllIl.IIIllIIllIIIIIIlIIlI();
                }
                case 14: {
                    return lllIIIIlllllIlIIllIl.lIIIIlIlIllllIIlIllI();
                }
            }
        }
        return false;
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return null;
        }
        for (int i = 0; i < IlIIIlIlIIIllIlIlIIl.IIlllIIlIllIllIlIIll.length; ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl.IIlllIIlIllIllIlIIll[i];
            if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl().equals(s)) {
                return ilIIIlIlIIIllIlIlIIl;
            }
        }
        return null;
    }
    
    static /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl() {
        final int[] lllIIIIlllllIlIIllIl = IlIIIlIlIIIllIlIlIIl.lllIIIIlllllIlIIllIl;
        if (lllIIIIlllllIlIIllIl != null) {
            return lllIIIIlllllIlIIllIl;
        }
        final int[] lllIIIIlllllIlIIllIl2 = new int[values().length];
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            lllIIIIlllllIlIIllIl2[IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        return IlIIIlIlIIIllIlIlIIl.lllIIIIlllllIlIIllIl = lllIIIIlllllIlIIllIl2;
    }
}
