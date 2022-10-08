package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IllIllIlllIllllIIllI extends IIIIIllIIIIlIIIIllIl implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 3938123424117448700L;
    
    public IllIllIlllIllllIIllI(final double n, final double n2, final double n3, final double n4) {
        super(n, n2, n3, n4);
    }
    
    public IllIllIlllIllllIIllI(final double[] array) {
        super(array);
    }
    
    public IllIllIlllIllllIIllI(final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        super(illIllIlllIllllIIllI);
    }
    
    public IllIllIlllIllllIIllI(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        super(llIlIIIIIlIIlIlIIlll);
    }
    
    public IllIllIlllIllllIIllI(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        super(iiiiiiiiIlllIllIlIlI);
    }
    
    public IllIllIlllIllllIIllI(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        super(iiiiIllIIIIlIIIIllIl);
    }
    
    public IllIllIlllIllllIIllI(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        super(ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI, ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl, ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI, 0.0);
    }
    
    public IllIllIlllIllllIIllI() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.IllIIlllIIIIlllIIlIl = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.llllIIIlIlllIlIIIIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.lIIIIlIIIIIlllIllIII = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        this.lIIIlllIIIllIIIllIII = 0.0;
    }
    
    public final double llllIIIIlIIIlIlllIll() {
        return Math.sqrt(this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII);
    }
    
    public final double IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII;
    }
    
    public final double llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        return this.IllIIlllIIIIlllIIlIl * illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        final double n = 1.0 / Math.sqrt(illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl * illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl + illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl * illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl + illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII * illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII + illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII * illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII);
        this.IllIIlllIIIIlllIIlIl = illIllIlllIllllIIllI.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = illIllIlllIllllIIllI.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = illIllIlllIllllIIllI.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = illIllIlllIllllIIllI.lIIIlllIIIllIIIllIII * n;
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        final double n = 1.0 / Math.sqrt(this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII);
        this.IllIIlllIIIIlllIIlIl *= n;
        this.llllIIIlIlllIlIIIIIl *= n;
        this.lIIIIlIIIIIlllIllIII *= n;
        this.lIIIlllIIIllIIIllIII *= n;
    }
    
    public final double llIllIIIIIllIlIIIIlI(final IllIllIlllIllllIIllI illIllIlllIllllIIllI) {
        double n = this.llllIIIIlIIIlIlllIll(illIllIlllIllllIIllI) / (this.llllIIIIlIIIlIlllIll() * illIllIlllIllllIIllI.llllIIIIlIIIlIlllIll());
        if (n < -1.0) {
            n = -1.0;
        }
        if (n > 1.0) {
            n = 1.0;
        }
        return Math.acos(n);
    }
}
