package net.optifine;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

class IlIlIIIlIIlIlIIlllIl implements IIlIIIIlllIlllllIlII
{
    @Override
    public int llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI != null) ? lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl) : llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return lllIIIIlllllIlIIllIl.IlIlIIIllIllIIIIIllI == null;
    }
}
