package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;
import com.google.common.collect.*;

public enum IlIllIIllIIlIIIIlIIl
{
    llllIIIIlIIIlIlllIll("LEGACY", 0, "legacy"), 
    IlIlIlIlIlllllllllIl("MOJANG", 1, "mojang");
    
    private static final Map llIllIIIIIllIlIIIIlI;
    private final String IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = new IlIllIIllIIlIIIIlIIl[] { IlIllIIllIIlIIIIlIIl.llllIIIIlIIIlIlllIll, IlIllIIllIIlIIIIlIIl.IlIlIlIlIlllllllllIl };
        llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        IlIllIIllIIlIIIIlIIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlIllIIllIIlIIIIlIIl ilIllIIllIIlIIIIlIIl = values[i];
            IlIllIIllIIlIIIIlIIl.llIllIIIIIllIlIIIIlI.put(ilIllIIllIIlIIIIlIIl.IlIIIlIlIIIllIlIlIIl, ilIllIIllIIlIIIIlIIl);
        }
    }
    
    private IlIllIIllIIlIIIIlIIl(final String s, final int n, final String ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public static IlIllIIllIIlIIIIlIIl llllIIIIlIIIlIlllIll(final String s) {
        return IlIllIIllIIlIIIIlIIl.llIllIIIIIllIlIIIIlI.get(s.toLowerCase());
    }
}
