package net.optifine.util;

import java.util.*;

public class IlllIIIIlIIIlIlIlIIl
{
    private static Map llllIIIIlIIIlIlllIll;
    
    static {
        IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll = new HashMap();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final String s, final long n) {
        synchronized (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            final long currentTimeMillis = System.currentTimeMillis();
            Long n2 = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.get(s);
            if (n2 == null) {
                n2 = new Long(currentTimeMillis);
                IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.put(s, n2);
            }
            if (currentTimeMillis < n2 + n) {
                // monitorexit(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll)
                return false;
            }
            IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.put(s, new Long(currentTimeMillis));
            // monitorexit(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll)
            return true;
        }
    }
}
