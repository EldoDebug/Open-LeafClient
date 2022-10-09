package net.optifine.util;

public class IIlllIlIIllIlIlIlIIl
{
    private static long llllIIIIlIIIlIlllIll;
    private static long IlIlIlIlIlllllllllIl;
    private static long llIllIIIIIllIlIIIIlI;
    private static long IlIIIlIlIIIllIlIlIIl;
    private static boolean IlIlIIIllIllIIIIIllI;
    private static int IllIIlllIIIIlllIIlIl;
    private static long llllIIIlIlllIlIIIIIl;
    
    static {
        IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll = System.currentTimeMillis();
        IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl = IllIIlllIIIIlllIIlIl();
        IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI = IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll;
        IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl = IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl;
        IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI = false;
        IIlllIlIIllIlIlIlIIl.IllIIlllIIIIlllIIlIl = 0;
        IIlllIlIIllIlIlIlIIl.llllIIIlIlllIlIIIIIl = 1048576L;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        final long currentTimeMillis = System.currentTimeMillis();
        final long illIIlllIIIIlllIIlIl = IllIIlllIIIIlllIIlIl();
        IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI = (illIIlllIIIIlllIIlIl < IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl);
        if (IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI) {
            final int illIIlllIIIIlllIIlIl2 = (int)((IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl - IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl) / ((IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI - IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll) / 1000.0));
            if (illIIlllIIIIlllIIlIl2 > 0) {
                IIlllIlIIllIlIlIlIIl.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
            }
            IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll = currentTimeMillis;
            IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl = illIIlllIIIIlllIIlIl;
        }
        IIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI = currentTimeMillis;
        IIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl = illIIlllIIIIlllIIlIl;
    }
    
    private static long IllIIlllIIIIlllIIlIl() {
        final Runtime runtime = Runtime.getRuntime();
        return runtime.totalMemory() - runtime.freeMemory();
    }
    
    public static long IlIlIlIlIlllllllllIl() {
        return IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll;
    }
    
    public static long llIllIIIIIllIlIIIIlI() {
        return IIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl / IIlllIlIIllIlIlIlIIl.llllIIIlIlllIlIIIIIl;
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl() {
        return IIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI;
    }
    
    public static long IlIlIIIllIllIIIIIllI() {
        return IIlllIlIIllIlIlIlIIl.IllIIlllIIIIlllIIlIl / IIlllIlIIllIlIlIlIIl.llllIIIlIlllIlIIIIIl;
    }
}
