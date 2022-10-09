package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIllllllIIllIlIlIlII extends lllIllIIIllllllIllll
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public lIllllllIIllIlIlIlII(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            return false;
        }
        final int n = random.nextInt(this.IlIlIlIlIlllllllllIl - 2) + 2;
        final int n2 = 2;
        for (int i = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n; i <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n; ++i) {
            for (int j = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n; j <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n; ++j) {
                final int n3 = i - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                final int n4 = j - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                if (n3 * n3 + n4 * n4 <= n * n) {
                    for (int k = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - n2; k <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n2; ++k) {
                        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(i, k, j);
                        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
                        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
                        }
                    }
                }
            }
        }
        return true;
    }
}
