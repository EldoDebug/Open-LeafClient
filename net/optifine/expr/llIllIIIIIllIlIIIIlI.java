package net.optifine.expr;

public class llIllIIIIIllIlIIIIlI implements IlIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI
{
    private IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    
    public llIllIIIIIllIlIIIIlI(final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public float IlIlIlIlIlllllllllIl() {
        if (!this.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            this.IlIlIlIlIlllllllllIl = true;
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        this.IlIlIlIlIlllllllllIl = false;
    }
    
    @Override
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return "cached(" + this.llllIIIIlIIIlIlllIll + ")";
    }
}
