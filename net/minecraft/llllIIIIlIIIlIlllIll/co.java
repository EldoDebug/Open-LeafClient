package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum co implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("STRAIGHT", 0, "straight"), 
    IlIlIlIlIlllllllllIl("INNER_LEFT", 1, "inner_left"), 
    llIllIIIIIllIlIIIIlI("INNER_RIGHT", 2, "inner_right"), 
    IlIIIlIlIIIllIlIlIIl("OUTER_LEFT", 3, "outer_left"), 
    IlIlIIIllIllIIIIIllI("OUTER_RIGHT", 4, "outer_right");
    
    private final String IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new co[] { co.llllIIIIlIIIlIlllIll, co.IlIlIlIlIlllllllllIl, co.llIllIIIIIllIlIIIIlI, co.IlIIIlIlIIIllIlIlIIl, co.IlIlIIIllIllIIIIIllI };
    }
    
    private co(final String s, final int n, final String illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public String toString() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
