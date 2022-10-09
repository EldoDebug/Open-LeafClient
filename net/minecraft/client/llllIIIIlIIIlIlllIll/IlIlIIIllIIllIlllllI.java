package net.minecraft.client.llllIIIIlIIIlIlllIll;

import java.util.*;
import com.google.common.collect.*;

public enum IlIlIIIllIIllIlllllI
{
    llllIIIIlIIIlIlllIll("MASTER", 0, "master", 0), 
    IlIlIlIlIlllllllllIl("MUSIC", 1, "music", 1), 
    llIllIIIIIllIlIIIIlI("RECORDS", 2, "record", 2), 
    IlIIIlIlIIIllIlIlIIl("WEATHER", 3, "weather", 3), 
    IlIlIIIllIllIIIIIllI("BLOCKS", 4, "block", 4), 
    IllIIlllIIIIlllIIlIl("MOBS", 5, "hostile", 5), 
    llllIIIlIlllIlIIIIIl("ANIMALS", 6, "neutral", 6), 
    lIIIIlIIIIIlllIllIII("PLAYERS", 7, "player", 7), 
    lIIIlllIIIllIIIllIII("AMBIENT", 8, "ambient", 8);
    
    private static final Map llIIlIIIlIIIllIlIIIl;
    private static final Map llIllIlIIIIllIlIIllI;
    private final String lIlIlIIIllIIllIIIllI;
    private final int IlIlIIIllIIllIlllllI;
    
    static {
        IIIIlllIIIIIIlIIIlll = new IlIlIIIllIIllIlllllI[] { IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll, IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl, IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI, IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl, IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI, IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl, IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl, IlIlIIIllIIllIlllllI.lIIIIlIIIIIlllIllIII, IlIlIIIllIIllIlllllI.lIIIlllIIIllIIIllIII };
        llIIlIIIlIIIllIlIIIl = Maps.newHashMap();
        llIllIlIIIIllIlIIllI = Maps.newHashMap();
        IlIlIIIllIIllIlllllI[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI = values[i];
            if (IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.containsKey(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll()) || IlIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI.containsKey(ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl())) {
                throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + ilIlIIIllIIllIlllllI);
            }
            IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.put(ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(), ilIlIIIllIIllIlllllI);
            IlIlIIIllIIllIlllllI.llIllIlIIIIllIlIIllI.put(ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), ilIlIIIllIIllIlllllI);
        }
    }
    
    private IlIlIIIllIIllIlllllI(final String s, final int n, final String lIlIlIIIllIIllIIIllI, final int ilIlIIIllIIllIlllllI) {
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.IlIlIIIllIIllIlllllI = ilIlIIIllIIllIlllllI;
    }
    
    public String llllIIIIlIIIlIlllIll() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final String s) {
        return IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl.get(s);
    }
}
