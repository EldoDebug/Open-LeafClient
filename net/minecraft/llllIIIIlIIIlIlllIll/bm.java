package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public enum bm implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("SAND", 0, 0, "sand", "default", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl), 
    IlIlIlIlIlllllllllIl("RED_SAND", 1, 1, "red_sand", "red", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll);
    
    private static final bm[] llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    private final String IlIlIIIllIllIIIIIllI;
    private final llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new bm[] { bm.llllIIIIlIIIlIlllIll, bm.IlIlIlIlIlllllllllIl };
        llIllIIIIIllIlIIIIlI = new bm[values().length];
        bm[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final bm bm = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.bm.llIllIIIIIllIlIIIIlI[bm.IlIlIlIlIlllllllllIl()] = bm;
        }
    }
    
    private bm(final String s, final int n, final int ilIIIlIlIIIllIlIlIIl, final String ilIlIIIllIllIIIIIllI, final String llllIIIlIlllIlIIIIIl, final llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public static bm llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= bm.llIllIIIIIllIlIIIIlI.length) {
            n = 0;
        }
        return bm.llIllIIIIIllIlIIIIlI[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
