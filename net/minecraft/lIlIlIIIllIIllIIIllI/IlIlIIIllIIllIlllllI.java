package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;
import java.util.*;

public class IlIlIIIllIIllIlllllI extends llllIIIlIlllIlIIIIIl
{
    private byte[] IlIlIlIlIlllllllllIl;
    
    IlIlIIIllIIllIlllllI() {
    }
    
    public IlIlIIIllIIllIlllllI(final byte[] ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeInt(this.IlIlIlIlIlllllllllIl.length);
        dataOutput.write(this.IlIlIlIlIlllllllllIl);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(192L);
        final int int1 = dataInput.readInt();
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(8 * int1);
        dataInput.readFully(this.IlIlIlIlIlllllllllIl = new byte[int1]);
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 7;
    }
    
    @Override
    public String toString() {
        return "[" + this.IlIlIlIlIlllllllllIl.length + " bytes]";
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        final byte[] array = new byte[this.IlIlIlIlIlllllllllIl.length];
        System.arraycopy(this.IlIlIlIlIlllllllllIl, 0, array, 0, this.IlIlIlIlIlllllllllIl.length);
        return new IlIlIIIllIIllIlllllI(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && Arrays.equals(this.IlIlIlIlIlllllllllIl, ((IlIlIIIllIIllIlllllI)o).IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.IlIlIlIlIlllllllllIl);
    }
    
    public byte[] IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
