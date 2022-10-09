package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;
import com.google.common.collect.*;
import net.optifine.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import leaf.*;
import net.optifine.shaders.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public abstract class llllIIIIlIIIlIlllIll implements IlIllIlIlIIIlIlIlIII
{
    protected static final lIllllIllIllIIllllll IlIlIlIlIlllllllllIl;
    protected IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI;
    protected IlIIIlIlIIIllIlIlIIl IlIIIlIlIIIllIlIlIIl;
    private final IIllIIIlIIlIlIlIIIII llllIIIIlIIIlIlllIll;
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private float llllIIIlIlllIlIIIIIl;
    private float lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private static final Map llIIlIIIlIIIllIlIIIl;
    private static volatile /* synthetic */ int[] llIllIlIIIIllIlIIllI;
    
    static {
        IlIlIlIlIlllllllllIl = new lIllllIllIllIIllllll("textures/misc/enchanted_item_glint.png");
        llIIlIIIlIIIllIlIIIl = Maps.newHashMap();
    }
    
    public llllIIIIlIIIlIlllIll(final IIllIIIlIIlIlIlIIIII llllIIIIlIIIlIlllIll) {
        this.IlIlIIIllIllIIIIIllI = 1.0f;
        this.IllIIlllIIIIlllIIlIl = 1.0f;
        this.llllIIIlIlllIlIIIIIl = 1.0f;
        this.lIIIIlIIIIIlllIllIII = 1.0f;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3, n4, n5, n6, n7, 4);
        this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3, n4, n5, n6, n7, 3);
        this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3, n4, n5, n6, n7, 2);
        this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3, n4, n5, n6, n7, 1);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return false;
    }
    
    private void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final int n8) {
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n8);
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
            final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(n8);
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n3);
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlIlllIlIlllIlIllll.llIllIIIIIllIlIIIIlI()) {
                ilIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll, n8, ilIIIlIlIIIllIlIlIIl);
            }
            this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, n8);
            final boolean ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(n8);
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p() || !lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl ? 2 : 1, null)) {
                if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI()) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl ? 2 : 1, (String)null));
                }
                else {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(iiIlIIlIIIIlllIlllII, ilIlIlIlIlllllllllIl));
                }
            }
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIllIIlIlIlllllIIIII.llIllIIIIIllIlIIIIlI()) {
                if (IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(iiIlIIlIIIIlllIlllII, llllIIIIlIIIlIlllIll)) {
                    final int lIlIlIIIllIIllIIIllI = iiIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI(llllIIIIlIIIlIlllIll);
                    lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl * ((lIlIlIIIllIIllIIIllI >> 16 & 0xFF) / 255.0f), this.llllIIIlIlllIlIIIIIl * ((lIlIlIIIllIIllIIIllI >> 8 & 0xFF) / 255.0f), this.lIIIIlIIIIIlllIllIII * ((lIlIlIIIllIIllIIIllI & 0xFF) / 255.0f), this.IlIlIIIllIllIIIIIllI);
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n4, n5, n6, n7);
                    if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p() || !lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl ? 2 : 1, "overlay")) {
                        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl ? 2 : 1, "overlay"));
                    }
                }
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.IlIlIIIllIllIIIIIllI);
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n4, n5, n6, n7);
                if (!this.lIIIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI() && (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p() || !lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl, n, n2, n3, n4, n5, n6, n7)) && !Leaf.instance.modManager.hideEnchant) {
                    this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, ilIIIlIlIIIllIlIlIIl, n, n2, n3, n4, n5, n6, n7);
                }
                return;
            }
            switch (llIllIIIIIllIlIIIIlI()[iiIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl().ordinal()]) {
                case 1: {
                    final int lIlIlIIIllIIllIIIllI2 = iiIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI(llllIIIIlIIIlIlllIll);
                    lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl * ((lIlIlIIIllIIllIIIllI2 >> 16 & 0xFF) / 255.0f), this.llllIIIlIlllIlIIIIIl * ((lIlIlIIIllIIllIIIllI2 >> 8 & 0xFF) / 255.0f), this.lIIIIlIIIIIlllIllIII * ((lIlIlIIIllIIllIIIllI2 & 0xFF) / 255.0f), this.IlIlIIIllIllIIIIIllI);
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n4, n5, n6, n7);
                    if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p() || !lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl ? 2 : 1, "overlay")) {
                        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(iiIlIIlIIIIlllIlllII, ilIlIlIlIlllllllllIl, "overlay"));
                    }
                }
                case 2:
                case 3:
                case 4:
                case 5: {
                    lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl, this.lIIIIlIIIIIlllIllIII, this.IlIlIIIllIllIIIIIllI);
                    ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n4, n5, n6, n7);
                    break;
                }
            }
            if (!this.lIIIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII() && (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p() || !lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl, n, n2, n3, n4, n5, n6, n7)) && !Leaf.instance.modManager.hideEnchant) {
                this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, ilIIIlIlIIIllIlIlIIl, n, n2, n3, n4, n5, n6, n7);
            }
        }
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final int n) {
        return lllIIIIlllllIlIIllIl.llIllIlIIIIllIlIIllI(n - 1);
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final int n) {
        return this.IlIlIlIlIlllllllllIl(n) ? this.llIllIIIIIllIlIIIIlI : this.IlIIIlIlIIIllIlIlIIl;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final int n) {
        return n == 2;
    }
    
    private void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() || !llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            final float n8 = lllIIIIlllllIlIIllIl.lllllIIIIIlIlIIIIIIl + n3;
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                IIlllIIIlIlllIIlllII.llllIIllllIlIlIIIIll();
            }
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(514);
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
            final float n9 = 0.5f;
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n9, n9, n9, 1.0f);
            for (int i = 0; i < 2; ++i) {
                lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(768, 1);
                final float n10 = 0.76f;
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(0.5f * n10, 0.25f * n10, 0.8f * n10, 1.0f);
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
                lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                final float n11 = 0.33333334f;
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n11, n11, n11);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(30.0f - i * 60.0f, 0.0f, 0.0f, 1.0f);
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, n8 * (0.001f + i * 0.003f) * 20.0f, 0.0f);
                lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n4, n5, n6, n7);
            }
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                IIlllIIIlIlllIIlllII.IlIllIlIlIIIlIlIlIII();
            }
        }
    }
    
    private lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(iiIlIIlIIIIlllIlllII, b, null);
    }
    
    private lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII, final boolean b, final String s) {
        final String format = String.format("textures/models/armor/%s_layer_%d%s.png", iiIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl().llIllIIIIIllIlIIIIlI(), b ? 2 : 1, (s == null) ? "" : String.format("_%s", s));
        lIllllIllIllIIllllll lIllllIllIllIIllllll = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.get(format);
        if (lIllllIllIllIIllllll == null) {
            lIllllIllIllIIllllll = new lIllllIllIllIIllllll(format);
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.put(format, lIllllIllIllIIllllll);
        }
        return lIllllIllIllIIllllll;
    }
    
    protected abstract void llllIIIIlIIIlIlllIll();
    
    protected abstract void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl p0, final int p1);
    
    protected IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final String s) {
        String s2 = ((IIIlIIlIIIIlllIlllII)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).lllIIIIlllllIlIIllIl().llIllIIIIIllIlIIIIlI();
        String substring = "minecraft";
        final int index = s2.indexOf(58);
        if (index != -1) {
            substring = s2.substring(0, index);
            s2 = s2.substring(index + 1);
        }
        final String illIIlllIIIIlllIIlIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIllIIlIlIlllllIIIII, llIllIIIIIllIlIIIIlI, lllIIIIlIlIllIIlIIIl, String.format("%s:textures/models/armor/%s_layer_%d%s.png", substring, s2, this.IlIlIlIlIlllllllllIl(n) ? 2 : 1, (s == null) ? "" : String.format("_%s", s)), n, s);
        lIllllIllIllIIllllll lIllllIllIllIIllllll = net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.get(illIIlllIIIIlllIIlIl);
        if (lIllllIllIllIIllllll == null) {
            lIllllIllIllIIllllll = new lIllllIllIllIIllllll(illIIlllIIIIlllIIlIl);
            net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.put(illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll);
        }
        return lIllllIllIllIIllllll;
    }
    
    static /* synthetic */ int[] llIllIIIIIllIlIIIIlI() {
        final int[] llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI;
        if (llIllIlIIIIllIlIIllI != null) {
            return llIllIlIIIIllIlIIllI;
        }
        final int[] llIllIlIIIIllIlIIllI2 = new int[IIlllIlIIllIlIlIlIIl.values().length];
        try {
            llIllIlIIIIllIlIIllI2[IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            llIllIlIIIIllIlIIllI2[IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            llIllIlIIIIllIlIIllI2[IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            llIllIlIIIIllIlIIllI2[IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            llIllIlIIIIllIlIIllI2[IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        return llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI2;
    }
}
