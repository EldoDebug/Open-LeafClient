package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIIlllIIlllIIllIllI extends IIlllIlIIllIlIlIlIIl
{
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    
    public llIIlllIIlllIIllIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.4f, 0.3f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IlIlIlIlIlllllllllIl(this, llllIIIIlIIIlIlllIll.class, 1.0, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IIlllIIIlIlllIIlllII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, true, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll(this, llllIIIIlIIIlIlllIll.class, true));
    }
    
    @Override
    public double IIllIIIlIIlIlIlIIIII() {
        return 0.2;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return 0.1f;
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(8.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.25);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(1.0);
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    protected String e() {
        return "mob.silverfish.say";
    }
    
    @Override
    protected String O() {
        return "mob.silverfish.hit";
    }
    
    @Override
    protected String P() {
        return "mob.silverfish.kill";
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (lIllllllIIllIlIlIlII instanceof net.minecraft.IlllllllIIIlIIIlIlII.IIlllIIIlIlllIIlllII || lIllllllIIllIlIlIlII == lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI) {
            this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.silverfish.step", 0.15f, 1.0f);
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return null;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.lIllIlIIIllllllIIlII = this.IIlIIIIIllIlIIIlIIll;
        super.IIllIIllIIIlIlIIIIlI();
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) ? 10.0f : super.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    protected boolean t_() {
        return true;
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return super.lIlIlIIIllIIllIIIllI() && this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, 5.0) == null;
    }
    
    @Override
    public IlIlIllllllllIIIIlII Y() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI;
    }
}
