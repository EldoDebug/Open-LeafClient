package net.optifine.util;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIlIIlIIIIlllIlllII
{
    public static final float llllIIIIlIIIlIlllIll = 3.1415927f;
    public static final float IlIlIlIlIlllllllllIl = 6.2831855f;
    public static final float llIllIIIIIllIlIIIIlI = 1.5707964f;
    private static final float[] IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new float[65536];
        for (int i = 0; i < 65536; ++i) {
            IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl[i] = (float)Math.asin(i / 32767.5 - 1.0);
        }
        for (int j = -1; j < 2; ++j) {
            IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl[(int)((j + 1.0) * 32767.5) & 0xFFFF] = (float)Math.asin(j);
        }
    }
    
    public static float llllIIIIlIIIlIlllIll(final float n) {
        return IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl[(int)((n + 1.0f) * 32767.5) & 0xFFFF];
    }
    
    public static float IlIlIlIlIlllllllllIl(final float n) {
        return 1.5707964f - IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl[(int)((n + 1.0f) * 32767.5) & 0xFFFF];
    }
    
    public static int llllIIIIlIIIlIlllIll(final int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        return IlIlIlIlIlllllllllIl(array) / array.length;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int[] array) {
        if (array.length <= 0) {
            return 0;
        }
        int n = 0;
        for (int i = 0; i < array.length; ++i) {
            n += array[i];
        }
        return n;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        final int ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n);
        return (n == ilIlIlIlIlllllllllIl) ? ilIlIlIlIlllllllllIl : (ilIlIlIlIlllllllllIl / 2);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        return Math.abs(n - n2) <= n3;
    }
    
    public static float llIllIIIIIllIlIIIIlI(final float n) {
        return n * 180.0f / llIllIIlllllllllllll.IlIlIlIlIlllllllllIl;
    }
    
    public static float IlIIIlIlIIIllIlIlIIl(final float n) {
        return n / 180.0f * llIllIIlllllllllllll.IlIlIlIlIlllllllllIl;
    }
    
    public static float llllIIIIlIIIlIlllIll(final double n) {
        return (float)(Math.round(n * 1.0E8) / 1.0E8);
    }
}
