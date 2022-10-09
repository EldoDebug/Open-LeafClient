package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class IIIIIlllIlIIIIIIIllI extends IIlllIIIlIlllIIlllII
{
    public IIIIIlllIlIIIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super(llllIIIIlIIIlIlllIll);
        this.IlIIIlIlIIIllIlIlIIl(0);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
            return false;
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl;
        if ((lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl || llllIIIIlIIIlIlllIll2 != this.llllIIIlIlllIlIIIIIl) && !llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
            llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            llIIlIIIlIIIllIlIIIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3);
            llllIIIIlIIIlIlllIll2 = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        }
        if (llllIIIIlIIIlIlllIll2 == this.llllIIIlIlllIlIIIIIl) {
            final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cf.IIIIIIIIIlllIllIlIlI);
            if (intValue <= 7) {
                final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll4 = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(cf.IIIIIIIIIlllIllIlIlI, intValue + 1);
                final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll5 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll4);
                if (llllIIIIlIIIlIlllIll5 != null && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll5) && illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll4, 2)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.lIIIIlIIIIIlllIllIII() + 0.5f, llllIIIIlIIIlIlllIll3.lIIIlllIIIllIIIllIII() + 0.5f, llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl() + 0.5f, this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(), (this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() + 1.0f) / 2.0f, this.llllIIIlIlllIlIIIIIl.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.8f);
                    --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                    return true;
                }
            }
        }
        return super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll3, lllIllIIIllllllIllll, n, n2, n3);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return n;
    }
}
