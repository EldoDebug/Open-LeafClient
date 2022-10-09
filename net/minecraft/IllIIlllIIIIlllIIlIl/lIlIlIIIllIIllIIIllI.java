package net.minecraft.IllIIlllIIIIlllIIlIl;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.collect.*;

public class lIlIlIIIllIIllIIIllI
{
    private static final Random llllIIIIlIIIlIlllIll;
    private static final IlIllIlIlIIIlIlIlIII IlIlIlIlIlllllllllIl;
    private static final IIlllIIlIllIllIlIIll llIllIIIIIllIlIIIIlI;
    private static final IIIIlllIIIIIIlIIIlll IlIIIlIlIIIllIlIlIIl;
    private static final IlIlIIIllIIllIlllllI IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new Random();
        IlIlIlIlIlllllllllIl = new IlIllIlIlIIIlIlIlIII(null);
        llIllIIIIIllIlIIIIlI = new IIlllIIlIllIllIlIIll(null);
        IlIIIlIlIIIllIlIlIIl = new IIIIlllIIIIIIlIIIlll(null);
        IlIlIIIllIllIIIIIllI = new IlIlIIIllIIllIlllllI(null);
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl == null) {
            return 0;
        }
        final IlIlIIIlIIlIlIIlllIl ilIllIlIlIIIlIlIlIII = lllIIIIlIlIllIIlIIIl.IlIllIlIlIIIlIlIlIII();
        if (ilIllIlIlIIIlIlIlIII == null) {
            return 0;
        }
        for (int i = 0; i < ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI(); ++i) {
            final short ilIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("id");
            final short ilIlIIIllIllIIIIIllI2 = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("lvl");
            if (ilIlIIIllIllIIIIIllI == n) {
                return ilIlIIIllIllIIIIIllI2;
            }
        }
        return 0;
    }
    
    public static Map llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ah) ? IIllIIllIIIlIlIIIIlI.ah.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl) : lllIIIIlIlIllIIlIIIl.IlIllIlIlIIIlIlIlIII();
        if (ilIlIIIlIIlIlIIlllIl != null) {
            for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
                linkedHashMap.put((int)ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("id"), (int)ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("lvl"));
            }
        }
        return linkedHashMap;
    }
    
    public static void llllIIIIlIIIlIlllIll(final Map map, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (final int intValue : map.keySet()) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(intValue);
            if (llllIIIIlIIIlIlllIll != null) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("id", (short)intValue);
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("lvl", (short)(int)map.get(intValue));
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
                if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.ah) {
                    continue;
                }
                IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, new net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll, (int)map.get(intValue)));
            }
        }
        if (ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI() > 0) {
            if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.ah) {
                lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll("ench", ilIlIIIlIIlIlIIlllIl);
            }
        }
        else if (lllIIIIlIlIllIIlIIIl.IIIIlllIIIIIIlIIIlll()) {
            lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().llllIIllllIlIlIIIIll("ench");
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl[] array) {
        if (array == null) {
            return 0;
        }
        int n2 = 0;
        for (int length = array.length, i = 0; i < length; ++i) {
            final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n, array[i]);
            if (llllIIIIlIIIlIlllIll > n2) {
                n2 = llllIIIIlIIIlIlllIll;
            }
        }
        return n2;
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl != null) {
            final IlIlIIIlIIlIlIIlllIl ilIllIlIlIIIlIlIlIII = lllIIIIlIlIllIIlIIIl.IlIllIlIlIIIlIlIlIII();
            if (ilIllIlIlIIIlIlIlIII != null) {
                for (int i = 0; i < ilIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI(); ++i) {
                    final short ilIlIIIllIllIIIIIllI = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("id");
                    final short ilIlIIIllIllIIIIIllI2 = ilIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(i).IlIlIIIllIllIIIIIllI("lvl");
                    if (net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI) != null) {
                        llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI), ilIlIIIllIllIIIIIllI2);
                    }
                }
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final lllIIIIlIlIllIIlIIIl[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, array[i]);
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl[] array, final lIllllllIIllIlIlIlII ilIlIlIlIlllllllllIl) {
        lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = 0;
        lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl, array);
        if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll > 25) {
            lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = 25;
        }
        else if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll < 0) {
            lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = 0;
        }
        return (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll + 1 >> 1) + lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.nextInt((lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll >> 1) + 1);
    }
    
    public static float llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIlIllllllllIIIIlII ilIlIlIlIlllllllllIl) {
        lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll = 0.0f;
        lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, lllIIIIlIlIllIIlIIIl);
        return lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
    
    public static void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl) {
        lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll());
        }
        if (ilIlIlIlIlllllllllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll.n());
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll, final llIllIIIIIllIlIIIIlI ilIlIlIlIlllllllllIl) {
        lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll());
        }
        if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.IlIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll.n());
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.n());
    }
    
    public static int IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.n());
    }
    
    public static int llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll());
    }
    
    public static int IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.IlIllllIIIlIllIlIIll());
    }
    
    public static int llIllIIIIIllIlIIIIlI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.n());
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.n()) > 0;
    }
    
    public static int IlIlIIIllIllIIIIIllI(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.n());
    }
    
    public static int IllIIlllIIIIlllIIlIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.n());
    }
    
    public static int llllIIIlIlllIlIIIIIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.n());
    }
    
    public static int lIIIIlIIIIIlllIllIII(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.n());
    }
    
    public static boolean lIIIlllIIIllIIIllIII(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.IlIllllIIIlIllIlIIll()) > 0;
    }
    
    public static lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        lllIIIIlIlIllIIlIIIl[] ilIllllIIIlIllIlIIll;
        for (int length = (ilIllllIIIlIllIlIIll = lllIIIIlllllIlIIllIl.IlIllllIIIlIllIlIIll()).length, i = 0; i < length; ++i) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIllllIIIlIllIlIIll[i];
            if (lllIIIIlIlIllIIlIIIl != null && llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, lllIIIIlIlIllIIlIIIl) > 0) {
                return lllIIIIlIlIllIIlIIIl;
            }
        }
        return null;
    }
    
    public static int llllIIIIlIIIlIlllIll(final Random random, final int n, int n2, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IlIlIIIllIIllIlllllI() <= 0) {
            return 0;
        }
        if (n2 > 15) {
            n2 = 15;
        }
        final int n3 = random.nextInt(8) + 1 + (n2 >> 1) + random.nextInt(n2 + 1);
        return (n == 0) ? Math.max(n3 / 3, 1) : ((n == 1) ? (n3 * 2 / 3 + 1) : Math.max(n3, n2 * 2));
    }
    
    public static lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final Random random, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        final List ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(random, lllIIIIlIlIllIIlIIIl, n);
        final boolean b = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll;
        if (b) {
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.ah);
        }
        if (ilIlIlIlIlllllllllIl != null) {
            for (final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl : ilIlIlIlIlllllllllIl) {
                if (b) {
                    IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, llllIIIlIlllIlIIIIIl);
                }
                else {
                    lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl);
                }
            }
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public static List IlIlIlIlIlllllllllIl(final Random random, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        final int ilIlIIIllIIllIlllllI = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll().IlIlIIIllIIllIlllllI();
        if (ilIlIIIllIIllIlllllI <= 0) {
            return null;
        }
        final int n2 = ilIlIIIllIIllIlllllI / 2;
        int n3 = (int)((1 + random.nextInt((n2 >> 1) + 1) + random.nextInt((n2 >> 1) + 1) + n) * (1.0f + (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f) + 0.5f);
        if (n3 < 1) {
            n3 = 1;
        }
        List<net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl> arrayList = null;
        final Map ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(n3, lllIIIIlIlIllIIlIIIl);
        if (ilIlIlIlIlllllllllIl != null && !ilIlIlIlIlllllllllIl.isEmpty()) {
            final net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = (net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl)i.llllIIIIlIIIlIlllIll(random, ilIlIlIlIlllllllllIl.values());
            if (llllIIIlIlllIlIIIIIl != null) {
                arrayList = (List<net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl>)Lists.newArrayList();
                arrayList.add(llllIIIlIlllIlIIIIIl);
                for (int n4 = n3; random.nextInt(50) <= n4; n4 >>= 1) {
                    final Iterator<Integer> iterator = ilIlIlIlIlllllllllIl.keySet().iterator();
                    while (iterator.hasNext()) {
                        final Integer n5 = iterator.next();
                        boolean b = true;
                        final Iterator<net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl> iterator2 = arrayList.iterator();
                        while (iterator2.hasNext()) {
                            if (!iterator2.next().llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n5))) {
                                b = false;
                                break;
                            }
                        }
                        if (!b) {
                            iterator.remove();
                        }
                    }
                    if (!ilIlIlIlIlllllllllIl.isEmpty()) {
                        arrayList.add((net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl)i.llllIIIIlIIIlIlllIll(random, ilIlIlIlIlllllllllIl.values()));
                    }
                }
            }
        }
        return arrayList;
    }
    
    public static Map IlIlIlIlIlllllllllIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        Map<Integer, net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl> hashMap = null;
        final boolean b = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IIlIlllIlIlllIlIllll;
        llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll2;
        for (int length = (llllIIIIlIIIlIlllIll2 = net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2[i];
            if (llllIIIIlIIIlIlllIll3 != null && (llllIIIIlIIIlIlllIll3.llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll) || b)) {
                for (int j = llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI(); j <= llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl(); ++j) {
                    if (n >= llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(j) && n <= llllIIIIlIIIlIlllIll3.llIllIIIIIllIlIIIIlI(j)) {
                        if (hashMap == null) {
                            hashMap = (Map<Integer, net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl>)Maps.newHashMap();
                        }
                        hashMap.put(llllIIIIlIIIlIlllIll3.IIlllIlIIllIlIlIlIIl, new net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll3, j));
                    }
                }
            }
        }
        return hashMap;
    }
}
