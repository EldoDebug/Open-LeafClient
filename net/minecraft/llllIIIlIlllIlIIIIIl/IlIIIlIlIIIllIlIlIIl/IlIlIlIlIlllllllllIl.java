package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIlIlIlIlllllllllIl extends llIllIIIIIllIlIIIIlI
{
    private boolean llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private double IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private double llllIIIlIlllIlIIIIIl;
    private double lIIIIlIIIIIlllIllIII;
    private double lIIIlllIIIllIIIllIII;
    private double llIIlIIIlIIIllIlIIIl;
    private double llIllIlIIIIllIlIIllI;
    
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = true;
        this.IlIlIlIlIlllllllllIl = 0.07;
        this.IlIlIIIIIIlllIlIllIl = true;
        this.llllIIIIlIIIlIlllIll(1.5f, 0.6f);
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    protected void a_() {
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17, new Integer(0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, new Integer(1));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(19, new Float(0.0f));
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI();
    }
    
    @Override
    public llllIIIIlIIIlIlllIll h_() {
        return this.IlIIlllIIlIlllllIIlI();
    }
    
    @Override
    public boolean g_() {
        return true;
    }
    
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double iIlIIIIlllIlllllIlII, final double iiIlIIlIIIIlllIlllII, final double ilIlIllllllllIIIIlII) {
        this(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl(iIlIIIIlllIlllllIlII, iiIlIIlIIIIlllIlllII, ilIlIllllllllIIIIlII);
        this.lIllllllIIllIlIlIlII = 0.0;
        this.llIIlllIIlllIIllIllI = 0.0;
        this.IIlllIIIlIlllIIlllII = 0.0;
        this.IIlIIIIlllIlllllIlII = iIlIIIIlllIlllllIlII;
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
    }
    
    @Override
    public double llIllIIlllllllllllll() {
        return -0.3;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII || this.IIlIlIlIIlIllIIIIIIl) {
            return true;
        }
        if (this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI == lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() && lIllllllIIllIlIlIlII instanceof IIlIIIIIllIlIIIlIIll) {
            return false;
        }
        this.IlIlIlIlIlllllllllIl(-this.lIIIlllIIIllIIIllIII());
        this.llllIIIIlIIIlIlllIll(10);
        this.IlIIIlIlIIIllIlIlIIl(this.llllIIIlIlllIlIIIIIl() + n * 10.0f);
        this.IIIllIIIlIlIIllIIIlI();
        final boolean b = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).K.IlIIIlIlIIIllIlIlIIl;
        if (b || this.llllIIIlIlllIlIIIIIl() > 40.0f) {
            if (this.IIllIIllIIIlIlIIIIlI != null) {
                this.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(this);
            }
            if (!b && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIlllIlllllIIllIIII, 1, 0.0f);
            }
            this.IllIllIIIIlIIlIlllII();
        }
        return true;
    }
    
    @Override
    public void lllllIIIIIlIIlllIlIl() {
        this.IlIlIlIlIlllllllllIl(-this.lIIIlllIIIllIIIllIII());
        this.llllIIIIlIIIlIlllIll(10);
        this.IlIIIlIlIIIllIlIlIIl(this.llllIIIlIlllIlIIIIIl() * 11.0f);
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return !this.IIlIlIlIIlIllIIIIIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl, final float iIlIIIIIllIlIIIlIIll, final float llllllIllIllIlIllllI, final int n, final boolean b) {
        if (b && this.IIllIIllIIIlIlIIIIlI != null) {
            this.IIlllIlIIllIlIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IIlIIIIlllIlllllIlII = ilIIIlIlIIIllIlIlIIl;
            this.llIIIlIlIllIIlIlIlII = ilIlIIIllIllIIIIIllI;
            this.IIIlIIlIIIIlllIlllII = ilIlIIIllIllIIIIIllI;
            this.lllllIlIIIlIlIIlllII = illIIlllIIIIlllIIlIl;
            this.IlIlIllllllllIIIIlII = illIIlllIIIIlllIIlIl;
            this.IIlIIIIIllIlIIIlIIll = iIlIIIIIllIlIIIlIIll;
            this.llllllIllIllIlIllllI = llllllIllIllIlIllllI;
            this.llIllIIIIIllIlIIIIlI = 0;
            this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl, ilIlIIIllIllIIIIIllI, illIIlllIIIIlllIIlIl);
            final double n2 = 0.0;
            this.lIIIlllIIIllIIIllIII = n2;
            this.lIllllllIIllIlIlIlII = n2;
            final double n3 = 0.0;
            this.llIIlIIIlIIIllIlIIIl = n3;
            this.llIIlllIIlllIIllIllI = n3;
            final double n4 = 0.0;
            this.llIllIlIIIIllIlIIllI = n4;
            this.IIlllIIIlIlllIIlllII = n4;
        }
        else {
            if (this.llllIIIIlIIIlIlllIll) {
                this.llIllIIIIIllIlIIIIlI = n + 5;
            }
            else {
                final double n5 = ilIIIlIlIIIllIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
                final double n6 = ilIlIIIllIllIIIIIllI - this.llIIIlIlIllIIlIlIlII;
                final double n7 = illIIlllIIIIlllIIlIl - this.lllllIlIIIlIlIIlllII;
                if (n5 * n5 + n6 * n6 + n7 * n7 <= 1.0) {
                    return;
                }
                this.llIllIIIIIllIlIIIIlI = 3;
            }
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = iIlIIIIIllIlIIIlIIll;
            this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI;
            this.lIllllllIIllIlIlIlII = this.lIIIlllIIIllIIIllIII;
            this.llIIlllIIlllIIllIllI = this.llIIlIIIlIIIllIlIIIl;
            this.IIlllIIIlIlllIIlllII = this.llIllIlIIIIllIlIIllI;
        }
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(final double n, final double n2, final double n3) {
        this.lIllllllIIllIlIlIlII = n;
        this.lIIIlllIIIllIIIllIII = n;
        this.llIIlllIIlllIIllIllI = n2;
        this.llIIlIIIlIIIllIlIIIl = n2;
        this.IIlllIIIlIlllIIlllII = n3;
        this.llIllIlIIIIllIlIIllI = n3;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.lIIIIlIIIIIlllIllIII() > 0) {
            this.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII() - 1);
        }
        if (this.llllIIIlIlllIlIIIIIl() > 0.0f) {
            this.IlIIIlIlIIIllIlIlIIl(this.llllIIIlIlllIlIIIIIl() - 1.0f);
        }
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        final int n = 5;
        double n2 = 0.0;
        for (int i = 0; i < n; ++i) {
            if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + (this.IlIIlllIIlIlllllIIlI().IlIlIIIllIllIIIIIllI - this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) * (i + 0) / n - 0.125, this.IlIIlllIIlIlllllIIlI().llIllIIIIIllIlIIIIlI, this.IlIIlllIIlIlllllIIlI().IlIIIlIlIIIllIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + (this.IlIIlllIIlIlllllIIlI().IlIlIIIllIllIIIIIllI - this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) * (i + 1) / n - 0.125, this.IlIIlllIIlIlllllIIlI().IllIIlllIIIIlllIIlIl), net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII)) {
                n2 += 1.0 / n;
            }
        }
        final double sqrt = Math.sqrt(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
        if (sqrt > 0.2975) {
            final double cos = Math.cos(this.IIlIIIIIllIlIIIlIIll * 3.141592653589793 / 180.0);
            final double sin = Math.sin(this.IIlIIIIIllIlIIIlIIll * 3.141592653589793 / 180.0);
            for (int n3 = 0; n3 < 1.0 + sqrt * 60.0; ++n3) {
                final double n4 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f - 1.0f;
                final double n5 = (this.IlIIllIIllIIllIIlIIl.nextInt(2) * 2 - 1) * 0.7;
                if (this.IlIIllIIllIIllIIlIIl.nextBoolean()) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl, this.IIlllIlIIllIlIlIlIIl - cos * n4 * 0.8 + sin * n5, this.llIIIlIlIllIIlIlIlII - 0.125, this.lllllIlIIIlIlIIlllII - sin * n4 * 0.8 - cos * n5, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
                }
                else {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl, this.IIlllIlIIllIlIlIlIIl + cos + sin * n4 * 0.7, this.llIIIlIlIllIIlIlIlII - 0.125, this.lllllIlIIIlIlIIlllII + sin - cos * n4 * 0.7, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
                }
            }
        }
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.llllIIIIlIIIlIlllIll) {
            if (this.llIllIIIIIllIlIIIIlI > 0) {
                final double n6 = this.IIlllIlIIllIlIlIlIIl + (this.IlIIIlIlIIIllIlIlIIl - this.IIlllIlIIllIlIlIlIIl) / this.llIllIIIIIllIlIIIIlI;
                final double n7 = this.llIIIlIlIllIIlIlIlII + (this.IlIlIIIllIllIIIIIllI - this.llIIIlIlIllIIlIlIlII) / this.llIllIIIIIllIlIIIIlI;
                final double n8 = this.lllllIlIIIlIlIIlllII + (this.IllIIlllIIIIlllIIlIl - this.lllllIlIIIlIlIIlllII) / this.llIllIIIIIllIlIIIIlI;
                this.IIlIIIIIllIlIIIlIIll += (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.llllIIIlIlllIlIIIIIl - this.IIlIIIIIllIlIIIlIIll) / this.llIllIIIIIllIlIIIIlI);
                this.llllllIllIllIlIllllI += (float)((this.lIIIIlIIIIIlllIllIII - this.llllllIllIllIlIllllI) / this.llIllIIIIIllIlIIIIlI);
                --this.llIllIIIIIllIlIIIIlI;
                this.IlIlIlIlIlllllllllIl(n6, n7, n8);
                this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            }
            else {
                this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + this.lIllllllIIllIlIlIlII, this.llIIIlIlIllIIlIlIlII + this.llIIlllIIlllIIllIllI, this.lllllIlIIIlIlIIlllII + this.IIlllIIIlIlllIIlllII);
                if (this.IIIIIllIIIIlIIIIllIl) {
                    this.lIllllllIIllIlIlIlII *= 0.5;
                    this.llIIlllIIlllIIllIllI *= 0.5;
                    this.IIlllIIIlIlllIIlllII *= 0.5;
                }
                this.lIllllllIIllIlIlIlII *= 0.9900000095367432;
                this.llIIlllIIlllIIllIllI *= 0.949999988079071;
                this.IIlllIIIlIlllIIlllII *= 0.9900000095367432;
            }
        }
        else {
            if (n2 < 1.0) {
                this.llIIlllIIlllIIllIllI += 0.03999999910593033 * (n2 * 2.0 - 1.0);
            }
            else {
                if (this.llIIlllIIlllIIllIllI < 0.0) {
                    this.llIIlllIIlllIIllIllI /= 2.0;
                }
                this.llIIlllIIlllIIllIllI += 0.007000000216066837;
            }
            if (this.IIllIIllIIIlIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)this.IIllIIllIIIlIlIIIIlI;
                final float n9 = this.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll + -lllIIIIlllllIlIIllIl.k * 90.0f;
                this.lIllllllIIllIlIlIlII += -Math.sin(n9 * 3.1415927f / 180.0f) * this.IlIlIlIlIlllllllllIl * lllIIIIlllllIlIIllIl.l * 0.05000000074505806;
                this.IIlllIIIlIlllIIlllII += Math.cos(n9 * 3.1415927f / 180.0f) * this.IlIlIlIlIlllllllllIl * lllIIIIlllllIlIIllIl.l * 0.05000000074505806;
            }
            double sqrt2 = Math.sqrt(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
            if (sqrt2 > 0.35) {
                final double n10 = 0.35 / sqrt2;
                this.lIllllllIIllIlIlIlII *= n10;
                this.IIlllIIIlIlllIIlllII *= n10;
                sqrt2 = 0.35;
            }
            if (sqrt2 > sqrt && this.IlIlIlIlIlllllllllIl < 0.35) {
                this.IlIlIlIlIlllllllllIl += (0.35 - this.IlIlIlIlIlllllllllIl) / 35.0;
                if (this.IlIlIlIlIlllllllllIl > 0.35) {
                    this.IlIlIlIlIlllllllllIl = 0.35;
                }
            }
            else {
                this.IlIlIlIlIlllllllllIl -= (this.IlIlIlIlIlllllllllIl - 0.07) / 35.0;
                if (this.IlIlIlIlIlllllllllIl < 0.07) {
                    this.IlIlIlIlIlllllllllIl = 0.07;
                }
            }
            for (int j = 0; j < 4; ++j) {
                final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl + (j % 2 - 0.5) * 0.8);
                final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII + (j / 2 - 0.5) * 0.8);
                for (int k = 0; k < 2; ++k) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII) + k, llIllIIIIIllIlIIIIlI2);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
                    if (llIllIIIIIllIlIIIIlI3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI) {
                        this.IlllllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
                        this.IIIIIIIIIlllIllIlIlI = false;
                    }
                    else if (llIllIIIIIllIlIIIIlI3 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.B) {
                        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, true);
                        this.IIIIIIIIIlllIllIlIlI = false;
                    }
                }
            }
            if (this.IIIIIllIIIIlIIIIllIl) {
                this.lIllllllIIllIlIlIlII *= 0.5;
                this.llIIlllIIlllIIllIllI *= 0.5;
                this.IIlllIIIlIlllIIlllII *= 0.5;
            }
            this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
            if (this.IIIIIIIIIlllIllIlIlI && sqrt > 0.2975) {
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IIlIlIlIIlIllIIIIIIl) {
                    this.IllIllIIIIlIIlIlllII();
                    if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
                        for (int l = 0; l < 3; ++l) {
                            this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl), 1, 0.0f);
                        }
                        for (int n11 = 0; n11 < 2; ++n11) {
                            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII, 1, 0.0f);
                        }
                    }
                }
            }
            else {
                this.lIllllllIIllIlIlIlII *= 0.9900000095367432;
                this.llIIlllIIlllIIllIllI *= 0.949999988079071;
                this.IIlllIIIlIlllIIlllII *= 0.9900000095367432;
            }
            this.llllllIllIllIlIllllI = 0.0f;
            double n12 = this.IIlIIIIIllIlIIIlIIll;
            final double n13 = this.IIlIIIIlllIlllllIlII - this.IIlllIlIIllIlIlIlIIl;
            final double n14 = this.IlIlIllllllllIIIIlII - this.lllllIlIIIlIlIIlllII;
            if (n13 * n13 + n14 * n14 > 0.001) {
                n12 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n14, n13) * 180.0 / 3.141592653589793);
            }
            double llllIIIlIlllIlIIIIIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n12 - this.IIlIIIIIllIlIIIlIIll);
            if (llllIIIlIlllIlIIIIIl > 20.0) {
                llllIIIlIlllIlIIIIIl = 20.0;
            }
            if (llllIIIlIlllIlIIIIIl < -20.0) {
                llllIIIlIlllIlIIIIIl = -20.0;
            }
            this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll += (float)llllIIIlIlllIlIIIIIl, this.llllllIllIllIlIllllI);
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                final List ilIlIlIlIlllllllllIl2 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(0.20000000298023224, 0.0, 0.20000000298023224));
                if (ilIlIlIlIlllllllllIl2 != null && !ilIlIlIlIlllllllllIl2.isEmpty()) {
                    for (int n15 = 0; n15 < ilIlIlIlIlllllllllIl2.size(); ++n15) {
                        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI4 = ilIlIlIlIlllllllllIl2.get(n15);
                        if (llIllIIIIIllIlIIIIlI4 != this.IIllIIllIIIlIlIIIIlI && llIllIIIIIllIlIIIIlI4.g_() && llIllIIIIIllIlIIIIlI4 instanceof IlIlIlIlIlllllllllIl) {
                            llIllIIIIIllIlIIIIlI4.IllIIlllIIIIlllIIlIl(this);
                        }
                    }
                }
                if (this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI.IIlIlIlIIlIllIIIIIIl) {
                    this.IIllIIllIIIlIlIIIIlI = null;
                }
            }
        }
    }
    
    @Override
    public void IllIlIllIllIlllIIlll() {
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + Math.cos(this.IIlIIIIIllIlIIIlIIll * 3.141592653589793 / 180.0) * 0.4, this.llIIIlIlIllIIlIlIlII + this.llIllIIlllllllllllll() + this.IIllIIllIIIlIlIIIIlI.IIllIIIlIIlIlIlIIIII(), this.lllllIlIIIlIlIIlllII + Math.sin(this.IIlIIIIIllIlIIIlIIll * 3.141592653589793 / 180.0) * 0.4);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    public boolean a_(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && this.IIllIIllIIIlIlIIIIlI != llllIIIIlIIIlIlllIll) {
            return true;
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
        }
        return true;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final double n, final boolean b, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (b) {
            if (this.IllIlIIllIllIIlIllII > 3.0f) {
                this.IlIIIlIlIIIllIlIlIIl(this.IllIlIIllIllIIlIllII, 1.0f);
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IIlIlIlIIlIllIIIIIIl) {
                    this.IllIllIIIIlIIlIlllII();
                    if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
                        for (int i = 0; i < 3; ++i) {
                            this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl), 1, 0.0f);
                        }
                        for (int j = 0; j < 2; ++j) {
                            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIIlIIlIIIIlllIlllII, 1, 0.0f);
                        }
                    }
                }
                this.IllIlIIllIllIIlIllII = 0.0f;
            }
        }
        else if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this).IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII && n < 0.0) {
            this.IllIlIIllIllIIlIllII -= (float)n;
        }
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final float n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(19, n);
    }
    
    public float llllIIIlIlllIlIIIIIl() {
        return this.IIlllIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl(19);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(17, n);
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(17);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, n);
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(18);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
}
