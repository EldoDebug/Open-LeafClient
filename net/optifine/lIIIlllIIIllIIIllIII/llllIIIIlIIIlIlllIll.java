package net.optifine.lIIIlllIIIllIIIllIII;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.*;

public class llllIIIIlIIIlIlllIll extends net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll
{
    private int llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    public llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(n, n2, n3, n4, n5, n6);
        this.llllIIIlIlllIlIIIIIl = -1;
        this.lIIIIlIIIIIlllIllIII = false;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int llllIIIlIlllIlIIIIIl) {
        if (this.llllIIIlIlllIlIIIIIl != llllIIIlIlllIlIIIIIl) {
            this.lIIIIlIIIIIlllIllIII = (ilIIIlIlIIIllIlIlIIl instanceof llIllIIIIIllIlIIIIlI && ((llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl).IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl));
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        }
        return this.lIIIIlIIIIIlllIllIII;
    }
}
