package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import java.util.*;

public class lllIIIIlllllIlIIllIl extends IIlllIIlIllIllIlIIll
{
    private int[] IlIIIlIlIIIllIlIlIIl;
    public double llllIIIIlIIIlIlllIll;
    public double IlIlIlIlIlllllllllIl;
    public double llIllIIIIIllIlIIIIlI;
    private static final double[] IlIlIIIllIllIIIIIllI;
    private static final double[] IllIIlllIIIIlllIIlIl;
    private static final double[] llllIIIlIlllIlIIIIIl;
    private static final double[] lIIIIlIIIIIlllIllIII;
    private static final double[] lIIIlllIIIllIIIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = new double[] { 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0 };
        IllIIlllIIIIlllIIlIl = new double[] { 1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0 };
        llllIIIlIlllIlIIIIIl = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0 };
        lIIIIlIIIIIlllIllIII = new double[] { 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0 };
        lIIIlllIIIllIIIllIII = new double[] { 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0 };
    }
    
    public lllIIIIlllllIlIIllIl() {
        this(new Random());
    }
    
    public lllIIIIlllllIlIIllIl(final Random random) {
        this.IlIIIlIlIIIllIlIlIIl = new int[512];
        this.llllIIIIlIIIlIlllIll = random.nextDouble() * 256.0;
        this.IlIlIlIlIlllllllllIl = random.nextDouble() * 256.0;
        this.llIllIIIIIllIlIIIIlI = random.nextDouble() * 256.0;
        for (int i = 0; i < 256; this.IlIIIlIlIIIllIlIlIIl[i] = i++) {}
        for (int j = 0; j < 256; ++j) {
            final int n = random.nextInt(256 - j) + j;
            final int n2 = this.IlIIIlIlIIIllIlIlIIl[j];
            this.IlIIIlIlIIIllIlIlIIl[j] = this.IlIIIlIlIIIllIlIlIIl[n];
            this.IlIIIlIlIIIllIlIlIIl[n] = n2;
            this.IlIIIlIlIIIllIlIlIIl[j + 256] = this.IlIIIlIlIIIllIlIlIIl[j];
        }
    }
    
    public final double llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        return n2 + n * (n3 - n2);
    }
    
    public final double llllIIIIlIIIlIlllIll(final int n, final double n2, final double n3) {
        final int n4 = n & 0xF;
        return lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII[n4] * n2 + lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII[n4] * n3;
    }
    
    public final double llllIIIIlIIIlIlllIll(final int n, final double n2, final double n3, final double n4) {
        final int n5 = n & 0xF;
        return lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI[n5] * n2 + lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl[n5] * n3 + lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl[n5] * n4;
    }
    
    public void llllIIIIlIIIlIlllIll(final double[] array, final double n, final double n2, final double n3, final int n4, final int n5, final int n6, final double n7, final double n8, final double n9, final double n10) {
        if (n5 == 1) {
            int n11 = 0;
            final double n12 = 1.0 / n10;
            for (int i = 0; i < n4; ++i) {
                final double n13 = n + i * n7 + this.llllIIIIlIIIlIlllIll;
                int n14 = (int)n13;
                if (n13 < n14) {
                    --n14;
                }
                final int n15 = n14 & 0xFF;
                final double n16 = n13 - n14;
                final double n17 = n16 * n16 * n16 * (n16 * (n16 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < n6; ++j) {
                    final double n18 = n3 + j * n9 + this.llIllIIIIIllIlIIIIlI;
                    int n19 = (int)n18;
                    if (n18 < n19) {
                        --n19;
                    }
                    final int n20 = n19 & 0xFF;
                    final double n21 = n18 - n19;
                    final double n22 = n21 * n21 * n21 * (n21 * (n21 * 6.0 - 15.0) + 10.0);
                    final int n23 = this.IlIIIlIlIIIllIlIlIIl[this.IlIIIlIlIIIllIlIlIIl[n15] + 0] + n20;
                    final int n24 = this.IlIIIlIlIIIllIlIlIIl[this.IlIIIlIlIIIllIlIlIIl[n15 + 1] + 0] + n20;
                    final double llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n22, this.llllIIIIlIIIlIlllIll(n17, this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n23], n16, n21), this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n24], n16 - 1.0, 0.0, n21)), this.llllIIIIlIIIlIlllIll(n17, this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n23 + 1], n16, 0.0, n21 - 1.0), this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n24 + 1], n16 - 1.0, 0.0, n21 - 1.0)));
                    final int n25 = n11++;
                    array[n25] += llllIIIIlIIIlIlllIll * n12;
                }
            }
        }
        else {
            int n26 = 0;
            final double n27 = 1.0 / n10;
            int n28 = -1;
            double llllIIIIlIIIlIlllIll2 = 0.0;
            double llllIIIIlIIIlIlllIll3 = 0.0;
            double llllIIIIlIIIlIlllIll4 = 0.0;
            double llllIIIIlIIIlIlllIll5 = 0.0;
            for (int k = 0; k < n4; ++k) {
                final double n29 = n + k * n7 + this.llllIIIIlIIIlIlllIll;
                int n30 = (int)n29;
                if (n29 < n30) {
                    --n30;
                }
                final int n31 = n30 & 0xFF;
                final double n32 = n29 - n30;
                final double n33 = n32 * n32 * n32 * (n32 * (n32 * 6.0 - 15.0) + 10.0);
                for (int l = 0; l < n6; ++l) {
                    final double n34 = n3 + l * n9 + this.llIllIIIIIllIlIIIIlI;
                    int n35 = (int)n34;
                    if (n34 < n35) {
                        --n35;
                    }
                    final int n36 = n35 & 0xFF;
                    final double n37 = n34 - n35;
                    final double n38 = n37 * n37 * n37 * (n37 * (n37 * 6.0 - 15.0) + 10.0);
                    for (int n39 = 0; n39 < n5; ++n39) {
                        final double n40 = n2 + n39 * n8 + this.IlIlIlIlIlllllllllIl;
                        int n41 = (int)n40;
                        if (n40 < n41) {
                            --n41;
                        }
                        final int n42 = n41 & 0xFF;
                        final double n43 = n40 - n41;
                        final double n44 = n43 * n43 * n43 * (n43 * (n43 * 6.0 - 15.0) + 10.0);
                        if (n39 == 0 || n42 != n28) {
                            n28 = n42;
                            final int n45 = this.IlIIIlIlIIIllIlIlIIl[n31] + n42;
                            final int n46 = this.IlIIIlIlIIIllIlIlIIl[n45] + n36;
                            final int n47 = this.IlIIIlIlIIIllIlIlIIl[n45 + 1] + n36;
                            final int n48 = this.IlIIIlIlIIIllIlIlIIl[n31 + 1] + n42;
                            final int n49 = this.IlIIIlIlIIIllIlIlIIl[n48] + n36;
                            final int n50 = this.IlIIIlIlIIIllIlIlIIl[n48 + 1] + n36;
                            llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(n33, this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n46], n32, n43, n37), this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n49], n32 - 1.0, n43, n37));
                            llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(n33, this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n47], n32, n43 - 1.0, n37), this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n50], n32 - 1.0, n43 - 1.0, n37));
                            llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll(n33, this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n46 + 1], n32, n43, n37 - 1.0), this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n49 + 1], n32 - 1.0, n43, n37 - 1.0));
                            llllIIIIlIIIlIlllIll5 = this.llllIIIIlIIIlIlllIll(n33, this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n47 + 1], n32, n43 - 1.0, n37 - 1.0), this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[n50 + 1], n32 - 1.0, n43 - 1.0, n37 - 1.0));
                        }
                        final double llllIIIIlIIIlIlllIll6 = this.llllIIIIlIIIlIlllIll(n38, this.llllIIIIlIIIlIlllIll(n44, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3), this.llllIIIIlIIIlIlllIll(n44, llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll5));
                        final int n51 = n26++;
                        array[n51] += llllIIIIlIIIlIlllIll6 * n27;
                    }
                }
            }
        }
    }
}
