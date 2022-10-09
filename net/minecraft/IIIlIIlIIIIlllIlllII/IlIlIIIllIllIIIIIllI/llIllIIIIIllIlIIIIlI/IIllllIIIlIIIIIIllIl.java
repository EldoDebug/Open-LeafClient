package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IIllllIIIlIIIIIIllIl extends IIlIlIlIIlIllIIIIIIl
{
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    public IIllllIIIlIIIIIIllIl() {
    }
    
    public IIllllIIIlIIIIIIllIl(final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    protected IIllllIIIlIIIIIIllIl(final Random random, final int n, final int n2) {
        super(0);
        this.IllIIlllIIIIlllIIlIl = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(random);
        switch (llllIIIIlIIIlIlllIll()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
            case 3:
            case 4: {
                this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
                break;
            }
            default: {
                this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
                break;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        this.llllIIIIlIIIlIlllIll((IllIllIlllIllllIIllI)illlllllIIIlIIIlIlII, list, random, 8, 3, false);
        this.IlIlIlIlIlllllllllIl((IllIllIlllIllllIIllI)illlllllIIIlIIIlIlII, list, random, 3, 8, false);
        this.llIllIIIIIllIlIIIIlI((IllIllIlllIllllIIllI)illlllllIIIlIIIlIlII, list, random, 3, 8, false);
    }
    
    public static IIllllIIIlIIIIIIllIl llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, -8, -3, 0, 19, 10, 19, lllIllIIIllllllIllll);
        return (IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) ? new IIllllIIIlIIIIIIllIl(n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll) : null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 3, 0, 11, 4, 18, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 7, 18, 4, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 5, 0, 10, 7, 18, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 8, 18, 7, 10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 5, 0, 7, 5, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 5, 11, 7, 5, 18, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 5, 0, 11, 5, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 5, 11, 11, 5, 18, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 7, 7, 5, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 5, 7, 18, 5, 7, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 5, 11, 7, 5, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 5, 11, 18, 5, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 0, 11, 2, 5, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 13, 11, 2, 18, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 0, 0, 11, 1, 3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 0, 15, 11, 1, 18, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        for (int i = 7; i <= 11; ++i) {
            for (int j = 0; j <= 2; ++j) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), i, -1, j, ilIlIIIlIIlIlIIlllIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), i, -1, 18 - j, ilIlIIIlIIlIlIIlllIl);
            }
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 7, 5, 2, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 13, 2, 7, 18, 2, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, 7, 3, 1, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 0, 7, 18, 1, 11, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), false);
        for (int k = 0; k <= 2; ++k) {
            for (int l = 7; l <= 11; ++l) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), k, -1, l, ilIlIIIlIIlIlIIlllIl);
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C.lllIllIIIllllllIllll(), 18 - k, -1, l, ilIlIIIlIIlIlIIlllIl);
            }
        }
        return true;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] ilIlIlIlIlllllllllIl = IIllllIIIlIIIIIIllIl.IlIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl != null) {
            return ilIlIlIlIlllllllllIl;
        }
        final int[] ilIlIlIlIlllllllllIl2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            ilIlIlIlIlllllllllIl2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return IIllllIIIlIIIIIIllIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
