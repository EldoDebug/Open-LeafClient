package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class llIllIlIlIIIIIIIllII extends lllllIlIIIlIlIIlllII implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 8572646365302599857L;
    
    public llIllIlIlIIIIIIIllII(final double n, final double n2) {
        super(n, n2);
    }
    
    public llIllIlIlIIIIIIIllII(final double[] array) {
        super(array);
    }
    
    public llIllIlIlIIIIIIIllII(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        super(llIllIlIlIIIIIIIllII);
    }
    
    public llIllIlIlIIIIIIIllII(final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl) {
        super(ilIlIlIIlIllIIIIIIl);
    }
    
    public llIllIlIlIIIIIIIllII(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        super(lllllIlIIIlIlIIlllII);
    }
    
    public llIllIlIlIIIIIIIllII(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super(lIllllllIIllIlIlIlII);
    }
    
    public llIllIlIlIIIIIIIllII() {
    }
    
    public final double llllIIIIlIIIlIlllIll(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        return this.llIllIIIIIllIlIIIIlI * llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final double IlIlIIIllIllIIIIIllI() {
        return Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public final double IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        final double n = 1.0 / Math.sqrt(llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI * llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI + llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl * llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl);
        this.llIllIIIIIllIlIIIIlI = llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl * n;
    }
    
    public final void llllIIIlIlllIlIIIIIl() {
        final double n = 1.0 / Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl);
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
    }
    
    public final double llIllIIIIIllIlIIIIlI(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        double n = this.llllIIIIlIIIlIlllIll(llIllIlIlIIIIIIIllII) / (this.IlIlIIIllIllIIIIIllI() * llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI());
        if (n < -1.0) {
            n = -1.0;
        }
        if (n > 1.0) {
            n = 1.0;
        }
        return Math.acos(n);
    }
}
