package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIlllIIIllIIIllIII extends IlIlIIIllIllIIIIIllI
{
    IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll;
    lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    
    public lIIIlllIIIllIIIllIII(final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        return this.llllIIIIlIIIlIlllIll.ao() > 0 || (iIlllIIIlIlllIIlllII != null && this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(iIlllIIIlIlllIIlllII) < 9.0);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.IlIlIlIlIlllllllllIl == null) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(-1);
        }
        else if (this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl) > 49.0) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(-1);
        }
        else if (!this.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl)) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(-1);
        }
        else {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1);
        }
    }
}
