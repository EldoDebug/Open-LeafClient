package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lllllIIIIIlIlIIIIIIl implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private byte IlIlIlIlIlllllllllIl;
    private g[] llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private byte[] lIIIIlIIIIIlllIllIII;
    
    public lllllIIIIIlIlIIIIIIl() {
    }
    
    public lllllIIIIIlIlIIIIIIl(final int llllIIIIlIIIlIlllIll, final byte ilIlIlIlIlllllllllIl, final Collection collection, final byte[] array, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = collection.toArray(new g[collection.size()]);
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = new byte[illIIlllIIIIlllIIlIl * llllIIIlIlllIlIIIIIl];
        for (int i = 0; i < illIIlllIIIIlllIIlIl; ++i) {
            for (int j = 0; j < llllIIIlIlllIlIIIIIl; ++j) {
                this.lIIIIlIIIIIlllIllIII[i + j * illIIlllIIIIlllIIlIl] = array[ilIIIlIlIIIllIlIlIIl + i + (ilIlIIIllIllIIIIIllI + j) * 128];
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readByte();
        this.llIllIIIIIllIlIIIIlI = new g[llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl()];
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.length; ++i) {
            final short n = llllllIllIllIlIllllI.readByte();
            this.llIllIIIIIllIlIIIIlI[i] = new g((byte)(n >> 4 & 0xF), llllllIllIllIlIllllI.readByte(), llllllIllIllIlIllllI.readByte(), (byte)(n & 0xF));
        }
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readUnsignedByte();
        if (this.IllIIlllIIIIlllIIlIl > 0) {
            this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readUnsignedByte();
            this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readUnsignedByte();
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readUnsignedByte();
            this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.length);
        g[] llIllIIIIIllIlIIIIlI;
        for (int length = (llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI).length, i = 0; i < length; ++i) {
            final g g = llIllIIIIIllIlIIIIlI[i];
            llllllIllIllIlIllllI.writeByte((g.llllIIIIlIIIlIlllIll() & 0xF) << 4 | (g.IlIIIlIlIIIllIlIlIIl() & 0xF));
            llllllIllIllIlIllllI.writeByte(g.IlIlIlIlIlllllllllIl());
            llllllIllIllIlIllllI.writeByte(g.llIllIIIIIllIlIIIIlI());
        }
        llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl);
        if (this.IllIIlllIIIIlllIIlIl > 0) {
            llllllIllIllIlIllllI.writeByte(this.llllIIIlIlllIlIIIIIl);
            llllllIllIllIlIllllI.writeByte(this.IlIIIlIlIIIllIlIlIIl);
            llllllIllIllIlIllllI.writeByte(this.IlIlIIIllIllIIIIIllI);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl;
        illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.clear();
        for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.length; ++i) {
            illIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII.put("icon-" + i, this.llIllIIIIIllIlIIIIlI[i]);
        }
        for (int j = 0; j < this.IllIIlllIIIIlllIIlIl; ++j) {
            for (int k = 0; k < this.llllIIIlIlllIlIIIIIl; ++k) {
                illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl[this.IlIIIlIlIIIllIlIlIIl + j + (this.IlIlIIIllIllIIIIIllI + k) * 128] = this.lIIIIlIIIIIlllIllIII[j + k * this.IllIIlllIIIIlllIIlIl];
            }
        }
    }
}
