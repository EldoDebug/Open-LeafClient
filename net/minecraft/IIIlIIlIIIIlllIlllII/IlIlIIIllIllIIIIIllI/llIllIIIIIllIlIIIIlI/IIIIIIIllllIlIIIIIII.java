package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IIIIIIIllllIlIIIIIII extends IllIlllIllIIIIllllII
{
    public IIIIIIIllllIlIIIIIII() {
    }
    
    public IIIIIIIllllIlIIIIIII(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(random);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        if (this.IllIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && this.IllIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            this.llIllIIIIIllIlIIIIlI((llllllIIIIIIIlllIIll)illlllllIIIlIIIlIlII, list, random, 1, 1);
        }
        else {
            this.IlIlIlIlIlllllllllIl((llllllIIIIIIIlllIIll)illlllllIIIlIIIlIlII, list, random, 1, 1);
        }
    }
    
    public static IIIIIIIllllIlIIIIIII llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, -1, -1, 0, 5, 5, 5, lllIllIIIllllllIllll);
        return (IllIlllIllIIIIllllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new IIIIIIIllllIlIIIIIII(n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 4, 4, 4, true, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl, this.IlIIIlIlIIIllIlIlIIl, 1, 1, 0);
        if (this.IllIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && this.IllIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 1, 4, 3, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        else {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 1, 0, 3, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        return true;
    }
}
