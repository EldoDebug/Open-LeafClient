package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class IIIllllllIllIIIlllIl implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = -732740491767276200L;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public int IlIlIIIllIllIIIIIllI;
    
    public IIIllllllIllIIIlllIl(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public IIIllllllIllIIIlllIl(final int[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
    }
    
    public IIIllllllIllIIIlllIl(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llIllIIIIIllIlIIIIlI = iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public IIIllllllIllIIIlllIl() {
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = 0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llIllIIIIIllIlIIIIlI = iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final int[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
        array[2] = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl2) {
        this.llIllIIIIIllIlIIIIlI = iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI + iiIllllllIllIIIlllIl2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl + iiIllllllIllIIIlllIl2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI + iiIllllllIllIIIlllIl2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llIllIIIIIllIlIIIIlI += iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI += iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl2) {
        this.llIllIIIIIllIlIIIIlI = iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI - iiIllllllIllIIIlllIl2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl - iiIllllllIllIIIlllIl2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI - iiIllllllIllIIIlllIl2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llIllIIIIIllIlIIIIlI -= iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI -= iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llIllIIIIIllIlIIIIlI = -iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llIllIIIIIllIlIIIIlI = n * iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n) {
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl2) {
        this.llIllIIIIIllIlIIIIlI = n * iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI + iiIllllllIllIIIlllIl2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl + iiIllllllIllIIIlllIl2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI + iiIllllllIllIIIlllIl2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llIllIIIIIllIlIIIIlI = n * this.llIllIIIIIllIlIIIIlI + iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * this.IlIIIlIlIIIllIlIlIIl + iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * this.IlIlIIIllIllIIIIIllI + iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return "(" + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + ")";
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = (IIIllllllIllIIIlllIl)o;
            return this.llIllIIIIIllIlIIIIlI == iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
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
        final long n = 31L * (31L * (31L * 1L + this.llIllIIIIIllIlIIIIlI) + this.IlIIIlIlIIIllIlIlIIl) + this.IlIlIIIllIllIIIIIllI;
        return (int)(n ^ n >> 32);
    }
    
    public final void llllIIIIlIIIlIlllIll(final int ilIlIIIllIllIIIIIllI, final int ilIlIIIllIllIIIIIllI2, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        if (iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI > ilIlIIIllIllIIIIIllI2) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI2;
        }
        else if (iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI < ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        }
        if (iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl > ilIlIIIllIllIIIIIllI2) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI2;
        }
        else if (iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl < ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        }
        if (iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI2) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI2;
        }
        else if (iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int ilIlIIIllIllIIIIIllI, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        if (iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI < ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        }
        if (iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl < ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        }
        if (iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int ilIlIIIllIllIIIIIllI, final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        if (iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI > ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI;
        }
        if (iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl > ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl;
        }
        if (iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl) {
        this.llIllIIIIIllIlIIIIlI = Math.abs(iiIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(iiIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = Math.abs(iiIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI);
    }
    
    public final void llllIIIIlIIIlIlllIll(final int ilIlIIIllIllIIIIIllI, final int ilIlIIIllIllIIIIIllI2) {
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
    
    public final void IlIlIlIlIlllllllllIl(final int ilIlIIIllIllIIIIIllI) {
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
    
    public final void llIllIIIIIllIlIIIIlI(final int ilIlIIIllIllIIIIIllI) {
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
    
    public final int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final int ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
}
