package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class lIlIlIIIllIIllIIIllI extends IlIlIIIllIllIIIIIllI
{
    private llIllIlIIIIllIlIIllI IlIlIlIlIlllllllllIl;
    public int llllIIIIlIIIlIlllIll;
    
    public lIlIlIIIllIIllIIIllI(final llIllIlIIIIllIlIIllI ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII() != null;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll = 0;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(false);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII();
        final double n = 64.0;
        if (iIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl) < n * n && this.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll(iIlllIIIlIlllIIlllII)) {
            final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = this.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII;
            ++this.llllIIIIlIIIlIlllIll;
            if (this.llllIIIIlIIIlIlllIll == 10) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1007, new IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl), 0);
            }
            if (this.llllIIIIlIIIlIlllIll == 20) {
                final double n2 = 4.0;
                final e llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1.0f);
                final double n3 = iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl - (this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * n2);
                final double n4 = iIlllIIIlIlllIIlllII.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + iIlllIIIlIlllIIlllII.IlIllllIIlIIlIlIlIll / 2.0f - (0.5 + this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII + this.IlIlIlIlIlllllllllIl.IlIllllIIlIIlIlIlIll / 2.0f);
                final double n5 = iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII - (this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n2);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1008, new IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl), 0);
                final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl, n3, n4, n5);
                ilIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll();
                ilIlIIIllIllIIIIIllI.IIlllIlIIllIlIlIlIIl = this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * n2;
                ilIlIIIllIllIIIIIllI.llIIIlIlIllIIlIlIlII = this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII + this.IlIlIlIlIlllllllllIl.IlIllllIIlIIlIlIlIll / 2.0f + 0.5;
                ilIlIIIllIllIIIIIllI.lllllIlIIIlIlIIlllII = this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n2;
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
                this.llllIIIIlIIIlIlllIll = -40;
            }
        }
        else if (this.llllIIIIlIIIlIlllIll > 0) {
            --this.llllIIIIlIIIlIlllIll;
        }
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll > 10);
    }
}
