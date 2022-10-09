package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class llIllIlIIIIllIlIIllI extends net.minecraft.llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI implements IllIlIIllIllIIlIllII
{
    private int llllIIIIlIIIlIlllIll;
    
    public llIllIlIIIIllIlIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = 1;
        this.llllIIIIlIIIlIlllIll(4.0f, 4.0f);
        this.IIIllIIIlIlIIllIIIlI = true;
        this.llllIIIlIlllIlIIIIIl = 5;
        this.lIIIIlIIIIIlllIllIII = new llllIIllllIlIlIIIIll(this);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IIIIlllIIIIIIlIIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new IlIlIIIllIIllIlllllI(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new lIlIlIIIllIIllIIIllI(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll(this));
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) != 0;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(byte)(b ? 1 : 0));
    }
    
    public int llllIIllllIlIlIIIIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if ("fireball".equals(lIllllllIIllIlIlIlII.IlIllIlIlIIIlIlIlIII()) && lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof llllIIIIlIIIlIlllIll) {
            super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, 1000.0f);
            ((llllIIIIlIIIlIlllIll)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIllllllllIIIIlII);
            return true;
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(10.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(100.0);
    }
    
    @Override
    protected String e() {
        return "mob.ghast.moan";
    }
    
    @Override
    protected String O() {
        return "mob.ghast.scream";
    }
    
    @Override
    protected String P() {
        return "mob.ghast.death";
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        for (int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(2) + this.IlIIllIIllIIllIIlIIl.nextInt(1 + n), i = 0; i < n2; ++i) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.A, 1);
        }
        for (int n3 = this.IlIIllIIllIIllIIlIIl.nextInt(3) + this.IlIIllIIllIIllIIlIIl.nextInt(1 + n), j = 0; j < n3; ++j) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI, 1);
        }
    }
    
    @Override
    protected float Z() {
        return 10.0f;
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.IlIIllIIllIIllIIlIIl.nextInt(20) == 0 && super.lIlIlIIIllIIllIIIllI() && this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int m() {
        return 1;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ExplosionPower", this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ExplosionPower", 99)) {
            this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("ExplosionPower");
        }
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 2.6f;
    }
}
