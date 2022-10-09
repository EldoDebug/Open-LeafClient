package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IllIllIlllIllllIIllI extends IlIIIlIlIIIllIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll[] IlIlIlIlIlllllllllIl;
    
    public IllIllIlllIllllIIllI(final float n) {
        this.lIIIlllIIIllIIIllIII = 64;
        this.llIIlIIIlIIIllIlIIIl = 64;
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll[3];
        (this.llllIIIIlIIIlIlllIll[0] = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-10.0f, 3.9f, -0.5f, 20, 3, 3, n);
        (this.llllIIIIlIIIlIlllIll[1] = new IIlIIIIIllIlIIIlIIll(this).IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, this.llIIlIIIlIIIllIlIIIl)).llllIIIIlIIIlIlllIll(-2.0f, 6.9f, -0.5f);
        this.llllIIIIlIIIlIlllIll[1].llllIIIIlIIIlIlllIll(0, 22).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 3, 10, 3, n);
        this.llllIIIIlIIIlIlllIll[1].llllIIIIlIIIlIlllIll(24, 22).llllIIIIlIIIlIlllIll(-4.0f, 1.5f, 0.5f, 11, 2, 2, n);
        this.llllIIIIlIIIlIlllIll[1].llllIIIIlIIIlIlllIll(24, 22).llllIIIIlIIIlIlllIll(-4.0f, 4.0f, 0.5f, 11, 2, 2, n);
        this.llllIIIIlIIIlIlllIll[1].llllIIIIlIIIlIlllIll(24, 22).llllIIIIlIIIlIlllIll(-4.0f, 6.5f, 0.5f, 11, 2, 2, n);
        (this.llllIIIIlIIIlIlllIll[2] = new IIlIIIIIllIlIIIlIIll(this, 12, 22)).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 3, 6, 3, n);
        this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll[3];
        (this.IlIlIlIlIlllllllllIl[0] = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-4.0f, -4.0f, -4.0f, 8, 8, 8, n);
        (this.IlIlIlIlIlllllllllIl[1] = new IIlIIIIIllIlIIIlIIll(this, 32, 0)).llllIIIIlIIIlIlllIll(-4.0f, -4.0f, -4.0f, 6, 6, 6, n);
        this.IlIlIlIlIlllllllllIl[1].llIllIIIIIllIlIIIIlI = -8.0f;
        this.IlIlIlIlIlllllllllIl[1].IlIIIlIlIIIllIlIlIIl = 4.0f;
        (this.IlIlIlIlIlllllllllIl[2] = new IIlIIIIIllIlIIIlIIll(this, 32, 0)).llllIIIIlIIIlIlllIll(-4.0f, -4.0f, -4.0f, 6, 6, 6, n);
        this.IlIlIlIlIlllllllllIl[2].llIllIIIIIllIlIIIIlI = 10.0f;
        this.IlIlIlIlIlllllllllIl[2].IlIIIlIlIIIllIlIlIIl = 4.0f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        IIlIIIIIllIlIIIlIIll[] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            ilIlIlIlIlllllllllIl[i].llllIIIIlIIIlIlllIll(n6);
        }
        IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll;
        for (int length2 = (llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll).length, j = 0; j < length2; ++j) {
            llllIIIIlIIIlIlllIll[j].llllIIIIlIIIlIlllIll(n6);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.1f);
        this.llllIIIIlIIIlIlllIll[1].IllIIlllIIIIlllIIlIl = (0.065f + 0.05f * ilIlIlIlIlllllllllIl) * 3.1415927f;
        this.llllIIIIlIIIlIlllIll[2].llllIIIIlIIIlIlllIll(-2.0f, 6.9f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll[1].IllIIlllIIIIlllIIlIl) * 10.0f, -0.5f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[1].IllIIlllIIIIlllIIlIl) * 10.0f);
        this.llllIIIIlIIIlIlllIll[2].IllIIlllIIIIlllIIlIl = (0.265f + 0.1f * ilIlIlIlIlllllllllIl) * 3.1415927f;
        this.IlIlIlIlIlllllllllIl[0].llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.IlIlIlIlIlllllllllIl[0].IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl)lllIIIIlllllIlIIllIl;
        for (int i = 1; i < 3; ++i) {
            this.IlIlIlIlIlllllllllIl[i].llllIIIlIlllIlIIIIIl = (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(i - 1) - lllIIIIlllllIlIIllIl.lIllIlIIIllllllIIlII) / 57.295776f;
            this.IlIlIlIlIlllllllllIl[i].IllIIlllIIIIlllIIlIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(i - 1) / 57.295776f;
        }
    }
}
