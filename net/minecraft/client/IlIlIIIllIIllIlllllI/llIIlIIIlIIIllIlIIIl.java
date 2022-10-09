package net.minecraft.client.IlIlIIIllIIllIlllllI;

public enum llIIlIIIlIIIllIlIIIl
{
    llllIIIIlIIIlIlllIll("Uninitialized", 0), 
    IlIlIlIlIlllllllllIl("Initializing", 1), 
    llIllIIIIIllIlIIIIlI("Initialized", 2), 
    IlIIIlIlIIIllIlIlIIl("ShuttingDown", 3);
    
    static {
        IlIlIIIllIllIIIIIllI = new llIIlIIIlIIIllIlIIIl[] { llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI, llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl };
    }
    
    private llIIlIIIlIIIllIlIIIl(final String s, final int n) {
    }
}
