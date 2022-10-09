package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIllllIlIlIIIIll extends llllIIIIlIIIlIlllIll
{
    private static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private static final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.llIllIIIIIllIlIIIIlI);
        IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(o.IIllllIIIlIIIIIIllIl, false);
    }
    
    public llllIIllllIlIlIIIIll(final boolean b, final boolean llIllIIIIIllIlIIIIlI) {
        super(b);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        int n = random.nextInt(3) + 5;
        if (this.llIllIIIIIllIlIIIIlI) {
            n += random.nextInt(7);
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
        if ((llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256 - n - 1) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            for (int j = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 3 + n; j <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n; ++j) {
                final int n5 = j - (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n);
                for (int n6 = 1 - n5 / 2, k = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n6; k <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n6; ++k) {
                    final int n7 = k - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                    for (int l = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n6; l <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n6; ++l) {
                        final int n8 = l - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                        if (Math.abs(n7) != n6 || Math.abs(n8) != n6 || (random.nextInt(2) != 0 && n5 != 0)) {
                            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(k, j, l);
                            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
                            if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl);
                            }
                        }
                    }
                }
            }
            for (int n9 = 0; n9 < n; ++n9) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n9)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n9), llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll);
                }
            }
            return true;
        }
        return false;
    }
}
