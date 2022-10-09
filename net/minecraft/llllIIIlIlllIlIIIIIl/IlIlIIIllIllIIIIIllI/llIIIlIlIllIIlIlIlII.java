package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class llIIIlIlIllIIlIlIlII extends llIlIIIIIlIIlIlIIlll
{
    private static final UUID IlIlIlIlIlllllllllIl;
    private static final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
    private int t;
    private int u;
    private UUID v;
    
    static {
        IlIlIlIlIlllllllllIl = UUID.fromString("49455A49-7EC5-45BA-B886-3B90B23A1718");
        llIllIIIIIllIlIIIIlI = new llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl, "Attacking speed boost", 0.05, 0).llllIIIIlIIIlIlllIll(false);
    }
    
    public llIIIlIlIllIIlIlIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IIIllIIIlIlIIllIIIlI = true;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        super.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl);
        if (lllIIIIlllllIlIIllIl != null) {
            this.v = lllIIIIlllllIlIIllIl.lllIIIIlIlIllIIlIIIl();
        }
    }
    
    @Override
    protected void lIIIIlIIIIIlllIllIII() {
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new lllllIlIIIlIlIIlllII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new lIllllllIIllIlIlIlII(this));
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(0.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.23000000417232513);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(5.0);
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
    }
    
    @Override
    protected void i() {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl);
        if (this.ao()) {
            if (!this.e_() && !llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI)) {
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI);
            }
            --this.t;
        }
        else if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI)) {
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI);
        }
        if (this.u > 0 && --this.u == 0) {
            this.llllIIIIlIIIlIlllIll("mob.zombiepig.zpigangry", this.Z() * 2.0f, ((this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f) * 1.8f);
        }
        if (this.t > 0 && this.v != null && this.C() == null) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.v);
            this.llIllIIIIIllIlIIIIlI((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll2);
            this.IlIIlllIIlIlllllIIlI = llllIIIIlIIIlIlllIll2;
            this.llllIlIllllIIlIIlIlI = this.D();
        }
        super.i();
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean k() {
        return this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI(), this) && this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIIlllIIlIlllllIIlI()).isEmpty() && !this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(this.IlIIlllIIlIlllllIIlI());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Anger", (short)this.t);
        if (this.v != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HurtBy", this.v.toString());
        }
        else {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HurtBy", "");
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.t = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Anger");
        final String llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("HurtBy");
        if (llIIlIIIlIIIllIlIIIl.length() > 0) {
            this.v = UUID.fromString(llIIlIIIlIIIllIlIIIl);
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.v);
            this.llIllIIIIIllIlIIIIlI((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll != null) {
                this.IlIIlllIIlIlllllIIlI = llllIIIIlIIIlIlllIll;
                this.llllIlIllllIIlIIlIlI = this.D();
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
        if (llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            this.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl);
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    private void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.t = 400 + this.IlIIllIIllIIllIIlIIl.nextInt(400);
        this.u = this.IlIIllIIllIIllIIlIIl.nextInt(40);
        if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
            this.llIllIIIIIllIlIIIIlI((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI);
        }
    }
    
    public boolean ao() {
        return this.t > 0;
    }
    
    @Override
    protected String e() {
        return "mob.zombiepig.zpig";
    }
    
    @Override
    protected String O() {
        return "mob.zombiepig.zpighurt";
    }
    
    @Override
    protected String P() {
        return "mob.zombiepig.zpigdeath";
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        for (int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(2 + n), i = 0; i < nextInt; ++i) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.x, 1);
        }
        for (int nextInt2 = this.IlIIllIIllIIllIIlIIl.nextInt(2 + n), j = 0; j < nextInt2; ++j) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.B, 1);
        }
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return false;
    }
    
    @Override
    protected void Q() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIllIlIIIIllIlIIllI, 1);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIIlIlIllIIlIlIlII));
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llIIIlIlIllIIlIlIlII);
        this.IlIlIIIllIIllIlllllI(false);
        return llIIIlIlIllIIlIlIlII;
    }
}
