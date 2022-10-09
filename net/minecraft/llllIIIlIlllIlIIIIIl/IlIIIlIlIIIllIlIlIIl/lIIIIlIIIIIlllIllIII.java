package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lIIIIlIIIIIlllIllIII extends llIllIIIIIllIlIIIIlI
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
    }
    
    @Override
    protected void a_() {
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(8, 5);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final double n) {
        return n < 4096.0;
    }
    
    public lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = 0;
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        int n4 = 1;
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(8, lllIIIIlIlIllIIlIIIl);
            final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("Fireworks");
            if (ilIlIIIllIIllIlllllI != null) {
                n4 += ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl("Flight");
            }
        }
        this.lIllllllIIllIlIlIlII = this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.001;
        this.IIlllIIIlIlllIIlllII = this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.001;
        this.llIIlllIIlllIIllIllI = 0.05;
        this.IlIlIlIlIlllllllllIl = 10 * n4 + this.IlIIllIIllIIllIIlIIl.nextInt(6) + this.IlIIllIIllIIllIIlIIl.nextInt(7);
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(final double lIllllllIIllIlIlIlII, final double llIIlllIIlllIIllIllI, final double iIlllIIIlIlllIIlllII) {
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        if (this.IlIIIlIIIllllIlIlIlI == 0.0f && this.IIIllllllIllIIIlllIl == 0.0f) {
            final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII * lIllllllIIllIlIlIlII + iIlllIIIlIlllIIlllII * iIlllIIIlIlllIIlllII);
            final float n = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII, iIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
            this.IIlIIIIIllIlIIIlIIll = n;
            this.IIIllllllIllIIIlllIl = n;
            final float n2 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll) * 180.0 / 3.141592653589793);
            this.llllllIllIllIlIllllI = n2;
            this.IlIIIlIIIllllIlIlIlI = n2;
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.lIIlIIIlIllIlIllIIIl = this.IIlllIlIIllIlIlIlIIl;
        this.IIlIIIlllIllIllIlIII = this.llIIIlIlIllIIlIlIlII;
        this.lIlIlIlllIIlIlIlllIl = this.lllllIlIIIlIlIIlllII;
        super.IIllIIllIIIlIlIIIIlI();
        this.lIllllllIIllIlIlIlII *= 1.15;
        this.IIlllIIIlIlllIIlllII *= 1.15;
        this.llIIlllIIlllIIllIllI += 0.04;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
        this.IIlIIIIIllIlIIIlIIll = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.lIllllllIIllIlIlIlII, this.IIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
        this.llllllIllIllIlIllllI = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll) * 180.0 / 3.141592653589793);
        while (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI < -180.0f) {
            this.IlIIIlIIIllllIlIlIlI -= 360.0f;
        }
        while (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI >= 180.0f) {
            this.IlIIIlIIIllllIlIlIlI += 360.0f;
        }
        while (this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl < -180.0f) {
            this.IIIllllllIllIIIlllIl -= 360.0f;
        }
        while (this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl >= 180.0f) {
            this.IIIllllllIllIIIlllIl += 360.0f;
        }
        this.llllllIllIllIlIllllI = this.IlIIIlIIIllllIlIlIlI + (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI) * 0.2f;
        this.IIlIIIIIllIlIIIlIIll = this.IIIllllllIllIIIlllIl + (this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl) * 0.2f;
        if (this.llllIIIIlIIIlIlllIll == 0 && !this.lIlIlIlllIIlIlIlllIl()) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, "fireworks.launch", 3.0f, 1.0f);
        }
        ++this.llllIIIIlIIIlIlllIll;
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.llllIIIIlIIIlIlllIll % 2 < 2) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII - 0.3, this.lllllIlIIIlIlIIlllII, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.05, -this.llIIlllIIlllIIllIllI * 0.5, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.05, new int[0]);
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.llllIIIIlIIIlIlllIll > this.IlIlIlIlIlllllllllIl) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)17);
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 17 && this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final lllIIIIlIlIllIIlIIIl illIIlllIIIIlllIIlIl = this.IIlllIIlllIIIlIlllII.IllIIlllIIIIlllIIlIl(8);
            IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = null;
            if (illIIlllIIIIlllIIlIl != null && illIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll()) {
                ilIlIIIllIIllIlllllI = illIIlllIIIIlllIIlIl.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("Fireworks");
            }
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, ilIlIIIllIIllIlllllI);
        }
        super.llllIIIIlIIIlIlllIll(b);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Life", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("LifeTime", this.IlIlIlIlIlllllllllIl);
        final lllIIIIlIlIllIIlIIIl illIIlllIIIIlllIIlIl = this.IIlllIIlllIIIlIlllII.IllIIlllIIIIlllIIlIl(8);
        if (illIIlllIIIIlllIIlIl != null) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("FireworksItem", iiiIlllIIIIIIlIIIlll2);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Life");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("LifeTime");
        final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("FireworksItem");
        if (ilIlIIIllIIllIlllllI != null) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
            if (llllIIIIlIIIlIlllIll != null) {
                this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(8, llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    @Override
    public float b_(final float n) {
        return super.b_(n);
    }
    
    @Override
    public int a_(final float n) {
        return super.a_(n);
    }
    
    @Override
    public boolean i_() {
        return false;
    }
}
