package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lllllIIllIlIllIllllI implements IIlIIIIIllIlIIIlIIll
{
    private IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public lllllIIllIlIllIllllI() {
    }
    
    public lllllIIllIlIllIllllI(final IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readUnsignedByte());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeByte(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
