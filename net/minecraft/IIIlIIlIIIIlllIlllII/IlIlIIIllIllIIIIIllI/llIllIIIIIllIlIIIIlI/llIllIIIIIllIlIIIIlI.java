package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

abstract class llIllIIIIIllIlIIIIlI extends IlllllllIIIlIIIlIlII
{
    protected int llllIIIIlIIIlIlllIll;
    protected int IlIlIlIlIlllllllllIl;
    protected int llIllIIIIIllIlIIIIlI;
    protected int IlIIIlIlIIIllIlIlIIl;
    private static volatile /* synthetic */ int[] lIIIIlIIIIIlllIllIII;
    
    public llIllIIIIIllIlIIIIlI() {
        this.IlIIIlIlIIIllIlIlIIl = -1;
    }
    
    protected llIllIIIIIllIlIIIIlI(final Random random, final int n, final int n2, final int n3, final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        super(0);
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(random);
        switch (llllIIIIlIIIlIlllIll()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
            case 3:
            case 4: {
                this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n, n2, n3, n + llllIIIIlIIIlIlllIll - 1, n2 + ilIlIlIlIlllllllllIl - 1, n3 + llIllIIIIIllIlIIIIlI - 1);
                break;
            }
            default: {
                this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n, n2, n3, n + llIllIIIIIllIlIIIIlI - 1, n2 + ilIlIlIlIlllllllllIl - 1, n3 + llllIIIIlIIIlIlllIll - 1);
                break;
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Width", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Height", this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Depth", this.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HPos", this.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Width");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Height");
        this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Depth");
        this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("HPos");
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n) {
        if (this.IlIIIlIlIIIllIlIlIIl >= 0) {
            return true;
        }
        int n2 = 0;
        int n3 = 0;
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
        for (int i = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI; i <= this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl; ++i) {
            for (int j = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll; j <= this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl; ++j) {
                llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(j, 64, i);
                if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl)) {
                    n2 += Math.max(illlllllIIIlIIIlIlII.lllIIIIlllllIlIIllIl(llllIIIlIlllIlIIIIIl).lIIIlllIIIllIIIllIII(), illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII());
                    ++n3;
                }
            }
        }
        if (n3 == 0) {
            return false;
        }
        this.IlIIIlIlIIIllIlIlIIl = n2 / n3;
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(0, this.IlIIIlIlIIIllIlIlIIl - this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, 0);
        return true;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] liiiIlIIIIIlllIllIII = llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII;
        if (liiiIlIIIIIlllIllIII != null) {
            return liiiIlIIIIIlllIllIII;
        }
        final int[] liiiIlIIIIIlllIllIII2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            liiiIlIIIIIlllIllIII2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII2;
    }
}
