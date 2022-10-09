package net.minecraft.IlllllllIIIlIIIlIlII;

public final class llllIIIlIlllIlIIIIIl extends IlIlIlIlIlllllllllIl
{
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    
    public llllIIIlIlllIlIIIIIl() {
        this(0, 0, 0);
    }
    
    public llllIIIlIlllIlIIIIIl(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        super(0, 0, 0);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public int llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public llllIIIlIlllIlIIIIIl IlIlIlIlIlllllllllIl(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        return this;
    }
}
