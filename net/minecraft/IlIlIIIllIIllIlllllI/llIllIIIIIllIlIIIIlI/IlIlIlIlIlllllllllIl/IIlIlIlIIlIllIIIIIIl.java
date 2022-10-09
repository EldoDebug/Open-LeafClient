package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIlIlIlIIlIllIIIIIIl implements IIlIIIIIllIlIIIlIIll
{
    private int[] llllIIIIlIIIlIlllIll;
    private int[] IlIlIlIlIlllllllllIl;
    private IIIIIllIIIIlIIIIllIl[] llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    public IIlIlIlIIlIllIIIIIIl() {
    }
    
    public IIlIlIlIIlIllIIIIIIl(final List list) {
        final int size = list.size();
        this.llllIIIIlIIIlIlllIll = new int[size];
        this.IlIlIlIlIlllllllllIl = new int[size];
        this.llIllIIIIIllIlIIIIlI = new IIIIIllIIIIlIIIIllIl[size];
        this.IlIIIlIlIIIllIlIlIIl = !list.get(0).IlIllIlIlIIIlIlIlIII().IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll();
        for (int i = 0; i < size; ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = list.get(i);
            final IIIIIllIIIIlIIIIllIl llllIIIIlIIIlIlllIll2 = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, true, this.IlIIIlIlIIIllIlIlIIl, 65535);
            this.llllIIIIlIIIlIlllIll[i] = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
            this.IlIlIlIlIlllllllllIl[i] = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;
            this.llIllIIIIIllIlIIIIlI[i] = llllIIIIlIIIlIlllIll2;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readBoolean();
        final int ilIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.llllIIIIlIIIlIlllIll = new int[ilIIIlIlIIIllIlIlIIl];
        this.IlIlIlIlIlllllllllIl = new int[ilIIIlIlIIIllIlIlIIl];
        this.llIllIIIIIllIlIIIIlI = new IIIIIllIIIIlIIIIllIl[ilIIIlIlIIIllIlIlIIl];
        for (int i = 0; i < ilIIIlIlIIIllIlIlIIl; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = llllllIllIllIlIllllI.readInt();
            this.IlIlIlIlIlllllllllIl[i] = llllllIllIllIlIllllI.readInt();
            this.llIllIIIIIllIlIIIIlI[i] = new IIIIIllIIIIlIIIIllIl();
            this.llIllIIIIIllIlIIIIlI[i].IlIlIlIlIlllllllllIl = (llllllIllIllIlIllllI.readShort() & 0xFFFF);
            this.llIllIIIIIllIlIIIIlI[i].llllIIIIlIIIlIlllIll = new byte[IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(Integer.bitCount(this.llIllIIIIIllIlIIIIlI[i].IlIlIlIlIlllllllllIl), this.IlIIIlIlIIIllIlIlIIl, true)];
        }
        for (int j = 0; j < ilIIIlIlIIIllIlIlIIl; ++j) {
            llllllIllIllIlIllllI.readBytes(this.llIllIIIIIllIlIIIIlI[j].llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeBoolean(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI.length);
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            llllllIllIllIlIllllI.writeInt(this.llllIIIIlIIIlIlllIll[i]);
            llllllIllIllIlIllllI.writeInt(this.IlIlIlIlIlllllllllIl[i]);
            llllllIllIllIlIllllI.writeShort((short)(this.llIllIIIIIllIlIIIIlI[i].IlIlIlIlIlllllllllIl & 0xFFFF));
        }
        for (int j = 0; j < this.llllIIIIlIIIlIlllIll.length; ++j) {
            llllllIllIllIlIllllI.writeBytes(this.llIllIIIIIllIlIIIIlI[j].llllIIIIlIIIlIlllIll);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll[n];
    }
    
    public int IlIlIlIlIlllllllllIl(final int n) {
        return this.IlIlIlIlIlllllllllIl[n];
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.length;
    }
    
    public byte[] llIllIIIIIllIlIIIIlI(final int n) {
        return this.llIllIIIIIllIlIIIIlI[n].llllIIIIlIIIlIlllIll;
    }
    
    public int IlIIIlIlIIIllIlIlIIl(final int n) {
        return this.llIllIIIIIllIlIIIIlI[n].IlIlIlIlIlllllllllIl;
    }
}
