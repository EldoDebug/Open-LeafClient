package net.optifine.lIIIlllIIIllIIIllIII;

public class IlIlIIIllIllIIIIIllI
{
    private boolean llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIllIIIIIllI() {
        this(false, 519, 0.0f);
    }
    
    public IlIlIIIllIllIIIIIllI(final boolean b) {
        this(b, 519, 0.0f);
    }
    
    public IlIlIIIllIllIIIIIllI(final boolean llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll = true;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll = false;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public float IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public String toString() {
        return "enabled: " + this.llllIIIIlIIIlIlllIll + ", func: " + this.IlIlIlIlIlllllllllIl + ", ref: " + this.llIllIIIIIllIlIIIIlI;
    }
}
