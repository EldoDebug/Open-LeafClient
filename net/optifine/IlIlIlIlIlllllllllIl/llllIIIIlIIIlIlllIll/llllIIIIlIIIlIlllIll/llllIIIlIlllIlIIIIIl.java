package net.optifine.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.optifine.expr.*;

public class llllIIIlIlllIlIIIIIl
{
    private String llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private IlIlIIIllIllIIIIIllI llIllIIIIIllIlIIIIlI;
    private IlIlIIIllIIllIlllllI IlIIIlIlIIIllIlIlIIl;
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        if (this.llIllIIIIIllIlIIIIlI == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Model variable not found: " + this.llllIIIIlIIIlIlllIll);
            return false;
        }
        try {
            this.IlIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            return true;
        }
        catch (IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error parsing expression: " + this.IlIlIlIlIlllllllllIl);
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(String.valueOf(ilIlIIIIIIlllIlIllIl.getClass().getName()) + ": " + ilIlIIIIIIlllIlIllIl.getMessage());
            return false;
        }
    }
    
    public llllIIIlIlllIlIIIIIl(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl());
    }
}
