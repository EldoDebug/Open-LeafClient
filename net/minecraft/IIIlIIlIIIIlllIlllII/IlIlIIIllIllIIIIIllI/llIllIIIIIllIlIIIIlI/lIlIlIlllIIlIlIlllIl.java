package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class lIlIlIlllIIlIlIlllIl extends IlIIlllllIIllIIlllll
{
    public lIlIlIlllIIlIlIlllIl() {
    }
    
    public lIlIlIlllIIlIlIlllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        super(1, lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, 2, 1, 1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl = this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()];
        final lllllIIlIlIIIlIlIIIl iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
        if (this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll / 25 > 0) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 0, lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 1, 7, 4, 6, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll);
        }
        if (lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 4, 1, 14, 4, 6, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 0, 0, 3, 7, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 3, 0, 15, 3, 7, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 0, 15, 3, 0, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 7, 14, 3, 7, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 0, 0, 2, 7, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 2, 0, 15, 2, 7, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 0, 15, 2, 0, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 7, 14, 2, 7, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 0, 1, 7, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 1, 0, 15, 1, 7, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 0, 15, 1, 0, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 7, 14, 1, 7, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 0, 10, 1, 4, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 2, 0, 9, 2, 3, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 3, 0, 10, 3, 4, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIlIlllIIlIlIlllIl.lIIIIlIIIIIlllIllIII, 6, 2, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lIlIlIlllIIlIlIlllIl.lIIIIlIIIIIlllIllIII, 9, 2, 3, ilIlIIIlIIlIlIIlllIl);
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
        return true;
    }
}
