package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class llIIlIIIlIIIllIlIIIl extends IIlllIlIIllIlIlIlIIl
{
    private int llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = 0;
        this.IlIlIlIlIlllllllllIl = false;
        this.llllIIIlIlllIlIIIIIl = 3;
        this.llllIIIIlIIIlIlllIll(0.4f, 0.3f);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IlIlIlIlIlllllllllIl(this, llllIIIIlIIIlIlllIll.class, 1.0, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, true, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, llllIIIIlIIIlIlllIll.class, true));
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
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(2.0);
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
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.silverfish.step", 0.15f, 1.0f);
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return null;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Lifetime");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("PlayerSpawned");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Lifetime", this.llllIIIIlIIIlIlllIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("PlayerSpawned", this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.lIllIlIIIllllllIIlII = this.IIlIIIIIllIlIIIlIIll;
        super.IIllIIllIIIlIlIIIIlI();
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            for (int i = 0; i < 2; ++i) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIlIIlIIIIlllIlllII, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextDouble() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII, (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * 2.0, -this.IlIIllIIllIIllIIlIIl.nextDouble(), (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * 2.0, new int[0]);
            }
        }
        else {
            if (!this.r()) {
                ++this.llllIIIIlIIIlIlllIll;
            }
            if (this.llllIIIIlIIIlIlllIll >= 2400) {
                this.IllIllIIIIlIIlIlllII();
            }
        }
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
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII Y() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI;
    }
}
