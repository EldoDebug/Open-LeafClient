package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IlIlIIIIIIlllIlIllIl extends IIlllIIlllIIIlIlllII
{
    private lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl;
    
    public IlIlIIIIIIlllIlIllIl(final lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl) {
        super(llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIlIlllIlIIIIIl.IIIIIllIIIIlIIIIllIl && !this.llllIIIlIlllIlIIIIIl.aq()) {
            this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(0.0);
        }
        super.llIllIIIIIllIlIIIIlI();
    }
}
