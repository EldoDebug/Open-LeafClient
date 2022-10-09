package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIlIIlllIIlIIlIlllIl extends IlIIIlIlIIIllIlIlIIl
{
    public lIlIIlllIIlIIlIlllIl() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, true);
        if (llllIIIIlIIIlIlllIll2 == null) {
            return lllIIIIlIlIllIIlIIIl;
        }
        if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
            if (!illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll3)) {
                return lllIIIIlIlIllIIlIIIl;
            }
            if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl), llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl, lllIIIIlIlIllIIlIIIl)) {
                return lllIIIIlIlIllIIlIIIl;
            }
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
                if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                    return new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.D);
                }
                if (!llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.D))) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.D, 1, 0), false);
                }
            }
        }
        return lllIIIIlIlIllIIlIIIl;
    }
}
