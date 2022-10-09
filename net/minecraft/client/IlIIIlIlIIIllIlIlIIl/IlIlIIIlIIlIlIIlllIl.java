package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIlIIlIlIIlllIl extends IIllllIIIlIIIIIIllIl
{
    private final IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    
    public IlIlIIIlIIlIlIIlllIl() {
        super(0, 0, 64, 64);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 32, 0)).llllIIIIlIIIlIlllIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, 0.25f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl;
    }
}
