package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIllIlIIIIllIlIIllI implements IIlIIIIIllIlIIIlIIll
{
    private static final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl;
    private float IlIlIIIllIllIIIIIllI;
    private float IllIIlllIIIIlllIIlIl;
    private float llllIIIlIlllIlIIIIIl;
    
    static {
        llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(-1, -1, -1);
    }
    
    public llIllIlIIIIllIlIIllI() {
    }
    
    public llIllIlIIIIllIlIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this(llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll, 255, lllIIIIlIlIllIIlIIIl, 0.0f, 0.0f, 0.0f);
    }
    
    public llIllIlIIIIllIlIIllI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final float ilIlIIIllIllIIIIIllI, final float illIIlllIIIIlllIIlIl, final float llllIIIlIlllIlIIIIIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ((lllIIIIlIlIllIIlIIIl != null) ? lllIIIIlIlIllIIlIIIl.llIIlIIIlIIIllIlIIIl() : null);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readUnsignedByte();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.lIIIIlIIIIIlllIllIII();
        this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readUnsignedByte() / 16.0f;
        this.IllIIlllIIIIlllIIlIl = llllllIllIllIlIllllI.readUnsignedByte() / 16.0f;
        this.llllIIIlIlllIlIIIIIl = llllllIllIllIlIllllI.readUnsignedByte() / 16.0f;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeByte(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.writeByte((int)(this.IlIlIIIllIllIIIIIllI * 16.0f));
        llllllIllIllIlIllllI.writeByte((int)(this.IllIIlllIIIIlllIIlIl * 16.0f));
        llllllIllIllIlIllllI.writeByte((int)(this.llllIIIlIlllIlIIIIIl * 16.0f));
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this);
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public float IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
