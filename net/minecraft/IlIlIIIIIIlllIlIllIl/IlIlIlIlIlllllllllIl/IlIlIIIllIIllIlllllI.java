package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import java.io.*;
import org.apache.logging.log4j.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.*;
import com.google.common.base.*;
import com.mojang.authlib.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class IlIlIIIllIIllIlllllI
{
    private static final Logger IlIlIIIllIllIIIIIllI;
    public static final File llllIIIIlIIIlIlllIll;
    public static final File IlIlIlIlIlllllllllIl;
    public static final File llIllIIIIIllIlIIIIlI;
    public static final File IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIlIIIllIllIIIIIllI = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new File("banned-ips.txt");
        IlIlIlIlIlllllllllIl = new File("banned-players.txt");
        llIllIIIIIllIlIIIIlI = new File("ops.txt");
        IlIIIlIlIIIllIlIlIIl = new File("white-list.txt");
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final Collection collection, final ProfileLookupCallback profileLookupCallback) {
        final String[] array = (String[])Iterators.toArray((Iterator)Iterators.filter((Iterator)collection.iterator(), (Predicate)new IIIIlllIIIIIIlIIIlll()), (Class)String.class);
        if (llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl()) {
            llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll().findProfilesByNames(array, Agent.MINECRAFT, profileLookupCallback);
        }
        else {
            String[] array2;
            for (int length = (array2 = array).length, i = 0; i < length; ++i) {
                final String s = array2[i];
                profileLookupCallback.onProfileLookupSucceeded(new GameProfile(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new GameProfile((UUID)null, s)), s));
            }
        }
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        if (lIIlIIIIIIIlIIlIlIIl.IlIlIlIlIlllllllllIl(s) || s.length() > 16) {
            return s;
        }
        final llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        final GameProfile llllIIIIlIIIlIlllIll = iiiiIllIIIIlIIIIllIl.lIIIIIlIlIIIlIIIIlIl().llllIIIIlIIIlIlllIll(s);
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.getId() != null) {
            return llllIIIIlIIIlIlllIll.getId().toString();
        }
        if (!iiiiIllIIIIlIIIIllIl.llIllIlIlIIIIIIIllII() && iiiiIllIIIIlIIIIllIl.lIlIlIlllIIlIlIlllIl()) {
            final ArrayList arrayList = Lists.newArrayList();
            llllIIIIlIIIlIlllIll(iiiiIllIIIIlIIIIllIl, Lists.newArrayList((Object[])new String[] { s }), (ProfileLookupCallback)new llllIIllllIlIlIIIIll(iiiiIllIIIIlIIIIllIl, arrayList));
            return (arrayList.size() > 0 && ((GameProfile)arrayList.get(0)).getId() != null) ? ((GameProfile)arrayList.get(0)).getId().toString() : "";
        }
        return net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new GameProfile((UUID)null, s)).toString();
    }
}
