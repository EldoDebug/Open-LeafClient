package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llIIlllIIlllIIllIllI extends llllIIIIlIIIlIlllIll
{
    private static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private static final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(k.IIllllIIIlIIIIIIllIl, aa.IlIlIIIllIllIIIIIllI);
        IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII, aa.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
    }
    
    public llIIlllIIlllIIllIllI(final boolean b) {
        super(b);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = random.nextInt(3) + random.nextInt(3) + 5;
        boolean b = true;
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 1 || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n + 1 > 256) {
            return false;
        }
        for (int i = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); i <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 + n; ++i) {
            int n2 = 1;
            if (i == ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) {
                n2 = 0;
            }
            if (i >= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 + n - 2) {
                n2 = 2;
            }
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
            for (int n3 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n2; n3 <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n2 && b; ++n3) {
                for (int n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n2; n4 <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n2 && b; ++n4) {
                    if (i >= 0 && i < 256) {
                        if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n3, i, n4)).llIllIIIIIllIlIIIIlI())) {
                            b = false;
                        }
                    }
                    else {
                        b = false;
                    }
                }
            }
        }
        if (!b) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
        if ((llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256 - n - 1) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll llllIIIIlIIIlIlllIll = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(random);
            final int n5 = n - random.nextInt(4) - 1;
            int n6 = 3 - random.nextInt(3);
            int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
            int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
            int n7 = 0;
            for (int j = 0; j < n; ++j) {
                final int n8 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + j;
                if (j >= n5 && n6 > 0) {
                    liiiIlIIIIIlllIllIII += llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
                    llIIlIIIlIIIllIlIIIl += llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
                    --n6;
                }
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, n8, llIIlIIIlIIIllIlIIIl);
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
                if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                    this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2);
                    n7 = n8;
                }
            }
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, n7, llIIlIIIlIIIllIlIIIl);
            for (int k = -3; k <= 3; ++k) {
                for (int l = -3; l <= 3; ++l) {
                    if (Math.abs(k) != 3 || Math.abs(l) != 3) {
                        this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(k, 0, l));
                    }
                }
            }
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll();
            for (int n9 = -1; n9 <= 1; ++n9) {
                for (int n10 = -1; n10 <= 1; ++n10) {
                    this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(n9, 0, n10));
                }
            }
            this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl(2));
            this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(2));
            this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl(2));
            this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(2));
            int liiiIlIIIIIlllIllIII2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
            int llIIlIIIlIIIllIlIIIl2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
            final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll llllIIIIlIIIlIlllIll3 = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(random);
            if (llllIIIIlIIIlIlllIll3 != llllIIIIlIIIlIlllIll) {
                final int n11 = n5 - random.nextInt(2) - 1;
                int n12 = 1 + random.nextInt(3);
                int n13 = 0;
                for (int n14 = n11; n14 < n && n12 > 0; ++n14, --n12) {
                    if (n14 >= 1) {
                        final int n15 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n14;
                        liiiIlIIIIIlllIllIII2 += llllIIIIlIIIlIlllIll3.lIIIIlIIIIIlllIllIII();
                        llIIlIIIlIIIllIlIIIl2 += llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl();
                        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4 = new IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2, n15, llIIlIIIlIIIllIlIIIl2);
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl4).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
                        if (illIIlllIIIIlllIIlIl2 == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || illIIlllIIIIlllIIlIl2 == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                            this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl4);
                            n13 = n15;
                        }
                    }
                }
                if (n13 > 0) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl5 = new IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2, n13, llIIlIIIlIIIllIlIIIl2);
                    for (int n16 = -2; n16 <= 2; ++n16) {
                        for (int n17 = -2; n17 <= 2; ++n17) {
                            if (Math.abs(n16) != 2 || Math.abs(n17) != 2) {
                                this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(n16, 0, n17));
                            }
                        }
                    }
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll();
                    for (int n18 = -1; n18 <= 1; ++n18) {
                        for (int n19 = -1; n19 <= 1; ++n19) {
                            this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(n18, 0, n19));
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll);
    }
    
    private void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
        if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl);
        }
    }
}
