package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIlllIIlIllIllIlIIll implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private byte lIIIlllIIIllIIIllIII;
    private byte llIIlIIIlIIIllIlIIIl;
    private byte llIllIlIIIIllIlIIllI;
    private llllIIIIlIIIlIlllIll lIlIlIIIllIIllIIIllI;
    private List IlIlIIIllIIllIlllllI;
    
    public IIlllIIlIllIllIlIIll() {
    }
    
    public IIlllIIlIllIllIlIIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        this.llllIIIIlIIIlIlllIll = lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl = (byte)IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl);
        this.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl * 32.0);
        this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII * 32.0);
        this.IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII * 32.0);
        this.lIIIlllIIIllIIIllIII = (byte)(lllIIIIlllllIlIIllIl.IIlIIIIIllIlIIIlIIll * 256.0f / 360.0f);
        this.llIIlIIIlIIIllIlIIIl = (byte)(lllIIIIlllllIlIIllIl.llllllIllIllIlIllllI * 256.0f / 360.0f);
        this.llIllIlIIIIllIlIIllI = (byte)(lllIIIIlllllIlIIllIl.lIIlllIlllllIIlllIll * 256.0f / 360.0f);
        final double n = 3.9;
        double lIllllllIIllIlIlIlII = lllIIIIlllllIlIIllIl.lIllllllIIllIlIlIlII;
        double llIIlllIIlllIIllIllI = lllIIIIlllllIlIIllIl.llIIlllIIlllIIllIllI;
        double iIlllIIIlIlllIIlllII = lllIIIIlllllIlIIllIl.IIlllIIIlIlllIIlllII;
        if (lIllllllIIllIlIlIlII < -n) {
            lIllllllIIllIlIlIlII = -n;
        }
        if (llIIlllIIlllIIllIllI < -n) {
            llIIlllIIlllIIllIllI = -n;
        }
        if (iIlllIIIlIlllIIlllII < -n) {
            iIlllIIIlIlllIIlllII = -n;
        }
        if (lIllllllIIllIlIlIlII > n) {
            lIllllllIIllIlIlIlII = n;
        }
        if (llIIlllIIlllIIllIllI > n) {
            llIIlllIIlllIIllIllI = n;
        }
        if (iIlllIIIlIlllIIlllII > n) {
            iIlllIIIlIlllIIlllII = n;
        }
        this.IllIIlllIIIIlllIIlIl = (int)(lIllllllIIllIlIlIlII * 8000.0);
        this.llllIIIlIlllIlIIIIIl = (int)(llIIlllIIlllIIllIllI * 8000.0);
        this.lIIIIlIIIIIlllIllIII = (int)(iIlllIIIlIlllIIlllII * 8000.0);
        this.lIlIlIIIllIIllIIIllI = lllIIIIlllllIlIIllIl.llIllIlIlIIIIIIIllII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = (llllllIllIllIlIllllI.readByte() & 0xFF);
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readInt();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readInt();
        this.lIIIlllIIIllIIIllIII = llllllIllIllIlIllllI.readByte();
        this.llIIlIIIlIIIllIlIIIl = llllllIllIllIlIllllI.readByte();
        this.llIllIlIIIIllIlIIllI = llllllIllIllIlIllllI.readByte();
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readShort();
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readShort();
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.readShort();
        this.IlIlIIIllIIllIlllllI = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl & 0xFF);
        llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeInt(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeInt(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeByte(this.lIIIlllIIIllIIIllIII);
        llllllIllIllIlIllllI.writeByte(this.llIIlIIIlIIIllIlIIIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIlIIIIllIlIIllI);
        llllllIllIllIlIllllI.writeShort(this.IllIIlllIIIIlllIIlIl);
        llllllIllIllIlIllllI.writeShort(this.llllIIIlIlllIlIIIIIl);
        llllllIllIllIlIllllI.writeShort(this.lIIIIlIIIIIlllIllIII);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public List llllIIIIlIIIlIlllIll() {
        if (this.IlIlIIIllIIllIlllllI == null) {
            this.IlIlIIIllIIllIlllllI = this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI();
        }
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public byte llIIlIIIlIIIllIlIIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public byte llIllIlIIIIllIlIIllI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public byte lIlIlIIIllIIllIIIllI() {
        return this.llIllIlIIIIllIlIIllI;
    }
}
