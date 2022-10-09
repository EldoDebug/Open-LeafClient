package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

class IIlIIIIlllIlllllIlII extends IlIlIIIllIllIIIIIllI
{
    private IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    
    public IIlIIIIlllIlllllIlII(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        if (this.llllIIIIlIIIlIlllIll.G() > 100) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f);
        }
        else if (this.llllIIIIlIIIlIlllIll.B().nextInt(50) == 0 || !this.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI || !this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII()) {
            final float n = this.llllIIIIlIIIlIlllIll.B().nextFloat() * 3.1415927f * 2.0f;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n) * 0.2f, -0.1f + this.llllIIIIlIIIlIlllIll.B().nextFloat() * 0.2f, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n) * 0.2f);
        }
    }
}
