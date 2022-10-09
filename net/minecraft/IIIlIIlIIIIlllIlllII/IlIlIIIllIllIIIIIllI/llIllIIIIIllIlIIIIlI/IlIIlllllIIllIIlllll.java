package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public abstract class IlIIlllllIIllIIlllll extends IlllllllIIIlIIIlIlII
{
    protected static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    protected static final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    protected static final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    protected static final llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl;
    protected static final llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII;
    protected static final llIIlIIIlIIIllIlIIIl lIIIlllIIIllIIIllIII;
    protected static final int llIIlIIIlIIIllIlIIIl;
    protected static final int llIllIlIIIIllIlIIllI;
    protected static final int lIlIlIIIllIIllIIIllI;
    protected static final int IlIlIIIllIIllIlllllI;
    protected lllllIIlIlIIIlIlIIIl IIIIlllIIIIIIlIIIlll;
    private static volatile /* synthetic */ int[] llllIIllllIlIlIIIIll;
    
    static {
        llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM.llIllIIIIIllIlIIIIlI(ah.IIllllIIIlIIIIIIllIl);
        IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM.llIllIIIIIllIlIIIIlI(ah.IlllIIIIlIIIlIlIlIIl);
        llIllIIIIIllIlIIIIlI = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM.llIllIIIIIllIlIIIIlI(ah.lllIllIIIllllllIllll);
        IlIIIlIlIIIllIlIlIIl = IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl;
        lIIIIlIIIIIlllIllIII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aN.lllIllIIIllllllIllll();
        lIIIlllIIIllIIIllIII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll();
        llIIlIIIlIIIllIlIIIl = IlIlIlIlIlllllllllIl(2, 0, 0);
        llIllIlIIIIllIlIIllI = IlIlIlIlIlllllllllIl(2, 2, 0);
        lIlIlIIIllIIllIIIllI = IlIlIlIlIlllllllllIl(0, 1, 0);
        IlIlIIIllIIllIlllllI = IlIlIlIlIlllllllllIl(4, 1, 0);
    }
    
    protected static final int IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        return n2 * 25 + n3 * 5 + n;
    }
    
    public IlIIlllllIIllIIlllll() {
        super(0);
    }
    
    public IlIIlllllIIllIIlllll(final int n) {
        super(n);
    }
    
    public IlIIlllllIIllIIlllll(final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI) {
        super(1);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    protected IlIIlllllIIllIIlllll(final int n, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl, final lllllIIlIlIIIlIlIIIl iiiIlllIIIIIIlIIIlll, final int n2, final int n3, final int n4) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IIIIlllIIIIIIlIIIlll = iiiIlllIIIIIIlIIIlll;
        final int llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll;
        final int n5 = llllIIIIlIIIlIlllIll % 5;
        final int n6 = llllIIIIlIIIlIlllIll / 5 % 5;
        final int n7 = llllIIIIlIIIlIlllIll / 25;
        if (illIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI && illIIlllIIIIlllIIlIl != lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(0, 0, 0, n4 * 8 - 1, n3 * 4 - 1, n2 * 8 - 1);
        }
        else {
            this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(0, 0, 0, n2 * 8 - 1, n3 * 4 - 1, n4 * 8 - 1);
        }
        switch (llllIIIlIlllIlIIIIIl()[illIIlllIIIIlllIIlIl.ordinal()]) {
            case 3: {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n5 * 8, n7 * 4, -(n6 + n4) * 8 + 1);
                break;
            }
            case 4: {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n5 * 8, n7 * 4, n6 * 8);
                break;
            }
            case 5: {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(-(n6 + n4) * 8 + 1, n7 * 4, n5 * 8);
                break;
            }
            default: {
                this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(n6 * 8, n7 * 4, n5 * 8);
                break;
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (!b || this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, j, i, k, ilIlIIIlIIlIlIIlllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        if (this.llllIIIIlIIIlIlllIll(i) >= illlllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl()) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), j, i, k, ilIlIIIlIIlIlIIlllIl);
                        }
                        else {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IlIIlllllIIllIIlllll.lIIIlllIIIllIIIllIII, j, i, k, ilIlIIIlIIlIlIIlllIl);
                        }
                    }
                }
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final boolean b) {
        if (b) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 0, 0, n2 + 0, n + 2, 0, n2 + 8 - 1, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 5, 0, n2 + 0, n + 8 - 1, 0, n2 + 8 - 1, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 3, 0, n2 + 0, n + 4, 0, n2 + 2, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 3, 0, n2 + 5, n + 4, 0, n2 + 8 - 1, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 3, 0, n2 + 2, n + 4, 0, n2 + 2, IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl, IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 3, 0, n2 + 5, n + 4, 0, n2 + 5, IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl, IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 2, 0, n2 + 3, n + 2, 0, n2 + 4, IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl, IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 5, 0, n2 + 3, n + 5, 0, n2 + 4, IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl, IlIIlllllIIllIIlllll.IlIlIlIlIlllllllllIl, false);
        }
        else {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n + 0, 0, n2 + 0, n + 8 - 1, 0, n2 + 8 - 1, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll, false);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, j, i, k, ilIlIIIlIIlIlIIlllIl) == IlIIlllllIIllIIlllll.lIIIlllIIIllIIIllIII) {
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl, j, i, k, ilIlIIIlIIlIlIIlllIl);
                    }
                }
            }
        }
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3, final int n4) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n, n2);
        final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(n, n2);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(n3, n4);
        final int ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(n3, n4);
        return ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(Math.min(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2), Math.min(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2), Math.max(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2), Math.max(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2));
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n, final int n2, final int n3) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n, n3);
        final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(n2);
        final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(n, n3);
        if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl))) {
            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = new lllIIIIlllllIlIIllIl(illlllllIIIlIIIlIlII);
            lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(true);
            lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl.U());
            lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll + 0.5, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl + 0.5, 0.0f, 0.0f);
            lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl)), null);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
            return true;
        }
        return false;
    }
    
    static /* synthetic */ int[] llllIIIlIlllIlIIIIIl() {
        final int[] llllIIllllIlIlIIIIll = IlIIlllllIIllIIlllll.llllIIllllIlIlIIIIll;
        if (llllIIllllIlIlIIIIll != null) {
            return llllIIllllIlIlIIIIll;
        }
        final int[] llllIIllllIlIlIIIIll2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llllIIllllIlIlIIIIll2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIllllIlIlIIIIll2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIllllIlIlIIIIll2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIllllIlIlIIIIll2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllIIllllIlIlIIIIll2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllIIllllIlIlIIIIll2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IlIIlllllIIllIIlllll.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll2;
    }
}
