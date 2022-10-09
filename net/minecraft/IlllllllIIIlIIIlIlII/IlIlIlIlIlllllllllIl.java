package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIlIlIlIlllllllllIl extends f
{
    public static final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private static final int llIllIIIIIllIlIIIIlI;
    private static final int IlIIIlIlIIIllIlIlIIl;
    private static final int IlIlIIIllIllIIIIIllI;
    private static final int IllIIlllIIIIlllIIlIl;
    private static final int llllIIIlIlllIlIIIIIl;
    private static final long lIIIIlIIIIIlllIllIII;
    private static final long lIIIlllIIIllIIIllIII;
    private static final long llIIlIIIlIIIllIlIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(0, 0, 0);
        llIllIIIIIllIlIIIIlI = 1 + llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(30000000));
        IlIIIlIlIIIllIlIlIIl = IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        IlIlIIIllIllIIIIIllI = 64 - IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI - IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
        IllIIlllIIIIlllIIlIl = 0 + IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
        llllIIIlIlllIlIIIIIl = IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl + IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
        lIIIIlIIIIIlllIllIII = (1L << IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) - 1L;
        lIIIlllIIIllIIIllIII = (1L << IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI) - 1L;
        llIIlIIIlIIIllIlIIIl = (1L << IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) - 1L;
    }
    
    public IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    public IlIlIlIlIlllllllllIl(final double n, final double n2, final double n3) {
        super(n, n2, n3);
    }
    
    public IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII, llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII);
    }
    
    public IlIlIlIlIlllllllllIl(final e e) {
        this(e.llllIIIIlIIIlIlllIll, e.IlIlIlIlIlllllllllIl, e.llIllIIIIIllIlIIIIlI);
    }
    
    public IlIlIlIlIlllllllllIl(final f f) {
        this(f.lIIIIlIIIIIlllIllIII(), f.lIIIlllIIIllIIIllIII(), f.llIIlIIIlIIIllIlIIIl());
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        return (n == 0.0 && n2 == 0.0 && n3 == 0.0) ? this : new IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII() + n, this.lIIIlllIIIllIIIllIII() + n2, this.llIIlIIIlIIIllIlIIIl() + n3);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return (n == 0 && n2 == 0 && n3 == 0) ? this : new IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII() + n, this.lIIIlllIIIllIIIllIII() + n2, this.llIIlIIIlIIIllIlIIIl() + n3);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final f f) {
        return (f.lIIIIlIIIIIlllIllIII() == 0 && f.lIIIlllIIIllIIIllIII() == 0 && f.llIIlIIIlIIIllIlIIIl() == 0) ? this : new IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII() + f.lIIIIlIIIIIlllIllIII(), this.lIIIlllIIIllIIIllIII() + f.lIIIlllIIIllIIIllIII(), this.llIIlIIIlIIIllIlIIIl() + f.llIIlIIIlIIIllIlIIIl());
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final f f) {
        return (f.lIIIIlIIIIIlllIllIII() == 0 && f.lIIIlllIIIllIIIllIII() == 0 && f.llIIlIIIlIIIllIlIIIl() == 0) ? this : new IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII() - f.lIIIIlIIIIIlllIllIII(), this.lIIIlllIIIllIIIllIII() - f.lIIIlllIIIllIIIllIII(), this.llIIlIIIlIIIllIlIIIl() - f.llIIlIIIlIIIllIlIIIl());
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll(1);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, n);
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl(1);
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final int n) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, n);
    }
    
    public IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI(1);
    }
    
    public IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, n);
    }
    
    public IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl(1);
    }
    
    public IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl(final int n) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, n);
    }
    
    public IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI(1);
    }
    
    public IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI(final int n) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, n);
    }
    
    public IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl(1);
    }
    
    public IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl(final int n) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, n);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, 1);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n) {
        return (n == 0) ? this : new IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII() + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII() * n, this.lIIIlllIIIllIIIllIII() + lllIllIIIllllllIllll.lIIIlllIIIllIIIllIII() * n, this.llIIlIIIlIIIllIlIIIl() + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl() * n);
    }
    
    public IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI(final f f) {
        return new IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII() * f.llIIlIIIlIIIllIlIIIl() - this.llIIlIIIlIIIllIlIIIl() * f.lIIIlllIIIllIIIllIII(), this.llIIlIIIlIIIllIlIIIl() * f.lIIIIlIIIIIlllIllIII() - this.lIIIIlIIIIIlllIllIII() * f.llIIlIIIlIIIllIlIIIl(), this.lIIIIlIIIIIlllIllIII() * f.lIIIlllIIIllIIIllIII() - this.lIIIlllIIIllIIIllIII() * f.lIIIIlIIIIIlllIllIII());
    }
    
    public long llllIIIlIlllIlIIIIIl() {
        return ((long)this.lIIIIlIIIIIlllIllIII() & IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) << IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl | ((long)this.lIIIlllIIIllIIIllIII() & IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) << IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl | ((long)this.llIIlIIIlIIIllIlIIIl() & IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) << 0;
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final long n) {
        return new IlIlIlIlIlllllllllIl((int)(n << 64 - IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl - IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI >> 64 - IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI), (int)(n << 64 - IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl - IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI >> 64 - IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI), (int)(n << 64 - IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl >> 64 - IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl));
    }
    
    public static Iterable llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        return new net.minecraft.IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(new IlIlIlIlIlllllllllIl(Math.min(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII()), Math.min(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII()), Math.min(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl())), new IlIlIlIlIlllllllllIl(Math.max(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII()), Math.max(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII()), Math.max(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl())));
    }
    
    public static Iterable IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        return new IlIlIIIllIllIIIIIllI(new IlIlIlIlIlllllllllIl(Math.min(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII()), Math.min(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII()), Math.min(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl())), new IlIlIlIlIlllllllllIl(Math.max(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII()), Math.max(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII()), Math.max(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl())));
    }
}
