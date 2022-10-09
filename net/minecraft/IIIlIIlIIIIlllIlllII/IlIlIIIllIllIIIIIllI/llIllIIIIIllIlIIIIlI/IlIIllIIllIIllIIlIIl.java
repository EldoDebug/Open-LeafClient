package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IlIIllIIllIIllIIlIIl extends IlIIlllllIIllIIlllll
{
    public IlIIllIIllIIllIIlIIl() {
    }
    
    public IlIIllIIllIIllIIlIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        super(1, lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, 1, 1, 2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl = this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()];
        final lllllIIlIlIIIlIlIIIl iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
        if (this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll / 25 > 0) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 8, lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 1, 6, 4, 7, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll);
        }
        if (lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 8, 6, 4, 14, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 0, 0, 3, 15, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 3, 0, 7, 3, 15, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 0, 7, 3, 0, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 15, 6, 3, 15, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 0, 0, 2, 15, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 0, 7, 2, 15, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 0, 7, 2, 0, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 15, 6, 2, 15, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 0, 1, 15, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 0, 7, 1, 15, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 0, 7, 1, 0, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 15, 6, 1, 15, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 1, 1, 1, 2, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 1, 6, 1, 2, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 1, 1, 3, 2, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 3, 1, 6, 3, 2, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 13, 1, 1, 14, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 13, 6, 1, 14, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 13, 1, 3, 14, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 3, 13, 6, 3, 14, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 6, 2, 3, 6, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 6, 5, 3, 6, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 9, 2, 3, 9, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 9, 5, 3, 9, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 2, 6, 4, 2, 6, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 2, 9, 4, 2, 9, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 2, 7, 2, 2, 8, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 2, 7, 5, 2, 8, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII, 2, 2, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII, 5, 2, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII, 2, 2, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII, 5, 2, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, 2, 3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, 5, 3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, 2, 3, 10, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, 5, 3, 10, ilIlIIIlIIlIlIIlllIl);
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
        return true;
    }
}
