package net.minecraft.client.llllIIIIlIIIlIlllIll;

public enum llIllIIIIIllIlIIIIlI
{
    llllIIIIlIIIlIlllIll("NONE", 0, 0), 
    IlIlIlIlIlllllllllIl("LINEAR", 1, 2);
    
    private final int llIllIIIIIllIlIIIIlI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = new llIllIIIIIllIlIIIIlI[] { llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl };
    }
    
    private llIllIIIIIllIlIIIIlI(final String s, final int n, final int llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
}
