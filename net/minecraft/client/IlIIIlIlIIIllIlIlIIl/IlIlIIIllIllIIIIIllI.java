package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIllIIIIIllI extends IlIIIlIlIIIllIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    private IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    private IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    private IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    private IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI;
    
    public IlIlIIIllIllIIIIIllI() {
        this.lIIIlllIIIllIIIllIII = 64;
        this.llIIlIIIlIIIllIlIIIl = 64;
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-3.0f, -3.0f, -3.0f, 6, 6, 6);
        final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll = new IIlIIIIIllIlIIIlIIll(this, 24, 0);
        ilIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(-4.0f, -6.0f, -2.0f, 3, 4, 1);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll);
        final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll2 = new IIlIIIIIllIlIIIlIIll(this, 24, 0);
        ilIIIIIllIlIIIlIIll2.lIIIlllIIIllIIIllIII = true;
        ilIIIIIllIlIIIlIIll2.llllIIIIlIIIlIlllIll(1.0f, -6.0f, -2.0f, 3, 4, 1);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll2);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-3.0f, 4.0f, -3.0f, 6, 12, 6);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, 34).llllIIIIlIIIlIlllIll(-5.0f, 16.0f, 0.0f, 10, 6, 1);
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, 42, 0)).llllIIIIlIIIlIlllIll(-12.0f, 1.0f, 1.5f, 10, 16, 1);
        (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, 24, 16)).llllIIIIlIIIlIlllIll(-12.0f, 1.0f, 1.5f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(-8.0f, 1.0f, 0.0f, 8, 12, 1);
        this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, 42, 0);
        this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII = true;
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(2.0f, 1.0f, 1.5f, 10, 16, 1);
        this.lIlIlIIIllIIllIIIllI = new IIlIIIIIllIlIIIlIIll(this, 24, 16);
        this.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII = true;
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(12.0f, 1.0f, 1.5f);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(0.0f, 1.0f, 0.0f, 8, 12, 1);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI)llIllIIIIIllIlIIIIlI).lIIIIlIIIIIlllIllIII()) {
            this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = 3.1415927f - n4 / 57.295776f;
            this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = 3.1415927f;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, -2.0f, 0.0f);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(-3.0f, 0.0f, 3.0f);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(3.0f, 0.0f, 3.0f);
            this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = 3.1415927f;
            this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = -0.15707964f;
            this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl = -1.2566371f;
            this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl = -1.7278761f;
            this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl = this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl;
            this.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl = -this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl;
            this.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl = -this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
        }
        else {
            this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
            this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
            this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = 0.0f;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f);
            this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = 0.7853982f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.1f) * 0.15f;
            this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = 0.0f;
            this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 1.3f) * 3.1415927f * 0.25f;
            this.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl = -this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl;
            this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl * 0.5f;
            this.lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl = -this.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl * 0.5f;
        }
    }
}
