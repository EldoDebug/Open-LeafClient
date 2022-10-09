package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIllIIllIIIlIlIIIIlI implements IIlIIIIIllIlIIIlIIll
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public IIllIIllIIIlIlIIIIlI() {
    }
    
    public IIllIIllIIIlIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl(), llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII, llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI, llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII);
    }
    
    public IIllIIllIIIlIlIIIIlI(final int llllIIIIlIIIlIlllIll, double n, double n2, double n3) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        final double n4 = 3.9;
        if (n < -n4) {
            n = -n4;
        }
        if (n2 < -n4) {
            n2 = -n4;
        }
        if (n3 < -n4) {
            n3 = -n4;
        }
        if (n > n4) {
            n = n4;
        }
        if (n2 > n4) {
            n2 = n4;
        }
        if (n3 > n4) {
            n3 = n4;
        }
        this.IlIlIlIlIlllllllllIl = (int)(n * 8000.0);
        this.llIllIIIIIllIlIIIIlI = (int)(n2 * 8000.0);
        this.IlIIIlIlIIIllIlIlIIl = (int)(n3 * 8000.0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.readShort();
        this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readShort();
        this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readShort();
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.writeShort(this.IlIlIlIlIlllllllllIl);
        llllllIllIllIlIllllI.writeShort(this.llIllIIIIIllIlIIIIlI);
        llllllIllIllIlIllllI.writeShort(this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
