package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IllIllIlllIllllIIllI extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/painting/paintings_kristoffer_zetterstrand.png");
    }
    
    public IllIllIlllIllllIIllI(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(lllIllIIIllllllIllll);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n, n2, n3);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - n4, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        this.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl);
        final IIllIIllIIIlIlIIIIlI llIllIIIIIllIlIIIIlI = ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI;
        final float n6 = 0.0625f;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n6, n6, n6);
        this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII, llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII, llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI, llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII);
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        super.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, n, n2, n3, n4, n5);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        return IllIllIlllIllllIIllI.llllIIIIlIIIlIlllIll;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final int n, final int n2, final int n3, final int n4) {
        final float n5 = -n / 2.0f;
        final float n6 = -n2 / 2.0f;
        final float n7 = 0.5f;
        final float n8 = 0.75f;
        final float n9 = 0.8125f;
        final float n10 = 0.0f;
        final float n11 = 0.0625f;
        final float n12 = 0.75f;
        final float n13 = 0.8125f;
        final float n14 = 0.001953125f;
        final float n15 = 0.001953125f;
        final float n16 = 0.7519531f;
        final float n17 = 0.7519531f;
        final float n18 = 0.0f;
        final float n19 = 0.0625f;
        for (int i = 0; i < n / 16; ++i) {
            for (int j = 0; j < n2 / 16; ++j) {
                final float n20 = n5 + (i + 1) * 16;
                final float n21 = n5 + i * 16;
                final float n22 = n6 + (j + 1) * 16;
                final float n23 = n6 + j * 16;
                this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, (n20 + n21) / 2.0f, (n22 + n23) / 2.0f);
                final float n24 = (n3 + n - i * 16) / 256.0f;
                final float n25 = (n3 + n - (i + 1) * 16) / 256.0f;
                final float n26 = (n4 + n2 - j * 16) / 256.0f;
                final float n27 = (n4 + n2 - (j + 1) * 16) / 256.0f;
                final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n23, (double)(-n7)).llllIIIIlIIIlIlllIll(n25, n26).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n23, (double)(-n7)).llllIIIIlIIIlIlllIll(n24, n26).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n22, (double)(-n7)).llllIIIIlIIIlIlllIll(n24, n27).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n22, (double)(-n7)).llllIIIIlIIIlIlllIll(n25, n27).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n22, (double)n7).llllIIIIlIIIlIlllIll(n8, n10).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n22, (double)n7).llllIIIIlIIIlIlllIll(n9, n10).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n23, (double)n7).llllIIIIlIIIlIlllIll(n9, n11).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n23, (double)n7).llllIIIIlIIIlIlllIll(n8, n11).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n22, (double)(-n7)).llllIIIIlIIIlIlllIll(n12, n14).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n22, (double)(-n7)).llllIIIIlIIIlIlllIll(n13, n14).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n22, (double)n7).llllIIIIlIIIlIlllIll(n13, n15).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n22, (double)n7).llllIIIIlIIIlIlllIll(n12, n15).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n23, (double)n7).llllIIIIlIIIlIlllIll(n12, n14).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n23, (double)n7).llllIIIIlIIIlIlllIll(n13, n14).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n23, (double)(-n7)).llllIIIIlIIIlIlllIll(n13, n15).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n23, (double)(-n7)).llllIIIIlIIIlIlllIll(n12, n15).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n22, (double)n7).llllIIIIlIIIlIlllIll(n17, n18).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n23, (double)n7).llllIIIIlIIIlIlllIll(n17, n19).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n23, (double)(-n7)).llllIIIIlIIIlIlllIll(n16, n19).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20, n22, (double)(-n7)).llllIIIIlIIIlIlllIll(n16, n18).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n22, (double)(-n7)).llllIIIIlIIIlIlllIll(n17, n18).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n23, (double)(-n7)).llllIIIIlIIIlIlllIll(n17, n19).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n23, (double)n7).llllIIIIlIIIlIlllIll(n16, n19).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n21, n22, (double)n7).llllIIIIlIIIlIlllIll(n16, n18).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final float n, final float n2) {
        int n3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl.IIlllIlIIllIlIlIlIIl);
        final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl.llIIIlIlIllIIlIlIlII + n2 / 16.0f);
        int n4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl.lllllIlIIIlIlIIlllII);
        final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll ilIlIlIlIlllllllllIl = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI) {
            n3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl.IIlllIlIIllIlIlIlIIl + n / 16.0f);
        }
        if (ilIlIlIlIlllllllllIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI) {
            n4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl.lllllIlIIIlIlIIlllII - n / 16.0f);
        }
        if (ilIlIlIlIlllllllllIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl) {
            n3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl.IIlllIlIIllIlIlIlIIl - n / 16.0f);
        }
        if (ilIlIlIlIlllllllllIl == net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl) {
            n4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIIIIlllIlIllIl.lllllIlIIIlIlIIlllII + n / 16.0f);
        }
        final int llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n3, llIllIIIIIllIlIIIIlI, n4), 0);
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, (float)(llllIIIIlIIIlIlllIll % 65536), (float)(llllIIIIlIIIlIlllIll / 65536));
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f);
    }
}
