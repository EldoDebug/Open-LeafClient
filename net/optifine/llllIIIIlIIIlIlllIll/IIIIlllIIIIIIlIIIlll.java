package net.optifine.llllIIIIlIIIlIlllIll;

public class IIIIlllIIIIIIlIIIlll
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public IIIIlllIIIIIIlIIIlll(final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll = Math.min(n, n2);
        this.IlIlIlIlIlllllllllIl = Math.max(n, n2);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n) {
        return n >= this.llllIIIIlIIIlIlllIll && n <= this.IlIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String toString() {
        return "min: " + this.llllIIIIlIIIlIlllIll + ", max: " + this.IlIlIlIlIlllllllllIl;
    }
}
