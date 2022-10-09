package net.optifine.llllIIIlIlllIlIIIIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;

public class llIIlIIIlIIIllIlIIIl
{
    private int llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    
    public llIIlIIIlIIIllIlIIIl(final int llllIIIIlIIIlIlllIll, final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = 0;
        this.IlIlIlIlIlllllllllIl = null;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final float n) {
        final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll = lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, this.llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n);
        }
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n);
    }
}
