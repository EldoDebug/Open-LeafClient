package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;

public class llIllIlIIIIllIlIIllI extends IlIlIlIlIlllllllllIl
{
    private final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII u;
    
    public llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.9f, 0.9f);
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new lllIllIIIllllllIllll(this, 1.25));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, this.u = new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(this, 0.3f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new IIlllIlIIllIlIlIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new lIlIlIlllIIlIlIlllIl(this, 1.2, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ac, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new lIlIlIlllIIlIlIlllIl(this, 1.2, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI(this, 1.1));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 6.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIlIllllllllIIIIlII(this));
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(10.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.25);
    }
    
    @Override
    public boolean o() {
        final lllIIIIlIlIllIIlIIIl n = ((llllIIIIlIIIlIlllIll)this.IIllIIllIIIlIlIIIIlI).n();
        return n != null && n.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ac;
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Saddle", this.aq());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lIlIlIIIllIIllIIIllI(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Saddle"));
    }
    
    @Override
    protected String e() {
        return "mob.pig.say";
    }
    
    @Override
    protected String O() {
        return "mob.pig.say";
    }
    
    @Override
    protected String P() {
        return "mob.pig.death";
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.pig.step", 0.15f, 1.0f);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll)) {
            return true;
        }
        if (!this.aq() || this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII || (this.IIllIIllIIIlIlIIIIlI != null && this.IIllIIllIIIlIlIIIIlI != llllIIIIlIIIlIlllIll)) {
            return false;
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this);
        return true;
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return this.lIIIIIlIlIIIlIIIIlIl() ? net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIlIlIIIlIlIIIl : net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllllIIllIIlllll;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        for (int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(3) + 1 + this.IlIIllIIllIIllIIlIIl.nextInt(1 + n), i = 0; i < n2; ++i) {
            if (this.lIIIIIlIlIIIlIIIIlIl()) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllllIIlIlIIIlIlIIIl, 1);
            }
            else {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIlllllIIllIIlllll, 1);
            }
        }
        if (this.aq()) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, 1);
        }
    }
    
    public boolean aq() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x1) != 0x0;
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean b) {
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, 1);
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, 0);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IIlIlIlIIlIllIIIIIIl) {
            final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII = new llIIIlIlIllIIlIlIlII(this.IlllllllIIIlIIIlIlII);
            llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIIlIlIllIIlIlIlII));
            llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
            llIIIlIlIllIIlIlIlII.llIIlIIIlIIIllIlIIIl(this.v());
            if (this.w_()) {
                llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl(this.lIllIlIIIllllllIIlII());
                llIIIlIlIllIIlIlIlII.lIIIIlIIIIIlllIllIII(this.IlIllIIllIIlIIIIlIIl());
            }
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII);
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
        super.IlIIIlIlIIIllIlIlIIl(n, n2);
        if (n > 5.0f && this.IIllIIllIIIlIlIIIIlI instanceof llllIIIIlIIIlIlllIll) {
            ((llllIIIIlIIIlIlllIll)this.IIllIIllIIIlIlIIIIlI).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIIlIIIlIlIIlllIIlll);
        }
    }
    
    public llIllIlIIIIllIlIIllI IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return new llIllIlIIIIllIlIIllI(this.IlllllllIIIlIIIlIlII);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.V;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII ar() {
        return this.u;
    }
}
