package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIllIIllIIIlIlIIIIlI extends lllIllIIIllllllIllll
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public IIllIIllIIIlIlIIIIlI(final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aF;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        while (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 2) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI) {
            return false;
        }
        final int n = random.nextInt(this.IlIlIlIlIlllllllllIl - 2) + 2;
        final int n2 = 1;
        for (int i = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n; i <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n; ++i) {
            for (int j = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n; j <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n; ++j) {
                final int n3 = i - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                final int n4 = j - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                if (n3 * n3 + n4 * n4 <= n * n) {
                    for (int k = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - n2; k <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n2; ++k) {
                        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(i, k, j);
                        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
                        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
                        }
                    }
                }
            }
        }
        return true;
    }
}
