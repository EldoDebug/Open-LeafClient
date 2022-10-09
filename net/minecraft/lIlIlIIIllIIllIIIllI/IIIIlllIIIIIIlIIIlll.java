package net.minecraft.lIlIlIIIllIIllIIIllI;

import com.google.common.collect.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.concurrent.*;
import net.minecraft.llIllIIIIIllIlIIIIlI.*;
import java.io.*;

public class IIIIlllIIIIIIlIIIlll extends llllIIIlIlllIlIIIIIl
{
    private Map IlIlIlIlIlllllllllIl;
    
    public IIIIlllIIIIIIlIIIlll() {
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        for (final String s : this.IlIlIlIlIlllllllllIl.keySet()) {
            llllIIIIlIIIlIlllIll(s, (llllIIIlIlllIlIIIIIl)this.IlIlIlIlIlllllllllIl.get(s), dataOutput);
        }
        dataOutput.writeByte(0);
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(384L);
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.IlIlIlIlIlllllllllIl.clear();
        byte llllIIIIlIIIlIlllIll;
        while ((llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(dataInput, llIIlIIIlIIIllIlIIIl)) != 0) {
            final String ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(dataInput, llIIlIIIlIIIllIlIIIl);
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(224 + 16 * ilIlIlIlIlllllllllIl.length());
            if (this.IlIlIlIlIlllllllllIl.put(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, dataInput, n + 1, llIIlIIIlIIIllIlIIIl)) != null) {
                llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(288L);
            }
        }
    }
    
    public Set IlIlIIIllIllIIIIIllI() {
        return this.IlIlIlIlIlllllllllIl.keySet();
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 10;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        this.IlIlIlIlIlllllllllIl.put(s, llllIIIlIlllIlIIIIIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final byte b) {
        this.IlIlIlIlIlllllllllIl.put(s, new lIlIlIIIllIIllIIIllI(b));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final short n) {
        this.IlIlIlIlIlllllllllIl.put(s, new IIlIIIIlllIlllllIlII(n));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int n) {
        this.IlIlIlIlIlllllllllIl.put(s, new IIllIIllIIIlIlIIIIlI(n));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final long n) {
        this.IlIlIlIlIlllllllllIl.put(s, new IlllllllIIIlIIIlIlII(n));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final float n) {
        this.IlIlIlIlIlllllllllIl.put(s, new IlIlIIIIIIlllIlIllIl(n));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final double n) {
        this.IlIlIlIlIlllllllllIl.put(s, new IIlllIIlIllIllIlIIll(n));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        this.IlIlIlIlIlllllllllIl.put(s, new IIIlIIlIIIIlllIlllII(s2));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final byte[] array) {
        this.IlIlIlIlIlllllllllIl.put(s, new IlIlIIIllIIllIlllllI(array));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final int[] array) {
        this.IlIlIlIlIlllllllllIl.put(s, new IIIlIIIlIlIIlllIIlll(array));
    }
    
    public void llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        this.llllIIIIlIIIlIlllIll(s, (byte)(b ? 1 : 0));
    }
    
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final String s) {
        return this.IlIlIlIlIlllllllllIl.get(s);
    }
    
    public byte IlIlIlIlIlllllllllIl(final String s) {
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.IlIlIlIlIlllllllllIl.get(s);
        return (byte)((llllIIIlIlllIlIIIIIl != null) ? llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() : 0);
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final String s) {
        return this.IlIlIlIlIlllllllllIl.containsKey(s);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s, final int n) {
        final byte ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(s);
        if (ilIlIlIlIlllllllllIl == n) {
            return true;
        }
        if (n != 99) {
            if (ilIlIlIlIlllllllllIl > 0) {}
            return false;
        }
        return ilIlIlIlIlllllllllIl == 1 || ilIlIlIlIlllllllllIl == 2 || ilIlIlIlIlllllllllIl == 3 || ilIlIlIlIlllllllllIl == 4 || ilIlIlIlIlllllllllIl == 5 || ilIlIlIlIlllllllllIl == 6;
    }
    
    public byte IlIIIlIlIIIllIlIlIIl(final String s) {
        try {
            return (byte)(this.IlIlIlIlIlllllllllIl(s, 99) ? this.IlIlIlIlIlllllllllIl.get(s).lIIIIlIIIIIlllIllIII() : 0);
        }
        catch (ClassCastException ex) {
            return 0;
        }
    }
    
    public short IlIlIIIllIllIIIIIllI(final String s) {
        try {
            return (short)(this.IlIlIlIlIlllllllllIl(s, 99) ? this.IlIlIlIlIlllllllllIl.get(s).llllIIIlIlllIlIIIIIl() : 0);
        }
        catch (ClassCastException ex) {
            return 0;
        }
    }
    
    public int IllIIlllIIIIlllIIlIl(final String s) {
        try {
            return this.IlIlIlIlIlllllllllIl(s, 99) ? this.IlIlIlIlIlllllllllIl.get(s).IllIIlllIIIIlllIIlIl() : 0;
        }
        catch (ClassCastException ex) {
            return 0;
        }
    }
    
    public long llllIIIlIlllIlIIIIIl(final String s) {
        try {
            return this.IlIlIlIlIlllllllllIl(s, 99) ? this.IlIlIlIlIlllllllllIl.get(s).IlIlIIIllIllIIIIIllI() : 0L;
        }
        catch (ClassCastException ex) {
            return 0L;
        }
    }
    
    public float lIIIIlIIIIIlllIllIII(final String s) {
        try {
            return this.IlIlIlIlIlllllllllIl(s, 99) ? this.IlIlIlIlIlllllllllIl.get(s).llIIlIIIlIIIllIlIIIl() : 0.0f;
        }
        catch (ClassCastException ex) {
            return 0.0f;
        }
    }
    
    public double lIIIlllIIIllIIIllIII(final String s) {
        try {
            return this.IlIlIlIlIlllllllllIl(s, 99) ? this.IlIlIlIlIlllllllllIl.get(s).lIIIlllIIIllIIIllIII() : 0.0;
        }
        catch (ClassCastException ex) {
            return 0.0;
        }
    }
    
    public String llIIlIIIlIIIllIlIIIl(final String s) {
        try {
            return this.IlIlIlIlIlllllllllIl(s, 8) ? this.IlIlIlIlIlllllllllIl.get(s).IlIIIlIlIIIllIlIlIIl() : "";
        }
        catch (ClassCastException ex) {
            return "";
        }
    }
    
    public byte[] llIllIlIIIIllIlIIllI(final String s) {
        try {
            return this.IlIlIlIlIlllllllllIl(s, 7) ? this.IlIlIlIlIlllllllllIl.get(s).IlIlIIIllIllIIIIIllI() : new byte[0];
        }
        catch (ClassCastException ex) {
            throw new IIlIlllIlIlllIlIllll(this.llllIIIIlIIIlIlllIll(s, 7, ex));
        }
    }
    
    public int[] lIlIlIIIllIIllIIIllI(final String s) {
        try {
            return this.IlIlIlIlIlllllllllIl(s, 11) ? this.IlIlIlIlIlllllllllIl.get(s).IlIlIIIllIllIIIIIllI() : new int[0];
        }
        catch (ClassCastException ex) {
            throw new IIlIlllIlIlllIlIllll(this.llllIIIIlIIIlIlllIll(s, 11, ex));
        }
    }
    
    public IIIIlllIIIIIIlIIIlll IlIlIIIllIIllIlllllI(final String s) {
        try {
            return this.IlIlIlIlIlllllllllIl(s, 10) ? this.IlIlIlIlIlllllllllIl.get(s) : new IIIIlllIIIIIIlIIIlll();
        }
        catch (ClassCastException ex) {
            throw new IIlIlllIlIlllIlIllll(this.llllIIIIlIIIlIlllIll(s, 10, ex));
        }
    }
    
    public IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI(final String s, final int n) {
        try {
            if (this.IlIlIlIlIlllllllllIl(s) != 9) {
                return new IlIlIIIlIIlIlIIlllIl();
            }
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = this.IlIlIlIlIlllllllllIl.get(s);
            return (ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI() > 0 && ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl() != n) ? new IlIlIIIlIIlIlIIlllIl() : ilIlIIIlIIlIlIIlllIl;
        }
        catch (ClassCastException ex) {
            throw new IIlIlllIlIlllIlIllll(this.llllIIIIlIIIlIlllIll(s, 9, ex));
        }
    }
    
    public boolean IIIIlllIIIIIIlIIIlll(final String s) {
        return this.IlIIIlIlIIIllIlIlIIl(s) != 0;
    }
    
    public void llllIIllllIlIlIIIIll(final String s) {
        this.IlIlIlIlIlllllllllIl.remove(s);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        for (final Map.Entry<String, V> entry : this.IlIlIlIlIlllllllllIl.entrySet()) {
            if (sb.length() != 1) {
                sb.append(',');
            }
            sb.append(entry.getKey()).append(':').append(entry.getValue());
        }
        return sb.append('}').toString();
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl.isEmpty();
    }
    
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final String s, final int n, final ClassCastException ex) {
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ex, "Reading NBT data");
        final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Corrupt NBT tag", 1);
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Tag type found", new llllIIllllIlIlIIIIll(this, s));
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Tag type expected", new IlIllIlIlIIIlIlIlIII(this, n));
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("Tag name", s);
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
        for (final String s : this.IlIlIlIlIlllllllllIl.keySet()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(s, ((llllIIIlIlllIlIIIIIl)this.IlIlIlIlIlllllllllIl.get(s)).IlIlIlIlIlllllllllIl());
        }
        return iiiIlllIIIIIIlIIIlll;
    }
    
    @Override
    public boolean equals(final Object o) {
        return super.equals(o) && this.IlIlIlIlIlllllllllIl.entrySet().equals(((IIIIlllIIIIIIlIIIlll)o).IlIlIlIlIlllllllllIl.entrySet());
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.IlIlIlIlIlllllllllIl.hashCode();
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final DataOutput dataOutput) {
        dataOutput.writeByte(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll());
        if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() != 0) {
            dataOutput.writeUTF(s);
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(dataOutput);
        }
    }
    
    private static byte llllIIIIlIIIlIlllIll(final DataInput dataInput, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return dataInput.readByte();
    }
    
    private static String IlIlIlIlIlllllllllIl(final DataInput dataInput, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return dataInput.readUTF();
    }
    
    static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final byte b, final String s, final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(b);
        try {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(dataInput, n, llIIlIIIlIIIllIlIIIl);
            return llllIIIIlIIIlIlllIll;
        }
        catch (IOException ex) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ex, "Loading NBT data");
            final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll("NBT Tag");
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Tag name", s);
            llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("Tag type", b);
            throw new IIlIlllIlIlllIlIllll(llllIIIIlIIIlIlllIll2);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        for (final String s : iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.keySet()) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl.get(s);
            if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == 10) {
                if (this.IlIlIlIlIlllllllllIl(s, 10)) {
                    this.IlIlIIIllIIllIlllllI(s).llllIIIIlIIIlIlllIll((IIIIlllIIIIIIlIIIlll)llllIIIlIlllIlIIIIIl);
                }
                else {
                    this.llllIIIIlIIIlIlllIll(s, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
                }
            }
            else {
                this.llllIIIIlIIIlIlllIll(s, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
            }
        }
    }
}
