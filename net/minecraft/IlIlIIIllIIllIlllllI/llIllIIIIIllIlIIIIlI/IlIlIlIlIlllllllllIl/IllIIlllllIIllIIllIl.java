package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IllIIlllllIIllIIllIl implements IIlIIIIIllIlIIIlIIll
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI;
    
    public IllIIlllllIIllIIllIl() {
    }
    
    public IllIIlllllIIllIIllIl(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readUnsignedByte();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llllIIIlIlllIlIIIIIl();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeByte((byte)this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
