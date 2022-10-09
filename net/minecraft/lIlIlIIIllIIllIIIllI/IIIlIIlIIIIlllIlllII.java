package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;

public class IIIlIIlIIIIlllIlllII extends llllIIIlIlllIlIIIIIl
{
    private String IlIlIlIlIlllllllllIl;
    
    public IIIlIIlIIIIlllIlllII() {
        this.IlIlIlIlIlllllllllIl = "";
    }
    
    public IIIlIIlIIIIlllIlllII(final String ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl == null) {
            throw new IllegalArgumentException("Empty string not allowed");
        }
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeUTF(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(288L);
        this.IlIlIlIlIlllllllllIl = dataInput.readUTF();
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(16 * this.IlIlIlIlIlllllllllIl.length());
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 8;
    }
    
    @Override
    public String toString() {
        return "\"" + this.IlIlIlIlIlllllllllIl.replace("\"", "\\\"") + "\"";
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return new IIIlIIlIIIIlllIlllII(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl.isEmpty();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!super.equals(o)) {
            return false;
        }
        final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)o;
        return (this.IlIlIlIlIlllllllllIl == null && iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl == null) || (this.IlIlIlIlIlllllllllIl != null && this.IlIlIlIlIlllllllllIl.equals(iiIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl));
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.IlIlIlIlIlllllllllIl.hashCode();
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
