package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import com.google.common.base.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIIlIIIlIIIllIlIIIl extends lllIllIIIllllllIllll
{
    private static final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll;
    private final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    private final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    private final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(bl.IIIIIIIIIlllIllIlIlI, Predicates.equalTo((Object)bm.llllIIIIlIIIlIlllIll));
    }
    
    public llIIlIIIlIIIllIlIIIl() {
        this.IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cx.IlllIIIIlIIIlIlIlIIl, cy.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI, cd.IlIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll();
        this.IlIIIlIlIIIllIlIlIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.lllIllIIIllllllIllll();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        while (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 2) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
        if (!llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl))) {
            return false;
        }
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, -1, j)) && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, -2, j))) {
                    return false;
                }
            }
        }
        for (int k = -1; k <= 0; ++k) {
            for (int l = -2; l <= 2; ++l) {
                for (int n = -2; n <= 2; ++n) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l, k, n), this.llIllIIIIIllIlIIIIlI, 2);
                }
            }
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.IlIIIlIlIIIllIlIlIIl, 2);
        final Iterator iterator = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator.next()), this.IlIIIlIlIIIllIlIlIIl, 2);
        }
        for (int n2 = -2; n2 <= 2; ++n2) {
            for (int n3 = -2; n3 <= 2; ++n3) {
                if (n2 == -2 || n2 == 2 || n3 == -2 || n3 == 2) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n2, 1, n3), this.llIllIIIIIllIlIIIIlI, 2);
                }
            }
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(2, 1, 0), this.IlIlIlIlIlllllllllIl, 2);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-2, 1, 0), this.IlIlIlIlIlllllllllIl, 2);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, 1, 2), this.IlIlIlIlIlllllllllIl, 2);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, 1, -2), this.IlIlIlIlIlllllllllIl, 2);
        for (int n4 = -1; n4 <= 1; ++n4) {
            for (int n5 = -1; n5 <= 1; ++n5) {
                if (n4 == 0 && n5 == 0) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n4, 4, n5), this.llIllIIIIIllIlIIIIlI, 2);
                }
                else {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n4, 4, n5), this.IlIlIlIlIlllllllllIl, 2);
                }
            }
        }
        for (int n6 = 1; n6 <= 3; ++n6) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-1, n6, -1), this.llIllIIIIIllIlIIIIlI, 2);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-1, n6, 1), this.llIllIIIIIllIlIIIIlI, 2);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, n6, -1), this.llIllIIIIIllIlIIIIlI, 2);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, n6, 1), this.llIllIIIIIllIlIIIIlI, 2);
        }
        return true;
    }
}
