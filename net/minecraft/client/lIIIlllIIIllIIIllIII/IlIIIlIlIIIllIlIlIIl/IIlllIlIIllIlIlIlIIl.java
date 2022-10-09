package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;
import leaf.*;
import net.optifine.shaders.*;
import java.util.*;
import net.optifine.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import java.util.concurrent.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IIlllIlIIllIlIlIlIIl implements IIIIlllIIIIIIlIIIlll
{
    private static final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    public float llllIIIIlIIIlIlllIll;
    private final lIlIlIlllIIlIlIlllIl IlIlIIIllIllIIIIIllI;
    private final IIlllIIlIllIllIlIIll IllIIlllIIIIlllIIlIl;
    private llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    public IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl;
    private boolean lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIIIIIllIlIIIIlI = new lIllllIllIllIIllllll("textures/misc/enchanted_item_glint.png");
    }
    
    public IIlllIlIIllIlIlIlIIl(final IIlllIIlIllIllIlIIll illIIlllIIIIlllIIlIl, final IllIIlllIIIIlllIIlIl ilIlIlIlIlllllllllIl) {
        this.IlIIIlIlIIIllIlIlIIl = true;
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = false;
        this.IlIlIlIlIlllllllllIl = null;
        this.lIIIlllIIIllIIIllIII = false;
        this.llIIlIIIlIIIllIlIIIl = false;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.Y.llIllIIIIIllIlIIIIlI()) {
            this.IlIlIIIllIllIIIIIllI = (lIlIlIlllIIlIlIlllIl)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.Y, ilIlIlIlIlllllllllIl);
        }
        else {
            this.IlIlIIIllIllIIIIIllI = new lIlIlIlllIIlIlIlllIl(ilIlIlIlIlllllllllIl);
        }
        this.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public lIlIlIlllIIlIlIlllIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n, final String s) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n, new llllIIIlIlllIlIIIIIl(s, "inventory"));
    }
    
    protected void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n, final String s) {
        this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), n, s);
    }
    
    private void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s) {
        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, 0, s);
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, 0, s);
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, -1, lllIIIIlIlIllIIlIIIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, n, null);
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        final boolean llIllIlIIIIllIlIIllI = Minecraft.getMinecraft().IlIllllIIlIIlIlIlIll().llIllIlIIIIllIlIIllI();
        final boolean b = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII() && llIllIlIIIIllIlIIllI;
        if (b) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll);
        }
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl;
        for (int length = (llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl).length, i = 0; i < length; ++i) {
            this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl[i]), n, lllIIIIlIlIllIIlIIIl);
        }
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), n, lllIIIIlIlIllIIlIIIl);
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        if (b) {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((IlIIlIlIIIlIIlIlIlII)null);
            lllllIlIIIlIlIIlllII.IlIIIlIIIllllIlIlIlI();
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        if (lllIIIIlIlIllIIlIIIl != null) {
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.5f, 0.5f, 0.5f);
            if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 0.0f, 1.0f, 0.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, -0.5f);
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
                llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
            }
            else {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-0.5f, -0.5f, -0.5f);
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p()) {
                    llllIIIIlIIIlIlllIll = lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll, this.llllIIIlIlllIlIIIIIl, false);
                }
                this.lIIIlllIIIllIIIllIII = false;
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lllIIIIlIlIllIIlIIIl);
                if (this.lIIIlllIIIllIIIllIII) {
                    final float illIllIlllIllllIIllI = lIIIIlIlIllllIIlIllI.IllIllIlllIllllIIllI;
                    final float llIlIIIIIlIIlIlIIlll = lIIIIlIlIllllIIlIllI.llIlIIIIIlIIlIlIIlll;
                    lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, 240.0f, llIlIIIIIlIIlIlIIlll);
                    this.llIIlIIIlIIIllIlIIIl = true;
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, lllIIIIlIlIllIIlIIIl);
                    this.llIIlIIIlIIIllIlIIIl = false;
                    lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, illIllIlllIllllIIllI, llIlIIIIIlIIlIlIIlll);
                }
                if (lllIIIIlIlIllIIlIIIl.IIllIIllIIIlIlIIIIlI() && (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p() || !lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this, lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll)) && !Leaf.instance.modManager.hideEnchant) {
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                }
            }
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if ((!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p() || lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI()) && (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() || !llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll)) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(514);
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(768, 1);
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && !this.lIIIIlIIIIIlllIllIII) {
                IIlllIIIlIlllIIlllII.llllIIllllIlIlIIIIll();
            }
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(8.0f, 8.0f, 8.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(Minecraft.IIIllllllIllIIIlllIl() % 3000L / 3000.0f / 8.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-50.0f, 0.0f, 0.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, -8372020);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(8.0f, 8.0f, 8.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-(Minecraft.IIIllllllIllIIIlllIl() % 4873L / 4873.0f / 8.0f), 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(10.0f, 0.0f, 0.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, -8372020);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && !this.lIIIIlIIIIIlllIllIII) {
                IIlllIIIlIlllIIlllII.IlIllIlIlIIIlIlIlIII();
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final f ilIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI().IlIlIIIllIIllIlllllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl((float)ilIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII(), (float)ilIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII(), (float)ilIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl());
    }
    
    private void IlIlIlIlIlllllllllIl(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIllllIlIlIIIIll, final int n) {
        if (this.llIIlIIIlIIIllIlIIIl) {
            if (llllIIllllIlIlIIIIll.llllIIllllIlIlIIIIll() == null) {
                return;
            }
            llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll.llllIIllllIlIlIIIIll();
        }
        else if (llllIIllllIlIlIIIIll.llllIIllllIlIlIIIIll() != null) {
            this.lIIIlllIIIllIIIllIII = true;
        }
        if (liIllIIIllllIlllIllI.llIllIlIIIIllIlIIllI()) {
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl());
        }
        else {
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl());
        }
        liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll());
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.Q.llIllIIIIIllIlIIIIlI() && net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.Q.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll)) {
            llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, llllIIllllIlIlIIIIll, n);
        }
        else {
            liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n);
        }
        this.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, llllIIllllIlIlIIIIll);
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final List list, final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final boolean b = n == -1 && lllIIIIlIlIllIIlIIIl != null;
        for (int i = 0; i < list.size(); ++i) {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = list.get(i);
            int n2 = n;
            if (b && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
                int n3 = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                    n3 = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), n3);
                }
                if (IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
                    n3 = IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(n3);
                }
                n2 = (n3 | 0xFF000000);
            }
            this.IlIlIlIlIlllllllllIl(liIllIIIllllIlllIllI, llllIIIIlIIIlIlllIll, n2);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
    }
    
    private void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != null) {
            if (!llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) {
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(2.0f, 2.0f, 2.0f);
            }
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (lllIIIIlIlIllIIlIIIl != null) {
            this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl), ilIlIIIllIIllIlllllI);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlllllIlIIllIl != null) {
            IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
            if (lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl;
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
                llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = null;
                if (llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll && llllIIIIlIIIlIlllIll.Q != null) {
                    llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl("fishing_rod_cast", "inventory");
                }
                else if (llllIIIIlIIIlIlllIll2 == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl && llllIIIIlIIIlIlllIll.e() != null) {
                    final int n = lllIIIIlIlIllIIlIIIl.lIlIlIIIllIIllIIIllI() - llllIIIIlIIIlIlllIll.f();
                    if (n >= 18) {
                        llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl("bow_pulling_2", "inventory");
                    }
                    else if (n > 13) {
                        llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl("bow_pulling_1", "inventory");
                    }
                    else if (n > 0) {
                        llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl("bow_pulling_0", "inventory");
                    }
                }
                else if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.q.llIllIIIIIllIlIIIIlI()) {
                    llllIIIlIlllIlIIIIIl = (llllIIIlIlllIlIIIIIl)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.q, lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.f());
                }
                if (llllIIIlIlllIlIIIIIl != null) {
                    ilIlIlIlIlllllllllIl = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
                    this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
                }
            }
            this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, ilIlIlIlIlllllllllIl, ilIlIIIllIIllIlllllI);
            this.llllIIIlIlllIlIIIIIl = null;
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(false, false);
        this.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 1, 0);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIllIIllIIlIIIIlIIl.llIllIIIIIllIlIIIIlI()) {
            ilIlIlIlIlllllllllIl = (IlIlIlIlIlllllllllIl)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIllIIllIIlIIIIlIIl, ilIlIlIlIlllllllllIl, ilIlIIIllIIllIlllllI);
        }
        else {
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
            if (this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI))) {
                lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI(1028);
            }
        }
        this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, ilIlIlIlIlllllllllIl);
        lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI(1029);
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIIIllIllIIIIIllI();
    }
    
    private boolean llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        return illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl.x < 0.0f ^ illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl.y < 0.0f ^ illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl.z < 0.0f;
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        this.lIIIIlIIIIIlllIllIII = true;
        IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(false, false);
        lllllIlIIIlIlIIlllII.IlIlIllllllllIIIIlII();
        lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(516, 0.1f);
        lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        this.llllIIIIlIIIlIlllIll(n, n2, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIllIIllIIlIIIIlIIl.llIllIIIIIllIlIIIIlI()) {
            llllIIIIlIIIlIlllIll = (IlIlIlIlIlllllllllIl)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIllIIllIIlIIIIlIIl, llllIIIIlIIIlIlllIll, IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
        }
        else {
            llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI);
        }
        this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
        lllllIlIIIlIlIIlllII.IIlllIlIIllIlIlIlIIl();
        lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
        this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl).IlIlIIIllIllIIIIIllI();
        this.lIIIIlIIIIIlllIllIII = false;
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean b) {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl((float)n, (float)n2, 100.0f + this.llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(8.0f, 8.0f, 0.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f, 1.0f, -1.0f);
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(0.5f, 0.5f, 0.5f);
        if (b) {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(40.0f, 40.0f, 40.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(210.0f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(-135.0f, 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
        }
        else {
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(64.0f, 64.0f, 64.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(180.0f, 1.0f, 0.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != null) {
            this.llllIIIIlIIIlIlllIll += 50.0f;
            try {
                this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, n, n2);
            }
            catch (Throwable t) {
                final net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(t, "Rendering item");
                final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Item being rendered");
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Item Type", new llIIIlIlIllIIlIlIlII(this, lllIIIIlIlIllIIlIIIl));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Item Aux", new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.lllllIlIIIlIlIIlllII(this, lllIIIIlIlIllIIlIIIl));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Item NBT", new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.lIllllllIIllIlIlIlII(this, lllIIIIlIlIllIIlIIIl));
                llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Item Foil", new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llIIlllIIlllIIllIllI(this, lllIIIIlIlIllIIlIIIl));
                throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll);
            }
            this.llllIIIIlIIIlIlllIll -= 50.0f;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final FontRenderer fontRenderer, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll(fontRenderer, lllIIIIlIlIllIIlIIIl, n, n2, null);
    }
    
    public void llllIIIIlIIIlIlllIll(final FontRenderer fontRenderer, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final int n2, final String s) {
        if (lllIIIIlIlIllIIlIIIl != null) {
            if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl != 1 || s != null) {
                String string = (s == null) ? String.valueOf(lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl) : s;
                if (s == null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl < 1) {
                    string = IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI + String.valueOf(lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl);
                }
                lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
                lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                fontRenderer.llllIIIIlIIIlIlllIll(string, (float)(n + 19 - 2 - fontRenderer.llllIIIIlIIIlIlllIll(string)), (float)(n2 + 6 + 3), 16777215);
                lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
                lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            }
            if (net.optifine.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl)) {
                int n3 = (int)Math.round(13.0 - lllIIIIlIlIllIIlIIIl.llllIIIlIlllIlIIIIIl() * 13.0 / lllIIIIlIlIllIIlIIIl.lIIIlllIIIllIIIllIII());
                int n4 = (int)Math.round(255.0 - lllIIIIlIlIllIIlIIIl.llllIIIlIlllIlIIIIIl() * 255.0 / lllIIIIlIlIllIIlIIIl.lIIIlllIIIllIIIllIII());
                if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.p.llIllIIIIIllIlIIIIlI()) {
                    final double ilIlIIIllIllIIIIIllI = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(), net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.p, lllIIIIlIlIllIIlIIIl);
                    n3 = (int)Math.round(13.0 - ilIlIIIllIllIIIIIllI * 13.0);
                    n4 = (int)Math.round(255.0 - ilIlIIIllIllIIIIIllI * 255.0);
                }
                lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
                lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
                lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
                final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI();
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n + 2, n2 + 13, 13, 2, 0, 0, 0, 255);
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n + 2, n2 + 13, 12, 1, (255 - n4) / 4, 64, 0, 255);
                int n5 = 255 - n4;
                int n6 = n4;
                int n7 = 0;
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                    final int llllIIIIlIIIlIlllIll = lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(n4);
                    if (llllIIIIlIIIlIlllIll >= 0) {
                        n5 = (llllIIIIlIIIlIlllIll >> 16 & 0xFF);
                        n6 = (llllIIIIlIIIlIlllIll >> 8 & 0xFF);
                        n7 = (llllIIIIlIIIlIlllIll >> 0 & 0xFF);
                    }
                }
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n + 2, n2 + 13, n3, 1, n5, n6, n7, 255);
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
                lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
                lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
                lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl();
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII);
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n + 0, n2 + 0, 0.0).IlIlIlIlIlllllllllIl(n5, n6, n7, n8).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n + 0, n2 + n4, 0.0).IlIlIlIlIlllllllllIl(n5, n6, n7, n8).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n + n3, n2 + n4, 0.0).IlIlIlIlIlllllllllIl(n5, n6, n7, n8).IlIlIIIllIllIIIIIllI();
        liIllIIIllllIlllIllI.IlIlIlIlIlllllllllIl(n + n3, n2 + 0, 0.0).IlIlIlIlIlllllllllIl(n5, n6, n7, n8).IlIlIIIllIllIIIIIllI();
        IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl();
    }
    
    private void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj, "anvil_intact");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj, 1, "anvil_slightly_damaged");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aj, 2, "anvil_very_damaged");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(), "black_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(), "blue_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), "brown_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "cyan_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "gray_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(), "green_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "light_blue_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "lime_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "magenta_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "orange_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "pink_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), "purple_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), "red_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), "silver_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "white_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aC, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "yellow_carpet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad, dm.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "mossy_cobblestone_wall");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ad, dm.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "cobblestone_wall");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "coarse_dirt");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "dirt");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "podzol");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "double_fern");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "double_grass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "paeonia");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "double_rose");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "sunflower");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ, net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "syringa");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, aa.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "birch_leaves");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, aa.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "jungle_leaves");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, aa.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "oak_leaves");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI, aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "spruce_leaves");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll, aa.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() - 4, "acacia_leaves");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll, aa.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() - 4, "dark_oak_leaves");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, aa.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "birch_log");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, aa.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "jungle_log");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, aa.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "oak_log");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl, aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "spruce_log");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl, aa.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl() - 4, "acacia_log");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl, aa.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() - 4, "dark_oak_log");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, bt.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "chiseled_brick_monster_egg");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, bt.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "cobblestone_monster_egg");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, bt.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "cracked_brick_monster_egg");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, bt.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "mossy_brick_monster_egg");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, bt.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "stone_monster_egg");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.i, bt.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "stone_brick_monster_egg");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, aa.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "acacia_planks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, aa.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "birch_planks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, aa.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "dark_oak_planks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, aa.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "jungle_planks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, aa.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "oak_planks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl, aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "spruce_planks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM, ai.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "prismarine_bricks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM, ai.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "dark_prismarine");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aM, ai.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "prismarine");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.au, am.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "chiseled_quartz_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.au, am.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "quartz_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.au, am.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "quartz_column");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(), "allium");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), "blue_orchid");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(), "houstonia");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(), "orange_tulip");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(), "oxeye_daisy");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI(), "pink_tulip");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), "poppy");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(), "red_tulip");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll, llIllIIlllllllllllll.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(), "white_tulip");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, bm.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "red_sand");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, bm.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "sand");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, bo.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "chiseled_sandstone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, bo.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "sandstone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, bo.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "smooth_sandstone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ, ax.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "chiseled_red_sandstone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ, ax.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "red_sandstone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aQ, ax.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "smooth_red_sandstone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, aa.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "acacia_sapling");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, aa.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "birch_sapling");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, aa.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "dark_oak_sapling");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, aa.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "jungle_sapling");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, aa.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "oak_sapling");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl, aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "spruce_sapling");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl, 0, "sponge");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl, 1, "sponge_wet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(), "black_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(), "blue_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), "brown_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "cyan_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "gray_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(), "green_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "light_blue_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "lime_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "magenta_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "orange_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "pink_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), "purple_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), "red_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), "silver_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "white_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aK, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "yellow_stained_glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(), "black_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(), "blue_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), "brown_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "cyan_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "gray_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(), "green_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "light_blue_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "lime_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "magenta_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "orange_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "pink_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), "purple_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), "red_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), "silver_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "white_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aL, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "yellow_stained_glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(), "black_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(), "blue_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), "brown_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "cyan_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "gray_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(), "green_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "light_blue_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "lime_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "magenta_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "orange_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "pink_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), "purple_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), "red_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), "silver_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "white_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "yellow_stained_hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, cu.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "andesite");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, cu.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "andesite_smooth");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, cu.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "diorite");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, cu.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "diorite_smooth");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, cu.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "granite");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, cu.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "granite_smooth");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, cu.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "stone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, cw.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "cracked_stonebrick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, cw.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "stonebrick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, cw.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "chiseled_stonebrick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.j, cw.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "mossy_stonebrick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, cy.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "brick_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, cy.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "cobblestone_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, cy.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "old_wood_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, cy.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "nether_brick_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, cy.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "quartz_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, cy.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "sandstone_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, cy.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "stone_brick_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIIlIIlIlIIlll, cy.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "stone_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aT, da.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "red_sandstone_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, dd.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "dead_bush");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, dd.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "fern");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, dd.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "tall_grass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, aa.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "acacia_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, aa.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "birch_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, aa.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "dark_oak_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, aa.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "jungle_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, aa.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "oak_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Q, aa.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "spruce_slab");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(), "black_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(), "blue_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), "brown_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "cyan_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "gray_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(), "green_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "light_blue_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(), "lime_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "magenta_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), "orange_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "pink_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), "purple_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), "red_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), "silver_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), "white_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "yellow_wool");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aG, "acacia_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aw, "activator_rail");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ac, "beacon");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII, "bedrock");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Z, "birch_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIlIllIlIllIIIl, "bookshelf");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII, "brick_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlIlIIIlIIlIlIlII, "brick_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.y, "brick_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII, "brown_mushroom");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll, "cactus");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlllIlIlllIlIllll, "clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aE, "coal_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll, "coal_ore");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, "cobblestone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl, "crafting_table");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aH, "dark_oak_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ap, "daylight_detector");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl, "dead_bush");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI, "detector_rail");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl, "diamond_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI, "diamond_ore");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII, "dispenser");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ax, "dropper");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.X, "emerald_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.T, "emerald_ore");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.G, "enchanting_table");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K, "end_portal_frame");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.L, "end_stone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII, "oak_fence");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII, "spruce_fence");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIIllIIlIIIIlIIl, "birch_fence");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll, "jungle_fence");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllIIlIlIlllllIIIII, "dark_oak_fence");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIlIIIIIIIlIIlIlIIl, "acacia_fence");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.s, "oak_fence_gate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.t, "spruce_fence_gate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.u, "birch_fence_gate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.v, "jungle_fence_gate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.w, "dark_oak_fence_gate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.x, "acacia_fence_gate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllllIIllIIlllll, "furnace");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, "glass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.n, "glass_pane");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.b, "glowstone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII, "golden_rail");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII, "gold_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll, "gold_ore");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, "grass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll, "gravel");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aD, "hardened_clay");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aB, "hay_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.am, "heavy_weighted_pressure_plate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.at, "hopper");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII, "ice");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.m, "iron_bars");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll, "iron_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, "iron_ore");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aA, "iron_trapdoor");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl, "jukebox");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aa, "jungle_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI, "ladder");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII, "lapis_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII, "lapis_ore");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll, "lever");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.al, "light_weighted_pressure_plate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.d, "lit_pumpkin");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.o, "melon_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII, "mossy_cobblestone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A, "mycelium");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI, "netherrack");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.C, "nether_brick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.D, "nether_brick_fence");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.E, "nether_brick_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, "noteblock");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl, "oak_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl, "obsidian");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aF, "packed_ice");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI, "piston");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI, "pumpkin");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.as, "quartz_ore");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.av, "quartz_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIIIlIIllIIlIlIll, "rail");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ar, "redstone_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.N, "redstone_lamp");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIIIllllIlIIIIIII, "redstone_ore");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIlIlllIlllIlI, "redstone_torch");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl, "red_mushroom");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.S, "sandstone_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aR, "red_sandstone_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aN, "sea_lantern");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aI, "slime");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI, "snow");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI, "snow_layer");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.a, "soul_sand");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.Y, "spruce_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII, "sticky_piston");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.z, "stone_brick_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIllllIIlIllIlIlIll, "stone_button");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl, "stone_pressure_plate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllllIIlIlIllIIIllII, "stone_stairs");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII, "tnt");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll, "torch");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.h, "trapdoor");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.V, "tripwire_hook");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r, "vine");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B, "waterlily");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll, "web");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ah, "wooden_button");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIllIIllIIIIIIlIIlI, "wooden_pressure_plate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl, llIllIIlllllllllllll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), "dandelion");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl, "chest");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ak, "trapped_chest");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.U, "ender_chest");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, "iron_shovel");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl, "iron_pickaxe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI, "iron_axe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl, "flint_and_steel");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI, "apple");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl, 0, "bow");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl, 1, "bow_pulling_0");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl, 2, "bow_pulling_1");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl, 3, "bow_pulling_2");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl, "arrow");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, 0, "coal");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, 1, "charcoal");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII, "diamond");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, "iron_ingot");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, "gold_ingot");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIlIlIIIllIIllIIIllI, "iron_sword");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIllIIllIlllllI, "wooden_sword");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIIlllIIIIIIlIIIlll, "wooden_shovel");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIllllIlIlIIIIll, "wooden_pickaxe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIllIlIlIIIlIlIlIII, "wooden_axe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIlIllIllIlIIll, "stone_sword");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIIIIlllllIlIIllIl, "stone_shovel");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIIIIlllIlIllIl, "stone_pickaxe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIllIIIlIlIIIIlI, "stone_axe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIIlIlIIlllIIlll, "diamond_sword");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIlIIlIlIIlllIl, "diamond_shovel");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllllllIIIlIIIlIlII, "diamond_pickaxe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIIIIlllIlllllIlII, "diamond_axe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII, "stick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIllllllllIIIIlII, "bowl");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIlIIllIlIlIlIIl, "mushroom_stew");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIIlIlIllIIlIlIlII, "golden_sword");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIlIIIlIlIIlllII, "golden_shovel");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllllllIIllIlIlIlII, "golden_pickaxe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIlllIIlllIIllIllI, "golden_axe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII, "string");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll, "feather");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI, "gunpowder");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIllllllIllIIIlllIl, "wooden_hoe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIIlIIIllllIlIlIlI, "stone_hoe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIIIllIIIIlIIIIllIl, "iron_hoe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIIIIIIIlllIllIlIlI, "diamond_hoe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllllIIIlIIIIIIllIl, "golden_hoe");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl, "wheat_seeds");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll, "wheat");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII, "bread");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIlIlIIlIllIIIIIIl, "leather_helmet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIllIIIIlIIlIlllII, "leather_chestplate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIllllIIlIIlIlIlIll, "leather_leggings");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIllIlllIllllIIllI, "leather_boots");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIlIIIIIlIIlIlIIlll, "chainmail_helmet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlIlIIIlIIlIlIlII, "chainmail_chestplate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIlIIllIllIIlIllII, "chainmail_leggings");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIlIIIlIllIlIllIIIl, "chainmail_boots");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIIIlllIllIllIlIII, "iron_helmet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIlIlIlllIIlIlIlllIl, "iron_chestplate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIIIIIlIllIIlIIIll, "iron_leggings");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIlIlIllllIIlIllI, "iron_boots");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIIlIlllIllIIlIllI, "diamond_helmet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl, "diamond_chestplate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIIIIlIlIIIIIIl, "diamond_leggings");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllllIIllIIllIl, "diamond_boots");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllIIIIIlllIIlIIllI, "golden_helmet");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIlIIlllIIlIIlIlllIl, "golden_chestplate");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIIllIlIllIllIIIIl, "golden_leggings");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIllIIIlIlIIllIIIlI, "golden_boots");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIlllIIIlIlllII, "flint");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllllIIllIIlllll, "porkchop");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIlIlIIIlIlIIIl, "cooked_porkchop");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllllIllIllIlIlIII, "painting");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIllllIllllIlIlII, "golden_apple");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIllllIllllIlIlII, 1, "golden_apple");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIlIllllIlllIIIIll, "sign");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIllIIIllllIlllIllI, "oak_door");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIlIllIllIlllIIlll, "spruce_door");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIIlIIlIlIlIIIII, "birch_door");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIIlllllllllllll, "jungle_door");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIllIlIllIllllI, "acacia_door");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIIIIlIIllIIlIlIll, "dark_oak_door");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllllIIlIlIllIIIllII, "bucket");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIIIIlIIlllIlIl, "water_bucket");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIllllIIIlIllIlIIll, "lava_bucket");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIIlIlIIIlIIIIlIl, "minecart");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, "saddle");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIllIIllIIIIIIlIIlI, "iron_door");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII, "redstone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIIllIllIIlIlIl, "snowball");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIlllIlllllIIllIIII, "boat");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIlIlIlllIlllIlI, "leather");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIllllIIlIllIlIlIll, "milk_bucket");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIlIIIIIlIlllllIlI, "brick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIlIIIIllIlIIlIlIII, "clay_ball");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIIIlllIlIIIIIIIllI, "reeds");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll, "paper");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll, "book");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllllIllIllIIllllll, "slime_ball");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIIIIlIlIllIIlIIIl, "chest_minecart");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIlllIllIIIIllllII, "furnace_minecart");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllIlIIIllllllIIlII, "egg");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIllIIllIIlIIIIlIIl, "compass");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll, "fishing_rod");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIlllIlllllIIlllIll, 1, "fishing_rod_cast");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllIIlIlIlllllIIIII, "clock");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIlIIIIIIIlIIlIlIIl, "glowstone_dust");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), "cod");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), "salmon");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(), "clownfish");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, IlIIllIIllIIllIIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(), "pufferfish");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIlIllllIIlIIlIlI, IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), "cooked_cod");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIlIllllIIlIIlIlI, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), "cooked_salmon");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII.llIllIIIIIllIlIIIIlI(), "dye_black");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI(), "dye_red");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(), "dye_green");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI(), "dye_brown");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(), "dye_blue");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI(), "dye_purple");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(), "dye_cyan");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI(), "dye_silver");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(), "dye_gray");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(), "dye_pink");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(), "dye_lime");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(), "dye_yellow");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(), "dye_light_blue");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(), "dye_magenta");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(), "dye_orange");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(), "dye_white");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.b, "bone");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.c, "sugar");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.d, "cake");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.e, "bed");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.f, "repeater");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.g, "cookie");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.i, "shears");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.j, "melon");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.k, "pumpkin_seeds");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.l, "melon_seeds");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.m, "beef");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.n, "cooked_beef");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.o, "chicken");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.p, "cooked_chicken");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.s, "rabbit");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.t, "cooked_rabbit");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.q, "mutton");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.r, "cooked_mutton");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.v, "rabbit_foot");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.w, "rabbit_hide");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.u, "rabbit_stew");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.x, "rotten_flesh");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.y, "ender_pearl");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.z, "blaze_rod");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.A, "ghast_tear");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.B, "gold_nugget");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.C, "nether_wart");
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D, new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.IIlllIIIlIlllIIlllII(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.E, "glass_bottle");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.F, "spider_eye");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.G, "fermented_spider_eye");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.H, "blaze_powder");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.I, "magma_cream");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.J, "brewing_stand");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.K, "cauldron");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.L, "ender_eye");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.M, "speckled_melon");
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.N, new IIlIIIIIllIlIIIlIIll(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.O, "experience_bottle");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.P, "fire_charge");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.Q, "writable_book");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.S, "emerald");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.T, "item_frame");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.U, "flower_pot");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V, "carrot");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.W, "potato");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.X, "baked_potato");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.Y, "poisonous_potato");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.Z, "map");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aa, "golden_carrot");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 0, "skull_skeleton");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 1, "skull_wither");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 2, "skull_zombie");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 3, "skull_char");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 4, "skull_creeper");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ac, "carrot_on_a_stick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ad, "nether_star");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ae, "pumpkin_pie");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ag, "firework_charge");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ai, "comparator");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aj, "netherbrick");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ak, "quartz");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.al, "tnt_minecart");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.am, "hopper_minecart");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.an, "armor_stand");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ao, "iron_horse_armor");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ap, "golden_horse_armor");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aq, "diamond_horse_armor");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ar, "lead");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.as, "name_tag");
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aI, new llllllIllIllIlIllllI(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.au, "record_13");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.av, "record_cat");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aw, "record_blocks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ax, "record_chirp");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ay, "record_far");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.az, "record_mall");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aA, "record_mellohi");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aB, "record_stal");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aC, "record_strad");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aD, "record_ward");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aE, "record_11");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aF, "record_wait");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aG, "prismarine_shard");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aH, "prismarine_crystals");
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ah, new IIIllllllIllIIIlllIl(this));
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.h, new IlIIIlIIIllllIlIlIlI(this));
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ab, "command_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.af, "fireworks");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.at, "command_block_minecart");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az, "barrier");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI, "mob_spawner");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.R, "written_book");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.k, llllllIIIIIIIlllIIll.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), "brown_mushroom_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.l, llllllIIIIIIIlllIIll.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl(), "red_mushroom_block");
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.M, "dragon_egg");
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.as.llIllIIIIIllIlIIIIlI()) {
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.as, this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        final float n2 = (float)(n & 0xFF);
        final float n3 = (float)(n >>> 8 & 0xFF);
        final float n4 = (float)(n >>> 16 & 0xFF);
        final float n5 = (float)(n >>> 24 & 0xFF);
        final int[] ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        final int n6 = ilIlIlIlIlllllllllIl.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n7 = ilIlIlIlIlllllllllIl[3 + n6 * i];
            liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI.llllIIIIlIIIlIlllIll(4 - i), Math.min(255, (int)(n2 * (n7 & 0xFF) / 255.0f)), Math.min(255, (int)(n3 * (n7 >>> 8 & 0xFF) / 255.0f)), Math.min(255, (int)(n4 * (n7 >>> 16 & 0xFF) / 255.0f)), Math.min(255, (int)(n5 * (n7 >>> 24 & 0xFF) / 255.0f)));
        }
    }
}
