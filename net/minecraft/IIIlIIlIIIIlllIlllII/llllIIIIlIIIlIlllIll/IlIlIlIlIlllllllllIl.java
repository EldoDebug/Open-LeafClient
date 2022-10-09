package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

public class IlIlIlIlIlllllllllIl
{
    public float[] llllIIIIlIIIlIlllIll;
    public llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public long IlIlIIIllIllIIIIIllI;
    final /* synthetic */ llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    
    public IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll = new float[256];
        this.IlIlIlIlIlllllllllIl = new llIIlIIIlIIIllIlIIIl[256];
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI << 4, ilIIIlIlIIIllIlIlIIl << 4, 16, 16);
        illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI << 4, ilIIIlIlIIIllIlIlIIl << 4, 16, 16, false);
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return this.IlIlIlIlIlllllllllIl[(n & 0xF) | (n2 & 0xF) << 4];
    }
}
