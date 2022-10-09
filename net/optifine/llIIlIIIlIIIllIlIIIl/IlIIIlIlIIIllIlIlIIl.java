package net.optifine.llIIlIIIlIIIllIlIIIl;

public enum IlIIIlIlIIIllIlIlIIl
{
    llllIIIIlIIIlIlllIll("TEXTURE_1D", 0, 3552), 
    IlIlIlIlIlllllllllIl("TEXTURE_2D", 1, 3553), 
    llIllIIIIIllIlIIIIlI("TEXTURE_3D", 2, 32879), 
    IlIIIlIlIIIllIlIlIIl("TEXTURE_RECTANGLE", 3, 34037);
    
    private int IlIlIIIllIllIIIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = new IlIIIlIlIIIllIlIlIIl[] { IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll, IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl, IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI, IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl };
    }
    
    private IlIIIlIlIIIllIlIlIIl(final String s, final int n, final int ilIlIIIllIllIIIIIllI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
