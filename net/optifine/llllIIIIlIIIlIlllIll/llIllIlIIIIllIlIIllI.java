package net.optifine.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;

public class llIllIlIIIIllIlIIllI
{
    public static boolean llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIlIIIlIIIllIlIIIl[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i].llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final llIIlIIIlIIIllIlIIIl[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i].llllIIIIlIIIlIlllIll(n, n2)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n, final llIIlIIIlIIIllIlIIIl[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i].llllIIIIlIIIlIlllIll() == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n, final int[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final IlIlIIIllIIllIlllllI[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == ilIlIIIllIIllIlllllI) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] array) {
        if (array == null) {
            return true;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == llIIlIIIlIIIllIlIIIl) {
                return true;
            }
        }
        return false;
    }
}
