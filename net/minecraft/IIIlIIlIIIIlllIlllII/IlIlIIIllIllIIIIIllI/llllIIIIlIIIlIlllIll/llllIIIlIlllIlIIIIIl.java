package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIlIlllIlIIIIIl extends llllIIIIlIIIlIlllIll
{
    private static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private static final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(k.IIllllIIIlIIIIIIllIl, aa.IllIIlllIIIIlllIIlIl);
        IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII, aa.IllIIlllIIIIlllIIlIl).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
    }
    
    public llllIIIlIlllIlIIIIIl(final boolean b) {
        super(b);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = random.nextInt(3) + random.nextInt(2) + 6;
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        if (liiIlllIIIllIIIllIII < 1 || liiIlllIIIllIIIllIII + n + 1 >= 256) {
            return false;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) {
            return false;
        }
        if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, n)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2.IllIIlllIIIIlllIIlIl());
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2.IlIIIlIlIIIllIlIlIIl());
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2.IlIIIlIlIIIllIlIlIIl().IllIIlllIIIIlllIIlIl());
        final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll llllIIIIlIIIlIlllIll = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(random);
        final int n2 = n - random.nextInt(4);
        int n3 = 2 - random.nextInt(3);
        int n4 = liiiIlIIIIIlllIllIII;
        int n5 = llIIlIIIlIIIllIlIIIl;
        final int n6 = liiIlllIIIllIIIllIII + n - 1;
        for (int i = 0; i < n; ++i) {
            if (i >= n2 && n3 > 0) {
                n4 += llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
                n5 += llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
                --n3;
            }
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new IlIlIlIlIlllllllllIl(n4, liiIlllIIIllIIIllIII + i, n5);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
            if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl3);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl());
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl3.IlIIIlIlIIIllIlIlIIl());
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl());
            }
        }
        for (int j = -2; j <= 0; ++j) {
            for (int k = -2; k <= 0; ++k) {
                final int n7 = -1;
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + j, n6 + n7, n5 + k);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1 + n4 - j, n6 + n7, n5 + k);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + j, n6 + n7, 1 + n5 - k);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1 + n4 - j, n6 + n7, 1 + n5 - k);
                if ((j > -2 || k > -1) && (j != -1 || k != -2)) {
                    final int n8 = 1;
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + j, n6 + n8, n5 + k);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1 + n4 - j, n6 + n8, n5 + k);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + j, n6 + n8, 1 + n5 - k);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1 + n4 - j, n6 + n8, 1 + n5 - k);
                }
            }
        }
        if (random.nextBoolean()) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4, n6 + 2, n5);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + 1, n6 + 2, n5);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + 1, n6 + 2, n5 + 1);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4, n6 + 2, n5 + 1);
        }
        for (int l = -3; l <= 4; ++l) {
            for (int n9 = -3; n9 <= 4; ++n9) {
                if ((l != -3 || n9 != -3) && (l != -3 || n9 != 4) && (l != 4 || n9 != -3) && (l != 4 || n9 != 4) && (Math.abs(l) < 3 || Math.abs(n9) < 3)) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + l, n6, n5 + n9);
                }
            }
        }
        for (int n10 = -1; n10 <= 2; ++n10) {
            for (int n11 = -1; n11 <= 2; ++n11) {
                if ((n10 < 0 || n10 > 1 || n11 < 0 || n11 > 1) && random.nextInt(3) <= 0) {
                    for (int n12 = random.nextInt(3) + 2, n13 = 0; n13 < n12; ++n13) {
                        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII + n10, n6 - n13 - 1, llIIlIIIlIIIllIlIIIl + n11));
                    }
                    for (int n14 = -1; n14 <= 1; ++n14) {
                        for (int n15 = -1; n15 <= 1; ++n15) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + n10 + n14, n6, n5 + n11 + n15);
                        }
                    }
                    for (int n16 = -2; n16 <= 2; ++n16) {
                        for (int n17 = -2; n17 <= 2; ++n17) {
                            if (Math.abs(n16) != 2 || Math.abs(n17) != 2) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + n10 + n16, n6 - 1, n5 + n11 + n17);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
        for (int i = 0; i <= n + 1; ++i) {
            int n2 = 1;
            if (i == 0) {
                n2 = 0;
            }
            if (i >= n - 1) {
                n2 = 2;
            }
            for (int j = -n2; j <= n2; ++j) {
                for (int k = -n2; k <= n2; ++k) {
                    if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII + j, liiIlllIIIllIIIllIII + i, llIIlIIIlIIIllIlIIIl + k)).llIllIIIIIllIlIIIIlI())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI())) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final int n3) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n, n2, n3);
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
        }
    }
}
