package net.optifine.shaders.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.optifine.util.*;

public class IIlllIIlIllIllIlIIll
{
    private static Map llllIIIIlIIIlIlllIll;
    private static lIIIIlIIIIIlllIllIII IlIlIlIlIlllllllllIl;
    
    static {
        IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll = new HashMap();
        IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl = new lIIIIlIIIIIlllIllIII(1);
    }
    
    public static float llllIIIIlIIIlIlllIll(final int n, final float n2, final float n3, final float n4) {
        synchronized (IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll) {
            final Integer value = n;
            llllllIllIllIlIllllI llllllIllIllIlIllllI = IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.get(value);
            if (llllllIllIllIlIllllI == null) {
                llllllIllIllIlIllllI = new llllllIllIllIlIllllI(n2, n3, n4);
                IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.put(value, llllllIllIllIlIllllI);
            }
            // monitorexit(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll)
            return llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(n2, n3, n4);
        }
    }
    
    public static int llllIIIIlIIIlIlllIll() {
        synchronized (IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl) {
            // monitorexit(IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl)
            return IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        }
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        synchronized (IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll) {
            IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.clear();
        }
        // monitorexit(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll)
    }
}
