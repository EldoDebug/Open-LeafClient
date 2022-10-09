package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;

class IIlllIIIlIlllIIlllII implements llIIIlIlIllIIlIlIlII
{
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    
    public IIlllIIIlIlllIIlllII(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public IIlllIIIlIlllIIlllII(final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll, final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final Random random) {
        int llllIIIIlIIIlIlllIll = 1;
        if (this.IlIlIlIlIlllllllllIl != null) {
            llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random);
        }
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl;
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2;
        if (llllIIIIlIIIlIlllIll < 0) {
            lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.S, 1, 0);
            lllIIIIlIlIllIIlIIIl2 = new lllIIIIlIlIllIIlIIIl(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), -llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
        }
        else {
            lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.S, llllIIIIlIIIlIlllIll, 0);
            lllIIIIlIlIllIIlIIIl2 = new lllIIIIlIlIllIIlIIIl(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), 1, this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
        }
        ilIlIlIlIlllllllllIl.add(new llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, lllIIIIlIlIllIIlIIIl2));
    }
}
