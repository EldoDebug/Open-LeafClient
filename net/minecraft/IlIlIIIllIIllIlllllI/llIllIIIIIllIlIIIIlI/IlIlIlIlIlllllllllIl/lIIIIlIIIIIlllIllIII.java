package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lIIIIlIIIIIlllIllIII implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl;
    private lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    private llIllIlIlIIIIIIIllII IlIIIlIlIIIllIlIlIIl;
    
    public lIIIIlIIIIIlllIllIII() {
    }
    
    public lIIIIlIIIIIlllIllIII(final int llllIIIIlIIIlIlllIll, final IllIIlllIIIIlllIIlIl ilIlIlIlIlllllllllIl, final llIllIlIlIIIIIIIllII ilIIIlIlIIIllIlIlIIl, final lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readInt();
        this.IlIlIlIlIlllllllllIl = IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readUnsignedByte());
        this.llIllIIIIIllIlIIIIlI = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readUnsignedByte());
        this.IlIIIlIlIIIllIlIlIIl = llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16));
        if (this.IlIIIlIlIIIllIlIlIIl == null) {
            this.IlIIIlIlIIIllIlIlIIl = llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl;
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeInt(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll());
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public llIllIlIlIIIIIIIllII IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
