package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llllIIIIlIIIlIlllIll extends IIIllllllIllIIIlllIl
{
    protected llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft().IllIIlllllIIllIIllIl().llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl));
        final float llIIlIIIlIIIllIlIIIl = 1.0f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        final double lIllllllIIllIlIlIlII = 0.0;
        this.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 80;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 1;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float ilIlIIIllIllIIIIIllI = this.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI();
        final float illIIlllIIIIlllIIlIl = this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl();
        final float llllIIIlIlllIlIIIIIl = this.IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl();
        final float liiiIlIIIIIlllIllIII = this.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII();
        final float n7 = (float)(this.IIlIIIIlllIlllllIlII + (this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII) * n - llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll);
        final float n8 = (float)(this.IIIlIIlIIIIlllIlllII + (this.llIIIlIlIllIIlIlIlII - this.IIIlIIlIIIIlllIlllII) * n - llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII);
        final float n9 = (float)(this.IlIlIllllllllIIIIlII + (this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII) * n - llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll);
        final int a_ = this.a_(n);
        final int n10 = a_ >> 16 & 0xFFFF;
        final int n11 = a_ & 0xFFFF;
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n7 - n2 * 0.5f - n5 * 0.5f, n8 - n3 * 0.5f, (double)(n9 - n4 * 0.5f - n6 * 0.5f)).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, liiiIlIIIIIlllIllIII).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n10, n11).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n7 - n2 * 0.5f + n5 * 0.5f, n8 + n3 * 0.5f, (double)(n9 - n4 * 0.5f + n6 * 0.5f)).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n10, n11).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n7 + n2 * 0.5f + n5 * 0.5f, n8 + n3 * 0.5f, (double)(n9 + n4 * 0.5f + n6 * 0.5f)).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n10, n11).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n7 + n2 * 0.5f - n5 * 0.5f, n8 - n3 * 0.5f, (double)(n9 + n4 * 0.5f - n6 * 0.5f)).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, liiiIlIIIIIlllIllIII).llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI, 1.0f).llllIIIIlIIIlIlllIll(n10, n11).IlIlIIIllIllIIIIIllI();
    }
}
