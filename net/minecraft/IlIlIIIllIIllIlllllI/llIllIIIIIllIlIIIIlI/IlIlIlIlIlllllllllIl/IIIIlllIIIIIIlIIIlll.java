package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIIIlllIIIIIIlIIIlll implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private UUID IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private byte IllIIlllIIIIlllIIlIl;
    private byte llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private llllIIIIlIIIlIlllIll lIIIlllIIIllIIIllIII;
    private List llIIlIIIlIIIllIlIIIl;
    
    public IIIIlllIIIIIIlIIIlll() {
    }
    
    public IIIIlllIIIIIIlIIIlll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.r().getId();
        this.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl * 32.0);
        this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII * 32.0);
        this.IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII * 32.0);
        this.IllIIlllIIIIlllIIlIl = (byte)(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll * 256.0f / 360.0f);
        this.llllIIIlIlllIlIIIIIl = (byte)(llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI * 256.0f / 360.0f);
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        this.lIIIIlIIIIIlllIllIII = ((ilIIIlIlIIIllIlIlIIl == null) ? 0 : net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()));
        this.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.IllIIlllIIIIlllIIlIl();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readInt();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readInt();
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readByte();
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readByte();
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.readShort();
        this.llIIlIIIlIIIllIlIIIl = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeInt(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeInt(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl);
        llllllIllIllIlIllllI.writeByte(this.llllIIIlIlllIlIIIIIl);
        llllllIllIllIlIllllI.writeShort(this.lIIIIlIIIIIlllIllIII);
        this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public List llllIIIIlIIIlIlllIll() {
        if (this.llIIlIIIlIIIllIlIIIl == null) {
            this.llIIlIIIlIIIllIlIIIl = this.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI();
        }
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public UUID llIllIIIIIllIlIIIIlI() {
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
    
    public byte llllIIIlIlllIlIIIIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public byte lIIIIlIIIIIlllIllIII() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int lIIIlllIIIllIIIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
