package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IIIIlllIIIIIIlIIIlll extends IlIlIIIllIIllIlllllI
{
    protected void llllIIIIlIIIlIlllIll(final long n, final int n2, final int n3, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final double n4, final double n5, final double n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, illIIlllIIIIlllIIlIl, n4, n5, n6, 1.0f + this.IlIlIlIlIlllllllllIl.nextFloat() * 6.0f, 0.0f, 0.0f, -1, -1, 0.5);
    }
    
    protected void llllIIIIlIIIlIlllIll(final long n, final int n2, final int n3, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, double n4, double n5, double n6, final float n7, float n8, float n9, int i, int n10, final double n11) {
        final double n12 = n2 * 16 + 8;
        final double n13 = n3 * 16 + 8;
        float n14 = 0.0f;
        float n15 = 0.0f;
        final Random random = new Random(n);
        if (n10 <= 0) {
            final int n16 = this.llllIIIIlIIIlIlllIll * 16 - 16;
            n10 = n16 - random.nextInt(n16 / 4);
        }
        boolean b = false;
        if (i == -1) {
            i = n10 / 2;
            b = true;
        }
        final int n17 = random.nextInt(n10 / 2) + n10 / 4;
        final boolean b2 = random.nextInt(6) == 0;
        while (i < n10) {
            final double n18 = 1.5 + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(i * 3.1415927f / n10) * n7 * 1.0f;
            final double n19 = n18 * n11;
            final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n9);
            final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n9);
            n4 += llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n8) * ilIlIlIlIlllllllllIl;
            n5 += llllIIIIlIIIlIlllIll;
            n6 += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n8) * ilIlIlIlIlllllllllIl;
            if (b2) {
                n9 *= 0.92f;
            }
            else {
                n9 *= 0.7f;
            }
            n9 += n15 * 0.1f;
            n8 += n14 * 0.1f;
            final float n20 = n15 * 0.9f;
            final float n21 = n14 * 0.75f;
            n15 = n20 + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 2.0f;
            n14 = n21 + (random.nextFloat() - random.nextFloat()) * random.nextFloat() * 4.0f;
            if (!b && i == n17 && n7 > 1.0f && n10 > 0) {
                this.llllIIIIlIIIlIlllIll(random.nextLong(), n2, n3, illIIlllIIIIlllIIlIl, n4, n5, n6, random.nextFloat() * 0.5f + 0.5f, n8 - 1.5707964f, n9 / 3.0f, i, n10, 1.0);
                this.llllIIIIlIIIlIlllIll(random.nextLong(), n2, n3, illIIlllIIIIlllIIlIl, n4, n5, n6, random.nextFloat() * 0.5f + 0.5f, n8 + 1.5707964f, n9 / 3.0f, i, n10, 1.0);
                return;
            }
            if (b || random.nextInt(4) != 0) {
                final double n22 = n4 - n12;
                final double n23 = n6 - n13;
                final double n24 = n10 - i;
                final double n25 = n7 + 2.0f + 16.0f;
                if (n22 * n22 + n23 * n23 - n24 * n24 > n25 * n25) {
                    return;
                }
                if (n4 >= n12 - 16.0 - n18 * 2.0 && n6 >= n13 - 16.0 - n18 * 2.0 && n4 <= n12 + 16.0 + n18 * 2.0 && n6 <= n13 + 16.0 + n18 * 2.0) {
                    int n26 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n4 - n18) - n2 * 16 - 1;
                    int n27 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n4 + n18) - n2 * 16 + 1;
                    int n28 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n5 - n19) - 1;
                    int n29 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n5 + n19) + 1;
                    int n30 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n6 - n18) - n3 * 16 - 1;
                    int n31 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n6 + n18) - n3 * 16 + 1;
                    if (n26 < 0) {
                        n26 = 0;
                    }
                    if (n27 > 16) {
                        n27 = 16;
                    }
                    if (n28 < 1) {
                        n28 = 1;
                    }
                    if (n29 > 248) {
                        n29 = 248;
                    }
                    if (n30 < 0) {
                        n30 = 0;
                    }
                    if (n31 > 16) {
                        n31 = 16;
                    }
                    boolean b3 = false;
                    for (int n32 = n26; !b3 && n32 < n27; ++n32) {
                        for (int n33 = n30; !b3 && n33 < n31; ++n33) {
                            for (int n34 = n29 + 1; !b3 && n34 >= n28 - 1; --n34) {
                                if (n34 >= 0 && n34 < 256) {
                                    final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n32, n34, n33);
                                    if (llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII || llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl) {
                                        b3 = true;
                                    }
                                    if (n34 != n28 - 1 && n32 != n26 && n32 != n27 - 1 && n33 != n30 && n33 != n31 - 1) {
                                        n34 = n28;
                                    }
                                }
                            }
                        }
                    }
                    if (!b3) {
                        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
                        for (int j = n26; j < n27; ++j) {
                            final double n35 = (j + n2 * 16 + 0.5 - n4) / n18;
                            for (int k = n30; k < n31; ++k) {
                                final double n36 = (k + n3 * 16 + 0.5 - n6) / n18;
                                boolean b4 = false;
                                if (n35 * n35 + n36 * n36 < 1.0) {
                                    for (int l = n29; l > n28; --l) {
                                        final double n37 = (l - 1 + 0.5 - n5) / n19;
                                        if (n37 > -0.7 && n35 * n35 + n37 * n37 + n36 * n36 < 1.0) {
                                            final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll3 = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, l, k);
                                            final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)Objects.firstNonNull((Object)illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, l + 1, k), (Object)net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
                                            if (llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A) {
                                                b4 = true;
                                            }
                                            if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llIIlIIIlIIIllIlIIIl)) {
                                                if (l - 1 < 10) {
                                                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, l, k, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.lllIllIIIllllllIllll());
                                                }
                                                else {
                                                    illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, l, k, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
                                                    if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI) {
                                                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, l + 1, k, (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(bl.IIIIIIIIIlllIllIlIlI) == bm.IlIlIlIlIlllllllllIl) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ.lllIllIIIllllllIllll() : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll());
                                                    }
                                                    if (b4 && illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, l - 1, k).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) {
                                                        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(j + n2 * 16, 0, k + n3 * 16);
                                                        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(j, l - 1, k, this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llllIIIlIlllIlIIIIIl).IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI().lllIllIIIllllllIllll());
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
    
    protected boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        return llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aD || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI || ((llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll) && llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final int n3, final int n4, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        int nextInt = this.IlIlIlIlIlllllllllIl.nextInt(this.IlIlIlIlIlllllllllIl.nextInt(this.IlIlIlIlIlllllllllIl.nextInt(15) + 1) + 1);
        if (this.IlIlIlIlIlllllllllIl.nextInt(7) != 0) {
            nextInt = 0;
        }
        for (int i = 0; i < nextInt; ++i) {
            final double n5 = n * 16 + this.IlIlIlIlIlllllllllIl.nextInt(16);
            final double n6 = this.IlIlIlIlIlllllllllIl.nextInt(this.IlIlIlIlIlllllllllIl.nextInt(120) + 8);
            final double n7 = n2 * 16 + this.IlIlIlIlIlllllllllIl.nextInt(16);
            int n8 = 1;
            if (this.IlIlIlIlIlllllllllIl.nextInt(4) == 0) {
                this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.nextLong(), n3, n4, illIIlllIIIIlllIIlIl, n5, n6, n7);
                n8 += this.IlIlIlIlIlllllllllIl.nextInt(4);
            }
            for (int j = 0; j < n8; ++j) {
                final float n9 = this.IlIlIlIlIlllllllllIl.nextFloat() * 3.1415927f * 2.0f;
                final float n10 = (this.IlIlIlIlIlllllllllIl.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float n11 = this.IlIlIlIlIlllllllllIl.nextFloat() * 2.0f + this.IlIlIlIlIlllllllllIl.nextFloat();
                if (this.IlIlIlIlIlllllllllIl.nextInt(10) == 0) {
                    n11 *= this.IlIlIlIlIlllllllllIl.nextFloat() * this.IlIlIlIlIlllllllllIl.nextFloat() * 3.0f + 1.0f;
                }
                this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.nextLong(), n3, n4, illIIlllIIIIlllIIlIl, n5, n6, n7, n11, n9, n10, 0, 0, 1.0);
            }
        }
    }
}
