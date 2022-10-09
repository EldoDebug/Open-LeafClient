package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIlllllIllIllIlIlIII implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public IIlllllIllIllIlIlIII() {
    }
    
    public IIlllllIllIllIlIlIII(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.IlIIIlIlIIIllIlIlIIl();
        this.llIllIIIIIllIlIIIIlI = liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI();
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16);
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readByte();
        if (this.IlIIIlIlIIIllIlIlIIl == 0 || this.IlIIIlIlIIIllIlIlIIl == 2) {
            this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32);
            this.llIllIIIIIllIlIIIIlI = net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16));
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIIIlIlIIIllIlIlIIl);
        if (this.IlIIIlIlIIIllIlIlIIl == 0 || this.IlIIIlIlIIIllIlIlIIl == 2) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public llIllIIIIIllIlIIIIlI IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
