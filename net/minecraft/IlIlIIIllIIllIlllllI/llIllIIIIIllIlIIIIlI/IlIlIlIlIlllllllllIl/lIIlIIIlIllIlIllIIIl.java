package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class lIIlIIIlIllIlIllIIIl implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public lIIlIIIlIllIlIllIIIl() {
    }
    
    public lIIlIIIlIllIlIllIIIl(final int n, final String s, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this(n, s, llIIIIIIlIllIIlIIIll, 0);
    }
    
    public lIIlIIIlIllIlIllIIIl(final int llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl, final llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public lIIlIIIlIllIlIllIIIl(final int n, final String s, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final int n2, final int ilIlIIIllIllIIIIIllI) {
        this(n, s, llIIIIIIlIllIIlIIIll, n2);
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.readUnsignedByte();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32);
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readUnsignedByte();
        if (this.IlIlIlIlIlllllllllIl.equals("EntityHorse")) {
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readInt();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.writeByte(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeByte(this.IlIIIlIlIIIllIlIlIIl);
        if (this.IlIlIlIlIlllllllllIl.equals("EntityHorse")) {
            llllllIllIllIlIllllI.writeInt(this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIIIIIIlIllIIlIIIll llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl > 0;
    }
}
