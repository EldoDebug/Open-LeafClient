package net.optifine.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public enum IIlllIIlIllIllIlIIll
{
    llllIIIIlIIIlIlllIll("CLEAR", 0), 
    IlIlIlIlIlllllllllIl("RAIN", 1), 
    llIllIIIIIllIlIIIIlI("THUNDER", 2);
    
    static {
        IlIIIlIlIIIllIlIlIIl = new IIlllIIlIllIllIlIIll[] { IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll, IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl, IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI };
    }
    
    private IIlllIIlIllIllIlIIll(final String s, final int n) {
    }
    
    public static IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final float n) {
        if (illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(n) > 0.5f) {
            return IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI;
        }
        return (illlllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(n) > 0.5f) ? IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl : IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll;
    }
}
