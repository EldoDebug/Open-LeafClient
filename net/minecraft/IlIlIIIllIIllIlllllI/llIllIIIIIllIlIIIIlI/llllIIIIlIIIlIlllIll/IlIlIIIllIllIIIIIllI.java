package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIlIIIllIllIIIIIllI implements IIlIIIIIllIlIIIlIIll
{
    protected double llllIIIIlIIIlIlllIll;
    protected double IlIlIlIlIlllllllllIl;
    protected double llIllIIIIIllIlIIIIlI;
    protected float IlIIIlIlIIIllIlIlIIl;
    protected float IlIlIIIllIllIIIIIllI;
    protected boolean IllIIlllIIIIlllIIlIl;
    protected boolean llllIIIlIlllIlIIIIIl;
    protected boolean lIIIIlIIIIIlllIllIII;
    
    public IlIlIIIllIllIIIIIllI() {
    }
    
    public IlIlIIIllIllIIIIIllI(final boolean illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IllIIlllIIIIlllIIlIl = (llllllIllIllIlIllllI.readUnsignedByte() != 0);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeByte(this.IllIIlllIIIIlllIIlIl ? 1 : 0);
    }
    
    public double llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public double IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public double llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public float IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
}
