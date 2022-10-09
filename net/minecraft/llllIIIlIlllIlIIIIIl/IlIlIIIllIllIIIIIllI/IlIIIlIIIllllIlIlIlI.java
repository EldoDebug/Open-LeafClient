package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IlIIIlIIIllllIlIlIlI extends IlIlIIIllIllIIIIIllI
{
    private IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public IlIIIlIIIllllIlIlIlI(final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        return iIlllIIIlIlllIIlllII != null && iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII() && (!(iIlllIIIlIlllIIlllII instanceof llllIIIIlIIIlIlllIll) || !((llllIIIIlIIIlIlllIll)iIlllIIIlIlllIIlllII).K.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIlIlIlllllllllIl = 300;
        super.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        return iIlllIIIlIlllIIlllII != null && iIlllIIIlIlllIIlllII.llllIllllIllllIlIlII() && (!(iIlllIIIlIlllIIlllII instanceof llllIIIIlIIIlIlllIll) || !((llllIIIIlIIIlIlllIll)iIlllIIIlIlllIIlllII).K.llllIIIIlIIIlIlllIll) && --this.IlIlIlIlIlllllllllIl > 0;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII(), 10.0f, 10.0f);
        ((IlllIIIIlIIIlIlIlIIl)this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII()).llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll, this.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl());
    }
}
