package net.minecraft.IIIlIIlIIIIlllIlllII;

public class IlIlIlIlIlllllllllIl
{
    public final int llllIIIIlIIIlIlllIll;
    public final int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IlIlIlIlIlllllllllIl(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = 0;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public static long llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return ((long)n & 0xFFFFFFFFL) | ((long)n2 & 0xFFFFFFFFL) << 32;
    }
    
    @Override
    public int hashCode() {
        if (this.llIllIIIIIllIlIIIIlI == 0) {
            this.llIllIIIIIllIlIIIIlI = (1664525 * this.llllIIIIlIIIlIlllIll + 1013904223 ^ 1664525 * (this.IlIlIlIlIlllllllllIl ^ 0xDEADBEEF) + 1013904223);
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IlIlIlIlIlllllllllIl)) {
            return false;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (IlIlIlIlIlllllllllIl)o;
        return this.llllIIIIlIIIlIlllIll == ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && this.IlIlIlIlIlllllllllIl == ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return (this.llllIIIIlIIIlIlllIll << 4) + 8;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return (this.IlIlIlIlIlllllllllIl << 4) + 8;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll << 4;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl << 4;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return (this.llllIIIIlIIIlIlllIll << 4) + 15;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return (this.IlIlIlIlIlllllllllIl << 4) + 15;
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl((this.llllIIIIlIIIlIlllIll << 4) + n, n2, (this.IlIlIlIlIlllllllllIl << 4) + n3);
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n) {
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(), n, this.IlIlIlIlIlllllllllIl());
    }
    
    @Override
    public String toString() {
        return "[" + this.llllIIIIlIIIlIlllIll + ", " + this.IlIlIlIlIlllllllllIl + "]";
    }
}
