package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public class llllIlIllllIIlIIlIlI extends i
{
    public llllIlIllllIIlIIlIlI() {
    }
    
    public llllIlIllllIIlIIlIlI(final g g, final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(g, n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public static llllIlIllllIIlIIlIlI llllIIIIlIIIlIlllIll(final g g, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, 0, 0, 0, 9, 9, 6, lllIllIIIllllllIllll);
        return (i.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new llllIlIllllIIlIIlIlI(g, n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llIllIlIIIIllIlIIllI < 0) {
            this.llIllIlIIIIllIlIIllI = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl);
            if (this.llIllIlIIIIllIlIIllI < 0) {
                return true;
            }
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(0, this.llIllIlIIIIllIlIIllI - this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI + 9 - 1, 0);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 1, 7, 5, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 8, 0, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 0, 8, 5, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 6, 1, 8, 6, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 7, 2, 8, 7, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 3);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 2);
        for (int i = -1; i <= 2; ++i) {
            for (int j = 0; j <= 8; ++j) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), j, 6 + i, i, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), j, 6 + i, 5 - i, ilIlIIIlIIlIlIIlllIl);
            }
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 0, 1, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 5, 8, 1, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 1, 0, 8, 1, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 0, 7, 1, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 0, 0, 4, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 5, 0, 4, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 2, 5, 8, 4, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 2, 0, 8, 4, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 1, 0, 4, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 5, 7, 4, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 2, 1, 8, 4, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 0, 7, 4, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 4, 2, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 5, 2, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 6, 2, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 4, 3, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 5, 3, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 6, 3, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 0, 2, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 0, 2, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 0, 3, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 0, 3, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 8, 2, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 8, 2, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 8, 3, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 8, 3, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 2, 2, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 3, 2, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 5, 2, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 6, 2, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 1, 7, 4, 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 4, 7, 4, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 4, 7, 3, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), 7, 1, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 0)), 7, 1, 3, ilIlIIIlIIlIlIIlllIl);
        final int llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 3);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 6, 1, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 5, 1, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 4, 1, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 3, 1, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 6, 1, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllIIllIIIIIIlIIlI.lllIllIIIllllllIllll(), 6, 2, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 4, 1, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllIIllIIIIIIlIIlI.lllIllIIIllllllIllll(), 4, 2, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl.lllIllIIIllllllIllll(), 7, 1, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 1, 1, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 1, 2, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 1, 1, 0, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII, 1)));
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1, 0, -1, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1, -1, -1, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII, 3)), 1, 0, -1, ilIlIIIlIIlIlIIlllIl);
        }
        for (int k = 0; k < 6; ++k) {
            for (int l = 0; l < 9; ++l) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, l, 9, k, ilIlIIIlIIlIlIIlllIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), l, -1, k, ilIlIIIlIIlIlIIlllIl);
            }
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 2, 1);
        return true;
    }
    
    @Override
    protected int llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        return 1;
    }
}
