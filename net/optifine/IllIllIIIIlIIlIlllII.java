package net.optifine;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IllIllIIIIlIIlIlllII
{
    private static boolean llllIIIIlIIIlIlllIll;
    private static long IlIlIlIlIlllllllllIl;
    private static int llIllIIIIIllIlIIIIlI;
    private static int IlIIIlIlIIIllIlIlIIl;
    private static boolean IlIlIIIllIllIIIIIllI;
    private static boolean IllIIlllIIIIlllIIlIl;
    private static final long llllIIIlIlllIlIIIIIl = 3000L;
    private static final int lIIIIlIIIIIlllIllIII = 10;
    
    static {
        IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll = false;
        IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl = -1L;
        IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = 0;
        IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = 0;
        IllIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = false;
        IllIllIIIIlIIlIlllII.IllIIlllIIIIlllIIlIl = false;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll = true;
        if (IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl < 0L) {
            IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl = System.currentTimeMillis();
        }
        if (System.currentTimeMillis() > IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl + 3000L) {
            if (IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl > 0) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl("Suppressed " + IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI + " OpenGL errors");
            }
            IllIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI = (IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI > 10);
            IllIllIIIIlIIlIlllII.IlIlIlIlIlllllllllIl = System.currentTimeMillis();
            IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI = 0;
            IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl = 0;
            IllIllIIIIlIIlIlllII.IllIIlllIIIIlllIIlIl = true;
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n) {
        if (!IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            return true;
        }
        ++IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI;
        if (IllIllIIIIlIIlIlllII.IllIIlllIIIIlllIIlIl) {
            IllIllIIIIlIIlIlllII.IllIIlllIIIIlllIIlIl = false;
            return true;
        }
        if (IllIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI) {
            ++IllIllIIIIlIIlIlllII.IlIIIlIlIIIllIlIlIIl;
        }
        return !IllIllIIIIlIIlIlllII.IlIlIIIllIllIIIIIllI;
    }
}
