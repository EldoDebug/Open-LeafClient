package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IIlllIIlIllIllIlIIll extends IIlIIIIIllIlIIIlIIll implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 5718062286069042927L;
    
    public IIlllIIlIllIllIlIIll(final double n, final double n2, final double n3) {
        super(n, n2, n3);
    }
    
    public IIlllIIlIllIllIlIIll(final double[] array) {
        super(array);
    }
    
    public IIlllIIlIllIllIlIIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        super(illlIIlIllIllIlIIll);
    }
    
    public IIlllIIlIllIllIlIIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        super(lllIIIIlllllIlIIllIl);
    }
    
    public IIlllIIlIllIllIlIIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super(llllllIllIllIlIllllI);
    }
    
    public IIlllIIlIllIllIlIIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        super(ilIIIIIllIlIIIlIIll);
    }
    
    public IIlllIIlIllIllIlIIll() {
    }
    
    public final double llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        final double n = this.llIllIIIIIllIlIIIIlI - illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI;
        final double n2 = this.IlIIIlIlIIIllIlIlIIl - illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl;
        final double n3 = this.IlIlIIIllIllIIIIIllI - illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public final double IlIlIlIlIlllllllllIl(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        final double n = this.llIllIIIIIllIlIIIIlI - illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI;
        final double n2 = this.IlIIIlIlIIIllIlIlIIl - illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl;
        final double n3 = this.IlIlIIIllIllIIIIIllI - illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI;
        return Math.sqrt(n * n + n2 * n2 + n3 * n3);
    }
    
    public final double llIllIIIIIllIlIIIIlI(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        return Math.abs(this.llIllIIIIIllIlIIIIlI - illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI) + Math.abs(this.IlIIIlIlIIIllIlIlIIl - illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl) + Math.abs(this.IlIlIIIllIllIIIIIllI - illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI);
    }
    
    public final double IlIIIlIlIIIllIlIlIIl(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        return Math.max(Math.max(Math.abs(this.llIllIIIIIllIlIIIIlI - illlIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI), Math.abs(this.IlIIIlIlIIIllIlIlIIl - illlIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl)), Math.abs(this.IlIlIIIllIllIIIIIllI - illlIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI));
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        final double n = 1.0 / illIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII;
        this.llIllIIIIIllIlIIIIlI = illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl * n;
        this.IlIIIlIlIIIllIlIlIIl = illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl * n;
        this.IlIlIIIllIllIIIIIllI = illIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII * n;
    }
}
