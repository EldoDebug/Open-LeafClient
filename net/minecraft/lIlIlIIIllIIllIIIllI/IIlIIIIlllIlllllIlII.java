package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;

public class IIlIIIIlllIlllllIlII extends lIIIIlIIIIIlllIllIII
{
    private short IlIlIlIlIlllllllllIl;
    
    public IIlIIIIlllIlllllIlII() {
    }
    
    public IIlIIIIlllIlllllIlII(final short ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeShort(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(80L);
        this.IlIlIlIlIlllllllllIl = dataInput.readShort();
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String toString() {
        return this.IlIlIlIlIlllllllllIl + "s";
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return new IIlIIIIlllIlllllIlII(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.IlIlIlIlIlllllllllIl == ((IIlIIIIlllIlllllIlII)o).IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public long IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public short llllIIIlIlllIlIIIIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public byte lIIIIlIIIIIlllIllIII() {
        return (byte)(this.IlIlIlIlIlllllllllIl & 0xFF);
    }
    
    @Override
    public double lIIIlllIIIllIIIllIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public float llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
