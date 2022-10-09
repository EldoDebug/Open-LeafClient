package net.minecraft.IlIlIIIlIIlIlIIlllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class IlIlIllllllllIIIIlII extends IlIIIlIlIIIllIlIlIIl implements IIIIlllIIIIIIlIIIlll, IlIlIIIllIIllIlllllI
{
    private IIlllIIlIllIllIlIIll IlIlIIIllIllIIIIIllI;
    
    public IlIlIllllllllIIIIlII() {
        this.IlIlIIIllIllIIIIIllI = IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.IlIlIIIllIllIIIIIllI = IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (this.IlIlIIIllIllIIIIIllI != null) {
            this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        }
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI != null && !this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public IIlllIIlIllIllIlIIll u_() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        return this.w_() ? new IlIlIIIIIIlllIlIllIl(this.s_()) : new IIllIIllIIIlIlIIIIlI(this.s_(), new Object[0]);
    }
}
