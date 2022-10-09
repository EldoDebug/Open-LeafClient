package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class IlIIIlIIIllllIlIlIlI implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private IIIIIllIIIIlIIIIllIl llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    public IlIIIlIIIllllIlIlIlI() {
    }
    
    public IlIIIlIIIllllIlIlIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean ilIIIlIlIIIllIlIlIIl, final int n) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl, !llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII().IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll(), n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readInt();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readInt();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readBoolean();
        this.llIllIIIIIllIlIIIIlI = new IIIIIllIIIIlIIIIllIl();
        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readShort();
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeInt(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeInt(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeBoolean(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeShort((short)(this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl & 0xFFFF));
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public byte[] llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
    
    protected static int llllIIIIlIIIlIlllIll(final int n, final boolean b, final boolean b2) {
        return n * 2 * 16 * 16 * 16 + n * 16 * 16 * 16 / 2 + (b ? (n * 16 * 16 * 16 / 2) : 0) + (b2 ? 256 : 0);
    }
    
    public static IIIIIllIIIIlIIIIllIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b, final boolean b2, final int n) {
        final llllIIIlIlllIlIIIIIl[] ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = new IIIIIllIIIIlIIIIllIl();
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < ilIlIlIlIlllllllllIl.length; ++i) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = ilIlIlIlIlllllllllIl[i];
            if (llllIIIlIlllIlIIIIIl != null && (!b || !llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll()) && (n & 1 << i) != 0x0) {
                final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl2 = iiiiIllIIIIlIIIIllIl;
                iiiiIllIIIIlIIIIllIl2.IlIlIlIlIlllllllllIl |= 1 << i;
                arrayList.add(llllIIIlIlllIlIIIIIl);
            }
        }
        iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll = new byte[llllIIIIlIIIlIlllIll(Integer.bitCount(iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl), b2, b)];
        int n2 = 0;
        final Iterator<llllIIIlIlllIlIIIIIl> iterator = (Iterator<llllIIIlIlllIlIIIIIl>)arrayList.iterator();
        while (iterator.hasNext()) {
            char[] ilIlIIIllIllIIIIIllI;
            for (int length = (ilIlIIIllIllIIIIIllI = iterator.next().IlIlIIIllIllIIIIIllI()).length, j = 0; j < length; ++j) {
                final char c = ilIlIIIllIllIIIIIllI[j];
                iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll[n2++] = (byte)(c & '\u00ff');
                iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll[n2++] = (byte)(c >> 8 & 0xFF);
            }
        }
        final Iterator<llllIIIlIlllIlIIIIIl> iterator2 = (Iterator<llllIIIlIlllIlIIIIIl>)arrayList.iterator();
        while (iterator2.hasNext()) {
            n2 = llllIIIIlIIIlIlllIll(iterator2.next().IllIIlllIIIIlllIIlIl().llllIIIIlIIIlIlllIll(), iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll, n2);
        }
        if (b2) {
            final Iterator<llllIIIlIlllIlIIIIIl> iterator3 = (Iterator<llllIIIlIlllIlIIIIIl>)arrayList.iterator();
            while (iterator3.hasNext()) {
                n2 = llllIIIIlIIIlIlllIll(iterator3.next().llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(), iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll, n2);
            }
        }
        if (b) {
            llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI(), iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll, n2);
        }
        return iiiiIllIIIIlIIIIllIl;
    }
    
    private static int llllIIIIlIIIlIlllIll(final byte[] array, final byte[] array2, final int n) {
        System.arraycopy(array, 0, array2, n, array.length);
        return n + array.length;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
