package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class IIllIIIlIIIIlIIlIIII implements IIlIIIIIllIlIIIlIIll
{
    private IIIllIIllIIIIIIlIIlI llllIIIIlIIIlIlllIll;
    private llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public IIllIIIlIIIIlIIlIIII() {
    }
    
    public IIllIIIlIIIIlIIlIIII(final IIIllIIllIIIIIIlIIlI iiIllIIllIIIIIIlIIlI, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this(iiIllIIllIIIIIIlIIlI, llIIIIIIlIllIIlIIIll, -1, -1, -1);
    }
    
    public IIllIIIlIIIIlIIlIIII(final int n, final int n2, final int n3) {
        this(IIIllIIllIIIIIIlIIlI.llIllIIIIIllIlIIIIlI, null, n, n2, n3);
    }
    
    public IIllIIIlIIIIlIIlIIII(final IIIllIIllIIIIIIlIIlI llllIIIIlIIIlIlllIll, final llIIIIIIlIllIIlIIIll ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = (IIIllIIllIIIIIIlIIlI)llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(IIIllIIllIIIIIIlIIlI.class);
        if (this.llllIIIIlIIIlIlllIll == IIIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll || this.llllIIIIlIIIlIlllIll == IIIllIIllIIIIIIlIIlI.IlIlIlIlIlllllllllIl) {
            this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI();
        }
        if (this.llllIIIIlIIIlIlllIll == IIIllIIllIIIIIIlIIlI.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.readInt();
            this.IlIIIlIlIIIllIlIlIIl = llllllIllIllIlIllllI.readInt();
            this.IlIlIIIllIllIIIIIllI = llllllIllIllIlIllllI.readInt();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        if (this.llllIIIIlIIIlIlllIll == IIIllIIllIIIIIIlIIlI.llllIIIIlIIIlIlllIll || this.llllIIIIlIIIlIlllIll == IIIllIIllIIIIIIlIIlI.IlIlIlIlIlllllllllIl) {
            llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        }
        if (this.llllIIIIlIIIlIlllIll == IIIllIIllIIIIIIlIIlI.llIllIIIIIllIlIIIIlI) {
            llllllIllIllIlIllllI.writeInt(this.llIllIIIIIllIlIIIIlI);
            llllllIllIllIlIllllI.writeInt(this.IlIIIlIlIIIllIlIlIIl);
            llllllIllIllIlIllllI.writeInt(this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public IIIllIIllIIIIIIlIIlI llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
