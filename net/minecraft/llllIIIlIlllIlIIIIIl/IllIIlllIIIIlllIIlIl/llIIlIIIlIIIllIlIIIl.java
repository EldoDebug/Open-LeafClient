package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import com.google.common.base.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIIlIIIlIIIllIlIIIl extends IIIlIIlIIIIlllIlllII
{
    private net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI v;
    private lIlIlIlllIIlIlIlllIl w;
    
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.6f, 0.7f);
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, this.u);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, this.w = new lIlIlIlllIIlIlIlllIl(this, 0.6, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI, true));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IlIlIIIIIIlllIlIllIl(this, 1.0, 10.0f, 5.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl(this, 0.8));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII(this, 0.3f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIIIlIIIllllIlIlIlI(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(9, new IIlllIlIIllIlIlIlIIl(this, 0.8));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(10, new IlIIllIIllIIllIIlIIl(this, 0.8));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(11, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 10.0f));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII(this, IlIIIlIlIIIllIlIlIIl.class, false, null));
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, (Object)0);
    }
    
    public void i() {
        if (this.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll()) {
            final double ilIlIlIlIlllllllllIl = this.llIIIlIlIllIIlIlIlII().IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl == 0.6) {
                this.IlIlIIIllIllIIIIIllI(true);
                this.llIllIIIIIllIlIIIIlI(false);
            }
            else if (ilIlIlIlIlllllllllIl == 1.33) {
                this.IlIlIIIllIllIIIIIllI(false);
                this.llIllIIIIIllIlIIIIlI(true);
            }
            else {
                this.IlIlIIIllIllIIIIIllI(false);
                this.llIllIIIIIllIlIIIIlI(false);
            }
        }
        else {
            this.IlIlIIIllIllIIIIIllI(false);
            this.llIllIIIIIllIlIIIIlI(false);
        }
    }
    
    @Override
    protected boolean g() {
        return !this.as() && this.lllllIIIIIlIlIIIIIIl > 2400;
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(10.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.30000001192092896);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CatType", this.aq());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lllIIIIlllllIlIIllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("CatType"));
    }
    
    @Override
    protected String e() {
        return this.as() ? (this.ao() ? "mob.cat.purr" : ((this.IlIIllIIllIIllIIlIIl.nextInt(4) == 0) ? "mob.cat.purreow" : "mob.cat.meow")) : "";
    }
    
    @Override
    protected String O() {
        return "mob.cat.hitt";
    }
    
    @Override
    protected String P() {
        return "mob.cat.hitt";
    }
    
    @Override
    protected float Z() {
        return 0.4f;
    }
    
    @Override
    protected net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIlIlIlllIlllIlI;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), 3.0f);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        this.u.llllIIIIlIIIlIlllIll(false);
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (this.as()) {
            if (this.IlIlIIIllIllIIIIIllI((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll) && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl)) {
                this.u.llllIIIIlIIIlIlllIll(!this.at());
            }
        }
        else if (this.w.lIIIIlIIIIIlllIllIII() && ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this) < 9.0) {
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIIIlIlIIIllIlIlIIl;
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl <= 0) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
            }
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                if (this.IlIIllIIllIIllIIlIIl.nextInt(3) == 0) {
                    this.lIlIlIIIllIIllIIIllI(true);
                    this.lllIIIIlllllIlIIllIl(1 + this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(3));
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString());
                    this.IlIlIIIllIIllIlllllI(true);
                    this.u.llllIIIIlIIIlIlllIll(true);
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)7);
                }
                else {
                    this.IlIlIIIllIIllIlllllI(false);
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)6);
                }
            }
            return true;
        }
        return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl(this.IlllllllIIIlIIIlIlII);
        if (this.as()) {
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl());
            llIIlIIIlIIIllIlIIIl.lIlIlIIIllIIllIIIllI(true);
            llIIlIIIlIIIllIlIIIl.lllIIIIlllllIlIIllIl(this.aq());
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllIIlIlllllIIlI;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == this) {
            return false;
        }
        if (!this.as()) {
            return false;
        }
        if (!(ilIlIlIlIlllllllllIl instanceof llIIlIIIlIIIllIlIIIl)) {
            return false;
        }
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = (llIIlIIIlIIIllIlIIIl)ilIlIlIlIlllllllllIl;
        return llIIlIIIlIIIllIlIIIl.as() && (this.ao() && llIIlIIIlIIIllIlIIIl.ao());
    }
    
    public int aq() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18);
    }
    
    public void lllIIIIlllllIlIIllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, (byte)n);
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(3) != 0;
    }
    
    @Override
    public boolean k() {
        if (this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI(), this) && this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIIlllIIlIlllllIIlI()).isEmpty() && !this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(this.IlIIlllIIlIlllllIIlI())) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.lllllIlIIIlIlIIlllII);
            if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < this.IlllllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl()) {
                return false;
            }
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.lIllIlIIIllllllIIlII() : (this.as() ? net.minecraft.IlllllllIIIlIIIlIlII.lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("entity.Cat.name") : super.s_());
    }
    
    @Override
    public void lIlIlIIIllIIllIIIllI(final boolean b) {
        super.lIlIlIIIllIIllIIIllI(b);
    }
    
    @Override
    protected void ar() {
        if (this.v == null) {
            this.v = new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this, llllIIIIlIIIlIlllIll.class, 16.0f, 0.8, 1.33);
        }
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.v);
        if (!this.as()) {
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, this.v);
        }
    }
    
    @Override
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        if (this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(7) == 0) {
            for (int i = 0; i < 2; ++i) {
                final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl(this.IlllllllIIIlIIIlIlII);
                llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, 0.0f);
                llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(-24000);
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
}
