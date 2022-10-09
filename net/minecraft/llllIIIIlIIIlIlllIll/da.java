package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public enum da implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("RED_SANDSTONE", 0, 0, "red_sandstone", bm.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
    
    private static final da[] IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final String IlIIIlIlIIIllIlIlIIl;
    private final llllIIIIlIIIlIlllIll IlIlIIIllIllIIIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = new da[] { da.llllIIIIlIIIlIlllIll };
        IlIlIlIlIlllllllllIl = new da[values().length];
        da[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final da da = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.da.IlIlIlIlIlllllllllIl[da.IlIlIlIlIlllllllllIl()] = da;
        }
    }
    
    private da(final String s, final int n, final int llIllIIIIIllIlIIIIlI, final String ilIIIlIlIIIllIlIlIIl, final llllIIIIlIIIlIlllIll ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public static da llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= da.IlIlIlIlIlllllllllIl.length) {
            n = 0;
        }
        return da.IlIlIlIlIlllllllllIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
