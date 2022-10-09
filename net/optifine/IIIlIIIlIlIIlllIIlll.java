package net.optifine;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

class IIIlIIIlIlIIlllIIlll implements IIlIIIIlllIlllllIlII
{
    @Override
    public int llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl != null) ? lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl) : llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl == null;
    }
}
