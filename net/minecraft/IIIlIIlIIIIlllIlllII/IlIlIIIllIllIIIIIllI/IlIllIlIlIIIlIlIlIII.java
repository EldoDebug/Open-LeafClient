package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IlIllIlIlIIIlIlIlIII extends IlIlIIIllIIllIlllllI
{
    private float[] IlIIIlIlIIIllIlIlIIl;
    
    public IlIllIlIlIIIlIlIlIII() {
        this.IlIIIlIlIIIllIlIlIIl = new float[1024];
    }
    
    protected void llllIIIIlIIIlIlllIll(final long n, final int n2, final int n3, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, double n4, double n5, double n6, final float n7, float n8, float n9, int i, int n10, final double n11) {
        final Random random = new Random(n);
        final double n12 = n2 * 16 + 8;
        final double n13 = n3 * 16 + 8;
        float n14 = 0.0f;
        float n15 = 0.0f;
        if (n10 <= 0) {
            final int n16 = this.llllIIIIlIIIlIlllIll * 16 - 16;
            n10 = n16 - random.nextInt(n16 / 4);
        }
        boolean b = false;
        if (i == -1) {
            i = n10 / 2;
            b = true;
        }
        float n17 = 1.0f;
        for (int j = 0; j < 256; ++j) {
            if (j == 0 || random.nextInt(3) == 0) {
                n17 = 1.0f + random.nextFloat() * random.nextFloat() * 1.0f;
            }
            this.IlIIIlIlIIIllIlIlIIl[j] = n17 * n17;
        }
        while (i < n10) {
            final double n18 = 1.5 + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(i * 3.1415927f / n10) * n7 * 1.0f;
            final double n19 = n18 * n11;
            final double n20 = n18 * (random.nextFloat() * 0.25 + 0.75);
            final double n21 = n19 * (random.nextFloat() * 0.25 + 0.75);
            final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n9);
            final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n9);
            n4 += llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n8) * ilIlIlIlIlllllllllIl;
            n5 += llllIIIIlIIIlIlllIll;
            n6 += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n8) * ilIlIlIlIlllllllllIl;
            n9 *= 0.7f;
            n9 += n15 * 0.05f;
            n8 += n14 * 0.05f;
            final float n22 = n15 * 0.8f;
            final float n23 = n14 * 0.5f;
            n15 = n22 + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            n14 = n23 + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (b || random.nextInt(4) != 0) {
                final double n24 = n4 - n12;
                final double n25 = n6 - n13;
                final double n26 = n10 - i;
                final double n27 = n7 + 2.0f + 16.0f;
                if (n24 * n24 + n25 * n25 - n26 * n26 > n27 * n27) {
                    return;
                }
                if (n4 >= n12 - 16.0 - n20 * 2.0 && n6 >= n13 - 16.0 - n20 * 2.0 && n4 <= n12 + 16.0 + n20 * 2.0 && n6 <= n13 + 16.0 + n20 * 2.0) {
                    int n28 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n4 - n20) - n2 * 16 - 1;
                    int n29 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n4 + n20) - n2 * 16 + 1;
                    int n30 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n5 - n21) - 1;
                    int n31 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n5 + n21) + 1;
                    int n32 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n6 - n20) - n3 * 16 - 1;
                    int n33 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n6 + n20) - n3 * 16 + 1;
                    if (n28 < 0) {
                        n28 = 0;
                    }
                    if (n29 > 16) {
                        n29 = 16;
                    }
                    if (n30 < 1) {
                        n30 = 1;
                    }
                    if (n31 > 248) {
                        n31 = 248;
                    }
                    if (n32 < 0) {
                        n32 = 0;
                    }
                    if (n33 > 16) {
                        n33 = 16;
                    }
                    boolean b2 = false;
                    for (int n34 = n28; !b2 && n34 < n29; ++n34) {
                        for (int n35 = n32; !b2 && n35 < n33; ++n35) {
                            for (int n36 = n31 + 1; !b2 && n36 >= n30 - 1; --n36) {
                                if (n36 >= 0 && n36 < 256) {
                                    final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n34, n36, n35);
                                    if (llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII || llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl) {
                                        b2 = true;
                                    }
                                    if (n36 != n30 - 1 && n34 != n28 && n34 != n29 - 1 && n35 != n32 && n35 != n33 - 1) {
                                        n36 = n30;
                                    }
                                }
                            }
                        }
                    }
                    if (!b2) {
                        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
                        for (int k = n28; k < n29; ++k) {
                            final double n37 = (k + n2 * 16 + 0.5 - n4) / n20;
                            for (int l = n32; l < n33; ++l) {
                                final double n38 = (l + n3 * 16 + 0.5 - n6) / n20;
                                boolean b3 = false;
                                if (n37 * n37 + n38 * n38 < 1.0) {
                                    for (int n39 = n31; n39 > n30; --n39) {
                                        final double n40 = (n39 - 1 + 0.5 - n5) / n21;
                                        if ((n37 * n37 + n38 * n38) * this.IlIIIlIlIIIllIlIlIIl[n39 - 1] + n40 * n40 / 6.0 < 1.0) {
                                            final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll3 = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(k, n39, l);
                                            if (llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                                                b3 = true;
                                            }
                                            if (llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl || llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                                                if (n39 - 1 < 10) {
                                                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(k, n39, l, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.lllIllIIIllllllIllll());
                                                }
                                                else {
                                                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(k, n39, l, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
                                                    if (b3 && illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(k, n39 - 1, l).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) {
                                                        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(k + n2 * 16, 0, l + n3 * 16);
                                                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(k, n39 - 1, l, this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl).IIlllIIlllIIIlIlllII);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (b) {
                            break;
                        }
                    }
                }
            }
            ++i;
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final int n3, final int n4, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        if (this.IlIlIlIlIlllllllllIl.nextInt(50) == 0) {
            final double n5 = n * 16 + this.IlIlIlIlIlllllllllIl.nextInt(16);
            final double n6 = this.IlIlIlIlIlllllllllIl.nextInt(this.IlIlIlIlIlllllllllIl.nextInt(40) + 8) + 20;
            final double n7 = n2 * 16 + this.IlIlIlIlIlllllllllIl.nextInt(16);
            for (int n8 = 1, i = 0; i < n8; ++i) {
                this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.nextLong(), n3, n4, illIIlllIIIIlllIIlIl, n5, n6, n7, (this.IlIlIlIlIlllllllllIl.nextFloat() * 2.0f + this.IlIlIlIlIlllllllllIl.nextFloat()) * 2.0f, this.IlIlIlIlIlllllllllIl.nextFloat() * 3.1415927f * 2.0f, (this.IlIlIlIlIlllllllllIl.nextFloat() - 0.5f) * 2.0f / 8.0f, 0, 0, 3.0);
            }
        }
    }
}
