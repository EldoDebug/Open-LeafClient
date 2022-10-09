package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIlIIllIllIIlIllII extends IllIIlllIIIIlllIIlIl
{
    public IllIlIIllIllIIlIllII() {
        this(0.0f, 0.0f, false);
    }
    
    public IllIlIIllIllIIlIllII(final float n, final float n2, final boolean b) {
        super(n, 0.0f, 64, b ? 32 : 64);
        if (b) {
            (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-4.0f, -10.0f, -4.0f, 8, 8, 8, n);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n2, 0.0f);
        }
        else {
            (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this)).llllIIIIlIIIlIlllIll(0.0f, 0.0f + n2, 0.0f);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, 32).llllIIIIlIIIlIlllIll(-4.0f, -10.0f, -4.0f, 8, 10, 8, n);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(24, 32).llllIIIIlIIIlIlllIll(-1.0f, -3.0f, -6.0f, 2, 4, 2, n);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI * 3.1415927f);
        final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((1.0f - (1.0f - this.IlIlIIIllIllIIIIIllI) * (1.0f - this.IlIlIIIllIllIIIIIllI)) * 3.1415927f);
        this.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII = 0.0f;
        this.llllIIllllIlIlIIIIll.lIIIIlIIIIIlllIllIII = 0.0f;
        this.IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl = -(0.1f - llllIIIIlIIIlIlllIll * 0.6f);
        this.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl = 0.1f - llllIIIIlIIIlIlllIll * 0.6f;
        this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = -1.5707964f;
        this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl = -1.5707964f;
        final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
        iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl -= llllIIIIlIIIlIlllIll * 1.2f - llllIIIIlIIIlIlllIll2 * 0.4f;
        final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
        llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl -= llllIIIIlIIIlIlllIll * 1.2f - llllIIIIlIIIlIlllIll2 * 0.4f;
        final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll2 = this.IIIIlllIIIIIIlIIIlll;
        iiiIlllIIIIIIlIIIlll2.lIIIIlIIIIIlllIllIII += llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.09f) * 0.05f + 0.05f;
        final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll2 = this.llllIIllllIlIlIIIIll;
        llllIIllllIlIlIIIIll2.lIIIIlIIIIIlllIllIII -= llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.09f) * 0.05f + 0.05f;
        final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll3 = this.IIIIlllIIIIIIlIIIlll;
        iiiIlllIIIIIIlIIIlll3.IllIIlllIIIIlllIIlIl += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.067f) * 0.05f;
        final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll3 = this.llllIIllllIlIlIIIIll;
        llllIIllllIlIlIIIIll3.IllIIlllIIIIlllIIlIl -= llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.067f) * 0.05f;
    }
}
