package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIllllllllIIIIlII extends IlIIIlIlIIIllIlIlIIl
{
    IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll;
    IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    
    public IlIlIllllllllIIIIlII() {
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll[8];
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            int n = 0;
            int n2;
            if ((n2 = i) == 2) {
                n = 24;
                n2 = 10;
            }
            else if (i == 3) {
                n = 24;
                n2 = 19;
            }
            (this.llllIIIIlIIIlIlllIll[i] = new IIlIIIIIllIlIIIlIIll(this, n, n2)).llllIIIIlIIIlIlllIll(-4.0f, (float)(16 + i), -4.0f, 8, 1, 8);
        }
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 18.0f, -2.0f, 4, 4, 4);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = (net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIllllllllIIIIlII)lllIIIIlllllIlIIllIl;
        float n4 = ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI + (ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl - ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI) * n3;
        if (n4 < 0.0f) {
            n4 = 0.0f;
        }
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].IlIIIlIlIIIllIlIlIIl = -(4 - i) * n4 * 1.7f;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(n6);
        }
    }
}
