package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IIIIlllIIIIIIlIIIlll extends lllllIlIIIlIlIIlllII implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 1133748791492571954L;
    
    public IIIIlllIIIIIIlIIIlll(final double n, final double n2) {
        super(n, n2);
    }
    
    public IIIIlllIIIIIIlIIIlll(final double[] array) {
        super(array);
    }
    
    public IIIIlllIIIIIIlIIIlll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super(iiiIlllIIIIIIlIIIlll);
    }
    
    public IIIIlllIIIIIIlIIIlll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        super(llllIIllllIlIlIIIIll);
    }
    
    public IIIIlllIIIIIIlIIIlll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        super(lllllIlIIIlIlIIlllII);
    }
    
    public IIIIlllIIIIIIlIIIlll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super(lIllllllIIllIlIlIlII);
    }
    
    public IIIIlllIIIIIIlIIIlll() {
    }
    
    public final double llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final double n = this.llIllIIIIIllIlIIIIlI - iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI;
        final double n2 = this.IlIIIlIlIIIllIlIlIIl - iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl;
        return n * n + n2 * n2;
    }
    
    public final double IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final double n = this.llIllIIIIIllIlIIIIlI - iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI;
        final double n2 = this.IlIIIlIlIIIllIlIlIIl - iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl;
        return Math.sqrt(n * n + n2 * n2);
    }
    
    public final double llIllIIIIIllIlIIIIlI(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        return Math.abs(this.llIllIIIIIllIlIIIIlI - iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI) + Math.abs(this.IlIIIlIlIIIllIlIlIIl - iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl);
    }
    
    public final double IlIIIlIlIIIllIlIlIIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        return Math.max(Math.abs(this.llIllIIIIIllIlIIIIlI - iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI), Math.abs(this.IlIIIlIlIIIllIlIlIIl - iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl));
    }
}
