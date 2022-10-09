package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIllllIIlIIlIlIlIll extends IIIllllllIllIIIlllIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private int IIIIIIIllllIlIIIIIII;
    private int IIlllIIIllIllIIlIlIl;
    private IIlllIIlIllIllIlIIll llIlllIlllllIIllIIII;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/particle/footprint.png");
    }
    
    protected IlIllllIIlIIlIlIlIll(final IIlllIIlIllIllIlIIll llIlllIlllllIIllIIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.llIlllIlllllIIllIIII = llIlllIlllllIIllIIII;
        final double lIllllllIIllIlIlIlII = 0.0;
        this.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.IIlllIIIllIllIIlIlIl = 200;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float n7 = (this.IIIIIIIllllIlIIIIIII + n) / this.IIlllIIIllIllIIlIlIl;
        float n8 = 2.0f - n7 * n7 * 2.0f;
        if (n8 > 1.0f) {
            n8 = 1.0f;
        }
        final float n9 = n8 * 0.2f;
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        final float n10 = (float)(this.IIlllIlIIllIlIlIlIIl - IlIllllIIlIIlIlIlIll.llllIIllllIlIlIIIIll);
        final float n11 = (float)(this.llIIIlIlIllIIlIlIlII - IlIllllIIlIIlIlIlIll.IlIllIlIlIIIlIlIlIII);
        final float n12 = (float)(this.lllllIlIIIlIlIIlllII - IlIllllIIlIIlIlIlIll.IIlllIIlIllIllIlIIll);
        final float ilIllIlIlIIIlIlIlIII = this.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII(new IlIlIlIlIlllllllllIl(this));
        this.llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll);
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n10 - 0.125f, n11, (double)(n12 + 0.125f)).llllIIIIlIIIlIlllIll(0.0, 1.0).llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, ilIllIlIlIIIlIlIlIII, ilIllIlIlIIIlIlIlIII, n9).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n10 + 0.125f, n11, (double)(n12 + 0.125f)).llllIIIIlIIIlIlllIll(1.0, 1.0).llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, ilIllIlIlIIIlIlIlIII, ilIllIlIlIIIlIlIlIII, n9).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n10 + 0.125f, n11, (double)(n12 - 0.125f)).llllIIIIlIIIlIlllIll(1.0, 0.0).llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, ilIllIlIlIIIlIlIlIII, ilIllIlIlIIIlIlIlIII, n9).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n10 - 0.125f, n11, (double)(n12 - 0.125f)).llllIIIIlIIIlIlllIll(0.0, 0.0).llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, ilIllIlIlIIIlIlIlIII, ilIllIlIlIIIlIlIlIII, n9).IlIlIIIllIllIIIIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        ++this.IIIIIIIllllIlIIIIIII;
        if (this.IIIIIIIllllIlIIIIIII == this.IIlllIIIllIllIIlIlIl) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public int IlIIIlIlIIIllIlIlIIl() {
        return 3;
    }
}
