package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;

class lllllIlIIIlIlIIlllII implements llIIIlIlIllIIlIlIlII
{
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    public lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI;
    public IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    
    public lllllIlIIIlIlIIlllII(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2, final IIlIIIIIllIlIIIlIIll ilIIIlIlIIIllIlIlIIl3) {
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl2);
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl3;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final Random random) {
        int llllIIIIlIIIlIlllIll = 1;
        if (this.IlIlIlIlIlllllllllIl != null) {
            llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random);
        }
        int llllIIIIlIIIlIlllIll2 = 1;
        if (this.IlIIIlIlIIIllIlIlIIl != null) {
            llllIIIIlIIIlIlllIll2 = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(random);
        }
        ilIlIlIlIlllllllllIl.add(new llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()), new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.S), new lllIIIIlIlIllIIlIIIl(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll2, this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII())));
    }
}
