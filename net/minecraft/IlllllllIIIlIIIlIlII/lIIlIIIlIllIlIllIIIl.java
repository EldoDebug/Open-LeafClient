package net.minecraft.IlllllllIIIlIIIlIlII;

public class lIIlIIIlIllIlIllIIIl
{
    private final long[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public lIIlIIIlIllIlIllIIIl() {
        this.llllIIIIlIIIlIlllIll = new long[240];
    }
    
    public void llllIIIIlIIIlIlllIll(final long n) {
        this.llllIIIIlIIIlIlllIll[this.IlIIIlIlIIIllIlIlIIl] = n;
        ++this.IlIIIlIlIIIllIlIlIIl;
        if (this.IlIIIlIlIIIllIlIlIIl == 240) {
            this.IlIIIlIlIIIllIlIlIIl = 0;
        }
        if (this.llIllIIIIIllIlIIIIlI < 240) {
            this.IlIlIlIlIlllllllllIl = 0;
            ++this.llIllIIIIIllIlIIIIlI;
        }
        else {
            this.IlIlIlIlIlllllllllIl = this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl + 1);
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final long n, final int n2) {
        return (int)(n / 1.6666666E7 * n2);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        return n % 240;
    }
    
    public long[] llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
