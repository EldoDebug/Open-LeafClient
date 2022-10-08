package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class IIIIIIIIIlllIllIlIlI implements Serializable, Cloneable
{
    static final long IlIlIIIllIllIIIIIllI = 7068460319248845763L;
    public float IllIIlllIIIIlllIIlIl;
    public float llllIIIlIlllIlIIIIIl;
    public float lIIIIlIIIIIlllIllIII;
    public float lIIIlllIIIllIIIllIII;
    
    public IIIIIIIIIlllIllIlIlI(final float illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl, final float liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public IIIIIIIIIlllIllIlIlI(final float[] array) {
        this.IllIIlllIIIIlllIIlIl = array[0];
        this.llllIIIlIlllIlIIIIIl = array[1];
        this.lIIIIlIIIIIlllIllIII = array[2];
        this.lIIIlllIIIllIIIllIII = array[3];
    }
    
    public IIIIIIIIIlllIllIlIlI(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public IIIIIIIIIlllIllIlIlI(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl = (float)iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (float)iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (float)iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (float)iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public IIIIIIIIIlllIllIlIlI() {
        this.IllIIlllIIIIlllIIlIl = 0.0f;
        this.llllIIIlIlllIlIIIIIl = 0.0f;
        this.lIIIIlIIIIIlllIllIII = 0.0f;
        this.lIIIlllIIIllIIIllIII = 0.0f;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl, final float liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float[] array) {
        this.IllIIlllIIIIlllIIlIl = array[0];
        this.llllIIIlIlllIlIIIIIl = array[1];
        this.lIIIIlIIIIIlllIllIII = array[2];
        this.lIIIlllIIIllIIIllIII = array[3];
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl = (float)iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (float)iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (float)iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (float)iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float[] array) {
        array[0] = this.IllIIlllIIIIlllIIlIl;
        array[1] = this.llllIIIlIlllIlIIIIIl;
        array[2] = this.lIIIIlIIIIIlllIllIII;
        array[3] = this.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
        iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
        iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
        iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI2) {
        this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + iiiiiiiiIlllIllIlIlI2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + iiiiiiiiIlllIllIlIlI2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + iiiiiiiiIlllIllIlIlI2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII + iiiiiiiiIlllIllIlIlI2.lIIIlllIIIllIIIllIII;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl += iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl += iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII += iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII += iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI2) {
        this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl - iiiiiiiiIlllIllIlIlI2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl - iiiiiiiiIlllIllIlIlI2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII - iiiiiiiiIlllIllIlIlI2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII - iiiiiiiiIlllIllIlIlI2.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl -= iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl -= iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII -= iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII -= iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl = -iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl = -this.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -this.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -this.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl = n * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = n * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n) {
        this.IllIIlllIIIIlllIIlIl *= n;
        this.llllIIIlIlllIlIIIIIl *= n;
        this.lIIIIlIIIIIlllIllIII *= n;
        this.lIIIlllIIIllIIIllIII *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI2) {
        this.IllIIlllIIIIlllIIlIl = n * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + iiiiiiiiIlllIllIlIlI2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + iiiiiiiiIlllIllIlIlI2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + iiiiiiiiIlllIllIlIlI2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = n * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII + iiiiiiiiIlllIllIlIlI2.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl = n * this.IllIIlllIIIIlllIIlIl + iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n * this.llllIIIlIlllIlIIIIIl + iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n * this.lIIIIlIIIIIlllIllIII + iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = n * this.lIIIlllIIIllIIIllIII + iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    @Override
    public String toString() {
        return "(" + this.IllIIlllIIIIlllIIlIl + ", " + this.llllIIIlIlllIlIIIIIl + ", " + this.lIIIIlIIIIIlllIllIII + ", " + this.lIIIlllIIIllIIIllIII + ")";
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        try {
            return this.IllIIlllIIIIlllIIlIl == iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = (IIIIIIIIIlllIllIlIlI)o;
            return this.IllIIlllIIIIlllIIlIl == iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        }
        catch (NullPointerException ex) {
            return false;
        }
        catch (ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final float n) {
        final float n2 = this.IllIIlllIIIIlllIIlIl - iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        if (Float.isNaN(n2)) {
            return false;
        }
        if (((n2 < 0.0f) ? (-n2) : n2) > n) {
            return false;
        }
        final float n3 = this.llllIIIlIlllIlIIIIIl - iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        if (Float.isNaN(n3)) {
            return false;
        }
        if (((n3 < 0.0f) ? (-n3) : n3) > n) {
            return false;
        }
        final float n4 = this.lIIIIlIIIIIlllIllIII - iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        if (Float.isNaN(n4)) {
            return false;
        }
        if (((n4 < 0.0f) ? (-n4) : n4) > n) {
            return false;
        }
        final float n5 = this.lIIIlllIIIllIIIllIII - iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        return !Float.isNaN(n5) && ((n5 < 0.0f) ? (-n5) : n5) <= n;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.IllIIlllIIIIlllIIlIl), this.llllIIIlIlllIlIIIIIl), this.lIIIIlIIIIIlllIllIII), this.lIIIlllIIIllIIIllIII));
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final float n2, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        if (iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl > n2) {
            this.IllIIlllIIIIlllIIlIl = n2;
        }
        else if (iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        }
        if (iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl > n2) {
            this.llllIIIlIlllIlIIIIIl = n2;
        }
        else if (iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl < n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        else {
            this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        }
        if (iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII > n2) {
            this.lIIIIlIIIIIlllIllIII = n2;
        }
        else if (iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII < n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        }
        if (iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII > n2) {
            this.lIIIlllIIIllIIIllIII = n2;
        }
        else if (iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII < n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
        else {
            this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float n, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        if (iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        }
        if (iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl < n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        else {
            this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        }
        if (iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII < n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        }
        if (iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII < n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
        else {
            this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
        }
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float n, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        if (iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl > n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        }
        if (iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl > n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        else {
            this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        }
        if (iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII > n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        }
        if (iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII > n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
        else {
            this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl = Math.abs(iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl = Math.abs(iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl);
        this.lIIIIlIIIIIlllIllIII = Math.abs(iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII = Math.abs(iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII);
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final float n2) {
        if (this.IllIIlllIIIIlllIIlIl > n2) {
            this.IllIIlllIIIIlllIIlIl = n2;
        }
        else if (this.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        if (this.llllIIIlIlllIlIIIIIl > n2) {
            this.llllIIIlIlllIlIIIIIl = n2;
        }
        else if (this.llllIIIlIlllIlIIIIIl < n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        if (this.lIIIIlIIIIIlllIllIII > n2) {
            this.lIIIIlIIIIIlllIllIII = n2;
        }
        else if (this.lIIIIlIIIIIlllIllIII < n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        if (this.lIIIlllIIIllIIIllIII > n2) {
            this.lIIIlllIIIllIIIllIII = n2;
        }
        else if (this.lIIIlllIIIllIIIllIII < n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n) {
        if (this.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        if (this.llllIIIlIlllIlIIIIIl < n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        if (this.lIIIIlIIIIIlllIllIII < n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        if (this.lIIIlllIIIllIIIllIII < n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float n) {
        if (this.IllIIlllIIIIlllIIlIl > n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        if (this.llllIIIlIlllIlIIIIIl > n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        if (this.lIIIIlIIIIIlllIllIII > n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        if (this.lIIIlllIIIllIIIllIII > n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
    }
    
    public final void IlIlIIIllIllIIIIIllI() {
        this.IllIIlllIIIIlllIIlIl = Math.abs(this.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl = Math.abs(this.llllIIIlIlllIlIIIIIl);
        this.lIIIIlIIIIIlllIllIII = Math.abs(this.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII = Math.abs(this.lIIIlllIIIllIIIllIII);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI2, final float n) {
        this.IllIIlllIIIIlllIIlIl = (1.0f - n) * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl + n * iiiiiiiiIlllIllIlIlI2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (1.0f - n) * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl + n * iiiiiiiiIlllIllIlIlI2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (1.0f - n) * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII + n * iiiiiiiiIlllIllIlIlI2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (1.0f - n) * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII + n * iiiiiiiiIlllIllIlIlI2.lIIIlllIIIllIIIllIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI, final float n) {
        this.IllIIlllIIIIlllIIlIl = (1.0f - n) * this.IllIIlllIIIIlllIIlIl + n * iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (1.0f - n) * this.llllIIIlIlllIlIIIIIl + n * iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (1.0f - n) * this.lIIIIlIIIIIlllIllIII + n * iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (1.0f - n) * this.lIIIlllIIIllIIIllIII + n * iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final float IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final float illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public final float llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final float llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public final float lIIIIlIIIIIlllIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final float liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final float lIIIlllIIIllIIIllIII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIlIlllIlIIIIIl(final float liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
}
