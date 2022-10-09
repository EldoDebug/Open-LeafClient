package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIlIIllIllIIlIllII extends IlIIIlIlIIIllIlIlIIl
{
    public IllIlIIllIllIIlIllII() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl) || ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K || (boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl)) {
            return false;
        }
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl, true), 2);
        illlllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K);
        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        for (int i = 0; i < 16; ++i) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (5.0f + IllIlIIllIllIIlIllII.llIllIIIIIllIlIIIIlI.nextFloat() * 6.0f) / 16.0f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.8125f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (5.0f + IllIlIIllIllIIlIllII.llIllIIIIIllIlIIIIlI.nextFloat() * 6.0f) / 16.0f, 0.0, 0.0, 0.0, new int[0]);
        }
        final lllIllIIIllllllIllll lllIllIIIllllllIllll2 = (lllIllIIIllllllIllll)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIIIIIIIIlllIllIlIlI);
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 1;
        final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl = lllIllIIIllllllIllll2.IllIIlllIIIIlllIIlIl();
        for (int j = -2; j <= 2; ++j) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, j));
            if (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K) {
                if (!(boolean)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl)) {
                    n7 = 0;
                    break;
                }
                n5 = j;
                if (n6 == 0) {
                    n4 = j;
                    n6 = 1;
                }
            }
        }
        if (n7 != 0 && n5 == n4 + 2) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll2, 4);
            for (int k = n4; k <= n5; ++k) {
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, k));
                if (ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K || !(boolean)ilIlIlIlIlllllllllIl4.llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl)) {
                    n7 = 0;
                    break;
                }
            }
            for (int l = n4 - 1; l <= n5 + 1; l += 4) {
                final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, l);
                for (int n8 = 1; n8 <= 3; ++n8) {
                    final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl5 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll2, n8));
                    if (ilIlIlIlIlllllllllIl5.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K || !(boolean)ilIlIlIlIlllllllllIl5.llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl.IIllllIIIlIIIIIIllIl)) {
                        n7 = 0;
                        break;
                    }
                }
            }
            if (n7 != 0) {
                for (int n9 = n4; n9 <= n5; ++n9) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, n9);
                    for (int n10 = 1; n10 <= 3; ++n10) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll2, n10), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.J.lllIllIIIllllllIllll(), 2);
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, false);
        if (llllIIIIlIIIlIlllIll2 != null && llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K) {
            return lllIIIIlIlIllIIlIIIl;
        }
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll("Stronghold", new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll));
            if (llllIIIIlIIIlIlllIll3 != null) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.bow", 0.5f, 0.4f / (IllIlIIllIllIIlIllII.llIllIIIIIllIlIIIIlI.nextFloat() * 0.4f + 0.8f));
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1002, new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll), 0);
                if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                    --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                }
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
            }
        }
        return lllIIIIlIlIllIIlIIIl;
    }
}
