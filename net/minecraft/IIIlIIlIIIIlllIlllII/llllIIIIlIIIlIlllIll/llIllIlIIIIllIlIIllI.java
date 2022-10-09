package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

public class llIllIlIIIIllIlIIllI
{
    public float llllIIIIlIIIlIlllIll;
    public float IlIlIlIlIlllllllllIl;
    
    public llIllIlIIIIllIlIIllI(final float llllIIIIlIIIlIlllIll, final float ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll() {
        return new llIllIlIIIIllIlIIllI(this.llllIIIIlIIIlIlllIll * 0.8f, this.IlIlIlIlIlllllllllIl * 0.6f);
    }
}
