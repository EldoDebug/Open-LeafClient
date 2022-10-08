package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IIllIIllIIIlIlIIIIlI extends IIIIIllIIIIlIIIIllIl implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 1733471895962736949L;
    
    public IIllIIllIIIlIlIIIIlI(final double n, final double n2, final double n3, final double n4) {
        super(n, n2, n3, n4);
    }
    
    public IIllIIllIIIlIlIIIIlI(final double[] array) {
        super(array);
    }
    
    public IIllIIllIIIlIlIIIIlI(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        super(illIIllIIIlIlIIIIlI);
    }
    
    public IIllIIllIIIlIlIIIIlI(final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll) {
        super(iiIlIIIlIlIIlllIIlll);
    }
    
    public IIllIIllIIIlIlIIIIlI(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        super(iiiiiiiiIlllIllIlIlI);
    }
    
    public IIllIIllIIIlIlIIIIlI(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        super(iiiiIllIIIIlIIIIllIl);
    }
    
    public IIllIIllIIIlIlIIIIlI(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        super(ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI, ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl, ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI, 1.0);
    }
    
    public IIllIIllIIIlIlIIIIlI() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.IllIIlllIIIIlllIIlIl = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.lIIIIlIIIIIlllIllIII = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        this.lIIIlllIIIllIIIllIII = 1.0;
    }
    
    public final double llllIIIIlIIIlIlllIll(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        final double n = this.IllIIlllIIIIlllIIlIl - illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl;
        final double n2 = this.llllIIIlIlllIlIIIIIl - illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl;
        final double n3 = this.lIIIIlIIIIIlllIllIII - illIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII;
        final double n4 = this.lIIIlllIIIllIIIllIII - illIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII;
        return n * n + n2 * n2 + n3 * n3 + n4 * n4;
    }
    
    public final double IlIlIlIlIlllllllllIl(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        final double n = this.IllIIlllIIIIlllIIlIl - illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl;
        final double n2 = this.llllIIIlIlllIlIIIIIl - illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl;
        final double n3 = this.lIIIIlIIIIIlllIllIII - illIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII;
        final double n4 = this.lIIIlllIIIllIIIllIII - illIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII;
        return Math.sqrt(n * n + n2 * n2 + n3 * n3 + n4 * n4);
    }
    
    public final double llIllIIIIIllIlIIIIlI(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        return Math.abs(this.IllIIlllIIIIlllIIlIl - illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl) + Math.abs(this.llllIIIlIlllIlIIIIIl - illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl) + Math.abs(this.lIIIIlIIIIIlllIllIII - illIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII) + Math.abs(this.lIIIlllIIIllIIIllIII - illIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII);
    }
    
    public final double IlIIIlIlIIIllIlIlIIl(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        return Math.max(Math.max(Math.abs(this.IllIIlllIIIIlllIIlIl - illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl), Math.abs(this.llllIIIlIlllIlIIIIIl - illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl)), Math.max(Math.abs(this.lIIIIlIIIIIlllIllIII - illIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII), Math.abs(this.lIIIlllIIIllIIIllIII - illIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII)));
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        final double n = 1.0 / illIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = illIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = 1.0;
    }
}
