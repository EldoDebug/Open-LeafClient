package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IlIlIIIllIIllIlllllI extends IlIlIIIllIllIIIIIllI
{
    private llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll;
    
    public IlIlIIIllIIllIlllllI(final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII() == null) {
            final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll;
            final float n = -(float)llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII, this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII) * 180.0f / 3.1415927f;
            llllIIIIlIIIlIlllIll2.IIlIIIIIllIlIIIlIIll = n;
            llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII = n;
        }
        else {
            final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
            final double n2 = 64.0;
            if (iIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll) < n2 * n2) {
                final double n3 = iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl - this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
                final double n4 = iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII - this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
                final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll;
                final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll;
                final float n5 = -(float)llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3, n4) * 180.0f / 3.1415927f;
                llllIIIIlIIIlIlllIll4.IIlIIIIIllIlIIIlIIll = n5;
                llllIIIIlIIIlIlllIll3.lIllIlIIIllllllIIlII = n5;
            }
        }
    }
}
