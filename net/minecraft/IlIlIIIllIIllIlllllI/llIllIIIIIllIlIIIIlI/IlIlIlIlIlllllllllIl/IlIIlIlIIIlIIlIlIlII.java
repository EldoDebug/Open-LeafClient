package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IlIIlIlIIIlIIlIlIlII implements IIlIIIIIllIlIIIlIIll
{
    public static final String[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = new String[] { "tile.bed.notValid" };
    }
    
    public IlIIlIlIIIlIIlIlIlII() {
    }
    
    public IlIIlIlIIIlIIlIlIlII(final int ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readUnsignedByte();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readFloat();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeByte(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeFloat(this.llIllIIIIIllIlIIIIlI);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
