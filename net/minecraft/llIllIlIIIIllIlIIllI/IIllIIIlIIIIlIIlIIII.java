package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class IIllIIIlIIIIlIIlIIII extends IlIIIlIlIIIllIlIlIIl
{
    private llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    
    public IIllIIIlIIIIlIIlIIII(final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll ilIlIlIlIlllllllllIl, final float n, final float n2, final float n3) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI && (int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cf.IIIIIIIIIlllIllIlIlI) < 1) {
            ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
        }
        else if (!llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
            llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
            return false;
        }
        if (illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, llllIIIIlIIIlIlllIll2, false, ilIlIlIlIlllllllllIl, null, lllIIIIlIlIllIIlIIIl) && illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl, n, n2, n3, 0, llllIIIIlIIIlIlllIll), 3)) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
            if (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() == this.llllIIIlIlllIlIIIIIl) {
                IIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, lllIIIIlIlIllIIlIIIl);
                ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl3, llllIIIIlIIIlIlllIll, lllIIIIlIlIllIIlIIIl);
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() + 0.5f, llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() + 0.5f, llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() + 0.5f, this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(), (this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() + 1.0f) / 2.0f, this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.8f);
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            return true;
        }
        return false;
    }
}
