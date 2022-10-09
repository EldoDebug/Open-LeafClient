package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIIlllIIlllIIllIllI implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private byte IlIlIlIlIlllllllllIl;
    private byte llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private byte IlIlIIIllIllIIIIIllI;
    
    public llIIlllIIlllIIllIllI() {
    }
    
    public llIIlllIIlllIIllIllI(final int llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = (byte)(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() & 0xFF);
        this.llIllIIIIIllIlIIIIlI = (byte)(ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() & 0xFF);
        if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() > 32767) {
            this.IlIIIlIlIIIllIlIlIIl = 32767;
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
        }
        this.IlIlIIIllIllIIIIIllI = (byte)(ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI() ? 1 : 0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readByte();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readByte();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readByte();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeByte(this.IlIlIIIllIllIIIIIllI);
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl == 32767;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public byte llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public byte IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIlIIIllIllIIIIIllI != 0;
    }
}
