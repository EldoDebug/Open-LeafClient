package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class IIlIIIIIllIlIIIlIIll implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = 5542096614926168415L;
    public double llIllIIIIIllIlIIIIlI;
    public double IlIIIlIlIIIllIlIlIIl;
    public double IlIlIIIllIllIIIIIllI;
    
    public IIlIIIIIllIlIIIlIIll(final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public IIlIIIIIllIlIIIlIIll(final double[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
    }
    
    public IIlIIIIIllIlIIIlIIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public IIlIIIIIllIlIIIlIIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public IIlIIIIIllIlIIIlIIll() {
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
        this.IlIlIIIllIllIIIIIllI = 0.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final double[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
        array[2] = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll2) {
        this.llIllIIIIIllIlIIIIlI = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + ilIIIIIllIlIIIlIIll2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + ilIIIIIllIlIIIlIIll2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI + ilIIIIIllIlIIIlIIll2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI += ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI += ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll2) {
        this.llIllIIIIIllIlIIIIlI = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI - ilIIIIIllIlIIIlIIll2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl - ilIIIIIllIlIIIlIIll2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI - ilIIIIIllIlIIIlIIll2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI -= ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI -= ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI = -ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI = n * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n) {
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll2) {
        this.llIllIIIIIllIlIIIIlI = n * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + ilIIIIIllIlIIIlIIll2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + ilIIIIIllIlIIIlIIll2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI + ilIIIIIllIlIIIlIIll2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IlIlIlIlIlllllllllIl(n, new IIlllIIlIllIllIlIIll(llllllIllIllIlIllllI));
    }
    
    public final void IlIlIlIlIlllllllllIl(final double n, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI = n * this.llIllIIIIIllIlIIIIlI + ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * this.IlIIIlIlIIIllIlIlIIl + ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * this.IlIlIIIllIllIIIIIllI + ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return "(" + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + ")";
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl), this.IlIlIIIllIllIIIIIllI));
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        try {
            return this.llIllIIIIIllIlIIIIlI == ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll = (IIlIIIIIllIlIIIlIIll)o;
            return this.llIllIIIIIllIlIIIIlI == ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        }
        catch (ClassCastException ex) {
            return false;
        }
        catch (NullPointerException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final double n) {
        final double n2 = this.llIllIIIIIllIlIIIIlI - ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        if (Double.isNaN(n2)) {
            return false;
        }
        if (((n2 < 0.0) ? (-n2) : n2) > n) {
            return false;
        }
        final double n3 = this.IlIIIlIlIIIllIlIlIIl - ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        if (Double.isNaN(n3)) {
            return false;
        }
        if (((n3 < 0.0) ? (-n3) : n3) > n) {
            return false;
        }
        final double n4 = this.IlIlIIIllIllIIIIIllI - ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        return !Double.isNaN(n4) && ((n4 < 0.0) ? (-n4) : n4) <= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final float n2, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llllIIIIlIIIlIlllIll(n, (double)n2, ilIIIIIllIlIIIlIIll);
    }
    
    public final void llllIIIIlIIIlIlllIll(final double ilIlIIIllIllIIIIIllI, final double ilIlIIIllIllIIIIIllI2, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI > ilIlIIIllIllIIIIIllI2) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI2;
        }
        else if (ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI < ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        }
        if (ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl > ilIlIIIllIllIIIIIllI2) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI2;
        }
        else if (ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl < ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        }
        if (ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI2) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI2;
        }
        else if (ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI(n, ilIIIIIllIlIIIlIIll);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double ilIlIIIllIllIIIIIllI, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI < ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        }
        if (ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl < ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        }
        if (ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.IlIIIlIlIIIllIlIlIIl(n, ilIIIIIllIlIIIlIIll);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final double ilIlIIIllIllIIIIIllI, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        if (ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI > ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        }
        if (ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl > ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        }
        if (ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI = Math.abs(ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = Math.abs(ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI);
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final float n2) {
        this.llllIIIIlIIIlIlllIll(n, (double)n2);
    }
    
    public final void llllIIIIlIIIlIlllIll(final double ilIlIIIllIllIIIIIllI, final double ilIlIIIllIllIIIIIllI2) {
        if (this.llIllIIIIIllIlIIIIlI > ilIlIIIllIllIIIIIllI2) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI2;
        }
        else if (this.llIllIIIIIllIlIIIIlI < ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        if (this.IlIIIlIlIIIllIlIlIIl > ilIlIIIllIllIIIIIllI2) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI2;
        }
        else if (this.IlIIIlIlIIIllIlIlIIl < ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        if (this.IlIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI2) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI2;
        }
        else if (this.IlIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n) {
        this.IlIlIlIlIlllllllllIl((double)n);
    }
    
    public final void IlIlIlIlIlllllllllIl(final double ilIlIIIllIllIIIIIllI) {
        if (this.llIllIIIIIllIlIIIIlI < ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        if (this.IlIIIlIlIIIllIlIlIIl < ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        if (this.IlIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n) {
        this.llIllIIIIIllIlIIIIlI(n);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double ilIlIIIllIllIIIIIllI) {
        if (this.llIllIIIIIllIlIIIIlI > ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        if (this.IlIIIlIlIIIllIlIlIIl > ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        if (this.IlIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI = Math.abs(this.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(this.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = Math.abs(this.IlIlIIIllIllIIIIIllI);
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll2, final float n) {
        this.llllIIIIlIIIlIlllIll(ilIIIIIllIlIIIlIIll, ilIIIIIllIlIIIlIIll2, (double)n);
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll2, final double n) {
        this.llIllIIIIIllIlIIIIlI = (1.0 - n) * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI + n * ilIIIIIllIlIIIlIIll2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (1.0 - n) * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl + n * ilIIIIIllIlIIIlIIll2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (1.0 - n) * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI + n * ilIIIIIllIlIIIlIIll2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final float n) {
        this.IlIlIlIlIlllllllllIl(ilIIIIIllIlIIIlIIll, n);
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll, final double n) {
        this.llIllIIIIIllIlIIIIlI = (1.0 - n) * this.llIllIIIIIllIlIIIIlI + n * ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (1.0 - n) * this.IlIIIlIlIIIllIlIlIIl + n * ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (1.0 - n) * this.IlIlIIIllIllIIIIIllI + n * ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final double llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final double llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final double IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final double ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final double IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
}
