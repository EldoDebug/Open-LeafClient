package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

class IIIIlllIIIIIIlIIIlll implements llIllIIIIIllIlIIIIlI
{
    private final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    
    IIIIlllIIIIIIlIIIlll() {
        this.IlIlIlIlIlllllllllIl = new llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllllIIIIIlIIlllIlIl.IllIIlllIIIIlllIIlIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()) ? new llllIIllllIlIlIIIIll(this, lllIIIIlIlIllIIlIIIl).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl) : this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl);
    }
}
