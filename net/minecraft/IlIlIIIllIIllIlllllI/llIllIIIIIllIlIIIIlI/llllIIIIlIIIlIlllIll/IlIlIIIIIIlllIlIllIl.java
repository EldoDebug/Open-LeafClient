package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIIIIIIlllIlIllIl implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private short IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    
    public IlIlIIIIIIlllIlIllIl() {
    }
    
    public IlIlIIIIIIlllIlIllIl(final int llllIIIIlIIIlIlllIll, final short ilIlIlIlIlllllllllIl, final boolean llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readByte();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readShort();
        this.llIllIIIIIllIlIIIIlI = (llllllIllIllIlIllllI.readByte() != 0);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeByte(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeShort(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI ? 1 : 0);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public short IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
