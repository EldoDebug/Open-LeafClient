package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public abstract class llllllIllIllIlIllllI
{
    public final String llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public llllllIllIllIlIllllI(final String llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public abstract void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll p0);
    
    public abstract void llIllIIIIIllIlIIIIlI(final IIIIlllIIIIIIlIIIlll p0);
    
    public void IlIIIlIlIIIllIlIlIIl() {
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
