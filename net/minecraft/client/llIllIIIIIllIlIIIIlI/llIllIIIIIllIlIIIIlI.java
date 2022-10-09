package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class llIllIIIIIllIlIIIIlI
{
    public static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    public static final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    public static final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    protected float IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/gui/options_background.png");
        IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll("textures/gui/container/stats_icons.png");
        llIllIIIIIllIlIIIIlI = new lIllllIllIllIIllllll("textures/gui/icons.png");
    }
    
    public void llllIIIIlIIIlIlllIll(int n, int n2, final int n3, final int n4) {
        if (n2 < n) {
            final int n5 = n;
            n = n2;
            n2 = n5;
        }
        llllIIIIlIIIlIlllIll(n, n3, n2 + 1, n3 + 1, n4);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, int n2, int n3, final int n4) {
        if (n3 < n2) {
            final int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        llllIIIIlIIIlIlllIll(n, n2 + 1, n + 1, n3, n4);
    }
    
    public static void llllIIIIlIIIlIlllIll(int n, int n2, int n3, int n4, final int n5) {
        if (n < n3) {
            final int n6 = n;
            n = n3;
            n3 = n6;
        }
        if (n2 < n4) {
            final int n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        final float n8 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n10 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n11 = (n5 & 0xFF) / 255.0f;
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n9, n10, n11, n8);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n4, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n4, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n2, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2, 0.0).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final float n7 = (n5 >> 24 & 0xFF) / 255.0f;
        final float n8 = (n5 >> 16 & 0xFF) / 255.0f;
        final float n9 = (n5 >> 8 & 0xFF) / 255.0f;
        final float n10 = (n5 & 0xFF) / 255.0f;
        final float n11 = (n6 >> 24 & 0xFF) / 255.0f;
        final float n12 = (n6 >> 16 & 0xFF) / 255.0f;
        final float n13 = (n6 >> 8 & 0xFF) / 255.0f;
        final float n14 = (n6 & 0xFF) / 255.0f;
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n2, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(n8, n9, n10, n7).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(n8, n9, n10, n7).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n4, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(n12, n13, n14, n11).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n4, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(n12, n13, n14, n11).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
    }
    
    public void llllIIIIlIIIlIlllIll(final FontRenderer fontRenderer, final String s, final int n, final int n2, final int n3) {
        fontRenderer.llllIIIIlIIIlIlllIll(s, (float)(n - fontRenderer.llllIIIIlIIIlIlllIll(s) / 2), (float)n2, n3);
    }
    
    public void IlIlIlIlIlllllllllIl(final FontRenderer fontRenderer, final String s, final int n, final int n2, final int n3) {
        fontRenderer.llllIIIIlIIIlIlllIll(s, (float)n, (float)n2, n3);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final float n7 = 0.00390625f;
        final float n8 = 0.00390625f;
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0, n2 + n6, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 0) * n7, (n4 + n6) * n8).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n5, n2 + n6, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + n5) * n7, (n4 + n6) * n8).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n5, n2 + 0, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + n5) * n7, (n4 + 0) * n8).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0, n2 + 0, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 0) * n7, (n4 + 0) * n8).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final int n3, final int n4, final int n5, final int n6) {
        final float n7 = 0.00390625f;
        final float n8 = 0.00390625f;
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.0f, n2 + n6, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 0) * n7, (n4 + n6) * n8).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n5, n2 + n6, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + n5) * n7, (n4 + n6) * n8).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n5, n2 + 0.0f, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + n5) * n7, (n4 + 0) * n8).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0.0f, n2 + 0.0f, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll((n3 + 0) * n7, (n4 + 0) * n8).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n3, final int n4) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0, n2 + n4, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI(), ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII()).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n3, n2 + n4, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl(), ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII()).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n3, n2 + 0, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl(), ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl()).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + 0, n2 + 0, (double)this.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI(), ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl()).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final float n7, final float n8) {
        final float n9 = 1.0f / n7;
        final float n10 = 1.0f / n8;
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2 + n6, 0.0).llllIIIIlIIIlIlllIll(n3 * n9, (n4 + n6) * n10).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n5, n2 + n6, 0.0).llllIIIIlIIIlIlllIll((n3 + n5) * n9, (n4 + n6) * n10).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n5, n2, 0.0).llllIIIIlIIIlIlllIll((n3 + n5) * n9, n4 * n10).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2, 0.0).llllIIIIlIIIlIlllIll(n3 * n9, n4 * n10).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public static void llllIIIIlIIIlIlllIll(final int n, final int n2, final float n3, final float n4, final int n5, final int n6, final int n7, final int n8, final float n9, final float n10) {
        final float n11 = 1.0f / n9;
        final float n12 = 1.0f / n10;
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2 + n8, 0.0).llllIIIIlIIIlIlllIll(n3 * n11, (n4 + n6) * n12).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n7, n2 + n8, 0.0).llllIIIIlIIIlIlllIll((n3 + n5) * n11, (n4 + n6) * n12).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n + n7, n2, 0.0).llllIIIIlIIIlIlllIll((n3 + n5) * n11, n4 * n12).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n, n2, 0.0).llllIIIIlIIIlIlllIll(n3 * n11, n4 * n12).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
}
