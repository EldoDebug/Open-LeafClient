package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class d extends f
{
    private int llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    public d() {
    }
    
    public d(final g g, final int n, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIllIllIIIIIllI, final lllIllIIIllllllIllll illIIlllIIIIlllIIlIl) {
        super(g, n);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = Math.max(ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(), ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI());
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Length", this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Length");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random) {
        boolean b = false;
        for (int i = random.nextInt(5); i < this.llllIIIIlIIIlIlllIll - 8; i += 2 + random.nextInt(5)) {
            final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll((g)illlllllIIIlIIIlIlII, list, random, 0, i);
            if (llllIIIIlIIIlIlllIll != null) {
                i += Math.max(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI());
                b = true;
            }
        }
        for (int j = random.nextInt(5); j < this.llllIIIIlIIIlIlllIll - 8; j += 2 + random.nextInt(5)) {
            final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl((g)illlllllIIIlIIIlIlII, list, random, 0, j);
            if (ilIlIlIlIlllllllllIl != null) {
                j += Math.max(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(), ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI());
                b = true;
            }
        }
        if (b && random.nextInt(3) > 0 && this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIIlIIIlIlllIll()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
                case 4: {
                    IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 2, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
                case 5: {
                    IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
                case 6: {
                    IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
            }
        }
        if (b && random.nextInt(3) > 0 && this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIIlIIIlIlllIll()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
                case 4: {
                    IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl - 2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
                case 5: {
                    IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
                case 6: {
                    IlIlIIIllIllIIIIIllI((g)illlllllIIIlIIIlIlII, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl - 2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl());
                    break;
                }
            }
        }
    }
    
    public static IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll(final g g, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        for (int i = 7 * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, 3, 5); i >= 7; i -= 7) {
            final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n, n2, n3, 0, 0, 0, 3, 3, i, lllIllIIIllllllIllll);
            if (IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(list, llllIIIIlIIIlIlllIll) == null) {
                return llllIIIIlIIIlIlllIll;
            }
        }
        return null;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.lllIllIIIllllllIllll());
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll());
        for (int i = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll; i <= this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl; ++i) {
            for (int j = this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI; j <= this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl; ++j) {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(i, 64, j);
                if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl)) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.lllIIIIlllllIlIIllIl(ilIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl();
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll, 2);
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(), llllIIIIlIIIlIlllIll2, 2);
                }
            }
        }
        return true;
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] ilIlIlIlIlllllllllIl = d.IlIlIlIlIlllllllllIl;
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
        return d.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
