package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public enum aa implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("OAK", 0, 0, "oak", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll), 
    IlIlIlIlIlllllllllIl("SPRUCE", 1, 1, "spruce", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI), 
    llIllIIIIIllIlIIIIlI("BIRCH", 2, 2, "birch", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), 
    IlIIIlIlIIIllIlIlIIl("JUNGLE", 3, 3, "jungle", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI), 
    IlIlIIIllIllIIIIIllI("ACACIA", 4, 4, "acacia", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll), 
    IllIIlllIIIIlllIIlIl("DARK_OAK", 5, 5, "dark_oak", "big_oak", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII);
    
    private static final aa[] llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    private final String lIIIlllIIIllIIIllIII;
    private final String llIIlIIIlIIIllIlIIIl;
    private final llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI;
    
    static {
        lIlIlIIIllIIllIIIllI = new aa[] { aa.llllIIIIlIIIlIlllIll, aa.IlIlIlIlIlllllllllIl, aa.llIllIIIIIllIlIIIIlI, aa.IlIIIlIlIIIllIlIlIIl, aa.IlIlIIIllIllIIIIIllI, aa.IllIIlllIIIIlllIIlIl };
        llllIIIlIlllIlIIIIIl = new aa[values().length];
        aa[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final aa aa = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.aa.llllIIIlIlllIlIIIIIl[aa.IlIlIlIlIlllllllllIl()] = aa;
        }
    }
    
    private aa(final String s, final int n, final int n2, final String s2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this(s, n, n2, s2, s2, llllIIIIlIIIlIlllIll);
    }
    
    private aa(final String s, final int n, final int liiiIlIIIIIlllIllIII, final String liiIlllIIIllIIIllIII, final String llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llIllIlIIIIllIlIIllI) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    @Override
    public String toString() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public static aa llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= aa.llllIIIlIlllIlIIIIIl.length) {
            n = 0;
        }
        return aa.llllIIIlIlllIlIIIIIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
}
