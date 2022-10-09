package net.optifine.lIIIIlIIIIIlllIllIII;

public class IlIlIIIllIIllIlllllI
{
    private llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private Class IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private lIlIlIIIllIIllIIIllI[] IlIIIlIlIIIllIlIlIIl;
    
    public IlIlIIIllIIllIlllllI(final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final Class ilIlIlIlIlllllllllIl, final int n) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() && ilIlIlIlIlllllllllIl != null) {
            this.IlIIIlIlIIIllIlIlIIl = new lIlIlIIIllIIllIIIllI[n];
            for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                this.IlIIIlIlIIIllIlIlIIl[i] = new lIlIlIIIllIIllIIIllI(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, i);
            }
        }
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public Class IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public lIlIlIIIllIIllIIIllI llllIIIIlIIIlIlllIll(final int n) {
        return (n >= 0 && n < this.IlIIIlIlIIIllIlIlIIl.length) ? this.IlIIIlIlIIIllIlIlIIl[n] : null;
    }
}
