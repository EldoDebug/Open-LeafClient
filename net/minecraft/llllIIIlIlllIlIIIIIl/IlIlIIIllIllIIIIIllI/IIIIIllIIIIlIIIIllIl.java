package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;

class IIIIIllIIIIlIIIIllIl extends IlIlIIIllIllIIIIIllI
{
    private IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IIIIIllIIIIlIIIIllIl(final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII() == null && (this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl || this.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI() || this.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl());
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI - 1;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        if (llIllIIIIIllIlIIIIlI <= 0) {
            this.llIllIIIIIllIlIIIIlI = 40 + this.llllIIIIlIIIlIlllIll.B().nextInt(60);
            this.IlIlIlIlIlllllllllIl = (float)this.llllIIIIlIIIlIlllIll.B().nextInt(360);
        }
        ((IlllIIIIlIIIlIlIlIIl)this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII()).llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, false);
    }
}
