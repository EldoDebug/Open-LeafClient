package net.optifine.lIIIlllIIIllIIIllIII;

public class IllIIlllIIIIlllIIlIl
{
    private boolean llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IllIIlllIIIIlllIIlIl() {
        this(false, 1, 0);
    }
    
    public IllIIlllIIIIlllIIlIl(final boolean b) {
        this(b, 1, 0);
    }
    
    public IllIIlllIIIIlllIIlIl(final boolean llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public IllIIlllIIIIlllIIlIl(final boolean b, final int n, final int n2) {
        this(b, n, n2, n, n2);
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI;
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
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.IlIlIlIlIlllllllllIl = n;
        this.llIllIIIIIllIlIIIIlI = n2;
        this.IlIIIlIlIIIllIlIlIIl = n;
        this.IlIlIIIllIllIIIIIllI = n2;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IlIlIlIlIlllllllllIl != this.IlIIIlIlIIIllIlIlIIl || this.llIllIIIIIllIlIIIIlI != this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return "enabled: " + this.llllIIIIlIIIlIlllIll + ", src: " + this.IlIlIlIlIlllllllllIl + ", dst: " + this.llIllIIIIIllIlIIIIlI + ", srcAlpha: " + this.IlIIIlIlIIIllIlIlIIl + ", dstAlpha: " + this.IlIlIIIllIllIIIIIllI;
    }
}
