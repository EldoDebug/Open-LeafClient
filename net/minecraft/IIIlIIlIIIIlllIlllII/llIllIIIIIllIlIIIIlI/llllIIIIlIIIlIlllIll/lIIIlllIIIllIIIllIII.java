package net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

public class lIIIlllIIIllIIIllIII
{
    public final byte[] llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    
    public lIIIlllIIIllIIIllIII(final byte[] llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl + 4;
    }
    
    public int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        final int n4 = n << this.llIllIIIIIllIlIIIIlI | n3 << this.IlIlIlIlIlllllllllIl | n2;
        final int n5 = n4 >> 1;
        return ((n4 & 0x1) == 0x0) ? (this.llllIIIIlIIIlIlllIll[n5] & 0xF) : (this.llllIIIIlIIIlIlllIll[n5] >> 4 & 0xF);
    }
}
