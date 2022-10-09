package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.io.*;
import java.util.*;

public class IIIlIIIlIlIIlllIIlll extends llllIIIlIlllIlIIIIIl
{
    private int[] IlIlIlIlIlllllllllIl;
    
    IIIlIIIlIlIIlllIIlll() {
    }
    
    public IIIlIIIlIlIIlllIIlll(final int[] ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        dataOutput.writeInt(this.IlIlIlIlIlllllllllIl.length);
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            dataOutput.writeInt(this.IlIlIlIlIlllllllllIl[i]);
        }
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(192L);
        final int int1 = dataInput.readInt();
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(32 * int1);
        this.IlIlIlIlIlllllllllIl = new int[int1];
        for (int i = 0; i < int1; ++i) {
            this.IlIlIlIlIlllllllllIl[i] = dataInput.readInt();
        }
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 11;
    }
    
    @Override
    public String toString() {
        String string = "[";
        int[] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            string = String.valueOf(string) + ilIlIlIlIlllllllllIl[i] + ",";
        }
        return String.valueOf(string) + "]";
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        final int[] array = new int[this.IlIlIlIlIlllllllllIl.length];
        System.arraycopy(this.IlIlIlIlIlllllllllIl, 0, array, 0, this.IlIlIlIlIlllllllllIl.length);
        return new IIIlIIIlIlIIlllIIlll(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && Arrays.equals(this.IlIlIlIlIlllllllllIl, ((IIIlIIIlIlIIlllIIlll)o).IlIlIlIlIlllllllllIl);
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.IlIlIlIlIlllllllllIl);
    }
    
    public int[] IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
