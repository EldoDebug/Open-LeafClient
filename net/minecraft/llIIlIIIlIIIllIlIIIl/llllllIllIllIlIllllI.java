package net.minecraft.llIIlIIIlIIIllIlIIIl;

import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llllllIllIllIlIllllI
{
    private static final Random llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new Random();
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), llIIIlIlIllIIlIlIlII);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, llIIIlIlIllIIlIlIlII);
    }
    
    private static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        for (int i = 0; i < llIIIlIlIllIIlIlIlII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = llIIIlIlIllIIlIlIlII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n, n2, n3, lIlIlIIIllIIllIIIllI);
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final float n4 = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll.nextFloat() * 0.8f + 0.1f;
        final float n5 = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll.nextFloat() * 0.8f + 0.1f;
        final float n6 = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll.nextFloat() * 0.8f + 0.1f;
        while (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > 0) {
            int ilIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll.nextInt(21) + 10;
            if (ilIlIlIlIlllllllllIl > lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl) {
                ilIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl -= ilIlIlIlIlllllllllIl;
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, n + n4, n2 + n5, n3 + n6, new lllIIIIlIlIllIIlIIIl(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(), ilIlIlIlIlllllllllIl, lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()));
            if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
                liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII().IlIIIlIlIIIllIlIlIIl((IIIIlllIIIIIIlIIIlll)lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl());
            }
            final float n7 = 0.05f;
            liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll.nextGaussian() * n7;
            liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll.nextGaussian() * n7 + 0.20000000298023224;
            liiIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll.nextGaussian() * n7;
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        }
    }
}
