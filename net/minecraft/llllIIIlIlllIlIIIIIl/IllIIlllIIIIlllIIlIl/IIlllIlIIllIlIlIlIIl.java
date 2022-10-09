package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;

class IIlllIlIIllIlIlIlIIl implements llIIIlIlIllIIlIlIlII
{
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    
    public IIlllIlIIllIlIlIlIIl(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll, final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final Random random) {
        int llllIIIIlIIIlIlllIll = 1;
        if (this.IlIlIlIlIlllllllllIl != null) {
            llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random);
        }
        ilIlIlIlIlllllllllIl.add(new llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(this.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll, 0), IIllIIllIIIlIlIIIIlI.S));
    }
}
