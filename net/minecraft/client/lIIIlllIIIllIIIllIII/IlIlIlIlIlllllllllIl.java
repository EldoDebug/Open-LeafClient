package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.shaders.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;

public class IlIlIlIlIlllllllllIl
{
    private IlIlIIIllIIllIlllllI[] llllIIIIlIIIlIlllIll;
    private IlIlIIIllIIllIlllllI[] IlIlIlIlIlllllllllIl;
    
    public IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = new IlIlIIIllIIllIlllllI[2];
        this.IlIlIlIlIlllllllllIl = new IlIlIIIllIIllIlllllI[2];
        this.llllIIIIlIIIlIlllIll();
    }
    
    protected void llllIIIIlIIIlIlllIll() {
        final IlIlIIIIIIlllIlIllIl ilIllllIIlIIlIlIlIll = Minecraft.getMinecraft().IlIllllIIlIIlIlIlIll();
        this.llllIIIIlIIIlIlllIll[0] = ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll("minecraft:blocks/lava_still");
        this.llllIIIIlIIIlIlllIll[1] = ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll("minecraft:blocks/lava_flow");
        this.IlIlIlIlIlllllllllIl[0] = ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll("minecraft:blocks/water_still");
        this.IlIlIlIlIlllllllllIl[1] = ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll("minecraft:blocks/water_flow");
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        boolean b;
        try {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI, liIllIIIllllIlllIllI);
            }
            final IlIIlllIIlIlllllIIlI ilIIlllIIlIlllllIIlI = (IlIIlllIIlIlllllIIlI)llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
            ilIIlllIIlIlllllIIlI.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
            final IlIlIIIllIIllIlllllI[] array = (ilIIlllIIlIlllllIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) ? this.llllIIIIlIIIlIlllIll : this.IlIlIlIlIlllllllllIl;
            final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl);
            final int llllIIIIlIIIlIlllIll2 = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
            final float n = (llllIIIIlIIIlIlllIll2 >> 16 & 0xFF) / 255.0f;
            final float n2 = (llllIIIIlIIIlIlllIll2 >> 8 & 0xFF) / 255.0f;
            final float n3 = (llllIIIIlIIIlIlllIll2 & 0xFF) / 255.0f;
            final boolean llllIIIIlIIIlIlllIll3 = ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl);
            final boolean llllIIIIlIIIlIlllIll4 = ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll);
            final boolean[] liiIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII();
            liiIlllIIIllIIIllIII[0] = ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI);
            liiIlllIIIllIIIllIII[1] = ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
            liiIlllIIIllIIIllIII[2] = ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(), lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI);
            liiIlllIIIllIIIllIII[3] = ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl);
            if (llllIIIIlIIIlIlllIll3 || llllIIIIlIIIlIlllIll4 || liiIlllIIIllIIIllIII[0] || liiIlllIIIllIIIllIII[1] || liiIlllIIIllIIIllIII[2] || liiIlllIIIllIIIllIII[3]) {
                b = false;
                final float n4 = 1.0f;
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = ilIIlllIIlIlllllIIlI.IllIIlllIIIIlllIIlIl();
                float llllIIIIlIIIlIlllIll5 = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, illIIlllIIIIlllIIlIl);
                float llllIIIIlIIIlIlllIll6 = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(), illIIlllIIIIlllIIlIl);
                float llllIIIIlIIIlIlllIll7 = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl(), illIIlllIIIIlllIIlIl);
                float llllIIIIlIIIlIlllIll8 = this.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(), illIIlllIIIIlllIIlIl);
                final double n5 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                final double n6 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
                final double n7 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                final float n8 = 0.001f;
                if (llllIIIIlIIIlIlllIll3) {
                    b = true;
                    IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = array[0];
                    final float n9 = (float)IlIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, illIIlllIIIIlllIIlIl);
                    if (n9 > -999.0f) {
                        ilIlIIIllIIllIlllllI = array[1];
                    }
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI);
                    llllIIIIlIIIlIlllIll5 -= n8;
                    llllIIIIlIIIlIlllIll6 -= n8;
                    llllIIIIlIIIlIlllIll7 -= n8;
                    llllIIIIlIIIlIlllIll8 -= n8;
                    float n10;
                    float n11;
                    float llllIIIIlIIIlIlllIll9;
                    float n12;
                    float n13;
                    float ilIlIlIlIlllllllllIl2;
                    float llllIIIIlIIIlIlllIll10;
                    float ilIlIlIlIlllllllllIl3;
                    if (n9 < -999.0f) {
                        n10 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(0.0);
                        n11 = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(0.0);
                        llllIIIIlIIIlIlllIll9 = n10;
                        n12 = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(16.0);
                        n13 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(16.0);
                        ilIlIlIlIlllllllllIl2 = n12;
                        llllIIIIlIIIlIlllIll10 = n13;
                        ilIlIlIlIlllllllllIl3 = n11;
                    }
                    else {
                        final float n14 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n9) * 0.25f;
                        final float n15 = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n9) * 0.25f;
                        n10 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((double)(8.0f + (-n15 - n14) * 16.0f));
                        n11 = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl((double)(8.0f + (-n15 + n14) * 16.0f));
                        llllIIIIlIIIlIlllIll9 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((double)(8.0f + (-n15 + n14) * 16.0f));
                        n12 = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl((double)(8.0f + (n15 + n14) * 16.0f));
                        n13 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((double)(8.0f + (n15 + n14) * 16.0f));
                        ilIlIlIlIlllllllllIl2 = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl((double)(8.0f + (n15 - n14) * 16.0f));
                        llllIIIIlIIIlIlllIll10 = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll((double)(8.0f + (n15 - n14) * 16.0f));
                        ilIlIlIlIlllllllllIl3 = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl((double)(8.0f + (-n15 - n14) * 16.0f));
                    }
                    final int ilIlIlIlIlllllllllIl4 = ilIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
                    final int n16 = ilIlIlIlIlllllllllIl4 >> 16 & 0xFFFF;
                    final int n17 = ilIlIlIlIlllllllllIl4 & 0xFFFF;
                    final float n18 = n4 * n;
                    final float n19 = n4 * n2;
                    final float n20 = n4 * n3;
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 0.0, n6 + llllIIIIlIIIlIlllIll5, n7 + 0.0).llllIIIIlIIIlIlllIll(n18, n19, n20, 1.0f).llllIIIIlIIIlIlllIll(n10, n11).llllIIIIlIIIlIlllIll(n16, n17).IlIlIIIllIllIIIIIllI();
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 0.0, n6 + llllIIIIlIIIlIlllIll6, n7 + 1.0).llllIIIIlIIIlIlllIll(n18, n19, n20, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll9, n12).llllIIIIlIIIlIlllIll(n16, n17).IlIlIIIllIllIIIIIllI();
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 1.0, n6 + llllIIIIlIIIlIlllIll7, n7 + 1.0).llllIIIIlIIIlIlllIll(n18, n19, n20, 1.0f).llllIIIIlIIIlIlllIll(n13, ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(n16, n17).IlIlIIIllIllIIIIIllI();
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 1.0, n6 + llllIIIIlIIIlIlllIll8, n7 + 0.0).llllIIIIlIIIlIlllIll(n18, n19, n20, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll10, ilIlIlIlIlllllllllIl3).llllIIIIlIIIlIlllIll(n16, n17).IlIlIIIllIllIIIIIllI();
                    if (ilIIlllIIlIlllllIIlI.llllIIIlIlllIlIIIIIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll())) {
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 0.0, n6 + llllIIIIlIIIlIlllIll5, n7 + 0.0).llllIIIIlIIIlIlllIll(n18, n19, n20, 1.0f).llllIIIIlIIIlIlllIll(n10, n11).llllIIIIlIIIlIlllIll(n16, n17).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 1.0, n6 + llllIIIIlIIIlIlllIll8, n7 + 0.0).llllIIIIlIIIlIlllIll(n18, n19, n20, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll10, ilIlIlIlIlllllllllIl3).llllIIIIlIIIlIlllIll(n16, n17).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 1.0, n6 + llllIIIIlIIIlIlllIll7, n7 + 1.0).llllIIIIlIIIlIlllIll(n18, n19, n20, 1.0f).llllIIIIlIIIlIlllIll(n13, ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(n16, n17).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 0.0, n6 + llllIIIIlIIIlIlllIll6, n7 + 1.0).llllIIIIlIIIlIlllIll(n18, n19, n20, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll9, n12).llllIIIIlIIIlIlllIll(n16, n17).IlIlIIIllIllIIIIIllI();
                    }
                }
                if (llllIIIIlIIIlIlllIll4) {
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(array[0]);
                    final float ilIlIIIllIllIIIIIllI = array[0].IlIlIIIllIllIIIIIllI();
                    final float illIIlllIIIIlllIIlIl2 = array[0].IllIIlllIIIIlllIIlIl();
                    final float llllIIIlIlllIlIIIIIl = array[0].llllIIIlIlllIlIIIIIl();
                    final float liiiIlIIIIIlllIllIII = array[0].lIIIIlIIIIIlllIllIII();
                    final int ilIlIlIlIlllllllllIl5 = ilIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                    final int n21 = ilIlIlIlIlllllllllIl5 >> 16 & 0xFFFF;
                    final int n22 = ilIlIlIlIlllllllllIl5 & 0xFFFF;
                    final float llllIIIIlIIIlIlllIll11 = net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll);
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5, n6, n7 + 1.0).llllIIIIlIIIlIlllIll(n * llllIIIIlIIIlIlllIll11, n2 * llllIIIIlIIIlIlllIll11, n3 * llllIIIIlIIIlIlllIll11, 1.0f).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, liiiIlIIIIIlllIllIII).llllIIIIlIIIlIlllIll(n21, n22).IlIlIIIllIllIIIIIllI();
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5, n6, n7).llllIIIIlIIIlIlllIll(n * llllIIIIlIIIlIlllIll11, n2 * llllIIIIlIIIlIlllIll11, n3 * llllIIIIlIIIlIlllIll11, 1.0f).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(n21, n22).IlIlIIIllIllIIIIIllI();
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 1.0, n6, n7).llllIIIIlIIIlIlllIll(n * llllIIIIlIIIlIlllIll11, n2 * llllIIIIlIIIlIlllIll11, n3 * llllIIIIlIIIlIlllIll11, 1.0f).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl2, llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(n21, n22).IlIlIIIllIllIIIIIllI();
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n5 + 1.0, n6, n7 + 1.0).llllIIIIlIIIlIlllIll(n * llllIIIIlIIIlIlllIll11, n2 * llllIIIIlIIIlIlllIll11, n3 * llllIIIIlIIIlIlllIll11, 1.0f).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl2, liiiIlIIIIIlllIllIII).llllIIIIlIIIlIlllIll(n21, n22).IlIlIIIllIllIIIIIllI();
                    b = true;
                }
                for (int i = 0; i < 4; ++i) {
                    int n23 = 0;
                    int n24 = 0;
                    if (i == 0) {
                        --n24;
                    }
                    if (i == 1) {
                        ++n24;
                    }
                    if (i == 2) {
                        --n23;
                    }
                    if (i == 3) {
                        ++n23;
                    }
                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll12 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n23, 0, n24);
                    final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2 = array[1];
                    liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI2);
                    if (liiIlllIIIllIIIllIII[i]) {
                        float n25;
                        float n26;
                        double n27;
                        double n28;
                        double n29;
                        double n30;
                        if (i == 0) {
                            n25 = llllIIIIlIIIlIlllIll5;
                            n26 = llllIIIIlIIIlIlllIll8;
                            n27 = n5;
                            n28 = n5 + 1.0;
                            n29 = n7 + n8;
                            n30 = n7 + n8;
                        }
                        else if (i == 1) {
                            n25 = llllIIIIlIIIlIlllIll7;
                            n26 = llllIIIIlIIIlIlllIll6;
                            n27 = n5 + 1.0;
                            n28 = n5;
                            n29 = n7 + 1.0 - n8;
                            n30 = n7 + 1.0 - n8;
                        }
                        else if (i == 2) {
                            n25 = llllIIIIlIIIlIlllIll6;
                            n26 = llllIIIIlIIIlIlllIll5;
                            n27 = n5 + n8;
                            n28 = n5 + n8;
                            n29 = n7 + 1.0;
                            n30 = n7;
                        }
                        else {
                            n25 = llllIIIIlIIIlIlllIll8;
                            n26 = llllIIIIlIIIlIlllIll7;
                            n27 = n5 + 1.0 - n8;
                            n28 = n5 + 1.0 - n8;
                            n29 = n7;
                            n30 = n7 + 1.0;
                        }
                        b = true;
                        final float llllIIIIlIIIlIlllIll13 = ilIlIIIllIIllIlllllI2.llllIIIIlIIIlIlllIll(0.0);
                        final float llllIIIIlIIIlIlllIll14 = ilIlIIIllIIllIlllllI2.llllIIIIlIIIlIlllIll(8.0);
                        final float ilIlIlIlIlllllllllIl6 = ilIlIIIllIIllIlllllI2.IlIlIlIlIlllllllllIl((double)((1.0f - n25) * 16.0f * 0.5f));
                        final float ilIlIlIlIlllllllllIl7 = ilIlIIIllIIllIlllllI2.IlIlIlIlIlllllllllIl((double)((1.0f - n26) * 16.0f * 0.5f));
                        final float ilIlIlIlIlllllllllIl8 = ilIlIIIllIIllIlllllI2.IlIlIlIlIlllllllllIl(8.0);
                        final int ilIlIlIlIlllllllllIl9 = ilIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll12);
                        final int n31 = ilIlIlIlIlllllllllIl9 >> 16 & 0xFFFF;
                        final int n32 = ilIlIlIlIlllllllllIl9 & 0xFFFF;
                        final float n33 = (i < 2) ? net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) : net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI);
                        final float n34 = n4 * n33 * n;
                        final float n35 = n4 * n33 * n2;
                        final float n36 = n4 * n33 * n3;
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n27, n6 + n25, n29).llllIIIIlIIIlIlllIll(n34, n35, n36, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll13, ilIlIlIlIlllllllllIl6).llllIIIIlIIIlIlllIll(n31, n32).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n28, n6 + n26, n30).llllIIIIlIIIlIlllIll(n34, n35, n36, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll14, ilIlIlIlIlllllllllIl7).llllIIIIlIIIlIlllIll(n31, n32).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n28, n6 + 0.0, n30).llllIIIIlIIIlIlllIll(n34, n35, n36, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll14, ilIlIlIlIlllllllllIl8).llllIIIIlIIIlIlllIll(n31, n32).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n27, n6 + 0.0, n29).llllIIIIlIIIlIlllIll(n34, n35, n36, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll13, ilIlIlIlIlllllllllIl8).llllIIIIlIIIlIlllIll(n31, n32).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n27, n6 + 0.0, n29).llllIIIIlIIIlIlllIll(n34, n35, n36, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll13, ilIlIlIlIlllllllllIl8).llllIIIIlIIIlIlllIll(n31, n32).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n28, n6 + 0.0, n30).llllIIIIlIIIlIlllIll(n34, n35, n36, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll14, ilIlIlIlIlllllllllIl8).llllIIIIlIIIlIlllIll(n31, n32).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n28, n6 + n26, n30).llllIIIIlIIIlIlllIll(n34, n35, n36, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll14, ilIlIlIlIlllllllllIl7).llllIIIIlIIIlIlllIll(n31, n32).IlIlIIIllIllIIIIIllI();
                        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n27, n6 + n25, n29).llllIIIIlIIIlIlllIll(n34, n35, n36, 1.0f).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll13, ilIlIlIlIlllllllllIl6).llllIIIIlIIIlIlllIll(n31, n32).IlIlIIIllIllIIIIIllI();
                    }
                }
                liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(null);
                return b;
            }
            b = false;
        }
        finally {
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liIllIIIllllIlllIllI);
            }
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
            IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liIllIIIllllIlllIllI);
        }
        return b;
    }
    
    private float llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        int n = 0;
        float n2 = 0.0f;
        for (int i = 0; i < 4; ++i) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-(i & 0x1), 0, -(i >> 1 & 0x1));
            if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == ilIlIlIlIlllllllllIl2) {
                return 1.0f;
            }
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
            if (illIIlllIIIIlllIIlIl != ilIlIlIlIlllllllllIl2) {
                if (!illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()) {
                    ++n2;
                    ++n;
                }
            }
            else {
                final int intValue = (int)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl);
                if (intValue >= 8 || intValue == 0) {
                    n2 += IlIIlllIIlIlllllIIlI.IlIlIIIllIllIIIIIllI(intValue) * 10.0f;
                    n += 10;
                }
                n2 += IlIIlllIIlIlllllIIlI.IlIlIIIllIllIIIIIllI(intValue);
                ++n;
            }
        }
        return 1.0f - n2 / n;
    }
}
