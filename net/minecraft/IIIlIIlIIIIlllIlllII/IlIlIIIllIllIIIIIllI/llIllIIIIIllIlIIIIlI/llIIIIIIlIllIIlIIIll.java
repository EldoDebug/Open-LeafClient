package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llIIIIIIlIllIIlIIIll extends IlIIlllllIIllIIlllll
{
    public llIIIIIIlIllIIlIIIll() {
    }
    
    public llIIIIIIlIllIIlIIIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        super(1, lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, 2, 2, 1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl = this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()];
        final lllllIIlIlIIIlIlIIIl iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl2 = iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()];
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl3 = lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()];
        if (this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll / 25 > 0) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 0, lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
        }
        if (lllllIIlIlIIIlIlIIIl2.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 8, 1, 7, 8, 6, llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll);
        }
        if (lllllIIlIlIIIlIlIIIl3.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 8, 1, 14, 8, 6, llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll);
        }
        for (int i = 1; i <= 7; ++i) {
            llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl;
            if (i == 2 || i == 6) {
                llIIlIIIlIIIllIlIIIl = llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll;
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, i, 0, 0, i, 7, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, i, 0, 15, i, 7, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, i, 0, 15, i, 0, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, i, 7, 14, i, 7, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 3, 2, 7, 4, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 2, 4, 7, 2, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 5, 4, 7, 5, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 13, 1, 3, 13, 7, 4, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 1, 2, 12, 7, 2, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 1, 5, 12, 7, 5, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 3, 5, 3, 4, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 1, 3, 10, 3, 4, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 7, 2, 10, 7, 5, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 5, 2, 5, 7, 2, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 5, 2, 10, 7, 2, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 5, 5, 5, 7, 5, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 5, 5, 10, 7, 5, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, 6, 6, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, 9, 6, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, 6, 6, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, 9, 6, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 4, 3, 6, 4, 4, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 4, 3, 10, 4, 4, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII, 5, 4, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII, 5, 4, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII, 10, 4, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIIIIlIllIIlIIIll.lIIIIlIIIIIlllIllIII, 10, 4, 5, ilIlIIIlIIlIlIIlllIl);
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 0, 4, 2, 0, false);
        }
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 7, 4, 2, 7, false);
        }
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 3, 0, 2, 4, false);
        }
        if (lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 1, 0, 12, 2, 0, false);
        }
        if (lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 1, 7, 12, 2, 7, false);
        }
        if (lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 1, 3, 15, 2, 4, false);
        }
        if (lllllIIlIlIIIlIlIIIl2.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 5, 0, 4, 6, 0, false);
        }
        if (lllllIIlIlIIIlIlIIIl2.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 5, 7, 4, 6, 7, false);
        }
        if (lllllIIlIlIIIlIlIIIl2.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 3, 0, 6, 4, false);
        }
        if (lllllIIlIlIIIlIlIIIl3.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 5, 0, 12, 6, 0, false);
        }
        if (lllllIIlIlIIIlIlIIIl3.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 5, 7, 12, 6, 7, false);
        }
        if (lllllIIlIlIIIlIlIIIl3.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 5, 3, 15, 6, 4, false);
        }
        return true;
    }
}
