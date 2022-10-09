package net.minecraft.lllIIIIlllllIlIIllIl;

import java.util.*;
import com.google.common.collect.*;

public enum IIIIlllIIIIIIlIIIlll
{
    llllIIIIlIIIlIlllIll("ALWAYS", 0, "always", 0), 
    IlIlIlIlIlllllllllIl("NEVER", 1, "never", 1), 
    llIllIIIIIllIlIIIIlI("HIDE_FOR_OTHER_TEAMS", 2, "hideForOtherTeams", 2), 
    IlIIIlIlIIIllIlIlIIl("HIDE_FOR_OWN_TEAM", 3, "hideForOwnTeam", 3);
    
    private static Map llllIIIlIlllIlIIIIIl;
    public final String IlIlIIIllIllIIIIIllI;
    public final int IllIIlllIIIIlllIIlIl;
    
    static {
        lIIIIlIIIIIlllIllIII = new IIIIlllIIIIIIlIIIlll[] { IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll, IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl, IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI, IIIIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl };
        IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        IIIIlllIIIIIIlIIIlll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = values[i];
            IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl.put(iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI, iiiIlllIIIIIIlIIIlll);
        }
    }
    
    public static String[] llllIIIIlIIIlIlllIll() {
        return (String[])IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl.keySet().toArray(new String[IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl.size()]);
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final String s) {
        return IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl.get(s);
    }
    
    private IIIIlllIIIIIIlIIIlll(final String s, final int n, final String ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
