package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IIlIlIlIIlIllIIIIIIl extends lIllllllIIllIlIlIlII implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = -2168194326883512320L;
    
    public IIlIlIlIIlIllIIIIIIl(final float n, final float n2) {
        super(n, n2);
    }
    
    public IIlIlIlIIlIllIIIIIIl(final float[] array) {
        super(array);
    }
    
    public IIlIlIlIIlIllIIIIIIl(final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl) {
        super(ilIlIlIIlIllIIIIIIl);
    }
    
    public IIlIlIlIIlIllIIIIIIl(final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII) {
        super(llIllIlIlIIIIIIIllII);
    }
    
    public IIlIlIlIIlIllIIIIIIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super(lIllllllIIllIlIlIlII);
    }
    
    public IIlIlIlIIlIllIIIIIIl(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        super(lllllIlIIIlIlIIlllII);
    }
    
    public IIlIlIlIIlIllIIIIIIl() {
    }
    
    public final float llllIIIIlIIIlIlllIll(final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl) {
        return this.llIllIIIIIllIlIIIIlI * ilIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * ilIlIlIIlIllIIIIIIl.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final float IlIlIIIllIllIIIIIllI() {
        return (float)Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public final float IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl) {
        final float n = (float)(1.0 / Math.sqrt(ilIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI * ilIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI + ilIlIlIIlIllIIIIIIl.IlIIIlIlIIIllIlIlIIl * ilIlIlIIlIllIIIIIIl.IlIIIlIlIIIllIlIlIIl));
        this.llIllIIIIIllIlIIIIlI = ilIlIlIIlIllIIIIIIl.llIllIIIIIllIlIIIIlI * n;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIIlIllIIIIIIl.IlIIIlIlIIIllIlIlIIl * n;
    }
    
    public final void llllIIIlIlllIlIIIIIl() {
        final float n = (float)(1.0 / Math.sqrt(this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl));
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
    }
    
    public final float llIllIIIIIllIlIIIIlI(final IIlIlIlIIlIllIIIIIIl ilIlIlIIlIllIIIIIIl) {
        double n = this.llllIIIIlIIIlIlllIll(ilIlIlIIlIllIIIIIIl) / (this.IlIlIIIllIllIIIIIllI() * ilIlIlIIlIllIIIIIIl.IlIlIIIllIllIIIIIllI());
        if (n < -1.0) {
            n = -1.0;
        }
        if (n > 1.0) {
            n = 1.0;
        }
        return (float)Math.acos(n);
    }
}
