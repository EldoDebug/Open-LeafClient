package net.minecraft.IlIlIIIlIIlIlIIlllIl;

public class llIllIlIIIIllIlIIllI
{
    private final float[] llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    
    public llIllIlIIIIllIlIIllI(final float[] llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = 1;
    }
    
    protected void llllIIIIlIIIlIlllIll() {
        ++this.IlIlIlIlIlllllllllIl;
    }
    
    public float[] IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.IlIlIlIlIlllllllllIl;
    }
}
