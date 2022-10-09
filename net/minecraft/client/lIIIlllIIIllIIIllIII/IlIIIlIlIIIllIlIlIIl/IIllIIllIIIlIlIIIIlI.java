package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIllIIllIIIlIlIIIIlI extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/particle/particles.png");
    }
    
    public IIllIIllIIIlIlIIIIlI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.5f, 0.5f, 0.5f);
        this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 1.0f, 0.0f, 0.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-0.5, -0.5, 0.0).llllIIIIlIIIlIlllIll(0.0625, 0.1875).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.5, -0.5, 0.0).llllIIIIlIIIlIlllIll(0.125, 0.1875).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.5, 0.5, 0.0).llllIIIIlIIIlIlllIll(0.125, 0.125).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-0.5, 0.5, 0.0).llllIIIIlIIIlIlllIll(0.0625, 0.125).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl != null) {
            final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI(n5)) * 3.1415927f);
            final e llllIIIIlIIIlIlllIll3 = new e(-0.36, 0.03, 0.35).llllIIIIlIIIlIlllIll(-(ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIIIlIIIllllIlIlIlI + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllllIllIllIlIllllI - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIIIlIIIllllIlIlIlI) * n5) * 3.1415927f / 180.0f).IlIlIlIlIlllllllllIl(-(ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIIllllllIllIIIlllIl + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIlIIIIIllIlIIIlIIll - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIIllllllIllIIIlllIl) * n5) * 3.1415927f / 180.0f).IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2 * 0.5f).llllIIIIlIIIlIlllIll(-llllIIIIlIIIlIlllIll2 * 0.7f);
            double n6 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII) * n5 + llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll;
            double n7 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII) * n5 + llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl;
            double n8 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII) * n5 + llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI;
            double n9 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llllIlIllllIIlIIlIlI();
            if ((this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl != null && this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.IIIllIIllIIIIIIlIIlI > 0) || ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl != Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII) {
                final float n10 = (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIllIIllIIlIIIIlIIl + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.lIllIlIIIllllllIIlII - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIllIIllIIlIIIIlIIl) * n5) * 3.1415927f / 180.0f;
                final double n11 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n10);
                final double n12 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n10);
                n6 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII) * n5 - n12 * 0.35 - n11 * 0.8;
                n7 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII + n9 + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIIlIIlIIIIlllIlllII) * n5 - 0.45;
                n8 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII + (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII - ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII) * n5 - n11 * 0.35 + n12 * 0.8;
                n9 = (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.IIIIIllIIIIlIIIIllIl() ? -0.1875 : 0.0);
            }
            final double n13 = ilIIIlIlIIIllIlIlIIl.IIlIIIIlllIlllllIlII + (ilIIIlIlIIIllIlIlIIl.IIlllIlIIllIlIlIlIIl - ilIIIlIlIIIllIlIlIIl.IIlIIIIlllIlllllIlII) * n5;
            final double n14 = ilIIIlIlIIIllIlIlIIl.IIIlIIlIIIIlllIlllII + (ilIIIlIlIIIllIlIlIIl.llIIIlIlIllIIlIlIlII - ilIIIlIlIIIllIlIlIIl.IIIlIIlIIIIlllIlllII) * n5 + 0.25;
            final double n15 = ilIIIlIlIIIllIlIlIIl.IlIlIllllllllIIIIlII + (ilIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII - ilIIIlIlIIIllIlIlIIl.IlIlIllllllllIIIIlII) * n5;
            final double n16 = (float)(n6 - n13);
            final double n17 = (float)(n7 - n14) + n9;
            final double n18 = (float)(n8 - n15);
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(3, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
            for (int i = 0; i <= 16; ++i) {
                final float n19 = i / 16.0f;
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n16 * n19, n2 + n17 * (n19 * n19 + n19) * 0.5 + 0.25, n3 + n18 * n19).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
            }
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n, n2, n3, n4, n5);
        }
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
}
