package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

abstract class i extends IlllllllIIIlIIIlIlII
{
    protected int llIllIlIIIIllIlIIllI;
    private int llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private static volatile /* synthetic */ int[] llIllIIIIIllIlIIIIlI;
    
    public i() {
        this.llIllIlIIIIllIlIIllI = -1;
    }
    
    protected i(final g g, final int n) {
        super(n);
        this.llIllIlIIIIllIlIIllI = -1;
        if (g != null) {
            this.IlIlIlIlIlllllllllIl = g.IlIlIlIlIlllllllllIl;
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HPos", this.llIllIlIIIIllIlIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("VCount", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Desert", this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llIllIlIIIIllIlIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("HPos");
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("VCount");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Desert");
    }
    
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final g g, final List list, final Random random, final int n, final int n2) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIlIlllIlIIIIIl()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    return IlIIIlIlIIIllIlIlIIl(g, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 4: {
                    return IlIIIlIlIIIllIlIlIIl(g, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 5: {
                    return IlIIIlIlIIIllIlIlIIl(g, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 6: {
                    return IlIIIlIlIIIllIlIlIIl(g, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl());
                }
            }
        }
        return null;
    }
    
    protected IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl(final g g, final List list, final Random random, final int n, final int n2) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIlIlllIlIIIIIl()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    return IlIIIlIlIIIllIlIlIIl(g, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 4: {
                    return IlIIIlIlIIIllIlIlIIl(g, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 5: {
                    return IlIIIlIlIIIllIlIlIIl(g, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl());
                }
                case 6: {
                    return IlIIIlIlIIIllIlIlIIl(g, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl());
                }
            }
        }
        return null;
    }
    
    protected int IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        int n = 0;
        int n2 = 0;
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
        for (int i = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI; i <= this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl; ++i) {
            for (int j = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll; j <= this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl; ++j) {
                llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(j, 64, i);
                if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl)) {
                    n += Math.max(illlllllIIIlIIIlIlII.lllIIIIlllllIlIIllIl(llllIIIlIlllIlIIIIIl).lIIIlllIIIllIIIllIII(), illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII());
                    ++n2;
                }
            }
        }
        if (n2 == 0) {
            return -1;
        }
        return n / n2;
    }
    
    protected static boolean llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        return ilIlIIIlIIlIlIIlllIl != null && ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl > 10;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4) {
        if (this.llllIIIIlIIIlIlllIll < n4) {
            for (int i = this.llllIIIIlIIIlIlllIll; i < n4; ++i) {
                final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n + i, n3);
                final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(n2);
                final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(n + i, n3);
                if (!ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl))) {
                    break;
                }
                ++this.llllIIIIlIIIlIlllIll;
                final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = new IlIlIllllllllIIIIlII(illlllllIIIlIIIlIlII);
                ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll + 0.5, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl + 0.5, 0.0f, 0.0f);
                ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new IlIlIlIlIlllllllllIl(ilIlIllllllllIIIIlII)), null);
                ilIlIllllllllIIIIlII.lllIIIIlllllIlIIllIl(this.llIllIIIIIllIlIIIIlI(i, ilIlIllllllllIIIIlII.an()));
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII);
            }
        }
    }
    
    protected int llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        return n2;
    }
    
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.IlIlIlIlIlllllllllIl) {
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl) {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll();
            }
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI) {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
            }
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI(bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl());
            }
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl) {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI));
            }
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII) {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cm.IIIIIIIIIlllIllIlIlI));
            }
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll) {
                return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.lllIllIIIllllllIllll();
            }
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2, final int n3, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl), n, n2, n3, ilIlIIIlIIlIlIIlllIl);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2, final boolean b) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n, n2, n3, n4, n5, n6, this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl), this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl2), b);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2, final int n3, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        super.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl), n, n2, n3, ilIlIIIlIIlIlIIlllIl);
    }
    
    protected void llllIIIIlIIIlIlllIll(final boolean ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    static /* synthetic */ int[] llllIIIlIlllIlIIIIIl() {
        final int[] llIllIIIIIllIlIIIIlI = i.llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        final int[] llIllIIIIIllIlIIIIlI2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llIllIIIIIllIlIIIIlI2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return i.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
}
