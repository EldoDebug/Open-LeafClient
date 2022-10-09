package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

class IlIlIIIllIllIIIIIllI extends llllIIIIlIIIlIlllIll
{
    private final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    
    IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl = new llllIIIIlIIIlIlllIll();
    }
    
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final net.minecraft.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl()));
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl();
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl;
        if (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.equals(illIIlllIIIIlllIIlIl) && llIllIIIIIllIlIIIIlI instanceof IlIIlllIIlIlllllIIlI && (int)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl) == 0) {
            ilIIIlIlIIIllIlIlIIl = IIllIIllIIIlIlIIIIlI.lllllIIIIIlIIlllIlIl;
        }
        else {
            if (!net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.equals(illIIlllIIIIlllIIlIl) || !(llIllIIIIIllIlIIIIlI instanceof IlIIlllIIlIlllllIIlI) || (int)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl) != 0) {
                return super.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl);
            }
            ilIIIlIlIIIllIlIlIIl = IIllIIllIIIlIlIIIIlI.IlIllllIIIlIllIlIIll;
        }
        llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2);
        final int ilIlIlIlIlllllllllIl2 = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl - 1;
        lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl2;
        if (ilIlIlIlIlllllllllIl2 == 0) {
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 1;
        }
        else if (((lllIIIIlllllIlIIllIl)ilIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl()).llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl)) < 0) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl));
        }
        return lllIIIIlIlIllIIlIIIl;
    }
}
