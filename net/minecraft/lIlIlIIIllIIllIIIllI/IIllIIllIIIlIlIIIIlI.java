package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;

public class IIllIIllIIIlIlIIIIlI extends lIIIIlIIIIIlllIllIII
{
    private int IlIlIlIlIlllllllllIl;
    
    IIllIIllIIIlIlIIIIlI() {
    }
    
    public IIllIIllIIIlIlIIIIlI(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeInt(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(96L);
        this.IlIlIlIlIlllllllllIl = dataInput.readInt();
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 3;
    }
    
    @Override
    public String toString() {
        return new StringBuilder().append(this.IlIlIlIlIlllllllllIl).toString();
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return new IIllIIllIIIlIlIIIIlI(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.IlIlIlIlIlllllllllIl == ((IIllIIllIIIlIlIIIIlI)o).IlIlIlIlIlllllllllIl;
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
        return (short)(this.IlIlIlIlIlllllllllIl & 0xFFFF);
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
        return (float)this.IlIlIlIlIlllllllllIl;
    }
}
