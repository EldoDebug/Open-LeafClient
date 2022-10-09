package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IllIlIIllIllIIlIllII implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IllIlIIllIllIIlIllII() {
    }
    
    public IllIlIIllIllIIlIllII(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl * 32.0);
        this.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII * 32.0);
        this.IlIIIlIlIIIllIlIlIIl = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII * 32.0);
        if (llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll) {
            this.IlIlIIIllIllIIIIIllI = 1;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readByte();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readInt();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readInt();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeInt(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeInt(this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
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
