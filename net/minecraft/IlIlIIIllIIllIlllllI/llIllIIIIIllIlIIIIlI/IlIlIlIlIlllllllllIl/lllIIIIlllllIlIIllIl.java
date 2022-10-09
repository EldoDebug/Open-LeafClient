package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lllIIIIlllllIlIIllIl implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    
    public lllIIIIlllllIlIIllIl() {
    }
    
    public lllIIIIlllllIlIIllIl(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        this.llllIIIIlIIIlIlllIll = ilIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl = ilIlIIIIIIlllIlIllIl.lIlIlIIIllIIllIIIllI();
        this.llIllIIIIIllIlIIIIlI = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(IIllIIllIIIlIlIIIIlI.IIlllIlIIllIlIlIlIIl);
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
        this.llIllIIIIIllIlIIIIlI = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(llllllIllIllIlIllllI.readUnsignedByte());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI());
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lllIllIIIllllllIllll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
