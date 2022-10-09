package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;

public class lIlIlIIIllIIllIIIllI extends lIIIIlIIIIIlllIllIII
{
    private byte IlIlIlIlIlllllllllIl;
    
    lIlIlIIIllIIllIIIllI() {
    }
    
    public lIlIlIIIllIIllIIIllI(final byte ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeByte(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(72L);
        this.IlIlIlIlIlllllllllIl = dataInput.readByte();
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 1;
    }
    
    @Override
    public String toString() {
        return this.IlIlIlIlIlllllllllIl + "b";
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return new lIlIlIIIllIIllIIIllI(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.IlIlIlIlIlllllllllIl == ((lIlIlIIIllIIllIIIllI)o).IlIlIlIlIlllllllllIl;
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
        return this.IlIlIlIlIlllllllllIl;
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
