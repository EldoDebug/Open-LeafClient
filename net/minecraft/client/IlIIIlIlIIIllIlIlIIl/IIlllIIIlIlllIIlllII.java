package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlllIIIlIlllIIlllII extends IlIIIlIlIIIllIlIlIIl
{
    IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI;
    IIlIIIIIllIlIIIlIIll IlIlIIIllIIllIlllllI;
    IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll;
    IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll;
    IIlIIIIIllIlIIIlIIll IlIllIlIlIIIlIlIlIII;
    IIlIIIIIllIlIIIlIIll IIlllIIlIllIllIlIIll;
    IIlIIIIIllIlIIIlIIll lllIIIIlllllIlIIllIl;
    private float IlIlIIIIIIlllIlIllIl;
    private float IIllIIllIIIlIlIIIIlI;
    
    public IIlllIIIlIlllIIlllII() {
        this.IlIlIIIIIIlllIlIllIl = 0.0f;
        this.IIllIIllIIIlIlIIIIlI = 0.0f;
        this.llllIIIIlIIIlIlllIll("head.main", 0, 0);
        this.llllIIIIlIIIlIlllIll("head.nose", 0, 24);
        this.llllIIIIlIIIlIlllIll("head.ear1", 0, 10);
        this.llllIIIIlIIIlIlllIll("head.ear2", 6, 10);
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 26, 24)).llllIIIIlIIIlIlllIll(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(3.0f, 17.5f, 3.7f);
        this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 0.0f, 0.0f, 0.0f);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 8, 24)).llllIIIIlIIIlIlllIll(-1.0f, 5.5f, -3.7f, 2, 1, 7);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-3.0f, 17.5f, 3.7f);
        this.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, 0.0f, 0.0f, 0.0f);
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, 30, 15)).llllIIIIlIIIlIlllIll(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(3.0f, 17.5f, 3.7f);
        this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, -0.34906584f, 0.0f, 0.0f);
        (this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, 16, 15)).llllIIIIlIIIlIlllIll(-1.0f, 0.0f, 0.0f, 2, 4, 5);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(-3.0f, 17.5f, 3.7f);
        this.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, -0.34906584f, 0.0f, 0.0f);
        (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-3.0f, -2.0f, -10.0f, 6, 5, 10);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0.0f, 19.0f, 8.0f);
        this.llIllIlIIIIllIlIIllI.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, -0.34906584f, 0.0f, 0.0f);
        (this.lIlIlIIIllIIllIIIllI = new IIlIIIIIllIlIIIlIIll(this, 8, 15)).llllIIIIlIIIlIlllIll(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(3.0f, 17.0f, -1.0f);
        this.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI, -0.17453292f, 0.0f, 0.0f);
        (this.IlIlIIIllIIllIlllllI = new IIlIIIIIllIlIIIlIIll(this, 0, 15)).llllIIIIlIIIlIlllIll(-1.0f, 0.0f, -1.0f, 2, 7, 2);
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(-3.0f, 17.0f, -1.0f);
        this.IlIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, -0.17453292f, 0.0f, 0.0f);
        (this.IIIIlllIIIIIIlIIIlll = new IIlIIIIIllIlIIIlIIll(this, 32, 0)).llllIIIIlIIIlIlllIll(-2.5f, -4.0f, -5.0f, 5, 4, 5);
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(0.0f, 16.0f, -1.0f);
        this.IIIIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll, 0.0f, 0.0f, 0.0f);
        (this.llllIIllllIlIlIIIIll = new IIlIIIIIllIlIIIlIIll(this, 52, 0)).llllIIIIlIIIlIlllIll(-2.5f, -9.0f, -1.0f, 2, 5, 1);
        this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(0.0f, 16.0f, -1.0f);
        this.llllIIllllIlIlIIIIll.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, 0.0f, -0.2617994f, 0.0f);
        (this.IlIllIlIlIIIlIlIlIII = new IIlIIIIIllIlIIIlIIll(this, 58, 0)).llllIIIIlIIIlIlllIll(0.5f, -9.0f, -1.0f, 2, 5, 1);
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(0.0f, 16.0f, -1.0f);
        this.IlIllIlIlIIIlIlIlIII.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, 0.0f, 0.2617994f, 0.0f);
        (this.IIlllIIlIllIllIlIIll = new IIlIIIIIllIlIIIlIIll(this, 52, 6)).llllIIIIlIIIlIlllIll(-1.5f, -1.5f, 0.0f, 3, 3, 2);
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(0.0f, 20.0f, 7.0f);
        this.IIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll, -0.3490659f, 0.0f, 0.0f);
        (this.lllIIIIlllllIlIIllIl = new IIlIIIIIllIlIIIlIIll(this, 32, 9)).llllIIIIlIIIlIlllIll(-0.5f, -2.5f, -5.5f, 1, 1, 1);
        this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(0.0f, 16.0f, -1.0f);
        this.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl, 0.0f, 0.0f, 0.0f);
    }
    
    private void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final float illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl, final float liiiIlIIIIIlllIllIII) {
        ilIIIIIllIlIIIlIIll.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        ilIIIIIllIlIIIlIIll.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        ilIIIIIllIlIIIlIIll.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        if (this.llllIIIlIlllIlIIIIIl) {
            final float n7 = 2.0f;
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 5.0f * n6, 2.0f * n6);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(n6);
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(n6);
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(n6);
            this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(n6);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / n7, 1.0f / n7, 1.0f / n7);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 24.0f * n6, 0.0f);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(n6);
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(n6);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
        else {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(n6);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(n6);
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(n6);
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(n6);
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(n6);
            this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(n6);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final float n7 = n3 - llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl;
        final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = (lIlIlIIIllIIllIIIllI)llIllIIIIIllIlIIIIlI;
        final IIlIIIIIllIlIIIlIIll lllIIIIlllllIlIIllIl = this.lllIIIIlllllIlIIllIl;
        final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
        final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
        final IIlIIIIIllIlIIIlIIll ilIllIlIlIIIlIlIlIII = this.IlIllIlIlIIIlIlIlIII;
        final float n8 = n5 * 0.017453292f;
        ilIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl = n8;
        llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl = n8;
        iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = n8;
        lllIIIIlllllIlIIllIl.IllIIlllIIIIlllIIlIl = n8;
        final IIlIIIIIllIlIIIlIIll lllIIIIlllllIlIIllIl2 = this.lllIIIIlllllIlIIllIl;
        final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll2 = this.IIIIlllIIIIIIlIIIlll;
        final float n9 = n4 * 0.017453292f;
        iiiIlllIIIIIIlIIIlll2.llllIIIlIlllIlIIIIIl = n9;
        lllIIIIlllllIlIIllIl2.llllIIIlIlllIlIIIIIl = n9;
        this.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl = this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl - 0.2617994f;
        this.IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl = this.lllIIIIlllllIlIIllIl.llllIIIlIlllIlIIIIIl + 0.2617994f;
        this.IlIlIIIIIIlllIlIllIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll(n7) * 3.1415927f);
        final IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI;
        final IIlIIIIIllIlIIIlIIll ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        final float n10 = (this.IlIlIIIIIIlllIlIllIl * 50.0f - 21.0f) * 0.017453292f;
        ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl = n10;
        llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl = n10;
        final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        final IIlIIIIIllIlIIIlIIll ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
        final float n11 = this.IlIlIIIIIIlllIlIllIl * 50.0f * 0.017453292f;
        ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = n11;
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = n11;
        final IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI2 = this.lIlIlIIIllIIllIIIllI;
        final IIlIIIIIllIlIIIlIIll ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI;
        final float n12 = (this.IlIlIIIIIIlllIlIllIl * -40.0f - 11.0f) * 0.017453292f;
        ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl = n12;
        lIlIlIIIllIIllIIIllI2.IllIIlllIIIIlllIIlIl = n12;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3) {
    }
}
