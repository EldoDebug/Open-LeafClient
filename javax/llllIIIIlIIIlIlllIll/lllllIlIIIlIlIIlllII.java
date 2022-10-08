package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class lllllIlIIIlIlIIlllII implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = 6205762482756093838L;
    public double llIllIIIIIllIlIIIIlI;
    public double IlIIIlIlIIIllIlIlIIl;
    
    public lllllIlIIIlIlIIlllII(final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public lllllIlIIIlIlIIlllII(final double[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
    }
    
    public lllllIlIIIlIlIIlllII(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI = lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lllllIlIIIlIlIIlllII(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lllllIlIIIlIlIIlllII() {
        this.llIllIIIIIllIlIIIIlI = 0.0;
        this.IlIIIlIlIIIllIlIlIIl = 0.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
    }
    
    public final void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI = lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final double[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII2) {
        this.llIllIIIIIllIlIIIIlI = lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI + lllllIlIIIlIlIIlllII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl + lllllIlIIIlIlIIlllII2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI += lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII2) {
        this.llIllIIIIIllIlIIIIlI = lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI - lllllIlIIIlIlIIlllII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl - lllllIlIIIlIlIIlllII2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI -= lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI = -lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI = n * lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n) {
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII2) {
        this.llIllIIIIIllIlIIIIlI = n * lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI + lllllIlIIIlIlIIlllII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl + lllllIlIIIlIlIIlllII2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final double n, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI = n * this.llIllIIIIIllIlIIIIlI + lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * this.IlIIIlIlIIIllIlIlIIl + lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl));
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        try {
            return this.llIllIIIIIllIlIIIIlI == lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = (lllllIlIIIlIlIIlllII)o;
            return this.llIllIIIIIllIlIIIIlI == lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
        }
        catch (NullPointerException ex) {
            return false;
        }
        catch (ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final double n) {
        final double n2 = this.llIllIIIIIllIlIIIIlI - lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        if (Double.isNaN(n2)) {
            return false;
        }
        if (((n2 < 0.0) ? (-n2) : n2) > n) {
            return false;
        }
        final double n3 = this.IlIIIlIlIIIllIlIlIIl - lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
        return !Double.isNaN(n3) && ((n3 < 0.0) ? (-n3) : n3) <= n;
    }
    
    @Override
    public String toString() {
        return "(" + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ")";
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final double n2, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        if (lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI > n2) {
            this.llIllIIIIIllIlIIIIlI = n2;
        }
        else if (lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        }
        if (lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl > n2) {
            this.IlIIIlIlIIIllIlIlIIl = n2;
        }
        else if (lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double n, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        if (lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        }
        if (lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final double n, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        if (lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI > n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        }
        if (lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl > n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI = Math.abs(lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl);
    }
    
    public final void IlIlIlIlIlllllllllIl(final double n, final double n2) {
        if (this.llIllIIIIIllIlIIIIlI > n2) {
            this.llIllIIIIIllIlIIIIlI = n2;
        }
        else if (this.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        if (this.IlIIIlIlIIIllIlIlIIl > n2) {
            this.IlIIIlIlIIIllIlIlIIl = n2;
        }
        else if (this.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final double n) {
        if (this.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        if (this.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double n) {
        if (this.llIllIIIIIllIlIIIIlI > n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        if (this.IlIIIlIlIIIllIlIlIIl > n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI = Math.abs(this.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public final void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII2, final double n) {
        this.llIllIIIIIllIlIIIIlI = (1.0 - n) * lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI + n * lllllIlIIIlIlIIlllII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (1.0 - n) * lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl + n * lllllIlIIIlIlIIlllII2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final double n) {
        this.llIllIIIIIllIlIIIIlI = (1.0 - n) * this.llIllIIIIIllIlIIIIlI + n * lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (1.0 - n) * this.IlIIIlIlIIIllIlIlIIl + n * lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
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
}
