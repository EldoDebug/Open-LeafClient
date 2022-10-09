package net.optifine.IlIlIIIllIllIIIIIllI;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private float IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private float llIIlIIIlIIIllIlIIIl;
    private float llIllIlIIIIllIlIIllI;
    private float lIlIlIIIllIIllIIIllI;
    private float IlIlIIIllIIllIlllllI;
    private float IIIIlllIIIIIIlIIIlll;
    
    public IlIIIlIlIIIllIlIlIIl(final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI, final float illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final float llIIlIIIlIIIllIlIIIl) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 0;
        this.lIIIIlIIIIIlllIllIII = 0;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llIIlIIIlIIIllIlIIIl = 0.0f;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = 0.0f;
        this.IlIlIIIllIIllIlllllI = 0.0f;
        this.IIIIlllIIIIIIlIIIlll = 0.0f;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = ilIlIlIlIlllllllllIl / llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.lIlIlIIIllIIllIIIllI = llIllIIIIIllIlIIIIlI / llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IlIlIIIllIIllIlllllI = (ilIlIlIlIlllllllllIl + llllIIIlIlllIlIIIIIl) / llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.IIIIlllIIIIIIlIIIlll = (llIllIIIIIllIlIIIIlI + liiiIlIIIIIlllIllIII) / llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII, final float n) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl * n, this.IlIlIIIllIllIIIIIllI * n, this.IllIIlllIIIIlllIIlIl * n);
        float n2 = this.llIllIlIIIIllIlIIllI;
        float n3 = this.IlIlIIIllIIllIlllllI;
        float n4 = this.lIlIlIIIllIIllIIIllI;
        float n5 = this.IIIIlllIIIIIIlIIIlll;
        if (this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII) {
            n2 = this.IlIlIIIllIIllIlllllI;
            n3 = this.llIllIlIIIIllIlIIllI;
        }
        if (this.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl) {
            n4 = this.IIIIlllIIIIIIlIIIlll;
            n5 = this.lIlIlIIIllIIllIIIllI;
        }
        llllIIIIlIIIlIlllIll(illlIIlllIIIlIlllII, n2, n4, n3, n5, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, n * this.lIIIlllIIIllIIIllIII, this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIIIlIlIIIllIlIlIIl * n, -this.IlIlIIIllIllIIIIIllI * n, -this.IllIIlllIIIIlllIIlIl * n);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII, final float n, final float n2, final float n3, final float n4, final int n5, final int n6, float n7, final float n8, final float n9) {
        if (n7 < 6.25E-4f) {
            n7 = 6.25E-4f;
        }
        final float n10 = n3 - n;
        final float n11 = n4 - n2;
        final double n12 = llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(n10) * (n8 / 16.0f);
        final double n13 = llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(n11) * (n9 / 16.0f);
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI();
        GL11.glNormal3f(0.0f, 0.0f, -1.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n13, 0.0).llllIIIIlIIIlIlllIll(n, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n12, n13, 0.0).llllIIIIlIIIlIlllIll(n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n12, 0.0, 0.0).llllIIIIlIIIlIlllIll(n3, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, 0.0).llllIIIIlIIIlIlllIll(n, n2).IlIlIIIllIllIIIIIllI();
        illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, 0.0, n7).llllIIIIlIIIlIlllIll(n, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n12, 0.0, n7).llllIIIIlIIIlIlllIll(n3, n2).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n12, n13, n7).llllIIIIlIIIlIlllIll(n3, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n13, n7).llllIIIIlIIIlIlllIll(n, n4).IlIlIIIllIllIIIIIllI();
        illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
        final float n14 = 0.5f * n10 / n5;
        final float n15 = 0.5f * n11 / n6;
        GL11.glNormal3f(-1.0f, 0.0f, 0.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        for (int i = 0; i < n5; ++i) {
            final float n16 = i / (float)n5;
            final float n17 = n + n10 * n16 + n14;
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n16 * n12, n13, n7).llllIIIIlIIIlIlllIll(n17, n4).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n16 * n12, n13, 0.0).llllIIIIlIIIlIlllIll(n17, n4).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n16 * n12, 0.0, 0.0).llllIIIIlIIIlIlllIll(n17, n2).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n16 * n12, 0.0, n7).llllIIIIlIIIlIlllIll(n17, n2).IlIlIIIllIllIIIIIllI();
        }
        illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
        GL11.glNormal3f(1.0f, 0.0f, 0.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        for (int j = 0; j < n5; ++j) {
            final float n18 = j / (float)n5;
            final float n19 = n + n10 * n18 + n14;
            final float n20 = n18 + 1.0f / n5;
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20 * n12, 0.0, n7).llllIIIIlIIIlIlllIll(n19, n2).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20 * n12, 0.0, 0.0).llllIIIIlIIIlIlllIll(n19, n2).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20 * n12, n13, 0.0).llllIIIIlIIIlIlllIll(n19, n4).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n20 * n12, n13, n7).llllIIIIlIIIlIlllIll(n19, n4).IlIlIIIllIllIIIIIllI();
        }
        illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
        GL11.glNormal3f(0.0f, 1.0f, 0.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        for (int k = 0; k < n6; ++k) {
            final float n21 = k / (float)n6;
            final float n22 = n2 + n11 * n21 + n15;
            final float n23 = n21 + 1.0f / n6;
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n23 * n13, n7).llllIIIIlIIIlIlllIll(n, n22).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n12, n23 * n13, n7).llllIIIIlIIIlIlllIll(n3, n22).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n12, n23 * n13, 0.0).llllIIIIlIIIlIlllIll(n3, n22).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n23 * n13, 0.0).llllIIIIlIIIlIlllIll(n, n22).IlIlIIIllIllIIIIIllI();
        }
        illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
        GL11.glNormal3f(0.0f, -1.0f, 0.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        for (int l = 0; l < n6; ++l) {
            final float n24 = l / (float)n6;
            final float n25 = n2 + n11 * n24 + n15;
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n12, n24 * n13, n7).llllIIIIlIIIlIlllIll(n3, n25).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n24 * n13, n7).llllIIIIlIIIlIlllIll(n, n25).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(0.0, n24 * n13, 0.0).llllIIIIlIIIlIlllIll(n, n25).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n12, n24 * n13, 0.0).llllIIIIlIIIlIlllIll(n3, n25).IlIlIIIllIllIIIIIllI();
        }
        illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
    }
}
