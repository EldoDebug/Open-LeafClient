package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlllIIIIlIIIlIlIlIIl extends IlIIlIlIIIlIIlIlIlII
{
    IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IlllIIIIlIIIlIlIlIIl(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll) {
        super(llllIIIIlIIIlIlllIll, false);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.llllIIIIlIIIlIlllIll.as()) {
            return false;
        }
        final lllIIIIlllllIlIIllIl au = this.llllIIIIlIIIlIlllIll.au();
        if (au == null) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl = au.E();
        return au.F() != this.llIllIIIIIllIlIIIIlI && this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, false) && this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, au);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        final lllIIIIlllllIlIIllIl au = this.llllIIIIlIIIlIlllIll.au();
        if (au != null) {
            this.llIllIIIIIllIlIIIIlI = au.F();
        }
        super.IlIlIIIllIllIIIIIllI();
    }
}
