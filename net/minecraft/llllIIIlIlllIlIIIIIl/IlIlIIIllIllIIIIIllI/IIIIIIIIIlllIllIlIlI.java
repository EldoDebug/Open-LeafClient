package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;

class IIIIIIIIIlllIllIlIlI extends IlIlIIIllIllIIIIIllI
{
    private IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll;
    
    public IIIIIIIIIlllIllIlIlI(final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(5);
        ((IllIIlllIIIIlllIIlIl)llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII()).IlIIIlIlIIIllIlIlIIl(true);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI() || this.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIIlIIIlIlllIll.B().nextFloat() < 0.8f) {
            this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII().llllIIIIlIIIlIlllIll();
        }
        ((IlllIIIIlIIIlIlIlIIl)this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII()).llllIIIIlIIIlIlllIll(1.2);
    }
}
