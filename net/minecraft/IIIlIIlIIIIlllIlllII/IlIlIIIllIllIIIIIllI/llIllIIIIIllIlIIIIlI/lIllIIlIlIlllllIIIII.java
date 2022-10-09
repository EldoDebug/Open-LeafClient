package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIllIIlIlIlllllIIIII extends i
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    
    public lIllIIlIlIlllllIIIII() {
    }
    
    public lIllIIlIlIlllllIIIII(final g g, final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(g, n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(random);
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll(random);
        this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll(random);
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(random);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CA", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CB", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CC", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CD", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this.IlIIIlIlIIIllIlIlIIl));
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CA"));
        this.IlIlIlIlIlllllllllIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CB"));
        this.llIllIIIIIllIlIIIIlI = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CC"));
        this.IlIIIlIlIIIllIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CD"));
    }
    
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        switch (random.nextInt(5)) {
            case 0: {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.af;
            }
            case 1: {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ag;
            }
            default: {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllIIIlIlIIllIIIlI;
            }
        }
    }
    
    public static lIllIIlIlIlllllIIIII llllIIIIlIIIlIlllIll(final g g, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, 0, 0, 0, 13, 4, 9, lllIllIIIllllllIllll);
        return (i.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new lIllIIlIlIlllllIIIII(g, n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llIllIlIIIIllIlIIllI < 0) {
            this.llIllIlIIIIllIlIIllI = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl);
            if (this.llIllIlIIIIllIlIIllI < 0) {
                return true;
            }
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(0, this.llIllIlIIIIllIlIIllI - this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI + 4 - 1, 0);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 12, 4, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 0, 1, 2, 0, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 0, 1, 5, 0, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 0, 1, 8, 0, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 0, 1, 11, 0, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 0, 0, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 0, 0, 6, 0, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 12, 0, 0, 12, 0, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 0, 0, 11, 0, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 0, 8, 11, 0, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 0, 1, 3, 0, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 0, 1, 9, 0, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll(), false);
        for (int i = 1; i <= 7; ++i) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2, 7)), 1, 1, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2, 7)), 2, 1, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2, 7)), 4, 1, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2, 7)), 5, 1, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2, 7)), 7, 1, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2, 7)), 8, 1, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2, 7)), 10, 1, i, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 2, 7)), 11, 1, i, ilIlIIIlIIlIlIIlllIl);
        }
        for (int j = 0; j < 9; ++j) {
            for (int k = 0; k < 13; ++k) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, k, 4, j, ilIlIIIlIIlIlIIlllIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll(), k, -1, j, ilIlIIIlIIlIlIIlllIl);
            }
        }
        return true;
    }
}
