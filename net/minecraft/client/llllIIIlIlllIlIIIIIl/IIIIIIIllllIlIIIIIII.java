package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;

public class IIIIIIIllllIlIIIIIII extends IIIllllllIllIIIlllIl
{
    private lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    
    protected IIIIIIIllllIlIIIIIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        final float llIIlIIIlIIIllIlIIIl = 1.0f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        final double lIllllllIIllIlIlIlII = 0.0;
        this.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 30;
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.llllIIIIlIIIlIlllIll == null) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.lllIIIIlllllIlIIllIl(this.IlllllllIIIlIIIlIlII);
            llllIIIIlIIIlIlllIll.aq();
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        if (this.llllIIIIlIIIlIlllIll != null) {
            final lllIllIIIllllllIllll lllllIIIIIlIlIIIIIIl = Minecraft.getMinecraft().lllllIIIIIlIlIIIIIIl();
            lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.llllIIllllIlIlIIIIll, IIIllllllIllIIIlllIl.IlIllIlIlIIIlIlIlIII, IIIllllllIllIIIlllIl.IIlllIIlIllIllIlIIll);
            final float n7 = 0.42553192f;
            final float n8 = (this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            final float n9 = 240.0f;
            net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, n9, n9);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 0.05f + 0.5f * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n8 * 3.1415927f));
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 1.8f, 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll, 0.0f, 1.0f, 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(60.0f - 150.0f * n8 - llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI, 1.0f, 0.0f, 0.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -0.4f, -1.5f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n7, n7, n7);
            final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll;
            final float n10 = 0.0f;
            llllIIIIlIIIlIlllIll2.IIIllllllIllIIIlllIl = n10;
            llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = n10;
            final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll;
            final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll;
            final float n11 = 0.0f;
            llllIIIIlIIIlIlllIll4.lIllIIlIlIlllllIIIII = n11;
            llllIIIIlIIIlIlllIll3.lIIlllIlllllIIlllIll = n11;
            lllllIIIIIlIlIIIIIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, 0.0, 0.0, 0.0, 0.0f, n);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
        }
    }
}
