package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIIIIIIlIllIIlIIIll implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private lllIIIIlIlIllIIlIIIl[] IlIlIlIlIlllllllllIl;
    
    public llIIIIIIlIllIIlIIIll() {
    }
    
    public llIIIIIIlIllIIlIIIll(final int llllIIIIlIIIlIlllIll, final List list) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = new lllIIIIlIlIllIIlIIIl[list.size()];
        for (int i = 0; i < this.IlIlIlIlIlllllllllIl.length; ++i) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = list.get(i);
            this.IlIlIlIlIlllllllllIl[i] = ((lllIIIIlIlIllIIlIIIl == null) ? null : lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl());
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readUnsignedByte();
        final short short1 = llllllIllIllIlIllllI.readShort();
        this.IlIlIlIlIlllllllllIl = new lllIIIIlIlIllIIlIIIl[short1];
        for (short n = 0; n < short1; ++n) {
            this.IlIlIlIlIlllllllllIl[n] = llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeByte(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeShort(this.IlIlIlIlIlllllllllIl.length);
        lllIIIIlIlIllIIlIIIl[] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl[i]);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lllIIIIlIlIllIIlIIIl[] IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
