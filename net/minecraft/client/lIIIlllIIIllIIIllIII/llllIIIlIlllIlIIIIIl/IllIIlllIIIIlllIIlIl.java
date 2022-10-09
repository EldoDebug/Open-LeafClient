package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl;

public enum IllIIlllIIIIlllIIlIl
{
    llllIIIIlIIIlIlllIll("POSITION", 0, "Position"), 
    IlIlIlIlIlllllllllIl("NORMAL", 1, "Normal"), 
    llIllIIIIIllIlIIIIlI("COLOR", 2, "Vertex Color"), 
    IlIIIlIlIIIllIlIlIIl("UV", 3, "UV"), 
    IlIlIIIllIllIIIIIllI("MATRIX", 4, "Bone Matrix"), 
    IllIIlllIIIIlllIIlIl("BLEND_WEIGHT", 5, "Blend Weight"), 
    llllIIIlIlllIlIIIIIl("PADDING", 6, "Padding");
    
    private final String lIIIIlIIIIIlllIllIII;
    
    static {
        lIIIlllIIIllIIIllIII = new IllIIlllIIIIlllIIlIl[] { IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl, IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI, IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI, IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl, IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl };
    }
    
    private IllIIlllIIIIlllIIlIl(final String s, final int n, final String liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
