package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class llllIIIIlIIIlIlllIll extends IIlllIlIIllIlIlIlIIl
{
    private float llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = 0.5f;
        this.IIIllIIIlIlIIllIIIlI = true;
        this.llllIIIlIlllIlIIIIIl = 10;
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IlIlIlIlIlllllllllIl(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new llIIlllIIlllIIllIllI(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new lllllIIIIIlIlIIIIIIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, true, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, true));
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(6.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.23000000417232513);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(48.0);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, new Byte((byte)0));
    }
    
    @Override
    protected String e() {
        return "mob.blaze.breathe";
    }
    
    @Override
    protected String O() {
        return "mob.blaze.hit";
    }
    
    @Override
    protected String P() {
        return "mob.blaze.death";
    }
    
    @Override
    public int a_(final float n) {
        return 15728880;
    }
    
    @Override
    public float b_(final float n) {
        return 1.0f;
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (!this.IIIIIllIIIIlIIIIllIl && this.llIIlllIIlllIIllIllI < 0.0) {
            this.llIIlllIIlllIIllIllI *= 0.6;
        }
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (this.IlIIllIIllIIllIIlIIl.nextInt(24) == 0 && !this.lIlIlIlllIIlIlIlllIl()) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl + 0.5, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII + 0.5, "fire.fire", 1.0f + this.IlIIllIIllIIllIIlIIl.nextFloat(), this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.7f + 0.3f, false);
            }
            for (int i = 0; i < 2; ++i) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextDouble() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII, 0.0, 0.0, 0.0, new int[0]);
            }
        }
        super.IIIlIIIlIlIIlllIIlll();
    }
    
    @Override
    protected void i() {
        if (this.lIIIIlIlIllllIIlIllI()) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl, 1.0f);
        }
        --this.IlIlIlIlIlllllllllIl;
        if (this.IlIlIlIlIlllllllllIl <= 0) {
            this.IlIlIlIlIlllllllllIl = 100;
            this.llllIIIIlIIIlIlllIll = 0.5f + (float)this.IlIIllIIllIIllIIlIIl.nextGaussian() * 3.0f;
        }
        final lllIIIIlllllIlIIllIl iIlllIIIlIlllIIlllII = this.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII != null && iIlllIIIlIlllIIlllII.llIIIlIlIllIIlIlIlII + iIlllIIIlIlllIIlllII.llllIlIllllIIlIIlIlI() > this.llIIIlIlIllIIlIlIlII + this.llllIlIllllIIlIIlIlI() + this.llllIIIIlIIIlIlllIll) {
            this.llIIlllIIlllIIllIllI += (0.30000001192092896 - this.llIIlllIIlllIIllIllI) * 0.30000001192092896;
            this.llIllIIlllllllllllll = true;
        }
        super.i();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.z;
    }
    
    @Override
    public boolean lIIIIIlIlIIIlIIIIlIl() {
        return this.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        if (b) {
            for (int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(2 + n), i = 0; i < nextInt; ++i) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.z, 1);
            }
        }
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x1) != 0x0;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        byte b2;
        if (b) {
            b2 = (byte)(llllIIIIlIIIlIlllIll | 0x1);
        }
        else {
            b2 = (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFE);
        }
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, b2);
    }
    
    @Override
    protected boolean t_() {
        return true;
    }
}
