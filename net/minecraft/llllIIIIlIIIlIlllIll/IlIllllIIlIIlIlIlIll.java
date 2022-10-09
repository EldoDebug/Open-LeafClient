package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;

public enum IlIllllIIlIIlIlIlIll implements lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("DIRT", 0, 0, "dirt", "default", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI), 
    IlIlIlIlIlllllllllIl("COARSE_DIRT", 1, 1, "coarse_dirt", "coarse", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI), 
    llIllIIIIIllIlIIIIlI("PODZOL", 2, 2, "podzol", net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI);
    
    private static final IlIllllIIlIIlIlIlIll[] IlIIIlIlIIIllIlIlIIl;
    private final int IlIlIIIllIllIIIIIllI;
    private final String IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    private final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    
    static {
        lIIIlllIIIllIIIllIII = new IlIllllIIlIIlIlIlIll[] { IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll, IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl, IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI };
        IlIIIlIlIIIllIlIlIIl = new IlIllllIIlIIlIlIlIll[values().length];
        IlIllllIIlIIlIlIlIll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll = values[i];
            IlIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl[ilIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl()] = ilIllllIIlIIlIlIlIll;
        }
    }
    
    private IlIllllIIlIIlIlIlIll(final String s, final int n, final int n2, final String s2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this(s, n, n2, s2, s2, llllIIIIlIIIlIlllIll);
    }
    
    private IlIllllIIlIIlIlIlIll(final String s, final int n, final int ilIlIIIllIllIIIIIllI, final String illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl, final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    @Override
    public String toString() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public static IlIllllIIlIIlIlIlIll llllIIIIlIIIlIlllIll(int n) {
        if (n < 0 || n >= IlIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl.length) {
            n = 0;
        }
        return IlIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl[n];
    }
    
    @Override
    public String llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
}
