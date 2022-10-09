package net.minecraft.lllIIIIlllllIlIIllIl;

import java.util.*;
import com.google.common.collect.*;

public enum llIllIIIIIllIlIIIIlI
{
    llllIIIIlIIIlIlllIll("INTEGER", 0, "integer"), 
    IlIlIlIlIlllllllllIl("HEARTS", 1, "hearts");
    
    private static final Map llIllIIIIIllIlIIIIlI;
    private final String IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new llIllIIIIIllIlIIIIlI[] { net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll, net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl };
        llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        llIllIIIIIllIlIIIIlI[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = values[i];
            net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.put(llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(), llIllIIIIIllIlIIIIlI2);
        }
    }
    
    private llIllIIIIIllIlIIIIlI(final String s, final int n, final String ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final String s) {
        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.get(s);
        return (llIllIIIIIllIlIIIIlI == null) ? net.minecraft.lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll : llIllIIIIIllIlIIIIlI;
    }
}
