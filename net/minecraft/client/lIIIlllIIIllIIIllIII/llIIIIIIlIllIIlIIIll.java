package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.client.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.optifine.shaders.*;
import net.optifine.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import org.lwjgl.opengl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import leaf.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class llIIIIIIlIllIIlIIIll
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private static final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    private final Minecraft llIllIIIIIllIlIIIIlI;
    private lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private final lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl;
    private final IIlllIlIIllIlIlIlIIl lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private static volatile /* synthetic */ int[] llIIlIIIlIIIllIlIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/map/map_background.png");
        IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll("textures/misc/underwater.png");
    }
    
    public llIIIIIIlIllIIlIIIll(final Minecraft llIllIIIIIllIlIIIIlI) {
        this.lIIIlllIIIllIIIllIII = -1;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl = llIllIIIIIllIlIIIIlI.lllllIIIIIlIlIIIIIIl();
        this.lIIIIlIIIIIlllIllIII = llIllIIIIIllIlIIIIlI.IllIIlllllIIllIIllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (lllIIIIlIlIllIIlIIIl != null) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll());
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl)) {
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2.0f, 2.0f, 2.0f);
                if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) && (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() || !llIIlllIIlllIIllIllI.IIllIIllIIIlIlIIIIlI)) {
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                }
            }
            this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, lllIIIIlllllIlIIllIl, ilIlIIIllIIllIlllllI);
            if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll() == IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    private void llllIIIIlIIIlIlllIll(final float n, final float n2) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n2, 0.0f, 1.0f, 0.0f);
        lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        int n = this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI(), llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII), 0);
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.x()) {
            n = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI(), n);
        }
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, (float)(n & 0xFFFF), (float)(n >> 16));
    }
    
    private void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n) {
        final float n2 = llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII + (llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl - llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII) * n;
        final float n3 = llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII + (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl - llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII) * n;
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI - n2) * 0.1f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll - n3) * 0.1f, 0.0f, 1.0f, 0.0f);
    }
    
    private float llIllIIIIIllIlIIIIlI(final float n) {
        return -llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(1.0f - n / 45.0f + 0.1f, 0.0f, 1.0f) * 3.1415927f) * 0.5f + 0.5f;
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(54.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(64.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-62.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.25f, -0.85f, 0.75f);
        liIlIIIlIllIlIllIIIl.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    private void IlIlIlIlIlllllllllIl(final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(92.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(45.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(41.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.3f, -1.1f, 0.45f);
        liIlIIIlIllIlIllIIIl.llIllIIIIIllIlIIIIlI(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    private void IlIlIlIlIlllllllllIl(final net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
        final lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl = (lIIlIIIlIllIlIllIIIl)this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII);
        if (!llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII()) {
            lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
            this.llllIIIIlIIIlIlllIll(liIlIIIlIllIlIllIIIl);
            this.IlIlIlIlIlllllllllIl(liIlIIIlIllIlIllIIIl);
            lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2, final float n3) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.4f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3) * 3.1415927f), 0.2f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3) * 3.1415927f * 2.0f), -0.2f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 3.1415927f));
        final float llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(n);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.04f, -0.72f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, n2 * -1.2f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, llIllIIIIIllIlIIIIlI * -0.5f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI * -85.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 1.0f, 0.0f, 0.0f);
        this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * n3 * 3.1415927f);
        final float llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3) * 3.1415927f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2 * -20.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3 * -20.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3 * -80.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.38f, 0.38f, 0.38f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(90.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-1.0f, -1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.015625f, 0.015625f, 0.015625f);
        this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll4 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI();
        GL11.glNormal3f(0.0f, 0.0f, -1.0f);
        llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-7.0, 135.0, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(135.0, 135.0, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(135.0, -7.0, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-7.0, -7.0, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl();
        final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll5 = IIllIIllIIIlIlIIIIlI.h.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl);
        if (llllIIIIlIIIlIlllIll5 != null) {
            this.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5, false);
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.3f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2) * 3.1415927f), 0.4f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2) * 3.1415927f * 2.0f), -0.4f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 * 3.1415927f));
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.64000005f, -0.6f, -0.71999997f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, n * -0.6f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(45.0f, 0.0f, 1.0f, 0.0f);
        final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 * n2 * 3.1415927f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2) * 3.1415927f) * 70.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2 * -20.0f, 0.0f, 0.0f, 1.0f);
        this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-1.0f, 3.6f, 3.5f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(120.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(200.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-135.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(5.6f, 0.0f, 0.0f);
        final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll3 = this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII);
        lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII();
        ((lIIlIIIlIllIlIllIIIl)llllIIIIlIIIlIlllIll3).IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII);
        lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll();
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final float n) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.4f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n) * 3.1415927f), 0.2f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n) * 3.1415927f * 2.0f), -0.2f * llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * 3.1415927f));
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n) {
        final float n2 = llllIIIIlIIIlIlllIll.f() - n + 1.0f;
        final float n3 = n2 / this.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI();
        float ilIlIIIllIllIIIIIllI = llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2 / 4.0f * 3.1415927f) * 0.1f);
        if (n3 >= 0.8f) {
            ilIlIIIllIllIIIIIllI = 0.0f;
        }
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, ilIlIIIllIllIIIIIllI, 0.0f);
        final float n4 = 1.0f - (float)Math.pow(n3, 27.0);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n4 * 0.6f, n4 * -0.5f, n4 * 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n4 * 90.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n4 * 10.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n4 * 30.0f, 0.0f, 0.0f, 1.0f);
    }
    
    private void IlIlIlIlIlllllllllIl(final float n, final float n2) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.56f, -0.52f, -0.71999997f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, n * -0.6f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(45.0f, 0.0f, 1.0f, 0.0f);
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 * n2 * 3.1415927f);
        final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2) * 3.1415927f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll * -20.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2 * -20.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2 * -80.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.4f, 0.4f, 0.4f);
    }
    
    private void llllIIIIlIIIlIlllIll(final float n, final net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-18.0f, 0.0f, 0.0f, 1.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-12.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-8.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.9f, 0.2f, 0.0f);
        final float n2 = this.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI() - (llllIIIIlIIIlIlllIll.f() - n + 1.0f);
        final float n3 = n2 / 20.0f;
        float n4 = (n3 * n3 + n3 * 2.0f) / 3.0f;
        if (n4 > 1.0f) {
            n4 = 1.0f;
        }
        if (n4 > 0.1f) {
            final float n5 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((n2 - 0.1f) * 1.3f) * (n4 - 0.1f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n5 * 0.0f, n5 * 0.01f, n5 * 0.0f);
        }
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(n4 * 0.0f, n4 * 0.0f, n4 * 0.1f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f + n4 * 0.2f);
    }
    
    private void IlIlIIIllIllIIIIIllI() {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, 0.2f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(30.0f, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-80.0f, 1.0f, 0.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(60.0f, 0.0f, 1.0f, 0.0f);
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() || !llIIlllIIlllIIllIllI.lllIlIIIIIlIlllllIlI()) {
            final float n2 = 1.0f - (this.IllIIlllIIIIlllIIlIl + (this.IlIlIIIllIllIIIIIllI - this.IllIIlllIIIIlllIIlIl) * n);
            final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII;
            final float ilIlIIIllIIllIlllllI = liiiIlIIIIIlllIllIII.IlIlIIIllIIllIlllllI(n);
            final float n3 = liiiIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI + (liiiIlIIIIIlllIllIII.llllllIllIllIlIllllI - liiiIlIIIIIlllIllIII.IlIIIlIIIllllIlIlIlI) * n;
            this.llllIIIIlIIIlIlllIll(n3, liiiIlIIIIIlllIllIII.IIIllllllIllIIIlllIl + (liiiIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll - liiiIlIIIIIlllIllIII.IIIllllllIllIIIlllIl) * n);
            this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
            this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, n);
            final float n4 = Leaf.instance.modManager.oldAnimationMod.lIlIlIIIllIIllIIIllI() ? ilIlIIIllIIllIlllllI : 0.0f;
            lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            if (this.IlIIIlIlIIIllIlIlIIl != null) {
                if (this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() instanceof IIlllllIllIllIlIlIII) {
                    this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, n3, n2, ilIlIIIllIIllIlllllI);
                }
                else if (liiiIlIIIIIlllIllIII.f() > 0) {
                    switch (IlIIIlIlIIIllIlIlIIl()[this.IlIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI().ordinal()]) {
                        case 1: {
                            this.IlIlIlIlIlllllllllIl(n2, 0.0f);
                            break;
                        }
                        case 2:
                        case 3: {
                            this.llllIIIIlIIIlIlllIll((net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)liiiIlIIIIIlllIllIII, n);
                            this.IlIlIlIlIlllllllllIl(n2, n4);
                            break;
                        }
                        case 4: {
                            this.IlIlIlIlIlllllllllIl(n2, n4);
                            this.IlIlIIIllIllIIIIIllI();
                            break;
                        }
                        case 5: {
                            this.IlIlIlIlIlllllllllIl(n2, n4);
                            this.llllIIIIlIIIlIlllIll(n, liiiIlIIIIIlllIllIII);
                            break;
                        }
                    }
                }
                else {
                    this.IlIIIlIlIIIllIlIlIIl(ilIlIIIllIIllIlllllI);
                    this.IlIlIlIlIlllllllllIl(n2, ilIlIIIllIIllIlllllI);
                }
                this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.IlIIIlIlIIIllIlIlIIl, IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI);
            }
            else if (!liiiIlIIIIIlllIllIII.IIIIIIIllllIlIIIIIII()) {
                this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, n2, ilIlIIIllIIllIlllllI);
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
            lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final float n) {
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        if (this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.IIlIlIllllIlllIIIIll()) {
            llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII));
            IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII);
            final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII;
            for (int i = 0; i < 8; ++i) {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl + ((i >> 0) % 2 - 0.5f) * liiiIlIIIIIlllIllIII.IllIllIIIIlIIlIlllII * 0.8f, liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII + ((i >> 1) % 2 - 0.5f) * 0.1f + liiiIlIIIIIlllIllIII.llllIlIllllIIlIIlIlI(), liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII + ((i >> 2) % 2 - 0.5f) * liiiIlIIIIIlllIllIII.IllIllIIIIlIIlIlllII * 0.8f);
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = this.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3);
                if (ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI().lIIIlllIIIllIIIllIII()) {
                    ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl4;
                    ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl3;
                }
            }
            if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llIllIlIIIIllIlIIllI() != -1 && !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIIIIIlIlIIIlIIIIlIl, this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, n, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.az), ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2)) {
                this.llllIIIIlIIIlIlllIll(n, this.llIllIIIIIllIlIIIIlI.IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
            }
        }
        if (!this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl()) {
            if (this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) && !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIIllIIllIIIIIIlIIlI, this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, n)) {
                this.IlIlIIIllIllIIIIIllI(n);
            }
            if (this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.lIIIIIlIlIIIlIIIIlIl() && !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIllIIIlIIIIlIIlIIII, this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, n) && !Leaf.instance.modManager.hideFire) {
                this.IllIIlllIIIIlllIIlIl(n);
            }
        }
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
    }
    
    private void llllIIIIlIIIlIlllIll(final float n, final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(0.1f, 0.1f, 0.1f, 0.5f);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        final float ilIlIIIllIllIIIIIllI = ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI();
        final float illIIlllIIIIlllIIlIl = ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl();
        final float llllIIIlIlllIlIIIIIl = ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl();
        final float liiiIlIIIIIlllIllIII = ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII();
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, -0.5).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, liiiIlIIIIIlllIllIII).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, -0.5).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, liiiIlIIIIIlllIllIII).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, 1.0, -0.5).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, 1.0, -0.5).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private void IlIlIIIllIllIIIIIllI(final float n) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() || llIIlllIIlllIIllIllI.IlIlIIIllIIllIlllllI()) {
            this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll.IlIlIlIlIlllllllllIl);
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            final float b_ = this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.b_(n);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(b_, b_, b_, 0.5f);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            final float n2 = -this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.IIlIIIIIllIlIIIlIIll / 64.0f;
            final float n3 = this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII.llllllIllIllIlIllllI / 64.0f;
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, -1.0, -0.5).llllIIIIlIIIlIlllIll(4.0f + n2, 4.0f + n3).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, -1.0, -0.5).llllIIIIlIIIlIlllIll(0.0f + n2, 4.0f + n3).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(1.0, 1.0, -0.5).llllIIIIlIIIlIlllIll(0.0f + n2, 0.0f + n3).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(-1.0, 1.0, -0.5).llllIIIIlIIIlIlllIll(4.0f + n2, 0.0f + n3).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
    
    private void IllIIlllIIIIlllIIlIl(final float n) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 0.9f);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(519);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        final float n2 = 1.0f;
        for (int i = 0; i < 2; ++i) {
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = this.llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll("minecraft:blocks/fire_layer_1");
            this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            final float ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI();
            final float illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl();
            final float llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll2.llllIIIlIlllIlIIIIIl();
            final float liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII();
            final float n3 = (0.0f - n2) / 2.0f;
            final float n4 = n3 + n2;
            final float n5 = 0.0f - n2 / 2.0f;
            final float n6 = n5 + n2;
            final float n7 = -0.5f;
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(i * 2 - 1) * 0.24f, -0.3f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((i * 2 - 1) * 10.0f, 0.0f, 1.0f, 0.0f);
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n5, (double)n7).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, liiiIlIIIIIlllIllIII).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n5, (double)n7).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, liiiIlIIIIIlllIllIII).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n4, n6, (double)n7).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n3, n6, (double)n7).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IllIIlllIIIIlllIIlIl = this.IlIlIIIllIllIIIIIllI;
        final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII;
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        boolean b = false;
        if (this.IlIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl != null) {
            if (!this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl)) {
                if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.s.llIllIIIIIllIlIIIIlI() && !net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(), net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.s, this.IlIIIlIlIIIllIlIlIIl, ilIIIlIlIIIllIlIlIIl, this.lIIIlllIIIllIIIllIII != liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI)) {
                    this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
                    this.lIIIlllIIIllIIIllIII = liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
                    return;
                }
                b = true;
            }
        }
        else {
            b = (this.IlIIIlIlIIIllIlIlIIl != null || ilIIIlIlIIIllIlIlIIl != null);
        }
        final float n = 0.4f;
        this.IlIlIIIllIllIIIIIllI += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((b ? 0.0f : 1.0f) - this.IlIlIIIllIllIIIIIllI, -n, n);
        if (this.IlIlIIIllIllIIIIIllI < 0.1f) {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.lIIIlllIIIllIIIllIII = liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIlIIIllIllIIIIIllI = 0.0f;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIIIllIllIIIIIllI = 0.0f;
    }
    
    static /* synthetic */ int[] IlIIIlIlIIIllIlIlIIl() {
        final int[] llIIlIIIlIIIllIlIIIl = llIIIIIIlIllIIlIIIll.llIIlIIIlIIIllIlIIIl;
        if (llIIlIIIlIIIllIlIIIl != null) {
            return llIIlIIIlIIIllIlIIIl;
        }
        final int[] llIIlIIIlIIIllIlIIIl2 = new int[net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.values().length];
        try {
            llIIlIIIlIIIllIlIIIl2[net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIIlIIIlIIIllIlIIIl2[net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIIlIIIlIIIllIlIIIl2[net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIIlIIIlIIIllIlIIIl2[net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIIlIIIlIIIllIlIIIl2[net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return llIIIIIIlIllIIlIIIll.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl2;
    }
}
