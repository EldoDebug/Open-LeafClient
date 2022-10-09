package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

class llllIIllllIlIlIIIIll
{
    private final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    
    public llllIIllllIlIlIIIIll(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final int n, final int ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = n;
        this.llIllIIIIIllIlIIIIlI = n;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        if (n < this.IlIlIlIlIlllllllllIl) {
            this.IlIlIlIlIlllllllllIl = n;
        }
        else if (n > this.llIllIIIIIllIlIIIIlI) {
            this.llIllIIIIIllIlIIIIlI = n;
        }
    }
    
    public IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
