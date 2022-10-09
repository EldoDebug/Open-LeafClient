package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIIIlIlIIIllIlIlIIl extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/arrow.png");
    }
    
    public IlIIIlIlIIIllIlIlIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n, final double n2, final double n3, final float n4, final float n5) {
        this.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl + (llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll - llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl) * n5 - 90.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI + (llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI - llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI) * n5, 0.0f, 0.0f, 1.0f);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        final int n6 = 0;
        final float n7 = 0.0f;
        final float n8 = 0.5f;
        final float n9 = (0 + n6 * 10) / 32.0f;
        final float n10 = (5 + n6 * 10) / 32.0f;
        final float n11 = 0.0f;
        final float n12 = 0.15625f;
        final float n13 = (5 + n6 * 10) / 32.0f;
        final float n14 = (10 + n6 * 10) / 32.0f;
        final float n15 = 0.05625f;
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        final float n16 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl - n5;
        if (n16 > 0.0f) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n16 * 3.0f) * n16, 0.0f, 0.0f, 1.0f);
        }
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(45.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n15, n15, n15);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-4.0f, 0.0f, 0.0f);
        GL11.glNormal3f(n15, 0.0f, 0.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-7.0, -2.0, -2.0).llllIIIIlIIIlIlllIll(n11, n13).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-7.0, -2.0, 2.0).llllIIIIlIIIlIlllIll(n12, n13).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-7.0, 2.0, 2.0).llllIIIIlIIIlIlllIll(n12, n14).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-7.0, 2.0, -2.0).llllIIIIlIIIlIlllIll(n11, n14).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        GL11.glNormal3f(-n15, 0.0f, 0.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-7.0, 2.0, -2.0).llllIIIIlIIIlIlllIll(n11, n13).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-7.0, 2.0, 2.0).llllIIIIlIIIlIlllIll(n12, n13).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-7.0, -2.0, 2.0).llllIIIIlIIIlIlllIll(n12, n14).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-7.0, -2.0, -2.0).llllIIIIlIIIlIlllIll(n11, n14).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        for (int i = 0; i < 4; ++i) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glNormal3f(0.0f, 0.0f, n15);
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-8.0, -2.0, 0.0).llllIIIIlIIIlIlllIll(n7, n9).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(8.0, -2.0, 0.0).llllIIIIlIIIlIlllIll(n8, n9).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(8.0, 2.0, 0.0).llllIIIIlIIIlIlllIll(n8, n10).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-8.0, 2.0, 0.0).llllIIIIlIIIlIlllIll(n7, n10).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        }
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;
    }
}
