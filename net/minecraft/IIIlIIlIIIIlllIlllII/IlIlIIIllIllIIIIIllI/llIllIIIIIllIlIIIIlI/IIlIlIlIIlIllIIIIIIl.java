package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import com.google.common.collect.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

abstract class IIlIlIlIIlIllIIIIIIl extends IlllllllIIIlIIIlIlII
{
    protected static final List llllIIIIlIIIlIlllIll;
    private static volatile /* synthetic */ int[] IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = Lists.newArrayList((Object[])new k[] { new k(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, 0, 1, 3, 5), new k(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, 0, 1, 5, 5), new k(IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, 0, 1, 3, 15), new k(IIllIIllIIIlIlIIIIlI.llIIIlIlIllIIlIlIlII, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.lIlIIlllIIlIIlIlllIl, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.C, 0, 3, 7, 5), new k(IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, 0, 1, 1, 10), new k(IIllIIllIIIlIlIIIIlI.ap, 0, 1, 1, 8), new k(IIllIIllIIIlIlIIIIlI.ao, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.aq, 0, 1, 1, 3), new k(IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl), 0, 2, 4, 2) });
    }
    
    public IIlIlIlIIlIllIIIIIIl() {
    }
    
    protected IIlIlIlIIlIllIIIIIIl(final int n) {
        super(n);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    private int llllIIIIlIIIlIlllIll(final List list) {
        boolean b = false;
        int n = 0;
        for (final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII : list) {
            if (illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl > 0 && illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI < illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl) {
                b = true;
            }
            n += illIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl;
        }
        return b ? n : -1;
    }
    
    private IIlIlIlIIlIllIIIIIIl llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI, final List list, final List list2, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(list);
        final boolean b = llllIIIIlIIIlIlllIll > 0 && n4 <= 30;
        int n5 = 0;
        while (n5 < 5 && b) {
            ++n5;
            int nextInt = random.nextInt(llllIIIIlIIIlIlllIll);
            for (final IllIllIIIIlIIlIlllII ilIlIlIlIlllllllllIl : list) {
                nextInt -= ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
                if (nextInt < 0) {
                    if (!ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n4)) {
                        break;
                    }
                    if (ilIlIlIlIlllllllllIl == illIllIlllIllllIIllI.IlIlIlIlIlllllllllIl && !ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI) {
                        break;
                    }
                    final IIlIlIlIIlIllIIIIIIl llllIIIIlIIIlIlllIll2 = IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, list2, random, n, n2, n3, lllIllIIIllllllIllll, n4);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII = ilIlIlIlIlllllllllIl;
                        ++illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
                        illIllIlllIllllIIllI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
                        if (!ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) {
                            list.remove(ilIlIlIlIlllllllllIl);
                        }
                        return llllIIIIlIIIlIlllIll2;
                    }
                    continue;
                }
            }
        }
        return IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(list2, random, n, n2, n3, lllIllIIIllllllIllll, n4);
    }
    
    private IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4, final boolean b) {
        if (Math.abs(n - illIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll) <= 112 && Math.abs(n3 - illIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI) <= 112) {
            List list2 = illIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI;
            if (b) {
                list2 = illIllIlllIllllIIllI.IlIIIlIlIIIllIlIlIIl;
            }
            final IIlIlIlIIlIllIIIIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list2, list, random, n, n2, n3, lllIllIIIllllllIllll, n4 + 1);
            if (llllIIIIlIIIlIlllIll != null) {
                list.add(llllIIIIlIIIlIlllIll);
                illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII.add(llllIIIIlIIIlIlllIll);
            }
            return llllIIIIlIIIlIlllIll;
        }
        return IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(list, random, n, n2, n3, lllIllIIIllllllIllll, n4);
    }
    
    protected IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI, final List list, final Random random, final int n, final int n2, final boolean b) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIlIlllIlIIIIIl()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n2, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 4: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n2, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 5: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n2, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n, this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 6: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n2, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n, this.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
            }
        }
        return null;
    }
    
    protected IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl(final IllIllIlllIllllIIllI illIllIlllIllllIIllI, final List list, final Random random, final int n, final int n2, final boolean b) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIlIlllIlIIIIIl()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 4: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll - 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 5: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 6: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI - 1, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
            }
        }
        return null;
    }
    
    protected IlllllllIIIlIIIlIlII llIllIIIIIllIlIIIIlI(final IllIllIlllIllllIIllI illIllIlllIllllIIllI, final List list, final Random random, final int n, final int n2, final boolean b) {
        if (this.IllIIlllIIIIlllIIlIl != null) {
            switch (llllIIIlIlllIlIIIIIl()[this.IllIIlllIIIIlllIIlIl.ordinal()]) {
                case 3: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 4: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl + 1, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI + n2, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 5: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
                case 6: {
                    return this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI, list, random, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll + n2, this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl + n, this.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl + 1, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, this.IlIIIlIlIIIllIlIlIIl(), b);
                }
            }
        }
        return null;
    }
    
    protected static boolean llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        return ilIlIIIlIIlIlIIlllIl != null && ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl > 10;
    }
    
    static /* synthetic */ int[] llllIIIlIlllIlIIIIIl() {
        final int[] ilIlIlIlIlllllllllIl = IIlIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl;
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
        return IIlIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
    }
}
