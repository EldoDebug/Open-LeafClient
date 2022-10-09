package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public class k extends i
{
    private boolean llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public k() {
    }
    
    public k(final g g, final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(g, n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = random.nextBoolean();
        this.IlIlIlIlIlllllllllIl = random.nextInt(3);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("T", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("C", this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("T");
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("C");
    }
    
    public static k llllIIIIlIIIlIlllIll(final g g, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, 0, 0, 0, 4, 6, 5, lllIllIIIllllllIllll);
        return (i.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new k(g, n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llIllIlIIIIllIlIIllI < 0) {
            this.llIllIlIIIIllIlIIllI = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl);
            if (this.llIllIlIIIIllIlIIllI < 0) {
                return true;
            }
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(0, this.llIllIlIIIIllIlIIllI - this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI + 6 - 1, 0);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 1, 3, 5, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 3, 0, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 0, 1, 2, 0, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll(), false);
        if (this.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 1, 2, 4, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        }
        else {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 5, 1, 2, 5, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 1, 4, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 2, 4, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 1, 4, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 2, 4, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 0, 4, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 0, 4, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 0, 4, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 3, 4, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 3, 4, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), 3, 4, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 0, 3, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 0, 3, 3, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 4, 0, 3, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 4, 3, 3, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 1, 0, 3, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 1, 3, 3, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 0, 2, 3, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 4, 2, 3, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 0, 2, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n.lllIllIIIllllllIllll(), 3, 2, 2, ilIlIIIlIIlIlIIlllIl);
        if (this.IlIlIlIlIlllllllllIl > 0) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), this.IlIlIlIlIlllllllllIl, 1, 3, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllIIllIIIIIIlIIlI.lllIllIIIllllllIllll(), this.IlIlIlIlIlllllllllIl, 2, 3, ilIlIIIlIIlIlIIlllIl);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 1, 1, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 1, 2, 0, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 1, 1, 0, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII, 1)));
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1, 0, -1, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, 1, -1, -1, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII, 3)), 1, 0, -1, ilIlIIIlIIlIlIIlllIl);
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 4; ++j) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, j, 6, i, ilIlIIIlIIlIlIIlllIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), j, -1, i, ilIlIIIlIIlIlIIlllIl);
            }
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 2, 1);
        return true;
    }
}
