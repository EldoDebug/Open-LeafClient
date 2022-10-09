package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIIIIlllIlIllIl extends lIIIIlIIIIIlllIllIII
{
    private float IlIlIlIlIlllllllllIl;
    
    IlIlIIIIIIlllIlIllIl() {
    }
    
    public IlIlIIIIIIlllIlIllIl(final float ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeFloat(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(96L);
        this.IlIlIlIlIlllllllllIl = dataInput.readFloat();
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 5;
    }
    
    @Override
    public String toString() {
        return this.IlIlIlIlIlllllllllIl + "f";
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return new IlIlIIIIIIlllIlIllIl(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.IlIlIlIlIlllllllllIl == ((IlIlIIIIIIlllIlIllIl)o).IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Float.floatToIntBits(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public long IlIlIIIllIllIIIIIllI() {
        return (long)this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public short llllIIIlIlllIlIIIIIl() {
        return (short)(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl) & 0xFFFF);
    }
    
    @Override
    public byte lIIIIlIIIIIlllIllIII() {
        return (byte)(llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(this.IlIlIlIlIlllllllllIl) & 0xFF);
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
