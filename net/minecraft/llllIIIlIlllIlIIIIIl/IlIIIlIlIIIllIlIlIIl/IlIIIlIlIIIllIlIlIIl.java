package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIIIlIlIIIllIlIlIIl extends llIllIIIIIllIlIIIIlI
{
    private double llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
    }
    
    @Override
    protected void a_() {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final double n) {
        double n2 = this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll() * 4.0;
        if (Double.isNaN(n2)) {
            n2 = 4.0;
        }
        final double n3 = n2 * 64.0;
        return n < n3 * n3;
    }
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final double llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final double llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        final double n = llllIIIIlIIIlIlllIll - this.IIlllIlIIllIlIlIlIIl;
        final double n2 = llIllIIIIIllIlIIIIlI - this.lllllIlIIIlIlIIlllII;
        final float llllIIIIlIIIlIlllIll2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n2 * n2);
        if (llllIIIIlIIIlIlllIll2 > 12.0f) {
            this.llllIIIIlIIIlIlllIll = this.IIlllIlIIllIlIlIlIIl + n / llllIIIIlIIIlIlllIll2 * 12.0;
            this.llIllIIIIIllIlIIIIlI = this.lllllIlIIIlIlIIlllII + n2 / llllIIIIlIIIlIlllIll2 * 12.0;
            this.IlIlIlIlIlllllllllIl = this.llIIIlIlIllIIlIlIlII + 8.0;
        }
        else {
            this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
            this.IlIlIlIlIlllllllllIl = liiIlllIIIllIIIllIII;
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = (this.IlIIllIIllIIllIIlIIl.nextInt(5) > 0);
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
        this.IIlllIlIIllIlIlIlIIl += this.lIllllllIIllIlIlIlII;
        this.llIIIlIlIllIIlIlIlII += this.llIIlllIIlllIIllIllI;
        this.lllllIlIIIlIlIIlllII += this.IIlllIIIlIlllIIlllII;
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
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final double n = this.llllIIIIlIIIlIlllIll - this.IIlllIlIIllIlIlIlIIl;
            final double n2 = this.llIllIIIIIllIlIIIIlI - this.lllllIlIIIlIlIIlllII;
            final float n3 = (float)Math.sqrt(n * n + n2 * n2);
            final float n4 = (float)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2, n);
            double n5 = llllIIIIlIIIlIlllIll + (n3 - llllIIIIlIIIlIlllIll) * 0.0025;
            if (n3 < 1.0f) {
                n5 *= 0.8;
                this.llIIlllIIlllIIllIllI *= 0.8;
            }
            this.lIllllllIIllIlIlIlII = Math.cos(n4) * n5;
            this.IIlllIIIlIlllIIlllII = Math.sin(n4) * n5;
            if (this.llIIIlIlIllIIlIlIlII < this.IlIlIlIlIlllllllllIl) {
                this.llIIlllIIlllIIllIllI += (1.0 - this.llIIlllIIlllIIllIllI) * 0.014999999664723873;
            }
            else {
                this.llIIlllIIlllIIllIllI += (-1.0 - this.llIIlllIIlllIIllIllI) * 0.014999999664723873;
            }
        }
        final float n6 = 0.25f;
        if (this.llIIIlIlllIllIIlIllI()) {
            for (int i = 0; i < 4; ++i) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, this.IIlllIlIIllIlIlIlIIl - this.lIllllllIIllIlIlIlII * n6, this.llIIIlIlIllIIlIlIlII - this.llIIlllIIlllIIllIllI * n6, this.lllllIlIIIlIlIIlllII - this.IIlllIIIlIlllIIlllII * n6, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
            }
        }
        else {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, this.IIlllIlIIllIlIlIlIIl - this.lIllllllIIllIlIlIlII * n6 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.6 - 0.3, this.llIIIlIlIllIIlIlIlII - this.llIIlllIIlllIIllIllI * n6 - 0.5, this.lllllIlIIIlIlIIlllII - this.IIlllIIIlIlllIIlllII * n6 + this.IlIIllIIllIIllIIlIIl.nextDouble() * 0.6 - 0.3, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
            ++this.IlIIIlIlIIIllIlIlIIl;
            if (this.IlIIIlIlIIIllIlIlIIl > 80 && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.IllIllIIIIlIIlIlllII();
                if (this.IlIlIIIllIllIIIIIllI) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.L)));
                }
                else {
                    this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(2003, new IlIlIlIlIlllllllllIl(this), 0);
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    public float b_(final float n) {
        return 1.0f;
    }
    
    @Override
    public int a_(final float n) {
        return 15728880;
    }
    
    @Override
    public boolean i_() {
        return false;
    }
}
