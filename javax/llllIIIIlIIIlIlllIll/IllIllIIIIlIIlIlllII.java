package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IllIllIIIIlIIlIlllII extends IIlIIIIIllIlIIIlIIll implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 3761969948420550442L;
    
    public IllIllIIIIlIIlIlllII(final double n, final double n2, final double n3) {
        super(n, n2, n3);
    }
    
    public IllIllIIIIlIIlIlllII(final double[] array) {
        super(array);
    }
    
    public IllIllIIIIlIIlIlllII(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        super(illIllIIIIlIIlIlllII);
    }
    
    public IllIllIIIIlIIlIlllII(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
        super(ilIllllIIlIIlIlIlIll);
    }
    
    public IllIllIIIIlIIlIlllII(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        super(llllllIllIllIlIllllI);
    }
    
    public IllIllIIIIlIIlIlllII(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        super(ilIIIIIllIlIIIlIIll);
    }
    
    public IllIllIIIIlIIlIlllII() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII2) {
        final double llIllIIIIIllIlIIIIlI = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl * illIllIIIIlIIlIlllII2.IlIlIIIllIllIIIIIllI - illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI * illIllIIIIlIIlIlllII2.IlIIIlIlIIIllIlIlIIl;
        final double ilIIIlIlIIIllIlIlIIl = illIllIIIIlIIlIlllII2.llIllIIIIIllIlIIIIlI * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI - illIllIIIIlIIlIlllII2.IlIlIIIllIllIIIIIllI * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI * illIllIIIIlIIlIlllII2.IlIIIlIlIIIllIlIlIIl - illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl * illIllIIIIlIIlIlllII2.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        final double n = 1.0 / Math.sqrt(illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl + illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI);
        this.llIllIIIIIllIlIIIIlI = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl * n;
        this.IlIlIIIllIllIIIIIllI = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI * n;
    }
    
    public final void IllIIlllIIIIlllIIlIl() {
        final double n = 1.0 / Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl + this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI);
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
    }
    
    public final double IlIlIlIlIlllllllllIl(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        return this.llIllIIIIIllIlIIIIlI * illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl + this.IlIlIIIllIllIIIIIllI * illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
    }
    
    public final double llllIIIlIlllIlIIIIIl() {
        return this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl + this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI;
    }
    
    public final double lIIIIlIIIIIlllIllIII() {
        return Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl + this.IlIlIIIllIllIIIIIllI * this.IlIlIIIllIllIIIIIllI);
    }
    
    public final double llIllIIIIIllIlIIIIlI(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII) {
        double n = this.IlIlIlIlIlllllllllIl(illIllIIIIlIIlIlllII) / (this.lIIIIlIIIIIlllIllIII() * illIllIIIIlIIlIlllII.lIIIIlIIIIIlllIllIII());
        if (n < -1.0) {
            n = -1.0;
        }
        if (n > 1.0) {
            n = 1.0;
        }
        return Math.acos(n);
    }
}
