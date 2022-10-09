package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIllIlIlIIIlIlIlIII implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    private int llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    
    public IlIllIlIlIIIlIlIlIII() {
    }
    
    public IlIllIlIlIIIlIlIlIII(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        this(llIllIIIIIllIlIIIIlI, n, 0);
    }
    
    public IlIllIlIlIIIlIlIlIII(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int llIIlIIIlIIIllIlIIIl, final int llIllIlIIIIllIlIIllI) {
        this.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl * 32.0);
        this.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII * 32.0);
        this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII * 32.0);
        this.lIIIIlIIIIIlllIllIII = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI * 256.0f / 360.0f);
        this.lIIIlllIIIllIIIllIII = llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI.IIlIIIIIllIlIIIlIIll * 256.0f / 360.0f);
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        if (llIllIlIIIIllIlIIllI > 0) {
            double lIllllllIIllIlIlIlII = llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII;
            double llIIlllIIlllIIllIllI = llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI;
            double iIlllIIIlIlllIIlllII = llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII;
            final double n = 3.9;
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
            this.IlIlIIIllIllIIIIIllI = (int)(lIllllllIIllIlIlIlII * 8000.0);
            this.IllIIlllIIIIlllIIlIl = (int)(llIIlllIIlllIIllIllI * 8000.0);
            this.llllIIIlIlllIlIIIIIl = (int)(iIlllIIIlIlllIIlllII * 8000.0);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.llIIlIIIlIIIllIlIIIl = llllllIllIllIlIllllI.readByte();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readInt();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readInt();
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.readByte();
        this.lIIIlllIIIllIIIllIII = llllllIllIllIlIllllI.readByte();
        this.llIllIlIIIIllIlIIllI = llllllIllIllIlIllllI.readInt();
        if (this.llIllIlIIIIllIlIIllI > 0) {
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readShort();
            this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readShort();
            this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readShort();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.llIIlIIIlIIIllIlIIIl);
        llllllIllIllIlIllllI.writeInt(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeInt(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeByte(this.lIIIIlIIIIIlllIllIII);
        llllllIllIllIlIllllI.writeByte(this.lIIIlllIIIllIIIllIII);
        llllllIllIllIlIllllI.writeInt(this.llIllIlIIIIllIlIIllI);
        if (this.llIllIlIIIIllIlIIllI > 0) {
            llllllIllIllIlIllllI.writeShort(this.IlIlIIIllIllIIIIIllI);
            llllllIllIllIlIllllI.writeShort(this.IllIIlllIIIIlllIIlIl);
            llllllIllIllIlIllllI.writeShort(this.llllIIIlIlllIlIIIIIl);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public int llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int lIIIIlIIIIIlllIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int llIIlIIIlIIIllIlIIIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public int llIllIlIIIIllIlIIllI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final int ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void IlIlIIIllIllIIIIIllI(final int illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void IllIIlllIIIIlllIIlIl(final int llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public void llllIIIlIlllIlIIIIIl(final int llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
}
