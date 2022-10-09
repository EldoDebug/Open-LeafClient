package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIIIIIIIIlllIllIlIlI extends llIllIlIIIIllIlIIllI
{
    boolean llllIIIlIlllIlIIIIIl;
    int lIIIIlIIIIIlllIllIII;
    
    public IIIIIIIIIlllIllIlIlI(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final boolean llllIIIlIlllIlIIIIIl) {
        super(llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII > 0 && super.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI() {
        this.lIIIIlIIIIIlllIllIII = 20;
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl, true);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        if (this.llllIIIlIlllIlIIIIIl) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII, this.IlIlIlIlIlllllllllIl, false);
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        --this.lIIIIlIIIIIlllIllIII;
        super.IlIIIlIlIIIllIlIlIIl();
    }
}
