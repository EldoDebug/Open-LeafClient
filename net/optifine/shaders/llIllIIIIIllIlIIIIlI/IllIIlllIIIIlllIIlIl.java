package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import net.optifine.expr.*;

public class IllIIlllIIIIlllIIlIl implements IlIlIIIllIIllIlllllI
{
    private IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IllIIlllIIIIlllIIlIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        this(ilIlIIIllIllIIIIIllI, 0, 0);
    }
    
    public IllIIlllIIIIlllIIlIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final int n) {
        this(ilIlIIIllIllIIIIIllI, n, 0);
    }
    
    public IllIIlllIIIIlllIIlIl(final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public float IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public net.optifine.expr.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return (this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() == null) ? new StringBuilder().append(this.llllIIIIlIIIlIlllIll).toString() : ((this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl() == null) ? (this.llllIIIIlIIIlIlllIll + "." + this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()[this.IlIlIlIlIlllllllllIl]) : (this.llllIIIIlIIIlIlllIll + "." + this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()[this.IlIlIlIlIlllllllllIl] + "." + this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()[this.llIllIIIIIllIlIIIIlI]));
    }
}
