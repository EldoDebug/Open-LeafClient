package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum dd implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DEAD_BUSH", 0, 0, "dead_bush"), 
    IlIlIlIlIlllllllllIl("GRASS", 1, 1, "tall_grass"), 
    llIllIIIIIllIlIIIIlI("FERN", 2, 2, "fern");
    
    private static final dd[] IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new dd[] { dd.llllIIIIlIIIlIlllIll, dd.IlIlIlIlIlllllllllIl, dd.llIllIIIIIllIlIIIIlI };
        IlIIIlIlIIIllIlIlIIl = new dd[values().length];
        dd[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final dd dd = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.dd.IlIIIlIlIIIllIlIlIIl[dd.IlIlIlIlIlllllllllIl()] = dd;
        }
    }
    
    private dd(final String s, final int n, final int ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    public String toString() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public static dd llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= dd.IlIIIlIlIIIllIlIlIIl.length) {
            n = 0;
        }
        return dd.IlIIIlIlIIIllIlIlIIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
