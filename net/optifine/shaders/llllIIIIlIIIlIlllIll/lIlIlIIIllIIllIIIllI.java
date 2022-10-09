package net.optifine.shaders.llllIIIIlIIIlIlllIll;

public class lIlIlIIIllIIllIIIllI
{
    private String llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    
    public lIlIlIIIllIIllIIIllI(final String llllIIIIlIIIlIlllIll, final String ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return "#define " + this.llllIIIIlIIIlIlllIll + " " + this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public String toString() {
        return this.llIllIIIIIllIlIIIIlI();
    }
}
