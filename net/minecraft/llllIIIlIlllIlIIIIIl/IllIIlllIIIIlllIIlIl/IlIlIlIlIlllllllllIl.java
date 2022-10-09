package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public abstract class IlIlIlIlIlllllllllIl extends lIIIIlIIIIIlllIllIII implements IIIIIllIIIIlIIIIllIl
{
    protected llllIIIIlIIIlIlllIll t;
    private int u;
    private net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll v;
    
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.t = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    protected void i() {
        if (this.llllIIIlIlllIlIIIIIl() != 0) {
            this.u = 0;
        }
        super.i();
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        if (this.llllIIIlIlllIlIIIIIl() != 0) {
            this.u = 0;
        }
        if (this.u > 0) {
            --this.u;
            if (this.u % 10 == 0) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIllllllIllIIIlllIl, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + 0.5 + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, new int[0]);
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        this.u = 0;
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) ? 10.0f : (this.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII(ilIlIlIlIlllllllllIl) - 0.5f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("InLove", this.u);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.u = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("InLove");
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII));
        return this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == this.t && this.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI(ilIlIlIlIlllllllllIl) > 8 && super.lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    public int IIIllllllIllIIIlllIl() {
        return 120;
    }
    
    @Override
    protected boolean g() {
        return false;
    }
    
    @Override
    protected int IlIlIIIllIllIIIIIllI(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return 1 + this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(3);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll;
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null) {
            if (this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl) && this.llllIIIlIlllIlIIIIIl() == 0 && this.u <= 0) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl);
                this.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll);
                return true;
            }
            if (this.e_() && this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl)) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl);
                this.IlIlIlIlIlllllllllIl((int)(-this.llllIIIlIlllIlIIIIIl() / 20 * 0.1f), true);
                return true;
            }
        }
        return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
            }
        }
    }
    
    public void IllIIlllIIIIlllIIlIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll v) {
        this.u = 600;
        this.v = v;
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)18);
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll an() {
        return this.v;
    }
    
    public boolean ao() {
        return this.u > 0;
    }
    
    public void ap() {
        this.u = 0;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return ilIlIlIlIlllllllllIl != this && ilIlIlIlIlllllllllIl.getClass() == this.getClass() && (this.ao() && ilIlIlIlIlllllllllIl.ao());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 18) {
            for (int i = 0; i < 7; ++i) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIllllllIllIIIlllIl, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + 0.5 + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, new int[0]);
            }
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
}
