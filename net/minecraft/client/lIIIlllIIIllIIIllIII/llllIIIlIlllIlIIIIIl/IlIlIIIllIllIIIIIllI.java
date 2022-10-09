package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;

public enum IlIlIIIllIllIIIIIllI
{
    llllIIIIlIIIlIlllIll("FLOAT", 0, 4, "Float", 5126), 
    IlIlIlIlIlllllllllIl("UBYTE", 1, 1, "Unsigned Byte", 5121), 
    llIllIIIIIllIlIIIIlI("BYTE", 2, 1, "Byte", 5120), 
    IlIIIlIlIIIllIlIlIIl("USHORT", 3, 2, "Unsigned Short", 5123), 
    IlIlIIIllIllIIIIIllI("SHORT", 4, 2, "Short", 5122), 
    IllIIlllIIIIlllIIlIl("UINT", 5, 4, "Unsigned Int", 5125), 
    llllIIIlIlllIlIIIIIl("INT", 6, 4, "Int", 5124);
    
    private final int lIIIIlIIIIIlllIllIII;
    private final String lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIlIIIIllIlIIllI = new IlIlIIIllIllIIIIIllI[] { IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll, IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl, IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI, IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl, IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI, IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl, IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl };
    }
    
    private IlIlIIIllIllIIIIIllI(final String s, final int n, final int liiiIlIIIIIlllIllIII, final String liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
}
