package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

class IlIlIIIIIIlllIlIllIl extends llllIIIIlIIIlIlllIll
{
    private final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    
    IlIlIIIIIIlllIlIllIl() {
        this.IlIlIlIlIlllllllllIl = new llllIIIIlIIIlIlllIll();
    }
    
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI2 = IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl());
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        final double n = ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() + ilIlIIIllIllIIIIIllI2.lIIIIlIIIIIlllIllIII() * 1.125f;
        final double n2 = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI() + ilIlIIIllIllIIIIIllI2.lIIIlllIIIllIIIllIII() * 1.125f;
        final double n3 = ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl() + ilIlIIIllIllIIIIIllI2.llIIlIIIlIIIllIlIIIl() * 1.125f;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI2);
        final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
        double n4;
        if (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.equals(illIIlllIIIIlllIIlIl)) {
            n4 = 1.0;
        }
        else {
            if (!net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.equals(illIIlllIIIIlllIIlIl) || !net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.equals(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl())) {
                return this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl);
            }
            n4 = 0.0;
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, n, n2 + n4, n3));
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(1);
        return lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1000, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), 0);
    }
}
