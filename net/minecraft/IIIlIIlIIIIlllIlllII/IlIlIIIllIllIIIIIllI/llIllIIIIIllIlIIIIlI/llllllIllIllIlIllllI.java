package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class llllllIllIllIlIllllI extends IIlIlIlIIlIllIIIIIIl
{
    public llllllIllIllIlIllllI() {
    }
    
    public llllllIllIllIlIllllI(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        this.llllIIIIlIIIlIlllIll((IllIllIlllIllllIIllI)illlllllIIIlIIIlIlII, list, random, 1, 0, true);
    }
    
    public static llllllIllIllIlIllllI llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, -1, -7, 0, 5, 14, 10, lllIllIIIllllllIllll);
        return (IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new llllllIllIllIlIllllI(n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E, 2);
        for (int i = 0; i <= 9; ++i) {
            final int max = Math.max(1, 7 - i);
            final int min = Math.min(Math.max(max + 5, 14 - i), 13);
            final int n = i;
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, i, 4, max, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, max + 1, i, 3, min - 1, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
            if (i <= 6) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 1, max + 1, i, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 2, max + 1, i, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll), 3, max + 1, i, ilIlIIIlIIlIlIIlllIl);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, min, i, 4, min, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, max + 1, i, 0, min - 1, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, max + 1, i, 4, min - 1, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
            if ((i & 0x1) == 0x0) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, max + 2, i, 0, max + 3, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, max + 2, i, 4, max + 3, i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D.lllIllIIIllllllIllll(), false);
            }
            for (int j = 0; j <= 4; ++j) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), j, -1, n, ilIlIIIlIIlIlIIlllIl);
            }
        }
        return true;
    }
}
