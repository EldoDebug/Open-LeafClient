package net.minecraft.lIIIIlIIIIIlllIllIII;

import java.util.*;
import com.google.common.collect.*;

public enum IlIIIlIlIIIllIlIlIIl
{
    llllIIIIlIIIlIlllIll("SHOW_TEXT", 0, "show_text", true), 
    IlIlIlIlIlllllllllIl("SHOW_ACHIEVEMENT", 1, "show_achievement", true), 
    llIllIIIIIllIlIIIIlI("SHOW_ITEM", 2, "show_item", true), 
    IlIIIlIlIIIllIlIlIIl("SHOW_ENTITY", 3, "show_entity", true);
    
    private static final Map IlIlIIIllIllIIIIIllI;
    private final boolean IllIIlllIIIIlllIIlIl;
    private final String llllIIIlIlllIlIIIIIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new IlIIIlIlIIIllIlIlIIl[] { IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll, IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl, IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI, IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl };
        IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        IlIIIlIlIIIllIlIlIIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = values[i];
            IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.put(ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    private IlIIIlIlIIIllIlIlIIl(final String s, final int n, final String llllIIIlIlllIlIIIIIl, final boolean illIIlllIIIIlllIIlIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s) {
        return IlIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI.get(s);
    }
}
