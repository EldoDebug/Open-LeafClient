package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class lllllIlIIIlIlIIlllII extends IlllllllIIIlIIIlIlII
{
    private static volatile /* synthetic */ int[] llllIIIIlIIIlIlllIll;
    
    public lllllIlIIIlIlIIlllII() {
    }
    
    public lllllIlIIIlIlIIlllII(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl(n, n2 - 5, n3, n, n2 + 2, n3);
        switch (llllIIIIlIIIlIlllIll()[lllIllIIIllllllIllll.ordinal()]) {
            case 3: {
                ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + 2;
                ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI = n3 - 8;
                break;
            }
            case 4: {
                ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + 2;
                ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + 8;
                break;
            }
            case 5: {
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll = n - 8;
                ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + 2;
                break;
            }
            case 6: {
                ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = n + 8;
                ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl = n3 + 2;
                break;
            }
        }
        return (IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, ilIlIIIlIIlIlIIlllIl) != null) ? null : ilIlIIIlIIlIlIIlllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        final int ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIIlIIIlIlllIll()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, ilIIIlIlIIIllIlIlIIl);
                    break;
                }
                case 4: {
                    IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl);
                    break;
                }
                case 5: {
                    IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, ilIIIlIlIIIllIlIlIIl);
                    break;
                }
                case 6: {
                    IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, ilIIIlIlIIIllIlIlIIl);
                    break;
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 0, 2, 7, 1, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 7, 2, 2, 8, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        for (int i = 0; i < 5; ++i) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5 - i - ((i < 4) ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        }
        return true;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] llllIIIIlIIIlIlllIll = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll != null) {
            return llllIIIIlIIIlIlllIll;
        }
        final int[] llllIIIIlIIIlIlllIll2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            llllIIIIlIIIlIlllIll2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
    }
}
