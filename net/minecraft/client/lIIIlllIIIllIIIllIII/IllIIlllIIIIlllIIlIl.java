package net.minecraft.client.lIIIlllIIIllIIIllIII;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum IllIIlllIIIIlllIIlIl
{
    llllIIIIlIIIlIlllIll("DOWN", 0, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, false), 
    IlIlIlIlIlllllllllIl("UP", 1, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, false), 
    llIllIIIIIllIlIIIIlI("NORTH", 2, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, false), 
    IlIIIlIlIIIllIlIlIIl("SOUTH", 3, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, false), 
    IlIlIIIllIllIIIIIllI("WEST", 4, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, false), 
    IllIIlllIIIIlllIIlIl("EAST", 5, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, false), 
    llllIIIlIlllIlIIIIIl("FLIP_DOWN", 6, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, true), 
    lIIIIlIIIIIlllIllIII("FLIP_UP", 7, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, true), 
    lIIIlllIIIllIIIllIII("FLIP_NORTH", 8, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, true), 
    llIIlIIIlIIIllIlIIIl("FLIP_SOUTH", 9, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, true), 
    llIllIlIIIIllIlIIllI("FLIP_WEST", 10, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI, true), 
    lIlIlIIIllIIllIIIllI("FLIP_EAST", 11, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl, true);
    
    protected final int IlIlIIIllIIllIlllllI;
    
    static {
        IIIIlllIIIIIIlIIIlll = new IllIIlllIIIIlllIIlIl[] { IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl, IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI, IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, IllIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI, IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl, IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl, IllIIlllIIIIlllIIlIl.lIIIIlIIIIIlllIllIII, IllIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII, IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl, IllIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI, IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI };
    }
    
    private IllIIlllIIIIlllIIlIl(final String s, final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final boolean b) {
        this.IlIlIIIllIIllIlllllI = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl() + (b ? lllIllIIIllllllIllll.values().length : 0);
    }
}
