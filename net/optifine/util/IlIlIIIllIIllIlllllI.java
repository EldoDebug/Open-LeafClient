package net.optifine.util;

public class IlIlIIIllIIllIlllllI
{
    private int[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIllIIllIlllllI(final int n) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = 0;
        this.llllIIIIlIIIlIlllIll = new int[n];
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl] = n;
        ++this.IlIlIlIlIlllllllllIl;
        if (this.llIllIIIIIllIlIIIIlI < this.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI, final int n) {
        this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI] = n;
        if (this.llIllIIIIIllIlIIIIlI < llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.llllIIIIlIIIlIlllIll[this.IlIlIlIlIlllllllllIl] = array[i];
            ++this.IlIlIlIlIlllllllllIl;
        }
        if (this.llIllIIIIIllIlIIIIlI < this.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl;
        }
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.llllIIIIlIIIlIlllIll[n];
    }
    
    public int[] llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = 0;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
