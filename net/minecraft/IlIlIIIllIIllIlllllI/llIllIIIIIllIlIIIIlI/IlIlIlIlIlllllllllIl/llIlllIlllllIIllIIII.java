package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;

public class llIlllIlllllIIllIIII implements IIlIIIIIllIlIIIlIIll
{
    private String llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    
    public llIlllIlllllIIllIIII() {
    }
    
    public llIlllIlllllIIllIIII(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + ilIlIlIlIlllllllllIl.length() + ")");
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        this.llllIIIIlIIIlIlllIll = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(32767);
        this.IlIlIlIlIlllllllllIl = llllllIllIllIlIllllI.llIllIIIIIllIlIIIIlI(40);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllllIllIllIlIllllI llllllIllIllIlIllllI) {
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
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
}
