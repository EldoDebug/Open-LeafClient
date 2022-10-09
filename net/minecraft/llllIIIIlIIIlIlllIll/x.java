package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum x implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DEFAULT", 0, "normal"), 
    IlIlIlIlIlllllllllIl("STICKY", 1, "sticky");
    
    private final String llIllIIIIIllIlIIIIlI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new x[] { x.llllIIIIlIIIlIlllIll, x.IlIlIlIlIlllllllllIl };
    }
    
    private x(final String s, final int n, final String llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public String toString() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
