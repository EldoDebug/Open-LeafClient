package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIlIIIIlllIlllllIlII.*;

public class llIIlIIIlIIIllIlIIIl extends IlIIlIlIIIlIIlIlIlII
{
    IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        super(llllIIIIlIIIlIlllIll, false, true);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
        if (liiiIlIIIIIlllIllIII == null) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        if (this.IlIlIlIlIlllllllllIl instanceof IlIIIlIlIIIllIlIlIIl) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, false)) {
            return true;
        }
        if (this.IlIlIIIllIllIIIIIllI.B().nextInt(20) == 0) {
            this.IlIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll);
            return this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, false);
        }
        return false;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        super.IlIlIIIllIllIIIIIllI();
    }
}
