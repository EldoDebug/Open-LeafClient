package net.minecraft.lIIIIlIIIIIlllIllIII;

import java.util.*;
import com.google.common.collect.*;

public enum IlIlIlIlIlllllllllIl
{
    llllIIIIlIIIlIlllIll("OPEN_URL", 0, "open_url", true), 
    IlIlIlIlIlllllllllIl("OPEN_FILE", 1, "open_file", false), 
    llIllIIIIIllIlIIIIlI("RUN_COMMAND", 2, "run_command", true), 
    IlIIIlIlIIIllIlIlIIl("TWITCH_USER_INFO", 3, "twitch_user_info", false), 
    IlIlIIIllIllIIIIIllI("SUGGEST_COMMAND", 4, "suggest_command", true), 
    IllIIlllIIIIlllIIlIl("CHANGE_PAGE", 5, "change_page", true);
    
    private static final Map llllIIIlIlllIlIIIIIl;
    private final boolean lIIIIlIIIIIlllIllIII;
    private final String lIIIlllIIIllIIIllIII;
    
    static {
        llIIlIIIlIIIllIlIIIl = new IlIlIlIlIlllllllllIl[] { IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl, IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI, IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl, IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl };
        llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        IlIlIlIlIlllllllllIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = values[i];
            IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.put(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl);
        }
    }
    
    private IlIlIlIlIlllllllllIl(final String s, final int n, final String liiIlllIIIllIIIllIII, final boolean liiiIlIIIIIlllIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public String IlIlIlIlIlllllllllIl() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final String s) {
        return IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl.get(s);
    }
}
