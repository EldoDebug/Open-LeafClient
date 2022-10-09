package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class llllllIllIllIlIllllI extends llllIIIIlIIIlIlllIll
{
    private static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private static final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.llllIIIIlIIIlIlllIll);
        IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(o.IIllllIIIlIIIIIIllIl, false);
    }
    
    public llllllIllIllIlIllllI() {
        super(false);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = random.nextInt(4) + 5;
        while (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
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
                n2 = 3;
            }
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
            for (int n3 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n2; n3 <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n2 && b; ++n3) {
                for (int n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n2; n4 <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n2 && b; ++n4) {
                    if (i >= 0 && i < 256) {
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n3, i, n4)).llIllIIIIIllIlIIIIlI();
                        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                            if (llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII) {
                                b = false;
                            }
                            else if (i > ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) {
                                b = false;
                            }
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
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
        if ((llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256 - n - 1) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            for (int j = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 3 + n; j <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n; ++j) {
                final int n5 = j - (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n);
                for (int n6 = 2 - n5 / 2, k = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n6; k <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n6; ++k) {
                    final int n7 = k - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                    for (int l = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n6; l <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n6; ++l) {
                        final int n8 = l - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                        if (Math.abs(n7) != n6 || Math.abs(n8) != n6 || (random.nextInt(2) != 0 && n5 != 0)) {
                            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(k, j, l);
                            if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl);
                            }
                        }
                    }
                }
            }
            for (int n9 = 0; n9 < n; ++n9) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n9)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl || llIllIIIIIllIlIIIIlI3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII || llIllIIIIIllIlIIIIlI3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n9), llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll);
                }
            }
            for (int n10 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 3 + n; n10 <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n; ++n10) {
                final int n11 = 2 - (n10 - (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n)) / 2;
                final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new llllIIIlIlllIlIIIIIl();
                for (int n12 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n11; n12 <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n11; ++n12) {
                    for (int n13 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n11; n13 <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n11; ++n13) {
                        llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(n12, n10, n13);
                        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                            final IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI = llllIIIlIlllIlIIIIIl2.IlIlIIIllIllIIIIIllI();
                            final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llllIIIlIlllIlIIIIIl2.IllIIlllIIIIlllIIlIl();
                            final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI4 = llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI();
                            final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl = llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl();
                            if (random.nextInt(4) == 0 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIllIllIIIIIllI, dk.IlllIIIIlIIIlIlIlIIl);
                            }
                            if (random.nextInt(4) == 0 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, illIIlllIIIIlllIIlIl, dk.llIllIlIlIIIIIIIllII);
                            }
                            if (random.nextInt(4) == 0 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI4).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI4, dk.lllIllIIIllllllIllll);
                            }
                            if (random.nextInt(4) == 0 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIIIlIlIIIllIlIlIIl, dk.IIllllIIIlIIIIIIllIl);
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, true);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        int n;
        for (n = 4, ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(); illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && n > 0; ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), --n) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        }
    }
}
