package net.optifine;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.IlIlIIIllIllIIIIIllI.*;

public class IIIllIIIlIlIIllIIIlI
{
    private static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private static IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    private static IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private static IlIlIlIlIlllllllllIl IlIIIlIlIIIllIlIlIIl;
    private static IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI;
    private static IlIlIlIlIlllllllllIl IllIIlllIIIIlllIIlIl;
    private static List llllIIIlIlllIlIIIIIl;
    private static List lIIIIlIIIIIlllIllIII;
    private static List lIIIlllIIIllIIIllIII;
    private static List llIIlIIIlIIIllIlIIIl;
    private static List llIllIlIIIIllIlIIllI;
    private static List lIlIlIIIllIIllIIIllI;
    private static IlIlIlIlIlllllllllIl IlIlIIIllIIllIlllllI;
    private static IlIlIlIlIlllllllllIl IIIIlllIIIIIIlIIIlll;
    private static IlIlIlIlIlllllllllIl llllIIllllIlIlIIIIll;
    private static IlIlIlIlIlllllllllIl IlIllIlIlIIIlIlIlIII;
    private static IlIlIlIlIlllllllllIl IIlllIIlIllIllIlIIll;
    private static IlIlIlIlIlllllllllIl lllIIIIlllllIlIIllIl;
    
    static {
        IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll = null;
        IIIllIIIlIlIIllIIIlI.IlIlIlIlIlllllllllIl = null;
        IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI = null;
        IIIllIIIlIlIIllIIIlI.IlIIIlIlIIIllIlIlIIl = null;
        IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI = null;
        IIIllIIIlIlIIllIIIlI.IllIIlllIIIIlllIIlIl = null;
        IIIllIIIlIlIIllIIIlI.llllIIIlIlllIlIIIIIl = null;
        IIIllIIIlIlIIllIIIlI.lIIIIlIIIIIlllIllIII = null;
        IIIllIIIlIlIIllIIIlI.lIIIlllIIIllIIIllIII = null;
        IIIllIIIlIlIIllIIIlI.llIIlIIIlIIIllIlIIIl = null;
        IIIllIIIlIlIIllIIIlI.llIllIlIIIIllIlIIllI = null;
        IIIllIIIlIlIIllIIIlI.lIlIlIIIllIIllIIIllI = null;
        IIIllIIIlIlIIllIIIlI.IlIlIIIllIIllIlllllI = null;
        IIIllIIIlIlIIllIIIlI.IIIIlllIIIIIIlIIIlll = null;
        IIIllIIIlIlIIllIIIlI.llllIIllllIlIlIIIIll = null;
        IIIllIIIlIlIIllIIIlI.IlIllIlIlIIIlIlIlIII = null;
        IIIllIIIlIlIIllIIIlI.IIlllIIlIllIllIlIIll = null;
        IIIllIIIlIlIIllIIIlI.lllIIIIlllllIlIIllIl = null;
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI()) {
            return ilIlIlIlIlllllllllIl;
        }
        final List llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        return (llllIIIIlIIIlIlllIll == IIIllIIIlIlIIllIIIlI.llllIIIlIlllIlIIIIIl) ? IIIllIIIlIlIIllIIIlI.IlIlIIIllIIllIlllllI : ((llllIIIIlIIIlIlllIll == IIIllIIIlIlIIllIIIlI.lIIIIlIIIIIlllIllIII) ? IIIllIIIlIlIIllIIIlI.IIIIlllIIIIIIlIIIlll : ((llllIIIIlIIIlIlllIll == IIIllIIIlIlIIllIIIlI.lIIIlllIIIllIIIllIII) ? IIIllIIIlIlIIllIIIlI.llllIIllllIlIlIIIIll : ((llllIIIIlIIIlIlllIll == IIIllIIIlIlIIllIIIlI.llIIlIIIlIIIllIlIIIl) ? IIIllIIIlIlIIllIIIlI.IlIllIlIlIIIlIlIlIII : ((llllIIIIlIIIlIlllIll == IIIllIIIlIlIIllIIIlI.llIllIlIIIIllIlIIllI) ? IIIllIIIlIlIIllIIIlI.IIlllIIlIllIllIlIIll : ((llllIIIIlIIIlIlllIll == IIIllIIIlIlIIllIIIlI.lIlIlIIIllIIllIIIllI) ? IIIllIIIlIlIIllIIIlI.lllIIIIlllllIlIIllIl : ilIlIlIlIlllllllllIl)))));
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        if (llIIlIIIlIIIllIlIIIl == llIIlIIIlIIIllIlIIIl2) {
            return true;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI == llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI() && ((llIllIIIIIllIlIIIIlI instanceof o) ? ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII)).equals(llIIlIIIlIIIllIlIIIl2.llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII)) : (llIllIIIIIllIlIIIIlI instanceof i && ((aa)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII)).equals(llIIlIIIlIIIllIlIIIl2.llllIIIIlIIIlIlllIll(i.IllIllIIIIlIIlIlllII))));
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        final ArrayList list = new ArrayList();
        IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll("acacia", list);
        IIIllIIIlIlIIllIIIlI.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll("birch", list);
        IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll("dark_oak", list);
        IIIllIIIlIlIIllIIIlI.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll("jungle", list);
        IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll("oak", list);
        IIIllIIIlIlIIllIIIlI.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll("spruce", list);
        IIIllIIIlIlIIllIIIlI.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll);
        IIIllIIIlIlIIllIIIlI.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IlIlIlIlIlllllllllIl);
        IIIllIIIlIlIIllIIIlI.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI);
        IIIllIIIlIlIIllIIIlI.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IlIIIlIlIIIllIlIlIIl);
        IIIllIIIlIlIIllIIIlI.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI);
        IIIllIIIlIlIIllIIIlI.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll(IIIllIIIlIlIIllIIIlI.IllIIlllIIIIlllIIlIl);
        IIIllIIIlIlIIllIIIlI.IlIlIIIllIIllIlllllI = IlIlIlIlIlllllllllIl(IIIllIIIlIlIIllIIIlI.llllIIIIlIIIlIlllIll);
        IIIllIIIlIlIIllIIIlI.IIIIlllIIIIIIlIIIlll = IlIlIlIlIlllllllllIl(IIIllIIIlIlIIllIIIlI.IlIlIlIlIlllllllllIl);
        IIIllIIIlIlIIllIIIlI.llllIIllllIlIlIIIIll = IlIlIlIlIlllllllllIl(IIIllIIIlIlIIllIIIlI.llIllIIIIIllIlIIIIlI);
        IIIllIIIlIlIIllIIIlI.IlIllIlIlIIIlIlIlIII = IlIlIlIlIlllllllllIl(IIIllIIIlIlIIllIIIlI.IlIIIlIlIIIllIlIlIIl);
        IIIllIIIlIlIIllIIIlI.IIlllIIlIllIllIlIIll = IlIlIlIlIlllllllllIl(IIIllIIIlIlIIllIIIlI.IlIlIIIllIllIIIIIllI);
        IIIllIIIlIlIIllIIIlI.lllIIIIlllllIlIIllIl = IlIlIlIlIlllllllllIl(IIIllIIIlIlIIllIIIlI.IllIIlllIIIIlllIIlIl);
        if (list.size() > 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Enable face culling: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(list.toArray()));
        }
    }
    
    private static List llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (ilIlIlIlIlllllllllIl == null) ? null : ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
    }
    
    static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final String s, final List list) {
        final IllIIlllIIIIlllIIlIl iIlllIIIlIlllIIlllII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        if (iIlllIIIlIlllIIlllII == null) {
            return null;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(new lIllllIllIllIIllllll("blockstates/" + s + "_leaves.json")) != net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI()) {
            return null;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(new lIllllIllIllIIllllll("models/block/" + s + "_leaves.json")) != net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI()) {
            return null;
        }
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(String.valueOf(s) + "_leaves", "normal"));
        if (llllIIIIlIIIlIlllIll == null || llllIIIIlIIIlIlllIll == iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll()) {
            return null;
        }
        final List llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll2.size() == 0) {
            return llllIIIIlIIIlIlllIll;
        }
        if (llllIIIIlIIIlIlllIll2.size() != 6) {
            return null;
        }
        for (final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 : llllIIIIlIIIlIlllIll2) {
            final List llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.IlIlIIIllIllIIIIIllI());
            if (llllIIIIlIIIlIlllIll4.size() > 0) {
                return null;
            }
            llllIIIIlIIIlIlllIll4.add(llllIIIIlIIIlIlllIll3);
        }
        llllIIIIlIIIlIlllIll2.clear();
        list.add(String.valueOf(s) + "_leaves");
        return llllIIIIlIIIlIlllIll;
    }
    
    private static IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == null) {
            return null;
        }
        if (ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().size() > 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("SmartLeaves: Model is not cube, general quads: " + ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll().size() + ", model: " + ilIlIlIlIlllllllllIl);
            return ilIlIlIlIlllllllllIl;
        }
        final lllIllIIIllllllIllll[] llllIIIlIlllIlIIIIIl = lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl;
        for (int i = 0; i < llllIIIlIlllIlIIIIIl.length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = llllIIIlIlllIlIIIIIl[i];
            final List llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            if (llllIIIIlIIIlIlllIll.size() != 1) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("SmartLeaves: Model is not cube, side: " + lllIllIIIllllllIllll + ", quads: " + llllIIIIlIIIlIlllIll.size() + ", model: " + ilIlIlIlIlllllllllIl);
                return ilIlIlIlIlllllllllIl;
            }
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = net.optifine.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final List[] array = new List[llllIIIlIlllIlIIIIIl.length];
        for (int j = 0; j < llllIIIlIlllIlIIIIIl.length; ++j) {
            final List llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl[j]);
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.get(0);
            final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl().clone(), llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll3.IlIlIIIllIllIIIIIllI(), llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll());
            final int[] ilIlIlIlIlllllllllIl3 = llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl();
            final int[] array2 = ilIlIlIlIlllllllllIl3.clone();
            final int n = ilIlIlIlIlllllllllIl3.length / 4;
            System.arraycopy(ilIlIlIlIlllllllllIl3, 0 * n, array2, 3 * n, n);
            System.arraycopy(ilIlIlIlIlllllllllIl3, 1 * n, array2, 2 * n, n);
            System.arraycopy(ilIlIlIlIlllllllllIl3, 2 * n, array2, 1 * n, n);
            System.arraycopy(ilIlIlIlIlllllllllIl3, 3 * n, array2, 0 * n, n);
            System.arraycopy(array2, 0, ilIlIlIlIlllllllllIl3, 0, array2.length);
            llllIIIIlIIIlIlllIll2.add(llllIIIIlIIIlIlllIll4);
        }
        return ilIlIlIlIlllllllllIl2;
    }
}
