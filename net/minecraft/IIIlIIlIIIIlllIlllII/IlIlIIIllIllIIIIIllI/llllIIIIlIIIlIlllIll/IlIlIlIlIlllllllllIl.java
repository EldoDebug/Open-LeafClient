package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IlIlIlIlIlllllllllIl extends lllIllIIIllllllIllll
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    public IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(true);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIlIlIlllllllllIl() {
        super(false);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            this.llllIIIIlIIIlIlllIll = (random.nextBoolean() ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.k : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.l);
        }
        final int n = random.nextInt(3) + 4;
        boolean b = true;
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 1 || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n + 1 >= 256) {
            return false;
        }
        for (int i = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); i <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 + n; ++i) {
            int n2 = 3;
            if (i <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 3) {
                n2 = 0;
            }
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
            for (int n3 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n2; n3 <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n2 && b; ++n3) {
                for (int n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n2; n4 <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n2 && b; ++n4) {
                    if (i >= 0 && i < 256) {
                        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n3, i, n4)).llIllIIIIIllIlIIIIlI();
                        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
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
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI && llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A) {
            return false;
        }
        int n5 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n;
        if (this.llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.l) {
            n5 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n - 3;
        }
        for (int j = n5; j <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n; ++j) {
            int n6 = 1;
            if (j < ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n) {
                ++n6;
            }
            if (this.llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.k) {
                n6 = 3;
            }
            final int n7 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n6;
            final int n8 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n6;
            final int n9 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n6;
            final int n10 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n6;
            for (int k = n7; k <= n8; ++k) {
                for (int l = n9; l <= n10; ++l) {
                    int n11 = 5;
                    if (k == n7) {
                        --n11;
                    }
                    else if (k == n8) {
                        ++n11;
                    }
                    if (l == n9) {
                        n11 -= 3;
                    }
                    else if (l == n10) {
                        n11 += 3;
                    }
                    llllllIIIIIIIlllIIll llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llllIIIIlIIIlIlllIll(n11);
                    if (this.llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.k || j < ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n) {
                        if (k == n7 || k == n8) {
                            if (l == n9) {
                                continue;
                            }
                            if (l == n10) {
                                continue;
                            }
                        }
                        if (k == ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - (n6 - 1) && l == n9) {
                            llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llllIIIIlIIIlIlllIll;
                        }
                        if (k == n7 && l == ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - (n6 - 1)) {
                            llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llllIIIIlIIIlIlllIll;
                        }
                        if (k == ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (n6 - 1) && l == n9) {
                            llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llIllIIIIIllIlIIIIlI;
                        }
                        if (k == n8 && l == ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - (n6 - 1)) {
                            llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llIllIIIIIllIlIIIIlI;
                        }
                        if (k == ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - (n6 - 1) && l == n10) {
                            llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llllIIIlIlllIlIIIIIl;
                        }
                        if (k == n7 && l == ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (n6 - 1)) {
                            llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llllIIIlIlllIlIIIIIl;
                        }
                        if (k == ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (n6 - 1) && l == n10) {
                            llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.lIIIlllIIIllIIIllIII;
                        }
                        if (k == n8 && l == ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (n6 - 1)) {
                            llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.lIIIlllIIIllIIIllIII;
                        }
                    }
                    if (llllllIIIIIIIlllIIll == net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.IlIlIIIllIllIIIIIllI && j < ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n) {
                        llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llIllIlIIIIllIlIIllI;
                    }
                    if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n - 1 || llllllIIIIIIIlllIIll != net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.llIllIlIIIIllIlIIllI) {
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(k, j, l);
                        if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIIIlllIlIIIIIIIllI.IIIIIIIIIlllIllIlIlI, llllllIIIIIIIlllIIll));
                        }
                    }
                }
            }
        }
        for (int n12 = 0; n12 < n; ++n12) {
            if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n12)).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n12), this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIIIlllIlIIIIIIIllI.IIIIIIIIIlllIllIlIlI, llllllIIIIIIIlllIIll.llIIlIIIlIIIllIlIIIl));
            }
        }
        return true;
    }
}
