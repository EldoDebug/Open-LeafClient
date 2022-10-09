package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIllIIllIIIlIlIIIIlI implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl;
    
    public IIllIIllIIIlIlIIIIlI() {
    }
    
    public IIllIIllIIIlIlIIIIlI(final int llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ((lllIIIIlIlIllIIlIIIl != null) ? lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl() : null);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readShort();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeShort(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
