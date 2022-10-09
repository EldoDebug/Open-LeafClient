package net.optifine.lIIIIlIIIIIlllIllIII;

import java.util.*;

public class IIlllIIlIllIllIlIIll
{
    private static final List llllIIIIlIIIlIlllIll;
    private static boolean IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = Collections.synchronizedList(new ArrayList<Object>());
        IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl = false;
    }
    
    protected static void llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (!IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl) {
            IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.add(llllIIIlIlllIlIIIIIl);
        }
        else {
            llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll();
        }
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        if (!IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl) {
            final Iterator<llllIIIlIlllIlIIIIIl> iterator = IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.iterator();
            while (iterator.hasNext()) {
                iterator.next().llllIIIIlIIIlIlllIll();
            }
            IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl = true;
        }
    }
}
