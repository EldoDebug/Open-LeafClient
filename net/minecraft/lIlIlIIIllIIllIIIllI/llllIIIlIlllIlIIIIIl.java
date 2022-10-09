package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;

public abstract class llllIIIlIlllIlIIIIIl
{
    public static final String[] llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new String[] { "END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]" };
    }
    
    abstract void llllIIIIlIIIlIlllIll(final DataOutput p0);
    
    abstract void llllIIIIlIIIlIlllIll(final DataInput p0, final int p1, final llIIlIIIlIIIllIlIIIl p2);
    
    @Override
    public abstract String toString();
    
    public abstract byte llllIIIIlIIIlIlllIll();
    
    protected static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final byte b) {
        switch (b) {
            case 0: {
                return new lllIIIIlllllIlIIllIl();
            }
            case 1: {
                return new lIlIlIIIllIIllIIIllI();
            }
            case 2: {
                return new IIlIIIIlllIlllllIlII();
            }
            case 3: {
                return new IIllIIllIIIlIlIIIIlI();
            }
            case 4: {
                return new IlllllllIIIlIIIlIlII();
            }
            case 5: {
                return new IlIlIIIIIIlllIlIllIl();
            }
            case 6: {
                return new IIlllIIlIllIllIlIIll();
            }
            case 7: {
                return new IlIlIIIllIIllIlllllI();
            }
            case 8: {
                return new IIIlIIlIIIIlllIlllII();
            }
            case 9: {
                return new IlIlIIIlIIlIlIIlllIl();
            }
            case 10: {
                return new IIIIlllIIIIIIlIIIlll();
            }
            case 11: {
                return new IIIlIIIlIlIIlllIIlll();
            }
            default: {
                return null;
            }
        }
    }
    
    public abstract llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl();
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return false;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof llllIIIlIlllIlIIIIIl && this.llllIIIIlIIIlIlllIll() == ((llllIIIlIlllIlIIIIIl)o).llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public int hashCode() {
        return this.llllIIIIlIIIlIlllIll();
    }
    
    protected String IlIIIlIlIIIllIlIlIIl() {
        return this.toString();
    }
}
