package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class IlIlIlIlIlllllllllIl implements Serializable, Cloneable
{
    static final long llllIIIIlIIIlIlllIll = -163246355858070601L;
    public float IlIlIlIlIlllllllllIl;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    static final double IllIIlllIIIIlllIIlIl = 1.0E-6;
    
    public IlIlIlIlIlllllllllIl(final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public IlIlIlIlIlllllllllIl(final float[] array) {
        this.IlIlIlIlIlllllllllIl = array[0];
        this.llIllIIIIIllIlIIIIlI = array[1];
        this.IlIIIlIlIIIllIlIlIIl = array[2];
        this.IlIlIIIllIllIIIIIllI = array[3];
    }
    
    public IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = (float)llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (float)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (float)llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
    }
    
    public IlIlIlIlIlllllllllIl(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public IlIlIlIlIlllllllllIl() {
        this.IlIlIlIlIlllllllllIl = 0.0f;
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 1.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float[] array) {
        this.IlIlIlIlIlllllllllIl = array[0];
        this.llIllIIIIIllIlIIIIlI = array[1];
        this.IlIIIlIlIIIllIlIlIIl = array[2];
        this.IlIlIIIllIllIIIIIllI = array[3];
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = (float)llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (float)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (float)llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll, final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float[] array) {
        array[0] = this.IlIlIlIlIlllllllllIl;
        array[1] = this.llIllIIIIIllIlIIIIlI;
        array[2] = this.IlIIIlIlIIIllIlIlIIl;
        array[3] = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final double n = ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        if (n > 1.0E-6) {
            final double sqrt = Math.sqrt(n);
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl = (float)(ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * n2);
            this.llIllIIIIIllIlIIIIlI = (float)(ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * n2);
            this.IlIIIlIlIIIllIlIlIIl = (float)(ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * n2);
            this.IlIlIIIllIllIIIIIllI = (float)(2.0 * Math.atan2(sqrt, ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII));
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0f;
            this.llIllIIIIIllIlIIIIlI = 1.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final double n = illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
        if (n > 1.0E-6) {
            final double sqrt = Math.sqrt(n);
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl = (float)(illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * n2);
            this.llIllIIIIIllIlIIIIlI = (float)(illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * n2);
            this.IlIIIlIlIIIllIlIlIIl = (float)(illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * n2);
            this.IlIlIIIllIllIIIIIllI = (float)(2.0 * Math.atan2(sqrt, illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII));
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0f;
            this.llIllIIIIIllIlIIIIlI = 1.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new llIIlIIIlIIIllIlIIIl();
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII - llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl - llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI - llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        final double n = this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
        if (n > 1.0E-6) {
            final double sqrt = Math.sqrt(n);
            this.IlIlIIIllIllIIIIIllI = (float)Math.atan2(0.5 * sqrt, 0.5 * (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl - 1.0));
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl *= (float)n2;
            this.llIllIIIIIllIlIIIIlI *= (float)n2;
            this.IlIIIlIlIIIllIlIlIIl *= (float)n2;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0f;
            this.llIllIIIIIllIlIIIIlI = 1.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII();
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        this.IlIlIlIlIlllllllllIl = (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = (float)(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII);
        this.IlIIIlIlIIIllIlIlIIl = (float)(liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI);
        final double n = this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
        if (n > 1.0E-6) {
            final double sqrt = Math.sqrt(n);
            this.IlIlIIIllIllIIIIIllI = (float)Math.atan2(0.5 * sqrt, 0.5 * (liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl - 1.0));
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl *= (float)n2;
            this.llIllIIIIIllIlIIIIlI *= (float)n2;
            this.IlIIIlIlIIIllIlIlIIl *= (float)n2;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0f;
            this.llIllIIIIIllIlIIIIlI = 1.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII - llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl - llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI - llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        final double n = this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
        if (n > 1.0E-6) {
            final double sqrt = Math.sqrt(n);
            this.IlIlIIIllIllIIIIIllI = (float)Math.atan2(0.5 * sqrt, 0.5 * (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl - 1.0));
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl *= (float)n2;
            this.llIllIIIIIllIlIIIIlI *= (float)n2;
            this.IlIIIlIlIIIllIlIlIIl *= (float)n2;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0f;
            this.llIllIIIIIllIlIIIIlI = 1.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = (float)(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII);
        this.IlIIIlIlIIIllIlIlIIl = (float)(liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI);
        final double n = this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
        if (n > 1.0E-6) {
            final double sqrt = Math.sqrt(n);
            this.IlIlIIIllIllIIIIIllI = (float)Math.atan2(0.5 * sqrt, 0.5 * (liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl - 1.0));
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl *= (float)n2;
            this.llIllIIIIIllIlIIIIlI *= (float)n2;
            this.IlIIIlIlIIIllIlIlIIl *= (float)n2;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0f;
            this.llIllIIIIIllIlIIIIlI = 1.0f;
            this.IlIIIlIlIIIllIlIlIIl = 0.0f;
            this.IlIlIIIllIllIIIIIllI = 0.0f;
        }
    }
    
    @Override
    public String toString() {
        return "(" + this.IlIlIlIlIlllllllllIl + ", " + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + ")";
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        try {
            return this.IlIlIlIlIlllllllllIl == ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (IlIlIlIlIlllllllllIl)o;
            return this.IlIlIlIlIlllllllllIl == ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
        }
        catch (NullPointerException ex) {
            return false;
        }
        catch (ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final float n) {
        final float n2 = this.IlIlIlIlIlllllllllIl - ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        if (((n2 < 0.0f) ? (-n2) : n2) > n) {
            return false;
        }
        final float n3 = this.llIllIIIIIllIlIIIIlI - ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        if (((n3 < 0.0f) ? (-n3) : n3) > n) {
            return false;
        }
        final float n4 = this.IlIIIlIlIIIllIlIlIIl - ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
        if (((n4 < 0.0f) ? (-n4) : n4) > n) {
            return false;
        }
        final float n5 = this.IlIlIIIllIllIIIIIllI - ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
        return ((n5 < 0.0f) ? (-n5) : n5) <= n;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.IlIlIlIlIlllllllllIl), this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl), this.IlIlIIIllIllIIIIIllI));
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final float llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final float IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public final float llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final float IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
}
