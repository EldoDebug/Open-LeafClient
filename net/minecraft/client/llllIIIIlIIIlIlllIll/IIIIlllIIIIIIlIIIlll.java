package net.minecraft.client.llllIIIIlIIIlIlllIll;

public class IIIIlllIIIIIIlIIIlll implements IlIIIlIlIIIllIlIlIIl
{
    private final lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    
    IIIIlllIIIIIIlIIIlll(final lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public lllllIlIIIlIlIIlllII llIllIIIIIllIlIIIIlI() {
        return new lllllIlIIIlIlIIlllII(this.llllIIIIlIIIlIlllIll);
    }
}
