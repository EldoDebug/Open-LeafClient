package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIIIIIIlllIlIllIl implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IlIlIIIIIIlllIlIllIl() {
    }
    
    public IlIlIIIIIIlllIlIllIl(final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        this.llllIIIIlIIIlIlllIll = ilIlIIIlIIlIlIIlllIl.IlllIIIIlIIIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIlIIlIlIIlllIl.IIlllIlIIllIlIlIlIIl * 32.0);
        this.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIlIIlIlIIlllIl.llIIIlIlIllIIlIlIlII * 32.0);
        this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(ilIlIIIlIIlIlIIlllIl.lllllIlIIIlIlIIlllII * 32.0);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readInt();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readInt();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readShort();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeInt(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeInt(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeShort(this.IlIlIIIllIllIIIIIllI);
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
}
