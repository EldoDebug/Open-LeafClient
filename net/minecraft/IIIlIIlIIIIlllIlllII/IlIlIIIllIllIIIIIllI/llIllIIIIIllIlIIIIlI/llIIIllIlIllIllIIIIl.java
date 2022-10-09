package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llIIIllIlIllIllIIIIl extends IlIIlllllIIllIIlllll
{
    public llIIIllIlIllIllIIIIl() {
    }
    
    public llIIIllIlIllIllIIIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        super(1, lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, 2, 2, 2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 8, 0, 14, 8, 14, llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll);
        final int n = 7;
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, n, 0, 0, n, 15, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, n, 0, 15, n, 15, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, n, 0, 15, n, 0, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, n, 15, 14, n, 15, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl, false);
        for (int i = 1; i <= 6; ++i) {
            llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl;
            if (i == 2 || i == 6) {
                llIIlIIIlIIIllIlIIIl = llIIIllIlIllIllIIIIl.llllIIIIlIIIlIlllIll;
            }
            for (int j = 0; j <= 15; j += 15) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, j, i, 0, j, i, 1, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, j, i, 6, j, i, 9, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, j, i, 14, j, i, 15, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, i, 0, 1, i, 0, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, i, 0, 9, i, 0, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 14, i, 0, 14, i, 0, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, i, 15, 14, i, 15, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl, false);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 3, 6, 9, 6, 9, llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI, llIIIllIlIllIllIIIIl.llIllIIIIIllIlIIIIlI, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 4, 7, 8, 5, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII.lllIllIIIllllllIllll(), false);
        for (int k = 3; k <= 6; k += 3) {
            for (int l = 6; l <= 9; l += 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIllIlIllIllIIIIl.lIIIIlIIIIIlllIllIII, l, k, 6, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIIllIlIllIllIIIIl.lIIIIlIIIIIlllIllIII, l, k, 9, ilIlIIIlIIlIlIIlllIl);
            }
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 6, 5, 2, 6, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 1, 9, 5, 2, 9, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 1, 6, 10, 2, 6, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 1, 9, 10, 2, 9, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 5, 6, 2, 5, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 1, 5, 9, 2, 5, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 1, 10, 6, 2, 10, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 1, 10, 9, 2, 10, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 2, 5, 5, 6, 5, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 2, 10, 5, 6, 10, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 2, 5, 10, 6, 5, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 2, 10, 10, 6, 10, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 7, 1, 5, 7, 6, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 7, 1, 10, 7, 6, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 7, 9, 5, 7, 14, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 7, 9, 10, 7, 14, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 7, 5, 6, 7, 5, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 7, 10, 6, 7, 10, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 7, 5, 14, 7, 5, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 7, 10, 14, 7, 10, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 2, 2, 1, 3, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 2, 3, 1, 2, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 13, 1, 2, 13, 1, 3, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 12, 1, 2, 12, 1, 2, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 12, 2, 1, 13, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 13, 3, 1, 13, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 13, 1, 12, 13, 1, 13, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 12, 1, 13, 12, 1, 13, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, llIIIllIlIllIllIIIIl.IlIlIlIlIlllllllllIl, false);
        return true;
    }
}
