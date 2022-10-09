package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIlIIIllIllIIIIIllI extends lllIllIIIllllllIllll
{
    private final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    
    public IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        super(false);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        while (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 3) {
            if (!illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl())) {
                final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
                    break;
                }
            }
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() <= 3) {
            return false;
        }
        for (int ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl, n = 0; ilIlIlIlIlllllllllIl2 >= 0 && n < 3; ++n) {
            final int n2 = ilIlIlIlIlllllllllIl2 + random.nextInt(2);
            final int n3 = ilIlIlIlIlllllllllIl2 + random.nextInt(2);
            final int n4 = ilIlIlIlIlllllllllIl2 + random.nextInt(2);
            final float n5 = (n2 + n3 + n4) * 0.333f + 0.5f;
            for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 : net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-n2, -n3, -n4), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n2, n3, n4))) {
                if (ilIlIlIlIlllllllllIl3.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl) <= n5 * n5) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 4);
                }
            }
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-(ilIlIlIlIlllllllllIl2 + 1) + random.nextInt(2 + ilIlIlIlIlllllllllIl2 * 2), 0 - random.nextInt(2), -(ilIlIlIlIlllllllllIl2 + 1) + random.nextInt(2 + ilIlIlIlIlllllllllIl2 * 2));
        }
        return true;
    }
}
