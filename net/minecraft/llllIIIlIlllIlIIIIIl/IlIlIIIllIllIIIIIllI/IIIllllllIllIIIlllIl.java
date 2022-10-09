package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIllllllIllIIIlllIl extends IlIllIlIlIIIlIlIlIII implements IllIlIIllIllIIlIllII
{
    public float llllIIIIlIIIlIlllIll;
    public float IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    public IIIllllllIllIIIlllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.lIIIIlIIIIIlllIllIII = new IlllIIIIlIIIlIlIlIIl(this);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new IIIIIIIIIlllIllIlIlI(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IlIIIlIIIllllIlIlIlI(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IIIIIllIIIIlIIIIllIl(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IIllllIIIlIIIIIIllIl(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new llllIIllllIlIlIIIIll(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(3, new IlIlIIIllIIllIlllllI(this, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class));
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)1);
    }
    
    protected void llllIIIIlIIIlIlllIll(final int llllIIIlIlllIlIIIIIl) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)llllIIIlIlllIlIIIIIl);
        this.llllIIIIlIIIlIlllIll(0.51000005f * llllIIIlIlllIlIIIIIl, 0.51000005f * llllIIIlIlllIlIIIIIl);
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll((double)(llllIIIlIlllIlIIIIIl * llllIIIlIlllIlIIIIIl));
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.2f + 0.1f * llllIIIlIlllIlIIIIIl);
        this.llIllIlIIIIllIlIIllI(this.U());
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public int ao() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Size", this.ao() - 1);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("wasOnGround", this.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        int illIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Size");
        if (illIIlllIIIIlllIIlIl < 0) {
            illIIlllIIIIlllIIlIl = 0;
        }
        this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl + 1);
        this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("wasOnGround");
    }
    
    protected IlIllllIIlIIlIlIlIll lIIIIlIIIIIlllIllIII() {
        return net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllllIllIllIlIllllI;
    }
    
    protected String IlllllllIIIlIIIlIlII() {
        return "mob.slime." + ((this.ao() > 1) ? "big" : "small");
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll && this.ao() > 0) {
            this.IIlIlIlIIlIllIIIIIIl = true;
        }
        this.IlIlIlIlIlllllllllIl += (this.llllIIIIlIIIlIlllIll - this.IlIlIlIlIlllllllllIl) * 0.5f;
        this.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl;
        super.IIllIIllIIIlIlIIIIlI();
        if (this.IIIIIllIIIIlIIIIllIl && !this.IlIIIlIlIIIllIlIlIIl) {
            for (int ao = this.ao(), i = 0; i < ao * 8; ++i) {
                final float n = this.IlIIllIIllIIllIIlIIl.nextFloat() * 3.1415927f * 2.0f;
                final float n2 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.5f + 0.5f;
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII(), this.IIlllIlIIllIlIlIlIIl + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n) * ao * 0.5f * n2, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.lllllIlIIIlIlIIlllII + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n) * ao * 0.5f * n2, 0.0, 0.0, 0.0, new int[0]);
            }
            if (this.an()) {
                this.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII(), this.Z(), ((this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f) / 0.8f);
            }
            this.llllIIIIlIIIlIlllIll = -0.5f;
        }
        else if (!this.IIIIIllIIIIlIIIIllIl && this.IlIIIlIlIIIllIlIlIIl) {
            this.llllIIIIlIIIlIlllIll = 1.0f;
        }
        this.IlIIIlIlIIIllIlIlIIl = this.IIIIIllIIIIlIIIIllIl;
        this.IIlllIIlIllIllIlIIll();
    }
    
    protected void IIlllIIlIllIllIlIIll() {
        this.llllIIIIlIIIlIlllIll *= 0.6f;
    }
    
    protected int IlIllIlIlIIIlIlIlIII() {
        return this.IlIIllIIllIIllIIlIIl.nextInt(20) + 10;
    }
    
    protected IIIllllllIllIIIlllIl llllIIllllIlIlIIIIll() {
        return new IIIllllllIllIIIlllIl(this.IlllllllIIIlIIIlIlII);
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl(final int n) {
        if (n == 16) {
            final int ao = this.ao();
            this.llllIIIIlIIIlIlllIll(0.51000005f * ao, 0.51000005f * ao);
            this.IIlIIIIIllIlIIIlIIll = this.lIIlllIlllllIIlllIll;
            this.lIllIlIIIllllllIIlII = this.lIIlllIlllllIIlllIll;
            if (this.llIIIlIlllIllIIlIllI() && this.IlIIllIIllIIllIIlIIl.nextInt(20) == 0) {
                this.lllllIIIIIlIlIIIIIIl();
            }
        }
        super.llIIlIIIlIIIllIlIIIl(n);
    }
    
    @Override
    public void IllIllIIIIlIIlIlllII() {
        final int ao = this.ao();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && ao > 1 && this.N() <= 0.0f) {
            for (int n = 2 + this.IlIIllIIllIIllIIlIIl.nextInt(3), i = 0; i < n; ++i) {
                final float n2 = (i % 2 - 0.5f) * ao / 4.0f;
                final float n3 = (i / 2 - 0.5f) * ao / 4.0f;
                final IIIllllllIllIIIlllIl llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll();
                if (this.w_()) {
                    llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl(this.lIllIlIIIllllllIIlII());
                }
                if (this.r()) {
                    llllIIllllIlIlIIIIll.p();
                }
                llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(ao / 2);
                llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + n2, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII + n3, this.IlIIllIIllIIllIIlIIl.nextFloat() * 360.0f, 0.0f);
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll);
            }
        }
        super.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.IllIIlllIIIIlllIIlIl(llIllIIIIIllIlIIIIlI);
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII && this.lllIIIIlllllIlIIllIl()) {
            this.IlIlIIIllIllIIIIIllI((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    public void b_(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.lllIIIIlllllIlIIllIl()) {
            this.IlIlIIIllIllIIIIIllI((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll);
        }
    }
    
    protected void IlIlIIIllIllIIIIIllI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        final int ao = this.ao();
        if (this.IIlllIIlIllIllIlIIll(lllIIIIlllllIlIIllIl) && this.IlIlIIIllIllIIIIIllI(lllIIIIlllllIlIIllIl) < 0.6 * ao * 0.6 * ao && lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), (float)this.IlIlIIIIIIlllIlIllIl())) {
            this.llllIIIIlIIIlIlllIll("mob.attack", 1.0f, (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
            this.llllIIIIlIIIlIlllIll(this, lllIIIIlllllIlIIllIl);
        }
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 0.625f * this.IlIllllIIlIIlIlIlIll;
    }
    
    protected boolean lllIIIIlllllIlIIllIl() {
        return this.ao() > 1;
    }
    
    protected int IlIlIIIIIIlllIlIllIl() {
        return this.ao();
    }
    
    @Override
    protected String O() {
        return "mob.slime." + ((this.ao() > 1) ? "big" : "small");
    }
    
    @Override
    protected String P() {
        return "mob.slime." + ((this.ao() > 1) ? "big" : "small");
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return (this.ao() == 1) ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllllIllIllIIllllll : null;
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), 0, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII));
        final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = this.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl(ilIlIlIlIlllllllllIl);
        if (this.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII().IIllIIllIIIlIlIIIIlI() == net.minecraft.IIIlIIlIIIIlllIlllII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI && this.IlIIllIIllIIllIIlIIl.nextInt(4) != 1) {
            return false;
        }
        if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
            if (this.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl) == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIlIIlIlIIlllIl && this.llIIIlIlIllIIlIlIlII > 50.0 && this.llIIIlIlIllIIlIlIlII < 70.0 && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.5f && this.IlIIllIIllIIllIIlIIl.nextFloat() < this.IlllllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll() && this.IlllllllIIIlIIIlIlII.IlIlIIIllIIllIlllllI(new IlIlIlIlIlllllllllIl(this)) <= this.IlIIllIIllIIllIIlIIl.nextInt(8)) {
                return super.lIlIlIIIllIIllIIIllI();
            }
            if (this.IlIIllIIllIIllIIlIIl.nextInt(10) == 0 && llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(987234911L).nextInt(10) == 0 && this.llIIIlIlIllIIlIlIlII < 40.0) {
                return super.lIlIlIIIllIIllIIIllI();
            }
        }
        return false;
    }
    
    @Override
    protected float Z() {
        return 0.4f * this.ao();
    }
    
    @Override
    public int j() {
        return 0;
    }
    
    protected boolean ap() {
        return this.ao() > 0;
    }
    
    protected boolean an() {
        return this.ao() > 2;
    }
    
    @Override
    protected void ad() {
        this.llIIlllIIlllIIllIllI = 0.41999998688697815;
        this.llIllIIlllllllllllll = true;
    }
    
    @Override
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(3);
        if (nextInt < 2 && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.5f * ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) {
            ++nextInt;
        }
        this.llllIIIIlIIIlIlllIll(1 << nextInt);
        return super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llIIIlIlIllIIlIlIlII);
    }
}
