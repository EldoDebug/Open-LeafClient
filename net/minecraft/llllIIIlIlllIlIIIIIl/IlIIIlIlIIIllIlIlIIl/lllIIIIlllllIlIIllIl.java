package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lllIIIIlllllIlIIllIl extends llIllIlIIIIllIlIIllI
{
    private int llllIIIIlIIIlIlllIll;
    
    public lllIIIIlllllIlIIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = -1;
    }
    
    public lllIIIIlllllIlIIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llllIIIIlIIIlIlllIll = -1;
    }
    
    @Override
    public lIlIlIIIllIIllIIIllI llllIIIlIlllIlIIIIIl() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl lIIIIlIIIIIlllIllIII() {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII.lllIllIIIllllllIllll();
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.llllIIIIlIIIlIlllIll > 0) {
            --this.llllIIIIlIIIlIlllIll;
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
        }
        else if (this.llllIIIIlIIIlIlllIll == 0) {
            this.IlIlIlIlIlllllllllIl(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
        }
        if (this.IIIIIIIIIlllIllIlIlI) {
            final double n = this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII;
            if (n >= 0.009999999776482582) {
                this.IlIlIlIlIlllllllllIl(n);
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        final llIllIIIIIllIlIIIIlI liiIlllIIIllIIIllIII = lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII();
        if (liiIlllIIIllIIIllIII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)liiIlllIIIllIIIllIII;
            if (llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl()) {
                this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII * llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII + llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI * llllIIIIlIIIlIlllIll.llIIlllIIlllIIllIllI + llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII * llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII);
            }
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        final double n = this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII;
        if (!lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI() && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII, 1), 0.0f);
        }
        if (lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll() || lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI() || n >= 0.009999999776482582) {
            this.IlIlIlIlIlllllllllIl(n);
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final double n) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            double sqrt = Math.sqrt(n);
            if (sqrt > 5.0) {
                sqrt = 5.0;
            }
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, (float)(4.0 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 1.5 * sqrt), true);
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
        if (n >= 3.0f) {
            final float n3 = n / 10.0f;
            this.IlIlIlIlIlllllllllIl(n3 * n3);
        }
        super.IlIIIlIlIIIllIlIlIIl(n, n2);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final boolean b) {
        if (b && this.llllIIIIlIIIlIlllIll < 0) {
            this.lIIIlllIIIllIIIllIII();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 10) {
            this.lIIIlllIIIllIIIllIII();
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    public void lIIIlllIIIllIIIllIII() {
        this.llllIIIIlIIIlIlllIll = 80;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)10);
            if (!this.lIlIlIlllIIlIlIlllIl()) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, "game.tnt.primed", 1.0f, 1.0f);
            }
        }
    }
    
    public int llIIIlIlIllIIlIlIlII() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean lllllIlIIIlIlIIlllII() {
        return this.llllIIIIlIIIlIlllIll > -1;
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (!this.lllllIlIIIlIlIIlllII() || (!ao.lIIIlllIIIllIIIllIII(llIIlIIIlIIIllIlIIIl) && !ao.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()))) ? super.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl) : 0.0f;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n) {
        return (!this.lllllIlIIIlIlIIlllII() || (!ao.lIIIlllIIIllIIIllIII(llIIlIIIlIIIllIlIIIl) && !ao.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()))) && super.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, n);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("TNTFuse", 99)) {
            this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("TNTFuse");
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TNTFuse", this.llllIIIIlIIIlIlllIll);
    }
}
