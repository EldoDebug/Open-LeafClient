package net.optifine.shaders;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import net.optifine.shaders.llllIIIIlIIIlIlllIll.*;
import net.optifine.util.*;
import java.util.*;

public class IlIlIIIllIIllIlllllI
{
    private static int[] llllIIIIlIIIlIlllIll;
    private static boolean IlIlIlIlIlllllllllIl;
    private static final int llIllIIIIIllIlIIIIlI = Integer.MIN_VALUE;
    
    static {
        IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll = null;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        if (IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll == null) {
            return n;
        }
        if (n >= 0 && n < IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll.length) {
            final int n2 = IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll[n];
            return (n2 == Integer.MIN_VALUE) ? n : n2;
        }
        return n;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        if (IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl) {
            IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl = false;
            llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl());
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        IlIlIlIlIlllllllllIl();
        if (lIlIlIIIllIIllIIIllI != null) {
            if (lIIIIlIIIIIlllIllIII.ah.llIllIIIIIllIlIIIIlI() && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl() == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("[Shaders] Delayed loading of item mappings after resources are loaded");
                IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl = true;
            }
            else {
                final ArrayList list = new ArrayList();
                final String s = "/shaders/item.properties";
                final InputStream llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s);
                if (llllIIIIlIIIlIlllIll != null) {
                    llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s, list);
                }
                llllIIIIlIIIlIlllIll(list);
                if (list.size() > 0) {
                    IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl(list);
                }
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final List list) {
        final String[] llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            try {
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s, "shaders/item.properties");
                llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll), lIllllIllIllIIllllll.toString(), list);
            }
            catch (IOException ex) {}
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(InputStream llllIIIIlIIIlIlllIll, final String s, final List list) {
        if (llllIIIIlIIIlIlllIll != null) {
            try {
                llllIIIIlIIIlIlllIll = IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s);
                final net.optifine.util.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new net.optifine.util.llIIlllIIlllIIllIllI();
                llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
                llllIIIIlIIIlIlllIll.close();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("[Shaders] Parsing item mappings: " + s);
                final net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = new net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Shaders");
                for (final String s2 : ((Hashtable<String, V>)llIIlllIIlllIIllIllI).keySet()) {
                    final String property = llIIlllIIlllIIllIllI.getProperty(s2);
                    final String s3 = "item.";
                    if (!s2.startsWith(s3)) {
                        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid item ID: " + s2);
                    }
                    else {
                        final int llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s2, s3), -1);
                        if (llllIIIIlIIIlIlllIll3 < 0) {
                            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid item alias ID: " + llllIIIIlIIIlIlllIll3);
                        }
                        else {
                            final int[] llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll2.llllIIllllIlIlIIIIll(property);
                            if (llllIIllllIlIlIIIIll != null && llllIIllllIlIlIIIIll.length >= 1) {
                                for (int i = 0; i < llllIIllllIlIlIIIIll.length; ++i) {
                                    llllIIIIlIIIlIlllIll(list, llllIIllllIlIlIIIIll[i], llllIIIIlIIIlIlllIll3);
                                }
                            }
                            else {
                                llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid item ID mapping: " + s2 + "=" + property);
                            }
                        }
                    }
                }
            }
            catch (IOException ex) {
                llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Error reading: " + s);
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final List list, final int n, final int n2) {
        while (list.size() <= n) {
            list.add(Integer.MIN_VALUE);
        }
        list.set(n, n2);
    }
    
    private static int[] IlIlIlIlIlllllllllIl(final List list) {
        final int[] array = new int[list.size()];
        for (int i = 0; i < array.length; ++i) {
            array[i] = list.get(i);
        }
        return array;
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll = null;
    }
}
