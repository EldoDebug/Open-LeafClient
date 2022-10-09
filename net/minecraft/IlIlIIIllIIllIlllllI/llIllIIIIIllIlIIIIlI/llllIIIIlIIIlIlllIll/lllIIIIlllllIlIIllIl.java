package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lllIIIIlllllIlIIllIl implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private short IlIIIlIlIIIllIlIlIIl;
    private lllIIIIlIlIllIIlIIIl IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    
    public lllIIIIlllllIlIIllIl() {
    }
    
    public lllIIIIlllllIlIIllIl(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int illIIlllIIIIlllIIlIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final short ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIllIIIIIllI = ((lllIIIIlIlIllIIlIIIl != null) ? lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl() : null);
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readByte();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readShort();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readByte();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readShort();
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readByte();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeByte(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeShort(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeShort(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
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
    
    public short IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
