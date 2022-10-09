package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIllllIIIlIIIIIIllIl
{
    private final short IlIlIlIlIlllllllllIl;
    private final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    final /* synthetic */ IIIIIIIIIlllIllIlIlI llllIIIIlIIIlIlllIll;
    
    public IIllllIIIlIIIIIIllIl(final IIIIIIIIIlllIllIlIlI llllIIIIlIIIlIlllIll, final short ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public IIllllIIIlIIIIIIllIl(final IIIIIIIIIlllIllIlIlI llllIIIIlIIIlIlllIll, final short ilIlIlIlIlllllllllIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll());
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return new IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl >> 12 & 0xF, this.IlIlIlIlIlllllllllIl & 0xFF, this.IlIlIlIlIlllllllllIl >> 8 & 0xF));
    }
    
    public short IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
