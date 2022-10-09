package net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl;

import leaf.cosmetic.*;
import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import leaf.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;

public class lIIlIIIlIllIlIllIIIl extends IIllIIIlIIlIlIlIIIII
{
    private boolean llllIIIIlIIIlIlllIll;
    private CosmeticWing IlIlIIIllIllIIIIIllI;
    private Cosmetic IIIlIIIlIlIIlllIIlll;
    
    public lIIlIIIlIllIlIllIIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this(lllIllIIIllllllIllll, false);
    }
    
    public lIIlIIIlIllIlIllIIIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final boolean llllIIIIlIIIlIlllIll) {
        super(lllIllIIIllllllIllll, new lIllllllIIllIlIlIlII(0.0f, llllIIIIlIIIlIlllIll), 0.5f);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this));
        this.llllIIIIlIIIlIlllIll(new lIlIlIIIllIIllIIIllI(this));
        this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this));
        this.llllIIIIlIIIlIlllIll(new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(this));
        this.llllIIIIlIIIlIlllIll(new net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(this));
        this.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(this.lIIIIlIIIIIlllIllIII().llIllIlIIIIllIlIIllI));
        this.IlIlIIIllIllIIIIIllI = new CosmeticWing();
        this.IIIlIIIlIlIIlllIIlll = new Cosmetic(this.lIIIIlIIIIIlllIllIII());
    }
    
    public lIllllllIIllIlIlIlII lIIIIlIIIIIlllIllIII() {
        return (lIllllllIIllIlIlIlII)super.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n, final double n2, final double n3, final float n4, final float n5) {
        if (!llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII() || this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll) {
            double n6 = n2;
            if (llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl() && !(llllIIIIlIIIlIlllIll instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI)) {
                n6 = n2 - 0.125;
            }
            this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
            super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n6, n3, n4, n5);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, n3, n4, n5, n6);
        if (!Leaf.instance.modManager.hideWing && llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() != null) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, 0.0f, n3, n4, n5, n6);
        }
        if (!Leaf.instance.modManager.IlIlIIIlIIlIlIIlllIl && llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI() != null && llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl[3] == null) {
            this.IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, 0.0f, n3, n4, n5, n6);
        }
    }
    
    private void IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lIllllllIIllIlIlIlII liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(false);
            liiiIlIIIIIlllIllIII.llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl = true;
            liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl = true;
        }
        else {
            final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(true);
            liiiIlIIIIIlllIllIII.lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl);
            liiiIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl);
            liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI);
            liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl);
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI);
            liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl);
            liiiIlIIIIIlllIllIII.lllIIIIlllllIlIIllIl = 0;
            liiiIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll = false;
            liiiIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI = llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
            if (ilIIIlIlIIIllIlIlIIl == null) {
                liiiIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl = 0;
            }
            else {
                liiiIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl = 1;
                if (llllIIIIlIIIlIlllIll.f() > 0) {
                    final net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll ilIlIIIllIIllIlllllI = ilIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI();
                    if (ilIlIIIllIIllIlllllI == net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) {
                        liiiIlIIIIIlllIllIII.IlIlIIIIIIlllIlIllIl = 3;
                    }
                    else if (ilIlIIIllIIllIlllllI == net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI) {
                        liiiIlIIIIIlllIllIII.IIIlIIIlIlIIlllIIlll = true;
                    }
                }
            }
        }
    }
    
    protected lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void r_() {
        lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.1875f, 0.0f);
    }
    
    protected void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n) {
        final float n2 = 0.9375f;
        lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n2, n2, n2);
    }
    
    protected void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n, double n2, final double n3, final String s, final float n4, final double n5) {
        if (n5 < 100.0) {
            final llIIlIIIlIIIllIlIIIl au = llllIIIIlIIIlIlllIll.au();
            final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll2 = au.llllIIIIlIIIlIlllIll(2);
            if (llllIIIIlIIIlIlllIll2 != null) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, String.valueOf(au.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.s_(), llllIIIIlIIIlIlllIll2).IlIlIlIlIlllllllllIl()) + " " + llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl(), n, n2, n3, 64);
                n2 += this.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll * 1.15f * n4;
            }
        }
        super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, n3, s, n4, n5);
    }
    
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final float n = 1.0f;
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n, n, n);
        final lIllllllIIllIlIlIlII liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
        liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI = 0.0f;
        liiiIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI = false;
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, llllIIIIlIIIlIlllIll);
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
    }
    
    public void llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final float n = 1.0f;
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(n, n, n);
        final lIllllllIIllIlIlIlII liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
        liiiIlIIIIIlllIllIII.IIllIIllIIIlIlIIIIlI = false;
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI = 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f, llllIIIIlIIIlIlllIll);
        liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
    }
    
    protected void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n, final double n2, final double n3) {
        if (llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII() && llllIIIIlIIIlIlllIll.ah()) {
            super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n + llllIIIIlIIIlIlllIll.H, n2 + llllIIIIlIIIlIlllIll.I, n3 + llllIIIIlIIIlIlllIll.J);
        }
        else {
            super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, n3);
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2, final float n3) {
        if (llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII() && llllIIIIlIIIlIlllIll.ah()) {
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.s(), 0.0f, 1.0f, 0.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll), 0.0f, 0.0f, 1.0f);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(270.0f, 0.0f, 1.0f, 0.0f);
        }
        else {
            super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, n2, n3);
        }
    }
}
