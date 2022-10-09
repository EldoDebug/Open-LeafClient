package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum cw implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DEFAULT", 0, 0, "stonebrick", "default"), 
    IlIlIlIlIlllllllllIl("MOSSY", 1, 1, "mossy_stonebrick", "mossy"), 
    llIllIIIIIllIlIIIIlI("CRACKED", 2, 2, "cracked_stonebrick", "cracked"), 
    IlIIIlIlIIIllIlIlIIl("CHISELED", 3, 3, "chiseled_stonebrick", "chiseled");
    
    private static final cw[] IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    private final String lIIIIlIIIIIlllIllIII;
    
    static {
        lIIIlllIIIllIIIllIII = new cw[] { cw.llllIIIIlIIIlIlllIll, cw.IlIlIlIlIlllllllllIl, cw.llIllIIIIIllIlIIIIlI, cw.IlIIIlIlIIIllIlIlIIl };
        IlIlIIIllIllIIIIIllI = new cw[values().length];
        cw[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final cw cw = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.cw.IlIlIIIllIllIIIIIllI[cw.IlIlIlIlIlllllllllIl()] = cw;
        }
    }
    
    private cw(final String s, final int n, final int illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl, final String liiiIlIIIIIlllIllIII) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public String toString() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public static cw llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= cw.IlIlIIIllIllIIIIIllI.length) {
            n = 0;
        }
        return cw.IlIlIIIllIllIIIIIllI[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
