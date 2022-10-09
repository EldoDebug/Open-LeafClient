package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

public class llllIIIIlIIIlIlllIll
{
    private final int llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    
    public llllIIIIlIIIlIlllIll(final int n) {
        this(n, -1);
    }
    
    public llllIIIIlIIIlIlllIll(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl == -1;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
