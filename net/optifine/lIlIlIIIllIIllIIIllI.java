package net.optifine;

enum lIlIlIIIllIIllIIIllI
{
    llllIIIIlIIIlIlllIll("UP", 0), 
    IlIlIlIlIlllllllllIl("UP_RIGHT", 1), 
    llIllIIIIIllIlIIIIlI("RIGHT", 2), 
    IlIIIlIlIIIllIlIlIIl("DOWN_RIGHT", 3), 
    IlIlIIIllIllIIIIIllI("DOWN", 4), 
    IllIIlllIIIIlllIIlIl("DOWN_LEFT", 5), 
    llllIIIlIlllIlIIIIIl("LEFT", 6), 
    lIIIIlIIIIIlllIllIII("UP_LEFT", 7);
    
    public static final lIlIlIIIllIIllIIIllI[] lIIIlllIIIllIIIllIII;
    
    static {
        llIIlIIIlIIIllIlIIIl = new lIlIlIIIllIIllIIIllI[] { lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl, lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI, lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl, lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl, lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII };
        lIIIlllIIIllIIIllIII = values();
    }
    
    private lIlIlIIIllIIllIIIllI(final String s, final int n) {
    }
}
