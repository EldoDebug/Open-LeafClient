package leaf.cosmetic;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class CosmeticWing
{
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    private RenderCosmeticWing llIllIIIIIllIlIIIIlI;
    
    public CosmeticWing() {
        (this.llIllIIIIIllIlIIIIlI = new RenderCosmeticWing(this, null)).llllIIIIlIIIlIlllIll("wingTip.bone", 112, 136);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("wing.skin", -56, 88);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("wing.bone", 112, 88);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("wingTip.skin", -56, 144);
        final int liiIlllIIIllIIIllIII = this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII;
        final int llIIlIIIlIIIllIlIIIl = this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl;
        this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = 256;
        this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl = 256;
        (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll((IlIIIlIlIIIllIlIlIIl)this.llIllIIIIIllIlIIIIlI, "wing")).llllIIIIlIIIlIlllIll(-12.0f, 5.0f, 2.0f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("bone", -56.0f, -4.0f, -4.0f, 56, 8, 8);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = true;
        (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll((IlIIIlIlIIIllIlIlIIl)this.llIllIIIIIllIlIIIIlI, "wingTip")).llllIIIIlIIIlIlllIll(-56.0f, 0.0f, 0.0f);
        this.IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI = true;
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("bone", -56.0f, -2.0f, -2.0f, 56, 4, 4);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("skin", -56.0f, 0.0f, 2.0f, 56, 0, 56);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, n, n2, n4, n5, n6, n7);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n7, n, n2, n4, n5, n6, (llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll);
    }
}
