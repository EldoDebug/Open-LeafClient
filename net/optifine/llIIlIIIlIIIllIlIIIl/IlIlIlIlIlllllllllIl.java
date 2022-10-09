package net.optifine.llIIlIIIlIIIllIlIIIl;

public enum IlIlIlIlIlllllllllIl
{
    llllIIIIlIIIlIlllIll("RED", 0, 6403), 
    IlIlIlIlIlllllllllIl("RG", 1, 33319), 
    llIllIIIIIllIlIIIIlI("RGB", 2, 6407), 
    IlIIIlIlIIIllIlIlIIl("BGR", 3, 32992), 
    IlIlIIIllIllIIIIIllI("RGBA", 4, 6408), 
    IllIIlllIIIIlllIIlIl("BGRA", 5, 32993), 
    llllIIIlIlllIlIIIIIl("RED_INTEGER", 6, 36244), 
    lIIIIlIIIIIlllIllIII("RG_INTEGER", 7, 33320), 
    lIIIlllIIIllIIIllIII("RGB_INTEGER", 8, 36248), 
    llIIlIIIlIIIllIlIIIl("BGR_INTEGER", 9, 36250), 
    llIllIlIIIIllIlIIllI("RGBA_INTEGER", 10, 36249), 
    lIlIlIIIllIIllIIIllI("BGRA_INTEGER", 11, 36251);
    
    private int IlIlIIIllIIllIlllllI;
    
    static {
        IIIIlllIIIIIIlIIIlll = new IlIlIlIlIlllllllllIl[] { IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI, IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl, IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl, IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII, IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII, IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl, IlIlIlIlIlllllllllIl.llIllIlIIIIllIlIIllI, IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI };
    }
    
    private IlIlIlIlIlllllllllIl(final String s, final int n, final int ilIlIIIllIIllIlllllI) {
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIIllIlllllI;
    }
}
