package net.minecraft.llllIIIlIlllIlIIIIIl;

public enum IIlllIIlIllIllIlIIll
{
    llllIIIIlIIIlIlllIll("ON_GROUND", 0), 
    IlIlIlIlIlllllllllIl("IN_AIR", 1), 
    llIllIIIIIllIlIIIIlI("IN_WATER", 2);
    
    static {
        IlIIIlIlIIIllIlIlIIl = new IIlllIIlIllIllIlIIll[] { IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll, IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl, IIlllIIlIllIllIlIIll.llIllIIIIIllIlIIIIlI };
    }
    
    private IIlllIIlIllIllIlIIll(final String s, final int n) {
    }
}
