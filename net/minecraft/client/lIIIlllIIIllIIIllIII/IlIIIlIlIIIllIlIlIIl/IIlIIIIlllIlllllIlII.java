package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlIIIIlllIlllllIlII extends IIllllIIIlIIIIIIllIl
{
    private static final lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    private static final lIllllIllIllIIllllll IIIlIIIlIlIIlllIIlll;
    private static final lIllllIllIllIIllllll IlIlIIIlIIlIlIIlllIl;
    int llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIIIllIllIIIIIllI = new lIllllIllIllIIllllll("textures/entity/guardian.png");
        IIIlIIIlIlIIlllIIlll = new lIllllIllIllIIllllll("textures/entity/guardian_elder.png");
        IlIlIIIlIIlIlIIlllIl = new lIllllIllIllIIllllll("textures/entity/guardian_beam.png");
    }
    
    public IIlIIIIlllIlllllIlII(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll, new IIllIIllIIIlIlIIIIlI(), 0.5f);
        this.llllIIIIlIIIlIlllIll = ((IIllIIllIIIlIlIIIIlI)this.IllIIlllIIIIlllIIlIl).llllIIIIlIIIlIlllIll();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3) {
        if (super.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, ilIIIlIlIIIllIlIlIIl, n, n2, n3)) {
            return true;
        }
        if (lllIIIIlllllIlIIllIl.ar()) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl as = lllIIIIlllllIlIIllIl.as();
            if (as != null) {
                final e llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(as, as.IlIllllIIlIIlIlIlIll * 0.5, 1.0f);
                final e llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, (double)lllIIIIlllllIlIIllIl.llllIlIllllIIlIIlIlI(), 1.0f);
                if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private e llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final double n, final float n2) {
        return new e(lllIIIIlllllIlIIllIl.lIIlIIIlIllIlIllIIIl + (lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl - lllIIIIlllllIlIIllIl.lIIlIIIlIllIlIllIIIl) * n2, n + lllIIIIlllllIlIIllIl.IIlIIIlllIllIllIlIII + (lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII - lllIIIIlllllIlIIllIl.IIlIIIlllIllIllIlIII) * n2, lllIIIIlllllIlIIllIl.lIlIlIlllIIlIlIlllIl + (lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII - lllIIIIlllllIlIIllIl.lIlIlIlllIIlIlIlllIl) * n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        if (this.llllIIIIlIIIlIlllIll != ((IIllIIllIIIlIlIIIIlI)this.IllIIlllIIIIlllIIlIl).llllIIIIlIIIlIlllIll()) {
            this.IllIIlllIIIIlllIIlIl = new IIllIIllIIIlIlIIIIlI();
            this.llllIIIIlIIIlIlllIll = ((IIllIIllIIIlIlIIIIlI)this.IllIIlllIIIIlllIIlIl).llllIIIIlIIIlIlllIll();
        }
        super.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3, n4, n5);
        final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl as = lllIIIIlllllIlIIllIl.as();
        if (as != null) {
            final float ilIllIlIlIIIlIlIlIII = lllIIIIlllllIlIIllIl.IlIllIlIlIIIlIlIlIII(n5);
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            this.llllIIIIlIIIlIlllIll(IIlIIIIlllIlllllIlII.IlIlIIIlIIlIlIIlllIl);
            GL11.glTexParameterf(3553, 10242, 10497.0f);
            GL11.glTexParameterf(3553, 10243, 10497.0f);
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            final float n6 = 240.0f;
            lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, n6, n6);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 1, 1, 0);
            final float n7 = lllIIIIlllllIlIIllIl.IlllllllIIIlIIIlIlII.IIIlIIlIIIIlllIlllII() + n5;
            final float n8 = n7 * 0.5f % 1.0f;
            final float llllIlIllllIIlIIlIlI = lllIIIIlllllIlIIllIl.llllIlIllllIIlIIlIlI();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2 + llllIlIllllIIlIIlIlI, (float)n3);
            final e ilIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(as, as.IlIllllIIlIIlIlIlIll * 0.5, n5).IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, (double)llllIlIllllIIlIIlIlI, n5));
            final double n9 = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() + 1.0;
            final e llllIIIIlIIIlIlllIll2 = ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
            final float n10 = (float)Math.acos(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((1.5707964f + -(float)Math.atan2(llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll)) * 57.295776f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n10 * 57.295776f, 1.0f, 0.0f, 0.0f);
            final int n11 = 1;
            final double n12 = n7 * 0.05 * (1.0 - (n11 & 0x1) * 2.5);
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
            final float n13 = ilIllIlIlIIIlIlIlIII * ilIllIlIlIIIlIlIlIII;
            final int n14 = 64 + (int)(n13 * 240.0f);
            final int n15 = 32 + (int)(n13 * 192.0f);
            final int n16 = 128 - (int)(n13 * 64.0f);
            final double n17 = n11 * 0.2;
            final double n18 = n17 * 1.41;
            final double n19 = 0.0 + Math.cos(n12 + 2.356194490192345) * n18;
            final double n20 = 0.0 + Math.sin(n12 + 2.356194490192345) * n18;
            final double n21 = 0.0 + Math.cos(n12 + 0.7853981633974483) * n18;
            final double n22 = 0.0 + Math.sin(n12 + 0.7853981633974483) * n18;
            final double n23 = 0.0 + Math.cos(n12 + 3.9269908169872414) * n18;
            final double n24 = 0.0 + Math.sin(n12 + 3.9269908169872414) * n18;
            final double n25 = 0.0 + Math.cos(n12 + 5.497787143782138) * n18;
            final double n26 = 0.0 + Math.sin(n12 + 5.497787143782138) * n18;
            final double n27 = 0.0 + Math.cos(n12 + 3.141592653589793) * n17;
            final double n28 = 0.0 + Math.sin(n12 + 3.141592653589793) * n17;
            final double n29 = 0.0 + Math.cos(n12 + 0.0) * n17;
            final double n30 = 0.0 + Math.sin(n12 + 0.0) * n17;
            final double n31 = 0.0 + Math.cos(n12 + 1.5707963267948966) * n17;
            final double n32 = 0.0 + Math.sin(n12 + 1.5707963267948966) * n17;
            final double n33 = 0.0 + Math.cos(n12 + 4.71238898038469) * n17;
            final double n34 = 0.0 + Math.sin(n12 + 4.71238898038469) * n17;
            final double n35 = -1.0f + n8;
            final double n36 = n9 * (0.5 / n17) + n35;
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n27, n9, n28).llllIIIIlIIIlIlllIll(0.4999, n36).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n27, 0.0, n28).llllIIIIlIIIlIlllIll(0.4999, n35).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n29, 0.0, n30).llllIIIIlIIIlIlllIll(0.0, n35).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n29, n9, n30).llllIIIIlIIIlIlllIll(0.0, n36).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n31, n9, n32).llllIIIIlIIIlIlllIll(0.4999, n36).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n31, 0.0, n32).llllIIIIlIIIlIlllIll(0.4999, n35).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n33, 0.0, n34).llllIIIIlIIIlIlllIll(0.0, n35).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n33, n9, n34).llllIIIIlIIIlIlllIll(0.0, n36).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            double n37 = 0.0;
            if (lllIIIIlllllIlIIllIl.lllllIIIIIlIlIIIIIIl % 2 == 0) {
                n37 = 0.5;
            }
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n19, n9, n20).llllIIIIlIIIlIlllIll(0.5, n37 + 0.5).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n9, n22).llllIIIIlIIIlIlllIll(1.0, n37 + 0.5).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n25, n9, n26).llllIIIIlIIIlIlllIll(1.0, n37).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n23, n9, n24).llllIIIIlIIIlIlllIll(0.5, n37).IlIlIlIlIlllllllllIl(n14, n15, n16, 255).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
        if (lllIIIIlllllIlIIllIl.ap()) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2.35f, 2.35f, 2.35f);
        }
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return lllIIIIlllllIlIIllIl.ap() ? IIlIIIIlllIlllllIlII.IIIlIIIlIlIIlllIIlll : IIlIIIIlllIlllllIlII.IlIlIIIllIllIIIIIllI;
    }
}
