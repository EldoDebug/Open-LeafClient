package net.minecraft.IlllllllIIIlIIIlIlII;

public class e
{
    public final double llllIIIIlIIIlIlllIll;
    public final double IlIlIlIlIlllllllllIl;
    public final double llIllIIIIIllIlIIIIlI;
    
    public e(double llllIIIIlIIIlIlllIll, double ilIlIlIlIlllllllllIl, double llIllIIIIIllIlIIIIlI) {
        if (llllIIIIlIIIlIlllIll == -0.0) {
            llllIIIIlIIIlIlllIll = 0.0;
        }
        if (ilIlIlIlIlllllllllIl == -0.0) {
            ilIlIlIlIlllllllllIl = 0.0;
        }
        if (llIllIIIIIllIlIIIIlI == -0.0) {
            llIllIIIIIllIlIIIIlI = 0.0;
        }
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public e(final f f) {
        this(f.lIIIIlIIIIIlllIllIII(), f.lIIIlllIIIllIIIllIII(), f.llIIlIIIlIIIllIlIIIl());
    }
    
    public e llllIIIIlIIIlIlllIll(final e e) {
        return new e(e.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll, e.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl, e.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI);
    }
    
    public e llllIIIIlIIIlIlllIll() {
        final double n = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI);
        return (n < 1.0E-4) ? new e(0.0, 0.0, 0.0) : new e(this.llllIIIIlIIIlIlllIll / n, this.IlIlIlIlIlllllllllIl / n, this.llIllIIIIIllIlIIIIlI / n);
    }
    
    public double IlIlIlIlIlllllllllIl(final e e) {
        return this.llllIIIIlIIIlIlllIll * e.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl * e.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * e.llIllIIIIIllIlIIIIlI;
    }
    
    public e llIllIIIIIllIlIIIIlI(final e e) {
        return new e(this.IlIlIlIlIlllllllllIl * e.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI * e.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI * e.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll * e.llIllIIIIIllIlIIIIlI, this.llllIIIIlIIIlIlllIll * e.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl * e.llllIIIIlIIIlIlllIll);
    }
    
    public e IlIIIlIlIIIllIlIlIIl(final e e) {
        return this.llllIIIIlIIIlIlllIll(e.llllIIIIlIIIlIlllIll, e.IlIlIlIlIlllllllllIl, e.llIllIIIIIllIlIIIIlI);
    }
    
    public e llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        return this.IlIlIlIlIlllllllllIl(-n, -n2, -n3);
    }
    
    public e IlIlIIIllIllIIIIIllI(final e e) {
        return this.IlIlIlIlIlllllllllIl(e.llllIIIIlIIIlIlllIll, e.IlIlIlIlIlllllllllIl, e.llIllIIIIIllIlIIIIlI);
    }
    
    public e IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3) {
        return new e(this.llllIIIIlIIIlIlllIll + n, this.IlIlIlIlIlllllllllIl + n2, this.llIllIIIIIllIlIIIIlI + n3);
    }
    
    public double IllIIlllIIIIlllIIlIl(final e e) {
        final double n = e.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll;
        final double n2 = e.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl;
        final double n3 = e.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI;
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n2 * n2 + n3 * n3);
    }
    
    public double llllIIIlIlllIlIIIIIl(final e e) {
        final double n = e.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll;
        final double n2 = e.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl;
        final double n3 = e.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public double IlIlIlIlIlllllllllIl() {
        return llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll * this.llllIIIIlIIIlIlllIll + this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI);
    }
    
    public e llllIIIIlIIIlIlllIll(final e e, final double n) {
        final double n2 = e.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll;
        final double n3 = e.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl;
        final double n4 = e.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI;
        if (n2 * n2 < 1.0000000116860974E-7) {
            return null;
        }
        final double n5 = (n - this.llllIIIIlIIIlIlllIll) / n2;
        return (n5 >= 0.0 && n5 <= 1.0) ? new e(this.llllIIIIlIIIlIlllIll + n2 * n5, this.IlIlIlIlIlllllllllIl + n3 * n5, this.llIllIIIIIllIlIIIIlI + n4 * n5) : null;
    }
    
    public e IlIlIlIlIlllllllllIl(final e e, final double n) {
        final double n2 = e.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll;
        final double n3 = e.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl;
        final double n4 = e.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI;
        if (n3 * n3 < 1.0000000116860974E-7) {
            return null;
        }
        final double n5 = (n - this.IlIlIlIlIlllllllllIl) / n3;
        return (n5 >= 0.0 && n5 <= 1.0) ? new e(this.llllIIIIlIIIlIlllIll + n2 * n5, this.IlIlIlIlIlllllllllIl + n3 * n5, this.llIllIIIIIllIlIIIIlI + n4 * n5) : null;
    }
    
    public e llIllIIIIIllIlIIIIlI(final e e, final double n) {
        final double n2 = e.llllIIIIlIIIlIlllIll - this.llllIIIIlIIIlIlllIll;
        final double n3 = e.IlIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl;
        final double n4 = e.llIllIIIIIllIlIIIIlI - this.llIllIIIIIllIlIIIIlI;
        if (n4 * n4 < 1.0000000116860974E-7) {
            return null;
        }
        final double n5 = (n - this.llIllIIIIIllIlIIIIlI) / n4;
        return (n5 >= 0.0 && n5 <= 1.0) ? new e(this.llllIIIIlIIIlIlllIll + n2 * n5, this.IlIlIlIlIlllllllllIl + n3 * n5, this.llIllIIIIIllIlIIIIlI + n4 * n5) : null;
    }
    
    @Override
    public String toString() {
        return "(" + this.llllIIIIlIIIlIlllIll + ", " + this.IlIlIlIlIlllllllllIl + ", " + this.llIllIIIIIllIlIIIIlI + ")";
    }
    
    public e llllIIIIlIIIlIlllIll(final float n) {
        final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n);
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n);
        return new e(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl - this.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll);
    }
    
    public e IlIlIlIlIlllllllllIl(final float n) {
        final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n);
        final float llllIIIIlIIIlIlllIll = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n);
        return new e(this.llllIIIIlIIIlIlllIll * ilIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl - this.llllIIIIlIIIlIlllIll * llllIIIIlIIIlIlllIll);
    }
}
