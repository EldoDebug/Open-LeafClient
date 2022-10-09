package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class j extends i
{
    private static volatile /* synthetic */ int[] llllIIIIlIIIlIlllIll;
    
    public j() {
    }
    
    public j(final g g, final int n, final Random random, final int n2, final int n3) {
        super(g, n);
        this.IllIIlllIIIIlllIIlIl = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(random);
        switch (lIIIIlIIIIIlllIllIII()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
            case 3:
            case 4: {
                this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n2, 64, n3, n2 + 6 - 1, 78, n3 + 6 - 1);
                break;
            }
            default: {
                this.IlIlIIIllIllIIIIIllI = new IlIlIIIlIIlIlIIlllIl(n2, 64, n3, n2 + 6 - 1, 78, n3 + 6 - 1);
                break;
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI - 4, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl());
        IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI - 4, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + 1, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
        IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI - 4, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl());
        IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + 1, this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI - 4, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llIllIlIIIIllIlIIllI < 0) {
            this.llIllIlIIIIllIlIIllI = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl);
            if (this.llIllIlIIIIllIlIIllI < 0) {
                return true;
            }
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(0, this.llIllIlIIIIllIlIIllI - this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI + 3, 0);
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 0, 1, 4, 12, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.lllIllIIIllllllIllll(), false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2, 12, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 3, 12, 2, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2, 12, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 3, 12, 3, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 1, 13, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 1, 14, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 4, 13, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 4, 14, 1, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 1, 13, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 1, 14, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 4, 13, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII.lllIllIIIllllllIllll(), 4, 14, 4, ilIlIIIlIIlIlIIlllIl);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 15, 1, 4, 15, 4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), false);
        for (int i = 0; i <= 5; ++i) {
            for (int j = 0; j <= 5; ++j) {
                if (j == 0 || j == 5 || i == 0 || i == 5) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.lllIllIIIllllllIllll(), j, 11, i, ilIlIIIlIIlIlIIlllIl);
                    this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, j, 12, i, ilIlIIIlIIlIlIIlllIl);
                }
            }
        }
        return true;
    }
    
    static /* synthetic */ int[] lIIIIlIIIIIlllIllIII() {
        final int[] llllIIIIlIIIlIlllIll = j.llllIIIIlIIIlIlllIll;
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
        return j.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll2;
    }
}
