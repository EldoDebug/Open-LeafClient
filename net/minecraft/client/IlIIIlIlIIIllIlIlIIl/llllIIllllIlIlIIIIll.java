package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.*;

public class llllIIllllIlIlIIIIll extends IlIIIlIlIIIllIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    private IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    private IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    private IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    private IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI;
    private IIlIIIIIllIlIIIlIIll IlIlIIIllIIllIlllllI;
    private IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll;
    private IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll;
    private IIlIIIIIllIlIIIlIIll IlIllIlIlIIIlIlIlIII;
    private IIlIIIIIllIlIIIlIIll IIlllIIlIllIllIlIIll;
    private IIlIIIIIllIlIIIlIIll lllIIIIlllllIlIIllIl;
    private float IlIlIIIIIIlllIlIllIl;
    
    public llllIIllllIlIlIIIIll(final float n) {
        this.lIIIlllIIIllIIIllIII = 256;
        this.llIIlIIIlIIIllIlIIIl = 256;
        this.llllIIIIlIIIlIlllIll("body.body", 0, 0);
        this.llllIIIIlIIIlIlllIll("wing.skin", -56, 88);
        this.llllIIIIlIIIlIlllIll("wingtip.skin", -56, 144);
        this.llllIIIIlIIIlIlllIll("rearleg.main", 0, 0);
        this.llllIIIIlIIIlIlllIll("rearfoot.main", 112, 0);
        this.llllIIIIlIIIlIlllIll("rearlegtip.main", 196, 0);
        this.llllIIIIlIIIlIlllIll("head.upperhead", 112, 30);
        this.llllIIIIlIIIlIlllIll("wing.bone", 112, 88);
        this.llllIIIIlIIIlIlllIll("head.upperlip", 176, 44);
        this.llllIIIIlIIIlIlllIll("jaw.jaw", 176, 65);
        this.llllIIIIlIIIlIlllIll("frontleg.main", 112, 104);
        this.llllIIIIlIIIlIlllIll("wingtip.bone", 112, 136);
        this.llllIIIIlIIIlIlllIll("frontfoot.main", 144, 104);
        this.llllIIIIlIIIlIlllIll("neck.box", 192, 104);
        this.llllIIIIlIIIlIlllIll("frontlegtip.main", 226, 138);
        this.llllIIIIlIIIlIlllIll("body.scale", 220, 53);
        this.llllIIIIlIIIlIlllIll("head.scale", 0, 0);
        this.llllIIIIlIIIlIlllIll("neck.scale", 48, 0);
        this.llllIIIIlIIIlIlllIll("head.nostril", 112, 0);
        final float n2 = -16.0f;
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, "head")).llllIIIIlIIIlIlllIll("upperlip", -6.0f, -1.0f, -8.0f + n2, 12, 5, 16);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("upperhead", -8.0f, -8.0f, 6.0f + n2, 16, 16, 16);
        this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = true;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("scale", -5.0f, -12.0f, 12.0f + n2, 2, 4, 6);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("nostril", -5.0f, -3.0f, -6.0f + n2, 2, 2, 4);
        this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = false;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("scale", 3.0f, -12.0f, 12.0f + n2, 2, 4, 6);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("nostril", 3.0f, -3.0f, -6.0f + n2, 2, 2, 4);
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, "jaw")).llllIIIIlIIIlIlllIll(0.0f, 4.0f, 8.0f + n2);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("jaw", -6.0f, 0.0f, -16.0f, 12, 4, 16);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, "neck")).llllIIIIlIIIlIlllIll("box", -5.0f, -5.0f, -5.0f, 10, 10, 10);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("scale", -1.0f, -9.0f, -3.0f, 2, 4, 6);
        (this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, "body")).llllIIIIlIIIlIlllIll(0.0f, 4.0f, 8.0f);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("body", -12.0f, 0.0f, -16.0f, 24, 24, 64);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("scale", -1.0f, -6.0f, -10.0f, 2, 6, 12);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("scale", -1.0f, -6.0f, 10.0f, 2, 6, 12);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("scale", -1.0f, -6.0f, 30.0f, 2, 6, 12);
        (this.IIlllIIlIllIllIlIIll = new IIlIIIIIllIlIIIlIIll(this, "wing")).llllIIIIlIIIlIlllIll(-12.0f, 5.0f, 2.0f);
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        (this.lllIIIIlllllIlIIllIl = new IIlIIIIIllIlIIIlIIll(this, "wingtip")).llllIIIIlIIIlIlllIll(-56.0f, 0.0f, 0.0f);
        this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(this.lllIIIIlllllIlIIllIl);
        (this.lIlIlIIIllIIllIIIllI = new IIlIIIIIllIlIIIlIIll(this, "frontleg")).llllIIIIlIIIlIlllIll(-12.0f, 20.0f, 2.0f);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll("main", -4.0f, -4.0f, -4.0f, 8, 24, 8);
        (this.IIIIlllIIIIIIlIIIlll = new IIlIIIIIllIlIIIlIIll(this, "frontlegtip")).llllIIIIlIIIlIlllIll(0.0f, 20.0f, -1.0f);
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("main", -3.0f, -1.0f, -3.0f, 6, 24, 6);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll);
        (this.IlIllIlIlIIIlIlIlIII = new IIlIIIIIllIlIIIlIIll(this, "frontfoot")).llllIIIIlIIIlIlllIll(0.0f, 23.0f, 0.0f);
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll("main", -4.0f, 0.0f, -12.0f, 8, 4, 16);
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII);
        (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, "rearleg")).llllIIIIlIIIlIlllIll(-16.0f, 16.0f, 42.0f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll("main", -8.0f, -4.0f, -8.0f, 16, 32, 16);
        (this.IlIlIIIllIIllIlllllI = new IIlIIIIIllIlIIIlIIll(this, "rearlegtip")).llllIIIIlIIIlIlllIll(0.0f, 32.0f, -4.0f);
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll("main", -6.0f, -2.0f, 0.0f, 12, 32, 12);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI);
        (this.llllIIllllIlIlIIIIll = new IIlIIIIIllIlIIIlIIll(this, "rearfoot")).llllIIIIlIIIlIlllIll(0.0f, 31.0f, 4.0f);
        this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll("main", -9.0f, 0.0f, -20.0f, 18, 6, 24);
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (IlIlIlIlIlllllllllIl)llIllIIIIIllIlIIIIlI;
        final float n7 = ilIlIlIlIlllllllllIl.B + (ilIlIlIlIlllllllllIl.C - ilIlIlIlIlllllllllIl.B) * this.IlIlIIIIIIlllIlIllIl;
        this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = (float)(Math.sin(n7 * 3.1415927f * 2.0f) + 1.0) * 0.2f;
        final float n8 = (float)(Math.sin(n7 * 3.1415927f * 2.0f - 1.0f) + 1.0);
        final float n9 = (n8 * n8 * 1.0f + n8 * 2.0f) * 0.05f;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, n9 - 2.0f, -3.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n9 * 2.0f, 1.0f, 0.0f, 0.0f);
        float n10 = 0.0f;
        final float n11 = 1.5f;
        final double[] ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(6, this.IlIlIIIIIIlllIlIllIl);
        final float llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(5, this.IlIlIIIIIIlllIlIllIl)[0] - ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(10, this.IlIlIIIIIIlllIlIllIl)[0]);
        final float llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(5, this.IlIlIIIIIIlllIlIllIl)[0] + llllIIIIlIIIlIlllIll / 2.0f);
        final float n12 = n7 * 3.1415927f * 2.0f;
        float n13 = 20.0f;
        float n14 = -12.0f;
        for (int i = 0; i < 5; ++i) {
            final double[] ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(5 - i, this.IlIlIIIIIIlllIlIllIl);
            final float n15 = (float)Math.cos(i * 0.45f + n12) * 0.15f;
            this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3[0] - ilIlIlIlIlllllllllIl2[0]) * 3.1415927f / 180.0f * n11;
            this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = n15 + (float)(ilIlIlIlIlllllllllIl3[1] - ilIlIlIlIlllllllllIl2[1]) * 3.1415927f / 180.0f * n11 * 5.0f;
            this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII = -this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3[0] - llllIIIIlIIIlIlllIll2) * 3.1415927f / 180.0f * n11;
            this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl = n13;
            this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI = n14;
            this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = n10;
            n13 += (float)(Math.sin(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) * 10.0);
            n14 -= (float)(Math.cos(this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl) * Math.cos(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) * 10.0);
            n10 -= (float)(Math.sin(this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl) * Math.cos(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) * 10.0);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        }
        this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl = n13;
        this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI = n14;
        this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI = n10;
        final double[] ilIlIlIlIlllllllllIl4 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(0, this.IlIlIIIIIIlllIlIllIl);
        this.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4[0] - ilIlIlIlIlllllllllIl2[0]) * 3.1415927f / 180.0f * 1.0f;
        this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = -this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4[0] - llllIIIIlIIIlIlllIll2) * 3.1415927f / 180.0f * 1.0f;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-llllIIIIlIIIlIlllIll * n11 * 1.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, -1.0f, 0.0f);
        this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
        for (int j = 0; j < 2; ++j) {
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
            final float n16 = n7 * 3.1415927f * 2.0f;
            this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl = 0.125f - (float)Math.cos(n16) * 0.2f;
            this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl = 0.25f;
            this.IIlllIIlIllIllIlIIll.lIIIIlIIIIIlllIllIII = (float)(Math.sin(n16) + 0.125) * 0.8f;
            this.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII = -(float)(Math.sin(n16 + 2.0f) + 0.5) * 0.75f;
            this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl = 1.0f + n9 * 0.1f;
            this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl = 0.5f + n9 * 0.1f;
            this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl = 0.75f + n9 * 0.1f;
            this.lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl = 1.3f + n9 * 0.1f;
            this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = -0.5f - n9 * 0.1f;
            this.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl = 0.75f + n9 * 0.1f;
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(n6);
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-1.0f, 1.0f, 1.0f);
            if (j == 0) {
                lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI(1028);
            }
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI(1029);
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        float n17 = -(float)Math.sin(n7 * 3.1415927f * 2.0f) * 0.0f;
        final float n18 = n7 * 3.1415927f * 2.0f;
        float ilIIIlIlIIIllIlIlIIl = 10.0f;
        float ilIlIIIllIllIIIIIllI = 60.0f;
        float llIllIIIIIllIlIIIIlI2 = 0.0f;
        final double[] ilIlIlIlIlllllllllIl5 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(11, this.IlIlIIIIIIlllIlIllIl);
        for (int k = 0; k < 12; ++k) {
            final double[] ilIlIlIlIlllllllllIl6 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(12 + k, this.IlIlIIIIIIlllIlIllIl);
            n17 += (float)(Math.sin(k * 0.45f + n18) * 0.05000000074505806);
            this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl = (this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl6[0] - ilIlIlIlIlllllllllIl5[0]) * n11 + 180.0f) * 3.1415927f / 180.0f;
            this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl = n17 + (float)(ilIlIlIlIlllllllllIl6[1] - ilIlIlIlIlllllllllIl5[1]) * 3.1415927f / 180.0f * n11 * 5.0f;
            this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl6[0] - llllIIIIlIIIlIlllIll2) * 3.1415927f / 180.0f * n11;
            this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
            ilIIIlIlIIIllIlIlIIl += (float)(Math.sin(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) * 10.0);
            ilIlIIIllIllIIIIIllI -= (float)(Math.cos(this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl) * Math.cos(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) * 10.0);
            llIllIIIIIllIlIIIIlI2 -= (float)(Math.sin(this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl) * Math.cos(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl) * 10.0);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    private float llllIIIIlIIIlIlllIll(double n) {
        while (n >= 180.0) {
            n -= 360.0;
        }
        while (n < -180.0) {
            n += 360.0;
        }
        return (float)n;
    }
}
