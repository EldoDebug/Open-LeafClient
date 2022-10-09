package net.minecraft.lIlIlIIIllIIllIIIllI;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import java.io.*;
import java.util.*;

public class IlIlIIIlIIlIlIIlllIl extends llllIIIlIlllIlIIIIIl
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private List llIllIIIIIllIlIIIIlI;
    private byte IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
    }
    
    public IlIlIIIlIIlIlIIlllIl() {
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayList();
        this.IlIIIlIlIIIllIlIlIIl = 0;
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataOutput dataOutput) {
        if (!this.llIllIIIIIllIlIIIIlI.isEmpty()) {
            this.IlIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI.get(0).llllIIIIlIIIlIlllIll();
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = 0;
        }
        dataOutput.writeByte(this.IlIIIlIlIIIllIlIlIIl);
        dataOutput.writeInt(this.llIllIIIIIllIlIIIIlI.size());
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.size(); ++i) {
            ((llllIIIlIlllIlIIIIIl)this.llIllIIIIIllIlIIIIlI.get(i)).llllIIIIlIIIlIlllIll(dataOutput);
        }
    }
    
    @Override
    void llllIIIIlIIIlIlllIll(final DataInput dataInput, final int n, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(296L);
        if (n > 512) {
            throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
        }
        this.IlIIIlIlIIIllIlIlIIl = dataInput.readByte();
        final int int1 = dataInput.readInt();
        if (this.IlIIIlIlIIIllIlIlIIl == 0 && int1 > 0) {
            throw new RuntimeException("Missing type on ListTag");
        }
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(32L * int1);
        this.llIllIIIIIllIlIIIIlI = Lists.newArrayListWithCapacity(int1);
        for (int i = 0; i < int1; ++i) {
            final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(dataInput, n + 1, llIIlIIIlIIIllIlIIIl);
            this.llIllIIIIIllIlIIIIlI.add(llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public byte llllIIIIlIIIlIlllIll() {
        return 9;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.size(); ++i) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append(i).append(':').append(this.llIllIIIIIllIlIIIIlI.get(i));
        }
        return sb.append(']').toString();
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == 0) {
            IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl.warn("Invalid TagEnd added to ListTag");
        }
        else {
            if (this.IlIIIlIlIIIllIlIlIIl == 0) {
                this.IlIIIlIlIIIllIlIlIIl = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
            }
            else if (this.IlIIIlIlIIIllIlIlIIl != llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) {
                IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl.warn("Adding mismatching tag types to tag list");
                return;
            }
            this.llIllIIIIIllIlIIIIlI.add(llllIIIlIlllIlIIIIIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == 0) {
            IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl.warn("Invalid TagEnd added to ListTag");
        }
        else if (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.size()) {
            if (this.IlIIIlIlIIIllIlIlIIl == 0) {
                this.IlIIIlIlIIIllIlIlIIl = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
            }
            else if (this.IlIIIlIlIIIllIlIlIIl != llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) {
                IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl.warn("Adding mismatching tag types to tag list");
                return;
            }
            this.llIllIIIIIllIlIIIIlI.set(n, llllIIIlIlllIlIIIIIl);
        }
        else {
            IlIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl.warn("index out of bounds to set tag in tag list");
        }
    }
    
    public llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final int n) {
        return this.llIllIIIIIllIlIIIIlI.remove(n);
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI.isEmpty();
    }
    
    public IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl(final int n) {
        if (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.size()) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI.get(n);
            return (IIIIlllIIIIIIlIIIlll)((llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == 10) ? llllIIIlIlllIlIIIIIl : new IIIIlllIIIIIIlIIIlll());
        }
        return new IIIIlllIIIIIIlIIIlll();
    }
    
    public int[] llIllIIIIIllIlIIIIlI(final int n) {
        if (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.size()) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI.get(n);
            return (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == 11) ? ((IIIlIIIlIlIIlllIIlll)llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI() : new int[0];
        }
        return new int[0];
    }
    
    public double IlIIIlIlIIIllIlIlIIl(final int n) {
        if (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.size()) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI.get(n);
            return (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == 6) ? ((IIlllIIlIllIllIlIIll)llllIIIlIlllIlIIIIIl).lIIIlllIIIllIIIllIII() : 0.0;
        }
        return 0.0;
    }
    
    public float IlIlIIIllIllIIIIIllI(final int n) {
        if (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.size()) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI.get(n);
            return (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == 5) ? ((IlIlIIIIIIlllIlIllIl)llllIIIlIlllIlIIIIIl).llIIlIIIlIIIllIlIIIl() : 0.0f;
        }
        return 0.0f;
    }
    
    public String IllIIlllIIIIlllIIlIl(final int n) {
        if (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.size()) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = this.llIllIIIIIllIlIIIIlI.get(n);
            return (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll() == 8) ? llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl() : llllIIIlIlllIlIIIIIl.toString();
        }
        return "";
    }
    
    public llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl(final int n) {
        return (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.size()) ? this.llIllIIIIIllIlIIIIlI.get(n) : new lllIIIIlllllIlIIllIl();
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI.size();
    }
    
    @Override
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl() {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl;
        final Iterator<llllIIIlIlllIlIIIIIl> iterator = this.llIllIIIIIllIlIIIIlI.iterator();
        while (iterator.hasNext()) {
            ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI.add(iterator.next().IlIlIlIlIlllllllllIl());
        }
        return ilIlIIIlIIlIlIIlllIl;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (super.equals(o)) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (IlIlIIIlIIlIlIIlllIl)o;
            if (this.IlIIIlIlIIIllIlIlIIl == ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl) {
                return this.llIllIIIIIllIlIIIIlI.equals(ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI);
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.llIllIIIIIllIlIIIIlI.hashCode();
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
