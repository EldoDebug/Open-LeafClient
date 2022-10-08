package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class llllIIIIlIIIlIlllIll implements Serializable, Cloneable
{
    static final long llllIIIIlIIIlIlllIll = 3644296204459140589L;
    public double IlIlIlIlIlllllllllIl;
    public double llIllIIIIIllIlIIIIlI;
    public double IlIIIlIlIIIllIlIlIIl;
    public double IlIlIIIllIllIIIIIllI;
    static final double IllIIlllIIIIlllIIlIl = 1.0E-12;
    
    public llllIIIIlIIIlIlllIll(final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public llllIIIIlIIIlIlllIll(final double[] array) {
        this.IlIlIlIlIlllllllllIl = array[0];
        this.llIllIIIIIllIlIIIIlI = array[1];
        this.IlIIIlIlIIIllIlIlIIl = array[2];
        this.IlIlIIIllIllIIIIIllI = array[3];
    }
    
    public llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
    }
    
    public llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = 0.0;
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 1.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double[] array) {
        this.IlIlIlIlIlllllllllIl = array[0];
        this.llIllIIIIIllIlIIIIlI = array[1];
        this.IlIIIlIlIIIllIlIlIIl = array[2];
        this.IlIlIIIllIllIIIIIllI = array[3];
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IllIllIIIIlIIlIlllII illIllIIIIlIIlIlllII, final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = illIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        this.llIllIIIIIllIlIIIIlI = illIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIIIlIlIIIllIlIlIIl = illIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final double[] array) {
        array[0] = this.IlIlIlIlIlllllllllIl;
        array[1] = this.llIllIIIIIllIlIIIIlI;
        array[2] = this.IlIIIlIlIIIllIlIlIIl;
        array[3] = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII();
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        this.IlIlIlIlIlllllllllIl = (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = (float)(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII);
        this.IlIIIlIlIIIllIlIlIIl = (float)(liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI);
        final double n = this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
        if (n > 1.0E-12) {
            final double sqrt = Math.sqrt(n);
            this.IlIlIIIllIllIIIIIllI = (float)Math.atan2(0.5 * sqrt, 0.5 * (liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl - 1.0));
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl *= n2;
            this.llIllIIIIIllIlIIIIlI *= n2;
            this.IlIIIlIlIIIllIlIlIIl *= n2;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0;
            this.llIllIIIIIllIlIIIIlI = 1.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IlIlIIIllIllIIIIIllI = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new lIIIlllIIIllIIIllIII();
        llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        this.IlIlIlIlIlllllllllIl = (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = (float)(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII);
        this.IlIIIlIlIIIllIlIlIIl = (float)(liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI);
        final double n = this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
        if (n > 1.0E-12) {
            final double sqrt = Math.sqrt(n);
            this.IlIlIIIllIllIIIIIllI = (float)Math.atan2(0.5 * sqrt, 0.5 * (liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl - 1.0));
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl *= n2;
            this.llIllIIIIIllIlIIIIlI *= n2;
            this.IlIIIlIlIIIllIlIlIIl *= n2;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0;
            this.llIllIIIIIllIlIIIIlI = 1.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IlIlIIIllIllIIIIIllI = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII - llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl;
        this.llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl - llIIlIIIlIIIllIlIIIl.lIIIIlIIIIIlllIllIII;
        this.IlIIIlIlIIIllIlIlIIl = llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI - llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI;
        final double n = this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
        if (n > 1.0E-12) {
            final double sqrt = Math.sqrt(n);
            this.IlIlIIIllIllIIIIIllI = (float)Math.atan2(0.5 * sqrt, 0.5 * (llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl + llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl + llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl - 1.0));
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl *= n2;
            this.llIllIIIIIllIlIIIIlI *= n2;
            this.IlIIIlIlIIIllIlIlIIl *= n2;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0;
            this.llIllIIIIIllIlIIIIlI = 1.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IlIlIIIllIllIIIIIllI = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlIlIlIlIlllllllllIl = (float)(liiIlllIIIllIIIllIII.lIIIlllIIIllIIIllIII - liiIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl);
        this.llIllIIIIIllIlIIIIlI = (float)(liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl - liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII);
        this.IlIIIlIlIIIllIlIlIIl = (float)(liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI - liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI);
        final double n = this.IlIlIlIlIlllllllllIl * this.IlIlIlIlIlllllllllIl + this.llIllIIIIIllIlIIIIlI * this.llIllIIIIIllIlIIIIlI + this.IlIIIlIlIIIllIlIlIIl * this.IlIIIlIlIIIllIlIlIIl;
        if (n > 1.0E-12) {
            final double sqrt = Math.sqrt(n);
            this.IlIlIIIllIllIIIIIllI = (float)Math.atan2(0.5 * sqrt, 0.5 * (liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl + liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl + liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl - 1.0));
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl *= n2;
            this.llIllIIIIIllIlIIIIlI *= n2;
            this.IlIIIlIlIIIllIlIlIIl *= n2;
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0;
            this.llIllIIIIIllIlIIIIlI = 1.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IlIlIIIllIllIIIIIllI = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIlllIlllllIlII ilIIIIlllIlllllIlII) {
        final double n = ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl + ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl + ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII;
        if (n > 1.0E-12) {
            final double sqrt = Math.sqrt(n);
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl = ilIIIIlllIlllllIlII.IllIIlllIIIIlllIIlIl * n2;
            this.llIllIIIIIllIlIIIIlI = ilIIIIlllIlllllIlII.llllIIIlIlllIlIIIIIl * n2;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIIlllIlllllIlII.lIIIIlIIIIIlllIllIII * n2;
            this.IlIlIIIllIllIIIIIllI = 2.0 * Math.atan2(sqrt, ilIIIIlllIlllllIlII.lIIIlllIIIllIIIllIII);
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0;
            this.llIllIIIIIllIlIIIIlI = 1.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IlIlIIIllIllIIIIIllI = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final double n = illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl + illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl + illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII;
        if (n > 1.0E-12) {
            final double sqrt = Math.sqrt(n);
            final double n2 = 1.0 / sqrt;
            this.IlIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl * n2;
            this.llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl * n2;
            this.IlIIIlIlIIIllIlIlIIl = illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII * n2;
            this.IlIlIIIllIllIIIIIllI = 2.0 * Math.atan2(sqrt, illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII);
        }
        else {
            this.IlIlIlIlIlllllllllIl = 0.0;
            this.llIllIIIIIllIlIIIIlI = 1.0;
            this.IlIIIlIlIIIllIlIlIIl = 0.0;
            this.IlIlIIIllIllIIIIIllI = 0.0;
        }
    }
    
    @Override
    public String toString() {
        return "(" + this.IlIlIlIlIlllllllllIl + ", " + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + ")";
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        try {
            return this.IlIlIlIlIlllllllllIl == llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (llllIIIIlIIIlIlllIll)o;
            return this.IlIlIlIlIlllllllllIl == llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl && this.llIllIIIIIllIlIIIIlI == llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
        }
        catch (NullPointerException ex) {
            return false;
        }
        catch (ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final double n) {
        final double n2 = this.IlIlIlIlIlllllllllIl - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        if (((n2 < 0.0) ? (-n2) : n2) > n) {
            return false;
        }
        final double n3 = this.llIllIIIIIllIlIIIIlI - llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        if (((n3 < 0.0) ? (-n3) : n3) > n) {
            return false;
        }
        final double n4 = this.IlIIIlIlIIIllIlIlIIl - llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
        if (((n4 < 0.0) ? (-n4) : n4) > n) {
            return false;
        }
        final double n5 = this.IlIlIIIllIllIIIIIllI - llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI;
        return ((n5 < 0.0) ? (-n5) : n5) <= n;
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
    
    public final double llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public double IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final double ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public final double llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final double ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
}
