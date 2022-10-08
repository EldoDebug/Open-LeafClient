package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl implements lIIIIlIIIIIlllIllIII
{
    private Random lIIIIlIIIIIlllIllIII;
    private IlIlIIIIIIlllIlIllIl lIIIlllIIIllIIIllIII;
    private IlIlIIIIIIlllIlIllIl llIIlIIIlIIIllIlIIIl;
    private IlIlIIIIIIlllIlIllIl llIllIlIIIIllIlIIllI;
    public IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll;
    public IlIlIIIIIIlllIlIllIl IlIlIlIlIlllllllllIl;
    private IlllllllIIIlIIIlIlII lIlIlIIIllIIllIIIllI;
    private double[] IlIlIIIllIIllIlllllI;
    private llIIlIIIlIIIllIlIIIl[] IIIIlllIIIIIIlIIIlll;
    double[] llIllIIIIIllIlIIIIlI;
    double[] IlIIIlIlIIIllIlIlIIl;
    double[] IlIlIIIllIllIIIIIllI;
    double[] IllIIlllIIIIlllIIlIl;
    double[] llllIIIlIlllIlIIIIIl;
    
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII lIlIlIIIllIIllIIIllI, final long n) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.lIIIIlIIIIIlllIllIII = new Random(n);
        this.lIIIlllIIIllIIIllIII = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 16);
        this.llIIlIIIlIIIllIlIIIl = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 16);
        this.llIllIlIIIIllIlIIllI = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 8);
        this.llllIIIIlIIIlIlllIll = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 10);
        this.IlIlIlIlIlllllllllIl = new IlIlIIIIIIlllIlIllIl(this.lIIIIlIIIIIlllIllIII, 16);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final int n3 = 2;
        final int n4 = n3 + 1;
        final int n5 = 33;
        final int n6 = n3 + 1;
        this.IlIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, n * n3, 0, n2 * n3, n4, n5, n6);
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                for (int k = 0; k < 32; ++k) {
                    final double n7 = 0.25;
                    double n8 = this.IlIlIIIllIIllIlllllI[((i + 0) * n6 + j + 0) * n5 + k + 0];
                    double n9 = this.IlIlIIIllIIllIlllllI[((i + 0) * n6 + j + 1) * n5 + k + 0];
                    double n10 = this.IlIlIIIllIIllIlllllI[((i + 1) * n6 + j + 0) * n5 + k + 0];
                    double n11 = this.IlIlIIIllIIllIlllllI[((i + 1) * n6 + j + 1) * n5 + k + 0];
                    final double n12 = (this.IlIlIIIllIIllIlllllI[((i + 0) * n6 + j + 0) * n5 + k + 1] - n8) * n7;
                    final double n13 = (this.IlIlIIIllIIllIlllllI[((i + 0) * n6 + j + 1) * n5 + k + 1] - n9) * n7;
                    final double n14 = (this.IlIlIIIllIIllIlllllI[((i + 1) * n6 + j + 0) * n5 + k + 1] - n10) * n7;
                    final double n15 = (this.IlIlIIIllIIllIlllllI[((i + 1) * n6 + j + 1) * n5 + k + 1] - n11) * n7;
                    for (int l = 0; l < 4; ++l) {
                        final double n16 = 0.125;
                        double n17 = n8;
                        double n18 = n9;
                        final double n19 = (n10 - n8) * n16;
                        final double n20 = (n11 - n9) * n16;
                        for (int n21 = 0; n21 < 8; ++n21) {
                            final double n22 = 0.125;
                            double n23 = n17;
                            final double n24 = (n18 - n17) * n22;
                            for (int n25 = 0; n25 < 8; ++n25) {
                                net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl lllIllIIIllllllIllll = null;
                                if (n23 > 0.0) {
                                    lllIllIIIllllllIllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.L.lllIllIIIllllllIllll();
                                }
                                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n21 + i * 8, l + k * 4, n25 + j * 8, lllIllIIIllllllIllll);
                                n23 += n24;
                            }
                            n17 += n19;
                            n18 += n20;
                        }
                        n8 += n12;
                        n9 += n13;
                        n10 += n14;
                        n11 += n15;
                    }
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final int n = 1;
                int n2 = -1;
                net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.L.lllIllIIIllllllIllll();
                net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.L.lllIllIIIllllllIllll();
                for (int k = 127; k >= 0; --k) {
                    final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i, k, j);
                    if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        n2 = -1;
                    }
                    else if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
                        if (n2 == -1) {
                            if (n <= 0) {
                                llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
                                llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.L.lllIllIIIllllllIllll();
                            }
                            n2 = n;
                            if (k >= 0) {
                                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i, k, j, llIIlIIIlIIIllIlIIIl);
                            }
                            else {
                                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i, k, j, llIIlIIIlIIIllIlIIIl2);
                            }
                        }
                        else if (n2 > 0) {
                            --n2;
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(i, k, j, llIIlIIIlIIIllIlIIIl2);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        this.lIIIIlIIIIIlllIllIII.setSeed(n * 341873128712L + n2 * 132897987541L);
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl();
        this.IIIIlllIIIIIIlIIIlll = this.lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(this.IIIIlllIIIIIIlIIIlll, n * 16, n2 * 16, 16, 16);
        this.llllIIIIlIIIlIlllIll(n, n2, illIIlllIIIIlllIIlIl);
        this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, illIIlllIIIIlllIIlIl, n, n2);
        final byte[] llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
        for (int i = 0; i < llIllIlIIIIllIlIIllI.length; ++i) {
            llIllIlIIIIllIlIIllI[i] = (byte)this.IIIIlllIIIIIIlIIIlll[i].lIIIIIlIlIIIlIIIIlIl;
        }
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
        return llllIIIIlIIIlIlllIll;
    }
    
    private double[] llllIIIIlIIIlIlllIll(double[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (array == null) {
            array = new double[n4 * n5 * n6];
        }
        final double n7 = 684.412;
        final double n8 = 684.412;
        this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, n, n3, n4, n6, 1.121, 1.121, 0.5);
        this.llllIIIlIlllIlIIIIIl = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, n, n3, n4, n6, 200.0, 200.0, 0.5);
        final double n9 = n7 * 2.0;
        this.llIllIIIIIllIlIIIIlI = this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6, n9 / 80.0, n8 / 160.0, n9 / 80.0);
        this.IlIIIlIlIIIllIlIlIIl = this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, n, n2, n3, n4, n5, n6, n9, n8, n9);
        this.IlIlIIIllIllIIIIIllI = this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, n, n2, n3, n4, n5, n6, n9, n8, n9);
        int n10 = 0;
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n6; ++j) {
                final float n11 = (i + n) / 1.0f;
                final float n12 = (j + n3) / 1.0f;
                float n13 = 100.0f - llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n11 * n11 + n12 * n12) * 8.0f;
                if (n13 > 80.0f) {
                    n13 = 80.0f;
                }
                if (n13 < -100.0f) {
                    n13 = -100.0f;
                }
                for (int k = 0; k < n5; ++k) {
                    final double n14 = this.IlIIIlIlIIIllIlIlIIl[n10] / 512.0;
                    final double n15 = this.IlIlIIIllIllIIIIIllI[n10] / 512.0;
                    final double n16 = (this.llIllIIIIIllIlIIIIlI[n10] / 10.0 + 1.0) / 2.0;
                    double n17;
                    if (n16 < 0.0) {
                        n17 = n14;
                    }
                    else if (n16 > 1.0) {
                        n17 = n15;
                    }
                    else {
                        n17 = n14 + (n15 - n14) * n16;
                    }
                    double n18 = n17 - 8.0 + n13;
                    final int n19 = 2;
                    if (k > n5 / 2 - n19) {
                        final double llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((k - (n5 / 2 - n19)) / 64.0f, 0.0, 1.0);
                        n18 = n18 * (1.0 - llllIIIIlIIIlIlllIll) + -3000.0 * llllIIIIlIIIlIlllIll;
                    }
                    final int n20 = 8;
                    if (k < n20) {
                        final double n21 = (n20 - k) / (n20 - 1.0f);
                        n18 = n18 * (1.0 - n21) + -30.0 * n21;
                    }
                    array[n10] = n18;
                    ++n10;
                }
            }
        }
        return array;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return true;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int n, final int n2) {
        IlIIlllllIIllIIlllll.IlllIIIIlIIIlIlIlIIl = true;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n * 16, 0, n2 * 16);
        this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(16, 0, 16)).llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, this.lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll, ilIlIlIlIlllllllllIl);
        IlIIlllllIIllIIlllll.IlllIIIIlIIIlIlIlIIl = false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
        return false;
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
    public List llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl);
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final String s, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return null;
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final int n2) {
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
    }
}
