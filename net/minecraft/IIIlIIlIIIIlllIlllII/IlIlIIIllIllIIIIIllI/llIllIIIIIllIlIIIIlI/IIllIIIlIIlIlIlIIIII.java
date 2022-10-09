package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

class IIllIIIlIIlIlIlIIIII implements IIIllIIIlIlIIllIIIlI
{
    private IIllIIIlIIlIlIlIIIII() {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl) {
        return lllllIIlIlIIIlIlIIIl.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] && !lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public IlIIlllllIIllIIlllll llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        lllllIIlIlIIIlIlIIIl.IlIIIlIlIIIllIlIlIIl = true;
        lllllIIlIlIIIlIlIIIl.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()].IlIIIlIlIIIllIlIlIIl = true;
        return new lIIIIlIlIllllIIlIllI(lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, random);
    }
}
