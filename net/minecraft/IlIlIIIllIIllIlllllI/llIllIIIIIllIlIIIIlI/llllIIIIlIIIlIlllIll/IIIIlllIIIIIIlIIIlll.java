package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIIIlllIIIIIIlIIIlll implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private llllIIllllIlIlIIIIll IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    
    public IIIIlllIIIIIIlIIIlll() {
    }
    
    public IIIIlllIIIIIIlIIIlll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        this(llIllIIIIIllIlIIIIlI, llllIIllllIlIlIIIIll, 0);
    }
    
    public IIIIlllIIIIIIlIIIlll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final llllIIllllIlIlIIIIll ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI2) {
        this.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = (llllIIllllIlIlIIIIll)llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.class);
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
