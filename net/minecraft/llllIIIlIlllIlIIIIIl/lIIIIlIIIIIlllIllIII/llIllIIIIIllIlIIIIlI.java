package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class llIllIIIIIllIlIIIIlI extends net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI
{
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    public lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    private int llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    public double IlIlIlIlIlllllllllIl;
    public double llIllIIIIIllIlIIIIlI;
    public double IlIIIlIlIIIllIlIlIIl;
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = -1;
        this.llllIIIIlIIIlIlllIll(1.0f, 1.0f);
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
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = -1;
        this.llllIIIIlIIIlIlllIll(1.0f, 1.0f);
        this.IlIlIlIlIlllllllllIl(n, n2, n3, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        final double n7 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n4 * n4 + n5 * n5 + n6 * n6);
        this.IlIlIlIlIlllllllllIl = n4 / n7 * 0.1;
        this.llIllIIIIIllIlIIIIlI = n5 / n7 * 0.1;
        this.IlIIIlIlIIIllIlIlIIl = n6 / n7 * 0.1;
    }
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll, double n, double n2, double n3) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = -1;
        this.llllIIIlIlllIlIIIIIl = -1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(1.0f, 1.0f);
        this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll, llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI);
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        final double lIllllllIIllIlIlIlII = 0.0;
        this.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        n += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.4;
        n2 += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.4;
        n3 += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.4;
        final double n4 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n2 * n2 + n3 * n3);
        this.IlIlIlIlIlllllllllIl = n / n4 * 0.1;
        this.llIllIIIIIllIlIIIIlI = n2 / n4 * 0.1;
        this.IlIIIlIlIIIllIlIlIIl = n3 / n4 * 0.1;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII || ((this.llllIIIIlIIIlIlllIll == null || !this.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl) && this.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(new IlIlIlIlIlllllllllIl(this)))) {
            super.IIllIIllIIIlIlIIIIlI();
            this.IlIlIIIllIllIIIIIllI(1);
            if (this.lIIIlllIIIllIIIllIII) {
                if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl)).llIllIIIIIllIlIIIIlI() == this.lIIIIlIIIIIlllIllIII) {
                    ++this.llIIlIIIlIIIllIlIIIl;
                    if (this.llIIlIIIlIIIllIlIIIl == 600) {
                        this.IllIllIIIIlIIlIlllII();
                    }
                    return;
                }
                this.lIIIlllIIIllIIIllIII = false;
                this.lIllllllIIllIlIlIlII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.llIIlllIIlllIIllIllI *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.IIlllIIIlIlllIIlllII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
                this.llIIlIIIlIIIllIlIIIl = 0;
                this.llIllIlIIIIllIlIIllI = 0;
            }
            else {
                ++this.llIllIlIIIIllIlIIllI;
            }
            llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII), new e(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII));
            final e e = new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
            e e2 = new e(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII);
            if (llllIIIIlIIIlIlllIll != null) {
                e2 = new e(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
            }
            net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
            final List ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII).IlIlIlIlIlllllllllIl(1.0, 1.0, 1.0));
            double n = 0.0;
            for (int i = 0; i < ilIlIlIlIlllllllllIl.size(); ++i) {
                final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl.get(i);
                if (llIllIIIIIllIlIIIIlI2.IIlllIIlllIIIlIlllII() && (!llIllIIIIIllIlIIIIlI2.lIIIIlIIIIIlllIllIII(this.llllIIIIlIIIlIlllIll) || this.llIllIlIIIIllIlIIllI >= 25)) {
                    final float n2 = 0.3f;
                    final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll2 = llIllIIIIIllIlIIIIlI2.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(n2, n2, n2).llllIIIIlIIIlIlllIll(e, e2);
                    if (llllIIIIlIIIlIlllIll2 != null) {
                        final double llllIIIlIlllIlIIIIIl = e.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI);
                        if (llllIIIlIlllIlIIIIIl < n || n == 0.0) {
                            llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
                            n = llllIIIlIlllIlIIIIIl;
                        }
                    }
                }
            }
            if (llIllIIIIIllIlIIIIlI != null) {
                llllIIIIlIIIlIlllIll = new llIlllIlllllIIllIIII(llIllIIIIIllIlIIIIlI);
            }
            if (llllIIIIlIIIlIlllIll != null) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            }
            this.IIlllIlIIllIlIlIlIIl += this.lIllllllIIllIlIlIlII;
            this.llIIIlIlIllIIlIlIlII += this.llIIlllIIlllIIllIllI;
            this.lllllIlIIIlIlIIlllII += this.IIlllIIIlIlllIIlllII;
            final float llllIIIIlIIIlIlllIll3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
            this.IIlIIIIIllIlIIIlIIll = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlllIIIlIlllIIlllII, this.lIllllllIIllIlIlIlII) * 180.0 / 3.141592653589793) + 90.0f;
            this.llllllIllIllIlIllllI = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3, this.llIIlllIIlllIIllIllI) * 180.0 / 3.141592653589793) - 90.0f;
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
            float llllIIIlIlllIlIIIIIl2 = this.llllIIIlIlllIlIIIIIl();
            if (this.llIIIlIlllIllIIlIllI()) {
                for (int j = 0; j < 4; ++j) {
                    final float n3 = 0.25f;
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, this.IIlllIlIIllIlIlIlIIl - this.lIllllllIIllIlIlIlII * n3, this.llIIIlIlIllIIlIlIlII - this.llIIlllIIlllIIllIllI * n3, this.lllllIlIIIlIlIIlllII - this.IIlllIIIlIlllIIlllII * n3, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
                }
                llllIIIlIlllIlIIIIIl2 = 0.8f;
            }
            this.lIllllllIIllIlIlIlII += this.IlIlIlIlIlllllllllIl;
            this.llIIlllIIlllIIllIllI += this.llIllIIIIIllIlIIIIlI;
            this.IIlllIIIlIlllIIlllII += this.IlIIIlIlIIIllIlIlIIl;
            this.lIllllllIIllIlIlIlII *= llllIIIlIlllIlIIIIIl2;
            this.llIIlllIIlllIIllIllI *= llllIIIlIlllIlIIIIIl2;
            this.IIlllIIIlIlllIIlllII *= llllIIIlIlllIlIIIIIl2;
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
            this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        }
        else {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    protected float llllIIIlIlllIlIIIIIl() {
        return 0.95f;
    }
    
    protected abstract void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII p0);
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("xTile", (short)this.IlIlIIIllIllIIIIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("yTile", (short)this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("zTile", (short)this.llllIIIlIlllIlIIIIIl);
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inTile", (lIllllIllIllIIllllll == null) ? "" : lIllllIllIllIIllllll.toString());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inGround", (byte)(this.lIIIlllIIIllIIIllIII ? 1 : 0));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("direction", this.llllIIIIlIIIlIlllIll(new double[] { this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII }));
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("xTile");
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("yTile");
        this.llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("zTile");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("inTile", 8)) {
            this.lIIIIlIIIIIlllIllIII = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("inTile"));
        }
        else {
            this.lIIIIlIIIIIlllIllIII = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inTile") & 0xFF);
        }
        this.lIIIlllIIIllIIIllIII = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inGround") == 1);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("direction", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("direction", 6);
            this.lIllllllIIllIlIlIlII = llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(0);
            this.llIIlllIIlllIIllIllI = llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(1);
            this.IIlllIIIlIlllIIlllII = llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(2);
        }
        else {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return true;
    }
    
    @Override
    public float lllllIIllIlIllIllllI() {
        return 1.0f;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        this.IIIllIIIlIlIIllIIIlI();
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() != null) {
            final e ilIIIIIlIIllIIlIlIll = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl().IlIIIIIlIIllIIlIlIll();
            if (ilIIIIIlIIllIIlIlIll != null) {
                this.lIllllllIIllIlIlIlII = ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll;
                this.llIIlllIIlllIIllIllI = ilIIIIIlIIllIIlIlIll.IlIlIlIlIlllllllllIl;
                this.IIlllIIIlIlllIIlllII = ilIIIIIlIIllIIlIlIll.llIllIIIIIllIlIIIIlI;
                this.IlIlIlIlIlllllllllIl = this.lIllllllIIllIlIlIlII * 0.1;
                this.llIllIIIIIllIlIIIIlI = this.llIIlllIIlllIIllIllI * 0.1;
                this.IlIIIlIlIIIllIlIlIIl = this.IIlllIIIlIlllIIlllII * 0.1;
            }
            if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof lllIIIIlllllIlIIllIl) {
                this.llllIIIIlIIIlIlllIll = (lllIIIIlllllIlIIllIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
            }
            return true;
        }
        return false;
    }
    
    @Override
    public float b_(final float n) {
        return 1.0f;
    }
    
    @Override
    public int a_(final float n) {
        return 15728880;
    }
}
