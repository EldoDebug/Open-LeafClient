package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class llIIlIIIlIIIllIlIIIl extends llllIIIIlIIIlIlllIll
{
    private boolean IlIlIlIlIlllllllllIl;
    
    llIIlIIIlIIIllIlIIIl() {
        this.IlIlIlIlIlllllllllIl = true;
    }
    
    @Override
    protected lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl()));
        final aj aj = (aj)net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI;
        if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2) && aj.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2)) {
            if (!llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, aj.lllIllIIIllllllIllll(), 3);
            }
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        }
        else {
            this.IlIlIlIlIlllllllllIl = false;
        }
        return lllIIIIlIlIllIIlIIIl;
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
