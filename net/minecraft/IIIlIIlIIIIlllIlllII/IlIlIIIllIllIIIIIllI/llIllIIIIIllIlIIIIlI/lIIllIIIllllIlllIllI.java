package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class lIIllIIIllllIlllIllI implements IIIllIIIlIlIIllIIIlI
{
    private lIIllIIIllllIlllIllI() {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl) {
        return lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()] && !lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public IlIIlllllIIllIIlllll llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        lllllIIlIlIIIlIlIIIl.IlIIIlIlIIIllIlIlIIl = true;
        lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        return new lIlIlIlllIIlIlIlllIl(lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, random);
    }
}
