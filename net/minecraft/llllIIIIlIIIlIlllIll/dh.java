package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum dh implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("TOP", 0, "top"), 
    IlIlIlIlIlllllllllIl("BOTTOM", 1, "bottom");
    
    private final String llIllIIIIIllIlIIIIlI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new dh[] { dh.llllIIIIlIIIlIlllIll, dh.IlIlIlIlIlllllllllIl };
    }
    
    private dh(final String s, final int n, final String llIllIIIIIllIlIIIIlI) {
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
