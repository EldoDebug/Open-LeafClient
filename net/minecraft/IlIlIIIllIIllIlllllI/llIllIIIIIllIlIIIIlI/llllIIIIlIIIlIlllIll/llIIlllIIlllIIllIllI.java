package net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

public enum llIIlllIIlllIIllIllI
{
    llllIIIIlIIIlIlllIll("SUCCESSFULLY_LOADED", 0), 
    IlIlIlIlIlllllllllIl("DECLINED", 1), 
    llIllIIIIIllIlIIIIlI("FAILED_DOWNLOAD", 2), 
    IlIIIlIlIIIllIlIlIIl("ACCEPTED", 3);
    
    static {
        IlIlIIIllIllIIIIIllI = new llIIlllIIlllIIllIllI[] { llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll, llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl, llIIlllIIlllIIllIllI.llIllIIIIIllIlIIIIlI, llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl };
    }
    
    private llIIlllIIlllIIllIllI(final String s, final int n) {
    }
}
