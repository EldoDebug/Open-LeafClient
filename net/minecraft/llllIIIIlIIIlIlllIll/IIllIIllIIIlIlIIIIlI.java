package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IIllIIllIIIlIlIIIIlI implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("HEAD", 0, "head"), 
    IlIlIlIlIlllllllllIl("FOOT", 1, "foot");
    
    private final String llIllIIIIIllIlIIIIlI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new IIllIIllIIIlIlIIIIlI[] { IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll, IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl };
    }
    
    private IIllIIllIIIlIlIIIIlI(final String s, final int n, final String llIllIIIIIllIlIIIIlI) {
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
