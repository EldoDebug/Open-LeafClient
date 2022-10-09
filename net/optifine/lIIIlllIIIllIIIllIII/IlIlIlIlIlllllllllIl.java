package net.optifine.lIIIlllIIIllIIIllIII;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIlIlIlIlllllllllIl
{
    public static final int llllIIIIlIIIlIlllIll = 0;
    public static final int IlIlIlIlIlllllllllIl = 1;
    public static final int llIllIIIIIllIlIIIIlI = 2;
    public static final int IlIIIlIlIIIllIlIlIIl = 3;
    public static final int IlIlIIIllIllIIIIIllI = 4;
    public static final int IllIIlllIIIIlllIIlIl = 5;
    public static final int llllIIIlIlllIlIIIIIl = 6;
    public static final int lIIIIlIIIIIlllIllIII = 7;
    public static final int lIIIlllIIIllIIIllIII = 8;
    public static final int llIIlIIIlIIIllIlIIIl = 1;
    
    public static int llllIIIIlIIIlIlllIll(String trim) {
        if (trim == null) {
            return 1;
        }
        trim = trim.toLowerCase().trim();
        if (trim.equals("alpha")) {
            return 0;
        }
        if (trim.equals("add")) {
            return 1;
        }
        if (trim.equals("subtract")) {
            return 2;
        }
        if (trim.equals("multiply")) {
            return 3;
        }
        if (trim.equals("dodge")) {
            return 4;
        }
        if (trim.equals("burn")) {
            return 5;
        }
        if (trim.equals("screen")) {
            return 6;
        }
        if (trim.equals("overlay")) {
            return 7;
        }
        if (trim.equals("replace")) {
            return 8;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown blend: " + trim);
        return 1;
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final float n2) {
        switch (n) {
            case 0: {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n2);
                break;
            }
            case 1: {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 1);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n2);
                break;
            }
            case 2: {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(775, 0);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n2, n2, n2, 1.0f);
                break;
            }
            case 3: {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(774, 771);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n2, n2, n2, n2);
                break;
            }
            case 4: {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(1, 1);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n2, n2, n2, 1.0f);
                break;
            }
            case 5: {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0, 769);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n2, n2, n2, 1.0f);
                break;
            }
            case 6: {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(1, 769);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n2, n2, n2, 1.0f);
                break;
            }
            case 7: {
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(774, 768);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n2, n2, n2, 1.0f);
                break;
            }
            case 8: {
                lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
                lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n2);
                break;
            }
        }
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
    }
    
    public static void llllIIIIlIIIlIlllIll(final float n) {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 1);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, n);
    }
}
