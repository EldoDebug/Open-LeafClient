package net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllIIIIlIIIlIlllIll implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl;
    
    public llllIIIIlIIIlIlllIll() {
    }
    
    public llllIIIIlIIIlIlllIll(final int llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(255);
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readUnsignedShort();
        this.IlIIIlIlIIIllIlIlIIl = net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeShort(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll());
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public net.minecraft.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
