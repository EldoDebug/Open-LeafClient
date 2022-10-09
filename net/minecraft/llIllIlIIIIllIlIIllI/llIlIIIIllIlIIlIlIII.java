package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llIlIIIIllIlIIlIlIII extends IIlllIIIlIlllIIlllII
{
    private final cc lIIIIlIIIIIlllIllIII;
    private final cc lIIIlllIIIllIIIllIII;
    
    public llIlIIIIllIlIIlIlIII(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final cc liiiIlIIIIIlllIllIII, final cc liiIlllIIIllIIIllIII) {
        super(llllIIIIlIIIlIlllIll);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl(0);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return n;
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
            return false;
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        final Object llllIIIIlIIIlIlllIll2 = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this.lIIIIlIIIIIlllIllIII) {
            final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll ilIllllIIlIIlIlIlIll = this.lIIIIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll();
            final Comparable llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll);
            final cd cd = (cd)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI);
            if (((lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && cd == net.minecraft.llllIIIIlIIIlIlllIll.cd.IlIlIlIlIlllllllllIl) || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && cd == net.minecraft.llllIIIIlIIIlIlllIll.cd.llllIIIIlIIIlIlllIll)) && llllIIIIlIIIlIlllIll3 == llllIIIIlIIIlIlllIll2) {
                final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll4 = this.lIIIlllIIIllIIIllIII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, llllIIIIlIIIlIlllIll3);
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll4)) && illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll4, 3)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, this.lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(), (this.lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() + 1.0f) / 2.0f, this.lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.8f);
                    --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                }
                return true;
            }
        }
        return this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), llllIIIIlIIIlIlllIll2) || super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, n, n2, n3);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll;
        final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll ilIllllIIlIIlIlIlIll = this.lIIIIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll();
        final Object llllIIIIlIIIlIlllIll3 = this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this.lIIIIlIIIIIlllIllIII) {
            final boolean b = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(cc.IIIIIIIIIlllIllIlIlI) == cd.llllIIIIlIIIlIlllIll;
            if (((lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && !b) || (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && b)) && llllIIIIlIIIlIlllIll3 == ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll)) {
                return true;
            }
        }
        llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        return (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() == this.lIIIIlIIIIIlllIllIII && llllIIIIlIIIlIlllIll3 == ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll)) || super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, llllIIIIlIIIlIlllIll2, lllIIIIlIlIllIIlIIIl);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final Object o) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this.lIIIIlIIIIIlllIllIII) {
            final Comparable llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll());
            if (llllIIIIlIIIlIlllIll == o) {
                final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = this.lIIIlllIIIllIIIllIII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.IlIllllIIlIIlIlIlIll(), llllIIIIlIIIlIlllIll);
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2)) && illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2, 3)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 0.5f, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5f, this.lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII.IlIlIlIlIlllllllllIl(), (this.lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() + 1.0f) / 2.0f, this.lIIIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.8f);
                    --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                }
                return true;
            }
        }
        return false;
    }
}
