package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum lIlIlIlllIIlIlIlllIl implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("SUNFLOWER", 0, 0, "sunflower"), 
    IlIlIlIlIlllllllllIl("SYRINGA", 1, 1, "syringa"), 
    llIllIIIIIllIlIIIIlI("GRASS", 2, 2, "double_grass", "grass"), 
    IlIIIlIlIIIllIlIlIIl("FERN", 3, 3, "double_fern", "fern"), 
    IlIlIIIllIllIIIIIllI("ROSE", 4, 4, "double_rose", "rose"), 
    IllIIlllIIIIlllIIlIl("PAEONIA", 5, 5, "paeonia");
    
    private static final lIlIlIlllIIlIlIlllIl[] llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    private final String lIIIlllIIIllIIIllIII;
    private final String llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIlIIIIllIlIIllI = new lIlIlIlllIIlIlIlllIl[] { lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll, lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl, lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI, lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl, lIlIlIlllIIlIlIlllIl.IlIlIIIllIllIIIIIllI, lIlIlIlllIIlIlIlllIl.IllIIlllIIIIlllIIlIl };
        llllIIIlIlllIlIIIIIl = new lIlIlIlllIIlIlIlllIl[values().length];
        lIlIlIlllIIlIlIlllIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final lIlIlIlllIIlIlIlllIl lIlIlIlllIIlIlIlllIl = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.llllIIIlIlllIlIIIIIl[lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl()] = lIlIlIlllIIlIlIlllIl;
        }
    }
    
    private lIlIlIlllIIlIlIlllIl(final String s, final int n, final int n2, final String s2) {
        this(s, n, n2, s2, s2);
    }
    
    private lIlIlIlllIIlIlIlllIl(final String s, final int n, final int liiiIlIIIIIlllIllIII, final String liiIlllIIIllIIIllIII, final String llIIlIIIlIIIllIlIIIl) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    @Override
    public String toString() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public static lIlIlIlllIIlIlIlllIl llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= lIlIlIlllIIlIlIlllIl.llllIIIlIlllIlIIIIIl.length) {
            n = 0;
        }
        return lIlIlIlllIIlIlIlllIl.llllIIIlIlllIlIIIIIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
}
