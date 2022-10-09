package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public enum dm implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("NORMAL", 0, 0, "cobblestone", "normal"), 
    IlIlIlIlIlllllllllIl("MOSSY", 1, 1, "mossy_cobblestone", "mossy");
    
    private static final dm[] llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    private final String IlIlIIIllIllIIIIIllI;
    private String IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new dm[] { dm.llllIIIIlIIIlIlllIll, dm.IlIlIlIlIlllllllllIl };
        llIllIIIIIllIlIIIIlI = new dm[values().length];
        dm[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final dm dm = values[i];
            net.minecraft.llllIIIIlIIIlIlllIll.dm.llIllIIIIIllIlIIIIlI[dm.IlIlIlIlIlllllllllIl()] = dm;
        }
    }
    
    private dm(final String s, final int n, final int ilIIIlIlIIIllIlIlIIl, final String ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String toString() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public static dm llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= dm.llIllIIIIIllIlIIIIlI.length) {
            n = 0;
        }
        return dm.llIllIIIIIllIlIIIIlI[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
