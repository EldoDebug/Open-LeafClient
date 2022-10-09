package net.optifine.lIIIlllIIIllIIIllIII;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI
{
    public static final int llllIIIIlIIIlIlllIll = 63;
    public static final lllIllIIIllllllIllll[][] IlIlIlIlIlllllllllIl;
    public static final lllIllIIIllllllIllll[][] llIllIIIIIllIlIIIIlI;
    private static int IlIIIlIlIIIllIlIlIIl;
    private static int IlIlIIIllIllIIIIIllI;
    private static int IllIIlllIIIIlllIIlIl;
    private static IlllllllIIIlIIIlIlII llllIIIlIlllIlIIIIIl;
    private static int lIIIIlIIIIIlllIllIII;
    private static int lIIIlllIIIllIIIllIII;
    
    static {
        IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll(false);
        llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll(true);
        net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl = 0;
        net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI = -1;
        net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = 16;
        net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl = null;
        net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII = Integer.MIN_VALUE;
        net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = Integer.MIN_VALUE;
    }
    
    public static int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII llllIIIlIlllIlIIIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        final int liiiIlIIIIIlllIllIII = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl) >> 4;
        final int n2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII) >> 4;
        final int liiIlllIIIllIIIllIII = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII) >> 4;
        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, liiIlllIIIllIIIllIII);
        int n3 = liiiIlIIIIIlllIllIII - n;
        int n4 = liiiIlIIIIIlllIllIII + n;
        int n5 = liiIlllIIIllIIIllIII - n;
        int n6 = liiIlllIIIllIIIllIII + n;
        if (llllIIIlIlllIlIIIIIl != llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl || liiiIlIIIIIlllIllIII != llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII || liiIlllIIIllIIIllIII != llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII) {
            llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl = 0;
            llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = 16;
            llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        }
        if (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl == 0) {
            llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI = -1;
        }
        int n7 = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI;
        switch (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl) {
            case 0: {
                n4 = liiiIlIIIIIlllIllIII;
                n6 = liiIlllIIIllIIIllIII;
                break;
            }
            case 1: {
                n3 = liiiIlIIIIIlllIllIII;
                n6 = liiIlllIIIllIIIllIII;
                break;
            }
            case 2: {
                n4 = liiiIlIIIIIlllIllIII;
                n5 = liiIlllIIIllIIIllIII;
                break;
            }
            case 3: {
                n3 = liiiIlIIIIIlllIllIII;
                n5 = liiIlllIIIllIIIllIII;
                break;
            }
        }
        for (int i = n3; i < n4; ++i) {
            for (int j = n5; j < n6; ++j) {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(i, j);
                if (!llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII()) {
                    final llllIIIlIlllIlIIIIIl[] ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
                    int k = ilIlIlIlIlllllllllIl.length - 1;
                    while (k > n7) {
                        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = ilIlIlIlIlllllllllIl[k];
                        if (llllIIIlIlllIlIIIIIl2 != null && !llllIIIlIlllIlIIIIIl2.llllIIIIlIIIlIlllIll()) {
                            if (k > n7) {
                                n7 = k;
                                break;
                            }
                            break;
                        }
                        else {
                            --k;
                        }
                    }
                    try {
                        final Map lllIIIIlllllIlIIllIl = llllIIIIlIIIlIlllIll2.lllIIIIlllllIlIIllIl();
                        if (!lllIIIIlllllIlIIllIl.isEmpty()) {
                            final Iterator<IlIlIlIlIlllllllllIl> iterator = lllIIIIlllllIlIIllIl.keySet().iterator();
                            while (iterator.hasNext()) {
                                final int n8 = iterator.next().lIIIlllIIIllIIIllIII() >> 4;
                                if (n8 > n7) {
                                    n7 = n8;
                                }
                            }
                        }
                    }
                    catch (ConcurrentModificationException ex) {}
                    final IIIlIIlIIIIlllIlllII[] ilIlIIIIIIlllIlIllIl = llllIIIIlIIIlIlllIll2.IlIlIIIIIIlllIlIllIl();
                    int l = ilIlIIIIIIlllIlIllIl.length - 1;
                    while (l > n7) {
                        final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = ilIlIIIIIIlllIlIllIl[l];
                        if (!iiIlIIlIIIIlllIlllII.isEmpty() && (llllIIIIlIIIlIlllIll2 != llllIIIIlIIIlIlllIll || l != n2 || iiIlIIlIIIIlllIlllII.size() != 1)) {
                            if (l > n7) {
                                n7 = l;
                                break;
                            }
                            break;
                        }
                        else {
                            --l;
                        }
                    }
                }
            }
        }
        if (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl < 3) {
            llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI = n7;
            n7 = llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl;
        }
        else {
            llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl = n7;
            llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI = -1;
        }
        llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl = (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl + 1) % 4;
        return n7 << 4;
    }
    
    public static boolean llllIIIIlIIIlIlllIll() {
        return net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl == 0;
    }
    
    private static lllIllIIIllllllIllll[][] llllIIIIlIIIlIlllIll(final boolean b) {
        final int n = 64;
        final lllIllIIIllllllIllll[][] array = new lllIllIIIllllllIllll[n][];
        for (int i = 0; i < n; ++i) {
            final ArrayList<lllIllIIIllllllIllll> list = new ArrayList<lllIllIIIllllllIllll>();
            for (int j = 0; j < lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length; ++j) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl[j];
                if ((i & 1 << (b ? lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI() : lllIllIIIllllllIllll).ordinal()) != 0x0) {
                    list.add(lllIllIIIllllllIllll);
                }
            }
            array[i] = list.toArray(new lllIllIIIllllllIllll[list.size()]);
        }
        return array;
    }
    
    public static lllIllIIIllllllIllll[] llllIIIIlIIIlIlllIll(final int n) {
        return net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI[~n & 0x3F];
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        net.optifine.lIIIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl = null;
    }
}
