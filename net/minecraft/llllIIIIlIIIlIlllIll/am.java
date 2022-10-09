package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum am implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DEFAULT", 0, 0, "default", "default"), 
    IlIlIlIlIlllllllllIl("CHISELED", 1, 1, "chiseled", "chiseled"), 
    llIllIIIIIllIlIIIIlI("LINES_Y", 2, 2, "lines_y", "lines"), 
    IlIIIlIlIIIllIlIlIIl("LINES_X", 3, 3, "lines_x", "lines"), 
    IlIlIIIllIllIIIIIllI("LINES_Z", 4, 4, "lines_z", "lines");
    
    private static final am[] IllIIlllIIIIlllIIlIl;
    private final int llllIIIlIlllIlIIIIIl;
    private final String lIIIIlIIIIIlllIllIII;
    private final String lIIIlllIIIllIIIllIII;
    
    static {
        llIIlIIIlIIIllIlIIIl = new am[] { am.llllIIIIlIIIlIlllIll, am.IlIlIlIlIlllllllllIl, am.llIllIIIIIllIlIIIIlI, am.IlIIIlIlIIIllIlIlIIl, am.IlIlIIIllIllIIIIIllI };
        IllIIlllIIIIlllIIlIl = new am[values().length];
        am[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final am am = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.am.IllIIlllIIIIlllIIlIl[am.IlIlIlIlIlllllllllIl()] = am;
        }
    }
    
    private am(final String s, final int n, final int llllIIIlIlllIlIIIIIl, final String liiiIlIIIIIlllIllIII, final String liiIlllIIIllIIIllIII) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public String toString() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public static am llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= am.IllIIlllIIIIlllIIlIl.length) {
            n = 0;
        }
        return am.IllIIlllIIIIlllIIlIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
