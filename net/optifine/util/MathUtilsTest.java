package net.optifine.util;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class MathUtilsTest
{
    private static volatile /* synthetic */ int[] llllIIIIlIIIlIlllIll;
    
    public static void main(final String[] array) {
        final IlIlIllllllllIIIIlII[] values = IlIlIllllllllIIIIlII.values();
        for (int i = 0; i < values.length; ++i) {
            final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = values[i];
            llllIIIIlIIIlIlllIll("******** " + ilIlIllllllllIIIIlII + " ***********");
            llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, false);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final boolean illIIlllIIIIlllIIlIl) {
        llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        double n = 0.0;
        double n2 = 0.0;
        switch (llllIIIIlIIIlIlllIll()[ilIlIllllllllIIIIlII.ordinal()]) {
            case 1:
            case 2: {
                n = -llIllIIlllllllllllll.IlIlIlIlIlllllllllIl;
                n2 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl;
                break;
            }
            case 3:
            case 4: {
                n = -1.0;
                n2 = 1.0;
                break;
            }
            default: {
                return;
            }
        }
        for (int n3 = 10, i = 0; i <= n3; ++i) {
            final double n4 = n + i * (n2 - n) / n3;
            float n5 = 0.0f;
            float n6 = 0.0f;
            switch (llllIIIIlIIIlIlllIll()[ilIlIllllllllIIIIlII.ordinal()]) {
                case 1: {
                    n5 = (float)Math.sin(n4);
                    n6 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((float)n4);
                    break;
                }
                case 2: {
                    n5 = (float)Math.cos(n4);
                    n6 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((float)n4);
                    break;
                }
                case 3: {
                    n5 = (float)Math.asin(n4);
                    n6 = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll((float)n4);
                    break;
                }
                case 4: {
                    n5 = (float)Math.acos(n4);
                    n6 = IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl((float)n4);
                    break;
                }
                default: {
                    return;
                }
            }
            llllIIIIlIIIlIlllIll(String.format("%.2f, Math: %f, Helper: %f, diff: %f", n4, n5, n6, Math.abs(n5 - n6)));
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s) {
        System.out.println(s);
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] llllIIIIlIIIlIlllIll = MathUtilsTest.llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll != null) {
            return llllIIIIlIIIlIlllIll;
        }
        final int[] llllIIIIlIIIlIlllIll2 = new int[IlIlIllllllllIIIIlII.values().length];
        try {
            llllIIIIlIIIlIlllIll2[IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIIIlIIIlIlllIll2[IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIIIlIIIlIlllIll2[IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIIIlIIIlIlllIll2[IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        return MathUtilsTest.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
    }
}
