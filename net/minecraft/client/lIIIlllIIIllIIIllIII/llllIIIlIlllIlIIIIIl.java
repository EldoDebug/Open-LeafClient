package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

enum llllIIIlIlllIlIIIIIl
{
    llllIIIIlIIIlIlllIll("DOWN", 0, 0, 1, 2, 3), 
    IlIlIlIlIlllllllllIl("UP", 1, 2, 3, 0, 1), 
    llIllIIIIIllIlIIIIlI("NORTH", 2, 3, 0, 1, 2), 
    IlIIIlIlIIIllIlIlIIl("SOUTH", 3, 0, 1, 2, 3), 
    IlIlIIIllIllIIIIIllI("WEST", 4, 3, 0, 1, 2), 
    IllIIlllIIIIlllIIlIl("EAST", 5, 1, 2, 3, 0);
    
    private final int llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    private static final llllIIIlIlllIlIIIIIl[] llIllIlIIIIllIlIIllI;
    
    static {
        lIlIlIIIllIIllIIIllI = new llllIIIlIlllIlIIIIIl[] { llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI, llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl, llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI, llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl };
        (llIllIlIIIIllIlIIllI = new llllIIIlIlllIlIIIIIl[6])[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()] = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;
        llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] = llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;
        llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl()] = llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()] = llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;
        llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()] = llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;
        llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()] = llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;
    }
    
    private llllIIIlIlllIlIIIIIl(final String s, final int n, final int llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII, final int liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return llllIIIlIlllIlIIIIIl.llIllIlIIIIllIlIIllI[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl()];
    }
}
