package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIlIIlIIIIlllIlllII
{
    private static final List llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = Lists.newArrayList((Object[])new k[] { new k(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, 0, 1, 5, 10), new k(IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, 0, 1, 3, 5), new k(IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII, 0, 4, 9, 5), new k(IIllIIllIIIlIlIIIIlI.a, IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(), 4, 9, 5), new k(IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, 0, 1, 2, 3), new k(IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, 0, 3, 8, 10), new k(IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII, 0, 1, 3, 15), new k(IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl, 0, 1, 1, 1), new k(IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll), 0, 4, 8, 1), new k(IIllIIllIIIlIlIIIIlI.l, 0, 2, 4, 10), new k(IIllIIllIIIlIlIIIIlI.k, 0, 2, 4, 10), new k(IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, 0, 1, 1, 3), new k(IIllIIllIIIlIlIIIIlI.ao, 0, 1, 1, 1) });
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.class, "MSCorridor");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(IIlllIlIIllIlIlIlIIl.class, "MSCrossing");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.class, "MSRoom");
        IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.class, "MSStairs");
    }
    
    private static IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll(final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        final int nextInt = random.nextInt(100);
        if (nextInt >= 80) {
            final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(list, random, n, n2, n3, lllIllIIIllllllIllll);
            if (llllIIIIlIIIlIlllIll != null) {
                return new IIlllIlIIllIlIlIlIIl(n4, random, llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll);
            }
        }
        else if (nextInt >= 70) {
            final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll2 = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(list, random, n, n2, n3, lllIllIIIllllllIllll);
            if (llllIIIIlIIIlIlllIll2 != null) {
                return new lllllIlIIIlIlIIlllII(n4, random, llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll);
            }
        }
        else {
            final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll3 = IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(list, random, n, n2, n3, lllIllIIIllllllIllll);
            if (llllIIIIlIIIlIlllIll3 != null) {
                return new IlIlIllllllllIIIIlII(n4, random, llllIIIIlIIIlIlllIll3, lllIllIIIllllllIllll);
            }
        }
        return null;
    }
    
    private static IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final List list, final Random random, final int n, final int n2, final int n3, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n4) {
        if (n4 > 8) {
            return null;
        }
        if (Math.abs(n - illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll) <= 80 && Math.abs(n3 - illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI) <= 80) {
            final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(list, random, n, n2, n3, lllIllIIIllllllIllll, n4 + 1);
            if (llllIIIIlIIIlIlllIll != null) {
                list.add(llllIIIIlIIIlIlllIll);
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, list, random);
            }
            return llllIIIIlIIIlIlllIll;
        }
        return null;
    }
}
