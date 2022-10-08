package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IlIllllIIlIIlIlIlIll extends llllllIllIllIlIllllI implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = -7031930069184524614L;
    
    public IlIllllIIlIIlIlIlIll(final float n, final float n2, final float n3) {
        super(n, n2, n3);
    }
    
    public IlIllllIIlIIlIlIlIll(final float[] array) {
        super(array);
    }
    
    public IlIllllIIlIIlIlIlIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        super(ilIllllIIlIIlIlIlIll);
    }
    
    public IlIllllIIlIIlIlIlIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        super(illIllIIIIlIIlIlllII);
    }
    
    public IlIllllIIlIIlIlIlIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super(llllllIllIllIlIllllI);
    }
    
    public IlIllllIIlIIlIlIlIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        super(ilIIIIIllIlIIIlIIll);
    }
    
    public IlIllllIIlIIlIlIlIll() {
    }
    
    public final float llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl + this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI;
    }
    
    public final float llllIIIlIlllIlIIIIIl() {
        return (float)Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl + this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI);
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll2) {
        final float llIllIIIIIllIlIIIIlI = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl * ilIllllIIlIIlIlIlIll2.IlIlIIIllIllIIIIIllI - ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI * ilIllllIIlIIlIlIlIll2.IlIIIlIlIIIllIlIlIIl;
        final float ilIIIlIlIIIllIlIlIIl = ilIllllIIlIIlIlIlIll2.llIllIIIIIllIlIIIIlI * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI - ilIllllIIlIIlIlIlIll2.IlIlIIIllIllIIIIIllI * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI * ilIllllIIlIIlIlIlIll2.IlIIIlIlIIIllIlIlIIl - ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl * ilIllllIIlIIlIlIlIll2.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final float llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        return this.llIllIIIIIllIlIIIIlI * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + this.IlIlIIIllIllIIIIIllI * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        final float n = (float)(1.0 / Math.sqrt(ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI * ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI + ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl * ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl + ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI * ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI));
        this.llIllIIIIIllIlIIIIlI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl * n;
        this.IlIlIIIllIllIIIIIllI = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI * n;
    }
    
    public final void lIIIIlIIIIIlllIllIII() {
        final float n = (float)(1.0 / Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl + this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI));
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
    }
    
    public final float llIllIIIIIllIlIIIIlI(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        double n = this.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll) / (this.llllIIIlIlllIlIIIIIl() * ilIllllIIlIIlIlIlIll.llllIIIlIlllIlIIIIIl());
        if (n < -1.0) {
            n = -1.0;
        }
        if (n > 1.0) {
            n = 1.0;
        }
        return (float)Math.acos(n);
    }
}
