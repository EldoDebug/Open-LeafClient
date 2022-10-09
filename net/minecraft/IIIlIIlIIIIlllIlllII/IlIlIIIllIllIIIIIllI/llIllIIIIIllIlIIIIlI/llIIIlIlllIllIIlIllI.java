package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llIIIlIlllIllIIlIllI extends IlIIlllllIIllIIlllll
{
    public llIIIlIlllIllIIlIllI() {
    }
    
    public llIIIlIlllIllIIlIllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        super(1, lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, 1, 2, 2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl = this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()];
        final lllllIIlIlIIIlIlIIIl iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl2 = lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()];
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl3 = iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()];
        if (this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll / 25 > 0) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 8, lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
        }
        if (lllllIIlIlIIIlIlIIIl3.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 8, 1, 6, 8, 7, llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll);
        }
        if (lllllIIlIlIIIlIlIIIl2.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 8, 8, 6, 8, 14, llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll);
        }
        for (int i = 1; i <= 7; ++i) {
            llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl;
            if (i == 2 || i == 6) {
                llIIlIIIlIIIllIlIIIl = llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll;
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, i, 0, 0, i, 15, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, i, 0, 7, i, 15, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, i, 0, 6, i, 0, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, i, 15, 6, i, 15, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
        }
        for (int j = 1; j <= 7; ++j) {
            llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = llIIIlIlllIllIIlIllI.llIllIIIIIllIlIIIIlI;
            if (j == 2 || j == 6) {
                llIIlIIIlIIIllIlIIIl2 = llIIIlIlllIllIIlIllI.lIIIIlIIIIIlllIllIII;
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, j, 7, 4, j, 8, llIIlIIIlIIIllIlIIIl2, llIIlIIIlIIIllIlIIIl2, false);
        }
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 0, 4, 2, 0, false);
        }
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 3, 7, 2, 4, false);
        }
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 3, 0, 2, 4, false);
        }
        if (lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 15, 4, 2, 15, false);
        }
        if (lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 11, 0, 2, 12, false);
        }
        if (lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 11, 7, 2, 12, false);
        }
        if (lllllIIlIlIIIlIlIIIl3.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 5, 0, 4, 6, 0, false);
        }
        if (lllllIIlIlIIIlIlIIIl3.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 5, 3, 7, 6, 4, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 4, 2, 6, 4, 5, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 2, 6, 3, 2, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 5, 6, 3, 5, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
        }
        if (lllllIIlIlIIIlIlIIIl3.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 3, 0, 6, 4, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 2, 2, 4, 5, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 2, 1, 3, 2, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 5, 1, 3, 5, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
        }
        if (lllllIIlIlIIIlIlIIIl2.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 5, 15, 4, 6, 15, false);
        }
        if (lllllIIlIlIIIlIlIIIl2.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 11, 0, 6, 12, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 10, 2, 4, 13, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 10, 1, 3, 10, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 13, 1, 3, 13, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
        }
        if (lllllIIlIlIIIlIlIIIl2.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 5, 11, 7, 6, 12, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 4, 10, 6, 4, 13, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 10, 6, 3, 10, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 13, 6, 3, 13, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, llIIIlIlllIllIIlIllI.IlIlIlIlIlllllllllIl, false);
        }
        return true;
    }
}
