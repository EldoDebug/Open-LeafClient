package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

class llllIIIlIlllIlIIIIIl extends llllIIIIlIIIlIlllIll
{
    private boolean IlIlIlIlIlllllllllIl;
    
    llllIIIlIlllIlIIIIIl() {
        this.IlIlIlIlIlllllllllIl = true;
    }
    
    @Override
    protected lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll == net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII())) {
            final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl()));
            if (IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2)) {
                if (!llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(2005, llllIIIIlIIIlIlllIll2, 0);
                }
            }
            else {
                this.IlIlIlIlIlllllllllIl = false;
            }
            return lllIIIIlIlIllIIlIIIl;
        }
        return super.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI, lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (this.IlIlIlIlIlllllllllIl) {
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1000, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), 0);
        }
        else {
            ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(1001, ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI(), 0);
        }
    }
}
