package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIllIlllIllllIIllI extends IlIlIIIllIllIIIIIllI
{
    private IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public IllIllIlllIllllIIllI(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(5);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (!this.llllIIIIlIIIlIlllIll.as()) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI()) {
            return false;
        }
        if (!this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl) {
            return false;
        }
        final lllIIIIlllllIlIIllIl au = this.llllIIIIlIIIlIlllIll.au();
        return au == null || ((this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(au) >= 144.0 || au.C() == null) && this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().llllIIIlIlllIlIIIIIl();
        this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll(true);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll(false);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
}
