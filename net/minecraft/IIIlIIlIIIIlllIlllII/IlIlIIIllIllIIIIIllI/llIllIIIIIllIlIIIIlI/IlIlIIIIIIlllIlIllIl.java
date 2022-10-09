package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import java.util.*;
import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIlIIIIIIlllIlIllIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static Map IlIlIlIlIlllllllllIl;
    private static Map llIllIIIIIllIlIIIIlI;
    private static Map IlIIIlIlIIIllIlIlIIl;
    private static Map IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII.class, "Mineshaft");
        IlIlIlIlIlllllllllIl(IIIlIIIlIlIIlllIIlll.class, "Village");
        IlIlIlIlIlllllllllIl(lIIIlllIIIllIIIllIII.class, "Fortress");
        IlIlIlIlIlllllllllIl(IlIlIIIllIIllIlllllI.class, "Stronghold");
        IlIlIlIlIlllllllllIl(llIllIlIIIIllIlIIllI.class, "Temple");
        IlIlIlIlIlllllllllIl(lIIlIIIlIllIlIllIIIl.class, "Monument");
        IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll();
        IlIllIIllIIlIIIIlIIl.llllIIIIlIIIlIlllIll();
        llIIlllIIlllIIllIllI.llllIIIIlIIIlIlllIll();
        IllllIIlIlIllIIIllII.llllIIIIlIIIlIlllIll();
        net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        IIlIIIlllIllIllIlIII.llllIIIIlIIIlIlllIll();
    }
    
    private static void IlIlIlIlIlllllllllIl(final Class clazz, final String s) {
        IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.put(s, clazz);
        IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.put(clazz, s);
    }
    
    static void llllIIIIlIIIlIlllIll(final Class clazz, final String s) {
        IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl.put(s, clazz);
        IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI.put(clazz, s);
    }
    
    public static String llllIIIIlIIIlIlllIll(final IlIIIIIlIIllIIlIlIll ilIIIIIlIIllIIlIlIll) {
        return IlIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI.get(ilIIIIIlIIllIIlIlIll.getClass());
    }
    
    public static String llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI.get(illlllllIIIlIIIlIlII.getClass());
    }
    
    public static IlIIIIIlIIllIIlIlIll llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        IlIIIIIlIIllIIlIlIll ilIIIIIlIIllIIlIlIll = null;
        try {
            final Class<IlIIIIIlIIllIIlIlIll> clazz = IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.get(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
            if (clazz != null) {
                ilIIIIIlIIllIIlIlIll = clazz.newInstance();
            }
        }
        catch (Exception ex) {
            IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.warn("Failed Start with id " + iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
            ex.printStackTrace();
        }
        if (ilIIIIIlIIllIIlIlIll != null) {
            ilIIIIIlIIllIIlIlIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, iiiIlllIIIIIIlIIIlll);
        }
        else {
            IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.warn("Skipping Structure with id " + iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
        }
        return ilIIIIIlIIllIIlIlIll;
    }
    
    public static IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII2 = null;
        try {
            final Class<IlllllllIIIlIIIlIlII> clazz = IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl.get(iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
            if (clazz != null) {
                illlllllIIIlIIIlIlII2 = clazz.newInstance();
            }
        }
        catch (Exception ex) {
            IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.warn("Failed Piece with id " + iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
            ex.printStackTrace();
        }
        if (illlllllIIIlIIIlIlII2 != null) {
            illlllllIIIlIIIlIlII2.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, iiiIlllIIIIIIlIIIlll);
        }
        else {
            IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.warn("Skipping Piece with id " + iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl("id"));
        }
        return illlllllIIIlIIIlIlII2;
    }
}
