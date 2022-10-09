package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIlIIIIlllIlllllIlII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

class lIllllllIIllIlIlIlII implements llIIIlIlIllIIlIlIlII
{
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final Random random) {
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[random.nextInt(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.length)];
        final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(random, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll3 = IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2));
        int n = 2 + random.nextInt(5 + llllIIIIlIIIlIlllIll2 * 10) + 3 * llllIIIIlIIIlIlllIll2;
        if (n > 64) {
            n = 64;
        }
        ilIlIlIlIlllllllllIl.add(new net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.S, n), llllIIIIlIIIlIlllIll3));
    }
}
