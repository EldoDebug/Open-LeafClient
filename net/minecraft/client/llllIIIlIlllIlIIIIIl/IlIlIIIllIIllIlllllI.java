package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIIIllIIllIlllllI extends IIIllllllIllIIIlllIl
{
    protected IlIlIIIllIIllIlllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this(illlllllIIIlIIIlIlII, n, n2, n3, ilIIIlIlIIIllIlIlIIl, 0);
    }
    
    protected IlIlIIIllIIllIlllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n7) {
        this(illlllllIIIlIIIlIlII, n, n2, n3, ilIIIlIlIIIllIlIlIIl, n7);
        this.lIllllllIIllIlIlIlII *= 0.10000000149011612;
        this.llIIlllIIlllIIllIllI *= 0.10000000149011612;
        this.IIlllIIIlIlllIIlllII *= 0.10000000149011612;
        this.lIllllllIIllIlIlIlII += n4;
        this.llIIlllIIlllIIllIllI += n5;
        this.IIlllIIIlIlllIIlllII += n6;
    }
    
    protected IlIlIIIllIIllIlllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n4) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft().IllIIlllllIIllIIllIl().llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n4));
        final float llIIlIIIlIIIllIlIIIl = 1.0f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIlllIIIllIIIllIII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI.IIlIIIIIllIlIIIlIIll;
        this.lIIIIlIIIIIlllIllIII /= 2.0f;
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
        final float n8 = (float)(this.IIlIIIIlllIlllllIlII + (this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII) * n - IlIlIIIllIIllIlllllI.llllIIllllIlIlIIIIll);
        final float n9 = (float)(this.IIIlIIlIIIIlllIlllII + (this.llIIIlIlIllIIlIlIlII - this.IIIlIIlIIIIlllIlllII) * n - IlIlIIIllIIllIlllllI.IlIllIlIlIIIlIlIlIII);
        final float n10 = (float)(this.IlIlIllllllllIIIIlII + (this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII) * n - IlIlIIIllIIllIlllllI.IIlllIIlIllIllIlIIll);
        final int a_ = this.a_(n);
        final int n11 = a_ >> 16 & 0xFFFF;
        final int n12 = a_ & 0xFFFF;
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 - n2 * n7 - n5 * n7, n9 - n3 * n7, (double)(n10 - n4 * n7 - n6 * n7)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 - n2 * n7 + n5 * n7, n9 + n3 * n7, (double)(n10 - n4 * n7 + n6 * n7)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 + n2 * n7 + n5 * n7, n9 + n3 * n7, (double)(n10 + n4 * n7 + n6 * n7)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n8 + n2 * n7 - n5 * n7, n9 - n3 * n7, (double)(n10 + n4 * n7 - n6 * n7)).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n11, n12).IlIlIIIllIllIIIIIllI();
    }
}
