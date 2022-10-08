package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import java.util.*;

public class IIIlIIIlIlIIlllIIlll
{
    private static int[][] IlIlIIIllIllIIIIIllI;
    public static final double llllIIIIlIIIlIlllIll;
    private int[] IllIIlllIIIIlllIIlIl;
    public double IlIlIlIlIlllllllllIl;
    public double llIllIIIIIllIlIIIIlI;
    public double IlIIIlIlIIIllIlIlIIl;
    private static final double llllIIIlIlllIlIIIIIl;
    private static final double lIIIIlIIIIIlllIllIII;
    
    static {
        IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI = new int[][] { { 1, 1, 0 }, { -1, 1, 0 }, { 1, -1, 0 }, { -1, -1, 0 }, { 1, 0, 1 }, { -1, 0, 1 }, { 1, 0, -1 }, { -1, 0, -1 }, { 0, 1, 1 }, { 0, -1, 1 }, { 0, 1, -1 }, { 0, -1, -1 } };
        llllIIIIlIIIlIlllIll = Math.sqrt(3.0);
        llllIIIlIlllIlIIIIIl = 0.5 * (IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll - 1.0);
        lIIIIlIIIIIlllIllIII = (3.0 - IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll) / 6.0;
    }
    
    public IIIlIIIlIlIIlllIIlll() {
        this(new Random());
    }
    
    public IIIlIIIlIlIIlllIIlll(final Random random) {
        this.IllIIlllIIIIlllIIlIl = new int[512];
        this.IlIlIlIlIlllllllllIl = random.nextDouble() * 256.0;
        this.llIllIIIIIllIlIIIIlI = random.nextDouble() * 256.0;
        this.IlIIIlIlIIIllIlIlIIl = random.nextDouble() * 256.0;
        for (int i = 0; i < 256; this.IllIIlllIIIIlllIIlIl[i] = i++) {}
        for (int j = 0; j < 256; ++j) {
            final int n = random.nextInt(256 - j) + j;
            final int n2 = this.IllIIlllIIIIlllIIlIl[j];
            this.IllIIlllIIIIlllIIlIl[j] = this.IllIIlllIIIIlllIIlIl[n];
            this.IllIIlllIIIIlllIIlIl[n] = n2;
            this.IllIIlllIIIIlllIIlIl[j + 256] = this.IllIIlllIIIIlllIIlIl[j];
        }
    }
    
    private static int llllIIIIlIIIlIlllIll(final double n) {
        return (n > 0.0) ? ((int)n) : ((int)n - 1);
    }
    
    private static double llllIIIIlIIIlIlllIll(final int[] array, final double n, final double n2) {
        return array[0] * n + array[1] * n2;
    }
    
    public double llllIIIIlIIIlIlllIll(final double n, final double n2) {
        final double n3 = (n + n2) * (0.5 * (IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll - 1.0));
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n + n3);
        final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(n2 + n3);
        final double n4 = (3.0 - IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll) / 6.0;
        final double n5 = (llllIIIIlIIIlIlllIll + llllIIIIlIIIlIlllIll2) * n4;
        final double n6 = llllIIIIlIIIlIlllIll - n5;
        final double n7 = llllIIIIlIIIlIlllIll2 - n5;
        final double n8 = n - n6;
        final double n9 = n2 - n7;
        int n10;
        int n11;
        if (n8 > n9) {
            n10 = 1;
            n11 = 0;
        }
        else {
            n10 = 0;
            n11 = 1;
        }
        final double n12 = n8 - n10 + n4;
        final double n13 = n9 - n11 + n4;
        final double n14 = n8 - 1.0 + 2.0 * n4;
        final double n15 = n9 - 1.0 + 2.0 * n4;
        final int n16 = llllIIIIlIIIlIlllIll & 0xFF;
        final int n17 = llllIIIIlIIIlIlllIll2 & 0xFF;
        final int n18 = this.IllIIlllIIIIlllIIlIl[n16 + this.IllIIlllIIIIlllIIlIl[n17]] % 12;
        final int n19 = this.IllIIlllIIIIlllIIlIl[n16 + n10 + this.IllIIlllIIIIlllIIlIl[n17 + n11]] % 12;
        final int n20 = this.IllIIlllIIIIlllIIlIl[n16 + 1 + this.IllIIlllIIIIlllIIlIl[n17 + 1]] % 12;
        final double n21 = 0.5 - n8 * n8 - n9 * n9;
        double n22;
        if (n21 < 0.0) {
            n22 = 0.0;
        }
        else {
            final double n23 = n21 * n21;
            n22 = n23 * n23 * llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI[n18], n8, n9);
        }
        final double n24 = 0.5 - n12 * n12 - n13 * n13;
        double n25;
        if (n24 < 0.0) {
            n25 = 0.0;
        }
        else {
            final double n26 = n24 * n24;
            n25 = n26 * n26 * llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI[n19], n12, n13);
        }
        final double n27 = 0.5 - n14 * n14 - n15 * n15;
        double n28;
        if (n27 < 0.0) {
            n28 = 0.0;
        }
        else {
            final double n29 = n27 * n27;
            n28 = n29 * n29 * llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI[n20], n14, n15);
        }
        return 70.0 * (n22 + n25 + n28);
    }
    
    public void llllIIIIlIIIlIlllIll(final double[] array, final double n, final double n2, final int n3, final int n4, final double n5, final double n6, final double n7) {
        int n8 = 0;
        for (int i = 0; i < n4; ++i) {
            final double n9 = (n2 + i) * n6 + this.llIllIIIIIllIlIIIIlI;
            for (int j = 0; j < n3; ++j) {
                final double n10 = (n + j) * n5 + this.IlIlIlIlIlllllllllIl;
                final double n11 = (n10 + n9) * IIIlIIIlIlIIlllIIlll.llllIIIlIlllIlIIIIIl;
                final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n10 + n11);
                final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(n9 + n11);
                final double n12 = (llllIIIIlIIIlIlllIll + llllIIIIlIIIlIlllIll2) * IIIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII;
                final double n13 = llllIIIIlIIIlIlllIll - n12;
                final double n14 = llllIIIIlIIIlIlllIll2 - n12;
                final double n15 = n10 - n13;
                final double n16 = n9 - n14;
                int n17;
                int n18;
                if (n15 > n16) {
                    n17 = 1;
                    n18 = 0;
                }
                else {
                    n17 = 0;
                    n18 = 1;
                }
                final double n19 = n15 - n17 + IIIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII;
                final double n20 = n16 - n18 + IIIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII;
                final double n21 = n15 - 1.0 + 2.0 * IIIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII;
                final double n22 = n16 - 1.0 + 2.0 * IIIlIIIlIlIIlllIIlll.lIIIIlIIIIIlllIllIII;
                final int n23 = llllIIIIlIIIlIlllIll & 0xFF;
                final int n24 = llllIIIIlIIIlIlllIll2 & 0xFF;
                final int n25 = this.IllIIlllIIIIlllIIlIl[n23 + this.IllIIlllIIIIlllIIlIl[n24]] % 12;
                final int n26 = this.IllIIlllIIIIlllIIlIl[n23 + n17 + this.IllIIlllIIIIlllIIlIl[n24 + n18]] % 12;
                final int n27 = this.IllIIlllIIIIlllIIlIl[n23 + 1 + this.IllIIlllIIIIlllIIlIl[n24 + 1]] % 12;
                final double n28 = 0.5 - n15 * n15 - n16 * n16;
                double n29;
                if (n28 < 0.0) {
                    n29 = 0.0;
                }
                else {
                    final double n30 = n28 * n28;
                    n29 = n30 * n30 * llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI[n25], n15, n16);
                }
                final double n31 = 0.5 - n19 * n19 - n20 * n20;
                double n32;
                if (n31 < 0.0) {
                    n32 = 0.0;
                }
                else {
                    final double n33 = n31 * n31;
                    n32 = n33 * n33 * llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI[n26], n19, n20);
                }
                final double n34 = 0.5 - n21 * n21 - n22 * n22;
                double n35;
                if (n34 < 0.0) {
                    n35 = 0.0;
                }
                else {
                    final double n36 = n34 * n34;
                    n35 = n36 * n36 * llllIIIIlIIIlIlllIll(IIIlIIIlIlIIlllIIlll.IlIlIIIllIllIIIIIllI[n27], n21, n22);
                }
                final int n37 = n8++;
                array[n37] += 70.0 * (n29 + n32 + n35) * n7;
            }
        }
    }
}
