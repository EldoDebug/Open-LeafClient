package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIIlllIIIIlllIIlIl extends llIllIIIIIllIlIIIIlI
{
    private boolean lIIIIlIIIIIlllIllIII;
    
    public IllIIlllIIIIlllIIlIl() {
    }
    
    public IllIIlllIIIIlllIIlIl(final Random random, final int n, final int n2) {
        super(random, n, 64, n2, 7, 7, 9);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Witch", this.lIIIIlIIIIIlllIllIII);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Witch");
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 1, 5, 1, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 2, 5, 4, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 1, 0, 4, 1, 0, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 2, 2, 3, 3, 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 3, 1, 3, 6, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 2, 3, 5, 3, 6, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 2, 2, 7, 4, 3, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 0, 2, 1, 3, 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 0, 2, 5, 3, 2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 0, 7, 1, 3, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 5, 0, 7, 5, 3, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 2, 3, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 3, 3, 7, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 1, 3, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 5, 3, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 5, 3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ae.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIIIIIlIIllIIlIlIll.IIllllIIIlIIIIIIllIl, IllllIIlIlIllIIIllII.lllIIIIlllllIlIIllIl), 1, 3, 5, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl.lllIllIIIllllllIllll(), 3, 2, 6, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.I.lllIllIIIllllllIllll(), 4, 2, 6, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 1, 2, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 5, 2, 1, ilIlIIIlIIlIlIIlllIl);
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 3);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 1);
        final int llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 0);
        final int llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, 2);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 4, 1, 6, 4, 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 4, 2, 0, 4, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 4, 2, 6, 4, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 4, 8, 6, 4, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll4), false);
        for (int i = 2; i <= 7; i += 5) {
            for (int j = 1; j <= 5; j += 4) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll(), j, -1, i, ilIlIIIlIIlIlIIlllIl);
            }
        }
        if (!this.lIIIIlIIIIIlllIllIII) {
            final int llllIIIIlIIIlIlllIll5 = this.llllIIIIlIIIlIlllIll(2, 5);
            final int llllIIIIlIIIlIlllIll6 = this.llllIIIIlIIIlIlllIll(2);
            final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(2, 5);
            if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll5, llllIIIIlIIIlIlllIll6, ilIlIlIlIlllllllllIl))) {
                this.lIIIIlIIIIIlllIllIII = true;
                final IllIllIlllIllllIIllI illIllIlllIllllIIllI = new IllIllIlllIllllIIllI(illlllllIIIlIIIlIlII);
                illIllIlllIllllIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll5 + 0.5, llllIIIIlIIIlIlllIll6, ilIlIlIlIlllllllllIl + 0.5, 0.0f, 0.0f);
                illIllIlllIllllIIllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll5, llllIIIIlIIIlIlllIll6, ilIlIlIlIlllllllllIl)), null);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI);
            }
        }
        return true;
    }
}
