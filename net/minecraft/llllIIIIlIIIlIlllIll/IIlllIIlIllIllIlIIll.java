package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

class IIlllIIlIllIllIlIIll implements Runnable
{
    private final /* synthetic */ IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    
    IIlllIIlIllIllIlIIll(final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void run() {
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(this.IlIlIlIlIlllllllllIl);
        for (int i = this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 1; i >= 0; --i) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), i, this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
            if (!llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl(ilIlIlIlIlllllllllIl)) {
                break;
            }
            if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ac) {
                ((IIIllllllIllIIIlllIl)this.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(new lllIIIIlllllIlIIllIl(this, this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl));
            }
        }
    }
}
