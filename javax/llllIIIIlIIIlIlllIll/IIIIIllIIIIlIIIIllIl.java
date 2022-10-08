package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class IIIIIllIIIIlIIIIllIl implements Serializable, Cloneable
{
    static final long IlIlIIIllIllIIIIIllI = -4748953690425311052L;
    public double IllIIlllIIIIlllIIlIl;
    public double llllIIIlIlllIlIIIIIl;
    public double lIIIIlIIIIIlllIllIII;
    public double lIIIlllIIIllIIIllIII;
    
    public IIIIIllIIIIlIIIIllIl(final double illIIlllIIIIlllIIlIl, final double llllIIIlIlllIlIIIIIl, final double liiiIlIIIIIlllIllIII, final double liiIlllIIIllIIIllIII) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public IIIIIllIIIIlIIIIllIl(final double[] array) {
        this.IllIIlllIIIIlllIIlIl = array[0];
        this.llllIIIlIlllIlIIIIIl = array[1];
        this.lIIIIlIIIIIlllIllIII = array[2];
        this.lIIIlllIIIllIIIllIII = array[3];
    }
    
    public IIIIIllIIIIlIIIIllIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public IIIIIllIIIIlIIIIllIl(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public IIIIIllIIIIlIIIIllIl() {
        this.IllIIlllIIIIlllIIlIl = 0.0;
        this.llllIIIlIlllIlIIIIIl = 0.0;
        this.lIIIIlIIIIIlllIllIII = 0.0;
        this.lIIIlllIIIllIIIllIII = 0.0;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double illIIlllIIIIlllIIlIl, final double llllIIIlIlllIlIIIIIl, final double liiiIlIIIIIlllIllIII, final double liiIlllIIIllIIIllIII) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double[] array) {
        this.IllIIlllIIIIlllIIlIl = array[0];
        this.llllIIIlIlllIlIIIIIl = array[1];
        this.lIIIIlIIIIIlllIllIII = array[2];
        this.lIIIlllIIIllIIIllIII = array[3];
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI) {
        this.IllIIlllIIIIlllIIlIl = iiiiiiiiIlllIllIlIlI.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiiiiiIlllIllIlIlI.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiiiiiIlllIllIlIlI.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiiiiiIlllIllIlIlI.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final double[] array) {
        array[0] = this.IllIIlllIIIIlllIIlIl;
        array[1] = this.llllIIIlIlllIlIIIIIl;
        array[2] = this.lIIIIlIIIIIlllIllIII;
        array[3] = this.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
        iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
        iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII;
        iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2) {
        this.IllIIlllIIIIlllIIlIl = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + iiiiIllIIIIlIIIIllIl2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + iiiiIllIIIIlIIIIllIl2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + iiiiIllIIIIlIIIIllIl2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII + iiiiIllIIIIlIIIIllIl2.lIIIlllIIIllIIIllIII;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl += iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl += iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII += iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII += iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2) {
        this.IllIIlllIIIIlllIIlIl = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl - iiiiIllIIIIlIIIIllIl2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl - iiiiIllIIIIlIIIIllIl2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII - iiiiIllIIIIlIIIIllIl2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII - iiiiIllIIIIlIIIIllIl2.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl -= iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl -= iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII -= iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII -= iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl = -iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl() {
        this.IllIIlllIIIIlllIIlIl = -this.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = -this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = -this.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = -this.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl = n * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = n * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n) {
        this.IllIIlllIIIIlllIIlIl *= n;
        this.llllIIIlIlllIlIIIIIl *= n;
        this.lIIIIlIIIIIlllIllIII *= n;
        this.lIIIlllIIIllIIIllIII *= n;
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2) {
        this.IllIIlllIIIIlllIIlIl = n * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + iiiiIllIIIIlIIIIllIl2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + iiiiIllIIIIlIIIIllIl2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + iiiiIllIIIIlIIIIllIl2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = n * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII + iiiiIllIIIIlIIIIllIl2.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IlIlIlIlIlllllllllIl((double)n, iiiiIllIIIIlIIIIllIl);
    }
    
    public final void IlIlIlIlIlllllllllIl(final double n, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl = n * this.IllIIlllIIIIlllIIlIl + iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = n * this.llllIIIlIlllIlIIIIIl + iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = n * this.lIIIIlIIIIIlllIllIII + iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = n * this.lIIIlllIIIllIIIllIII + iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    @Override
    public String toString() {
        return "(" + this.IllIIlllIIIIlllIIlIl + ", " + this.llllIIIlIlllIlIIIIIl + ", " + this.lIIIIlIIIIIlllIllIII + ", " + this.lIIIlllIIIllIIIllIII + ")";
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        try {
            return this.IllIIlllIIIIlllIIlIl == iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = (IIIIIllIIIIlIIIIllIl)o;
            return this.IllIIlllIIIIlllIIlIl == iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl && this.llllIIIlIlllIlIIIIIl == iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl && this.lIIIIlIIIIIlllIllIII == iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII && this.lIIIlllIIIllIIIllIII == iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        }
        catch (NullPointerException ex) {
            return false;
        }
        catch (ClassCastException ex2) {
            return false;
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final double n) {
        final double n2 = this.IllIIlllIIIIlllIIlIl - iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        if (Double.isNaN(n2)) {
            return false;
        }
        if (((n2 < 0.0) ? (-n2) : n2) > n) {
            return false;
        }
        final double n3 = this.llllIIIlIlllIlIIIIIl - iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        if (Double.isNaN(n3)) {
            return false;
        }
        if (((n3 < 0.0) ? (-n3) : n3) > n) {
            return false;
        }
        final double n4 = this.lIIIIlIIIIIlllIllIII - iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        if (Double.isNaN(n4)) {
            return false;
        }
        if (((n4 < 0.0) ? (-n4) : n4) > n) {
            return false;
        }
        final double n5 = this.lIIIlllIIIllIIIllIII - iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        return !Double.isNaN(n5) && ((n5 < 0.0) ? (-n5) : n5) <= n;
    }
    
    @Override
    public int hashCode() {
        return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(1L, this.IllIIlllIIIIlllIIlIl), this.llllIIIlIlllIlIIIIIl), this.lIIIIlIIIIIlllIllIII), this.lIIIlllIIIllIIIllIII));
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final float n2, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.llllIIIIlIIIlIlllIll(n, (double)n2, iiiiIllIIIIlIIIIllIl);
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final double n2, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        if (iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl > n2) {
            this.IllIIlllIIIIlllIIlIl = n2;
        }
        else if (iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        }
        if (iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl > n2) {
            this.llllIIIlIlllIlIIIIIl = n2;
        }
        else if (iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl < n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        else {
            this.llllIIIlIlllIlIIIIIl = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        }
        if (iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII > n2) {
            this.lIIIIlIIIIIlllIllIII = n2;
        }
        else if (iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII < n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        }
        if (iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII > n2) {
            this.lIIIlllIIIllIIIllIII = n2;
        }
        else if (iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII < n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
        else {
            this.lIIIlllIIIllIIIllIII = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        }
    }
    
    public final void IlIlIlIlIlllllllllIl(final float n, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.llIllIIIIIllIlIIIIlI((double)n, iiiiIllIIIIlIIIIllIl);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double n, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        if (iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl < n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        }
        if (iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl < n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        else {
            this.llllIIIlIlllIlIIIIIl = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        }
        if (iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII < n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        }
        if (iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII < n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
        else {
            this.lIIIlllIIIllIIIllIII = iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
        }
    }
    
    public final void llIllIIIIIllIlIIIIlI(final float n, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IlIIIlIlIIIllIlIlIIl(n, iiiiIllIIIIlIIIIllIl);
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final double n, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        if (iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl > n) {
            this.IllIIlllIIIIlllIIlIl = n;
        }
        else {
            this.IllIIlllIIIIlllIIlIl = iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        }
        if (iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl > n) {
            this.llllIIIlIlllIlIIIIIl = n;
        }
        else {
            this.llllIIIlIlllIlIIIIIl = iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        }
        if (iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII > n) {
            this.lIIIIlIIIIIlllIllIII = n;
        }
        else {
            this.lIIIIlIIIIIlllIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        }
        if (iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII > n) {
            this.lIIIlllIIIllIIIllIII = n;
        }
        else {
            this.lIIIlllIIIllIIIllIII = iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        }
    }
    
    public final void llllIIIlIlllIlIIIIIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        this.IllIIlllIIIIlllIIlIl = Math.abs(iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl);
        this.llllIIIlIlllIlIIIIIl = Math.abs(iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl);
        this.lIIIIlIIIIIlllIllIII = Math.abs(iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII = Math.abs(iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII);
    }
    
    public final void llllIIIIlIIIlIlllIll(final float n, final float n2) {
        this.llllIIIIlIIIlIlllIll(n, (double)n2);
    }
    
    public final void llllIIIIlIIIlIlllIll(final double n, final double n2) {
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
    
    public final void llllIIIIlIIIlIlllIll(final float n) {
        this.IlIlIlIlIlllllllllIl((double)n);
    }
    
    public final void IlIlIlIlIlllllllllIl(final double n) {
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
    
    public final void IlIlIlIlIlllllllllIl(final float n) {
        this.llIllIIIIIllIlIIIIlI(n);
    }
    
    public final void llIllIIIIIllIlIIIIlI(final double n) {
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
    
    public void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2, final float n) {
        this.llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl, iiiiIllIIIIlIIIIllIl2, (double)n);
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2, final double n) {
        this.IllIIlllIIIIlllIIlIl = (1.0 - n) * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl + n * iiiiIllIIIIlIIIIllIl2.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (1.0 - n) * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl + n * iiiiIllIIIIlIIIIllIl2.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (1.0 - n) * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII + n * iiiiIllIIIIlIIIIllIl2.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (1.0 - n) * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII + n * iiiiIllIIIIlIIIIllIl2.lIIIlllIIIllIIIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final float n) {
        this.IlIlIlIlIlllllllllIl(iiiiIllIIIIlIIIIllIl, n);
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl, final double n) {
        this.IllIIlllIIIIlllIIlIl = (1.0 - n) * this.IllIIlllIIIIlllIIlIl + n * iiiiIllIIIIlIIIIllIl.IllIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = (1.0 - n) * this.llllIIIlIlllIlIIIIIl + n * iiiiIllIIIIlIIIIllIl.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = (1.0 - n) * this.lIIIIlIIIIIlllIllIII + n * iiiiIllIIIIlIIIIllIl.lIIIIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = (1.0 - n) * this.lIIIlllIIIllIIIllIII + n * iiiiIllIIIIlIIIIllIl.lIIIlllIIIllIIIllIII;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final double IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final double illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public final double llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public final void IlIlIIIllIllIIIIIllI(final double llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public final double lIIIIlIIIIIlllIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public final void IllIIlllIIIIlllIIlIl(final double liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public final double lIIIlllIIIllIIIllIII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public final void llllIIIlIlllIlIIIIIl(final double liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
}
