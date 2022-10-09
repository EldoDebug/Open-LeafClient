package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lIIIlllIIIllIIIllIII implements IIlIIIIIllIlIIIlIIll
{
    private double llllIIIIlIIIlIlllIll;
    private double IlIlIlIlIlllllllllIl;
    private double llIllIIIIIllIlIIIIlI;
    private float IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private Set IllIIlllIIIIlllIIlIl;
    
    public lIIIlllIIIllIIIllIII() {
    }
    
    public lIIIlllIIIllIIIllIII(final double llllIIIIlIIIlIlllIll, final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final float ilIIIlIlIIIllIlIlIIl, final float ilIlIIIllIllIIIIIllI, final Set illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readDouble();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readDouble();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readDouble();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readFloat();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readFloat();
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllllIllIllIlIllllI.readUnsignedByte());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeDouble(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeDouble(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeDouble(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeFloat(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeFloat(this.IlIlIIIllIllIIIIIllI);
        llllllIllIllIlIllllI.writeByte(llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl));
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
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
    
    public Set IllIIlllIIIIlllIIlIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
