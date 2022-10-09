package net.optifine;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import java.util.*;

public class llIllIlIIIIllIlIIllI
{
    private static final int llllIIIIlIIIlIlllIll = 0;
    private static final int IlIlIlIlIlllllllllIl = 1;
    private static final int llIllIIIIIllIlIIIIlI = 2;
    private static final int IlIIIlIlIIIllIlIlIIl = 3;
    private static final int IlIlIIIllIllIIIIIllI = 4;
    private static volatile /* synthetic */ int[] IllIIlllIIIIlllIIlIl;
    
    public static llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final int n, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII, final int n2, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (liiIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll != null && n >= 0 && n < liiIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll.length) {
            final int n3 = liiIlllIIIllIIIllIII.IIIIlllIIIIIIlIIIlll[n];
            if (n3 >= 0 && n3 <= liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII.length) {
                return llllIIIIlIIIlIlllIll(n3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
        }
        switch (n) {
            case 1: {
                return llllIIIIlIIIlIlllIll(0, 3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 2: {
                return llllIIIIlIIIlIlllIll(3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 3: {
                return llllIIIIlIIIlIlllIll(3, 0, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 4: {
                return llllIIIIlIIIlIlllIll(0, 3, 2, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 5: {
                return llllIIIIlIIIlIlllIll(3, 0, 4, 2, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 6: {
                return llllIIIIlIIIlIlllIll(2, 4, 2, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 7: {
                return llllIIIIlIIIlIlllIll(3, 3, 4, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 8: {
                return llllIIIIlIIIlIlllIll(4, 1, 4, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 9: {
                return llllIIIIlIIIlIlllIll(4, 4, 4, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 10: {
                return llllIIIIlIIIlIlllIll(1, 4, 1, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 11: {
                return llllIIIIlIIIlIlllIll(1, 1, 4, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 12: {
                return IlIlIlIlIlllllllllIl(0, 2, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 13: {
                return llllIIIIlIIIlIlllIll(0, 3, 2, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 14: {
                return IlIlIlIlIlllllllllIl(3, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 15: {
                return llllIIIIlIIIlIlllIll(3, 0, 1, 2, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 16: {
                return llllIIIIlIIIlIlllIll(2, 4, 0, 3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 17: {
                return llllIIIIlIIIlIlllIll(4, 2, 3, 0, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 18: {
                return llllIIIIlIIIlIlllIll(4, 4, 3, 3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 19: {
                return llllIIIIlIIIlIlllIll(4, 2, 4, 2, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 20: {
                return llllIIIIlIIIlIlllIll(1, 4, 4, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 21: {
                return llllIIIIlIIIlIlllIll(4, 4, 1, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 22: {
                return llllIIIIlIIIlIlllIll(4, 4, 1, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 23: {
                return llllIIIIlIIIlIlllIll(4, 1, 4, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 24: {
                return llllIIIIlIIIlIlllIll(2, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 25: {
                return llllIIIIlIIIlIlllIll(2, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 26: {
                return llllIIIIlIIIlIlllIll(1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 27: {
                return llllIIIIlIIIlIlllIll(1, 2, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 28: {
                return llllIIIIlIIIlIlllIll(2, 4, 2, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 29: {
                return llllIIIIlIIIlIlllIll(3, 3, 1, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 30: {
                return llllIIIIlIIIlIlllIll(2, 1, 2, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 31: {
                return llllIIIIlIIIlIlllIll(3, 3, 4, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 32: {
                return llllIIIIlIIIlIlllIll(1, 1, 1, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 33: {
                return llllIIIIlIIIlIlllIll(1, 1, 4, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 34: {
                return llllIIIIlIIIlIlllIll(4, 1, 1, 4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 35: {
                return llllIIIIlIIIlIlllIll(1, 4, 4, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 36: {
                return IlIlIlIlIlllllllllIl(2, 0, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 37: {
                return llllIIIIlIIIlIlllIll(2, 1, 0, 3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 38: {
                return IlIlIlIlIlllllllllIl(1, 3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 39: {
                return llllIIIIlIIIlIlllIll(1, 2, 3, 0, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 40: {
                return llllIIIIlIIIlIlllIll(4, 1, 3, 3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 41: {
                return llllIIIIlIIIlIlllIll(1, 2, 4, 2, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 42: {
                return llllIIIIlIIIlIlllIll(1, 4, 3, 3, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 43: {
                return llllIIIIlIIIlIlllIll(4, 2, 1, 2, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 44: {
                return llllIIIIlIIIlIlllIll(1, 4, 1, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 45: {
                return llllIIIIlIIIlIlllIll(4, 1, 1, 1, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, n2, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 46: {
                return llllIIIIlIIIlIlllIll(4, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            default: {
                return llllIIIIlIIIlIlllIll(0, liiIlllIIIllIIIllIII.IIIlIIlIIIIlllIlllII, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
        }
    }
    
    private static llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final int n, final int n2, final IlIlIIIllIIllIlllllI[] array, final int n3, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl, n, lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, n2, array, n3, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
    }
    
    private static llllIIIIlIIIlIlllIll[] IlIlIlIlIlllllllllIl(final int n, final int n2, final IlIlIIIllIIllIlllllI[] array, final int n3, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll, n, lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI, n2, array, n3, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
    }
    
    private static llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final IlIlIIIllIIllIlllllI[] array, final int n5, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return (n == n2) ? ((n3 == n4) ? llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll, n, lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI, n3, array, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl) : llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll, n, lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl, n3, lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl, n4, array, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl)) : ((n3 == n4) ? llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII, n, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl, n2, lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI, n3, array, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl) : ((n == n3) ? ((n2 == n4) ? llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl, n, lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, n2, array, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl) : llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl, n, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl, n2, lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl, n4, array, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl)) : ((n2 == n4) ? llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII, n, lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl, n3, lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, n2, array, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl) : llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII, n, lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl, n2, lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl, n3, lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl, n4, array, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl))));
    }
    
    private static llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final int n, final IlIlIIIllIIllIlllllI[] array, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(array[n], llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
    }
    
    private static llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2, final int n2, final IlIlIIIllIIllIlllllI[] array, final int n3, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(array[n], lIlIlIIIllIIllIIIllI, n3, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl), llllIIIIlIIIlIlllIll(array[n2], lIlIlIIIllIIllIIIllI2, n3, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl));
    }
    
    private static llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2, final int n2, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI3, final int n3, final IlIlIIIllIIllIlllllI[] array, final int n4, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(array[n], lIlIlIIIllIIllIIIllI, n4, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl), llllIIIIlIIIlIlllIll(array[n2], lIlIlIIIllIIllIIIllI2, n4, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl), llllIIIIlIIIlIlllIll(array[n3], lIlIlIIIllIIllIIIllI3, n4, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl));
    }
    
    private static llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2, final int n2, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI3, final int n3, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI4, final int n4, final IlIlIIIllIIllIlllllI[] array, final int n5, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(array[n], lIlIlIIIllIIllIIIllI, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl), llllIIIIlIIIlIlllIll(array[n2], lIlIlIIIllIIllIIIllI2, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl), llllIIIIlIIIlIlllIll(array[n3], lIlIlIIIllIIllIIIllI3, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl), llllIIIIlIIIlIlllIll(array[n4], lIlIlIIIllIIllIIIllI4, n5, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl));
    }
    
    private static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        switch (llllIIIIlIIIlIlllIll()[lIlIlIIIllIIllIIIllI.ordinal()]) {
            case 1: {
                return llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI, 0, 0, 16, 8, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 2: {
                return llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI, 8, 0, 16, 8, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 3: {
                return llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI, 8, 0, 16, 16, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 4: {
                return llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI, 8, 8, 16, 16, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 5: {
                return llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI, 0, 8, 16, 16, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 6: {
                return llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI, 0, 8, 8, 16, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 7: {
                return llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI, 0, 0, 8, 16, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            case 8: {
                return llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, lIlIlIIIllIIllIIIllI, 0, 0, 8, 8, n, llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl);
            }
            default: {
                return llllIIIIlIIIlIlllIll;
            }
        }
    }
    
    private static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n, final int n2, final int n3, final int n4, final int n5, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        final Map[][] llllIIIIlIIIlIlllIll2 = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll2 == null) {
            return llllIIIIlIIIlIlllIll;
        }
        final int iiiIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
        if (iiiIlllIIIIIIlIIIlll >= 0 && iiiIlllIIIIIIlIIIlll < llllIIIIlIIIlIlllIll2.length) {
            Map[] array = llllIIIIlIIIlIlllIll2[iiiIlllIIIIIIlIIIlll];
            if (array == null) {
                array = new Map[lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII.length];
                llllIIIIlIIIlIlllIll2[iiiIlllIIIIIIlIIIlll] = array;
            }
            Map<llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll> map = (Map<llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll>)array[lIlIlIIIllIIllIIIllI.ordinal()];
            if (map == null) {
                map = new IdentityHashMap<llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll>(1);
                array[lIlIlIIIllIIllIIIllI.ordinal()] = map;
            }
            llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = map.get(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll3 == null) {
                llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIIIllIIllIlllllI, n5, n, n2, n3, n4);
                map.put(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll3);
            }
            return llllIIIIlIIIlIlllIll3;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final int n, final int n2, final int n3, final int n4, final int n5) {
        final int[] array = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().clone();
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < 4; ++i) {
            llllIIIIlIIIlIlllIll(array, i, llllIIIIlIIIlIlllIll2, ilIlIIIllIIllIlllllI, n, n2, n3, n4, n5);
        }
        return new llllIIIIlIIIlIlllIll(array, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(), ilIlIIIllIIllIlllllI);
    }
    
    private static void llllIIIIlIIIlIlllIll(final int[] array, final int n, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI2, final int n2, final int n3, final int n4, final int n5, final int n6) {
        final int n7 = array.length / 4 * n;
        final float intBitsToFloat = Float.intBitsToFloat(array[n7 + 4]);
        final float intBitsToFloat2 = Float.intBitsToFloat(array[n7 + 4 + 1]);
        double llllIIIIlIIIlIlllIll = ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(intBitsToFloat);
        double ilIlIlIlIlllllllllIl = ilIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(intBitsToFloat2);
        float intBitsToFloat3 = Float.intBitsToFloat(array[n7 + 0]);
        float intBitsToFloat4 = Float.intBitsToFloat(array[n7 + 1]);
        float intBitsToFloat5 = Float.intBitsToFloat(array[n7 + 2]);
        float n8 = 0.0f;
        float n9 = 0.0f;
        switch (n2) {
            case 0: {
                n8 = intBitsToFloat3;
                n9 = 1.0f - intBitsToFloat5;
                break;
            }
            case 1: {
                n8 = intBitsToFloat3;
                n9 = intBitsToFloat5;
                break;
            }
            case 2: {
                n8 = 1.0f - intBitsToFloat3;
                n9 = 1.0f - intBitsToFloat4;
                break;
            }
            case 3: {
                n8 = intBitsToFloat3;
                n9 = 1.0f - intBitsToFloat4;
                break;
            }
            case 4: {
                n8 = intBitsToFloat5;
                n9 = 1.0f - intBitsToFloat4;
                break;
            }
            case 5: {
                n8 = 1.0f - intBitsToFloat5;
                n9 = 1.0f - intBitsToFloat4;
                break;
            }
            default: {
                return;
            }
        }
        final float n10 = 15.968f;
        final float n11 = 15.968f;
        if (llllIIIIlIIIlIlllIll < n3) {
            n8 += (float)((n3 - llllIIIIlIIIlIlllIll) / n10);
            llllIIIIlIIIlIlllIll = n3;
        }
        if (llllIIIIlIIIlIlllIll > n5) {
            n8 -= (float)((llllIIIIlIIIlIlllIll - n5) / n10);
            llllIIIIlIIIlIlllIll = n5;
        }
        if (ilIlIlIlIlllllllllIl < n4) {
            n9 += (float)((n4 - ilIlIlIlIlllllllllIl) / n11);
            ilIlIlIlIlllllllllIl = n4;
        }
        if (ilIlIlIlIlllllllllIl > n6) {
            n9 -= (float)((ilIlIlIlIlllllllllIl - n6) / n11);
            ilIlIlIlIlllllllllIl = n6;
        }
        switch (n2) {
            case 0: {
                intBitsToFloat3 = n8;
                intBitsToFloat5 = 1.0f - n9;
                break;
            }
            case 1: {
                intBitsToFloat3 = n8;
                intBitsToFloat5 = n9;
                break;
            }
            case 2: {
                intBitsToFloat3 = 1.0f - n8;
                intBitsToFloat4 = 1.0f - n9;
                break;
            }
            case 3: {
                intBitsToFloat3 = n8;
                intBitsToFloat4 = 1.0f - n9;
                break;
            }
            case 4: {
                intBitsToFloat5 = n8;
                intBitsToFloat4 = 1.0f - n9;
                break;
            }
            case 5: {
                intBitsToFloat5 = 1.0f - n8;
                intBitsToFloat4 = 1.0f - n9;
                break;
            }
            default: {
                return;
            }
        }
        array[n7 + 4] = Float.floatToRawIntBits(ilIlIIIllIIllIlllllI2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll));
        array[n7 + 4 + 1] = Float.floatToRawIntBits(ilIlIIIllIIllIlllllI2.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl));
        array[n7 + 0] = Float.floatToRawIntBits(intBitsToFloat3);
        array[n7 + 1] = Float.floatToRawIntBits(intBitsToFloat4);
        array[n7 + 2] = Float.floatToRawIntBits(intBitsToFloat5);
    }
    
    static /* synthetic */ int[] llllIIIIlIIIlIlllIll() {
        final int[] illIIlllIIIIlllIIlIl = llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
        if (illIIlllIIIIlllIIlIl != null) {
            return illIIlllIIIIlllIIlIl;
        }
        final int[] illIIlllIIIIlllIIlIl2 = new int[lIlIlIIIllIIllIIIllI.values().length];
        try {
            illIIlllIIIIlllIIlIl2[lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            illIIlllIIIIlllIIlIl2[lIlIlIIIllIIllIIIllI.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            illIIlllIIIIlllIIlIl2[lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            illIIlllIIIIlllIIlIl2[lIlIlIIIllIIllIIIllI.llllIIIlIlllIlIIIIIl.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            illIIlllIIIIlllIIlIl2[lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            illIIlllIIIIlllIIlIl2[lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        try {
            illIIlllIIIIlllIIlIl2[lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII.ordinal()] = 8;
        }
        catch (NoSuchFieldError noSuchFieldError7) {}
        try {
            illIIlllIIIIlllIIlIl2[lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError8) {}
        return llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl2;
    }
}
