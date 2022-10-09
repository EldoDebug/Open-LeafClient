package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIlIlIIIllIIllIIIllI extends IlIlIlIlIlllllllllIl
{
    private IlIlIIIllIIllIlllllI u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;
    private IIlllIIlIllIllIlIIll A;
    private int B;
    private llllIIIIlIIIlIlllIll C;
    
    public lIlIlIIIllIIllIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.v = 0;
        this.w = 0;
        this.x = false;
        this.y = false;
        this.z = 0;
        this.A = net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl;
        this.B = 0;
        this.C = null;
        this.llllIIIIlIIIlIlllIll(0.6f, 0.7f);
        this.lIIIlllIIIllIIIllIII = new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl(this, this);
        this.lIIIIlIIIIIlllIllIII = new IlIlIIIIIIlllIlIllIl(this);
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
        this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(2.5f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llllIIllllIlIlIIIIll(this, 1.33));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new lIlIlIlllIIlIlIlllIl(this, 1.0, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new lIlIlIlllIIlIlIlllIl(this, 1.0, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aa, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new lIlIlIlllIIlIlIlllIl(this, 1.0, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl), false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new IIlllIlIIllIlIlIlIIl(this, 0.8));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIllIlIlIIIlIlIlIII(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IlIIllIIllIIllIIlIIl(this, 0.6));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(11, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 10.0f));
        this.u = new IlIlIIIllIIllIlllllI(this, IIIllllllIllIIIlllIl.class, 16.0f, 1.33, 1.33);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, this.u);
        this.IlIlIlIlIlllllllllIl(0.0);
    }
    
    @Override
    protected float ac() {
        return (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() && this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI() > this.llIIIlIlIllIIlIlIlII + 0.5) ? 0.5f : this.A.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll a) {
        this.A = a;
    }
    
    public float llllIIllllIlIlIIIIll(final float n) {
        return (this.w == 0) ? 0.0f : ((this.v + n) / this.w);
    }
    
    public void IlIlIlIlIlllllllllIl(final double n) {
        this.lIllllllIIllIlIlIlII().llllIIIIlIIIlIlllIll(n);
        this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(), this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(), this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl(), n);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean x, final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        super.llIllIlIIIIllIlIIllI(x);
        if (!x) {
            if (this.A == net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI) {
                this.A = net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl;
            }
        }
        else {
            this.IlIlIlIlIlllllllllIl(1.5 * illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll());
            this.llllIIIIlIIIlIlllIll(this.ar(), this.Z(), ((this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
        this.x = x;
    }
    
    public void IlIlIlIlIlllllllllIl(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        this.llllIIIIlIIIlIlllIll(true, illlIIlIllIllIlIIll);
        this.w = illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl();
        this.v = 0;
    }
    
    public boolean aq() {
        return this.x;
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, (Object)0);
    }
    
    public void i() {
        if (this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl() > 0.8) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl);
        }
        else if (this.A != net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl);
        }
        if (this.z > 0) {
            --this.z;
        }
        if (this.B > 0) {
            this.B -= this.IlIIllIIllIIllIIlIIl.nextInt(3);
            if (this.B < 0) {
                this.B = 0;
            }
        }
        if (this.IIIIIllIIIIlIIIIllIl) {
            if (!this.y) {
                this.llllIIIIlIIIlIlllIll(false, net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
                this.ay();
            }
            if (this.as() == 99 && this.z == 0) {
                final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IIlllIIIlIlllIIlllII();
                if (iIlllIIIlIlllIIlllII != null && this.IlIlIIIllIllIIIIIllI(iIlllIIIlIlllIIlllII) < 16.0) {
                    this.llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl, iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII);
                    this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII.IIlllIlIIllIlIlIlIIl, iIlllIIIlIlllIIlllII.llIIIlIlIllIIlIlIlII, iIlllIIIlIlllIIlllII.lllllIlIIIlIlIIlllII, this.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl());
                    this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIlllIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI);
                    this.y = true;
                }
            }
            final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl)this.lIIIlllIIIllIIIllIII;
            if (!lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI()) {
                if (this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() && this.z == 0) {
                    final net.minecraft.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
                    e llllIIIIlIIIlIlllIll = new e(this.lIIIIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl(), this.lIIIIlIIIIIlllIllIII.IlIlIIIllIllIIIIIllI(), this.lIIIIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl());
                    if (llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() < llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl()) {
                        llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this);
                    }
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
                    this.IlIlIlIlIlllllllllIl(this.A);
                }
            }
            else if (!lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl()) {
                this.av();
            }
        }
        this.y = this.IIIIIllIIIIlIIIIllIl;
    }
    
    @Override
    public void IllIIlllllIIllIIllIl() {
    }
    
    private void llllIIIIlIIIlIlllIll(final double n, final double n2) {
        this.IIlIIIIIllIlIIIlIIll = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2 - this.lllllIlIIIlIlIIlllII, n - this.IIlllIlIIllIlIlIlIIl) * 180.0 / 3.141592653589793) - 90.0f;
    }
    
    private void av() {
        ((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl)this.lIIIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(true);
    }
    
    private void aw() {
        ((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl)this.lIIIlllIIIllIIIllIII).llllIIIIlIIIlIlllIll(false);
    }
    
    private void ax() {
        this.z = this.at();
    }
    
    private void ay() {
        this.ax();
        this.aw();
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        if (this.v != this.w) {
            if (this.v == 0 && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)1);
            }
            ++this.v;
        }
        else if (this.w != 0) {
            this.v = 0;
            this.w = 0;
        }
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(10.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.30000001192092896);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("RabbitType", this.as());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("MoreCarrotTicks", this.B);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lllIIIIlllllIlIIllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("RabbitType"));
        this.B = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("MoreCarrotTicks");
    }
    
    protected String ar() {
        return "mob.rabbit.hop";
    }
    
    @Override
    protected String e() {
        return "mob.rabbit.idle";
    }
    
    @Override
    protected String O() {
        return "mob.rabbit.hurt";
    }
    
    @Override
    protected String P() {
        return "mob.rabbit.death";
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.as() == 99) {
            this.llllIIIIlIIIlIlllIll("mob.attack", 1.0f, (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
            return llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), 8.0f);
        }
        return llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), 3.0f);
    }
    
    @Override
    public int R() {
        return (this.as() == 99) ? 8 : super.R();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        return !this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII) && super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    protected void Q() {
        this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.v, 1), 0.0f);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        for (int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(2) + this.IlIIllIIllIIllIIlIIl.nextInt(1 + n), i = 0; i < n2; ++i) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.w, 1);
        }
        for (int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(2), j = 0; j < nextInt; ++j) {
            if (this.lIIIIIlIlIIIlIIIIlIl()) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.t, 1);
            }
            else {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.s, 1);
            }
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V || ilIIIlIlIIIllIlIlIIl == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aa || ilIIIlIlIIIllIlIlIIl == net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl);
    }
    
    public lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = new lIlIlIIIllIIllIIIllI(this.IlllllllIIIlIIIlIlII);
        if (liiiIlIIIIIlllIllIII instanceof lIlIlIIIllIIllIIIllI) {
            lIlIlIIIllIIllIIIllI.lllIIIIlllllIlIIllIl(this.IlIIllIIllIIllIIlIIl.nextBoolean() ? this.as() : ((lIlIlIIIllIIllIIIllI)liiiIlIIIIIlllIllIII).as());
        }
        return lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll());
    }
    
    public int as() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18);
    }
    
    public void lllIIIIlllllIlIIllIl(final int n) {
        if (n == 99) {
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.u);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll(this));
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, false, new Class[0]));
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, llllIIIIlIIIlIlllIll.class, true));
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, IIIllllllIllIIIlllIl.class, true));
            if (!this.w_()) {
                this.IlIIIlIlIIIllIlIlIIl(net.minecraft.IlllllllIIIlIIIlIlII.lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("entity.KillerBunny.name"));
            }
        }
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, (byte)n);
    }
    
    @Override
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        int n = this.IlIIllIIllIIllIIlIIl.nextInt(6);
        boolean b = false;
        if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIllIIllIIIlIlIIIIlI) {
            n = ((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIllIIllIIIlIlIIIIlI)llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll;
            b = true;
        }
        else {
            llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIllIIllIIIlIlIIIIlI(n);
        }
        this.lllIIIIlllllIlIIllIl(n);
        if (b) {
            this.IlIlIlIlIlllllllllIl(-24000);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private boolean az() {
        return this.B == 0;
    }
    
    protected int at() {
        return this.A.llIllIIIIIllIlIIIIlI();
    }
    
    protected void au() {
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIllllIIIlIIIIIIllIl, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + 0.5 + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, 0.0, 0.0, 0.0, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.af.llIllIIIIIllIlIIIIlI(7)));
        this.B = 100;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 1) {
            this.lIllIIIIIlllIIlIIllI();
            this.w = 10;
            this.v = 0;
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
}
