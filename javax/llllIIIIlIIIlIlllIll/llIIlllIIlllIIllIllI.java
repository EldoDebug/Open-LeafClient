package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class llIIlllIIlllIIllIllI implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = -3555701650170169638L;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    
    public llIIlllIIlllIIllIllI(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public llIIlllIIlllIIllIllI(final int[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
    }
    
    public llIIlllIIlllIIllIllI(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
    }
    
    public llIIlllIIlllIIllIllI() {
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = 0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final int[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI2) {
        this.llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI + llIIlllIIlllIIllIllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl + llIIlllIIlllIIllIllI2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI += llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI2) {
        this.llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI - llIIlllIIlllIIllIllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl - llIIlllIIlllIIllIllI2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI -= llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI = -llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI = n * llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n) {
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI2) {
        this.llIllIIIIIllIlIIIIlI = n * llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI + llIIlllIIlllIIllIllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl + llIIlllIIlllIIllIllI2.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI = n * this.llIllIIIIIllIlIIIIlI + llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * this.IlIIIlIlIIIllIlIlIIl + llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return "(" + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ")";
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = (llIIlllIIlllIIllIllI)o;
            return this.llIllIIIIIllIlIIIIlI == llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
        }
        catch (NullPointerException ex) {
            return false;
        }
        catch (ClassCastException ex2) {
            return false;
        }
    }
    
    @Override
    public int hashCode() {
        final long n = 31L * (31L * 1L + this.llIllIIIIIllIlIIIIlI) + this.IlIIIlIlIIIllIlIlIIl;
        return (int)(n ^ n >> 32);
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        if (llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI > n2) {
            this.llIllIIIIIllIlIIIIlI = n2;
        }
        else if (llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        }
        if (llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl > n2) {
            this.IlIIIlIlIIIllIlIlIIl = n2;
        }
        else if (llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        if (llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        }
        if (llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        if (llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI > n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI;
        }
        if (llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl > n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI = Math.abs(llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl);
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final int n2) {
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
    
    public final void IlIlIlIlIlllllllllIl(final int n) {
        if (this.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        if (this.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n) {
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
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final int ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
}
