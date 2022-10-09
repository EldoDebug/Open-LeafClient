package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.base.*;

public class f implements Comparable
{
    public static final f IlIlIlIlIlllllllllIl;
    private final int llllIIIIlIIIlIlllIll;
    private final int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIlIlIlllllllllIl = new f(0, 0, 0);
    }
    
    public f(final int llllIIIIlIIIlIlllIll, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public f(final double n, final double n2, final double n3) {
        this(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return this.lIIIIlIIIIIlllIllIII() == f.lIIIIlIIIIIlllIllIII() && this.lIIIlllIIIllIIIllIII() == f.lIIIlllIIIllIIIllIII() && this.llIIlIIIlIIIllIlIIIl() == f.llIIlIIIlIIIllIlIIIl();
    }
    
    @Override
    public int hashCode() {
        return (this.lIIIlllIIIllIIIllIII() + this.llIIlIIIlIIIllIlIIIl() * 31) * 31 + this.lIIIIlIIIIIlllIllIII();
    }
    
    public int IlIlIIIllIllIIIIIllI(final f f) {
        return (this.lIIIlllIIIllIIIllIII() == f.lIIIlllIIIllIIIllIII()) ? ((this.llIIlIIIlIIIllIlIIIl() == f.llIIlIIIlIIIllIlIIIl()) ? (this.lIIIIlIIIIIlllIllIII() - f.lIIIIlIIIIIlllIllIII()) : (this.llIIlIIIlIIIllIlIIIl() - f.llIIlIIIlIIIllIlIIIl())) : (this.lIIIlllIIIllIIIllIII() - f.lIIIlllIIIllIIIllIII());
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public f IlIIIlIlIIIllIlIlIIl(final f f) {
        return new f(this.lIIIlllIIIllIIIllIII() * f.llIIlIIIlIIIllIlIIIl() - this.llIIlIIIlIIIllIlIIIl() * f.lIIIlllIIIllIIIllIII(), this.llIIlIIIlIIIllIlIIIl() * f.lIIIIlIIIIIlllIllIII() - this.lIIIIlIIIIIlllIllIII() * f.llIIlIIIlIIIllIlIIIl(), this.lIIIIlIIIIIlllIllIII() * f.lIIIlllIIIllIIIllIII() - this.lIIIlllIIIllIIIllIII() * f.lIIIIlIIIIIlllIllIII());
    }
    
    public double IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3) {
        final double n4 = this.lIIIIlIIIIIlllIllIII() - n;
        final double n5 = this.lIIIlllIIIllIIIllIII() - n2;
        final double n6 = this.llIIlIIIlIIIllIlIIIl() - n3;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public double llIllIIIIIllIlIIIIlI(final double n, final double n2, final double n3) {
        final double n4 = this.lIIIIlIIIIIlllIllIII() + 0.5 - n;
        final double n5 = this.lIIIlllIIIllIIIllIII() + 0.5 - n2;
        final double n6 = this.llIIlIIIlIIIllIlIIIl() + 0.5 - n3;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }
    
    public double IllIIlllIIIIlllIIlIl(final f f) {
        return this.IlIlIlIlIlllllllllIl(f.lIIIIlIIIIIlllIllIII(), f.lIIIlllIIIllIIIllIII(), f.llIIlIIIlIIIllIlIIIl());
    }
    
    @Override
    public String toString() {
        return Objects.toStringHelper((Object)this).add("x", this.lIIIIlIIIIIlllIllIII()).add("y", this.lIIIlllIIIllIIIllIII()).add("z", this.llIIlIIIlIIIllIlIIIl()).toString();
    }
}
