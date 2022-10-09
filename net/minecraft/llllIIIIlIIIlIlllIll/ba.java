package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum ba implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("COMPARE", 0, "compare"), 
    IlIlIlIlIlllllllllIl("SUBTRACT", 1, "subtract");
    
    private final String llIllIIIIIllIlIIIIlI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new ba[] { ba.llllIIIIlIIIlIlllIll, ba.IlIlIlIlIlllllllllIl };
    }
    
    private ba(final String s, final int n, final String llIllIIIIIllIlIIIIlI) {
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
