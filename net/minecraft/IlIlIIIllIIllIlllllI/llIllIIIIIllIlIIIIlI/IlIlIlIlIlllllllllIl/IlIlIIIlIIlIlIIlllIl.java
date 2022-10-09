package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIIIlIIlIlIIlllIl implements IIlIIIIIllIlIIIlIIll
{
    protected int llllIIIIlIIIlIlllIll;
    protected byte IlIlIlIlIlllllllllIl;
    protected byte llIllIIIIIllIlIIIIlI;
    protected byte IlIIIlIlIIIllIlIlIIl;
    protected byte IlIlIIIllIllIIIIIllI;
    protected byte IllIIlllIIIIlllIIlIl;
    protected boolean llllIIIlIlllIlIIIIIl;
    protected boolean lIIIIlIIIIIlllIllIII;
    
    public IlIlIIIlIIlIlIIlllIl() {
    }
    
    public IlIlIIIlIIlIlIIlllIl(final int llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public String toString() {
        return "Entity_" + super.toString();
    }
    
    public llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
    }
    
    public byte llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public byte IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public byte llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public byte IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public byte IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
