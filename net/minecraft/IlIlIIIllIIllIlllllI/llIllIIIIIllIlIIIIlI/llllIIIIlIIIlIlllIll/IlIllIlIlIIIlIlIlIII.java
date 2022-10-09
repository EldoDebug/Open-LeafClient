package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIllIlIlIIIlIlIlIII implements IIlIIIIIllIlIIIlIIll
{
    private float llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    
    public IlIllIlIlIIIlIlIlIII() {
    }
    
    public IlIllIlIlIIIlIlIlIII(final float llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl, final boolean llIllIIIIIllIlIIIIlI, final boolean ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readFloat();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readFloat();
        final byte byte1 = llllllIllIllIlIllllI.readByte();
        this.llIllIIIIIllIlIIIIlI = ((byte1 & 0x1) > 0);
        this.IlIIIlIlIIIllIlIlIIl = ((byte1 & 0x2) > 0);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeFloat(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeFloat(this.IlIlIlIlIlllllllllIl);
        int n = 0;
        if (this.llIllIIIIIllIlIIIIlI) {
            n = (byte)(n | 0x1);
        }
        if (this.IlIIIlIlIIIllIlIlIIl) {
            n = (byte)(n | 0x2);
        }
        llllllIllIllIlIllllI.writeByte(n);
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public float llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
