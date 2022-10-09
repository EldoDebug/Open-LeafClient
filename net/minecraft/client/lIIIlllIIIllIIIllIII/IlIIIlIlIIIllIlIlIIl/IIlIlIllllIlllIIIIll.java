package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIlIlIllllIlllIIIIll extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/experience_orb.png");
    }
    
    public IIlIlIllllIlllIIIIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
        this.llIllIIIIIllIlIIIIlI = 0.15f;
        this.IlIIIlIlIIIllIlIlIIl = 0.75f;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        this.llIllIIIIIllIlIIIIlI(ilIlIIIlIIlIlIIlllIl);
        final int liiiIlIIIIIlllIllIII = ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII();
        final float n6 = (liiiIlIIIIIlllIllIII % 4 * 16 + 0) / 64.0f;
        final float n7 = (liiiIlIIIIIlllIllIII % 4 * 16 + 16) / 64.0f;
        final float n8 = (liiiIlIIIIIlllIllIII / 4 * 16 + 0) / 64.0f;
        final float n9 = (liiiIlIIIIIlllIllIII / 4 * 16 + 16) / 64.0f;
        final float n10 = 1.0f;
        final float n11 = 0.5f;
        final float n12 = 0.25f;
        final int a_ = ilIlIIIlIIlIlIIlllIl.a_(n5);
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, a_ % 65536 / 1.0f, a_ / 65536 / 1.0f);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        float llllIIIIlIIIlIlllIll = (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll + n5) / 2.0f;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
            llllIIIIlIIIlIlllIll = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        }
        final int n13 = (int)((llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll + 0.0f) + 1.0f) * 0.5f * 255.0f);
        final int n14 = (int)((llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll + 4.1887903f) + 1.0f) * 0.1f * 255.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.3f, 0.3f, 0.3f);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll);
        int n15 = n13;
        int n16 = 255;
        int n17 = n14;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
            final int ilIlIlIlIlllllllllIl = lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            if (ilIlIlIlIlllllllllIl >= 0) {
                n15 = (ilIlIlIlIlllllllllIl >> 16 & 0xFF);
                n16 = (ilIlIlIlIlllllllllIl >> 8 & 0xFF);
                n17 = (ilIlIlIlIlllllllllIl >> 0 & 0xFF);
            }
        }
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0f - n11, 0.0f - n12, 0.0).llllIIIIlIIIlIlllIll(n6, n9).IlIlIlIlIlllllllllIl(n15, n16, n17, 128).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n10 - n11, 0.0f - n12, 0.0).llllIIIIlIIIlIlllIll(n7, n9).IlIlIlIlIlllllllllIl(n15, n16, n17, 128).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n10 - n11, 1.0f - n12, 0.0).llllIIIIlIIIlIlllIll(n7, n8).IlIlIlIlIlllllllllIl(n15, n16, n17, 128).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0f - n11, 1.0f - n12, 0.0).llllIIIIlIIIlIlllIll(n6, n8).IlIlIlIlIlllllllllIl(n15, n16, n17, 128).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        return IIlIlIllllIlllIIIIll.llllIIIIlIIIlIlllIll;
    }
}
