package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIIIlIlIIIllIlIlIIl extends IlIlIlIlIlllllllllIl
{
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public int z;
    public boolean A;
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.y = 1.0f;
        this.llllIIIIlIIIlIlllIll(0.4f, 0.7f);
        this.z = this.IlIIllIIllIIllIIlIIl.nextInt(6000) + 6000;
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new lllIllIIIllllllIllll(this, 1.4));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IIlllIlIIllIlIlIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new lIlIlIlllIIlIlIlllIl(this, 1.0, net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI(this, 1.1));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 6.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new IlIlIllllllllIIIIlII(this));
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return this.IlIllllIIlIIlIlIlIll;
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(4.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.25);
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        this.x = this.u;
        this.w = this.v;
        this.v += (float)((this.IIIIIllIIIIlIIIIllIl ? -1 : 4) * 0.3);
        this.v = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.v, 0.0f, 1.0f);
        if (!this.IIIIIllIIIIlIIIIllIl && this.y < 1.0f) {
            this.y = 1.0f;
        }
        this.y *= (float)0.9;
        if (!this.IIIIIllIIIIlIIIIllIl && this.llIIlllIIlllIIllIllI < 0.0) {
            this.llIIlllIIlllIIllIllI *= 0.6;
        }
        this.u += this.y * 2.0f;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.e_() && !this.aq() && --this.z <= 0) {
            this.llllIIIIlIIIlIlllIll("mob.chicken.plop", 1.0f, (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIllIlIIIllllllIIlII, 1);
            this.z = this.IlIIllIIllIIllIIlIIl.nextInt(6000) + 6000;
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
    }
    
    @Override
    protected String e() {
        return "mob.chicken.say";
    }
    
    @Override
    protected String O() {
        return "mob.chicken.hurt";
    }
    
    @Override
    protected String P() {
        return "mob.chicken.hurt";
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.chicken.step", 0.15f, 1.0f);
    }
    
    @Override
    protected net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        for (int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(3) + this.IlIIllIIllIIllIIlIIl.nextInt(1 + n), i = 0; i < n2; ++i) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll, 1);
        }
        if (this.lIIIIIlIlIIIlIIIIlIl()) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.p, 1);
        }
        else {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.o, 1);
        }
    }
    
    public IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return new IlIIIlIlIIIllIlIlIIl(this.IlllllllIIIlIIIlIlII);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.A = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("IsChickenJockey");
        if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("EggLayTime")) {
            this.z = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("EggLayTime");
        }
    }
    
    @Override
    protected int IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.aq() ? 10 : super.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("IsChickenJockey", this.A);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("EggLayTime", this.z);
    }
    
    @Override
    protected boolean g() {
        return this.aq() && this.IIllIIllIIIlIlIIIIlI == null;
    }
    
    @Override
    public void IllIlIllIllIlllIIlll() {
        super.IllIlIllIllIlllIIlll();
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllIlIIIllllllIIlII * 3.1415927f / 180.0f);
        final float ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.lIllIlIIIllllllIIlII * 3.1415927f / 180.0f);
        final float n = 0.1f;
        this.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + n * llllIIIIlIIIlIlllIll, this.llIIIlIlIllIIlIlIlII + this.IlIllllIIlIIlIlIlIll * 0.5f + this.IIllIIllIIIlIlIIIIlI.IIllIIIlIIlIlIlIIIII() + 0.0f, this.lllllIlIIIlIlIIlllII - n * ilIlIlIlIlllllllllIl);
        if (this.IIllIIllIIIlIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
            ((lllIIIIlllllIlIIllIl)this.IIllIIllIIIlIlIIIIlI).lIllIlIIIllllllIIlII = this.lIllIlIIIllllllIIlII;
        }
    }
    
    public boolean aq() {
        return this.A;
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean a) {
        this.A = a;
    }
}
