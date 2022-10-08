package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIlIIIllIllIIIIIllI implements lIIIIlIIIIIlllIllIII
{
    private final IlllllllIIIlIIIlIlII lIIIIlIIIIIlllIllIII;
    private final boolean lIIIlllIIIllIIIllIII;
    private final Random llIIlIIIlIIIllIlIIIl;
    private double[] llIllIlIIIIllIlIIllI;
    private double[] lIlIlIIIllIIllIIIllI;
    private double[] IlIlIIIllIIllIlllllI;
    private double[] IIIIlllIIIIIIlIIIlll;
    private final IlIlIIIIIIlllIlIllIl llllIIllllIlIlIIIIll;
    private final IlIlIIIIIIlllIlIllIl IlIllIlIlIIIlIlIlIII;
    private final IlIlIIIIIIlllIlIllIl IIlllIIlIllIllIlIIll;
    private final IlIlIIIIIIlllIlIllIl lllIIIIlllllIlIIllIl;
    private final IlIlIIIIIIlllIlIllIl IlIlIIIIIIlllIlIllIl;
    public final IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll;
    public final IlIlIIIIIIlllIlIllIl IlIlIlIlIlllllllllIl;
    private final IlIlIIIllIIllIlllllI IIllIIllIIIlIlIIIIlI;
    private final IlIllIlIlIIIlIlIlIII IIIlIIIlIlIIlllIIlll;
    private final IIlllIIlIllIllIlIIll IlIlIIIlIIlIlIIlllIl;
    private final lllIllIIIllllllIllll IlllllllIIIlIIIlIlII;
    private final lllIIIIlllllIlIIllIl IIlIIIIlllIlllllIlII;
    private final lllIIIIlllllIlIIllIl IIIlIIlIIIIlllIlllII;
    private final lIlIlIIIllIIllIIIllI IlIlIllllllllIIIIlII;
    private final lIlIlIIIllIIllIIIllI IIlllIlIIllIlIlIlIIl;
    private final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII llIIIlIlIllIIlIlIlII;
    private final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI lllllIlIIIlIlIIlllII;
    double[] llIllIIIIIllIlIIIIlI;
    double[] IlIIIlIlIIIllIlIlIIl;
    double[] IlIlIIIllIllIIIIIllI;
    double[] IllIIlllIIIIlllIIlIl;
    double[] llllIIIlIlllIlIIIIIl;
    
    public IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII liiiIlIIIIIlllIllIII, final boolean liiIlllIIIllIIIllIII, final long n) {
        this.llIllIlIIIIllIlIIllI = new double[256];
        this.lIlIlIIIllIIllIIIllI = new double[256];
        this.IlIlIIIllIIllIlllllI = new double[256];
        this.IIllIIllIIIlIlIIIIlI = new IlIlIIIllIIllIlllllI();
        this.IIIlIIIlIlIIlllIIlll = new IlIllIlIlIIIlIlIlIII();
        this.IlIlIIIlIIlIlIIlllIl = new IIlllIIlIllIllIlIIll();
        this.IlllllllIIIlIIIlIlII = new IIlllIlIIllIlIlIlIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.as.lllIllIIIllllllIllll(), 14, (Predicate)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI));
        this.IIlIIIIlllIlllllIlII = new lllIIIIlllllIlIIllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI, true);
        this.IIIlIIlIIIIlllIlllII = new lllIIIIlllllIlIIllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI, false);
        this.IlIlIllllllllIIIIlII = new lIlIlIIIllIIllIIIllI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII);
        this.IIlllIlIIllIlIlIlIIl = new lIlIlIIIllIIllIIIllI(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl);
        this.llIIIlIlIllIIlIlIlII = new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII();
        this.lllllIlIIIlIlIIlllII = new llllIIllllIlIlIIIIll();
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = new Random(n);
        this.llllIIllllIlIlIIIIll = new IlIlIIIIIIlllIlIllIl(this.llIIlIIIlIIIllIlIIIl, 16);
        this.IlIllIlIlIIIlIlIlIII = new IlIlIIIIIIlllIlIllIl(this.llIIlIIIlIIIllIlIIIl, 16);
        this.IIlllIIlIllIllIlIIll = new IlIlIIIIIIlllIlIllIl(this.llIIlIIIlIIIllIlIIIl, 8);
        this.lllIIIIlllllIlIIllIl = new IlIlIIIIIIlllIlIllIl(this.llIIlIIIlIIIllIlIIIl, 4);
        this.IlIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl(this.llIIlIIIlIIIllIlIIIl, 4);
        this.llllIIIIlIIIlIlllIll = new IlIlIIIIIIlllIlIllIl(this.llIIlIIIlIIIllIlIIIl, 10);
        this.IlIlIlIlIlllllllllIl = new IlIlIIIIIIlllIlIllIl(this.llIIlIIIlIIIllIlIIIl, 16);
        liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(63);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final int n3 = 4;
        final int n4 = this.lIIIIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl() / 2 + 1;
        final int n5 = n3 + 1;
        final int n6 = 17;
        final int n7 = n3 + 1;
        this.IIIIlllIIIIIIlIIIlll = this.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll, n * n3, 0, n2 * n3, n5, n6, n7);
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                for (int k = 0; k < 16; ++k) {
                    final double n8 = 0.125;
                    double n9 = this.IIIIlllIIIIIIlIIIlll[((i + 0) * n7 + j + 0) * n6 + k + 0];
                    double n10 = this.IIIIlllIIIIIIlIIIlll[((i + 0) * n7 + j + 1) * n6 + k + 0];
                    double n11 = this.IIIIlllIIIIIIlIIIlll[((i + 1) * n7 + j + 0) * n6 + k + 0];
                    double n12 = this.IIIIlllIIIIIIlIIIlll[((i + 1) * n7 + j + 1) * n6 + k + 0];
                    final double n13 = (this.IIIIlllIIIIIIlIIIlll[((i + 0) * n7 + j + 0) * n6 + k + 1] - n9) * n8;
                    final double n14 = (this.IIIIlllIIIIIIlIIIlll[((i + 0) * n7 + j + 1) * n6 + k + 1] - n10) * n8;
                    final double n15 = (this.IIIIlllIIIIIIlIIIlll[((i + 1) * n7 + j + 0) * n6 + k + 1] - n11) * n8;
                    final double n16 = (this.IIIIlllIIIIIIlIIIlll[((i + 1) * n7 + j + 1) * n6 + k + 1] - n12) * n8;
                    for (int l = 0; l < 8; ++l) {
                        final double n17 = 0.25;
                        double n18 = n9;
                        double n19 = n10;
                        final double n20 = (n11 - n9) * n17;
                        final double n21 = (n12 - n10) * n17;
                        for (int n22 = 0; n22 < 4; ++n22) {
                            final double n23 = 0.25;
                            double n24 = n18;
                            final double n25 = (n19 - n18) * n23;
                            for (int n26 = 0; n26 < 4; ++n26) {
                                llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = null;
                                if (k * 8 + l < n4) {
                                    llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.lllIllIIIllllllIllll();
                                }
                                if (n24 > 0.0) {
                                    llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI.lllIllIIIllllllIllll();
                                }
                                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n22 + i * 4, l + k * 8, n26 + j * 4, llIIlIIIlIIIllIlIIIl);
                                n24 += n25;
                            }
                            n18 += n20;
                            n19 += n21;
                        }
                        n9 += n13;
                        n10 += n14;
                        n11 += n15;
                        n12 += n16;
                    }
                }
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final int n3 = this.lIIIIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl() + 1;
        final double n4 = 0.03125;
        this.llIllIlIIIIllIlIIllI = this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, n * 16, n2 * 16, 0, 16, 16, 1, n4, n4, 1.0);
        this.lIlIlIIIllIIllIIIllI = this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, n * 16, 109, n2 * 16, 16, 1, 16, n4, 1.0, n4);
        this.IlIlIIIllIIllIlllllI = this.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, n * 16, n2 * 16, 0, 16, 16, 1, n4 * 2.0, n4 * 2.0, n4 * 2.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                final boolean b = this.llIllIlIIIIllIlIIllI[i + j * 16] + this.llIIlIIIlIIIllIlIIIl.nextDouble() * 0.2 > 0.0;
                final boolean b2 = this.lIlIlIIIllIIllIIIllI[i + j * 16] + this.llIIlIIIlIIIllIlIIIl.nextDouble() * 0.2 > 0.0;
                final int n5 = (int)(this.IlIlIIIllIIllIlllllI[i + j * 16] / 3.0 + 3.0 + this.llIIlIIIlIIIllIlIIIl.nextDouble() * 0.25);
                int n6 = -1;
                llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI.lllIllIIIllllllIllll();
                llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI.lllIllIIIllllllIllll();
                for (int k = 127; k >= 0; --k) {
                    if (k < 127 - this.llIIlIIIlIIIllIlIIIl.nextInt(5) && k > this.llIIlIIIlIIIllIlIIIl.nextInt(5)) {
                        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, k, i);
                        if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() != null && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                            if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI) {
                                if (n6 == -1) {
                                    if (n5 <= 0) {
                                        llIIlIIIlIIIllIlIIIl = null;
                                        llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI.lllIllIIIllllllIllll();
                                    }
                                    else if (k >= n3 - 4 && k <= n3 + 1) {
                                        llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI.lllIllIIIllllllIllll();
                                        llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI.lllIllIIIllllllIllll();
                                        if (b2) {
                                            llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.lllIllIIIllllllIllll();
                                            llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI.lllIllIIIllllllIllll();
                                        }
                                        if (b) {
                                            llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a.lllIllIIIllllllIllll();
                                            llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a.lllIllIIIllllllIllll();
                                        }
                                    }
                                    if (k < n3 && (llIIlIIIlIIIllIlIIIl == null || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)) {
                                        llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.lllIllIIIllllllIllll();
                                    }
                                    n6 = n5;
                                    if (k >= n3 - 1) {
                                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, k, i, llIIlIIIlIIIllIlIIIl);
                                    }
                                    else {
                                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, k, i, llIIlIIIlIIIllIlIIIl2);
                                    }
                                }
                                else if (n6 > 0) {
                                    --n6;
                                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, k, i, llIIlIIIlIIIllIlIIIl2);
                                }
                            }
                        }
                        else {
                            n6 = -1;
                        }
                    }
                    else {
                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, k, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
                    }
                }
            }
        }
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int n, final int n2) {
        this.llIIlIIIlIIIllIlIIIl.setSeed(n * 341873128712L + n2 * 132897987541L);
        final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl();
        this.llllIIIIlIIIlIlllIll(n, n2, illIIlllIIIIlllIIlIl);
        this.IlIlIlIlIlllllllllIl(n, n2, illIIlllIIIIlllIIlIl);
        this.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(this, this.lIIIIlIIIIIlllIllIII, n, n2, illIIlllIIIIlllIIlIl);
        if (this.lIIIlllIIIllIIIllIII) {
            this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(this, this.lIIIIlIIIIIlllIllIII, n, n2, illIIlllIIIIlllIIlIl);
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, illIIlllIIIIlllIIlIl, n, n2);
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] ilIlIlIlIlllllllllIl = this.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl().IlIlIlIlIlllllllllIl(null, n * 16, n2 * 16, 16, 16);
        final byte[] llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI();
        for (int i = 0; i < llIllIlIIIIllIlIIllI.length; ++i) {
            llIllIlIIIIllIlIIllI[i] = (byte)ilIlIlIlIlllllllllIl[i].lIIIIIlIlIIIlIIIIlIl;
        }
        llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI();
        return llllIIIIlIIIlIlllIll;
    }
    
    private double[] llllIIIIlIIIlIlllIll(double[] array, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        if (array == null) {
            array = new double[n4 * n5 * n6];
        }
        final double n7 = 684.412;
        final double n8 = 2053.236;
        this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, n, n2, n3, n4, 1, n6, 1.0, 0.0, 1.0);
        this.llllIIIlIlllIlIIIIIl = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, n, n2, n3, n4, 1, n6, 100.0, 0.0, 100.0);
        this.llIllIIIIIllIlIIIIlI = this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6, n7 / 80.0, n8 / 60.0, n7 / 80.0);
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, n, n2, n3, n4, n5, n6, n7, n8, n7);
        this.IlIlIIIllIllIIIIIllI = this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, n, n2, n3, n4, n5, n6, n7, n8, n7);
        int n9 = 0;
        final double[] array2 = new double[n5];
        for (int i = 0; i < n5; ++i) {
            array2[i] = Math.cos(i * 3.141592653589793 * 6.0 / n5) * 2.0;
            double n10 = i;
            if (i > n5 / 2) {
                n10 = n5 - 1 - i;
            }
            if (n10 < 4.0) {
                final double n11 = 4.0 - n10;
                final double[] array3 = array2;
                final int n12 = i;
                array3[n12] -= n11 * n11 * n11 * 10.0;
            }
        }
        for (int j = 0; j < n4; ++j) {
            for (int k = 0; k < n6; ++k) {
                final double n13 = 0.0;
                for (int l = 0; l < n5; ++l) {
                    final double n14 = array2[l];
                    final double n15 = this.IlIIIlIlIIIllIlIlIIl[n9] / 512.0;
                    final double n16 = this.IlIlIIIllIllIIIIIllI[n9] / 512.0;
                    final double n17 = (this.llIllIIIIIllIlIIIIlI[n9] / 10.0 + 1.0) / 2.0;
                    double n18;
                    if (n17 < 0.0) {
                        n18 = n15;
                    }
                    else if (n17 > 1.0) {
                        n18 = n16;
                    }
                    else {
                        n18 = n15 + (n16 - n15) * n17;
                    }
                    double n19 = n18 - n14;
                    if (l > n5 - 4) {
                        final double n20 = (l - (n5 - 4)) / 3.0f;
                        n19 = n19 * (1.0 - n20) + -10.0 * n20;
                    }
                    if (l < n13) {
                        final double llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((n13 - l) / 4.0, 0.0, 1.0);
                        n19 = n19 * (1.0 - llllIIIIlIIIlIlllIll) + -10.0 * llllIIIIlIIIlIlllIll;
                    }
                    array[n9] = n19;
                    ++n9;
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
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(n, n2));
        for (int i = 0; i < 8; ++i) {
            this.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8, this.llIIlIIIlIIIllIlIIIl.nextInt(120) + 4, this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8));
        }
        for (int j = 0; j < this.llIIlIIIlIIIllIlIIIl.nextInt(this.llIIlIIIlIIIllIlIIIl.nextInt(10) + 1) + 1; ++j) {
            this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8, this.llIIlIIIlIIIllIlIIIl.nextInt(120) + 4, this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8));
        }
        for (int k = 0; k < this.llIIlIIIlIIIllIlIIIl.nextInt(this.llIIlIIIlIIIllIlIIIl.nextInt(10) + 1); ++k) {
            this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8, this.llIIlIIIlIIIllIlIIIl.nextInt(120) + 4, this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8));
        }
        for (int l = 0; l < 10; ++l) {
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8, this.llIIlIIIlIIIllIlIIIl.nextInt(128), this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8));
        }
        if (this.llIIlIIIlIIIllIlIIIl.nextBoolean()) {
            this.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8, this.llIIlIIIlIIIllIlIIIl.nextInt(128), this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8));
        }
        if (this.llIIlIIIlIIIllIlIIIl.nextBoolean()) {
            this.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8, this.llIIlIIIlIIIllIlIIIl.nextInt(128), this.llIIlIIIlIIIllIlIIIl.nextInt(16) + 8));
        }
        for (int n3 = 0; n3 < 16; ++n3) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.nextInt(16), this.llIIlIIIlIIIllIlIIIl.nextInt(108) + 10, this.llIIlIIIlIIIllIlIIIl.nextInt(16)));
        }
        for (int n4 = 0; n4 < 16; ++n4) {
            this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, this.llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl.nextInt(16), this.llIIlIIIlIIIllIlIIIl.nextInt(108) + 10, this.llIIlIIIlIIIllIlIIIl.nextInt(16)));
        }
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
        return "HellRandomLevelSource";
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (illlIlIIllIlIlIlIIl == net.minecraft.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            if (this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl)) {
                return this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
            }
            if (this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII, ilIlIlIlIlllllllllIl) && this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C) {
                return this.llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl();
            }
        }
        return this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(illlIlIIllIlIlIlIIl);
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
        this.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(this, this.lIIIIlIIIIIlllIllIII, n, n2, null);
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4);
    }
}
