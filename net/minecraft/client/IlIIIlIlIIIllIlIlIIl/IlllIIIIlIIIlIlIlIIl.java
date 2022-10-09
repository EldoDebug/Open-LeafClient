package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlllIIIIlIIIlIlIlIIl extends IlIIIlIlIIIllIlIlIIl
{
    IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    
    public IlllIIIIlIIIlIlIlIIl(final int n) {
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, n)).llllIIIIlIIIlIlllIll(-4.0f, 16.0f, -4.0f, 8, 8, 8);
        if (n > 0) {
            (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, n)).llllIIIIlIIIlIlllIll(-3.0f, 17.0f, -3.0f, 6, 6, 6);
            (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 32, 0)).llllIIIIlIIIlIlllIll(-3.25f, 18.0f, -3.5f, 2, 2, 2);
            (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, 32, 4)).llllIIIIlIIIlIlllIll(1.25f, 18.0f, -3.5f, 2, 2, 2);
            (this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, 32, 8)).llllIIIIlIIIlIlllIll(0.0f, 21.0f, -3.5f, 1, 1, 1);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        if (this.IlIlIlIlIlllllllllIl != null) {
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
        }
    }
}
