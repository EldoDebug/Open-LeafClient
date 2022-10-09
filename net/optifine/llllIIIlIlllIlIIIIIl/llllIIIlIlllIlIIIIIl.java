package net.optifine.llllIIIlIlllIlIIIIIl;

import net.minecraft.client.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.*;
import net.optifine.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class llllIIIlIlllIlIIIIIl
{
    private static Map llllIIIIlIIIlIlllIll;
    private static boolean IlIlIlIlIlllllllllIl;
    private static long llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll = null;
        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl = Boolean.getBoolean("player.models.reload");
        llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI = System.currentTimeMillis();
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final float n, final float n2) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll2 != null) {
            llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, llllIIIIlIIIlIlllIll, n, n2);
        }
    }
    
    public static synchronized IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl && System.currentTimeMillis() > llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI + 5000L) {
            final llIllIIIIIllIlIIIIlI liiiIlIIIIIlllIllIII = Minecraft.getMinecraft().lIIIIlIIIIIlllIllIII;
            if (liiiIlIIIIIlllIllIII != null) {
                llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII.llllIIllllIlIlIIIIll(), null);
                llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI = System.currentTimeMillis();
            }
        }
        final String llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll();
        if (llllIIllllIlIlIIIIll == null) {
            return null;
        }
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll().get(llllIIllllIlIlIIIIll);
        if (ilIIIlIlIIIllIlIlIIl == null) {
            ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl();
            llllIIIIlIIIlIlllIll().put(llllIIllllIlIlIIIIll, ilIIIlIlIIIllIlIlIIl);
            new net.optifine.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(String.valueOf(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll()) + "/users/" + llllIIllllIlIlIIIIll + ".cfg", new net.optifine.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl(llllIIllllIlIlIIIIll)).start();
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public static synchronized void llllIIIIlIIIlIlllIll(final String s, final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        llllIIIIlIIIlIlllIll().put(s, ilIIIlIlIIIllIlIlIIl);
    }
    
    private static Map llllIIIIlIIIlIlllIll() {
        if (llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll == null) {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll = new HashMap();
        }
        return llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;
    }
}
