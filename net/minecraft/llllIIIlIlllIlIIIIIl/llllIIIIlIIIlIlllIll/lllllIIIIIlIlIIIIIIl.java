package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

public class lllllIIIIIlIlIIIIIIl extends IlIlIIIllIllIIIIIllI
{
    protected IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    protected llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl;
    protected float llIllIIIIIllIlIIIIlI;
    private int IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    protected Class IlIIIlIlIIIllIlIlIIl;
    
    public lllllIIIIIlIlIIIIIIl(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final Class ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = 0.02f;
        this.llllIIIIlIIIlIlllIll(2);
    }
    
    public lllllIIIIIlIlIIIIIIl(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final Class ilIIIlIlIIIllIlIlIIl, final float llIllIIIIIllIlIIIIlI, final float illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll(2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll() {
        if (this.llllIIIIlIIIlIlllIll.B().nextFloat() >= this.IllIIlllIIIIlllIIlIl) {
            return false;
        }
        if (this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII() != null) {
            this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        }
        if (this.IlIIIlIlIIIllIlIlIIl == llllIIIIlIIIlIlllIll.class) {
            this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, (double)this.llIllIIIIIllIlIIIIlI);
        }
        else {
            this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI, 3.0, this.llIllIIIIIllIlIIIIlI), this.llllIIIIlIIIlIlllIll);
        }
        return this.IlIlIlIlIlllllllllIl != null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl.llllIllllIllllIlIlII() && this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl) <= this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI && this.IlIlIIIllIllIIIIIllI > 0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.IlIlIIIllIllIIIIIllI = 40 + this.llllIIIIlIIIlIlllIll.B().nextInt(40);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = null;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl.llIIIlIlIllIIlIlIlII + this.IlIlIlIlIlllllllllIl.llllIlIllllIIlIIlIlI(), this.IlIlIlIlIlllllllllIl.lllllIlIIIlIlIIlllII, 10.0f, (float)this.llllIIIIlIIIlIlllIll.j());
        --this.IlIlIIIllIllIIIIIllI;
    }
}
