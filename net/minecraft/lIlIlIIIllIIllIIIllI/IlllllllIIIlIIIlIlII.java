package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;

public class IlllllllIIIlIIIlIlII extends lIIIIlIIIIIlllIllIII
{
    private long IlIlIlIlIlllllllllIl;
    
    IlllllllIIIlIIIlIlII() {
    }
    
    public IlllllllIIIlIIIlIlII(final long ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeLong(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(128L);
        this.IlIlIlIlIlllllllllIl = dataInput.readLong();
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 4;
    }
    
    @Override
    public String toString() {
        return this.IlIlIlIlIlllllllllIl + "L";
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return new IlllllllIIIlIIIlIlII(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.IlIlIlIlIlllllllllIl == ((IlllllllIIIlIIIlIlII)o).IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ (int)(this.IlIlIlIlIlllllllllIl ^ this.IlIlIlIlIlllllllllIl >>> 32);
    }
    
    @Override
    public long IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return (int)(this.IlIlIlIlIlllllllllIl & -1L);
    }
    
    @Override
    public short llllIIIlIlllIlIIIIIl() {
        return (short)(this.IlIlIlIlIlllllllllIl & 0xFFFFL);
    }
    
    @Override
    public byte lIIIIlIIIIIlllIllIII() {
        return (byte)(this.IlIlIlIlIlllllllllIl & 0xFFL);
    }
    
    @Override
    public double lIIIlllIIIllIIIllIII() {
        return (double)this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public float llIIlIIIlIIIllIlIIIl() {
        return (float)this.IlIlIlIlIlllllllllIl;
    }
}
