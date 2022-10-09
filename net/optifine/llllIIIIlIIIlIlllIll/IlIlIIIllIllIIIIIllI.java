package net.optifine.llllIIIIlIIIlIlllIll;

public class IlIlIIIllIllIIIIIllI
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    
    public IlIlIIIllIllIIIIIllI(final int n, final int n2) {
        this(n, n2, 0);
    }
    
    public IlIlIIIllIllIIIIIllI(final int n, final int n2, final int n3) {
        this(n, n2, n3, null);
    }
    
    public IlIlIIIllIllIIIIIllI(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final String ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return (this.IlIlIlIlIlllllllllIl > 9) ? (this.llllIIIIlIIIlIlllIll * 100 + this.IlIlIlIlIlllllllllIl) : ((this.llIllIIIIIllIlIIIIlI > 9) ? (this.llllIIIIlIIIlIlllIll * 100 + this.IlIlIlIlIlllllllllIl * 10 + 9) : (this.llllIIIIlIIIlIlllIll * 100 + this.IlIlIlIlIlllllllllIl * 10 + this.llIllIIIIIllIlIIIIlI));
    }
    
    @Override
    public String toString() {
        return (this.IlIIIlIlIIIllIlIlIIl == null) ? (this.llllIIIIlIIIlIlllIll + "." + this.IlIlIlIlIlllllllllIl + "." + this.llIllIIIIIllIlIIIIlI) : (this.llllIIIIlIIIlIlllIll + "." + this.IlIlIlIlIlllllllllIl + "." + this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl);
    }
}
