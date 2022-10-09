package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public enum cu implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("STONE", 0, 0, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, "stone"), 
    IlIlIlIlIlllllllllIl("GRANITE", 1, 1, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, "granite"), 
    llIllIIIIIllIlIIIIlI("GRANITE_SMOOTH", 2, 2, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, "smooth_granite", "graniteSmooth"), 
    IlIIIlIlIIIllIlIlIIl("DIORITE", 3, 3, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, "diorite"), 
    IlIlIIIllIllIIIIIllI("DIORITE_SMOOTH", 4, 4, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII, "smooth_diorite", "dioriteSmooth"), 
    IllIIlllIIIIlllIIlIl("ANDESITE", 5, 5, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, "andesite"), 
    llllIIIlIlllIlIIIIIl("ANDESITE_SMOOTH", 6, 6, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI, "smooth_andesite", "andesiteSmooth");
    
    private static final cu[] lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    private final String llIIlIIIlIIIllIlIIIl;
    private final String llIllIlIIIIllIlIIllI;
    private final llllIIIIlIIIlIlllIll lIlIlIIIllIIllIIIllI;
    
    static {
        IlIlIIIllIIllIlllllI = new cu[] { cu.llllIIIIlIIIlIlllIll, cu.IlIlIlIlIlllllllllIl, cu.llIllIIIIIllIlIIIIlI, cu.IlIIIlIlIIIllIlIlIIl, cu.IlIlIIIllIllIIIIIllI, cu.IllIIlllIIIIlllIIlIl, cu.llllIIIlIlllIlIIIIIl };
        lIIIIlIIIIIlllIllIII = new cu[values().length];
        cu[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final cu cu = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.cu.lIIIIlIIIIIlllIllIII[cu.IlIlIlIlIlllllllllIl()] = cu;
        }
    }
    
    private cu(final String s, final int n, final int n2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s2) {
        this(s, n, n2, llllIIIIlIIIlIlllIll, s2, s2);
    }
    
    private cu(final String s, final int n, final int liiIlllIIIllIIIllIII, final llllIIIIlIIIlIlllIll lIlIlIIIllIIllIIIllI, final String llIIlIIIlIIIllIlIIIl, final String llIllIlIIIIllIlIIllI) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    @Override
    public String toString() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public static cu llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= cu.lIIIIlIIIIIlllIllIII.length) {
            n = 0;
        }
        return cu.lIIIIlIIIIIlllIllIII[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
}
