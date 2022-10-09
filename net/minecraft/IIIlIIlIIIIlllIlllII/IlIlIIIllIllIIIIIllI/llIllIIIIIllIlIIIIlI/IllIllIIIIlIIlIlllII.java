package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

class IllIllIIIIlIIlIlllII
{
    public Class llllIIIIlIIIlIlllIll;
    public final int IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public int IlIIIlIlIIIllIlIlIIl;
    public boolean IlIlIIIllIllIIIIIllI;
    
    public IllIllIIIIlIIlIlllII(final Class llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int ilIIIlIlIIIllIlIlIIl, final boolean ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public IllIllIIIIlIIlIlllII(final Class clazz, final int n, final int n2) {
        this(clazz, n, n2, false);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n) {
        return this.IlIIIlIlIIIllIlIlIIl == 0 || this.llIllIIIIIllIlIIIIlI < this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl == 0 || this.llIllIIIIIllIlIIIIlI < this.IlIIIlIlIIIllIlIlIIl;
    }
}
