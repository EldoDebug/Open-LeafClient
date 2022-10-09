package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIIIIIIIlllIllIlIlI extends IIIllllllIllIIIlllIl
{
    protected IIIIIIIIIlllIllIlIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llllIIIlIlllIlIIIIIl = 4;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float n7 = 7.1f * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IllIIlllIIIIlllIIlIl + n - 1.0f) * 0.25f * 3.1415927f);
        this.IlIlIIIllIIllIlllllI = 0.6f - (this.IllIIlllIIIIlllIIlIl + n - 1.0f) * 0.25f * 0.5f;
        final float n8 = (float)(this.IIlIIIIlllIlllllIlII + (this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII) * n - IIIIIIIIIlllIllIlIlI.llllIIllllIlIlIIIIll);
        final float n9 = (float)(this.IIIlIIlIIIIlllIlllII + (this.llIIIlIlIllIIlIlIlII - this.IIIlIIlIIIIlllIlllII) * n - IIIIIIIIIlllIllIlIlI.IlIllIlIlIIIlIlIlIII);
        final float n10 = (float)(this.IlIlIllllllllIIIIlII + (this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII) * n - IIIIIIIIIlllIllIlIlI.IIlllIIlIllIllIlIIll);
        final int a_ = this.a_(n);
        final int n11 = a_ >> 16 & 0xFFFF;
        final int n12 = a_ & 0xFFFF;
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 - n2 * n7 - n5 * n7, n9 - n3 * n7, (double)(n10 - n4 * n7 - n6 * n7)).llllIIIIlIIIlIlllIll(0.5, 0.375).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 - n2 * n7 + n5 * n7, n9 + n3 * n7, (double)(n10 - n4 * n7 + n6 * n7)).llllIIIIlIIIlIlllIll(0.5, 0.125).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 + n2 * n7 + n5 * n7, n9 + n3 * n7, (double)(n10 + n4 * n7 + n6 * n7)).llllIIIIlIIIlIlllIll(0.25, 0.125).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 + n2 * n7 - n5 * n7, n9 - n3 * n7, (double)(n10 + n4 * n7 - n6 * n7)).llllIIIIlIIIlIlllIll(0.25, 0.375).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, this.IlIlIIIllIIllIlllllI).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
    }
}
