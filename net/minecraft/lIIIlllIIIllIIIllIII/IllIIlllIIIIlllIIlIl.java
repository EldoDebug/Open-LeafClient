package net.minecraft.lIIIlllIIIllIIIllIII;

import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IllIIlllIIIIlllIIlIl extends llllIIIIlIIIlIlllIll
{
    private boolean IlIlIlIlIlllllllllIl;
    
    IllIIlllIIIIlllIIlIl() {
        this.IlIlIlIlIlllllllllIl = true;
    }
    
    @Override
    protected lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI().llllIIIIlIIIlIlllIll(IllIllIlllIllllIIllI.IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl()));
        if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2)) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll());
            if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(1, llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll)) {
                lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 0;
            }
        }
        else if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII) {
            net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(db.IIIIIIIIIlllIllIlIlI, true));
            llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2);
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
