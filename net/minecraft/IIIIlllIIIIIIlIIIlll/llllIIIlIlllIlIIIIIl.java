package net.minecraft.IIIIlllIIIIIIlIIIlll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIlIlllIlIIIIIl extends IlIIIlIlIIIllIlIlIIl
{
    public llllIIIlIlllIlIIIIIl(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(ilIllIlIlIIIlIlIlIII, illlllllIIIlIIIlIlII);
    }
    
    @Override
    protected llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll() {
        return new llIllIIIIIllIlIIIIlI(new IlIlIlIlIlllllllllIl());
    }
    
    @Override
    protected boolean lIIIlllIIIllIIIllIII() {
        return this.llIIlIIIlIIIllIlIIIl();
    }
    
    @Override
    protected e lIIIIlIIIIIlllIllIII() {
        return new e(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll * 0.5, this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI() {
        final e liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        final float n = this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII * this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII;
        final int n2 = 6;
        if (liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI())) < n) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        }
        for (int i = Math.min(this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() + n2, this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() - 1); i > this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); --i) {
            final e llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, i);
            if (llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(liiiIlIIIIIlllIllIII) <= 36.0 && this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, llllIIIIlIIIlIlllIll, 0, 0, 0)) {
                this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(i);
                break;
            }
        }
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
    }
    
    @Override
    protected void llIllIlIIIIllIlIIllI() {
        super.llIllIlIIIIllIlIIllI();
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final e e, final e e2, final int n, final int n2, final int n3) {
        final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(e, new e(e2.llllIIIIlIIIlIlllIll, e2.IlIlIlIlIlllllllllIl + this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll * 0.5, e2.llIllIIIIIllIlIIIIlI), false, true, false);
        return llllIIIIlIIIlIlllIll == null || llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll;
    }
}
