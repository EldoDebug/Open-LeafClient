package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class lllIIIIlIlIllIIlIIIl extends IllIlllIllIIIIllllII
{
    private boolean llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public lllIIIIlIlIllIIlIIIl() {
    }
    
    public lllIIIIlIlIllIIlIIIl(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(random);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = (random.nextInt(2) == 0);
        this.IlIlIlIlIlllllllllIl = (random.nextInt(2) == 0);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Left", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Right", this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Left");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Right");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        this.llllIIIIlIIIlIlllIll((llllllIIIIIIIlllIIll)illlllllIIIlIIIlIlII, list, random, 1, 1);
        if (this.llllIIIIlIIIlIlllIll) {
            this.IlIlIlIlIlllllllllIl((llllllIIIIIIIlllIIll)illlllllIIIlIIIlIlII, list, random, 1, 2);
        }
        if (this.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI((llllllIIIIIIIlllIIll)illlllllIIIlIIIlIlII, list, random, 1, 2);
        }
    }
    
    public static lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, -1, -1, 0, 5, 5, 7, lllIllIIIllllllIllll);
        return (IllIlllIllIIIIllllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new lllIIIIlIlIllIIlIIIl(n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 0, 4, 4, 6, true, random, IllllIIlIlIllIIIllII.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl, this.IlIIIlIlIIIllIlIlIIl, 1, 1, 0);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIIIlIIlIlIIlllIl, lIllIlIIIllllllIIlII.llllIIIIlIIIlIlllIll, 1, 1, 6);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.1f, 1, 2, 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll());
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.1f, 3, 2, 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll());
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.1f, 1, 2, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll());
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, random, 0.1f, 3, 2, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll());
        if (this.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 2, 0, 3, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        if (this.IlIlIlIlIlllllllllIl) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 4, 1, 2, 4, 3, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        return true;
    }
}
