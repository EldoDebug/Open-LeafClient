package net.optifine.util;

public class lIIIIlIIIIIlllIllIII
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public lIIIIlIIIIIlllIllIII(final int n) {
        this.llllIIIIlIIIlIlllIll = n;
        this.IlIlIlIlIlllllllllIl = n;
    }
    
    public synchronized int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl++;
    }
    
    public synchronized void IlIlIlIlIlllllllllIl() {
        this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
