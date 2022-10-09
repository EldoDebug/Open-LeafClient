package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class lllllIIlIlIIIlIlIIIl
{
    private static e llllIIIIlIIIlIlllIll;
    
    static {
        lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll = new e(0.0, 0.0, 0.0);
    }
    
    public static e llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2) {
        return llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl, n, n2, null);
    }
    
    public static e llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2, final e e) {
        lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll = e.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl, llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII, llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII);
        return llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl, n, n2, lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll);
    }
    
    public static e IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2, final e e) {
        lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll = new e(llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl, llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII, llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII).IlIIIlIlIIIllIlIlIIl(e);
        return llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl, n, n2, lllllIIlIlIIIlIlIIIl.llllIIIIlIIIlIlllIll);
    }
    
    private static e llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n, final int n2, final e e) {
        final Random b = llIIlIIIlIIIllIlIIIl.B();
        boolean b2 = false;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        float n6 = -99999.0f;
        boolean b3;
        if (llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII()) {
            final double n7 = llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll().IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII)) + 4.0;
            final double n8 = llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl() + n;
            b3 = (n7 < n8 * n8);
        }
        else {
            b3 = false;
        }
        for (int i = 0; i < 10; ++i) {
            int n9 = b.nextInt(2 * n + 1) - n;
            final int n10 = b.nextInt(2 * n2 + 1) - n2;
            int n11 = b.nextInt(2 * n + 1) - n;
            if (e == null || n9 * e.llllIIIIlIIIlIlllIll + n11 * e.llIllIIIIIllIlIIIIlI >= 0.0) {
                if (llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII() && n > 1) {
                    final IlIlIlIlIlllllllllIl iIlllIIlIllIllIlIIll = llIIlIIIlIIIllIlIIIl.IIlllIIlIllIllIlIIll();
                    if (llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl > iIlllIIlIllIllIlIIll.lIIIIlIIIIIlllIllIII()) {
                        n9 -= b.nextInt(n / 2);
                    }
                    else {
                        n9 += b.nextInt(n / 2);
                    }
                    if (llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII > iIlllIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl()) {
                        n11 -= b.nextInt(n / 2);
                    }
                    else {
                        n11 += b.nextInt(n / 2);
                    }
                }
                final int n12 = n9 + llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl);
                final int n13 = n10 + llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII);
                final int n14 = n11 + llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII);
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(n12, n13, n14);
                if (!b3 || llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl)) {
                    final float llllIIIIlIIIlIlllIll = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                    if (llllIIIIlIIIlIlllIll > n6) {
                        n6 = llllIIIIlIIIlIlllIll;
                        n3 = n12;
                        n4 = n13;
                        n5 = n14;
                        b2 = true;
                    }
                }
            }
        }
        if (b2) {
            return new e(n3, n4, n5);
        }
        return null;
    }
}
