package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public class lIIIIlIIIIIlllIllIII implements Serializable, Cloneable
{
    private int llIllIIIIIllIlIIIIlI;
    double[] llllIIIIlIIIlIlllIll;
    static final long IlIlIlIlIlllllllllIl = 1398850036893875112L;
    
    public lIIIIlIIIIIlllIllIII(final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = new double[llIllIIIIIllIlIIIIlI];
        for (int i = 0; i < llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
        }
    }
    
    public lIIIIlIIIIIlllIllIII(final double[] array) {
        this.llIllIIIIIllIlIIIIlI = array.length;
        this.llllIIIIlIIIlIlllIll = new double[array.length];
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = array[i];
        }
    }
    
    public lIIIIlIIIIIlllIllIII(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = new double[liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI];
        this.llIllIIIIIllIlIIIIlI = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI;
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public lIIIIlIIIIIlllIllIII(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        (this.llllIIIIlIIIlIlllIll = new double[2])[0] = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll[1] = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = 2;
    }
    
    public lIIIIlIIIIIlllIllIII(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        (this.llllIIIIlIIIlIlllIll = new double[3])[0] = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll[1] = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll[2] = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        this.llIllIIIIIllIlIIIIlI = 3;
    }
    
    public lIIIIlIIIIIlllIllIII(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        (this.llllIIIIlIIIlIlllIll = new double[3])[0] = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll[1] = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll[2] = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        this.llIllIIIIIllIlIIIIlI = 3;
    }
    
    public lIIIIlIIIIIlllIllIII(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        (this.llllIIIIlIIIlIlllIll = new double[4])[0] = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll[1] = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll[2] = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll[3] = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        this.llIllIIIIIllIlIIIIlI = 4;
    }
    
    public lIIIIlIIIIIlllIllIII(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        (this.llllIIIIlIIIlIlllIll = new double[4])[0] = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll[1] = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll[2] = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll[3] = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        this.llIllIIIIIllIlIIIIlI = 4;
    }
    
    public lIIIIlIIIIIlllIllIII(final double[] array, final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = new double[llIllIIIIIllIlIIIIlI];
        for (int i = 0; i < llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = array[i];
        }
    }
    
    public final double llllIIIIlIIIlIlllIll() {
        double n = 0.0;
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            n += this.llllIIIIlIIIlIlllIll[i] * this.llllIIIIlIIIlIlllIll[i];
        }
        return Math.sqrt(n);
    }
    
    public final double IlIlIlIlIlllllllllIl() {
        double n = 0.0;
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            n += this.llllIIIIlIIIlIlllIll[i] * this.llllIIIIlIIIlIlllIll[i];
        }
        return n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        double n = 0.0;
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector0"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            n += liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] * liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
        }
        final double n2 = 1.0 / Math.sqrt(n);
        for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
            this.llllIIIIlIIIlIlllIll[j] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[j] * n2;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI() {
        double n = 0.0;
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            n += this.llllIIIIlIIIlIlllIll[i] * this.llllIIIIlIIIlIlllIll[i];
        }
        final double n2 = 1.0 / Math.sqrt(n);
        for (int j = 0; j < this.llIllIIIIIllIlIIIIlI; ++j) {
            this.llllIIIIlIIIlIlllIll[j] *= n2;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector1"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] * n;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n) {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] *= n;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2) {
        if (liiiIlIIIIIlllIllIII2.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector2"));
        }
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector3"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] * n + liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector4"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            final double[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final int n = i;
            llllIIIIlIIIlIlllIll[n] += liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2) {
        if (liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII2.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector5"));
        }
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector6"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] + liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector7"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            final double[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final int n = i;
            llllIIIIlIIIlIlllIll[n] -= liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2) {
        if (liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII2.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector8"));
        }
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector9"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] - liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl() != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector10"));
        }
        if (this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl()) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector11"));
        }
        double[] llllIIIIlIIIlIlllIll;
        if (liiiIlIIIIIlllIllIII != this) {
            llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll;
        }
        else {
            llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.clone();
        }
        for (int i = this.llIllIIIIIllIlIIIIlI - 1; i >= 0; --i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
            for (int j = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI - 1; j >= 0; --j) {
                final double[] llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll;
                final int n = i;
                llllIIIIlIIIlIlllIll2[n] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j] * llllIIIIlIIIlIlllIll[j];
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl() != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector12"));
        }
        if (this.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl()) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector13"));
        }
        double[] llllIIIIlIIIlIlllIll;
        if (liiiIlIIIIIlllIllIII != this) {
            llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll;
        }
        else {
            llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.clone();
        }
        for (int i = this.llIllIIIIIllIlIIIIlI - 1; i >= 0; --i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
            for (int j = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI - 1; j >= 0; --j) {
                final double[] llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll;
                final int n = i;
                llllIIIIlIIIlIlllIll2[n] += llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[j][i] * llllIIIIlIIIlIlllIll[j];
            }
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl() {
        for (int i = this.llIllIIIIIllIlIIIIlI - 1; i >= 0; --i) {
            final double[] llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
            final int n = i;
            llllIIIIlIIIlIlllIll[n] *= -1.0;
        }
    }
    
    public final void IlIlIIIllIllIIIIIllI() {
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI) {
        final double[] llllIIIIlIIIlIlllIll = new double[llIllIIIIIllIlIIIIlI];
        int llIllIIIIIllIlIIIIlI2;
        if (this.llIllIIIIIllIlIIIIlI < llIllIIIIIllIlIIIIlI) {
            llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI;
        }
        else {
            llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI;
        }
        for (int i = 0; i < llIllIIIIIllIlIIIIlI2; ++i) {
            llllIIIIlIIIlIlllIll[i] = this.llllIIIIlIIIlIlllIll[i];
        }
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double[] array) {
        for (int i = this.llIllIIIIIllIlIIIIlI - 1; i >= 0; --i) {
            this.llllIIIIlIIIlIlllIll[i] = array[i];
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this.llIllIIIIIllIlIIIIlI < liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI;
            this.llllIIIIlIIIlIlllIll = new double[this.llIllIIIIIllIlIIIIlI];
            for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
                this.llllIIIIlIIIlIlllIll[i] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
            }
        }
        else {
            for (int j = 0; j < liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI; ++j) {
                this.llllIIIIlIIIlIlllIll[j] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[j];
            }
            for (int k = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI; k < this.llIllIIIIIllIlIIIIlI; ++k) {
                this.llllIIIIlIIIlIlllIll[k] = 0.0;
            }
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (this.llIllIIIIIllIlIIIIlI < 2) {
            this.llIllIIIIIllIlIIIIlI = 2;
            this.llllIIIIlIIIlIlllIll = new double[2];
        }
        this.llllIIIIlIIIlIlllIll[0] = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll[1] = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        for (int i = 2; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        if (this.llIllIIIIIllIlIIIIlI < 3) {
            this.llIllIIIIIllIlIIIIlI = 3;
            this.llllIIIIlIIIlIlllIll = new double[3];
        }
        this.llllIIIIlIIIlIlllIll[0] = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll[1] = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll[2] = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        for (int i = 3; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (this.llIllIIIIIllIlIIIIlI < 3) {
            this.llIllIIIIIllIlIIIIlI = 3;
            this.llllIIIIlIIIlIlllIll = new double[3];
        }
        this.llllIIIIlIIIlIlllIll[0] = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll[1] = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.llllIIIIlIIIlIlllIll[2] = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        for (int i = 3; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        if (this.llIllIIIIIllIlIIIIlI < 4) {
            this.llIllIIIIIllIlIIIIlI = 4;
            this.llllIIIIlIIIlIlllIll = new double[4];
        }
        this.llllIIIIlIIIlIlllIll[0] = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll[1] = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll[2] = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll[3] = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        for (int i = 4; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        if (this.llIllIIIIIllIlIIIIlI < 4) {
            this.llIllIIIIIllIlIIIIlI = 4;
            this.llllIIIIlIIIlIlllIll = new double[4];
        }
        this.llllIIIIlIIIlIlllIll[0] = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll[1] = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll[2] = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll[3] = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        for (int i = 4; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = 0.0;
        }
    }
    
    public final int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll.length;
    }
    
    public final double IlIlIlIlIlllllllllIl(final int n) {
        return this.llllIIIIlIIIlIlllIll[n];
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final double n2) {
        this.llllIIIIlIIIlIlllIll[n] = n2;
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(this.llIllIIIIIllIlIIIIlI * 8);
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            sb.append(this.llllIIIIlIIIlIlllIll[i]).append(" ");
        }
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        long llllIIIIlIIIlIlllIll = 1L;
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            llllIIIIlIIIlIlllIll = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll[i]);
        }
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        try {
            if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
                return false;
            }
            for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
                if (this.llllIIIIlIIIlIlllIll[i] != liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i]) {
                    return false;
                }
            }
            return true;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = (lIIIIlIIIIIlllIllIII)o;
            if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
                return false;
            }
            for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
                if (this.llllIIIIlIIIlIlllIll[i] != liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i]) {
                    return false;
                }
            }
            return true;
        }
        catch (ClassCastException ex) {
            return false;
        }
        catch (NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final double n) {
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            return false;
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            final double n2 = this.llllIIIIlIIIlIlllIll[i] - liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
            if (((n2 < 0.0) ? (-n2) : n2) > n) {
                return false;
            }
        }
        return true;
    }
    
    public final double IllIIlllIIIIlllIIlIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector14"));
        }
        double n = 0.0;
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            n += this.llllIIIIlIIIlIlllIll[i] * liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
        }
        return n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl3, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl() || llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI || llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector15"));
        }
        if (llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI != this.llllIIIIlIIIlIlllIll.length || llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl3.llIllIIIIIllIlIIIIlI || llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI != llllIIIlIlllIlIIIIIl3.IlIlIlIlIlllllllllIl) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector23"));
        }
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl4 = new llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI);
        llllIIIlIlllIlIIIIIl4.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl3);
        llllIIIlIlllIlIIIIIl4.IlIlIIIllIllIIIIIllI(llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
        llllIIIlIlllIlIIIIIl4.IlIlIIIllIllIIIIIllI();
        this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl4, liiiIlIIIIIlllIllIII);
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2) {
        final int n = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl * llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        final double[] array = new double[n];
        final double[] array2 = new double[n];
        final int[] array3 = new int[liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl()];
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != liiiIlIIIIIlllIllIII.IllIIlllIIIIlllIIlIl()) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector16"));
        }
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != liiiIlIIIIIlllIllIII2.IllIIlllIIIIlllIIlIl()) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector24"));
        }
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl != llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector25"));
        }
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++i) {
            for (int j = 0; j < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++j) {
                array[i * llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI + j] = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl[i][j];
            }
        }
        for (int k = 0; k < n; ++k) {
            array2[k] = 0.0;
        }
        for (int l = 0; l < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++l) {
            array2[l * llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI] = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[l];
        }
        for (int n2 = 0; n2 < llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI; ++n2) {
            array3[n2] = (int)liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll[n2];
        }
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, array, array3, array2);
        for (int n3 = 0; n3 < llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl; ++n3) {
            this.llllIIIIlIIIlIlllIll[n3] = array2[n3 * llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI];
        }
    }
    
    public final double llllIIIlIlllIlIIIIIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        return Math.acos(this.IllIIlllIIIIlllIIlIl(liiiIlIIIIIlllIllIII) / (this.llllIIIIlIIIlIlllIll() * liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll()));
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2, final float n) {
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiiIlIIIIIlllIllIII2, (double)n);
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final float n) {
        this.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII, n);
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2, final double n) {
        if (liiiIlIIIIIlllIllIII2.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector20"));
        }
        if (this.llIllIIIIIllIlIIIIlI != liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector21"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = (1.0 - n) * liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] + n * liiiIlIIIIIlllIllIII2.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final double n) {
        if (liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI != this.llIllIIIIIllIlIIIIlI) {
            throw new IlIlIIIllIIllIlllllI(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll("GVector22"));
        }
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = (1.0 - n) * this.llllIIIIlIIIlIlllIll[i] + n * liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i];
        }
    }
    
    public Object clone() {
        lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII;
        try {
            liiiIlIIIIIlllIllIII = (lIIIIlIIIIIlllIllIII)super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
        liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll = new double[this.llIllIIIIIllIlIIIIlI];
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI; ++i) {
            liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[i] = this.llllIIIIlIIIlIlllIll[i];
        }
        return liiiIlIIIIIlllIllIII;
    }
}
