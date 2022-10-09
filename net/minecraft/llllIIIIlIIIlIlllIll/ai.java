package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum ai implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("ROUGH", 0, 0, "prismarine", "rough"), 
    IlIlIlIlIlllllllllIl("BRICKS", 1, 1, "prismarine_bricks", "bricks"), 
    llIllIIIIIllIlIIIIlI("DARK", 2, 2, "dark_prismarine", "dark");
    
    private static final ai[] IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new ai[] { ai.llllIIIIlIIIlIlllIll, ai.IlIlIlIlIlllllllllIl, ai.llIllIIIIIllIlIIIIlI };
        IlIIIlIlIIIllIlIlIIl = new ai[values().length];
        ai[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final ai ai = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.ai.IlIIIlIlIIIllIlIlIIl[ai.IlIlIlIlIlllllllllIl()] = ai;
        }
    }
    
    private ai(final String s, final int n, final int ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public static ai llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= ai.IlIIIlIlIIIllIlIlIIl.length) {
            n = 0;
        }
        return ai.IlIIIlIlIIIllIlIlIIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
