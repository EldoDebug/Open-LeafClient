package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lIIIlllIIIllIIIllIII implements IIlIIIIIllIlIIIlIIll
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    private llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    
    public lIIIlllIIIllIIIllIII() {
    }
    
    public lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI, final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llIllIIIIIllIlIIIIlI = (llIIlIIIlIIIllIlIIIl)llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.class);
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl = lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readUnsignedByte());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
