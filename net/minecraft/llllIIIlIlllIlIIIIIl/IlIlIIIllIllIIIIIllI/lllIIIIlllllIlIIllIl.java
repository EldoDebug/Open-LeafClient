package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lllIIIIlllllIlIIllIl extends IIlllIlIIllIlIlIlIIl
{
    private float llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private float t;
    private float u;
    private net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl v;
    private int w;
    private boolean x;
    private IlIIllIIllIIllIIlIIl y;
    
    public lllIIIIlllllIlIIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIlIlllIlIIIIIl = 10;
        this.llllIIIIlIIIlIlllIll(0.85f, 0.85f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IIllIIllIIIlIlIIIIlI(this));
        final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI;
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, this.y = new IlIIllIIllIIllIIlIIl(this, 1.0, 80));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new lllllIIIIIlIlIIIIIIl(this, lllIIIIlllllIlIIllIl.class, 12.0f, 0.01f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(9, new IlIlIllllllllIIIIlII(this));
        this.y.llllIIIIlIIIlIlllIll(3);
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll(3);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl.class, 10, true, false, (Predicate)new IlIlIIIlIIlIlIIlllIl(this)));
        this.lIIIIlIIIIIlllIllIII = new IIIlIIIlIlIIlllIIlll(this);
        final float nextFloat = this.IlIIllIIllIIllIIlIIl.nextFloat();
        this.llllIIIIlIIIlIlllIll = nextFloat;
        this.IlIlIlIlIlllllllllIl = nextFloat;
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(6.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.5);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(16.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(30.0);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Elder"));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Elder", this.ap());
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return new llllIIIlIlllIlIIIIIl(this, illlllllIIIlIIIlIlII);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17, (Object)0);
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int n) {
        return (this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(16) & n) != 0x0;
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final boolean b) {
        final int llIllIIIIIllIlIIIIlI = this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, llIllIIIIIllIlIIIIlI | n);
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, llIllIIIIIllIlIIIIlI & ~n);
        }
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll(2);
    }
    
    private void lIlIlIIIllIIllIIIllI(final boolean b) {
        this.IlIlIlIlIlllllllllIl(2, b);
    }
    
    public int ao() {
        return this.ap() ? 60 : 80;
    }
    
    public boolean ap() {
        return this.llllIIIIlIIIlIlllIll(4);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IlIlIlIlIlllllllllIl(4, b);
        if (b) {
            this.llllIIIIlIIIlIlllIll(1.9975f, 1.9975f);
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.30000001192092896);
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(8.0);
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(80.0);
            this.p();
            this.y.IlIlIlIlIlllllllllIl(400);
        }
    }
    
    public void aq() {
        this.llllIIIIlIIIlIlllIll(true);
        final float n = 1.0f;
        this.t = n;
        this.u = n;
    }
    
    private void IlIlIlIlIlllllllllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(17, n);
    }
    
    public boolean ar() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(17) != 0;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl as() {
        if (!this.ar()) {
            return null;
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return this.IIlllIIIlIlllIIlllII();
        }
        if (this.v != null) {
            return this.v;
        }
        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(17));
        if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl) {
            return this.v = (net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll;
        }
        return null;
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl(final int n) {
        super.llIIlIIIlIIIllIlIIIl(n);
        if (n == 16) {
            if (this.ap() && this.IllIllIIIIlIIlIlllII < 1.0f) {
                this.llllIIIIlIIIlIlllIll(1.9975f, 1.9975f);
            }
        }
        else if (n == 17) {
            this.w = 0;
            this.v = null;
        }
    }
    
    @Override
    public int IIIllllllIllIIIlllIl() {
        return 160;
    }
    
    @Override
    protected String e() {
        return this.llIIIlIlllIllIIlIllI() ? (this.ap() ? "mob.guardian.elder.idle" : "mob.guardian.idle") : "mob.guardian.land.idle";
    }
    
    @Override
    protected String O() {
        return this.llIIIlIlllIllIIlIllI() ? (this.ap() ? "mob.guardian.elder.hit" : "mob.guardian.hit") : "mob.guardian.land.hit";
    }
    
    @Override
    protected String P() {
        return this.llIIIlIlllIllIIlIllI() ? (this.ap() ? "mob.guardian.elder.death" : "mob.guardian.death") : "mob.guardian.land.death";
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return this.IlIllllIIlIIlIlIlIll * 0.5f;
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) ? (10.0f + this.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII(ilIlIlIlIlllllllllIl) - 0.5f) : super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll;
            if (!this.llIIIlIlllIllIIlIllI()) {
                this.llIllIIIIIllIlIIIIlI = 2.0f;
                if (this.llIIlllIIlllIIllIllI > 0.0 && this.x && !this.lIlIlIlllIIlIlIlllIl()) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, "mob.guardian.flop", 1.0f, 1.0f, false);
                }
                this.x = (this.llIIlllIIlllIIllIllI < 0.0 && this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(new IlIlIlIlIlllllllllIl(this).IlIlIlIlIlllllllllIl(), false));
            }
            else if (this.lIIIIlIIIIIlllIllIII()) {
                if (this.llIllIIIIIllIlIIIIlI < 0.5f) {
                    this.llIllIIIIIllIlIIIIlI = 4.0f;
                }
                else {
                    this.llIllIIIIIllIlIIIIlI += (0.5f - this.llIllIIIIIllIlIIIIlI) * 0.1f;
                }
            }
            else {
                this.llIllIIIIIllIlIIIIlI += (0.125f - this.llIllIIIIIllIlIIIIlI) * 0.2f;
            }
            this.llllIIIIlIIIlIlllIll += this.llIllIIIIIllIlIIIIlI;
            this.u = this.t;
            if (!this.llIIIlIlllIllIIlIllI()) {
                this.t = this.IlIIllIIllIIllIIlIIl.nextFloat();
            }
            else if (this.lIIIIlIIIIIlllIllIII()) {
                this.t += (0.0f - this.t) * 0.25f;
            }
            else {
                this.t += (1.0f - this.t) * 0.06f;
            }
            if (this.lIIIIlIIIIIlllIllIII() && this.llIIIlIlllIllIIlIllI()) {
                final e llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(0.0f);
                for (int i = 0; i < 2; ++i) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII - llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll * 1.5, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextDouble() * this.IlIllllIIlIIlIlIlIll - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * 1.5, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII - llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * 1.5, 0.0, 0.0, 0.0, new int[0]);
                }
            }
            if (this.ar()) {
                if (this.w < this.ao()) {
                    ++this.w;
                }
                final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl as = this.as();
                if (as != null) {
                    this.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(as, 90.0f, 90.0f);
                    this.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll();
                    final double n = this.IlIllIlIlIIIlIlIlIII(0.0f);
                    final double n2 = as.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
                    final double n3 = as.llIIIlIlIllIIlIlIlII + as.IlIllllIIlIIlIlIlIll * 0.5f - (this.llIIIlIlIllIIlIlIlII + this.llllIlIllllIIlIIlIlI());
                    final double n4 = as.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII;
                    final double sqrt = Math.sqrt(n2 * n2 + n3 * n3 + n4 * n4);
                    final double n5 = n2 / sqrt;
                    final double n6 = n3 / sqrt;
                    final double n7 = n4 / sqrt;
                    double nextDouble = this.IlIIllIIllIIllIIlIIl.nextDouble();
                    while (nextDouble < sqrt) {
                        nextDouble += 1.8 - n + this.IlIIllIIllIIllIIlIIl.nextDouble() * (1.7 - n);
                        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, this.IIlllIlIIllIlIlIlIIl + n5 * nextDouble, this.llIIIlIlIllIIlIlIlII + n6 * nextDouble + this.llllIlIllllIIlIIlIlI(), this.lllllIlIIIlIlIIlllII + n7 * nextDouble, 0.0, 0.0, 0.0, new int[0]);
                    }
                }
            }
        }
        if (this.lIllIIIIIlllIIlIIllI) {
            this.lIIIIlIIIIIlllIllIII(300);
        }
        else if (this.IIIIIllIIIIlIIIIllIl) {
            this.llIIlllIIlllIIllIllI += 0.5;
            this.lIllllllIIllIlIlIlII += (this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f - 1.0f) * 0.4f;
            this.IIlllIIIlIlllIIlllII += (this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f - 1.0f) * 0.4f;
            this.IIlIIIIIllIlIIIlIIll = this.IlIIllIIllIIllIIlIIl.nextFloat() * 360.0f;
            this.IIIIIllIIIIlIIIIllIl = false;
            this.llIllIIlllllllllllll = true;
        }
        if (this.ar()) {
            this.IIlIIIIIllIlIIIlIIll = this.lIIlllIlllllIIlllIll;
        }
        super.IIIlIIIlIlIIlllIIlll();
    }
    
    public float IlIIIlIlIIIllIlIlIIl(final float n) {
        return this.IlIlIlIlIlllllllllIl + (this.llllIIIIlIIIlIlllIll - this.IlIlIlIlIlllllllllIl) * n;
    }
    
    public float llllIIllllIlIlIIIIll(final float n) {
        return this.u + (this.t - this.u) * n;
    }
    
    public float IlIllIlIlIIIlIlIlIII(final float n) {
        return (this.w + n) / this.ao();
    }
    
    @Override
    protected void i() {
        super.i();
        if (this.ap()) {
            if ((this.lllllIIIIIlIlIIIIIIl + this.IlllIIIIlIIIlIlIlIIl()) % 1200 == 0) {
                final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl;
                for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.class, (Predicate)new IlIlIIIIIIlllIlIllIl(this))) {
                    if (!ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl) || ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI() < 2 || ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).IlIlIlIlIlllllllllIl() < 1200) {
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIIlIlIIIlIIlIlIlII(10, 0.0f));
                        ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(new net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(illIIlllIIIIlllIIlIl.llllllIllIllIlIllllI, 6000, 2));
                    }
                }
            }
            if (!this.IlllllllIIIlIIIlIlII()) {
                this.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(this), 16);
            }
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        final int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(3) + this.IlIIllIIllIIllIIlIIl.nextInt(n + 1);
        if (n2 > 0) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aG, n2, 0), 1.0f);
        }
        if (this.IlIIllIIllIIllIIlIIl.nextInt(3 + n) > 1) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, 1, net.minecraft.llIllIlIIIIllIlIIllI.IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()), 1.0f);
        }
        else if (this.IlIIllIIllIIllIIlIIl.nextInt(3 + n) > 1) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aH, 1, 0), 1.0f);
        }
        if (b && this.ap()) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl, 1, 1), 1.0f);
        }
    }
    
    @Override
    protected void Q() {
        this.llllIIIIlIIIlIlllIll(((l)net.minecraft.IlllllllIIIlIIIlIlII.i.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl())).llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl), 1.0f);
    }
    
    @Override
    protected boolean t_() {
        return true;
    }
    
    @Override
    public boolean k() {
        return this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI(), this) && this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIIlllIIlIlllllIIlI()).isEmpty();
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return (this.IlIIllIIllIIllIIlIIl.nextInt(20) == 0 || !this.IlllllllIIIlIIIlIlII.llIllIlIIIIllIlIIllI(new IlIlIlIlIlllllllllIl(this))) && super.lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (!this.lIIIIlIIIIIlllIllIII() && !lIllllllIIllIlIlIlII.IlIlIIIIIIlllIlIllIl() && lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (net.minecraft.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl)lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII();
            if (!lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI()) {
                lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this), 2.0f);
                lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll("damage.thorns", 0.5f, 1.0f);
            }
        }
        this.y.lIIIIlIIIIIlllIllIII();
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public int j() {
        return 180;
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final float n, final float n2) {
        if (this.llllllIllIllIlIllllI()) {
            if (this.llIIIlIlllIllIIlIllI()) {
                this.IlIlIlIlIlllllllllIl(n, n2, 0.1f);
                this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
                this.lIllllllIIllIlIlIlII *= 0.8999999761581421;
                this.llIIlllIIlllIIllIllI *= 0.8999999761581421;
                this.IIlllIIIlIlllIIlllII *= 0.8999999761581421;
                if (!this.lIIIIlIIIIIlllIllIII() && this.IIlllIIIlIlllIIlllII() == null) {
                    this.llIIlllIIlllIIllIllI -= 0.005;
                }
            }
            else {
                super.IllIIlllIIIIlllIIlIl(n, n2);
            }
        }
        else {
            super.IllIIlllIIIIlllIIlIl(n, n2);
        }
    }
}
