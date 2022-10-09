package net.optifine.shaders;

import net.optifine.shaders.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class lIllllllIIllIlIlIlII
{
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final String s, final IIIIlllIIIIIIlIIIlll[] array) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = array[i];
            if (iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll().equals(s)) {
                return iiiIlllIIIIIIlIIIlll;
            }
        }
        return null;
    }
    
    public static IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII[] array, final IIIIlllIIIIIIlIIIlll[] array2, final boolean b) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length; ++i) {
            final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = array[i];
            if (llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, array2, b)) {
                return ilIlIllllllllIIIIlII;
            }
        }
        return null;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final IIIIlllIIIIIIlIIIlll[] array, final boolean b) {
        if (ilIlIllllllllIIIIlII == null) {
            return false;
        }
        if (array == null) {
            return false;
        }
        final String[] ilIlIlIlIlllllllllIl = ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl();
        for (int i = 0; i < ilIlIlIlIlllllllllIl.length; ++i) {
            final String s = ilIlIlIlIlllllllllIl[i];
            final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s, array);
            if (llllIIIIlIIIlIlllIll != null && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(b ? llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI() : llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), (Object)ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(s))) {
                return false;
            }
        }
        return true;
    }
}
