package net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public abstract class lIIIlllIIIllIIIllIII extends llIllIIIIIllIlIIIIlI implements IIlIIIIIllIlIIIlIIll
{
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    protected boolean llllIIIIlIIIlIlllIll;
    public int IlIlIlIlIlllllllllIl;
    private lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl;
    private String lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    
    public lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llIllIIIIIllIlIIIIlI = -1;
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
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
    
    public lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl) {
        super(illlllllIIIlIIIlIlII);
        this.llIllIIIIIllIlIIIIlI = -1;
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
        this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl, llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII + llllIIIlIlllIlIIIIIl.llllIlIllllIIlIIlIlI(), llllIIIlIlllIlIIIIIl.lllllIlIIIlIlIIlllII, llllIIIlIlllIlIIIIIl.IIlIIIIIllIlIIIlIIll, llllIIIlIlllIlIIIIIl.llllllIllIllIlIllllI);
        this.IIlllIlIIllIlIlIlIIl -= net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * 0.16f;
        this.llIIIlIlIllIIlIlIlII -= 0.10000000149011612;
        this.lllllIlIIIlIlIIlllII -= net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * 0.16f;
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        final float n = 0.4f;
        this.lIllllllIIllIlIlIlII = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n;
        this.IIlllIIIlIlllIIlllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n;
        this.llIIlllIIlllIIllIllI = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.llllllIllIllIlIllllI + this.lIIIlllIIIllIIIllIII()) / 180.0f * 3.1415927f) * n;
        this.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, this.lIIIIlIIIIIlllIllIII(), 1.0f);
    }
    
    public lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII);
        this.llIllIIIIIllIlIIIIlI = -1;
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.lIIIlllIIIllIIIllIII = 0;
        this.llllIIIIlIIIlIlllIll(0.25f, 0.25f);
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
    }
    
    protected float lIIIIlIIIIIlllIllIII() {
        return 1.5f;
    }
    
    protected float lIIIlllIIIllIIIllIII() {
        return 0.0f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(double lIllllllIIllIlIlIlII, double llIIlllIIlllIIllIllI, double iIlllIIIlIlllIIlllII, final float n, final float n2) {
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII * lIllllllIIllIlIlIlII + llIIlllIIlllIIllIllI * llIIlllIIlllIIllIllI + iIlllIIIlIlllIIlllII * iIlllIIIlIlllIIlllII);
        lIllllllIIllIlIlIlII /= llllIIIIlIIIlIlllIll;
        llIIlllIIlllIIllIllI /= llllIIIIlIIIlIlllIll;
        iIlllIIIlIlllIIlllII /= llllIIIIlIIIlIlllIll;
        lIllllllIIllIlIlIlII += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.007499999832361937 * n2;
        llIIlllIIlllIIllIllI += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.007499999832361937 * n2;
        iIlllIIIlIlllIIlllII += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.007499999832361937 * n2;
        lIllllllIIllIlIlIlII *= n;
        llIIlllIIlllIIllIllI *= n;
        iIlllIIIlIlllIIlllII *= n;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        final float llllIIIIlIIIlIlllIll2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII * lIllllllIIllIlIlIlII + iIlllIIIlIlllIIlllII * iIlllIIIlIlllIIlllII);
        final float n3 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII, iIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
        this.IIlIIIIIllIlIIIlIIll = n3;
        this.IIIllllllIllIIIlllIl = n3;
        final float n4 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll2) * 180.0 / 3.141592653589793);
        this.llllllIllIllIlIllllI = n4;
        this.IlIIIlIIIllllIlIlIlI = n4;
        this.lIIIlllIIIllIIIllIII = 0;
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
        if (this.IlIlIlIlIlllllllllIl > 0) {
            --this.IlIlIlIlIlllllllllIl;
        }
        if (this.llllIIIIlIIIlIlllIll) {
            if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI)).llIllIIIIIllIlIIIIlI() == this.IllIIlllIIIIlllIIlIl) {
                ++this.lIIIlllIIIllIIIllIII;
                if (this.lIIIlllIIIllIIIllIII == 1200) {
                    this.IllIllIIIIlIIlIlllII();
                }
                return;
            }
            this.llllIIIIlIIIlIlllIll = false;
            this.lIllllllIIllIlIlIlII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
            this.llIIlllIIlllIIllIllI *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
            this.IIlllIIIlIlllIIlllII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f;
            this.lIIIlllIIIllIIIllIII = 0;
            this.llIIlIIIlIIIllIlIIIl = 0;
        }
        else {
            ++this.llIIlIIIlIIIllIlIIIl;
        }
        llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII), new e(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII));
        final e e = new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        e e2 = new e(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII);
        if (llllIIIIlIIIlIlllIll != null) {
            e2 = new e(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI);
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
            final List ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII).IlIlIlIlIlllllllllIl(1.0, 1.0, 1.0));
            double n = 0.0;
            final lllIIIIlllllIlIIllIl llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll();
            for (int i = 0; i < ilIlIlIlIlllllllllIl.size(); ++i) {
                final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl.get(i);
                if (llIllIIIIIllIlIIIIlI2.IIlllIIlllIIIlIlllII() && (llIllIIIIIllIlIIIIlI2 != llllIIllllIlIlIIIIll || this.llIIlIIIlIIIllIlIIIl >= 5)) {
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
        }
        if (llllIIIIlIIIlIlllIll != null) {
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl && this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.c) {
                this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
            }
            else {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            }
        }
        this.IIlllIlIIllIlIlIlIIl += this.lIllllllIIllIlIlIlII;
        this.llIIIlIlIllIIlIlIlII += this.llIIlllIIlllIIllIllI;
        this.lllllIlIIIlIlIIlllII += this.IIlllIIIlIlllIIlllII;
        final float llllIIIIlIIIlIlllIll3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
        this.IIlIIIIIllIlIIIlIIll = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.lIllllllIIllIlIlIlII, this.IIlllIIIlIlllIIlllII) * 180.0 / 3.141592653589793);
        this.llllllIllIllIlIllllI = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llIIlllIIlllIIllIllI, llllIIIIlIIIlIlllIll3) * 180.0 / 3.141592653589793);
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
        float n3 = 0.99f;
        final float llllIIIlIlllIlIIIIIl2 = this.llllIIIlIlllIlIIIIIl();
        if (this.llIIIlIlllIllIIlIllI()) {
            for (int j = 0; j < 4; ++j) {
                final float n4 = 0.25f;
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, this.IIlllIlIIllIlIlIlIIl - this.lIllllllIIllIlIlIlII * n4, this.llIIIlIlIllIIlIlIlII - this.llIIlllIIlllIIllIllI * n4, this.lllllIlIIIlIlIIlllII - this.IIlllIIIlIlllIIlllII * n4, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
            }
            n3 = 0.8f;
        }
        this.lIllllllIIllIlIlIlII *= n3;
        this.llIIlllIIlllIIllIllI *= n3;
        this.IIlllIIIlIlllIIlllII *= n3;
        this.llIIlllIIlllIIllIllI -= llllIIIlIlllIlIIIIIl2;
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
    }
    
    protected float llllIIIlIlllIlIIIIIl() {
        return 0.03f;
    }
    
    protected abstract void llllIIIIlIIIlIlllIll(final llIlllIlllllIIllIIII p0);
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("xTile", (short)this.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("yTile", (short)this.IlIIIlIlIIIllIlIlIIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("zTile", (short)this.IlIlIIIllIllIIIIIllI);
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inTile", (lIllllIllIllIIllllll == null) ? "" : lIllllIllIllIIllllll.toString());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("shake", (byte)this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("inGround", (byte)(this.llllIIIIlIIIlIlllIll ? 1 : 0));
        if ((this.lIIIIlIIIIIlllIllIII == null || this.lIIIIlIIIIIlllIllIII.length() == 0) && this.llllIIIlIlllIlIIIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            this.lIIIIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl.s_();
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ownerName", (this.lIIIIlIIIIIlllIllIII == null) ? "" : this.lIIIIlIIIIIlllIllIII);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("xTile");
        this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("yTile");
        this.IlIlIIIllIllIIIIIllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("zTile");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("inTile", 8)) {
            this.IllIIlllIIIIlllIIlIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("inTile"));
        }
        else {
            this.IllIIlllIIIIlllIIlIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inTile") & 0xFF);
        }
        this.IlIlIlIlIlllllllllIl = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("shake") & 0xFF);
        this.llllIIIIlIIIlIlllIll = (iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("inGround") == 1);
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("ownerName");
        if (this.lIIIIlIIIIIlllIllIII != null && this.lIIIIlIIIIIlllIllIII.length() == 0) {
            this.lIIIIlIIIIIlllIllIII = null;
        }
        this.llllIIIlIlllIlIIIIIl = this.llllIIllllIlIlIIIIll();
    }
    
    public lllIIIIlllllIlIIllIl llllIIllllIlIlIIIIll() {
        if (this.llllIIIlIlllIlIIIIIl == null && this.lIIIIlIIIIIlllIllIII != null && this.lIIIIlIIIIIlllIllIII.length() > 0) {
            this.llllIIIlIlllIlIIIIIl = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
            if (this.llllIIIlIlllIlIIIIIl == null && this.IlllllllIIIlIIIlIlII instanceof IIIllllllIllIIIlllIl) {
                try {
                    final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl = ((IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).IlIlIlIlIlllllllllIl(UUID.fromString(this.lIIIIlIIIIIlllIllIII));
                    if (ilIlIlIlIlllllllllIl instanceof lllIIIIlllllIlIIllIl) {
                        this.llllIIIlIlllIlIIIIIl = (lllIIIIlllllIlIIllIl)ilIlIlIlIlllllllllIl;
                    }
                }
                catch (Throwable t) {
                    this.llllIIIlIlllIlIIIIIl = null;
                }
            }
        }
        return this.llllIIIlIlllIlIIIIIl;
    }
}
