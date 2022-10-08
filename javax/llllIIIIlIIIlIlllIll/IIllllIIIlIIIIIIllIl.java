package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class IIllllIIIlIIIIIIllIl implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = 8064614250942616720L;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public int IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    
    public IIllllIIIlIIIIIIllIl(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public IIllllIIIlIIIIIIllIl(final int[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
        this.IllIIlllIIIIlllIIlIl = array[3];
    }
    
    public IIllllIIIlIIIIIIllIl(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI = illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
    }
    
    public IIllllIIIlIIIIIIllIl() {
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = 0;
        this.IllIIlllIIIIlllIIlIl = 0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
        this.IllIIlllIIIIlllIIlIl = array[3];
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI = illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final int[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
        array[2] = this.IlIlIIIllIllIIIIIllI;
        array[3] = this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
        illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl2) {
        this.llIllIIIIIllIlIIIIlI = illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI + illllIIIlIIIIIIllIl2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl + illllIIIlIIIIIIllIl2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI + illllIIIlIIIIIIllIl2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl + illllIIIlIIIIIIllIl2.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI += illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI += illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl += illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl2) {
        this.llIllIIIIIllIlIIIIlI = illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI - illllIIIlIIIIIIllIl2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl - illllIIIlIIIIIIllIl2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI - illllIIIlIIIIIIllIl2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl - illllIIIlIIIIIIllIl2.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI -= illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI -= illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl -= illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI = -illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -this.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = -this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI = n * illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = n * illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n) {
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
        this.IllIIlllIIIIlllIIlIl *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl2) {
        this.llIllIIIIIllIlIIIIlI = n * illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI + illllIIIlIIIIIIllIl2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl + illllIIIlIIIIIIllIl2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI + illllIIIlIIIIIIllIl2.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = n * illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl + illllIIIlIIIIIIllIl2.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI = n * this.llIllIIIIIllIlIIIIlI + illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * this.IlIIIlIlIIIllIlIlIIl + illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * this.IlIlIIIllIllIIIIIllI + illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = n * this.IllIIlllIIIIlllIIlIl + illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public String toString() {
        return "(" + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + ", " + this.IllIIlllIIIIlllIIlIl + ")";
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = (IIllllIIIlIIIIIIllIl)o;
            return this.llIllIIIIIllIlIIIIlI == illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
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
        final long n = 31L * (31L * (31L * (31L * 1L + this.llIllIIIIIllIlIIIIlI) + this.IlIIIlIlIIIllIlIlIIl) + this.IlIlIIIllIllIIIIIllI) + this.IllIIlllIIIIlllIIlIl;
        return (int)(n ^ n >> 32);
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        if (illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI > n2) {
            this.llIllIIIIIllIlIIIIlI = n2;
        }
        else if (illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        }
        if (illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl > n2) {
            this.IlIIIlIlIIIllIlIlIIl = n2;
        }
        else if (illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        }
        if (illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI > n2) {
            this.IlIlIIIllIllIIIIIllI = n2;
        }
        else if (illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI < n) {
            this.IlIlIIIllIllIIIIIllI = n;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        }
        if (illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl > n2) {
            this.IllIIlllIIIIlllIIlIl = n2;
        }
        else if (illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        if (illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        }
        if (illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        }
        if (illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI < n) {
            this.IlIlIIIllIllIIIIIllI = n;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        }
        if (illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final int n, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        if (illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI > n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI;
        }
        if (illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl > n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl;
        }
        if (illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI > n) {
            this.IlIlIIIllIllIIIIIllI = n;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        }
        if (illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl > n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void IllIIlllIIIIlllIIlIl(final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI = Math.abs(illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = Math.abs(illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI);
        this.IllIIlllIIIIlllIIlIl = Math.abs(illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl);
    }
    
    public final void llllIIIIlIIIlIlllIll(final int n, final int n2) {
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
        if (this.IlIlIIIllIllIIIIIllI > n2) {
            this.IlIlIIIllIllIIIIIllI = n2;
        }
        else if (this.IlIlIIIllIllIIIIIllI < n) {
            this.IlIlIIIllIllIIIIIllI = n;
        }
        if (this.IllIIlllIIIIlllIIlIl > n2) {
            this.IllIIlllIIIIlllIIlIl = n2;
        }
        else if (this.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final int n) {
        if (this.llIllIIIIIllIlIIIIlI < n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        if (this.IlIIIlIlIIIllIlIlIIl < n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        if (this.IlIlIIIllIllIIIIIllI < n) {
            this.IlIlIIIllIllIIIIIllI = n;
        }
        if (this.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final int n) {
        if (this.llIllIIIIIllIlIIIIlI > n) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
        if (this.IlIIIlIlIIIllIlIlIIl > n) {
            this.IlIIIlIlIIIllIlIlIIl = n;
        }
        if (this.IlIlIIIllIllIIIIIllI > n) {
            this.IlIlIIIllIllIIIIIllI = n;
        }
        if (this.IllIIlllIIIIlllIIlIl > n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI = Math.abs(this.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(this.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = Math.abs(this.IlIlIIIllIllIIIIIllI);
        this.IllIIlllIIIIlllIIlIl = Math.abs(this.IllIIlllIIIIlllIIlIl);
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
    
    public final int IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llllIIIlIlllIlIIIIIl(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
