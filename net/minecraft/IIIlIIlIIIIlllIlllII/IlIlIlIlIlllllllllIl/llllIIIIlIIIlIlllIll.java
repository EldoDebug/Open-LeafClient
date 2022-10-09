package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl;

public enum llllIIIIlIIIlIlllIll
{
    llllIIIIlIIIlIlllIll("GROWING", 0, 4259712), 
    IlIlIlIlIlllllllllIl("SHRINKING", 1, 16724016), 
    llIllIIIIIllIlIIIIlI("STATIONARY", 2, 2138367);
    
    private final int IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new llllIIIIlIIIlIlllIll[] { llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI };
    }
    
    private llllIIIIlIIIlIlllIll(final String s, final int n, final int ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
