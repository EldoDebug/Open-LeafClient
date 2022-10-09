package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import org.lwjgl.opengl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.util.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class IllIIlllIIIIlllIIlIl extends IIlllIIlIllIllIlIIll
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/entity/beacon_beam.png");
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final double n, final double n2, final double n3, final float n4, final int n5) {
        final float illlllllIIIlIIIlIlII = llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII();
        if (illlllllIIIlIIIlIlII > 0.0) {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                llIIlllIIlllIIllIllI.lllIIIIlIlIllIIlIIIl();
            }
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
            if (illlllllIIIlIIIlIlII > 0.0f) {
                final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
                final List ilIlIIIlIIlIlIIlllIl = llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl();
                int n6 = 0;
                for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.size(); ++i) {
                    final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = ilIlIIIlIIlIlIIlllIl.get(i);
                    final int n7 = n6 + llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI();
                    this.llllIIIIlIIIlIlllIll(IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
                    GL11.glTexParameterf(3553, 10242, 10497.0f);
                    GL11.glTexParameterf(3553, 10243, 10497.0f);
                    lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                    lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
                    lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 1, 1, 0);
                    final double n8 = llIIlIIIlIIIllIlIIIl.IIlllIIIlIlllIIlllII().IIIlIIlIIIIlllIlllII() + (double)n4;
                    final double liiiIlIIIIIlllIllIII = llIllIIlllllllllllll.lIIIIlIIIIIlllIllIII(-n8 * 0.2 - llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(-n8 * 0.1));
                    final float n9 = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()[0];
                    final float n10 = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()[1];
                    final float n11 = llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl()[2];
                    final double n12 = n8 * 0.025 * -1.5;
                    final double n13 = 0.5 + Math.cos(n12 + 2.356194490192345) * 0.2;
                    final double n14 = 0.5 + Math.sin(n12 + 2.356194490192345) * 0.2;
                    final double n15 = 0.5 + Math.cos(n12 + 0.7853981633974483) * 0.2;
                    final double n16 = 0.5 + Math.sin(n12 + 0.7853981633974483) * 0.2;
                    final double n17 = 0.5 + Math.cos(n12 + 3.9269908169872414) * 0.2;
                    final double n18 = 0.5 + Math.sin(n12 + 3.9269908169872414) * 0.2;
                    final double n19 = 0.5 + Math.cos(n12 + 5.497787143782138) * 0.2;
                    final double n20 = 0.5 + Math.sin(n12 + 5.497787143782138) * 0.2;
                    final double n21 = -1.0 + liiiIlIIIIIlllIllIII;
                    final double n22 = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI() * illlllllIIIlIIIlIlII * 2.5 + n21;
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n13, n2 + n7, n3 + n14).llllIIIIlIIIlIlllIll(1.0, n22).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n13, n2 + n6, n3 + n14).llllIIIIlIIIlIlllIll(1.0, n21).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n15, n2 + n6, n3 + n16).llllIIIIlIIIlIlllIll(0.0, n21).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n15, n2 + n7, n3 + n16).llllIIIIlIIIlIlllIll(0.0, n22).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n19, n2 + n7, n3 + n20).llllIIIIlIIIlIlllIll(1.0, n22).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n19, n2 + n6, n3 + n20).llllIIIIlIIIlIlllIll(1.0, n21).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n17, n2 + n6, n3 + n18).llllIIIIlIIIlIlllIll(0.0, n21).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n17, n2 + n7, n3 + n18).llllIIIIlIIIlIlllIll(0.0, n22).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n15, n2 + n7, n3 + n16).llllIIIIlIIIlIlllIll(1.0, n22).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n15, n2 + n6, n3 + n16).llllIIIIlIIIlIlllIll(1.0, n21).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n19, n2 + n6, n3 + n20).llllIIIIlIIIlIlllIll(0.0, n21).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n19, n2 + n7, n3 + n20).llllIIIIlIIIlIlllIll(0.0, n22).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n17, n2 + n7, n3 + n18).llllIIIIlIIIlIlllIll(1.0, n22).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n17, n2 + n6, n3 + n18).llllIIIIlIIIlIlllIll(1.0, n21).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n13, n2 + n6, n3 + n14).llllIIIIlIIIlIlllIll(0.0, n21).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n13, n2 + n7, n3 + n14).llllIIIIlIIIlIlllIll(0.0, n22).llllIIIIlIIIlIlllIll(n9, n10, n11, 1.0f).IlIlIIIllIllIIIIIllI();
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                    final double n23 = -1.0 + liiiIlIIIIIlllIllIII;
                    final double n24 = llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI() * illlllllIIIlIIIlIlII + n23;
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.2, n2 + n7, n3 + 0.2).llllIIIIlIIIlIlllIll(1.0, n24).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.2, n2 + n6, n3 + 0.2).llllIIIIlIIIlIlllIll(1.0, n23).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.8, n2 + n6, n3 + 0.2).llllIIIIlIIIlIlllIll(0.0, n23).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.8, n2 + n7, n3 + 0.2).llllIIIIlIIIlIlllIll(0.0, n24).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.8, n2 + n7, n3 + 0.8).llllIIIIlIIIlIlllIll(1.0, n24).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.8, n2 + n6, n3 + 0.8).llllIIIIlIIIlIlllIll(1.0, n23).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.2, n2 + n6, n3 + 0.8).llllIIIIlIIIlIlllIll(0.0, n23).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.2, n2 + n7, n3 + 0.8).llllIIIIlIIIlIlllIll(0.0, n24).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.8, n2 + n7, n3 + 0.2).llllIIIIlIIIlIlllIll(1.0, n24).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.8, n2 + n6, n3 + 0.2).llllIIIIlIIIlIlllIll(1.0, n23).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.8, n2 + n6, n3 + 0.8).llllIIIIlIIIlIlllIll(0.0, n23).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.8, n2 + n7, n3 + 0.8).llllIIIIlIIIlIlllIll(0.0, n24).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.2, n2 + n7, n3 + 0.8).llllIIIIlIIIlIlllIll(1.0, n24).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.2, n2 + n6, n3 + 0.8).llllIIIIlIIIlIlllIll(1.0, n23).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.2, n2 + n6, n3 + 0.2).llllIIIIlIIIlIlllIll(0.0, n23).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.2, n2 + n7, n3 + 0.2).llllIIIIlIIIlIlllIll(0.0, n24).llllIIIIlIIIlIlllIll(n9, n10, n11, 0.125f).IlIlIIIllIllIIIIIllI();
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                    lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
                    lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
                    n6 = n7;
                }
                lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI();
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                llIIlllIIlllIIllIllI.IllIlllIllIIIIllllII();
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        return true;
    }
}
