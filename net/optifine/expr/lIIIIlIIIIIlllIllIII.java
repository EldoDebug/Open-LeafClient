package net.optifine.expr;

public class lIIIIlIIIIIlllIllIII implements IIIIlllIIIIIIlIIIlll
{
    private lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll;
    private llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl;
    
    public lIIIIlIIIIIlllIllIII(final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll, final llIIlIIIlIIIllIlIIIl[] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public float[] IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll() {
        return IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll + "()";
    }
}
