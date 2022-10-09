package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;

public class lllllIIIIIlIlIIIIIIl extends IllIllIlllIllllIIllI
{
    private final llIllIIIIIllIlIIIIlI llIllIlIlIIIIIIIllII;
    
    public lllllIIIIIlIlIIIIIIl() {
        this.llIllIlIlIIIIIIIllII = new net.minecraft.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    protected llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.llIllIlIlIIIIIIIllII;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n) {
        return new IlIlIIIIIIlllIlIllIl();
    }
    
    @Override
    protected void lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final ci ci = new ci(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)ci.llllIIIlIlllIlIIIIIl();
        if (lllIIIIlllllIlIIllIl != null) {
            final int iiIlIIIlIlIIlllIIlll = lllIIIIlllllIlIIllIl.IIIlIIIlIlIIlllIIlll();
            if (iiIlIIIlIlIIlllIIlll < 0) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(1001, ilIlIlIlIlllllllllIl, 0);
            }
            else {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = lllIIIIlllllIlIIllIl.lIlIlIIIllIIllIIIllI(iiIlIIIlIlIIlllIIlll);
                if (lIlIlIIIllIIllIIIllI != null) {
                    final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl.IIIIIIIIIlllIllIlIlI);
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                    final llIIIlIlIllIIlIlIlII ilIlIlIlIlllllllllIl2 = net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
                    lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl;
                    if (ilIlIlIlIlllllllllIl2 == null) {
                        lllIIIIlIlIllIIlIIIl = this.llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(ci, lIlIlIIIllIIllIIIllI);
                        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                            lllIIIIlIlIllIIlIIIl = null;
                        }
                    }
                    else if (net.minecraft.IlIlIIIlIIlIlIIlllIl.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(1), lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI()) == null) {
                        final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl;
                        lllIIIIlIlIllIIlIIIl = (llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl());
                        if (--llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                            lllIIIIlIlIllIIlIIIl = null;
                        }
                    }
                    else {
                        lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
                    }
                    lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(iiIlIIIlIlIIlllIIlll, lllIIIIlIlIllIIlIIIl);
                }
            }
        }
    }
}
