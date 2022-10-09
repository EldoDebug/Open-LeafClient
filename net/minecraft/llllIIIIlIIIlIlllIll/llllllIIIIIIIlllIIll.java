package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum llllllIIIIIIIlllIIll implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("NORTH_WEST", 0, 1, "north_west"), 
    IlIlIlIlIlllllllllIl("NORTH", 1, 2, "north"), 
    llIllIIIIIllIlIIIIlI("NORTH_EAST", 2, 3, "north_east"), 
    IlIIIlIlIIIllIlIlIIl("WEST", 3, 4, "west"), 
    IlIlIIIllIllIIIIIllI("CENTER", 4, 5, "center"), 
    IllIIlllIIIIlllIIlIl("EAST", 5, 6, "east"), 
    llllIIIlIlllIlIIIIIl("SOUTH_WEST", 6, 7, "south_west"), 
    lIIIIlIIIIIlllIllIII("SOUTH", 7, 8, "south"), 
    lIIIlllIIIllIIIllIII("SOUTH_EAST", 8, 9, "south_east"), 
    llIIlIIIlIIIllIlIIIl("STEM", 9, 10, "stem"), 
    llIllIlIIIIllIlIIllI("ALL_INSIDE", 10, 0, "all_inside"), 
    lIlIlIIIllIIllIIIllI("ALL_OUTSIDE", 11, 14, "all_outside"), 
    IlIlIIIllIIllIlllllI("ALL_STEM", 12, 15, "all_stem");
    
    private static final llllllIIIIIIIlllIIll[] IIIIlllIIIIIIlIIIlll;
    private final int llllIIllllIlIlIIIIll;
    private final String IlIllIlIlIIIlIlIlIII;
    
    static {
        IIlllIIlIllIllIlIIll = new llllllIIIIIIIlllIIll[] { llllllIIIIIIIlllIIll.llllIIIIlIIIlIlllIll, llllllIIIIIIIlllIIll.IlIlIlIlIlllllllllIl, llllllIIIIIIIlllIIll.llIllIIIIIllIlIIIIlI, llllllIIIIIIIlllIIll.IlIIIlIlIIIllIlIlIIl, llllllIIIIIIIlllIIll.IlIlIIIllIllIIIIIllI, llllllIIIIIIIlllIIll.IllIIlllIIIIlllIIlIl, llllllIIIIIIIlllIIll.llllIIIlIlllIlIIIIIl, llllllIIIIIIIlllIIll.lIIIIlIIIIIlllIllIII, llllllIIIIIIIlllIIll.lIIIlllIIIllIIIllIII, llllllIIIIIIIlllIIll.llIIlIIIlIIIllIlIIIl, llllllIIIIIIIlllIIll.llIllIlIIIIllIlIIllI, llllllIIIIIIIlllIIll.lIlIlIIIllIIllIIIllI, llllllIIIIIIIlllIIll.IlIlIIIllIIllIlllllI };
        IIIIlllIIIIIIlIIIlll = new llllllIIIIIIIlllIIll[16];
        llllllIIIIIIIlllIIll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final llllllIIIIIIIlllIIll llllllIIIIIIIlllIIll = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.IIIIlllIIIIIIlIIIlll[llllllIIIIIIIlllIIll.IlIlIlIlIlllllllllIl()] = llllllIIIIIIIlllIIll;
        }
    }
    
    private llllllIIIIIIIlllIIll(final String s, final int n, final int llllIIllllIlIlIIIIll, final String ilIllIlIlIIIlIlIlIII) {
        this.llllIIllllIlIlIIIIll = llllIIllllIlIlIIIIll;
        this.IlIllIlIlIIIlIlIlIII = ilIllIlIlIIIlIlIlIII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIllllIlIlIIIIll;
    }
    
    @Override
    public String toString() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
    
    public static llllllIIIIIIIlllIIll llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= llllllIIIIIIIlllIIll.IIIIlllIIIIIIlIIIlll.length) {
            n = 0;
        }
        final llllllIIIIIIIlllIIll llllllIIIIIIIlllIIll = net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.IIIIlllIIIIIIlIIIlll[n];
        return (llllllIIIIIIIlllIIll == null) ? net.minecraft.llllIIIIlIIIlIlllIll.llllllIIIIIIIlllIIll.IIIIlllIIIIIIlIIIlll[0] : llllllIIIIIIIlllIIll;
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIllIlIlIIIlIlIlIII;
    }
}
