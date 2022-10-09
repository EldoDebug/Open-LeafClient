package net.optifine.util;

import java.util.*;
import net.minecraft.client.*;

public class lIlIlIIIllIIllIIIllI
{
    private static Map llllIIIIlIIIlIlllIll;
    
    static {
        lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll = new HashMap();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final String s, final int n) {
        synchronized (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll) {
            final int liiiIlIIIIIlllIllIII = Minecraft.getMinecraft().IlIllIlIlIIIlIlIlIII.lIIIIlIIIIIlllIllIII;
            Integer n2 = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.get(s);
            if (n2 == null) {
                n2 = new Integer(liiiIlIIIIIlllIllIII);
                lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.put(s, n2);
            }
            final int intValue = n2;
            if (liiiIlIIIIIlllIllIII > intValue && liiiIlIIIIIlllIllIII < intValue + n) {
                // monitorexit(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll)
                return false;
            }
            lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.put(s, new Integer(liiiIlIIIIIlllIllIII));
            // monitorexit(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll)
            return true;
        }
    }
}
