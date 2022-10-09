package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public abstract class IIllllIIIlIIIIIIllIl extends IIllIIIlIIlIlIlIIIII
{
    public IIllllIIIlIIIIIIllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n) {
        super(lllIllIIIllllllIllll, ilIIIlIlIIIllIlIlIIl, n);
    }
    
    protected boolean IlIlIlIlIlllllllllIl(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        return super.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII) && (ilIllIlIlIIIlIlIlIII.lIIlllIlllllIIlllIll() || (ilIllIlIlIIIlIlIlIII.w_() && ilIllIlIlIIIlIlIlIII == this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl));
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3) {
        return super.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, ilIIIlIlIIIllIlIlIIl, n, n2, n3) || (ilIllIlIlIIIlIlIlIII.t() && ilIllIlIlIIIlIlIlIII.u() != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.u().IlIIlllIIlIlllllIIlI()));
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final double n, final double n2, final double n3, final float n4, final float n5) {
        super.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, n, n2, n3, n4, n5);
        this.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII, n, n2, n3, n4, n5);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final float n) {
        final int a_ = ilIllIlIlIIIlIlIlIII.a_(n);
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, a_ % 65536 / 1.0f, a_ / 65536 / 1.0f);
    }
    
    private double llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        return n + (n2 - n) * n3;
    }
    
    protected void IlIlIlIlIlllllllllIl(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, double n, double n2, double n3, final float n4, final float n5) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() || !llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI u = ilIllIlIlIIIlIlIlIII.u();
            if (u != null) {
                n2 -= (1.6 - ilIllIlIlIIIlIlIlIII.IlIllllIIlIIlIlIlIll) * 0.5;
                final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                final double n6 = this.llllIIIIlIIIlIlllIll(u.IIIllllllIllIIIlllIl, u.IIlIIIIIllIlIIIlIIll, (double)(n5 * 0.5f)) * 0.01745329238474369;
                final double n7 = this.llllIIIIlIIIlIlllIll(u.IlIIIlIIIllllIlIlIlI, u.llllllIllIllIlIllllI, (double)(n5 * 0.5f)) * 0.01745329238474369;
                double cos = Math.cos(n6);
                double sin = Math.sin(n6);
                double sin2 = Math.sin(n7);
                if (u instanceof lIlIlIIIllIIllIIIllI) {
                    cos = 0.0;
                    sin = 0.0;
                    sin2 = -1.0;
                }
                final double cos2 = Math.cos(n7);
                final double n8 = this.llllIIIIlIIIlIlllIll(u.IIlIIIIlllIlllllIlII, u.IIlllIlIIllIlIlIlIIl, n5) - cos * 0.7 - sin * 0.5 * cos2;
                final double n9 = this.llllIIIIlIIIlIlllIll(u.IIIlIIlIIIIlllIlllII + u.llllIlIllllIIlIIlIlI() * 0.7, u.llIIIlIlIllIIlIlIlII + u.llllIlIllllIIlIIlIlI() * 0.7, n5) - sin2 * 0.5 - 0.25;
                final double n10 = this.llllIIIIlIIIlIlllIll(u.IlIlIllllllllIIIIlII, u.lllllIlIIIlIlIIlllII, n5) - sin * 0.7 + cos * 0.5 * cos2;
                final double n11 = this.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.IlIllIIllIIlIIIIlIIl, ilIllIlIlIIIlIlIlIII.lIllIlIIIllllllIIlII, (double)n5) * 0.01745329238474369 + 1.5707963267948966;
                final double n12 = Math.cos(n11) * ilIllIlIlIIIlIlIlIII.IllIllIIIIlIIlIlllII * 0.4;
                final double n13 = Math.sin(n11) * ilIllIlIlIIIlIlIlIII.IllIllIIIIlIIlIlllII * 0.4;
                final double n14 = this.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.IIlIIIIlllIlllllIlII, ilIllIlIlIIIlIlIlIII.IIlllIlIIllIlIlIlIIl, n5) + n12;
                final double llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.IIIlIIlIIIIlllIlllII, ilIllIlIlIIIlIlIlIII.llIIIlIlIllIIlIlIlII, n5);
                final double n15 = this.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII.IlIlIllllllllIIIIlII, ilIllIlIlIIIlIlIlIII.lllllIlIIIlIlIIlllII, n5) + n13;
                n += n12;
                n3 += n13;
                final double n16 = (float)(n8 - n14);
                final double n17 = (float)(n9 - llllIIIIlIIIlIlllIll2);
                final double n18 = (float)(n10 - n15);
                lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                    llIIlllIIlllIIllIllI.IllIlIllIllIlllIIlll();
                }
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(5, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                for (int i = 0; i <= 24; ++i) {
                    float n19 = 0.5f;
                    float n20 = 0.4f;
                    float n21 = 0.3f;
                    if (i % 2 == 0) {
                        n19 *= 0.7f;
                        n20 *= 0.7f;
                        n21 *= 0.7f;
                    }
                    final float n22 = i / 24.0f;
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n16 * n22 + 0.0, n2 + n17 * (n22 * n22 + n22) * 0.5 + ((24.0f - i) / 18.0f + 0.125f), n3 + n18 * n22).llllIIIIlIIIlIlllIll(n19, n20, n21, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n16 * n22 + 0.025, n2 + n17 * (n22 * n22 + n22) * 0.5 + ((24.0f - i) / 18.0f + 0.125f) + 0.025, n3 + n18 * n22).llllIIIIlIIIlIlllIll(n19, n20, n21, 1.0f).IlIlIIIllIllIIIIIllI();
                }
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(5, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                for (int j = 0; j <= 24; ++j) {
                    float n23 = 0.5f;
                    float n24 = 0.4f;
                    float n25 = 0.3f;
                    if (j % 2 == 0) {
                        n23 *= 0.7f;
                        n24 *= 0.7f;
                        n25 *= 0.7f;
                    }
                    final float n26 = j / 24.0f;
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n16 * n26 + 0.0, n2 + n17 * (n26 * n26 + n26) * 0.5 + ((24.0f - j) / 18.0f + 0.125f) + 0.025, n3 + n18 * n26).llllIIIIlIIIlIlllIll(n23, n24, n25, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n16 * n26 + 0.025, n2 + n17 * (n26 * n26 + n26) * 0.5 + ((24.0f - j) / 18.0f + 0.125f), n3 + n18 * n26 + 0.025).llllIIIIlIIIlIlllIll(n23, n24, n25, 1.0f).IlIlIIIllIllIIIIIllI();
                }
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                    llIIlllIIlllIIllIllI.IIllIIIlIIlIlIlIIIII();
                }
                lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
                lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            }
        }
    }
}
