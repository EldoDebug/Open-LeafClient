package net.optifine;

import net.minecraft.client.*;
import net.optifine.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.optifine.util.*;
import java.io.*;
import java.util.*;

public class llIIIlIlIllIIlIlIlII
{
    private static Minecraft IlIlIlIlIlllllllllIl;
    private static IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private static IIIlIIlIIIIlllIlllII[][] IlIIIlIlIIIllIlIlIIl;
    public static boolean llllIIIIlIIIlIlllIll;
    
    static {
        llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI();
        llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI = null;
        llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl = null;
        llIIIlIlIllIIlIlIlII.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI();
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        if (llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl == null) {
            return lIllllIllIllIIllllll;
        }
        final lIIllIIIllllIlllIllI iiiIlllIIIIIIlIIIlll = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll;
        if (!(iiiIlllIIIIIIlIIIlll instanceof lIIIlllIIIllIIIllIII)) {
            return lIllllIllIllIIllllll;
        }
        if (!lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI().equals("minecraft") || !lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl().startsWith("textures/gui/")) {
            return lIllllIllIllIIllllll;
        }
        if (llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI == null) {
            return lIllllIllIllIIllllll;
        }
        final net.minecraft.client.IlIlIIIllIllIIIIIllI.llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl = llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl;
        if (illIIlllIIIIlllIIlIl == null) {
            return lIllllIllIllIIllllll;
        }
        if (iiiIlllIIIIIIlIIIlll instanceof llIIlIIIlIIIllIlIIIl) {
            return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.IlIlIIIllIIllIlllllI, llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl(), illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
        }
        if (iiiIlllIIIIIIlIIIlll instanceof IIlllIIlIllIllIlIIll) {
            return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.IIIIlllIIIIIIlIIIlll, llIIIlIlIllIIlIlIlII.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.IlIlIIIlIIlIlIIlllIl(), illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
        }
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIllllIlIlIIIIll = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI.llllIIllllIlIlIIIIll();
        if (llllIIllllIlIlIIIIll != null) {
            if (iiiIlllIIIIIIlIIIlll instanceof lllllIIlIlIIIlIlIIIl) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof llllIIIlIlllIlIIIIIl) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof lIIIIlIIIIIlllIllIII) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.IlIIIlIlIIIllIlIlIIl, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof IlIlIIIllIIllIlllllI) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.IlIlIIIllIllIIIIIllI, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof IIIIlllIIIIIIlIIIlll) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.IllIIlllIIIIlllIIlIl, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof IIIlIIIlIlIIlllIIlll) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.llllIIIlIlllIlIIIIIl, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof IlIllIlIlIIIlIlIlIII) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.lIIIIlIIIIIlllIllIII, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof IIlllIlIIllIlIlIlIIl) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.lIIIlllIIIllIIIllIII, llllIIllllIlIlIIIIll, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll, iiiIlllIIIIIIlIIIlll);
            }
        }
        final llIllIIIIIllIlIIIIlI ilIllIlIlIIIlIlIlIII = llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI.IlIllIlIlIIIlIlIlIII();
        if (ilIllIlIlIIIlIlIlIII != null) {
            if (iiiIlllIIIIIIlIIIlll instanceof lllIIIIlllllIlIIllIl) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.llIIlIIIlIIIllIlIIIl, ilIllIlIlIIIlIlIlIII, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll);
            }
            if (iiiIlllIIIIIIlIIIlll instanceof IIlIlIlIIlIllIIIIIIl) {
                return llllIIIIlIIIlIlllIll(IlIlIllllllllIIIIlII.llIllIlIIIIllIlIIllI, ilIllIlIlIIIlIlIlIII, illIIlllIIIIlllIIlIl, lIllllIllIllIIllllll);
            }
        }
        return lIllllIllIllIIllllll;
    }
    
    private static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI) {
        final IIIlIIlIIIIlllIlllII[] array = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl[ilIlIllllllllIIIIlII.ordinal()];
        if (array == null) {
            return lIllllIllIllIIllllll;
        }
        for (int i = 0; i < array.length; ++i) {
            final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = array[i];
            if (iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, ilIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI, liIllIIIllllIlllIllI)) {
                return iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
            }
        }
        return lIllllIllIllIIllllll;
    }
    
    private static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final IIIlIIlIIIIlllIlllII[] array = llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl[ilIlIllllllllIIIIlII.ordinal()];
        if (array == null) {
            return lIllllIllIllIIllllll;
        }
        for (int i = 0; i < array.length; ++i) {
            final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = array[i];
            if (iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII, llIllIIIIIllIlIIIIlI, lIlIlIIIllIIllIIIllI)) {
                return iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
            }
        }
        return lIllllIllIllIIllllll;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl = null;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.B()) {
            final ArrayList list = new ArrayList();
            final llllIIllllIlIlIIIIll[] lllllIIIIIlIlIIIIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl();
            for (int i = lllllIIIIIlIlIIIIIIl.length - 1; i >= 0; --i) {
                llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl[i], list);
            }
            llIIIlIlIllIIlIlIlII.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll(list);
        }
    }
    
    private static IIIlIIlIIIIlllIlllII[][] llllIIIIlIIIlIlllIll(final List list) {
        if (list.isEmpty()) {
            return null;
        }
        final IIIlIIlIIIIlllIlllII[][] array = new IIIlIIlIIIIlllIlllII[IlIlIllllllllIIIIlII.llllIIllllIlIlIIIIll.length][];
        for (int i = 0; i < array.length; ++i) {
            if (list.size() > i) {
                final List list2 = list.get(i);
                if (list2 != null) {
                    array[i] = (IIIlIIlIIIIlllIlllII[])list2.toArray(new IIIlIIlIIIIlllIlllII[list2.size()]);
                }
            }
        }
        return array;
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final List list) {
        final String[] llllIIIIlIIIlIlllIll = IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, "optifine/gui/container/", ".properties", null);
        Arrays.sort(llllIIIIlIIIlIlllIll);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomGuis: " + s);
            try {
                final InputStream llllIIIIlIIIlIlllIll2 = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
                if (llllIIIIlIIIlIlllIll2 == null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomGuis file not found: " + s);
                }
                else {
                    final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                    llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll2);
                    llllIIIIlIIIlIlllIll2.close();
                    final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = new IIIlIIlIIIIlllIlllII(llIIlllIIlllIIllIllI, s);
                    if (iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(s)) {
                        llllIIIIlIIIlIlllIll(iiIlIIlIIIIlllIlllII, list);
                    }
                }
            }
            catch (FileNotFoundException ex2) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomGuis file not found: " + s);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII, final List list) {
        if (iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll() == null) {
            llllIIIIlIIIlIlllIll("Invalid container: " + iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll());
        }
        else {
            final int ordinal = iiIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll().ordinal();
            while (list.size() <= ordinal) {
                list.add(null);
            }
            List<IIIlIIlIIIIlllIlllII> list2 = list.get(ordinal);
            if (list2 == null) {
                list2 = new ArrayList<IIIlIIlIIIIlllIlllII>();
                list.set(ordinal, list2);
            }
            list2.add(iiIlIIlIIIIlllIlllII);
        }
    }
    
    public static IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl() {
        return llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI) {
        llIIIlIlIllIIlIlIlII.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    private static boolean llIllIIIIIllIlIIIIlI() {
        final Calendar instance = Calendar.getInstance();
        return instance.get(2) + 1 == 12 && instance.get(5) >= 24 && instance.get(5) <= 26;
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[CustomGuis] " + s);
    }
}
