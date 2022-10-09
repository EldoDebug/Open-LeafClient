package net.optifine.util;

import java.util.*;

public class llllIIllllIlIlIIIIll
{
    private static Deque llllIIIIlIIIlIlllIll;
    
    static {
        llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll = new ArrayDeque();
        for (int i = 0; i < 1000; ++i) {
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.add(new IlIllIlIlIIIlIlIlIII());
        }
    }
    
    public static Iterator llllIIIIlIIIlIlllIll(final List list) {
        synchronized (llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll) {
            IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.pollFirst();
            if (illlIIlIllIllIlIIll == null) {
                illlIIlIllIllIlIIll = new IlIllIlIlIIIlIlIlIII();
            }
            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(list);
            // monitorexit(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll)
            return illlIIlIllIllIlIIll;
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        synchronized (llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll) {
            if (llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.size() <= 1000) {
                illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(null);
                llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.addLast(illlIIlIllIllIlIIll);
            }
        }
        // monitorexit(llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll)
    }
}
