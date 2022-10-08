package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class lIllllllIIllIlIlIlII implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = 9011180388985266884L;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    
    public lIllllllIIllIlIlIlII(final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public lIllllllIIllIlIlIlII(final float[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
    }
    
    public lIllllllIIllIlIlIlII(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lIllllllIIllIlIlIlII(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI = (float)lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lIllllllIIllIlIlIlII() {
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII) {
        this.llIllIIIIIllIlIIIIlI = (float)lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII2) {
        this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI + lIllllllIIllIlIlIlII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl + lIllllllIIllIlIlIlII2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI += lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII2) {
        this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI - lIllllllIIllIlIlIlII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl - lIllllllIIllIlIlIlII2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI -= lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI = -lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI = n * lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n) {
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII2) {
        this.llIllIIIIIllIlIIIIlI = n * lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI + lIllllllIIllIlIlIlII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl + lIllllllIIllIlIlIlII2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI = n * this.llIllIIIIIllIlIIIIlI + lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * this.IlIIIlIlIIIllIlIlIIl + lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl));
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        try {
            return this.llIllIIIIIllIlIIIIlI == lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII = (lIllllllIIllIlIlIlII)o;
            return this.llIllIIIIIllIlIIIIlI == lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        }
        catch (NullPointerException ex) {
            return false;
        }
        catch (ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        final float n2 = this.llIllIIIIIllIlIIIIlI - lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        if (Float.isNaN(n2)) {
            return false;
        }
        if (((n2 < 0.0f) ? (-n2) : n2) > n) {
            return false;
        }
        final float n3 = this.IlIIIlIlIIIllIlIlIIl - lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        return !Float.isNaN(n3) && ((n3 < 0.0f) ? (-n3) : n3) <= n;
    }
    
    @Override
    public String toString() {
        return "(" + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ")";
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final float n2, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI > n2) {
            this.llIllIIIIIllIlIIIIlI = n2;
        }
        else if (lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        }
        if (lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl > n2) {
            this.IlIIIlIlIIIllIlIlIIl = n2;
        }
        else if (lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float n, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        }
        if (lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float n, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI > n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        }
        if (lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl > n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI = Math.abs(lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl);
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n, final float n2) {
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
    
    public final void IlIlIlIlIlllllllllIl(final float n) {
        if (this.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        if (this.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float n) {
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
    
    public final void llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII2, final float n) {
        this.llIllIIIIIllIlIIIIlI = (1.0f - n) * lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI + n * lIllllllIIllIlIlIlII2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (1.0f - n) * lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl + n * lIllllllIIllIlIlIlII2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        this.llIllIIIIIllIlIIIIlI = (1.0f - n) * this.llIllIIIIIllIlIIIIlI + n * lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (1.0f - n) * this.IlIIIlIlIIIllIlIlIIl + n * lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final float llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final float IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final float ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
}
