package net.optifine.lIIIlllIIIllIIIllIII;

import net.optifine.util.*;

public class lIIIIlIIIIIlllIllIII
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI;
    
    public lIIIIlIIIIIlllIllIII() {
        this.llllIIIIlIIIlIlllIll = -1;
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = new IlIlIIIlIIlIlIIlllIl(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void IlIlIlIlIlllllllllIl(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public IlIlIIIlIIlIlIIlllIl IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public lIIIIlIIIIIlllIllIII IlIlIIIllIllIIIIIllI() {
        final IlIlIIIlIIlIlIIlllIl ilIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
        return (ilIlIlIlIlllllllllIl == null) ? null : ((lIIIIlIIIIIlllIllIII)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
    }
    
    public lIIIIlIIIIIlllIllIII IllIIlllIIIIlllIIlIl() {
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
        return (llIllIIIIIllIlIIIIlI == null) ? null : ((lIIIIlIIIIIlllIllIII)llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll + "/" + this.IlIlIlIlIlllllllllIl + "/" + (this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl);
    }
}
