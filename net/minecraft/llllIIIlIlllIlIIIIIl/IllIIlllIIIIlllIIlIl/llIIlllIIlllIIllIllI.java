package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;

class llIIlllIIlllIIllIllI implements llIIIlIlIllIIlIlIlII
{
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    
    public llIIlllIIlllIIllIllI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final Random random) {
        int llllIIIIlIIIlIlllIll = 1;
        if (this.IlIlIlIlIlllllllllIl != null) {
            llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random);
        }
        ilIlIlIlIlllllllllIl.add(new llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.S, llllIIIIlIIIlIlllIll, 0), lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(random, new lllIIIIlIlIllIIlIIIl(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), 1, this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()), 5 + random.nextInt(15))));
    }
}
