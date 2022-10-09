package net.optifine.expr;

public class IlIlIlIlIlllllllllIl implements IIIIlllIIIIIIlIIIlll, lIlIlIIIllIIllIIIllI
{
    private IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private float[] llIllIIIIIllIlIIIIlI;
    
    public IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public float[] IlIlIlIlIlllllllllIl() {
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
