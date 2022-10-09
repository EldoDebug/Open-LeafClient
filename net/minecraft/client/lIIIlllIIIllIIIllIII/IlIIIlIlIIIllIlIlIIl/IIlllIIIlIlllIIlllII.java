package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

class IIlllIIIlIlllIIlllII implements IIlIIIlllIllIllIlIII
{
    final /* synthetic */ IIlllIlIIllIlIlIlIIl llllIIIIlIIIlIlllIll;
    
    IIlllIIIlIlllIIlllII(final IIlllIlIIllIlIlIlIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllllIIIIIlIIlllIlIl.IllIIlllIIIIlllIIlIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()) ? new llllIIIlIlllIlIIIIIl("bottle_splash", "inventory") : new llllIIIlIlllIlIIIIIl("bottle_drinkable", "inventory");
    }
}
