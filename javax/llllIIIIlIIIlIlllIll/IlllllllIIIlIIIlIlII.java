package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IlllllllIIIlIIIlIlII extends IIIIIllIIIIlIIIIllIl implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 7577479888820201099L;
    static final double IlIlIlIlIlllllllllIl = 1.0E-12;
    static final double llIllIIIIIllIlIIIIlI = 1.0E-30;
    static final double IlIIIlIlIIIllIlIlIIl = 1.57079632679;
    
    public IlllllllIIIlIIIlIlII(final double n, final double n2, final double n3, final double n4) {
        final double n5 = 1.0 / Math.sqrt(n * n + n2 * n2 + n3 * n3 + n4 * n4);
        this.IllIIlllIIIIlllIIlIl = n * n5;
        this.llllIIIlIlllIlIIIIIl = n2 * n5;
        this.lIIIIlIIIIIlllIllIII = n3 * n5;
        this.lIIIlllIIIllIIIllIII = n4 * n5;
    }
    
    public IlllllllIIIlIIIlIlII(final double[] array) {
        final double n = 1.0 / Math.sqrt(array[0] * array[0] + array[1] * array[1] + array[2] * array[2] + array[3] * array[3]);
        this.IllIIlllIIIIlllIIlIl = array[0] * n;
        this.llllIIIlIlllIlIIIIIl = array[1] * n;
        this.lIIIIlIIIIIlllIllIII = array[2] * n;
        this.lIIIlllIIIllIIIllIII = array[3] * n;
    }
    
    public IlllllllIIIlIIIlIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IlllllllIIIlIIIlIlII(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        super(ilIIIIlllIlllllIlII);
    }
    
    public IlllllllIIIlIIIlIlII(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        final double n = 1.0 / Math.sqrt(iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
        this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII * n;
    }
    
    public IlllllllIIIlIIIlIlII(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        final double n = 1.0 / Math.sqrt(iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII);
        this.IllIIlllIIIIlllIIlIl = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII * n;
    }
    
    public IlllllllIIIlIIIlIlII() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this.IllIIlllIIIIlllIIlIl = -illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.IllIIlllIIIIlllIIlIl = -this.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -this.lIIIIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII2) {
        if (this != illlllllIIIlIIIlIlII && this != illlllllIIIlIIIlIlII2) {
            this.lIIIlllIIIllIIIllIII = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII - illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl - illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII;
            this.IllIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl;
            this.llllIIIlIlllIlIIIIIl = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl;
            this.lIIIIlIIIIIlllIllIII = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl;
        }
        else {
            final double liiIlllIIIllIIIllIII = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII - illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl - illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII;
            final double illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII - illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl;
            final double llllIIIlIlllIlIIIIIl = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl;
            this.lIIIIlIIIIIlllIllIII = illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl - illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final double liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII - this.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - this.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
        final double illIIlllIIIIlllIIlIl = this.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII - this.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
        final double llllIIIlIlllIlIIIIIl = this.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + this.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = this.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl - this.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII2) {
        final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII3 = new IlllllllIIIlIIIlIlII(illlllllIIIlIIIlIlII2);
        illlllllIIIlIIIlIlII3.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, illlllllIIIlIIIlIlII3);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII2 = new IlllllllIIIlIIIlIlII(illlllllIIIlIIIlIlII);
        illlllllIIIlIIIlIlII2.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII2);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final double n = 1.0 / (illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII + illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII = n * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = -n * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -n * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -n * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl() {
        final double n = 1.0 / (this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII + this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII *= n;
        this.IllIIlllIIIIlllIIlIl *= -n;
        this.llllIIIlIlllIlIIIIIl *= -n;
        this.lIIIIlIIIIIlllIllIII *= -n;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final double n = illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
        if (n > 0.0) {
            final double n2 = 1.0 / Math.sqrt(n);
            this.IllIIlllIIIIlllIIlIl = n2 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = n2 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = n2 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = n2 * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 0.0;
            this.lIIIlllIIIllIIIllIII = 0.0;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        final double n = this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII;
        if (n > 0.0) {
            final double n2 = 1.0 / Math.sqrt(n);
            this.IllIIlllIIIIlllIIlIl *= n2;
            this.llllIIIlIlllIlIIIIIl *= n2;
            this.lIIIIlIIIIIlllIllIII *= n2;
            this.lIIIlllIIIllIIIllIII *= n2;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 0.0;
            this.lIIIlllIIIllIIIllIII = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final double n = 0.25 * (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll);
        if (n < 0.0) {
            this.lIIIlllIIIllIIIllIII = 0.0;
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 1.0;
            return;
        }
        if (n >= 1.0E-30) {
            this.lIIIlllIIIllIIIllIII = Math.sqrt(n);
            final double n2 = 0.25 / this.lIIIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = (lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI - lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII) * n2;
            this.llllIIIlIlllIlIIIIIl = (lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl - lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl) * n2;
            this.lIIIIlIIIIIlllIllIII = (lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl - lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI) * n2;
            return;
        }
        this.lIIIlllIIIllIIIllIII = 0.0;
        final double n3 = -0.5 * (lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI);
        if (n3 < 0.0) {
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 1.0;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.IllIIlllIIIIlllIIlIl = Math.sqrt(n3);
            final double n4 = 1.0 / (2.0 * this.IllIIlllIIIIlllIIlIl);
            this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * n4;
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * n4;
            return;
        }
        this.IllIIlllIIIIlllIIlIl = 0.0;
        final double n5 = 0.5 * (1.0 - lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI);
        if (n5 >= 1.0E-30) {
            this.llllIIIlIlllIlIIIIIl = Math.sqrt(n5);
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI / (2.0 * this.llllIIIlIlllIlIIIIIl);
            return;
        }
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final double n = 0.25 * (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll);
        if (n < 0.0) {
            this.lIIIlllIIIllIIIllIII = 0.0;
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 1.0;
            return;
        }
        if (n >= 1.0E-30) {
            this.lIIIlllIIIllIIIllIII = Math.sqrt(n);
            final double n2 = 0.25 / this.lIIIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = (llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI - llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII) * n2;
            this.llllIIIlIlllIlIIIIIl = (llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl - llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl) * n2;
            this.lIIIIlIIIIIlllIllIII = (llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl - llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI) * n2;
            return;
        }
        this.lIIIlllIIIllIIIllIII = 0.0;
        final double n3 = -0.5 * (llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI);
        if (n3 < 0.0) {
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 1.0;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.IllIIlllIIIIlllIIlIl = Math.sqrt(n3);
            final double n4 = 0.5 / this.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * n4;
            this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * n4;
            return;
        }
        this.IllIIlllIIIIlllIIlIl = 0.0;
        final double n5 = 0.5 * (1.0 - llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI);
        if (n5 >= 1.0E-30) {
            this.llllIIIlIlllIlIIIIIl = Math.sqrt(n5);
            this.lIIIIlIIIIIlllIllIII = llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI / (2.0 * this.llllIIIlIlllIlIIIIIl);
            return;
        }
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final double n = 0.25 * (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl + 1.0);
        if (n < 0.0) {
            this.lIIIlllIIIllIIIllIII = 0.0;
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 1.0;
            return;
        }
        if (n >= 1.0E-30) {
            this.lIIIlllIIIllIIIllIII = Math.sqrt(n);
            final double n2 = 0.25 / this.lIIIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = (llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII - llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl) * n2;
            this.llllIIIlIlllIlIIIIIl = (llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl - llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII) * n2;
            this.lIIIIlIIIIIlllIllIII = (llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI - llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) * n2;
            return;
        }
        this.lIIIlllIIIllIIIllIII = 0.0;
        final double n3 = -0.5 * (llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl);
        if (n3 < 0.0) {
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 1.0;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.IllIIlllIIIIlllIIlIl = Math.sqrt(n3);
            final double n4 = 0.5 / this.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * n4;
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * n4;
            return;
        }
        this.IllIIlllIIIIlllIIlIl = 0.0;
        final double n5 = 0.5 * (1.0 - llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl);
        if (n5 >= 1.0E-30) {
            this.llllIIIlIlllIlIIIIIl = Math.sqrt(n5);
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII / (2.0 * this.llllIIIlIlllIlIIIIIl);
        }
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double n = 0.25 * (liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl + 1.0);
        if (n < 0.0) {
            this.lIIIlllIIIllIIIllIII = 0.0;
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 1.0;
            return;
        }
        if (n >= 1.0E-30) {
            this.lIIIlllIIIllIIIllIII = Math.sqrt(n);
            final double n2 = 0.25 / this.lIIIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = (liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl) * n2;
            this.llllIIIlIlllIlIIIIIl = (liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII) * n2;
            this.lIIIIlIIIIIlllIllIII = (liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI) * n2;
            return;
        }
        this.lIIIlllIIIllIIIllIII = 0.0;
        final double n3 = -0.5 * (liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl);
        if (n3 < 0.0) {
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 1.0;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.IllIIlllIIIIlllIIlIl = Math.sqrt(n3);
            final double n4 = 0.5 / this.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * n4;
            this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * n4;
            return;
        }
        this.IllIIlllIIIIlllIIlIl = 0.0;
        final double n5 = 0.5 * (1.0 - liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl);
        if (n5 >= 1.0E-30) {
            this.llllIIIlIlllIlIIIIIl = Math.sqrt(n5);
            this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII / (2.0 * this.llllIIIlIlllIlIIIIIl);
            return;
        }
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 1.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final double sqrt = Math.sqrt(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI + ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.0E-12) {
            this.lIIIlllIIIllIIIllIII = 0.0;
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 0.0;
        }
        else {
            final double sin = Math.sin(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI / 2.0);
            final double n = 1.0 / sqrt;
            this.lIIIlllIIIllIIIllIII = Math.cos(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI / 2.0);
            this.IllIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * n * sin;
            this.llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * n * sin;
            this.lIIIIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * n * sin;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final double sqrt = Math.sqrt(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        if (sqrt < 1.0E-12) {
            this.lIIIlllIIIllIIIllIII = 0.0;
            this.IllIIlllIIIIlllIIlIl = 0.0;
            this.llllIIIlIlllIlIIIIIl = 0.0;
            this.lIIIIlIIIIIlllIllIII = 0.0;
        }
        else {
            final double n = 1.0 / sqrt;
            final double sin = Math.sin(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI / 2.0);
            this.lIIIlllIIIllIIIllIII = Math.cos(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI / 2.0);
            this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n * sin;
            this.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n * sin;
            this.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * n * sin;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n) {
        double n2 = this.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
        if (n2 < 0.0) {
            illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl = -illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
            illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl = -illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII = -illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
            illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII = -illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
            n2 = -n2;
        }
        double n3;
        double n4;
        if (1.0 - n2 > 1.0E-12) {
            final double acos = Math.acos(n2);
            final double sin = Math.sin(acos);
            n3 = Math.sin((1.0 - n) * acos) / sin;
            n4 = Math.sin(n * acos) / sin;
        }
        else {
            n3 = 1.0 - n;
            n4 = n;
        }
        this.lIIIlllIIIllIIIllIII = n3 * this.lIIIlllIIIllIIIllIII + n4 * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = n3 * this.IllIIlllIIIIlllIIlIl + n4 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n3 * this.llllIIIlIlllIlIIIIIl + n4 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n3 * this.lIIIIlIIIIIlllIllIII + n4 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII2, final double n) {
        double n2 = illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
        if (n2 < 0.0) {
            illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl = -illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl;
            illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl = -illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl;
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII = -illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
            illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII = -illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII;
            n2 = -n2;
        }
        double n3;
        double n4;
        if (1.0 - n2 > 1.0E-12) {
            final double acos = Math.acos(n2);
            final double sin = Math.sin(acos);
            n3 = Math.sin((1.0 - n) * acos) / sin;
            n4 = Math.sin(n * acos) / sin;
        }
        else {
            n3 = 1.0 - n;
            n4 = n;
        }
        this.lIIIlllIIIllIIIllIII = n3 * illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII + n4 * illlllllIIIlIIIlIlII2.lIIIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = n3 * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + n4 * illlllllIIIlIIIlIlII2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n3 * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + n4 * illlllllIIIlIIIlIlII2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n3 * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII + n4 * illlllllIIIlIIIlIlII2.lIIIIlIIIIIlllIllIII;
    }
}
