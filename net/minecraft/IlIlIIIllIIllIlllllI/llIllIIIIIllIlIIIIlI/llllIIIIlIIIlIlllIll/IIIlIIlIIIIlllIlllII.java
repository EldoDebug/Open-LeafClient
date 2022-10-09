package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIIlIIlIIIIlllIlllII implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IIIlIIlIIIIlllIlllII() {
    }
    
    public IIIlIIlIIIIlllIlllII(final String llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI, final boolean ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(7);
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readByte();
        this.llIllIIIIIllIlIIIIlI = net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readByte());
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readBoolean();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readUnsignedByte();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        llllllIllIllIlIllllI.writeBoolean(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeByte(this.IlIlIIIllIllIIIIIllI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
