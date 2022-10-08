package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IIlIIIIlllIlllllIlII extends IIIIIIIIIlllIllIlIlI implements Serializable
{
    static final long llllIIIIlIIIlIlllIll = 2675933778405442383L;
    static final double IlIlIlIlIlllllllllIl = 1.0E-6;
    static final double llIllIIIIIllIlIIIIlI = 1.0E-30;
    static final double IlIIIlIlIIIllIlIlIIl = 1.57079632679;
    
    public IIlIIIIlllIlllllIlII(final float n, final float n2, final float n3, final float n4) {
        final float n5 = (float)(1.0 / Math.sqrt(n * n + n2 * n2 + n3 * n3 + n4 * n4));
        this.IllIIlllIIIIlllIIlIl = n * n5;
        this.llllIIIlIlllIlIIIIIl = n2 * n5;
        this.lIIIIlIIIIIlllIllIII = n3 * n5;
        this.lIIIlllIIIllIIIllIII = n4 * n5;
    }
    
    public IIlIIIIlllIlllllIlII(final float[] array) {
        final float n = (float)(1.0 / Math.sqrt(array[0] * array[0] + array[1] * array[1] + array[2] * array[2] + array[3] * array[3]));
        this.IllIIlllIIIIlllIIlIl = array[0] * n;
        this.llllIIIlIlllIlIIIIIl = array[1] * n;
        this.lIIIIlIIIIIlllIllIII = array[2] * n;
        this.lIIIlllIIIllIIIllIII = array[3] * n;
    }
    
    public IIlIIIIlllIlllllIlII(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        super(ilIIIIlllIlllllIlII);
    }
    
    public IIlIIIIlllIlllllIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
    }
    
    public IIlIIIIlllIlllllIlII(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        final float n = (float)(1.0 / Math.sqrt(iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII));
        this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl * n;
        this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl * n;
        this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII * n;
        this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII * n;
    }
    
    public IIlIIIIlllIlllllIlII(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        final double n = 1.0 / Math.sqrt(iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII);
        this.IllIIlllIIIIlllIIlIl = (float)(iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl * n);
        this.llllIIIlIlllIlIIIIIl = (float)(iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl * n);
        this.lIIIIlIIIIIlllIllIII = (float)(iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII * n);
        this.lIIIlllIIIllIIIllIII = (float)(iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII * n);
    }
    
    public IIlIIIIlllIlllllIlII() {
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        this.IllIIlllIIIIlllIIlIl = -ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.IllIIlllIIIIlllIIlIl = -this.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -this.lIIIIlIIIIIlllIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII2) {
        if (this != ilIIIIlllIlllllIlII && this != ilIIIIlllIlllllIlII2) {
            this.lIIIlllIIIllIIIllIII = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII - ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl - ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII;
            this.IllIIlllIIIIlllIIlIl = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl;
            this.llllIIIlIlllIlIIIIIl = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl;
            this.lIIIIlIIIIIlllIllIII = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl;
        }
        else {
            final float liiIlllIIIllIIIllIII = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII - ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl - ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII;
            final float illIIlllIIIIlllIIlIl = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII - ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl;
            final float llllIIIlIlllIlIIIIIl = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl;
            this.lIIIIlIIIIIlllIllIII = ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl - ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl;
            this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final float liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII - this.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - this.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        final float illIIlllIIIIlllIIlIl = this.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII - this.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
        final float llllIIIlIlllIlIIIIIl = this.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + this.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = this.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * this.lIIIIlIIIIIlllIllIII + this.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl - this.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII2) {
        final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII3 = new IIlIIIIlllIlllllIlII(ilIIIIlllIlllllIlII2);
        ilIIIIlllIlllllIlII3.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll(ilIIIIlllIlllllIlII, ilIIIIlllIlllllIlII3);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII2 = new IIlIIIIlllIlllllIlII(ilIIIIlllIlllllIlII);
        ilIIIIlllIlllllIlII2.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl(ilIIIIlllIlllllIlII2);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final float n = 1.0f / (ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII + ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII = n * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
        this.IllIIlllIIIIlllIIlIl = -n * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -n * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -n * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl() {
        final float n = 1.0f / (this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII + this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII *= n;
        this.IllIIlllIIIIlllIIlIl *= -n;
        this.llllIIIlIlllIlIIIIIl *= -n;
        this.lIIIIlIIIIIlllIllIII *= -n;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final float n = ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
        if (n > 0.0f) {
            final float n2 = 1.0f / (float)Math.sqrt(n);
            this.IllIIlllIIIIlllIIlIl = n2 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = n2 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = n2 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
            this.lIIIlllIIIllIIIllIII = n2 * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
            this.lIIIlllIIIllIIIllIII = 0.0f;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        final float n = this.IllIIlllIIIIlllIIlIl * this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * this.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * this.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * this.lIIIlllIIIllIIIllIII;
        if (n > 0.0f) {
            final float n2 = 1.0f / (float)Math.sqrt(n);
            this.IllIIlllIIIIlllIIlIl *= n2;
            this.llllIIIlIlllIlIIIIIl *= n2;
            this.lIIIIlIIIIIlllIllIII *= n2;
            this.lIIIlllIIIllIIIllIII *= n2;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
            this.lIIIlllIIIllIIIllIII = 0.0f;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final float n = 0.25f * (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl + lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI + lIlIlIIIllIIllIIIllI.IIlllIIlIllIllIlIIll);
        if (n < 0.0f) {
            this.lIIIlllIIIllIIIllIII = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 1.0f;
            return;
        }
        if (n >= 1.0E-30) {
            this.lIIIlllIIIllIIIllIII = (float)Math.sqrt(n);
            final float n2 = 0.25f / this.lIIIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = (lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI - lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII) * n2;
            this.llllIIIlIlllIlIIIIIl = (lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl - lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl) * n2;
            this.lIIIIlIIIIIlllIllIII = (lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl - lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI) * n2;
            return;
        }
        this.lIIIlllIIIllIIIllIII = 0.0f;
        final float n3 = -0.5f * (lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl + lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI);
        if (n3 < 0.0f) {
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 1.0f;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.IllIIlllIIIIlllIIlIl = (float)Math.sqrt(n3);
            final float n4 = 1.0f / (2.0f * this.IllIIlllIIIIlllIIlIl);
            this.llllIIIlIlllIlIIIIIl = lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl * n4;
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl * n4;
            return;
        }
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        final float n5 = 0.5f * (1.0f - lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI);
        if (n5 >= 1.0E-30) {
            this.llllIIIlIlllIlIIIIIl = (float)Math.sqrt(n5);
            this.lIIIIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI / (2.0f * this.llllIIIlIlllIlIIIIIl);
            return;
        }
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final double n = 0.25 * (llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl + llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI + llIllIlIIIIllIlIIllI.IIlllIIlIllIllIlIIll);
        if (n < 0.0) {
            this.lIIIlllIIIllIIIllIII = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 1.0f;
            return;
        }
        if (n >= 1.0E-30) {
            this.lIIIlllIIIllIIIllIII = (float)Math.sqrt(n);
            final double n2 = 0.25 / this.lIIIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = (float)((llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI - llIllIlIIIIllIlIIllI.lIIIIlIIIIIlllIllIII) * n2);
            this.llllIIIlIlllIlIIIIIl = (float)((llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl - llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl) * n2);
            this.lIIIIlIIIIIlllIllIII = (float)((llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl - llIllIlIIIIllIlIIllI.llIllIIIIIllIlIIIIlI) * n2);
            return;
        }
        this.lIIIlllIIIllIIIllIII = 0.0f;
        final double n3 = -0.5 * (llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI);
        if (n3 < 0.0) {
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 1.0f;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.IllIIlllIIIIlllIIlIl = (float)Math.sqrt(n3);
            final double n4 = 0.5 / this.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = (float)(llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl * n4);
            this.lIIIIlIIIIIlllIllIII = (float)(llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl * n4);
            return;
        }
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        final double n5 = 0.5 * (1.0 - llIllIlIIIIllIlIIllI.lIlIlIIIllIIllIIIllI);
        if (n5 >= 1.0E-30) {
            this.llllIIIlIlllIlIIIIIl = (float)Math.sqrt(n5);
            this.lIIIIlIIIIIlllIllIII = (float)(llIllIlIIIIllIlIIllI.llIllIlIIIIllIlIIllI / (2.0 * this.llllIIIlIlllIlIIIIIl));
            return;
        }
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final float n = 0.25f * (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl + 1.0f);
        if (n < 0.0f) {
            this.lIIIlllIIIllIIIllIII = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 1.0f;
            return;
        }
        if (n >= 1.0E-30) {
            this.lIIIlllIIIllIIIllIII = (float)Math.sqrt(n);
            final float n2 = 0.25f / this.lIIIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = (llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII - llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl) * n2;
            this.llllIIIlIlllIlIIIIIl = (llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl - llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII) * n2;
            this.lIIIIlIIIIIlllIllIII = (llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI - llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI) * n2;
            return;
        }
        this.lIIIlllIIIllIIIllIII = 0.0f;
        final float n3 = -0.5f * (llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl);
        if (n3 < 0.0f) {
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 1.0f;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.IllIIlllIIIIlllIIlIl = (float)Math.sqrt(n3);
            final float n4 = 0.5f / this.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI * n4;
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII * n4;
            return;
        }
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        final float n5 = 0.5f * (1.0f - llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl);
        if (n5 >= 1.0E-30) {
            this.llllIIIlIlllIlIIIIIl = (float)Math.sqrt(n5);
            this.lIIIIlIIIIIlllIllIII = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII / (2.0f * this.llllIIIlIlllIlIIIIIl);
            return;
        }
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final double n = 0.25 * (liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl + 1.0);
        if (n < 0.0) {
            this.lIIIlllIIIllIIIllIII = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 1.0f;
            return;
        }
        if (n >= 1.0E-30) {
            this.lIIIlllIIIllIIIllIII = (float)Math.sqrt(n);
            final double n2 = 0.25 / this.lIIIlllIIIllIIIllIII;
            this.IllIIlllIIIIlllIIlIl = (float)((liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl) * n2);
            this.llllIIIlIlllIlIIIIIl = (float)((liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII) * n2);
            this.lIIIIlIIIIIlllIllIII = (float)((liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI) * n2);
            return;
        }
        this.lIIIlllIIIllIIIllIII = 0.0f;
        final double n3 = -0.5 * (liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl);
        if (n3 < 0.0) {
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 1.0f;
            return;
        }
        if (n3 >= 1.0E-30) {
            this.IllIIlllIIIIlllIIlIl = (float)Math.sqrt(n3);
            final double n4 = 0.5 / this.IllIIlllIIIIlllIIlIl;
            this.llllIIIlIlllIlIIIIIl = (float)(liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI * n4);
            this.lIIIIlIIIIIlllIllIII = (float)(liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII * n4);
            return;
        }
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        final double n5 = 0.5 * (1.0 - liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl);
        if (n5 >= 1.0E-30) {
            this.llllIIIlIlllIlIIIIIl = (float)Math.sqrt(n5);
            this.lIIIIlIIIIIlllIllIII = (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII / (2.0 * this.llllIIIlIlllIlIIIIIl));
            return;
        }
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 1.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final float n = (float)Math.sqrt(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI + ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl);
        if (n < 1.0E-6) {
            this.lIIIlllIIIllIIIllIII = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
        }
        else {
            final float n2 = 1.0f / n;
            final float n3 = (float)Math.sin(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI / 2.0);
            this.lIIIlllIIIllIIIllIII = (float)Math.cos(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI / 2.0);
            this.IllIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl * n2 * n3;
            this.llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI * n2 * n3;
            this.lIIIIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl * n2 * n3;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final float n = (float)(1.0 / Math.sqrt(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl));
        if (n < 1.0E-6) {
            this.lIIIlllIIIllIIIllIII = 0.0f;
            this.IllIIlllIIIIlllIIlIl = 0.0f;
            this.llllIIIlIlllIlIIIIIl = 0.0f;
            this.lIIIIlIIIIIlllIllIII = 0.0f;
        }
        else {
            final float n2 = 1.0f / n;
            final float n3 = (float)Math.sin(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI / 2.0);
            this.lIIIlllIIIllIIIllIII = (float)Math.cos(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI / 2.0);
            this.IllIIlllIIIIlllIIlIl = (float)llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl * n2 * n3;
            this.llllIIIlIlllIlIIIIIl = (float)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI * n2 * n3;
            this.lIIIIlIIIIIlllIllIII = (float)llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl * n2 * n3;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final float n) {
        double n2 = this.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + this.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + this.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
        if (n2 < 0.0) {
            ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl = -ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl;
            ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl = -ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
            ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII = -ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
            ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII = -ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
            n2 = -n2;
        }
        double n3;
        double n4;
        if (1.0 - n2 > 1.0E-6) {
            final double acos = Math.acos(n2);
            final double sin = Math.sin(acos);
            n3 = Math.sin((1.0 - n) * acos) / sin;
            n4 = Math.sin(n * acos) / sin;
        }
        else {
            n3 = 1.0 - n;
            n4 = n;
        }
        this.lIIIlllIIIllIIIllIII = (float)(n3 * this.lIIIlllIIIllIIIllIII + n4 * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII);
        this.IllIIlllIIIIlllIIlIl = (float)(n3 * this.IllIIlllIIIIlllIIlIl + n4 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl = (float)(n3 * this.llllIIIlIlllIlIIIIIl + n4 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl);
        this.lIIIIlIIIIIlllIllIII = (float)(n3 * this.lIIIIlIIIIIlllIllIII + n4 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII);
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII, final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII2, final float n) {
        double n2 = ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
        if (n2 < 0.0) {
            ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl = -ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl;
            ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl = -ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl;
            ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII = -ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
            ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII = -ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII;
            n2 = -n2;
        }
        double n3;
        double n4;
        if (1.0 - n2 > 1.0E-6) {
            final double acos = Math.acos(n2);
            final double sin = Math.sin(acos);
            n3 = Math.sin((1.0 - n) * acos) / sin;
            n4 = Math.sin(n * acos) / sin;
        }
        else {
            n3 = 1.0 - n;
            n4 = n;
        }
        this.lIIIlllIIIllIIIllIII = (float)(n3 * ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII + n4 * ilIIIIlllIlllllIlII2.lIIIlllIIIllIIIllIII);
        this.IllIIlllIIIIlllIIlIl = (float)(n3 * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + n4 * ilIIIIlllIlllllIlII2.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl = (float)(n3 * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + n4 * ilIIIIlllIlllllIlII2.llllIIIlIlllIlIIIIIl);
        this.lIIIIlIIIIIlllIllIII = (float)(n3 * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII + n4 * ilIIIIlllIlllllIlII2.lIIIIlIIIIIlllIllIII);
    }
}
