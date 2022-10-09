package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIllllllIllIIIlllIl extends llllIIIIlIIIlIlllIll
{
    private static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private static final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.IlIlIlIlIlllllllllIl);
        IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
    }
    
    public IIIllllllIllIIIlllIl() {
        super(false);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = random.nextInt(5) + 7;
        final int n2 = n - random.nextInt(2) - 3;
        final int n3 = 1 + random.nextInt(n - n2 + 1);
        boolean b = true;
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 1 || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n + 1 > 256) {
            return false;
        }
        for (int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); liiIlllIIIllIIIllIII <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 + n && b; ++liiIlllIIIllIIIllIII) {
            int n4;
            if (liiIlllIIIllIIIllIII - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < n2) {
                n4 = 0;
            }
            else {
                n4 = n3;
            }
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
            for (int n5 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n4; n5 <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n4 && b; ++n5) {
                for (int n6 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n4; n6 <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n4 && b; ++n6) {
                    if (liiIlllIIIllIIIllIII >= 0 && liiIlllIIIllIIIllIII < 256) {
                        if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n5, liiIlllIIIllIIIllIII, n6)).llIllIIIIIllIlIIIIlI())) {
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
            int n7 = 0;
            for (int i = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n; i >= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n2; --i) {
                for (int j = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n7; j <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n7; ++j) {
                    final int n8 = j - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                    for (int k = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n7; k <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n7; ++k) {
                        final int n9 = k - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                        if (Math.abs(n8) != n7 || Math.abs(n9) != n7 || n7 <= 0) {
                            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(j, i, k);
                            if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl);
                            }
                        }
                    }
                }
                if (n7 >= 1 && i == ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n2 + 1) {
                    --n7;
                }
                else if (n7 < n3) {
                    ++n7;
                }
            }
            for (int l = 0; l < n - 1; ++l) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l), IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll);
                }
            }
            return true;
        }
        return false;
    }
}
