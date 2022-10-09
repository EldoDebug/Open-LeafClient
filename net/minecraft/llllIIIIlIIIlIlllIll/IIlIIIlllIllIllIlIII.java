package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IIlIIIlllIllIllIlIII implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("UPPER", 0), 
    IlIlIlIlIlllllllllIl("LOWER", 1);
    
    static {
        llIllIIIIIllIlIIIIlI = new IIlIIIlllIllIllIlIII[] { IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll, IIlIIIlllIllIllIlIII.IlIlIlIlIlllllllllIl };
    }
    
    private IIlIIIlllIllIllIlIII(final String s, final int n) {
    }
    
    @Override
    public String toString() {
        return this.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return (this == IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll) ? "upper" : "lower";
    }
}
