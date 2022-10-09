package net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl;

import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.shaders.*;

public class IlIlIlIlIlllllllllIl extends llIllIIIIIllIlIIIIlI
{
    private static final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll;
    private final Minecraft IlIlIIIllIllIIIIIllI;
    private final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl IllIIlllIIIIlllIIlIl;
    private final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl;
    private IIlllIlIIllIlIlIlIIl lIIIIlIIIIIlllIllIII;
    private static double lIIIlllIIIllIIIllIII;
    
    static {
        llllIIIIlIIIlIlllIll = new lIllllIllIllIIllllll("textures/map/map_background.png");
        IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII = 4096.0;
    }
    
    public IlIlIlIlIlllllllllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IIlllIlIIllIlIlIlIIl liiiIlIIIIIlllIllIII) {
        super(lllIllIIIllllllIllll);
        this.IlIlIIIllIllIIIIIllI = Minecraft.getMinecraft();
        this.IllIIlllIIIIlllIIlIl = new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl("item_frame", "normal");
        this.llllIIIlIlllIlIIIIIl = new net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl("item_frame", "map");
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final double n, final double n2, final double n3, final float n4, final float n5) {
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII() - llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl + n + 0.5, lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII() - llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII + n2 + 0.5, lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl() - llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII + n3 + 0.5);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f - llIIlIIIlIIIllIlIIIl.IIlIIIIIllIlIIIlIIll, 0.0f, 1.0f, 0.0f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        final IlIllIlIlIIIlIlIlIII ilIIllIIllIIllIIlIIl = this.IlIlIIIllIllIIIIIllI.IlIIllIIllIIllIIlIIl();
        final IllIIlllIIIIlllIIlIl ilIlIlIlIlllllllllIl = ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
        net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2;
        if (llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll() != null && llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll().llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.h) {
            ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl);
        }
        else {
            ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl);
        }
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, -0.5f);
        ilIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, 1.0f, 1.0f, 1.0f, 1.0f);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, 0.4375f);
        this.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, n + llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() * 0.3f, n2 - 0.25, n3 + llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() * 0.3f);
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    private void IlIlIlIlIlllllllllIl(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final lllIIIIlIlIllIIlIIIl llllIIllllIlIlIIIIll = llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll();
        if (llllIIllllIlIlIIIIll != null) {
            if (!this.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl)) {
                return;
            }
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll) {
                final net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = this.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII;
                if (llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(liiiIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl, liiiIlIIIIIlllIllIII.llIIIlIlIllIIlIlIlII, liiiIlIIIIIlllIllIII.lllllIlIIIlIlIIlllII) > 4096.0) {
                    return;
                }
            }
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII(llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII, 0.0, 0.0, 0.0, llllIIllllIlIlIIIIll);
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII().llllIIIIlIIIlIlllIll();
            liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII().IlIlIlIlIlllllllllIl = 1;
            liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll = 0.0f;
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            int ilIllIlIlIIIlIlIlIII = llIIlIIIlIIIllIlIIIl.IlIllIlIlIIIlIlIlIII();
            if (llllIIIIlIIIlIlllIll instanceof IIlllllIllIllIlIlIII) {
                ilIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII % 4 * 2;
            }
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII * 360.0f / 8.0f, 0.0f, 0.0f, 1.0f);
            if (!net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aD, llIIlIIIlIIIllIlIIIl, this)) {
                if (llllIIIIlIIIlIlllIll instanceof IIlllllIllIllIlIlIII) {
                    this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 0.0f, 1.0f);
                    final float n = 0.0078125f;
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n, n, n);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-64.0f, -64.0f, 0.0f);
                    final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll2 = IIllIIllIIIlIlIIIIlI.h.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII(), llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.0f, -1.0f);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        this.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, true);
                    }
                }
                else {
                    net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll3 = null;
                    if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.IlIllIIllIIlIIIIlIIl) {
                        llllIIIIlIIIlIlllIll3 = this.IlIlIIIllIllIIIIIllI.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII.IIIlIIlIIIIlllIlllII);
                        this.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
                        if (llllIIIIlIIIlIlllIll3 instanceof net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII) {
                            final net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII2 = (net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII)llllIIIIlIIIlIlllIll3;
                            final double illlllllIIIlIIIlIlII = ilIllIlIlIIIlIlIlIII2.IlllllllIIIlIIIlIlII;
                            final double iIlIIIIlllIlllllIlII = ilIllIlIlIIIlIlIlIII2.IIlIIIIlllIlllllIlII;
                            ilIllIlIlIIIlIlIlIII2.IlllllllIIIlIIIlIlII = 0.0;
                            ilIllIlIlIIIlIlIlIII2.IIlIIIIlllIlllllIlII = 0.0;
                            ilIllIlIlIIIlIlIlIII2.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.IlllllllIIIlIIIlIlII, llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl, llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII, llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl((float)(180 + llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() * 90)), false, true);
                            ilIllIlIlIIIlIlIlIII2.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
                            ilIllIlIlIIIlIlIlIII2.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
                        }
                        else {
                            llllIIIIlIIIlIlllIll3 = null;
                        }
                    }
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.5f, 0.5f, 0.5f);
                    if (!this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII()) || llllIIIIlIIIlIlllIll instanceof lllIlIIIIIlIlllllIlI) {
                        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
                    }
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll();
                    lIlIIlllIIlIIlIlllIl.IlIlIlIlIlllllllllIl();
                    this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII(), IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl);
                    lIlIIlllIIlIIlIlllIl.llllIIIIlIIIlIlllIll();
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl();
                    if (llllIIIIlIIIlIlllIll3 != null && llllIIIIlIIIlIlllIll3.llIllIlIIIIllIlIIllI() > 0) {
                        llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl();
                    }
                }
            }
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final double n, final double n2, final double n3) {
        if (Minecraft.IlIlIIIlIIlIlIIlllIl() && llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll() != null && llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll().IlIlIIIIIIlllIlIllIl() && this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl == llIIlIIIlIIIllIlIIIl) {
            final float n4 = 0.016666668f * 1.6f;
            final double ilIlIIIllIllIIIIIllI = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI);
            final float n5 = llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl() ? 32.0f : 64.0f;
            if (ilIlIIIllIllIIIIIllI < n5 * n5) {
                final String iIlllIIlIllIllIlIIll = llIIlIIIlIIIllIlIIIl.llllIIllllIlIlIIIIll().IIlllIIlIllIllIlIIll();
                if (llIIlIIIlIIIllIlIIIl.IIIIIllIIIIlIIIIllIl()) {
                    final FontRenderer llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
                    lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n + 0.0f, (float)n2 + llIIlIIIlIIIllIlIIIl.IlIllllIIlIIlIlIlIll + 0.5f, (float)n3);
                    GL11.glNormal3f(0.0f, 1.0f, 0.0f);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, 0.0f, 1.0f, 0.0f);
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, 1.0f, 0.0f, 0.0f);
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(-n4, -n4, n4);
                    lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.25f / n4, 0.0f);
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                    lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                    lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
                    final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
                    final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                    final int n6 = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll) / 2;
                    lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                    llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-n6 - 1, -1.0, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(-n6 - 1, 8.0, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n6 + 1, 8.0, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                    llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl(n6 + 1, -1.0, 0.0).llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.25f).IlIlIIIllIllIIIIIllI();
                    llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                    lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                    lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
                    llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll, -llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll) / 2, 0, 553648127);
                    lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
                    lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                    lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                    lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                }
                else {
                    this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, iIlllIIlIllIllIlIIll, n, n2, n3, 64);
                }
            }
        }
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            return false;
        }
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI liiiIlIlIllllIIlIllI = this.IlIlIIIllIllIIIIIllI.lIIIIlIlIllllIIlIllI();
            if (llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI(liiiIlIlIllllIIlIllI.IIlllIlIIllIlIlIlIIl, liiiIlIlIllllIIlIllI.llIIIlIlIllIIlIlIlII, liiiIlIlIllllIIlIllI.lllllIlIIIlIlIIlllII) > IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                return false;
            }
        }
        return true;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        final Minecraft liiiIlIlIllllIIlIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
        final double max = Math.max(6.0 * liiiIlIlIllllIIlIllI.IlIlIIIllIllIIIIIllI / net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIlIllllIIlIllI.IIIlIIIlIlIIlllIIlll.llIlIIIIllIlIIlIlIII, 1.0f, 120.0f), 16.0);
        IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII = max * max;
    }
}
