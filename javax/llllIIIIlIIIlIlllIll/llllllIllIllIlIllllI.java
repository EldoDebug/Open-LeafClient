package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class llllllIllIllIlIllllI implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = 5019834619484343712L;
    public float llIllIIIIIllIlIIIIlI;
    public float IlIIIlIlIIIllIlIlIIl;
    public float IlIlIIIllIllIIIIIllI;
    
    public llllllIllIllIlIllllI(final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public llllllIllIllIlIllllI(final float[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
    }
    
    public llllllIllIllIlIllllI(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public llllllIllIllIlIllllI(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI = (float)ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (float)ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public llllllIllIllIlIllllI() {
        this.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IlIlIIIllIllIIIIIllI = 0.0f;
    }
    
    @Override
    public String toString() {
        return "(" + this.llIllIIIIIllIlIIIIlI + ", " + this.IlIIIlIlIIIllIlIlIIl + ", " + this.IlIlIIIllIllIIIIIllI + ")";
    }
    
    public final void llllIIIIlIIIlIlllIll(final float llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        this.llIllIIIIIllIlIIIIlI = (float)ilIIIIIllIlIIIlIIll.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (float)ilIIIIIllIlIIIlIIll.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (float)ilIIIIIllIlIIIlIIll.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
        array[2] = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final llllllIllIllIlIllllI llllllIllIllIlIllllI2) {
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + llllllIllIllIlIllllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + llllllIllIllIlIllllI2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI + llllllIllIllIlIllllI2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI += llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl += llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI += llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final llllllIllIllIlIllllI llllllIllIllIlIllllI2) {
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI - llllllIllIllIlIllllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl - llllllIllIllIlIllllI2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI - llllllIllIllIlIllllI2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI -= llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl -= llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI -= llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = -llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl() {
        this.llIllIIIIIllIlIIIIlI = -this.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = -this.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = -this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = n * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n) {
        this.llIllIIIIIllIlIIIIlI *= n;
        this.IlIIIlIlIIIllIlIlIIl *= n;
        this.IlIlIIIllIllIIIIIllI *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final llllllIllIllIlIllllI llllllIllIllIlIllllI, final llllllIllIllIlIllllI llllllIllIllIlIllllI2) {
        this.llIllIIIIIllIlIIIIlI = n * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + llllllIllIllIlIllllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + llllllIllIllIlIllllI2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI + llllllIllIllIlIllllI2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = n * this.llIllIIIIIllIlIIIIlI + llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n * this.IlIIIlIlIIIllIlIlIIl + llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = n * this.IlIlIIIllIllIIIIIllI + llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        try {
            return this.llIllIIIIIllIlIIIIlI == llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final llllllIllIllIlIllllI llllllIllIllIlIllllI = (llllllIllIllIlIllllI)o;
            return this.llIllIIIIIllIlIIIIlI == llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        }
        catch (NullPointerException ex) {
            return false;
        }
        catch (ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final float n) {
        final float n2 = this.llIllIIIIIllIlIIIIlI - llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        if (Float.isNaN(n2)) {
            return false;
        }
        if (((n2 < 0.0f) ? (-n2) : n2) > n) {
            return false;
        }
        final float n3 = this.IlIIIlIlIIIllIlIlIIl - llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        if (Float.isNaN(n3)) {
            return false;
        }
        if (((n3 < 0.0f) ? (-n3) : n3) > n) {
            return false;
        }
        final float n4 = this.IlIlIIIllIllIIIIIllI - llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        return !Float.isNaN(n4) && ((n4 < 0.0f) ? (-n4) : n4) <= n;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.llIllIIIIIllIlIIIIlI), this.IlIIIlIlIIIllIlIlIIl), this.IlIlIIIllIllIIIIIllI));
    }
    
    public final void llllIIIIlIIIlIlllIll(final float ilIlIIIllIllIIIIIllI, final float ilIlIIIllIllIIIIIllI2, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        if (llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI > ilIlIIIllIllIIIIIllI2) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI2;
        }
        else if (llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI < ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        }
        if (llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl > ilIlIIIllIllIIIIIllI2) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI2;
        }
        else if (llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl < ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        }
        if (llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI2) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI2;
        }
        else if (llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float ilIlIIIllIllIIIIIllI, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        if (llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI < ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        }
        if (llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl < ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        }
        if (llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI < ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float ilIlIIIllIllIIIIIllI, final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        if (llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI > ilIlIIIllIllIIIIIllI) {
            this.llIllIIIIIllIlIIIIlI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        }
        if (llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl > ilIlIIIllIllIIIIIllI) {
            this.IlIIIlIlIIIllIlIlIIl = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        }
        if (llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI > ilIlIIIllIllIIIIIllI) {
            this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        }
        else {
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = Math.abs(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = Math.abs(llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI);
    }
    
    public final void llllIIIIlIIIlIlllIll(final float ilIlIIIllIllIIIIIllI, final float ilIlIIIllIllIIIIIllI2) {
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
    
    public final void IlIlIlIlIlllllllllIl(final float ilIlIIIllIllIIIIIllI) {
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
    
    public final void llIllIIIIIllIlIIIIlI(final float ilIlIIIllIllIIIIIllI) {
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
    
    public final void llIllIIIIIllIlIIIIlI() {
        this.llIllIIIIIllIlIIIIlI = Math.abs(this.llIllIIIIIllIlIIIIlI);
        this.IlIIIlIlIIIllIlIlIIl = Math.abs(this.IlIIIlIlIIIllIlIlIIl);
        this.IlIlIIIllIllIIIIIllI = Math.abs(this.IlIlIIIllIllIIIIIllI);
    }
    
    public final void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final llllllIllIllIlIllllI llllllIllIllIlIllllI2, final float n) {
        this.llIllIIIIIllIlIIIIlI = (1.0f - n) * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI + n * llllllIllIllIlIllllI2.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (1.0f - n) * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl + n * llllllIllIllIlIllllI2.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (1.0f - n) * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI + n * llllllIllIllIlIllllI2.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI, final float n) {
        this.llIllIIIIIllIlIIIIlI = (1.0f - n) * this.llIllIIIIIllIlIIIIlI + n * llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = (1.0f - n) * this.IlIIIlIlIIIllIlIlIIl + n * llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = (1.0f - n) * this.IlIlIIIllIllIIIIIllI + n * llllllIllIllIlIllllI.IlIlIIIllIllIIIIIllI;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final float IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final float IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final float ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final float IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final float ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
}
