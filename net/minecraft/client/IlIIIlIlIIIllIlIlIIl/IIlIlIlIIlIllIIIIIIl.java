package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlIlIlIIlIllIIIIIIl extends IlIIIlIlIIIllIlIlIIl
{
    IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    IIlIIIIIllIlIIIlIIll[] IlIlIlIlIlllllllllIl;
    
    public IIlIlIlIIlIllIIIIIIl() {
        this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll[8];
        final int n = -16;
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-6.0f, -8.0f, -6.0f, 12, 16, 12);
        final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl += 24 + n;
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i] = new IIlIIIIIllIlIIIlIIll(this, 48, 0);
            final double n2 = i * 3.141592653589793 * 2.0 / this.IlIlIlIlIlllllllllIl.length;
            final float llIllIIIIIllIlIIIIlI = (float)Math.cos(n2) * 5.0f;
            final float ilIlIIIllIllIIIIIllI = (float)Math.sin(n2) * 5.0f;
            this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll(-1.0f, 0.0f, -1.0f, 2, 18, 2);
            this.IlIlIlIlIlllllllllIl[i].llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIlIlIlIlllllllllIl[i].IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IlIlIlIlIlllllllllIl[i].IlIIIlIlIIIllIlIlIIl = (float)(31 + n);
            this.IlIlIlIlIlllllllllIl[i].llllIIIlIlllIlIIIIIl = (float)(i * 3.141592653589793 * -2.0 / this.IlIlIlIlIlllllllllIl.length + 1.5707963267948966);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float illIIlllIIIIlllIIlIl, final float n3, final float n4, final float n5, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        IIlIIIIIllIlIIIlIIll[] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            ilIlIlIlIlllllllllIl[i].IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            this.IlIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll(n6);
        }
    }
}
