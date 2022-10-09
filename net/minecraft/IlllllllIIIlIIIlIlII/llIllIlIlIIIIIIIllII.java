package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.base.*;
import java.util.*;
import com.google.common.collect.*;

public enum llIllIlIlIIIIIIIllII implements Predicate, lIllIIIIIlllIIlIIllI
{
    llllIIIIlIIIlIlllIll("X", 0, "x", IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll), 
    IlIlIlIlIlllllllllIl("Y", 1, "y", IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl), 
    llIllIIIIIllIlIIIIlI("Z", 2, "z", IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll);
    
    private static final Map IlIIIlIlIIIllIlIlIIl;
    private final String IlIlIIIllIllIIIIIllI;
    private final IllIllIIIIlIIlIlllII IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new llIllIlIlIIIIIIIllII[] { llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll, llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl, llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI };
        IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        llIllIlIlIIIIIIIllII[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final llIllIlIlIIIIIIIllII llIllIlIlIIIIIIIllII = values[i];
            net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl.put(llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl().toLowerCase(), llIllIlIlIIIIIIIllII);
        }
    }
    
    private llIllIlIlIIIIIIIllII(final String s, final int n, final String ilIlIIIllIllIIIIIllI, final IllIllIIIIlIIlIlllII illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public static llIllIlIlIIIIIIIllII llllIIIIlIIIlIlllIll(final String s) {
        return (s == null) ? null : llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl.get(s.toLowerCase());
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.IllIIlllIIIIlllIIlIl == IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl == IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public String toString() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return lllIllIIIllllllIllll != null && lllIllIIIllllllIllll.lIlIlIIIllIIllIIIllI() == this;
    }
    
    public IllIllIIIIlIIlIlllII IlIlIIIllIllIIIIIllI() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
}
