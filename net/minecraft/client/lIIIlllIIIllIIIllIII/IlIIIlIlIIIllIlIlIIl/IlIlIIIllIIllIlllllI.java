package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIlIIIllIIllIlllllI extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    protected llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/endercrystal/endercrystal_beam.png");
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/enderdragon/dragon_exploding.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/entity/enderdragon/dragon.png");
    }
    
    public IlIlIIIllIIllIlllllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new llllIIllllIlIlIIIIll(0.0f), 0.5f);
        this.llllIIIIlIIIlIlllIll = (llllIIllllIlIlIIIIll)this.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(this));
        this.llllIIIIlIIIlIlllIll(new lIIIIlIIIIIlllIllIII());
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n, final float n2, final float n3) {
        final float n4 = (float)ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(7, n3)[0];
        final float n5 = (float)(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(5, n3)[1] - ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(10, n3)[1]);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-n4, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n5 * 10.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, 1.0f);
        if (ilIlIlIlIlllllllllIl.llIlllIlllllIIllIIII > 0) {
            float llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI((ilIlIlIlIlllllllllIl.llIlllIlllllIIllIIII + n3 - 1.0f) / 20.0f * 1.6f);
            if (llIllIIIIIllIlIIIIlI > 1.0f) {
                llIllIIIIIllIlIIIIlI = 1.0f;
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI * this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl), 0.0f, 0.0f, 1.0f);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        if (ilIlIlIlIlllllllllIl.F > 0) {
            final float n7 = ilIlIlIlIlllllllllIl.F / 200.0f;
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
            lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, n7);
            this.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IIIlIIIlIlIIlllIIlll);
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, n2, n3, n4, n5, n6);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(514);
        }
        this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, n2, n3, n4, n5, n6);
        if (ilIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll > 0) {
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(514);
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f, 0.5f);
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, n2, n3, n4, n5, n6);
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, false);
        super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, n2, n3, n4, n5);
        if (ilIlIlIlIlllllllllIl.G != null) {
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, n2, n3, n5);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final double n, final double n2, final double n3, final float n4) {
        final float n5 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((ilIlIlIlIlllllllllIl.G.llllIIIIlIIIlIlllIll + n4) * 0.2f) / 2.0f + 0.5f;
        final float n6 = (n5 * n5 + n5) * 0.2f;
        final float n7 = (float)(ilIlIlIlIlllllllllIl.G.IIlllIlIIllIlIlIlIIl - ilIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - (ilIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII - ilIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl) * (1.0f - n4));
        final float n8 = (float)(n6 + ilIlIlIlIlllllllllIl.G.llIIIlIlIllIIlIlIlII - 1.0 - ilIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - (ilIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII - ilIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII) * (1.0f - n4));
        final float n9 = (float)(ilIlIlIlIlllllllllIl.G.lllllIlIIIlIlIIlllII - ilIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII - (ilIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII - ilIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII) * (1.0f - n4));
        final float llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n7 * n7 + n9 * n9);
        final float llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n7 * n7 + n8 * n8 + n9 * n9);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + 2.0f, (float)n3);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(-Math.atan2(n9, n7)) * 180.0f / 3.1415927f - 90.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)(-Math.atan2(llIllIIIIIllIlIIIIlI, n8)) * 180.0f / 3.1415927f - 90.0f, 1.0f, 0.0f, 0.0f);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        this.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
        final float n10 = 0.0f - (ilIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl + n4) * 0.01f;
        final float n11 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n7 * n7 + n8 * n8 + n9 * n9) / 32.0f - (ilIlIlIlIlllllllllIl.lllllIIIIIlIlIIIIIIl + n4) * 0.01f;
        llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll(5, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        for (int i = 0; i <= 8; ++i) {
            final float n12 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(i % 8 * 3.1415927f * 2.0f / 8.0f) * 0.75f;
            final float n13 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(i % 8 * 3.1415927f * 2.0f / 8.0f) * 0.75f;
            final float n14 = i % 8 * 1.0f / 8.0f;
            llIllIIIIIllIlIIIIlI3.IlIlIlIlIlllllllllIl(n12 * 0.2f, n13 * 0.2f, 0.0).llllIIIIlIIIlIlllIll(n14, n11).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI3.IlIlIlIlIlllllllllIl(n12, n13, (double)llIllIIIIIllIlIIIIlI2).llllIIIIlIIIlIlllIll(n14, n10).IlIlIlIlIlllllllllIl(255, 255, 255, 255).IlIlIIIllIllIIIIIllI();
        }
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
        lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return IlIlIIIllIIllIlllllI.IlIlIIIlIIlIlIIlllIl;
    }
}
