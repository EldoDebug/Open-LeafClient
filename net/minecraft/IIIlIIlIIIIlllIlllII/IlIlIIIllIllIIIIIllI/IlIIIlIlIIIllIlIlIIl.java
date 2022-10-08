package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl implements lIIIIlIIIIIlllIllIII
{
    private Random lIIIIlIIIIIlllIllIII;
    private IlIlIIIIIIlllIlIllIl lIIIlllIIIllIIIllIII;
    private IlIlIIIIIIlllIlIllIl llIIlIIIlIIIllIlIIIl;
    private IlIlIIIIIIlllIlIllIl llIllIlIIIIllIlIIllI;
    private IIllIIllIIIlIlIIIIlI lIlIlIIIllIIllIIIllI;
    public IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll;
    public IlIlIIIIIIlllIlIllIl IlIlIlIlIlllllllllIl;
    public IlIlIIIIIIlllIlIllIl llIllIIIIIllIlIIIIlI;
    private IlllllllIIIlIIIlIlII IlIlIIIllIIllIlllllI;
    private final boolean IIIIlllIIIIIIlIIIlll;
    private llIllIlIlIIIIIIIllII llllIIllllIlIlIIIIll;
    private final double[] IlIllIlIlIIIlIlIlIII;
    private final float[] IIlllIIlIllIllIlIIll;
    private llllIIIlIlllIlIIIIIl lllIIIIlllllIlIIllIl;
    private llllIIIIlIIIlIlllIll IlIlIIIIIIlllIlIllIl;
    private double[] IIllIIllIIIlIlIIIIlI;
    private IlIlIIIllIIllIlllllI IIIlIIIlIlIIlllIIlll;
    private lIlIlIIIllIIllIIIllI IlIlIIIlIIlIlIIlllIl;
    private net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI IlllllllIIIlIIIlIlII;
    private net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl IIlIIIIlllIlllllIlII;
    private llIIlIIIlIIIllIlIIIl IIIlIIlIIIIlllIlllII;
    private IlIlIIIllIIllIlllllI IlIlIllllllllIIIIlII;
    private IllIlIIllIllIIlIllII IIlllIlIIllIlIlIlIIl;
    private net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] llIIIlIlIllIIlIlIlII;
    double[] IlIIIlIlIIIllIlIlIIl;
    double[] IlIlIIIllIllIIIIIllI;
    double[] IllIIlllIIIIlllIIlIl;
    double[] llllIIIlIlllIlIIIIIl;
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII ilIlIIIllIIllIlllllI, final long n, final boolean iiiIlllIIIIIIlIIIlll, final String s) {
        this.IlIlIIIIIIlllIlIllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl;
        this.IIllIIllIIIlIlIIIIlI = new double[256];
        this.IIIlIIIlIlIIlllIIlll = new IIIIlllIIIIIIlIIIlll();
        this.IlIlIIIlIIlIlIIlllIl = new lIlIlIIIllIIllIIIllI();
        this.IlllllllIIIlIIIlIlII = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI();
        this.IIlIIIIlllIlllllIlII = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl();
        this.IIIlIIlIIIIlllIlllII = new llIIlIIIlIIIllIlIIIl();
        this.IlIlIllllllllIIIIlII = new IlIllIlIlIIIlIlIlIII();
        this.IIlllIlIIllIlIlIlIIl = new IllIlIIllIllIIlIllII();
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        this.llllIIllllIlIlIIIIll = ilIlIIIllIIllIlllllI.lIllllllIIllIlIlIlII().IIllIIllIIIlIlIIIIlI();
        this.lIIIIlIIIIIlllIllIII = new Random(n);
        this.lIIIlllIIIllIIIllIII = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 16);
        this.llIIlIIIlIIIllIlIIIl = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 16);
        this.llIllIlIIIIllIlIIllI = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 8);
        this.lIlIlIIIllIIllIIIllI = new IIllIIllIIIlIlIIIIlI(this.lIIIIlIIIIIlllIllIII, 4);
        this.llllIIIIlIIIlIlllIll = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 10);
        this.IlIlIlIlIlllllllllIl = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 16);
        this.llIllIIIIIllIlIIIIlI = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 8);
        this.IlIllIlIlIIIlIlIlIII = new double[825];
        this.IIlllIIlIllIllIlIIll = new float[25];
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                this.IIlllIIlIllIllIlIIll[i + 2 + (j + 2) * 5] = 10.0f / llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(i * i + j * j + 0.2f);
            }
        }
        if (s != null) {
            this.lllIIIIlllllIlIIllIl = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(s).IlIlIlIlIlllllllllIl();
            this.IlIlIIIIIIlllIlIllIl = (this.lllIIIIlllllIlIIllIl.llIIlllIIlllIIllIllI ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl);
            ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI(this.lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llIIIlIlIllIIlIlIlII = this.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(this.llIIIlIlIllIIlIlIlII, n * 4 - 2, n2 * 4 - 2, 10, 10);
        this.llllIIIIlIIIlIlllIll(n * 4, 0, n2 * 4);
        for (int i = 0; i < 4; ++i) {
            final int n3 = i * 5;
            final int n4 = (i + 1) * 5;
            for (int j = 0; j < 4; ++j) {
                final int n5 = (n3 + j) * 33;
                final int n6 = (n3 + j + 1) * 33;
                final int n7 = (n4 + j) * 33;
                final int n8 = (n4 + j + 1) * 33;
                for (int k = 0; k < 32; ++k) {
                    final double n9 = 0.125;
                    double n10 = this.IlIllIlIlIIIlIlIlIII[n5 + k];
                    double n11 = this.IlIllIlIlIIIlIlIlIII[n6 + k];
                    double n12 = this.IlIllIlIlIIIlIlIlIII[n7 + k];
                    double n13 = this.IlIllIlIlIIIlIlIlIII[n8 + k];
                    final double n14 = (this.IlIllIlIlIIIlIlIlIII[n5 + k + 1] - n10) * n9;
                    final double n15 = (this.IlIllIlIlIIIlIlIlIII[n6 + k + 1] - n11) * n9;
                    final double n16 = (this.IlIllIlIlIIIlIlIlIII[n7 + k + 1] - n12) * n9;
                    final double n17 = (this.IlIllIlIlIIIlIlIlIII[n8 + k + 1] - n13) * n9;
                    for (int l = 0; l < 8; ++l) {
                        final double n18 = 0.25;
                        double n19 = n10;
                        double n20 = n11;
                        final double n21 = (n12 - n10) * n18;
                        final double n22 = (n13 - n11) * n18;
                        for (int n23 = 0; n23 < 4; ++n23) {
                            final double n24 = (n20 - n19) * 0.25;
                            double n25 = n19 - n24;
                            for (int n26 = 0; n26 < 4; ++n26) {
                                if ((n25 += n24) > 0.0) {
                                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i * 4 + n23, k * 8 + l, j * 4 + n26, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll());
                                }
                                else if (k * 8 + l < this.lllIIIIlllllIlIIllIl.IIlllIIlIllIllIlIIll) {
                                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i * 4 + n23, k * 8 + l, j * 4 + n26, this.IlIlIIIIIIlllIlIllIl.lllIllIIIllllllIllll());
                                }
                            }
                            n19 += n21;
                            n20 += n22;
                        }
                        n10 += n14;
                        n11 += n15;
                        n12 += n16;
                        n13 += n17;
                    }
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] array) {
        final double n3 = 0.03125;
        this.IIllIIllIIIlIlIIIIlI = this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, n * 16, n2 * 16, 16, 16, n3 * 2.0, n3 * 2.0, 1.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                array[j + i * 16].llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, illIIlllIIIIlllIIlIl, n * 16 + i, n2 * 16 + j, this.IIllIIllIIIlIlIIIIlI[j + i * 16]);
            }
        }
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        this.lIIIIlIIIIIlllIllIII.setSeed(n * 341873128712L + n2 * 132897987541L);
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl();
        this.llllIIIIlIIIlIlllIll(n, n2, illIIlllIIIIlllIIlIl);
        this.llllIIIIlIIIlIlllIll(n, n2, illIIlllIIIIlllIIlIl, this.llIIIlIlIllIIlIlIlII = this.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(this.llIIIlIlIllIIlIlIlII, n * 16, n2 * 16, 16, 16));
        if (this.lllIIIIlllllIlIIllIl.lllIIIIlllllIlIIllIl) {
            this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, illIIlllIIIIlllIIlIl);
        }
        if (this.lllIIIIlllllIlIIllIl.IlIlIllllllllIIIIlII) {
            this.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, illIIlllIIIIlllIIlIl);
        }
        if (this.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, illIIlllIIIIlllIIlIl);
        }
        if (this.lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl && this.IIIIlllIIIIIIlIIIlll) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, illIIlllIIIIlllIIlIl);
        }
        if (this.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll && this.IIIIlllIIIIIIlIIIlll) {
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, illIIlllIIIIlllIIlIl);
        }
        if (this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, illIIlllIIIIlllIIlIl);
        }
        if (this.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, illIIlllIIIIlllIIlIl);
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, illIIlllIIIIlllIIlIl, n, n2);
        final byte[] llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
        for (int i = 0; i < llIllIlIIIIllIlIIllI.length; ++i) {
            llIllIlIIIIllIlIIllI[i] = (byte)this.llIIIlIlIllIIlIlIlII[i].lIIIIIlIlIIIlIIIIlIl;
        }
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        return llllIIIIlIIIlIlllIll;
    }
    
    private void llllIIIIlIIIlIlllIll(int n, final int n2, int n3) {
        this.llllIIIlIlllIlIIIIIl = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, n, n3, 5, 5, this.lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI, this.lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl, this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl);
        final float llllIIIIlIIIlIlllIll = this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll;
        final float ilIlIlIlIlllllllllIl = this.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, n, n2, n3, 5, 33, 5, llllIIIIlIIIlIlllIll / this.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl / this.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII, llllIIIIlIIIlIlllIll / this.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl);
        this.IlIlIIIllIllIIIIIllI = this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, n, n2, n3, 5, 33, 5, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        this.IllIIlllIIIIlllIIlIl = this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, n, n2, n3, 5, 33, 5, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        n3 = 0;
        n = 0;
        int n4 = 0;
        int n5 = 0;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                float n6 = 0.0f;
                float n7 = 0.0f;
                float n8 = 0.0f;
                final int n9 = 2;
                final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = this.llIIIlIlIllIIlIlIlII[i + 2 + (j + 2) * 10];
                for (int k = -n9; k <= n9; ++k) {
                    for (int l = -n9; l <= n9; ++l) {
                        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = this.llIIIlIlIllIIlIlIlII[i + k + 2 + (j + l + 2) * 10];
                        float n10 = this.lllIIIIlllllIlIIllIl.IIIIlllIIIIIIlIIIlll + llIIlIIIlIIIllIlIIIl2.IIlllllIllIllIlIlIII * this.lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI;
                        float n11 = this.lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII + llIIlIIIlIIIllIlIIIl2.llllIllllIllllIlIlII * this.lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll;
                        if (this.llllIIllllIlIlIIIIll == llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI && n10 > 0.0f) {
                            n10 = 1.0f + n10 * 2.0f;
                            n11 = 1.0f + n11 * 4.0f;
                        }
                        float n12 = this.IIlllIIlIllIllIlIIll[k + 2 + (l + 2) * 5] / (n10 + 2.0f);
                        if (llIIlIIIlIIIllIlIIIl2.IIlllllIllIllIlIlIII > llIIlIIIlIIIllIlIIIl.IIlllllIllIllIlIlIII) {
                            n12 /= 2.0f;
                        }
                        n6 += n11 * n12;
                        n7 += n10 * n12;
                        n8 += n12;
                    }
                }
                final float n13 = n6 / n8;
                final float n14 = n7 / n8;
                final float n15 = n13 * 0.9f + 0.1f;
                final float n16 = (n14 * 4.0f - 1.0f) / 8.0f;
                double n17 = this.llllIIIlIlllIlIIIIIl[n5] / 8000.0;
                if (n17 < 0.0) {
                    n17 = -n17 * 0.3;
                }
                double n18 = n17 * 3.0 - 2.0;
                double n20;
                if (n18 < 0.0) {
                    double n19 = n18 / 2.0;
                    if (n19 < -1.0) {
                        n19 = -1.0;
                    }
                    n20 = n19 / 1.4 / 2.0;
                }
                else {
                    if (n18 > 1.0) {
                        n18 = 1.0;
                    }
                    n20 = n18 / 8.0;
                }
                ++n5;
                final double n21 = n16;
                final double n22 = n15;
                final double n23 = this.lllIIIIlllllIlIIllIl.llIllIlIIIIllIlIIllI + (n21 + n20 * 0.2) * this.lllIIIIlllllIlIIllIl.llIllIlIIIIllIlIIllI / 8.0 * 4.0;
                for (int n24 = 0; n24 < 33; ++n24) {
                    double n25 = (n24 - n23) * this.lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI * 128.0 / 256.0 / n22;
                    if (n25 < 0.0) {
                        n25 *= 4.0;
                    }
                    double n26 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI[n4] / this.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl, this.IllIIlllIIIIlllIIlIl[n4] / this.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI, (this.IlIIIlIlIIIllIlIlIIl[n4] / 10.0 + 1.0) / 2.0) - n25;
                    if (n24 > 29) {
                        final double n27 = (n24 - 29) / 3.0f;
                        n26 = n26 * (1.0 - n27) + -10.0 * n27;
                    }
                    this.IlIllIlIlIIIlIlIlIII[n4] = n26;
                    ++n4;
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int n, final int n2) {
        IlIIlllllIIllIIlllll.IlllIIIIlIIIlIlIlIIl = true;
        final int n3 = n * 16;
        final int n4 = n2 * 16;
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n3, 0, n4);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(16, 0, 16));
        this.lIIIIlIIIIIlllIllIII.setSeed(this.IlIlIIIllIIllIlllllI.IIlIIIIlllIlllllIlII());
        this.lIIIIlIIIIIlllIllIII.setSeed(n * (this.lIIIIlIIIIIlllIllIII.nextLong() / 2L * 2L + 1L) + n2 * (this.lIIIIlIIIIIlllIllIII.nextLong() / 2L * 2L + 1L) ^ this.IlIlIIIllIIllIlllllI.IIlIIIIlllIlllllIlII());
        boolean llllIIIIlIIIlIlllIll = false;
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(n, n2);
        if (this.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl2);
        }
        if (this.lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl && this.IIIIlllIIIIIIlIIIlll) {
            llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl2);
        }
        if (this.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll && this.IIIIlllIIIIIIlIIIlll) {
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl2);
        }
        if (this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl2);
        }
        if (this.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl2);
        }
        if (llIllIIIIIllIlIIIIlI != net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl && llIllIIIIIllIlIIIIlI != net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll && this.lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl && !llllIIIIlIIIlIlllIll && this.lIIIIlIIIIIlllIllIII.nextInt(this.lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII) == 0) {
            new IlIlIIIlIIlIlIIlllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl).llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.nextInt(16) + 8, this.lIIIIlIIIIIlllIllIII.nextInt(256), this.lIIIIlIIIIIlllIllIII.nextInt(16) + 8));
        }
        if (!llllIIIIlIIIlIlllIll && this.lIIIIlIIIIIlllIllIII.nextInt(this.lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII / 10) == 0 && this.lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII) {
            final int n5 = this.lIIIIlIIIIIlllIllIII.nextInt(16) + 8;
            final int nextInt = this.lIIIIlIIIIIlllIllIII.nextInt(this.lIIIIlIIIIIlllIllIII.nextInt(248) + 8);
            final int n6 = this.lIIIIlIIIIIlllIllIII.nextInt(16) + 8;
            if (nextInt < this.IlIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl() || this.lIIIIlIIIIIlllIllIII.nextInt(this.lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII / 8) == 0) {
                new IlIlIIIlIIlIlIIlllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI).llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n5, nextInt, n6));
            }
        }
        if (this.lllIIIIlllllIlIIllIl.IlIlIIIIIIlllIlIllIl) {
            for (int i = 0; i < this.lllIIIIlllllIlIIllIl.IIllIIllIIIlIlIIIIlI; ++i) {
                new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI().llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.nextInt(16) + 8, this.lIIIIlIIIIIlllIllIII.nextInt(256), this.lIIIIlIIIIIlllIllIII.nextInt(16) + 8));
            }
        }
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, new IlIlIlIlIlllllllllIl(n3, 0, n4));
        net.minecraft.IIIlIIlIIIIlllIlllII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, llIllIIIIIllIlIIIIlI, n3 + 8, n4 + 8, 16, 16, this.lIIIIlIIIIIlllIllIII);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(8, 0, 8);
        for (int j = 0; j < 16; ++j) {
            for (int k = 0; k < 16; ++k) {
                final IlIlIlIlIlllllllllIl iIlllIIlIllIllIlIIll = this.IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(j, 0, k));
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = iIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl();
                if (this.IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll(ilIlIlIlIlllllllllIl3)) {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII.lllIllIIIllllllIllll(), 2);
                }
                if (this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl(iIlllIIlIllIllIlIIll, true)) {
                    this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI.lllIllIIIllllllIllll(), 2);
                }
            }
        }
        IlIIlllllIIllIIlllll.IlllIIIIlIIIlIlIlIIl = false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        boolean b = false;
        if (this.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII && this.IIIIlllIIIIIIlIIIlll && llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII() < 3600L) {
            b |= this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.lIIIIlIIIIIlllIllIII, new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(n, n2));
        }
        return b;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final boolean b, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return true;
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl() {
        return "RandomLevelSource";
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = this.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        if (this.IIIIlllIIIIIIlIIIlll) {
            if (illlIlIIllIlIlIlIIl == net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll && this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
                return this.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl();
            }
            if (illlIlIIllIlIlIlIIl == net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll && this.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII && this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, ilIlIlIlIlllllllllIl)) {
                return this.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI();
            }
        }
        return llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl);
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final String s, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return ("Stronghold".equals(s) && this.IlIlIIIlIIlIlIIlllIl != null) ? this.IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) : null;
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        if (this.lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, null);
        }
        if (this.lllIIIIlllllIlIIllIl.IlIlIIIlIIlIlIIlllIl && this.IIIIlllIIIIIIlIIIlll) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, null);
        }
        if (this.lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll && this.IIIIlllIIIIIIlIIIlll) {
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, null);
        }
        if (this.lllIIIIlllllIlIIllIl.IIlIIIIlllIlllllIlII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, null);
        }
        if (this.lllIIIIlllllIlIIllIl.IIIlIIlIIIIlllIlllII && this.IIIIlllIIIIIIlIIIlll) {
            this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(this, this.IlIlIIIllIIllIlllllI, n, n2, null);
        }
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
    }
}
