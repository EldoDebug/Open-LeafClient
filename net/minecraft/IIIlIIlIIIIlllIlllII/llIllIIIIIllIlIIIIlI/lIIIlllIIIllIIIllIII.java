package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI;

public class lIIIlllIIIllIIIllIII
{
    private final byte[] llllIIIIlIIIlIlllIll;
    
    public lIIIlllIIIllIIIllIII() {
        this.llllIIIIlIIIlIlllIll = new byte[2048];
    }
    
    public lIIIlllIIIllIIIllIII(final byte[] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll.length != 2048) {
            throw new IllegalArgumentException("ChunkNibbleArrays should be 2048 bytes not: " + llllIIIIlIIIlIlllIll.length);
        }
    }
    
    public int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl(n, n2, n3));
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl(n, n2, n3), n4);
    }
    
    private int IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        return n2 << 8 | n3 << 4 | n;
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(n);
        return this.IlIlIlIlIlllllllllIl(n) ? (this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI] & 0xF) : (this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI] >> 4 & 0xF);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        final int llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(n);
        if (this.IlIlIlIlIlllllllllIl(n)) {
            this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI] = (byte)((this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI] & 0xF0) | (n2 & 0xF));
        }
        else {
            this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI] = (byte)((this.llllIIIIlIIIlIlllIll[llIllIIIIIllIlIIIIlI] & 0xF) | (n2 & 0xF) << 4);
        }
    }
    
    private boolean IlIlIlIlIlllllllllIl(final int n) {
        return (n & 0x1) == 0x0;
    }
    
    private int llIllIIIIIllIlIIIIlI(final int n) {
        return n >> 1;
    }
    
    public byte[] llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
