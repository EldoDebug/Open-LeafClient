package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class llllIIllllIlIlIIIIll extends IIlllIIlllIIIlIlllII
{
    private llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    
    public llllIIllllIlIlIIIIll(final llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl) {
        super(llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IllIIlllIIIIlllIIlIl) {
            final double n = this.IlIlIlIlIlllllllllIl - this.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl;
            final double n2 = this.llIllIIIIIllIlIIIIlI - this.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII;
            final double n3 = this.IlIIIlIlIIIllIlIlIIl - this.llllIIIlIlllIlIIIIIl.lllllIlIIIlIlIIlllII;
            final double n4 = n * n + n2 * n2 + n3 * n3;
            if (this.lIIIIlIIIIIlllIllIII-- <= 0) {
                this.lIIIIlIIIIIlllIllIII += this.llllIIIlIlllIlIIIIIl.B().nextInt(5) + 2;
                final double n5 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4);
                if (this.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, n5)) {
                    final llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
                    llllIIIlIlllIlIIIIIl.lIllllllIIllIlIlIlII += n / n5 * 0.1;
                    final llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl2 = this.llllIIIlIlllIlIIIIIl;
                    llllIIIlIlllIlIIIIIl2.llIIlllIIlllIIllIllI += n2 / n5 * 0.1;
                    final llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl3 = this.llllIIIlIlllIlIIIIIl;
                    llllIIIlIlllIlIIIIIl3.IIlllIIIlIlllIIlllII += n3 / n5 * 0.1;
                }
                else {
                    this.IllIIlllIIIIlllIIlIl = false;
                }
            }
        }
    }
    
    private boolean IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3, final double n4) {
        final double n5 = (n - this.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl) / n4;
        final double n6 = (n2 - this.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII) / n4;
        final double n7 = (n3 - this.llllIIIlIlllIlIIIIIl.lllllIlIIIlIlIIlllII) / n4;
        llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIlIlllIlIIIIIl.IlIIlllIIlIlllllIIlI();
        for (int n8 = 1; n8 < n4; ++n8) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n5, n6, n7);
            if (!this.llllIIIlIlllIlIIIIIl.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, llllIIIIlIIIlIlllIll).isEmpty()) {
                return false;
            }
        }
        return true;
    }
}
