package net.minecraft.client.llIllIIIIIllIlIIIIlI;

enum IlllIIIIlIIIlIlIlIIl
{
    llllIIIIlIIIlIlllIll("LOCKED", 0, 0, 146), 
    IlIlIlIlIlllllllllIl("LOCKED_HOVER", 1, 0, 166), 
    llIllIIIIIllIlIIIIlI("LOCKED_DISABLED", 2, 0, 186), 
    IlIIIlIlIIIllIlIlIIl("UNLOCKED", 3, 20, 146), 
    IlIlIIIllIllIIIIIllI("UNLOCKED_HOVER", 4, 20, 166), 
    IllIIlllIIIIlllIIlIl("UNLOCKED_DISABLED", 5, 20, 186);
    
    private final int llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    
    static {
        lIIIlllIIIllIIIllIII = new IlllIIIIlIIIlIlIlIIl[] { IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll, IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl, IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI, IlllIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl, IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI, IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl };
    }
    
    private IlllIIIIlIIIlIlIlIIl(final String s, final int n, final int llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
