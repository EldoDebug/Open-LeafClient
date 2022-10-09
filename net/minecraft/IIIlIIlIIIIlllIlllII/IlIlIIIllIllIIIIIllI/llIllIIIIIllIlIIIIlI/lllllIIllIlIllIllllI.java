package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class lllllIIllIlIllIllllI implements IIIllIIIlIlIIllIIIlI
{
    private lllllIIllIlIllIllllI() {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl) {
        return lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()] && !lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public IlIIlllllIIllIIlllll llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl2 = lllllIIlIlIIIlIlIIIl;
        if (!lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()] || lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl) {
            lllllIIlIlIIIlIlIIIl2 = lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()];
        }
        lllllIIlIlIIIlIlIIIl2.IlIIIlIlIIIllIlIlIIl = true;
        lllllIIlIlIIIlIlIIIl2.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        return new IlIIllIIllIIllIIlIIl(lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl2, random);
    }
}
