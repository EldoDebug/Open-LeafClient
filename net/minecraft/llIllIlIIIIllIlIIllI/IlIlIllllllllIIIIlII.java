package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class IlIlIllllllllIIIIlII extends llllIIIIlIIIlIlllIll
{
    @Override
    protected lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl()));
        final int liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
        final List llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII, llIIlIIIlIIIllIlIIIl, liiiIlIIIIIlllIllIII + 1, liiIlllIIIllIIIllIII + 1, llIIlIIIlIIIllIlIIIl + 1), Predicates.and(llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl, (Predicate)new IIllllIIIlIIIIIIllIl(lllIIIIlIlIllIIlIIIl)));
        if (llllIIIIlIIIlIlllIll2.size() > 0) {
            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = llllIIIIlIIIlIlllIll2.get(0);
            final int n = (lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) ? 1 : 0;
            final int ilIlIlIlIlllllllllIl = IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl);
            final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl2 = lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl();
            llIIlIIIlIIIllIlIIIl2.IlIlIlIlIlllllllllIl = 1;
            lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl - n, llIIlIIIlIIIllIlIIIl2);
            if (lllIIIIlllllIlIIllIl instanceof IlIllIlIlIIIlIlIlIII) {
                ((IlIllIlIlIIIlIlIlIII)lllIIIIlllllIlIIllIl).llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 2.0f);
            }
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            return lllIIIIlIlIllIIlIIIl;
        }
        return super.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl);
    }
}
