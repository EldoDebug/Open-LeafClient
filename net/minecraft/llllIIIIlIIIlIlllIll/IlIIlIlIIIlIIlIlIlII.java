package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IlIIlIlIIIlIIlIlIlII implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("UPPER", 0), 
    IlIlIlIlIlllllllllIl("LOWER", 1);
    
    static {
        llIllIIIIIllIlIIIIlI = new IlIIlIlIIIlIIlIlIlII[] { IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll, IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl };
    }
    
    private IlIIlIlIIIlIIlIlIlII(final String s, final int n) {
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return (this == IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) ? "upper" : "lower";
    }
}
