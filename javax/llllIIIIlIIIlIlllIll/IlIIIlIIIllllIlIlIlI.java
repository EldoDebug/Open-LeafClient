package javax.llllIIIIlIIIlIlllIll;

import java.io.*;

public abstract class IlIIIlIIIllllIlIlIlI implements Serializable, Cloneable
{
    static final long IlIlIlIlIlllllllllIl = -8226727741811898211L;
    public byte llIllIIIIIllIlIIIIlI;
    public byte IlIIIlIlIIIllIlIlIIl;
    public byte IlIlIIIllIllIIIIIllI;
    public byte IllIIlllIIIIlllIIlIl;
    
    public IlIIIlIIIllllIlIlIlI(final byte llIllIIIIIllIlIIIIlI, final byte ilIIIlIlIIIllIlIlIIl, final byte ilIlIIIllIllIIIIIllI, final byte illIIlllIIIIlllIIlIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public IlIIIlIIIllllIlIlIlI(final byte[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
        this.IllIIlllIIIIlllIIlIl = array[3];
    }
    
    public IlIIIlIIIllllIlIlIlI(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI) {
        this.llIllIIIIIllIlIIIIlI = ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = ilIIIlIIIllllIlIlIlI.IllIIlllIIIIlllIIlIl;
    }
    
    public IlIIIlIIIllllIlIlIlI() {
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = 0;
        this.IllIIlllIIIIlllIIlIl = 0;
    }
    
    @Override
    public String toString() {
        return "(" + (this.llIllIIIIIllIlIIIIlI & 0xFF) + ", " + (this.IlIIIlIlIIIllIlIlIIl & 0xFF) + ", " + (this.IlIlIIIllIllIIIIIllI & 0xFF) + ", " + (this.IllIIlllIIIIlllIIlIl & 0xFF) + ")";
    }
    
    public final void llllIIIIlIIIlIlllIll(final byte[] array) {
        array[0] = this.llIllIIIIIllIlIIIIlI;
        array[1] = this.IlIIIlIlIIIllIlIlIIl;
        array[2] = this.IlIlIIIllIllIIIIIllI;
        array[3] = this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void llllIIIIlIIIlIlllIll(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI) {
        ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI;
        ilIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        ilIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI;
        ilIIIlIIIllllIlIlIlI.IllIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI) {
        this.llIllIIIIIllIlIIIIlI = ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = ilIIIlIIIllllIlIlIlI.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIlIlIlIlllllllllIl(final byte[] array) {
        this.llIllIIIIIllIlIIIIlI = array[0];
        this.IlIIIlIlIIIllIlIlIIl = array[1];
        this.IlIlIIIllIllIIIIIllI = array[2];
        this.IllIIlllIIIIlllIIlIl = array[3];
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI) {
        try {
            return this.llIllIIIIIllIlIIIIlI == ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == ilIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == ilIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == ilIIIlIIIllllIlIlIlI.IllIIlllIIIIlllIIlIl;
        }
        catch (NullPointerException ex) {
            return false;
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        try {
            final IlIIIlIIIllllIlIlIlI ilIIIlIIIllllIlIlIlI = (IlIIIlIIIllllIlIlIlI)o;
            return this.llIllIIIIIllIlIIIIlI == ilIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI && this.IlIIIlIlIIIllIlIlIIl == ilIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl && this.IlIlIIIllIllIIIIIllI == ilIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI && this.IllIIlllIIIIlllIIlIl == ilIIIlIIIllllIlIlIlI.IllIIlllIIIIlllIIlIl;
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
        return (this.llIllIIIIIllIlIIIIlI & 0xFF) << 0 | (this.IlIIIlIlIIIllIlIlIIl & 0xFF) << 8 | (this.IlIlIIIllIllIIIIIllI & 0xFF) << 16 | (this.IllIIlllIIIIlllIIlIl & 0xFF) << 24;
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
    
    public final byte IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public final void IlIIIlIlIIIllIlIlIIl(final byte illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
