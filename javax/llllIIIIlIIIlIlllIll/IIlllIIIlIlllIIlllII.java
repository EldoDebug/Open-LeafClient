package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class IIlllIIIlIlllIIlllII implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = -483782685323607044L;
    public byte llIllIIIIIllIlIIIIlI;
    public byte IlIIIlIlIIIllIlIlIIl;
    public byte IlIlIIIllIllIIIIIllI;
    
    public IIlllIIIlIlllIIlllII(final byte llIllIIIIIllIlIIIIlI, final byte ilIIIlIlIIIllIlIlIIl, final byte ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public IIlllIIIlIlllIIlllII(final byte[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
    }
    
    public IIlllIIIlIlllIIlllII(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        this.llIllIIIIIllIlIIIIlI = illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = illlIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = illlIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI;
    }
    
    public IIlllIIIlIlllIIlllII() {
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = 0;
    }
    
    @Override
    public String toString() {
        return "(" + (this.llIllIIIIIllIlIIIIlI & 0xFF) + ", " + (this.IlIIIlIlIIIllIlIlIIl & 0xFF) + ", " + (this.IlIlIIIllIllIIIIIllI & 0xFF) + ")";
    }
    
    public final void llllIIIIlIIIlIlllIll(final byte[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
        array[2] = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        illlIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        illlIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        this.llIllIIIIIllIlIIIIlI = illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = illlIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = illlIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI;
    }
    
    public final void IlIlIlIlIlllllllllIl(final byte[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        try {
            return this.llIllIIIIIllIlIIIIlI == illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == illlIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == illlIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII = (IIlllIIIlIlllIIlllII)o;
            return this.llIllIIIIIllIlIIIIlI == illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == illlIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == illlIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI;
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
        return (this.llIllIIIIIllIlIIIIlI & 0xFF) << 0 | (this.IlIIIlIlIIIllIlIlIIl & 0xFF) << 8 | (this.IlIlIIIllIllIIIIIllI & 0xFF) << 16;
    }
    
    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex) {
            throw new InternalError();
        }
    }
    
    public final byte IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public final void llllIIIIlIIIlIlllIll(final byte llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public final byte llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final byte ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public final byte IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public final void llIllIIIIIllIlIIIIlI(final byte ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
}
