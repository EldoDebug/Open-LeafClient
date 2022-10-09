package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;

public class llllIIIlIlllIlIIIIIl implements IIlIIIIIllIlIIIlIIll
{
    private float llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    
    public llllIIIlIlllIlIIIIIl() {
    }
    
    public llllIIIlIlllIlIIIIIl(final float llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readFloat();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readFloat();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeFloat(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeFloat(this.llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public float llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
