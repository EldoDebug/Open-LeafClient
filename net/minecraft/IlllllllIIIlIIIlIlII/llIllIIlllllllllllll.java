package net.minecraft.IlllllllIIIlIIIlIlII;

import net.optifine.util.*;
import java.util.*;

public class llIllIIlllllllllllll
{
    public static final float llllIIIIlIIIlIlllIll;
    private static final int llllIIIlIlllIlIIIIIl = 12;
    private static final int lIIIIlIIIIIlllIllIII = 4095;
    private static final int lIIIlllIIIllIIIllIII = 4096;
    private static final int llIIlIIIlIIIllIlIIIl = 1024;
    public static final float IlIlIlIlIlllllllllIl;
    public static final float llIllIIIIIllIlIIIIlI;
    public static final float IlIIIlIlIIIllIlIlIIl;
    private static final float llIllIlIIIIllIlIIllI;
    public static final float IlIlIIIllIllIIIIIllI;
    private static final float[] lIlIlIIIllIIllIIIllI;
    public static boolean IllIIlllIIIIlllIIlIl;
    private static final float[] IlIlIIIllIIllIlllllI;
    private static final int[] IIIIlllIIIIIIlIIIlll;
    private static final double llllIIllllIlIlIIIIll;
    private static final double[] IlIllIlIlIIIlIlIlIII;
    private static final double[] IIlllIIlIllIllIlIIll;
    
    static {
        llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI(2.0f);
        IlIlIlIlIlllllllllIl = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(3.141592653589793);
        llIllIIIIIllIlIIIIlI = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(6.283185307179586);
        IlIIIlIlIIIllIlIlIIl = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(1.5707963267948966);
        llIllIlIIIIllIlIIllI = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(651.8986469044033);
        IlIlIIIllIllIIIIIllI = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(0.017453292519943295);
        lIlIlIIIllIIllIIIllI = new float[4096];
        llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl = false;
        IlIlIIIllIIllIlllllI = new float[65536];
        for (int i = 0; i < 65536; ++i) {
            llIllIIlllllllllllll.IlIlIIIllIIllIlllllI[i] = (float)Math.sin(i * 3.141592653589793 * 2.0 / 65536.0);
        }
        for (int j = 0; j < llIllIIlllllllllllll.lIlIlIIIllIIllIIIllI.length; ++j) {
            llIllIIlllllllllllll.lIlIlIIIllIIllIIIllI[j] = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(Math.sin(j * 3.141592653589793 * 2.0 / 4096.0));
        }
        IIIIlllIIIIIIlIIIlll = new int[] { 0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9 };
        llllIIllllIlIlIIIIll = Double.longBitsToDouble(4805340802404319232L);
        IlIllIlIlIIIlIlIlIII = new double[257];
        IIlllIIlIllIllIlIIll = new double[257];
        for (int k = 0; k < 257; ++k) {
            final double asin = Math.asin(k / 256.0);
            llIllIIlllllllllllll.IIlllIIlIllIllIlIIll[k] = Math.cos(asin);
            llIllIIlllllllllllll.IlIllIlIlIIIlIlIlIII[k] = asin;
        }
    }
    
    public static float llllIIIIlIIIlIlllIll(final float n) {
        return llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl ? llIllIIlllllllllllll.lIlIlIIIllIIllIIIllI[(int)(n * llIllIIlllllllllllll.llIllIlIIIIllIlIIllI) & 0xFFF] : llIllIIlllllllllllll.IlIlIIIllIIllIlllllI[(int)(n * 10430.378f) & 0xFFFF];
    }
    
    public static float IlIlIlIlIlllllllllIl(final float n) {
        return llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl ? llIllIIlllllllllllll.lIlIlIIIllIIllIIIllI[(int)(n * llIllIIlllllllllllll.llIllIlIIIIllIlIIllI + 1024.0f) & 0xFFF] : llIllIIlllllllllllll.IlIlIIIllIIllIlllllI[(int)(n * 10430.378f + 16384.0f) & 0xFFFF];
    }
    
    public static float llIllIIIIIllIlIIIIlI(final float n) {
        return (float)Math.sqrt(n);
    }
    
    public static float llllIIIIlIIIlIlllIll(final double n) {
        return (float)Math.sqrt(n);
    }
    
    public static int IlIIIlIlIIIllIlIlIIl(final float n) {
        final int n2 = (int)n;
        return (n < n2) ? (n2 - 1) : n2;
    }
    
    public static int IlIlIlIlIlllllllllIl(final double n) {
        return (int)(n + 1024.0) - 1024;
    }
    
    public static int llIllIIIIIllIlIIIIlI(final double n) {
        final int n2 = (int)n;
        return (n < n2) ? (n2 - 1) : n2;
    }
    
    public static long IlIIIlIlIIIllIlIlIIl(final double n) {
        final long n2 = (long)n;
        return (n < n2) ? (n2 - 1L) : n2;
    }
    
    public static int IlIlIIIllIllIIIIIllI(final double n) {
        return (int)((n >= 0.0) ? n : (-n + 1.0));
    }
    
    public static float IlIlIIIllIllIIIIIllI(final float n) {
        return (n >= 0.0f) ? n : (-n);
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        return (n >= 0) ? n : (-n);
    }
    
    public static int IllIIlllIIIIlllIIlIl(final float n) {
        final int n2 = (int)n;
        return (n > n2) ? (n2 + 1) : n2;
    }
    
    public static int IllIIlllIIIIlllIIlIl(final double n) {
        final int n2 = (int)n;
        return (n > n2) ? (n2 + 1) : n2;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return (n < n2) ? n2 : ((n > n3) ? n3 : n);
    }
    
    public static float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        return (n < n2) ? n2 : ((n > n3) ? n3 : n);
    }
    
    public static double llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        return (n < n2) ? n2 : ((n > n3) ? n3 : n);
    }
    
    public static double IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3) {
        return (n3 < 0.0) ? n : ((n3 > 1.0) ? n2 : (n + (n2 - n) * n3));
    }
    
    public static double llllIIIIlIIIlIlllIll(double n, double n2) {
        if (n < 0.0) {
            n = -n;
        }
        if (n2 < 0.0) {
            n2 = -n2;
        }
        return (n > n2) ? n : n2;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return (n < 0) ? (-((-n - 1) / n2) - 1) : (n / n2);
    }
    
    public static int llllIIIIlIIIlIlllIll(final Random random, final int n, final int n2) {
        return (n >= n2) ? n : (random.nextInt(n2 - n + 1) + n);
    }
    
    public static float llllIIIIlIIIlIlllIll(final Random random, final float n, final float n2) {
        return (n >= n2) ? n : (random.nextFloat() * (n2 - n) + n);
    }
    
    public static double llllIIIIlIIIlIlllIll(final Random random, final double n, final double n2) {
        return (n >= n2) ? n : (random.nextDouble() * (n2 - n) + n);
    }
    
    public static double llllIIIIlIIIlIlllIll(final long[] array) {
        long n = 0L;
        for (int length = array.length, i = 0; i < length; ++i) {
            n += array[i];
        }
        return n / (double)array.length;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final float n, final float n2) {
        return IlIlIIIllIllIIIIIllI(n2 - n) < 1.0E-5f;
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return (n % n2 + n2) % n2;
    }
    
    public static float llllIIIlIlllIlIIIIIl(float n) {
        n %= 360.0f;
        if (n >= 180.0f) {
            n -= 360.0f;
        }
        if (n < -180.0f) {
            n += 360.0f;
        }
        return n;
    }
    
    public static double llllIIIlIlllIlIIIIIl(double n) {
        n %= 360.0;
        if (n >= 180.0) {
            n -= 360.0;
        }
        if (n < -180.0) {
            n += 360.0;
        }
        return n;
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s, final int n) {
        try {
            return Integer.parseInt(s);
        }
        catch (Throwable t) {
            return n;
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        return Math.max(n2, llllIIIIlIIIlIlllIll(s, n));
    }
    
    public static double llllIIIIlIIIlIlllIll(final String s, final double n) {
        try {
            return Double.parseDouble(s);
        }
        catch (Throwable t) {
            return n;
        }
    }
    
    public static double llllIIIIlIIIlIlllIll(final String s, final double n, final double n2) {
        return Math.max(n2, llllIIIIlIIIlIlllIll(s, n));
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n) {
        final int n2 = n - 1;
        final int n3 = n2 | n2 >> 1;
        final int n4 = n3 | n3 >> 2;
        final int n5 = n4 | n4 >> 4;
        final int n6 = n5 | n5 >> 8;
        return (n6 | n6 >> 16) + 1;
    }
    
    private static boolean IlIIIlIlIIIllIlIlIIl(final int n) {
        return n != 0 && (n & n - 1) == 0x0;
    }
    
    private static int IlIlIIIllIllIIIIIllI(int n) {
        n = (IlIIIlIlIIIllIlIlIIl(n) ? n : IlIlIlIlIlllllllllIl(n));
        return llIllIIlllllllllllll.IIIIlllIIIIIIlIIIlll[(int)(n * 125613361L >> 27) & 0x1F];
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n) {
        return IlIlIIIllIllIIIIIllI(n) - (IlIIIlIlIIIllIlIlIIl(n) ? 0 : 1);
    }
    
    public static int llIllIIIIIllIlIIIIlI(final int n, int n2) {
        if (n2 == 0) {
            return 0;
        }
        if (n == 0) {
            return n2;
        }
        if (n < 0) {
            n2 *= -1;
        }
        final int n3 = n % n2;
        return (n3 == 0) ? n : (n + n2 - n3);
    }
    
    public static int IlIlIlIlIlllllllllIl(final float n, final float n2, final float n3) {
        return IlIlIlIlIlllllllllIl(IlIIIlIlIIIllIlIlIIl(n * 255.0f), IlIIIlIlIIIllIlIlIIl(n2 * 255.0f), IlIIIlIlIIIllIlIlIIl(n3 * 255.0f));
    }
    
    public static int IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        return ((n << 8) + n2 << 8) + n3;
    }
    
    public static int IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        return (n & 0xFF000000) | (int)(((n & 0xFF0000) >> 16) * (float)((n2 & 0xFF0000) >> 16) / 255.0f) << 16 | (int)(((n & 0xFF00) >> 8) * (float)((n2 & 0xFF00) >> 8) / 255.0f) << 8 | (int)(((n & 0xFF) >> 0) * (float)((n2 & 0xFF) >> 0) / 255.0f);
    }
    
    public static double lIIIIlIIIIIlllIllIII(final double n) {
        return n - Math.floor(n);
    }
    
    public static long llllIIIIlIIIlIlllIll(final f f) {
        return llIllIIIIIllIlIIIIlI(f.lIIIIlIIIIIlllIllIII(), f.lIIIlllIIIllIIIllIII(), f.llIIlIIIlIIIllIlIIIl());
    }
    
    public static long llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3) {
        final long n4 = (long)(n * 3129871) ^ n3 * 116129781L ^ (long)n2;
        return n4 * n4 * 42317861L + n4 * 11L;
    }
    
    public static UUID llllIIIIlIIIlIlllIll(final Random random) {
        return new UUID((random.nextLong() & 0xFFFFFFFFFFFF0FFFL) | 0x4000L, (random.nextLong() & 0x3FFFFFFFFFFFFFFFL) | Long.MIN_VALUE);
    }
    
    public static double llIllIIIIIllIlIIIIlI(final double n, final double n2, final double n3) {
        return (n - n2) / (n3 - n2);
    }
    
    public static double IlIlIlIlIlllllllllIl(double n, double n2) {
        final double n3 = n2 * n2 + n * n;
        if (Double.isNaN(n3)) {
            return Double.NaN;
        }
        final boolean b = n < 0.0;
        if (b) {
            n = -n;
        }
        final boolean b2 = n2 < 0.0;
        if (b2) {
            n2 = -n2;
        }
        final boolean b3 = n > n2;
        if (b3) {
            final double n4 = n2;
            n2 = n;
            n = n4;
        }
        final double liiIlllIIIllIIIllIII = lIIIlllIIIllIIIllIII(n3);
        n2 *= liiIlllIIIllIIIllIII;
        n *= liiIlllIIIllIIIllIII;
        final double n5 = llIllIIlllllllllllll.llllIIllllIlIlIIIIll + n;
        final int n6 = (int)Double.doubleToRawLongBits(n5);
        final double n7 = llIllIIlllllllllllll.IlIllIlIlIIIlIlIlIII[n6];
        final double n8 = n * llIllIIlllllllllllll.IIlllIIlIllIllIlIIll[n6] - n2 * (n5 - llIllIIlllllllllllll.llllIIllllIlIlIIIIll);
        double n9 = n7 + (6.0 + n8 * n8) * n8 * 0.16666666666666666;
        if (b3) {
            n9 = 1.5707963267948966 - n9;
        }
        if (b2) {
            n9 = 3.141592653589793 - n9;
        }
        if (b) {
            n9 = -n9;
        }
        return n9;
    }
    
    public static double lIIIlllIIIllIIIllIII(double longBitsToDouble) {
        final double n = 0.5 * longBitsToDouble;
        longBitsToDouble = Double.longBitsToDouble(6910469410427058090L - (Double.doubleToRawLongBits(longBitsToDouble) >> 1));
        longBitsToDouble *= 1.5 - n * longBitsToDouble * longBitsToDouble;
        return longBitsToDouble;
    }
    
    public static int llIllIIIIIllIlIIIIlI(final float n, final float n2, final float n3) {
        final int n4 = (int)(n * 6.0f) % 6;
        final float n5 = n * 6.0f - n4;
        final float n6 = n3 * (1.0f - n2);
        final float n7 = n3 * (1.0f - n5 * n2);
        final float n8 = n3 * (1.0f - (1.0f - n5) * n2);
        float n9 = 0.0f;
        float n10 = 0.0f;
        float n11 = 0.0f;
        switch (n4) {
            case 0: {
                n9 = n3;
                n10 = n8;
                n11 = n6;
                break;
            }
            case 1: {
                n9 = n7;
                n10 = n3;
                n11 = n6;
                break;
            }
            case 2: {
                n9 = n6;
                n10 = n3;
                n11 = n8;
                break;
            }
            case 3: {
                n9 = n6;
                n10 = n7;
                n11 = n3;
                break;
            }
            case 4: {
                n9 = n8;
                n10 = n6;
                n11 = n3;
                break;
            }
            case 5: {
                n9 = n3;
                n10 = n6;
                n11 = n7;
                break;
            }
            default: {
                throw new RuntimeException("Something went wrong when converting from HSV to RGB. Input was " + n + ", " + n2 + ", " + n3);
            }
        }
        return llllIIIIlIIIlIlllIll((int)(n9 * 255.0f), 0, 255) << 16 | llllIIIIlIIIlIlllIll((int)(n10 * 255.0f), 0, 255) << 8 | llllIIIIlIIIlIlllIll((int)(n11 * 255.0f), 0, 255);
    }
}
