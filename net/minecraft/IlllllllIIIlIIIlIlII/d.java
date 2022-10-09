package net.minecraft.IlllllllIIIlIIIlIlII;

public enum d
{
    llllIIIIlIIIlIlllIll("LINUX", 0), 
    IlIlIlIlIlllllllllIl("SOLARIS", 1), 
    llIllIIIIIllIlIIIIlI("WINDOWS", 2), 
    IlIIIlIlIIIllIlIlIIl("OSX", 3), 
    IlIlIIIllIllIIIIIllI("UNKNOWN", 4);
    
    static {
        IllIIlllIIIIlllIIlIl = new d[] { d.llllIIIIlIIIlIlllIll, d.IlIlIlIlIlllllllllIl, d.llIllIIIIIllIlIIIIlI, d.IlIIIlIlIIIllIlIlIIl, d.IlIlIIIllIllIIIIIllI };
    }
    
    private d(final String s, final int n) {
    }
}
