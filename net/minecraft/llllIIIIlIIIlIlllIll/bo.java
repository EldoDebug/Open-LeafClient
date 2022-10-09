package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum bo implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DEFAULT", 0, 0, "sandstone", "default"), 
    IlIlIlIlIlllllllllIl("CHISELED", 1, 1, "chiseled_sandstone", "chiseled"), 
    llIllIIIIIllIlIIIIlI("SMOOTH", 2, 2, "smooth_sandstone", "smooth");
    
    private static final bo[] IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new bo[] { bo.llllIIIIlIIIlIlllIll, bo.IlIlIlIlIlllllllllIl, bo.llIllIIIIIllIlIIIIlI };
        IlIIIlIlIIIllIlIlIIl = new bo[values().length];
        bo[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final bo bo = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.bo.IlIIIlIlIIIllIlIlIIl[bo.IlIlIlIlIlllllllllIl()] = bo;
        }
    }
    
    private bo(final String s, final int n, final int ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl) {
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
    
    public static bo llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= bo.IlIIIlIlIIIllIlIlIIl.length) {
            n = 0;
        }
        return bo.IlIIIlIlIIIllIlIlIIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
