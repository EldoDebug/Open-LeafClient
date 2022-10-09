package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.shaders.*;

public class lIllIIIIIlllIIlIIllI extends IIIllllllIllIIIlllIl
{
    private llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private llIllIIIIIllIlIIIIlI IIIIIIIllllIlIIIIIII;
    private int IIlllIIIllIllIIlIlIl;
    private int llIlllIlllllIIllIIII;
    private float lllllIlIlIlllIlllIlI;
    private lllIllIIIllllllIllll IlIllllIIlIllIlIlIll;
    
    public lIllIIIIIlllIIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI iiiiiiIllllIlIIIIIII, final float lllllIlIlIlllIlllIlI) {
        super(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII, llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII);
        this.IlIllllIIlIllIlIlIll = Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IIIIIIIllllIlIIIIIII = iiiiiiIllllIlIIIIIII;
        this.llIlllIlllllIIllIIII = 3;
        this.lllllIlIlIlllIlllIlI = lllllIlIlIlllIlllIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        IlIllIlIlIIIlIlIlIII bm = null;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            bm = net.optifine.shaders.llIIlllIIlllIIllIllI.bM;
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        }
        final float n7 = (this.IIlllIIIllIllIIlIlIl + n) / this.llIlllIlllllIIllIIII;
        final float n8 = n7 * n7;
        final double iIlllIlIIllIlIlIlIIl = this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
        final double llIIIlIlIllIIlIlIlII = this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII;
        final double lllllIlIIIlIlIIlllII = this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
        final double n9 = this.IIIIIIIllllIlIIIIIII.lIIlIIIlIllIlIllIIIl + (this.IIIIIIIllllIlIIIIIII.IIlllIlIIllIlIlIlIIl - this.IIIIIIIllllIlIIIIIII.lIIlIIIlIllIlIllIIIl) * n;
        final double n10 = this.IIIIIIIllllIlIIIIIII.IIlIIIlllIllIllIlIII + (this.IIIIIIIllllIlIIIIIII.llIIIlIlIllIIlIlIlII - this.IIIIIIIllllIlIIIIIII.IIlIIIlllIllIllIlIII) * n + this.lllllIlIlIlllIlllIlI;
        final double n11 = this.IIIIIIIllllIlIIIIIII.lIlIlIlllIIlIlIlllIl + (this.IIIIIIIllllIlIIIIIII.lllllIlIIIlIlIIlllII - this.IIIIIIIllllIlIIIIIII.lIlIlIlllIIlIlIlllIl) * n;
        final double n12 = iIlllIlIIllIlIlIlIIl + (n9 - iIlllIlIIllIlIlIlIIl) * n8;
        final double n13 = llIIIlIlIllIIlIlIlII + (n10 - llIIIlIlIllIIlIlIlII) * n8;
        final double n14 = lllllIlIIIlIlIIlllII + (n11 - lllllIlIIIlIlIIlllII) * n8;
        final int a_ = this.a_(n);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, a_ % 65536 / 1.0f, a_ / 65536 / 1.0f);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.IlIllllIIlIllIlIlIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, (float)(n12 - lIllIIIIIlllIIlIIllI.llllIIllllIlIlIIIIll), (float)(n13 - lIllIIIIIlllIIlIIllI.IlIllIlIlIIIlIlIlIII), (float)(n14 - lIllIIIIIlllIIlIIllI.IIlllIIlIllIllIlIIll), this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll, n);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            net.optifine.shaders.llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI)null);
            net.optifine.shaders.llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(bm);
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        ++this.IIlllIIIllIllIIlIlIl;
        if (this.IIlllIIIllIllIIlIlIl == this.llIlllIlllllIIllIIII) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
}
