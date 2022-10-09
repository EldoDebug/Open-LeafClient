package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum llIllIIIIIllIlIIIIlI
{
    llllIIIIlIIIlIlllIll("DOWN", 0, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll), 
    IlIlIlIlIlllllllllIl("UP", 1, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl), 
    llIllIIIIIllIlIIIIlI("NORTH", 2, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI), 
    IlIIIlIlIIIllIlIlIIl("SOUTH", 3, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl), 
    IlIlIIIllIllIIIIIllI("WEST", 4, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI), 
    IllIIlllIIIIlllIIlIl("EAST", 5, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl), 
    llllIIIlIlllIlIIIIIl("NORTH_WEST", 6, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI), 
    lIIIIlIIIIIlllIllIII("NORTH_EAST", 7, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl), 
    lIIIlllIIIllIIIllIII("SOUTH_WEST", 8, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI), 
    llIIlIIIlIIIllIlIIIl("SOUTH_EAST", 9, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl), 
    llIllIlIIIIllIlIIllI("DOWN_NORTH", 10, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI), 
    lIlIlIIIllIIllIIIllI("DOWN_SOUTH", 11, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl), 
    IlIlIIIllIIllIlllllI("UP_NORTH", 12, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI), 
    IIIIlllIIIIIIlIIIlll("UP_SOUTH", 13, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl), 
    llllIIllllIlIlIIIIll("DOWN_WEST", 14, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI), 
    IlIllIlIlIIIlIlIlIII("DOWN_EAST", 15, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl), 
    IIlllIIlIllIllIlIIll("UP_WEST", 16, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI), 
    lllIIIIlllllIlIIllIl("UP_EAST", 17, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl);
    
    private lllIllIIIllllllIllll IlIlIIIIIIlllIlIllIl;
    private lllIllIIIllllllIllll IIllIIllIIIlIlIIIIlI;
    
    static {
        IIIlIIIlIlIIlllIIlll = new llIllIIIIIllIlIIIIlI[] { llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI, llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI, llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl, llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl, llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII, llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII, llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl, llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI, llIllIIIIIllIlIIIIlI.lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI.IlIlIIIllIIllIlllllI, llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll, llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll, llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII, llIllIIIIIllIlIIIIlI.IIlllIIlIllIllIlIIll, llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl };
    }
    
    private llIllIIIIIllIlIIIIlI(final String s, final int n, final lllIllIIIllllllIllll ilIlIIIIIIlllIlIllIl) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
    }
    
    private llIllIIIIIllIlIIIIlI(final String s, final int n, final lllIllIIIllllllIllll ilIlIIIIIIlllIlIllIl, final lllIllIIIllllllIllll iIllIIllIIIlIlIIIIlI) {
        this.IlIlIIIIIIlllIlIllIl = ilIlIIIIIIlllIlIllIl;
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
    }
    
    public lllIllIIIllllllIllll llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIIIIlllIlIllIl;
    }
    
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl() {
        return this.IIllIIllIIIlIlIIIIlI;
    }
    
    IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl, 1);
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IIllIIllIIIlIlIIIIlI, 1);
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        int liiiIlIIIIIlllIllIII = this.IlIlIIIIIIlllIlIllIl.lIIIIlIIIIIlllIllIII();
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            liiiIlIIIIIlllIllIII += this.IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII();
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        int liiIlllIIIllIIIllIII = this.IlIlIIIIIIlllIlIllIl.lIIIlllIIIllIIIllIII();
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            liiIlllIIIllIIIllIII += this.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII();
        }
        return liiIlllIIIllIIIllIII;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        int llIIlIIIlIIIllIlIIIl = this.IlIlIIIIIIlllIlIllIl.llIIlIIIlIIIllIlIIIl();
        if (this.IIllIIllIIIlIlIIIIlI != null) {
            llIIlIIIlIIIllIlIIIl += this.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl();
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.IIllIIllIIIlIlIIIIlI != null;
    }
}
