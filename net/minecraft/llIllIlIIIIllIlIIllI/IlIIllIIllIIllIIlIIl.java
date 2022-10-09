package net.minecraft.llIllIlIIIIllIlIIllI;

import java.util.*;
import com.google.common.collect.*;

public enum IlIIllIIllIIllIIlIIl
{
    llllIIIIlIIIlIlllIll("COD", 0, 0, "cod", 2, 0.1f, 5, 0.6f), 
    IlIlIlIlIlllllllllIl("SALMON", 1, 1, "salmon", 2, 0.1f, 6, 0.8f), 
    llIllIIIIIllIlIIIIlI("CLOWNFISH", 2, 2, "clownfish", 1, 0.1f), 
    IlIIIlIlIIIllIlIlIIl("PUFFERFISH", 3, 3, "pufferfish", 1, 0.1f);
    
    private static final Map IlIlIIIllIllIIIIIllI;
    private final int IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    private final int lIIIIlIIIIIlllIllIII;
    private final float lIIIlllIIIllIIIllIII;
    private final int llIIlIIIlIIIllIlIIIl;
    private final float llIllIlIIIIllIlIIllI;
    private boolean lIlIlIIIllIIllIIIllI;
    
    static {
        IlIlIIIllIIllIlllllI = new IlIIllIIllIIllIIlIIl[] { IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll, IlIIllIIllIIllIIlIIl.IlIlIlIlIlllllllllIl, IlIIllIIllIIllIIlIIl.llIllIIIIIllIlIIIIlI, IlIIllIIllIIllIIlIIl.IlIIIlIlIIIllIlIlIIl };
        IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        IlIIllIIllIIllIIlIIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl = values[i];
            IlIIllIIllIIllIIlIIl.IlIlIIIllIllIIIIIllI.put(ilIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll(), ilIIllIIllIIllIIlIIl);
        }
    }
    
    private IlIIllIIllIIllIIlIIl(final String s, final int n, final int illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl, final float llIllIlIIIIllIlIIllI) {
        this.lIlIlIIIllIIllIIIllI = false;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
        this.lIlIlIIIllIIllIIIllI = true;
    }
    
    private IlIIllIIllIIllIIlIIl(final String s, final int n, final int illIIlllIIIIlllIIlIl, final String llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII, final float liiIlllIIIllIIIllIII) {
        this.lIlIlIIIllIIllIIIllI = false;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = 0;
        this.llIllIlIIIIllIlIIllI = 0.0f;
        this.lIlIlIIIllIIllIIIllI = false;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public float IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public float IllIIlllIIIIlllIIlIl() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public static IlIIllIIllIIllIIlIIl llllIIIIlIIIlIlllIll(final int n) {
        final IlIIllIIllIIllIIlIIl ilIIllIIllIIllIIlIIl = IlIIllIIllIIllIIlIIl.IlIlIIIllIllIIIIIllI.get(n);
        return (ilIIllIIllIIllIIlIIl == null) ? IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll : ilIIllIIllIIllIIlIIl;
    }
    
    public static IlIIllIIllIIllIIlIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof llIIIlIlllIllIIlIllI) ? llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()) : IlIIllIIllIIllIIlIIl.llllIIIIlIIIlIlllIll;
    }
}
