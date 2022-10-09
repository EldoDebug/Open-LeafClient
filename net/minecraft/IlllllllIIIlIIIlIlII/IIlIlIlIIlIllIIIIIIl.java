package net.minecraft.IlllllllIIIlIIIlIlII;

public enum IIlIlIlIIlIllIIIIIIl
{
    llllIIIIlIIIlIlllIll("POSITIVE", 0, 1, "Towards positive"), 
    IlIlIlIlIlllllllllIl("NEGATIVE", 1, -1, "Towards negative");
    
    private final int llIllIIIIIllIlIIIIlI;
    private final String IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new IIlIlIlIIlIllIIIIIIl[] { IIlIlIlIIlIllIIIIIIl.llllIIIIlIIIlIlllIll, IIlIlIlIIlIllIIIIIIl.IlIlIlIlIlllllllllIl };
    }
    
    private IIlIlIlIIlIllIIIIIIl(final String s, final int n, final int llIllIIIIIllIlIIIIlI, final String ilIIIlIlIIIllIlIlIIl) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public String toString() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
