package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum ap implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("NORTH_SOUTH", 0, 0, "north_south"), 
    IlIlIlIlIlllllllllIl("EAST_WEST", 1, 1, "east_west"), 
    llIllIIIIIllIlIIIIlI("ASCENDING_EAST", 2, 2, "ascending_east"), 
    IlIIIlIlIIIllIlIlIIl("ASCENDING_WEST", 3, 3, "ascending_west"), 
    IlIlIIIllIllIIIIIllI("ASCENDING_NORTH", 4, 4, "ascending_north"), 
    IllIIlllIIIIlllIIlIl("ASCENDING_SOUTH", 5, 5, "ascending_south"), 
    llllIIIlIlllIlIIIIIl("SOUTH_EAST", 6, 6, "south_east"), 
    lIIIIlIIIIIlllIllIII("SOUTH_WEST", 7, 7, "south_west"), 
    lIIIlllIIIllIIIllIII("NORTH_WEST", 8, 8, "north_west"), 
    llIIlIIIlIIIllIlIIIl("NORTH_EAST", 9, 9, "north_east");
    
    private static final ap[] llIllIlIIIIllIlIIllI;
    private final int lIlIlIIIllIIllIIIllI;
    private final String IlIlIIIllIIllIlllllI;
    
    static {
        IIIIlllIIIIIIlIIIlll = new ap[] { ap.llllIIIIlIIIlIlllIll, ap.IlIlIlIlIlllllllllIl, ap.llIllIIIIIllIlIIIIlI, ap.IlIIIlIlIIIllIlIlIIl, ap.IlIlIIIllIllIIIIIllI, ap.IllIIlllIIIIlllIIlIl, ap.llllIIIlIlllIlIIIIIl, ap.lIIIIlIIIIIlllIllIII, ap.lIIIlllIIIllIIIllIII, ap.llIIlIIIlIIIllIlIIIl };
        llIllIlIIIIllIlIIllI = new ap[values().length];
        ap[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final ap ap = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.ap.llIllIlIIIIllIlIIllI[ap.IlIlIlIlIlllllllllIl()] = ap;
        }
    }
    
    private ap(final String s, final int n, final int lIlIlIIIllIIllIIIllI, final String ilIlIIIllIIllIlllllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public String toString() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this == ap.IlIlIIIllIllIIIIIllI || this == ap.llIllIIIIIllIlIIIIlI || this == ap.IllIIlllIIIIlllIIlIl || this == ap.IlIIIlIlIIIllIlIlIIl;
    }
    
    public static ap llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= ap.llIllIlIIIIllIlIIllI.length) {
            n = 0;
        }
        return ap.llIllIlIIIIllIlIIllI[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIIllIlllllI;
    }
}
