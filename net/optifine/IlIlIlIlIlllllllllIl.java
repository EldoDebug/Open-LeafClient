package net.optifine;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IlIlIlIlIlllllllllIl
{
    private static net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = null;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().IlIIllIIllIIllIIlIIl().llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI.lllIllIIIllllllIllll());
    }
    
    public static net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
    }
    
    public static llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI() {
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI.lllIllIIIllllllIllll();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(), llIIlIIIlIIIllIlIIIl) && llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll lllIlIIIIIlIlllllIlI = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI;
        return (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI() == lllIlIIIIIlIlllllIlI || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI() == lllIlIIIIIlIlllllIlI || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()).llIllIIIIIllIlIIIIlI() == lllIlIIIIIlIlllllIlI || lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()).llIllIIIIIllIlIIIIlI() == lllIlIIIIIlIlllllIlI) && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll();
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl()) {
            return false;
        }
        if (llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll()) {
            return false;
        }
        if (llllIIIIlIIIlIlllIll instanceof cf) {
            return false;
        }
        if (llllIIIIlIIIlIlllIll instanceof IIlIIIIlllIlllllIlII && (llllIIIIlIIIlIlllIll instanceof lIIlIIIlIllIlIllIIIl || llllIIIIlIIIlIlllIll instanceof lIIllIIIllllIlllIllI || llllIIIIlIIIlIlllIll instanceof d || llllIIIIlIIIlIlllIll instanceof bp || llllIIIIlIIIlIlllIll instanceof dc)) {
            return true;
        }
        if (llllIIIIlIIIlIlllIll instanceof IIlllllIllIllIlIlIII || llllIIIIlIIIlIlllIll instanceof llllIllllIllllIlIlII || llllIIIIlIIIlIlllIll instanceof IlIIIIIlIIllIIlIlIll || llllIIIIlIIIlIlllIll instanceof u || llllIIIIlIIIlIlllIll instanceof bj || llllIIIIlIIIlIlllIll instanceof dl) {
            return true;
        }
        if (llllIIIIlIIIlIlllIll instanceof bf && llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(de.IIIIIIIIIlllIllIlIlI) == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            return true;
        }
        if (llllIIIIlIIIlIlllIll instanceof lIIlllIlllllIIlllIll) {
            final Comparable llllIIIIlIIIlIlllIll2 = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlllIlllllIIlllIll.IIIIIIIIIlllIllIlIlI);
            if (llllIIIIlIIIlIlllIll2 == lIllIIlIlIlllllIIIII.llllIIIlIlllIlIIIIIl || llllIIIIlIIIlIlllIll2 == lIllIIlIlIlllllIIIII.IllIIlllIIIIlllIIlIl) {
                return true;
            }
        }
        return false;
    }
}
