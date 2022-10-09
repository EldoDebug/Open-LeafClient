package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.lIIIlllIIIllIIIllIII.*;

public enum IIllIIIlIIlIlIlIIIII
{
    llllIIIIlIIIlIlllIll("YELLOW", 0), 
    IlIlIlIlIlllllllllIl("RED", 1);
    
    static {
        llIllIIIIIllIlIIIIlI = new IIllIIIlIIlIlIlIIIII[] { IIllIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll, IIllIIIlIIlIlIlIIIII.IlIlIlIlIlllllllllIl };
    }
    
    private IIllIIIlIIlIlIlIIIII(final String s, final int n) {
    }
    
    public lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll() {
        return (this == IIllIIIlIIlIlIlIIIII.llllIIIIlIIIlIlllIll) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll;
    }
}
