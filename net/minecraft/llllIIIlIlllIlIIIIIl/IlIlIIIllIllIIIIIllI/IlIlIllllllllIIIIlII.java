package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IlIlIllllllllIIIIlII extends IIIllllllIllIIIlllIl
{
    public IlIlIllllllllIIIIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IIIllIIIlIlIIllIIIlI = true;
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.20000000298023224);
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
    public int R() {
        return this.ao() * 3;
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
    protected IlIllllIIlIIlIlIlIll lIIIIlIIIIIlllIllIII() {
        return net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIlllIlIIllIlIlIlIIl;
    }
    
    @Override
    protected IIIllllllIllIIIlllIl llllIIllllIlIlIIIIll() {
        return new IlIlIllllllllIIIIlII(this.IlllllllIIIlIIIlIlII);
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.I;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        final IlIIIlIlIIIllIlIlIIl f = this.f();
        if (f != null && this.ao() > 1) {
            int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(4) - 2;
            if (n > 0) {
                n2 += this.IlIIllIIllIIllIIlIIl.nextInt(n + 1);
            }
            for (int i = 0; i < n2; ++i) {
                this.llllIIIIlIIIlIlllIll(f, 1);
            }
        }
    }
    
    @Override
    public boolean lIIIIIlIlIIIlIIIIlIl() {
        return false;
    }
    
    @Override
    protected int IlIllIlIlIIIlIlIlIII() {
        return super.IlIllIlIlIIIlIlIlIII() * 4;
    }
    
    @Override
    protected void IIlllIIlIllIllIlIIll() {
        this.llllIIIIlIIIlIlllIll *= 0.9f;
    }
    
    @Override
    protected void ad() {
        this.llIIlllIIlllIIllIllI = 0.42f + this.ao() * 0.1f;
        this.llIllIIlllllllllllll = true;
    }
    
    @Override
    protected void af() {
        this.llIIlllIIlllIIllIllI = 0.22f + this.ao() * 0.05f;
        this.llIllIIlllllllllllll = true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
    }
    
    @Override
    protected boolean lllIIIIlllllIlIIllIl() {
        return true;
    }
    
    @Override
    protected int IlIlIIIIIIlllIlIllIl() {
        return super.IlIlIIIIIIlllIlIllIl() + 2;
    }
    
    @Override
    protected String IlllllllIIIlIIIlIlII() {
        return (this.ao() > 1) ? "mob.magmacube.big" : "mob.magmacube.small";
    }
    
    @Override
    protected boolean an() {
        return true;
    }
}
