package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.*;
import leaf.*;
import leaf.setting.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.shaders.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import org.lwjgl.opengl.*;

public abstract class llIllIIIIIllIlIIIIlI implements llllIIIlIlllIlIIIIIl
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    protected final lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    protected float IlIIIlIlIIIllIlIlIIl;
    private Class IlIlIIIllIllIIIIIllI;
    private lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/misc/shadow.png");
    }
    
    protected llIllIIIIIllIlIIIIlI(final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl = 1.0f;
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = null;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final double n, final double n2, final double n3) {
        llllIIIIlIIIlIlllIll ilIIlllIIlIlllllIIlI = llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI();
        if (ilIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl() || ilIIlllIIlIlllllIIlI.llllIIIIlIIIlIlllIll() == 0.0) {
            ilIIlllIIlIlllllIIlI = new llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - 2.0, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - 2.0, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - 2.0, llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl + 2.0, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + 2.0, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII + 2.0);
        }
        return llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII(n, n2, n3) && (llIllIIIIIllIlIIIIlI.IIllIIIlIIlIlIlIIIII || ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIlllIIlIlllllIIlI));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, double n2, final double n3, final float n4, final float n5) {
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3);
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI && Leaf.instance.modManager.nameTagMod.lIlIlIIIllIIllIIIllI() && !(Minecraft.getMinecraft().IIIIlllIIIIIIlIIIlll instanceof PlayerCosmeticSetting)) {
            if (llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
                n2 -= 0.2;
            }
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII.v_().lIIIlllIIIllIIIllIII(), n, n2, n3, 64);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3) {
        if (this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI)) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.v_().lIIIlllIIIllIIIllIII(), n, n2, n3, 64);
        }
    }
    
    protected boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return llIllIIIIIllIlIIIIlI.lIIlllIlllllIIlllIll() && llIllIIIIIllIlIIIIlI.w_();
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final String s, final float n4, final double n5) {
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, s, n, n2, n3, 64);
    }
    
    protected abstract lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI p0);
    
    protected boolean llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        lIllllIllIllIIllllll lIllllIllIllIIllllll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        if (this.IllIIlllIIIIlllIIlIl != null) {
            lIllllIllIllIIllllll = this.IllIIlllIIIIlllIIlIl;
        }
        if (lIllllIllIllIIllllll == null) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4) {
        if (Leaf.instance.modManager.hideFire) {
            return;
        }
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        final IlIlIIIIIIlllIlIllIl ilIllllIIlIIlIlIlIll = Minecraft.getMinecraft().IlIllllIIlIIlIlIlIll();
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll = ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll("minecraft:blocks/fire_layer_0");
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = ilIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll("minecraft:blocks/fire_layer_1");
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, (float)n3);
        final float n5 = llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII * 1.4f;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n5, n5, n5);
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll3 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI();
        float n6 = 0.5f;
        final float n7 = 0.0f;
        float n8 = llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll / n5;
        float n9 = (float)(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -0.3f + (int)n8 * 0.02f);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        float n10 = 0.0f;
        int n11 = 0;
        final boolean iIllIIIlIIIIlIIlIIII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII();
        if (iIllIIIlIIIIlIIlIIII) {
            llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll);
        }
        llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII);
        while (n8 > 0.0f) {
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = (n11 % 2 == 0) ? llllIIIIlIIIlIlllIll : llllIIIIlIIIlIlllIll2;
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI);
            this.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            float ilIlIIIllIllIIIIIllI = ilIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI();
            final float llllIIIlIlllIlIIIIIl = ilIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl();
            float illIIlllIIIIlllIIlIl = ilIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl();
            final float liiiIlIIIIIlllIllIII = ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII();
            if (n11 / 2 % 2 == 0) {
                final float n12 = illIIlllIIIIlllIIlIl;
                illIIlllIIIIlllIIlIl = ilIlIIIllIllIIIIIllI;
                ilIlIIIllIllIIIIIllI = n12;
            }
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n6 - n7, 0.0f - n9, (double)n10).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, liiiIlIIIIIlllIllIII).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-n6 - n7, 0.0f - n9, (double)n10).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, liiiIlIIIIIlllIllIII).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-n6 - n7, 1.4f - n9, (double)n10).llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n6 - n7, 1.4f - n9, (double)n10).llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI();
            n8 -= 0.45f;
            n9 -= 0.45f;
            n6 *= 0.9f;
            n10 += 0.03f;
            ++n11;
        }
        llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl();
        if (iIllIIIlIIIIlIIlIIII) {
            llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll((IlIIlIlIIIlIIlIlIlII)null);
            lllllIlIIIlIlIIlllII.IlIIIlIIIllllIlIlIlI();
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() || !llIIlllIIlllIIllIllI.aM) {
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
            final IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            float llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI;
            if (llIllIIIIIllIlIIIIlI instanceof IlIllIlIlIIIlIlIlIII) {
                final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (IlIllIlIlIIIlIlIlIII)llIllIIIIIllIlIIIIlI;
                llIllIIIIIllIlIIIIlI2 *= ilIllIlIlIIIlIlIlIII.l();
                if (ilIllIlIlIIIlIlIlIII.e_()) {
                    llIllIIIIIllIlIIIIlI2 *= 0.5f;
                }
            }
            final double n6 = llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl + (llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.lIIlIIIlIllIlIllIIIl) * n5;
            final double n7 = llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII + (llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII - llIllIIIIIllIlIIIIlI.IIlIIIlllIllIllIlIII) * n5;
            final double n8 = llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl + (llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lIlIlIlllIIlIlIlllIl) * n5;
            final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n6 - llIllIIIIIllIlIIIIlI2);
            final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n6 + llIllIIIIIllIlIIIIlI2);
            final int llIllIIIIIllIlIIIIlI5 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n7 - llIllIIIIIllIlIIIIlI2);
            final int llIllIIIIIllIlIIIIlI6 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n7);
            final int llIllIIIIIllIlIIIIlI7 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n8 - llIllIIIIIllIlIIIIlI2);
            final int llIllIIIIIllIlIIIIlI8 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n8 + llIllIIIIIllIlIIIIlI2);
            final double n9 = n - n6;
            final double n10 = n2 - n7;
            final double n11 = n3 - n8;
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
            for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI3, llIllIIIIIllIlIIIIlI5, llIllIIIIIllIlIIIIlI7), new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI4, llIllIIIIIllIlIIIIlI6, llIllIIIIIllIlIIIIlI8))) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI9 = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI9.llIllIlIIIIllIlIIllI() != -1 && llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(ilIlIlIlIlllllllllIl) > 3) {
                    this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI9, n, n2, n3, ilIlIlIlIlllllllllIl, n4, llIllIIIIIllIlIIIIlI2, n9, n10, n11);
                }
            }
            llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
        }
    }
    
    private IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n, final double n2, final double n3, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n4, final float n5, final double n6, final double n7, final double n8) {
        if (llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) {
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI();
            double n9 = (n4 - (n2 - (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n7)) / 2.0) * 0.5 * this.llllIIIIlIIIlIlllIll().IlIllIlIlIIIlIlIlIII(ilIlIlIlIlllllllllIl);
            if (n9 >= 0.0) {
                if (n9 > 1.0) {
                    n9 = 1.0;
                }
                final double n10 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl() + n6;
                final double n11 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl() + n6;
                final double n12 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI() + n7 + 0.015625;
                final double n13 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl() + n8;
                final double n14 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII() + n8;
                final float n15 = (float)((n - n10) / 2.0 / n5 + 0.5);
                final float n16 = (float)((n - n11) / 2.0 / n5 + 0.5);
                final float n17 = (float)((n3 - n13) / 2.0 / n5 + 0.5);
                final float n18 = (float)((n3 - n14) / 2.0 / n5 + 0.5);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n10, n12, n13).llllIIIIlIIIlIlllIll(n15, n17).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, (float)n9).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n10, n12, n14).llllIIIIlIIIlIlllIll(n15, n18).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, (float)n9).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n11, n12, n14).llllIIIIlIIIlIlllIll(n16, n18).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, (float)n9).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n11, n12, n13).llllIIIIlIIIlIlllIll(n16, n17).llllIIIIlIIIlIlllIll(1.0f, 1.0f, 1.0f, (float)n9).IlIlIIIllIllIIIIIllI();
            }
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n, final double n2, final double n3) {
        lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(n, n2, n3);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, -1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(0.0f, 0.0f, 1.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(0.0f, -1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(0.0f, 1.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(-1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI(1.0f, 0.0f, 0.0f).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
        llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(0.0, 0.0, 0.0);
        lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5) {
        if (this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl != null) {
            if (this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.IllIlIIllIllIIlIllII && this.llIllIIIIIllIlIIIIlI > 0.0f && !llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII() && this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) {
                final float n6 = (float)((1.0 - this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII) / 256.0) * this.IlIIIlIlIIIllIlIlIIl);
                if (n6 > 0.0f) {
                    this.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI, n, n2, n3, n6, n5);
                }
            }
            if (llIllIIIIIllIlIIIIlI.lIllllIllIllIIllllll() && (!(llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) || !((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).IlIIIlIlIIIllIlIlIIl())) {
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n5);
            }
        }
    }
    
    public FontRenderer llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, String replace, final double n, final double n2, final double n3, final int n4) {
        if (Leaf.instance.modManager.nickHiderMod.lIlIlIIIllIIllIIIllI() && replace.contains(Minecraft.getMinecraft().session.llIllIIIIIllIlIIIIlI())) {
            replace = replace.replace(Minecraft.getMinecraft().session.llIllIIIIIllIlIIIIlI(), "You");
        }
        if (llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) <= n4 * n4) {
            final FontRenderer llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI();
            final float n5 = 0.016666668f * 1.6f;
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n + 0.0f, (float)n2 + llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll + 0.5f, (float)n3);
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            if (Leaf.instance.modManager.freeLookMod.toggled) {
                GL11.glRotatef(-Leaf.instance.modManager.freeLookMod.getYaw(), 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(Leaf.instance.modManager.freeLookMod.getPitch(), 1.0f, 0.0f, 0.0f);
            }
            else {
                GL11.glRotatef(-this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
                GL11.glRotatef(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 1.0f, 0.0f, 0.0f);
            }
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-n5, -n5, n5);
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
            int n6 = 0;
            if (replace.equals("deadmau5")) {
                n6 = -10;
            }
            final int n7 = llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(replace) / 2;
            if (!Leaf.instance.modManager.nameTagMod.background) {
                final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI3 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                llIllIIIIIllIlIIIIlI3.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                llIllIIIIIllIlIIIIlI3.IlIlIlIlIlllllllllIl(-n7 - 1, -1 + n6, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI3.IlIlIlIlIlllllllllIl(-n7 - 1, 8 + n6, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI3.IlIlIlIlIlllllllllIl(n7 + 1, 8 + n6, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI3.IlIlIlIlIlllllllllIl(n7 + 1, -1 + n6, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            }
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            if (!Leaf.instance.modManager.hideIcon && llIllIIIIIllIlIIIIlI instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && Leaf.instance.downloadPlayerData.rankData != null) {
                if (Leaf.instance.downloadPlayerData.rankData.containsKey(llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl().toString()) && replace.equals(llIllIIIIIllIlIIIIlI.v_().lIIIlllIIIllIIIllIII())) {
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/icon/" + Leaf.instance.downloadPlayerData.rankData.get(llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl().toString()) + ".png"));
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(-n7 - 14, -4, 14.0f, 14.0f, 14, 14, 14.0f, 14.0f);
                }
                else if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI && replace.equals(llIllIIIIIllIlIIIIlI.v_().lIIIlllIIIllIIIllIII())) {
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("client/icon/user.png"));
                    net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(-n7 - 14, -4, 14.0f, 14.0f, 14, 14, 14.0f, 14.0f);
                }
            }
            if (Leaf.instance.modManager.nameTagMod.shadow) {
                llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(replace, (float)(-llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(replace) / 2), (float)n6, -1);
            }
            else {
                llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(replace, -llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(replace) / 2, n6, -1);
            }
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    public lllIllIIIllllllIllll IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return false;
    }
    
    public void llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3, final float n4, final float n5) {
    }
    
    @Override
    public Class IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Class ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll) {
        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
}
