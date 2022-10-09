package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

enum bi implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("UP", 0, "up"), 
    IlIlIlIlIlllllllllIl("SIDE", 1, "side"), 
    llIllIIIIIllIlIIIIlI("NONE", 2, "none");
    
    private final String IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new bi[] { bi.llllIIIIlIIIlIlllIll, bi.IlIlIlIlIlllllllllIl, bi.llIllIIIIIllIlIIIIlI };
    }
    
    private bi(final String s, final int n, final String ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
