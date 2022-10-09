package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public enum bt implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("STONE", 0, 0, "stone"), 
    IlIlIlIlIlllllllllIl("COBBLESTONE", 1, 1, "cobblestone", "cobble"), 
    llIllIIIIIllIlIIIIlI("STONEBRICK", 2, 2, "stone_brick", "brick"), 
    IlIIIlIlIIIllIlIlIIl("MOSSY_STONEBRICK", 3, 3, "mossy_brick", "mossybrick"), 
    IlIlIIIllIllIIIIIllI("CRACKED_STONEBRICK", 4, 4, "cracked_brick", "crackedbrick"), 
    IllIIlllIIIIlllIIlIl("CHISELED_STONEBRICK", 5, 5, "chiseled_brick", "chiseledbrick");
    
    private static final bt[] llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    private final String lIIIlllIIIllIIIllIII;
    private final String llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIlIIIIllIlIIllI = new bt[] { bt.llllIIIIlIIIlIlllIll, bt.IlIlIlIlIlllllllllIl, bt.llIllIIIIIllIlIIIIlI, bt.IlIIIlIlIIIllIlIlIIl, bt.IlIlIIIllIllIIIIIllI, bt.IllIIlllIIIIlllIIlIl };
        llllIIIlIlllIlIIIIIl = new bt[values().length];
        bt[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final bt bt = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.bt.llllIIIlIlllIlIIIIIl[bt.IlIlIlIlIlllllllllIl()] = bt;
        }
    }
    
    private bt(final String s, final int n, final int n2, final String s2) {
        this(s, n, n2, s2, s2);
    }
    
    private bt(final String s, final int n, final int liiiIlIIIIIlllIllIII, final String liiIlllIIIllIIIllIII, final String llIIlIIIlIIIllIlIIIl) {
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
    
    public static bt llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= bt.llllIIIlIlllIlIIIIIl.length) {
            n = 0;
        }
        return bt.llllIIIlIlllIlIIIIIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public abstract llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl();
    
    public static bt llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        bt[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final bt bt = values[i];
            if (llIIlIIIlIIIllIlIIIl == bt.IlIIIlIlIIIllIlIlIIl()) {
                return bt;
            }
        }
        return bt.llllIIIIlIIIlIlllIll;
    }
}
