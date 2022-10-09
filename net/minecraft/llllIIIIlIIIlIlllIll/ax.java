package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum ax implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DEFAULT", 0, 0, "red_sandstone", "default"), 
    IlIlIlIlIlllllllllIl("CHISELED", 1, 1, "chiseled_red_sandstone", "chiseled"), 
    llIllIIIIIllIlIIIIlI("SMOOTH", 2, 2, "smooth_red_sandstone", "smooth");
    
    private static final ax[] IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new ax[] { ax.llllIIIIlIIIlIlllIll, ax.IlIlIlIlIlllllllllIl, ax.llIllIIIIIllIlIIIIlI };
        IlIIIlIlIIIllIlIlIIl = new ax[values().length];
        ax[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final ax ax = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.ax.IlIIIlIlIIIllIlIlIIl[ax.IlIlIlIlIlllllllllIl()] = ax;
        }
    }
    
    private ax(final String s, final int n, final int ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl) {
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
    
    public static ax llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= ax.IlIIIlIlIIIllIlIlIIl.length) {
            n = 0;
        }
        return ax.IlIIIlIlIIIllIlIlIIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
