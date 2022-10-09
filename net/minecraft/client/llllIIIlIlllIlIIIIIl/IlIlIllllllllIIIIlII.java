package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIllllllllIIIIlII extends IIIllllllIllIIIlllIl
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl IIIIIIIllllIlIIIIIII;
    
    protected IlIlIllllllllIIIIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft().IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll));
        this.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IIlIIIIIllIlIIIlIIll;
        final float llIIlIIIlIIIllIlIIIl = 0.6f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIIlIIIIIlllIllIII /= 2.0f;
    }
    
    public IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl iiiiiiIllllIlIIIIIII) {
        this.IIIIIIIllllIlIIIIIII = iiiiiiIllllIlIIIIIII;
        if (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
            return this;
        }
        final int ilIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IlIIIlIlIIIllIlIlIIl((lIlIlIIIllIIllIIIllI)this.IlllllllIIIlIIIlIlII, iiiiiiIllllIlIIIIIII);
        this.llIIlIIIlIIIllIlIIIl *= (ilIIIlIlIIIllIlIlIIl >> 16 & 0xFF) / 255.0f;
        this.llIllIlIIIIllIlIIllI *= (ilIIIlIlIIIllIlIlIIl >> 8 & 0xFF) / 255.0f;
        this.lIlIlIIIllIIllIIIllI *= (ilIIIlIlIIIllIlIlIIl & 0xFF) / 255.0f;
        return this;
    }
    
    public IlIlIllllllllIIIIlII IlIlIIIllIllIIIIIllI() {
        this.IIIIIIIllllIlIIIIIII = new IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
            return this;
        }
        final int ilIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll);
        this.llIIlIIIlIIIllIlIIIl *= (ilIlIIIllIllIIIIIllI >> 16 & 0xFF) / 255.0f;
        this.llIllIlIIIIllIlIIllI *= (ilIlIIIllIllIIIIIllI >> 8 & 0xFF) / 255.0f;
        this.lIlIlIIIllIIllIIIllI *= (ilIlIIIllIllIIIIIllI & 0xFF) / 255.0f;
        return this;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 1;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        float llllIIIIlIIIlIlllIll = (this.IlIlIlIlIlllllllllIl + this.IlIIIlIlIIIllIlIlIIl / 4.0f) / 16.0f;
        float llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll + 0.015609375f;
        float ilIlIlIlIlllllllllIl = (this.llIllIIIIIllIlIIIIlI + this.IlIlIIIllIllIIIIIllI / 4.0f) / 16.0f;
        float ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl + 0.015609375f;
        final float n7 = 0.1f * this.lIIIIlIIIIIlllIllIII;
        if (this.IIIIlllIIIIIIlIIIlll != null) {
            llllIIIIlIIIlIlllIll = this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll((double)(this.IlIIIlIlIIIllIlIlIIl / 4.0f * 16.0f));
            llllIIIIlIIIlIlllIll2 = this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll((double)((this.IlIIIlIlIIIllIlIlIIl + 1.0f) / 4.0f * 16.0f));
            ilIlIlIlIlllllllllIl = this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl((double)(this.IlIlIIIllIllIIIIIllI / 4.0f * 16.0f));
            ilIlIlIlIlllllllllIl2 = this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl((double)((this.IlIlIIIllIllIIIIIllI + 1.0f) / 4.0f * 16.0f));
        }
        final float n8 = (float)(this.IIlIIIIlllIlllllIlII + (this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII) * n - IlIlIllllllllIIIIlII.llllIIllllIlIlIIIIll);
        final float n9 = (float)(this.IIIlIIlIIIIlllIlllII + (this.llIIIlIlIllIIlIlIlII - this.IIIlIIlIIIIlllIlllII) * n - IlIlIllllllllIIIIlII.IlIllIlIlIIIlIlIlIII);
        final float n10 = (float)(this.IlIlIllllllllIIIIlII + (this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII) * n - IlIlIllllllllIIIIlII.IIlllIIlIllIllIlIIll);
        final int a_ = this.a_(n);
        final int n11 = a_ >> 16 & 0xFFFF;
        final int n12 = a_ & 0xFFFF;
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 - n2 * n7 - n5 * n7, n9 - n3 * n7, (double)(n10 - n4 * n7 - n6 * n7)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 - n2 * n7 + n5 * n7, n9 + n3 * n7, (double)(n10 - n4 * n7 + n6 * n7)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 + n2 * n7 + n5 * n7, n9 + n3 * n7, (double)(n10 + n4 * n7 + n6 * n7)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 + n2 * n7 - n5 * n7, n9 - n3 * n7, (double)(n10 + n4 * n7 - n6 * n7)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public int a_(final float n) {
        final int a_ = super.a_(n);
        int llllIIIIlIIIlIlllIll = 0;
        if (this.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(this.IIIIIIIllllIlIIIIIII)) {
            llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIIIIIIllllIlIIIIIII, 0);
        }
        return (a_ == 0) ? llllIIIIlIIIlIlllIll : a_;
    }
}
