package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIlIlIlllllllllIl implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    private lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private IllIIlllIIIIlllIIlIl IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private llIllIlIlIIIIIIIllII llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    public IlIlIlIlIlllllllllIl() {
    }
    
    public IlIlIlIlIlllllllllIl(final int llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI, final boolean ilIlIlIlIlllllllllIl, final int ilIIIlIlIIIllIlIlIIl, final IllIIlllIIIIlllIIlIl ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final llIllIlIlIIIIIIIllII llllIIIlIlllIlIIIIIl, final boolean liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readInt();
        final short unsignedByte = llllllIllIllIlIllllI.readUnsignedByte();
        this.IlIlIlIlIlllllllllIl = ((unsignedByte & 0x8) == 0x8);
        this.llIllIIIIIllIlIIIIlI = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(unsignedByte & 0xFFFFFFF7);
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readByte();
        this.IlIlIIIllIllIIIIIllI = net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readUnsignedByte());
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readUnsignedByte();
        this.llllIIIlIlllIlIIIIIl = llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16));
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIlIlllIlIIIIIl = llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
        }
        this.lIIIIlIIIIIlllIllIII = llllllIllIllIlIllllI.readBoolean();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeInt(this.llllIIIIlIIIlIlllIll);
        int llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
        if (this.IlIlIlIlIlllllllllIl) {
            llllIIIIlIIIlIlllIll |= 0x8;
        }
        llllllIllIllIlIllllI.writeByte(llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeByte(this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll());
        llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll());
        llllllIllIllIlIllllI.writeBoolean(this.lIIIIlIIIIIlllIllIII);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public IllIIlllIIIIlllIIlIl IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public llIllIlIlIIIIIIIllII llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
