package net.optifine.util;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class IIllllIIIlIIIIIIllIl
{
    public static String llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
    }
    
    public static String llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof IlIllIlIlIIIlIlIlIII)) {
            return null;
        }
        final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (IlIllIlIlIIIlIlIlIII)ilIIIlIlIIIllIlIlIIl;
        IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        return ilIllIlIlIIIlIlIlIII.w_() ? ilIllIlIlIIIlIlIlIII.s_() : null;
    }
    
    public static void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI();
        if (llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl) == null) {
            llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI)));
        }
    }
    
    public static String llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        return (llllIIIIlIIIlIlllIll == null) ? null : llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll);
    }
    
    public static String llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl instanceof llIIlIIIlIIIllIlIIIl) {
            return (String)lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.cy);
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.lIlIlIIIllIIllIIIllI) {
            return (String)lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.cA);
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof IIllIIllIIIlIlIIIIlI) {
            return (String)lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.cF);
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof IIlIIIIlllIlllllIlII) {
            return (String)lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.cL);
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof IlIllIlIlIIIlIlIlIII) {
            final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (IlIllIlIlIIIlIlIlIII)ilIIIlIlIIIllIlIlIIl;
            if (ilIllIlIlIIIlIlIlIII.w_()) {
                return ilIllIlIlIIIlIlIlIII.s_();
            }
        }
        return null;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final String s) {
        if (ilIIIlIlIIIllIlIlIIl instanceof llIIlIIIlIIIllIlIIIl) {
            return lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.cy, s);
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof net.minecraft.IlIlIIIlIIlIlIIlllIl.lIlIlIIIllIIllIIIllI) {
            return lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.cA, s);
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof IIllIIllIIIlIlIIIIlI) {
            return lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.cF, s);
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof IIlIIIIlllIlllllIlII) {
            return lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, lIIIIlIIIIIlllIllIII.cL, s);
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof IlIlIIIllIIllIlllllI) {
            ((IlIlIIIllIIllIlllllI)ilIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(s);
            return true;
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof lllIIIIlllllIlIIllIl) {
            ((lllIIIIlllllIlIIllIl)ilIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(s);
            return true;
        }
        if (ilIIIlIlIIIllIlIlIIl instanceof IIIlIIlIIIIlllIlllII) {
            ((IIIlIIlIIIIlllIlllII)ilIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(s);
            return true;
        }
        return false;
    }
}
