package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import net.optifine.expr.*;
import net.optifine.shaders.*;

public class llllIIIIlIIIlIlllIll
{
    private String llllIIIIlIIIlIlllIll;
    private lllIIIIlllllIlIIllIl IlIlIlIlIlllllllllIl;
    private llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    private IIIIlllIIIIIIlIIIlll IlIIIlIlIIIllIlIlIIl;
    
    public llllIIIIlIIIlIlllIll(final String llllIIIIlIIIlIlllIll, final lllIIIIlllllIlIIllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(n);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        if (this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl()) {
            try {
                this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl);
            }
            catch (RuntimeException ex) {
                IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Error updating custom uniform: " + this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI());
                IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll(String.valueOf(ex.getClass().getName()) + ": " + ex.getMessage());
                this.IlIIIlIlIIIllIlIlIIl.llllIIIlIlllIlIIIIIl();
                IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Custom uniform disabled: " + this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI());
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.IlIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII();
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public lllIIIIlllllIlIIllIl IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public IIIIlllIIIIIIlIIIlll IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.IlIlIlIlIlllllllllIl.name().toLowerCase()) + " " + this.llllIIIIlIIIlIlllIll;
    }
}
