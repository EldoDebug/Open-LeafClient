package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llllIllllIllllIlIlII implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private IIlIlIllllIlllIIIIll IlIIIlIlIIIllIlIlIIl;
    
    public llllIllllIllllIlIlII() {
        this.llllIIIIlIIIlIlllIll = "";
        this.IlIlIlIlIlllllllllIl = "";
    }
    
    public llllIllllIllllIlIlII(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = "";
        this.IlIlIlIlIlllllllllIl = "";
        this.llllIIIIlIIIlIlllIll = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl();
        this.IlIlIlIlIlllllllllIl = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl();
        this.llIllIIIIIllIlIIIIlI = ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
        this.IlIIIlIlIIIllIlIlIIl = IIlIlIllllIlllIIIIll.llllIIIIlIIIlIlllIll;
    }
    
    public llllIllllIllllIlIlII(final String llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = "";
        this.IlIlIlIlIlllllllllIl = "";
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = "";
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl;
    }
    
    public llllIllllIllllIlIlII(final String llllIIIIlIIIlIlllIll, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = "";
        this.IlIlIlIlIlllllllllIl = "";
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl();
        this.llIllIIIIIllIlIIIIlI = 0;
        this.IlIIIlIlIIIllIlIlIIl = IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(40);
        this.IlIIIlIlIIIllIlIlIIl = (IIlIlIllllIlllIIIIll)llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(IIlIlIllllIlllIIIIll.class);
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(16);
        if (this.IlIIIlIlIIIllIlIlIIl != IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl) {
            this.llIllIIIIIllIlIIIIlI = llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        if (this.IlIIIlIlIIIllIlIlIIl != IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl) {
            llllllIllIllIlIllllI.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public IIlIlIllllIlllIIIIll IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
