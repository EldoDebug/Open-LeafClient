package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIllllllIllIIIlllIl extends llIIlllIIlllIIllIllI
{
    private float llllIIllllIlIlIIIIll;
    
    public IIIllllllIllIIIlllIl() {
        super(12, 0.0f);
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-3.0f, -4.0f, -6.0f, 6, 6, 8, 0.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, 6.0f, -8.0f);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 28, 8)).llllIIIIlIIIlIlllIll(-4.0f, -10.0f, -7.0f, 8, 16, 6, 0.0f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0f, 5.0f, 2.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3) {
        super.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3);
        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl = 6.0f + ((IIIlIIIlIlIIlllIIlll)lllIIIIlllllIlIIllIl).llllIIllllIlIlIIIIll(n3) * 9.0f;
        this.llllIIllllIlIlIIIIll = ((IIIlIIIlIlIIlllIIlll)lllIIIIlllllIlIIllIl).IlIllIlIlIIIlIlIlIII(n3);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = this.llllIIllllIlIlIIIIll;
    }
}
