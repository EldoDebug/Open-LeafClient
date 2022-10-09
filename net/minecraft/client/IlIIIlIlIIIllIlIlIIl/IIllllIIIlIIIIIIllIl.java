package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIllllIIIlIIIIIIllIl extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    
    public IIllllIIIlIIIIIIllIl() {
        this(0, 35, 64, 64);
    }
    
    public IIllllIIIlIIIIIIllIl(final int n, final int n2, final int liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, n, n2)).llllIIIIlIIIlIlllIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
    }
}
