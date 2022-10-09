package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIIIlIIIllllIlIlIlI extends llllIIIIlIIIlIlllIll
{
    private static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private static final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.IlIlIlIlIlllllllllIl);
        IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
    }
    
    public IlIIIlIIIllllIlIlIlI(final boolean b) {
        super(b);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = random.nextInt(4) + 6;
        final int n2 = 1 + random.nextInt(2);
        final int n3 = n - n2;
        final int n4 = 2 + random.nextInt(2);
        boolean b = true;
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 1 || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n + 1 > 256) {
            return false;
        }
        for (int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); liiIlllIIIllIIIllIII <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 + n && b; ++liiIlllIIIllIIIllIII) {
            int n5;
            if (liiIlllIIIllIIIllIII - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < n2) {
                n5 = 0;
            }
            else {
                n5 = n4;
            }
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
            for (int n6 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n5; n6 <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n5 && b; ++n6) {
                for (int n7 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n5; n7 <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n5 && b; ++n7) {
                    if (liiIlllIIIllIIIllIII >= 0 && liiIlllIIIllIIIllIII < 256) {
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n6, liiIlllIIIllIIIllIII, n7)).llIllIIIIIllIlIIIIlI();
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
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
        if ((llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256 - n - 1) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            int nextInt = random.nextInt(2);
            int n8 = 1;
            int n9 = 0;
            for (int i = 0; i <= n3; ++i) {
                final int n10 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n - i;
                for (int j = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - nextInt; j <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + nextInt; ++j) {
                    final int n11 = j - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                    for (int k = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - nextInt; k <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + nextInt; ++k) {
                        final int n12 = k - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                        if (Math.abs(n11) != nextInt || Math.abs(n12) != nextInt || nextInt <= 0) {
                            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(j, n10, k);
                            if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl);
                            }
                        }
                    }
                }
                if (nextInt >= n8) {
                    nextInt = n9;
                    n9 = 1;
                    if (++n8 > n4) {
                        n8 = n4;
                    }
                }
                else {
                    ++nextInt;
                }
            }
            for (int nextInt2 = random.nextInt(3), l = 0; l < n - nextInt2; ++l) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l), IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll);
                }
            }
            return true;
        }
        return false;
    }
}
