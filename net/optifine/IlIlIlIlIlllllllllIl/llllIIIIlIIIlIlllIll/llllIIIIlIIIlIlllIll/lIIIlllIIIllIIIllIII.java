package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.client.*;
import net.optifine.expr.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public enum lIIIlllIIIllIIIllIII implements IlIlIIIllIIllIlllllI
{
    llllIIIIlIIIlIlllIll("LIMB_SWING", 0, "limb_swing"), 
    IlIlIlIlIlllllllllIl("LIMB_SWING_SPEED", 1, "limb_speed"), 
    llIllIIIIIllIlIIIIlI("AGE", 2, "age"), 
    IlIIIlIlIIIllIlIlIIl("HEAD_YAW", 3, "head_yaw"), 
    IlIlIIIllIllIIIIIllI("HEAD_PITCH", 4, "head_pitch"), 
    IllIIlllIIIIlllIIlIl("SCALE", 5, "scale"), 
    llllIIIlIlllIlIIIIIl("HEALTH", 6, "health"), 
    lIIIIlIIIIIlllIllIII("HURT_TIME", 7, "hurt_time"), 
    lIIIlllIIIllIIIllIII("IDLE_TIME", 8, "idle_time"), 
    llIIlIIIlIIIllIlIIIl("MAX_HEALTH", 9, "max_health"), 
    llIllIlIIIIllIlIIllI("MOVE_FORWARD", 10, "move_forward"), 
    lIlIlIIIllIIllIIIllI("MOVE_STRAFING", 11, "move_strafing"), 
    IlIlIIIllIIllIlllllI("PARTIAL_TICKS", 12, "partial_ticks"), 
    IIIIlllIIIIIIlIIIlll("POS_X", 13, "pos_x"), 
    llllIIllllIlIlIIIIll("POS_Y", 14, "pos_y"), 
    IlIllIlIlIIIlIlIlIII("POS_Z", 15, "pos_z"), 
    IIlllIIlIllIllIlIIll("REVENGE_TIME", 16, "revenge_time"), 
    lllIIIIlllllIlIIllIl("SWING_PROGRESS", 17, "swing_progress");
    
    private String IlIlIIIIIIlllIlIllIl;
    private lllIllIIIllllllIllll IIllIIllIIIlIlIIIIlI;
    private static final lIIIlllIIIllIIIllIII[] IIIlIIIlIlIIlllIIlll;
    private static volatile /* synthetic */ int[] IlIlIIIlIIlIlIIlllIl;
    
    static {
        IlllllllIIIlIIIlIlII = new lIIIlllIIIllIIIllIII[] { lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll, lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl, lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI, lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl, lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI, lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl, lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl, lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII, lIIIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII, lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl, lIIIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI, lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI, lIIIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI, lIIIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll, lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll, lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII, lIIIlllIIIllIIIllIII.IIlllIIlIllIllIlIIll, lIIIlllIIIllIIIllIII.lllIIIIlllllIlIIllIl };
        IIIlIIIlIlIIlllIIlll = values();
    }
    
    private lIIIlllIIIllIIIllIII(final String s, final int n, final String ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        this.IIllIIllIIIlIlIIIIlI = Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl();
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    @Override
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public float IlIlIlIlIlllllllllIl() {
        final llIllIIIIIllIlIIIIlI llIllIlIIIIllIlIIllI = this.IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI;
        if (llIllIlIIIIllIlIIllI == null) {
            return 0.0f;
        }
        Label_0249: {
            if (llIllIlIIIIllIlIIllI instanceof IIllIIIlIIlIlIlIIIII) {
                final IIllIIIlIIlIlIlIIIII illIIIlIIlIlIlIIIII = (IIllIIIlIIlIlIlIIIII)llIllIlIIIIllIlIIllI;
                switch (IlIIIlIlIIIllIlIlIIl()[this.ordinal()]) {
                    case 1: {
                        return illIIIlIIlIlIlIIIII.IlIlIIIllIIllIlllllI;
                    }
                    case 2: {
                        return illIIIlIIlIlIlIIIII.IIIIlllIIIIIIlIIIlll;
                    }
                    case 3: {
                        return illIIIlIIlIlIlIIIII.llllIIllllIlIlIIIIll;
                    }
                    case 4: {
                        return illIIIlIIlIlIlIIIII.IlIllIlIlIIIlIlIlIII;
                    }
                    case 5: {
                        return illIIIlIIlIlIlIIIII.IIlllIIlIllIllIlIIll;
                    }
                    case 6: {
                        return illIIIlIIlIlIlIIIII.lllIIIIlllllIlIIllIl;
                    }
                    default: {
                        final lllIIIIlllllIlIIllIl lIlIlIIIllIIllIIIllI = illIIIlIIlIlIlIIIII.lIlIlIIIllIIllIIIllI;
                        if (lIlIlIIIllIIllIIIllI == null) {
                            return 0.0f;
                        }
                        switch (IlIIIlIlIIIllIlIlIIl()[this.ordinal()]) {
                            case 7: {
                                return lIlIlIIIllIIllIIIllI.N();
                            }
                            case 8: {
                                return (float)lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll;
                            }
                            case 9: {
                                return (float)lIlIlIIIllIIllIIIllI.G();
                            }
                            case 10: {
                                return lIlIlIIIllIIllIIIllI.U();
                            }
                            case 11: {
                                return lIlIlIIIllIIllIIIllI.l;
                            }
                            case 12: {
                                return lIlIlIIIllIIllIIIllI.k;
                            }
                            case 14: {
                                return (float)lIlIlIIIllIIllIIIllI.IIlllIlIIllIlIlIlIIl;
                            }
                            case 15: {
                                return (float)lIlIlIIIllIIllIIIllI.llIIIlIlIllIIlIlIlII;
                            }
                            case 16: {
                                return (float)lIlIlIIIllIIllIIIllI.lllllIlIIIlIlIIlllII;
                            }
                            case 17: {
                                return (float)lIlIlIIIllIIllIIIllI.D();
                            }
                            case 18: {
                                return lIlIlIIIllIIllIIIllI.IlIlIIIllIIllIlllllI(illIIIlIIlIlIlIIIII.IlIlIIIIIIlllIlIllIl);
                            }
                            default: {
                                break Label_0249;
                            }
                        }
                        break;
                    }
                }
            }
        }
        return 0.0f;
    }
    
    public static lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return null;
        }
        for (int i = 0; i < lIIIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll.length; ++i) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = lIIIlllIIIllIIIllIII.IIIlIIIlIlIIlllIIlll[i];
            if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI().equals(s)) {
                return liiIlllIIIllIIIllIII;
            }
        }
        return null;
    }
    
    static /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl() {
        final int[] ilIlIIIlIIlIlIIlllIl = lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl;
        if (ilIlIIIlIIlIlIIlllIl != null) {
            return ilIlIIIlIIlIlIIlllIl;
        }
        final int[] ilIlIIIlIIlIlIIlllIl2 = new int[values().length];
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII.ordinal()] = 9;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl.ordinal()] = 10;
        }
        catch (NoSuchFieldError noSuchFieldError9) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI.ordinal()] = 11;
        }
        catch (NoSuchFieldError noSuchFieldError10) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI.ordinal()] = 12;
        }
        catch (NoSuchFieldError noSuchFieldError11) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.IlIlIIIllIIllIlllllI.ordinal()] = 13;
        }
        catch (NoSuchFieldError noSuchFieldError12) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll.ordinal()] = 14;
        }
        catch (NoSuchFieldError noSuchFieldError13) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.llllIIllllIlIlIIIIll.ordinal()] = 15;
        }
        catch (NoSuchFieldError noSuchFieldError14) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.IlIllIlIlIIIlIlIlIII.ordinal()] = 16;
        }
        catch (NoSuchFieldError noSuchFieldError15) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.IIlllIIlIllIllIlIIll.ordinal()] = 17;
        }
        catch (NoSuchFieldError noSuchFieldError16) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError17) {}
        try {
            ilIlIIIlIIlIlIIlllIl2[lIIIlllIIIllIIIllIII.lllIIIIlllllIlIIllIl.ordinal()] = 18;
        }
        catch (NoSuchFieldError noSuchFieldError18) {}
        return lIIIlllIIIllIIIllIII.IlIlIIIlIIlIlIIlllIl = ilIlIIIlIIlIlIIlllIl2;
    }
}
