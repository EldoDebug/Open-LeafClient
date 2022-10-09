package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIlIlllIlIIIIIl extends IlIIIlIlIIIllIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll[] llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    
    public llllIIIlIlllIlIIIIIl() {
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll[12];
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            (this.llllIIIIlIIIlIlllIll[i] = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 2, 8, 2);
        }
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-4.0f, -4.0f, -4.0f, 8, 8, 8);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i].llllIIIIlIIIlIlllIll(n6);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        float n7 = n3 * 3.1415927f * -0.1f;
        for (int i = 0; i < 4; ++i) {
            this.llllIIIIlIIIlIlllIll[i].IlIIIlIlIIIllIlIlIIl = -2.0f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((i * 2 + n3) * 0.25f);
            this.llllIIIIlIIIlIlllIll[i].llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n7) * 9.0f;
            this.llllIIIIlIIIlIlllIll[i].IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n7) * 9.0f;
            ++n7;
        }
        float n8 = 0.7853982f + n3 * 3.1415927f * 0.03f;
        for (int j = 4; j < 8; ++j) {
            this.llllIIIIlIIIlIlllIll[j].IlIIIlIlIIIllIlIlIIl = 2.0f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((j * 2 + n3) * 0.25f);
            this.llllIIIIlIIIlIlllIll[j].llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n8) * 7.0f;
            this.llllIIIIlIIIlIlllIll[j].IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n8) * 7.0f;
            ++n8;
        }
        float n9 = 0.47123894f + n3 * 3.1415927f * -0.05f;
        for (int k = 8; k < 12; ++k) {
            this.llllIIIIlIIIlIlllIll[k].IlIIIlIlIIIllIlIlIIl = 11.0f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((k * 1.5f + n3) * 0.5f);
            this.llllIIIIlIIIlIlllIll[k].llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n9) * 5.0f;
            this.llllIIIIlIIIlIlllIll[k].IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n9) * 5.0f;
            ++n9;
        }
        this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
    }
}
