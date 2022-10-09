package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlllIIlIllIllIlIIll extends lIIIIlIIIIIlllIllIII
{
    private double IlIlIlIlIlllllllllIl;
    
    IIlllIIlIllIllIlIIll() {
    }
    
    public IIlllIIlIllIllIlIIll(final double ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeDouble(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(128L);
        this.IlIlIlIlIlllllllllIl = dataInput.readDouble();
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 6;
    }
    
    @Override
    public String toString() {
        return this.IlIlIlIlIlllllllllIl + "d";
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        return new IIlllIIlIllIllIlIIll(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.IlIlIlIlIlllllllllIl == ((IIlllIIlIllIllIlIIll)o).IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public int hashCode() {
        final long doubleToLongBits = Double.doubleToLongBits(this.IlIlIlIlIlllllllllIl);
        return super.hashCode() ^ (int)(doubleToLongBits ^ doubleToLongBits >>> 32);
    }
    
    @Override
    public long IlIlIIIllIllIIIIIllI() {
        return (long)Math.floor(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int IllIIlllIIIIlllIIlIl() {
        return llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public short llllIIIlIlllIlIIIIIl() {
        return (short)(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl) & 0xFFFF);
    }
    
    @Override
    public byte lIIIIlIIIIIlllIllIII() {
        return (byte)(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIlIlIlllllllllIl) & 0xFF);
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
