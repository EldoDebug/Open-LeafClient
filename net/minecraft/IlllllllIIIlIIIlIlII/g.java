package net.minecraft.IlllllllIIIlIIIlIlII;

public class g
{
    private byte llllIIIIlIIIlIlllIll;
    private byte IlIlIlIlIlllllllllIl;
    private byte llIllIIIIIllIlIIIIlI;
    private byte IlIIIlIlIIIllIlIlIIl;
    
    public g(final byte llllIIIIlIIIlIlllIll, final byte ilIlIlIlIlllllllllIl, final byte llIllIIIIIllIlIIIIlI, final byte ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public g(final g g) {
        this.llllIIIIlIIIlIlllIll = g.llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = g.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = g.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = g.IlIIIlIlIIIllIlIlIIl;
    }
    
    public byte llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public byte IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public byte llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public byte IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        return this.llllIIIIlIIIlIlllIll == g.llllIIIIlIIIlIlllIll && this.IlIIIlIlIIIllIlIlIIl == g.IlIIIlIlIIIllIlIlIIl && this.IlIlIlIlIlllllllllIl == g.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == g.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl) + this.llIllIIIIIllIlIIIIlI) + this.IlIIIlIlIIIllIlIlIIl;
    }
}
