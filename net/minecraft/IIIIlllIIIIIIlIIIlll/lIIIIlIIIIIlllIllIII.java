package net.minecraft.IIIIlllIIIIIIlIIIlll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIIlIIIIIlllIllIII
{
    public final int llllIIIIlIIIlIlllIll;
    public final int IlIlIlIlIlllllllllIl;
    public final int llIllIIIIIllIlIIIIlI;
    private final int llIIlIIIlIIIllIlIIIl;
    int IlIIIlIlIIIllIlIlIIl;
    float IlIlIIIllIllIIIIIllI;
    float IllIIlllIIIIlllIIlIl;
    float llllIIIlIlllIlIIIIIl;
    lIIIIlIIIIIlllIllIII lIIIIlIIIIIlllIllIII;
    public boolean lIIIlllIIIllIIIllIII;
    
    public lIIIIlIIIIIlllIllIII(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI) {
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI);
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return (n2 & 0xFF) | (n & 0x7FFF) << 8 | (n3 & 0x7FFF) << 24 | ((n < 0) ? Integer.MIN_VALUE : 0) | ((n3 < 0) ? 32768 : 0);
    }
    
    public float llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final float n = (float)(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll);
        final float n2 = (float)(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl);
        final float n3 = (float)(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI);
        return llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n * n + n2 * n2 + n3 * n3);
    }
    
    public float IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final float n = (float)(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll);
        final float n2 = (float)(liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl);
        final float n3 = (float)(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI);
        return n * n + n2 * n2 + n3 * n3;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof lIIIIlIIIIIlllIllIII)) {
            return false;
        }
        final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = (lIIIIlIIIIIlllIllIII)o;
        return this.llIIlIIIlIIIllIlIIIl == liiiIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl && this.llllIIIIlIIIlIlllIll == liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll && this.IlIlIlIlIlllllllllIl == liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int hashCode() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl >= 0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.llllIIIIlIIIlIlllIll) + ", " + this.IlIlIlIlIlllllllllIl + ", " + this.llIllIIIIIllIlIIIIlI;
    }
}
