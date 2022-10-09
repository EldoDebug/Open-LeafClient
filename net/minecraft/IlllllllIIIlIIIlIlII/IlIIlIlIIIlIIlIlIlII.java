package net.minecraft.IlllllllIIIlIIIlIlII;

public enum IlIIlIlIIIlIIlIlIlII
{
    llllIIIIlIIIlIlllIll("SOLID", 0, "Solid"), 
    IlIlIlIlIlllllllllIl("CUTOUT_MIPPED", 1, "Mipped Cutout"), 
    llIllIIIIIllIlIIIIlI("CUTOUT", 2, "Cutout"), 
    IlIIIlIlIIIllIlIlIIl("TRANSLUCENT", 3, "Translucent");
    
    private final String IlIlIIIllIllIIIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = new IlIIlIlIIIlIIlIlIlII[] { IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll, IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl, IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI, IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl };
    }
    
    private IlIIlIlIIIlIIlIlIlII(final String s, final int n, final String ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
