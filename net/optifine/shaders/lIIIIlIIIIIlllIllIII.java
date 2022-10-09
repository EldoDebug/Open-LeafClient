package net.optifine.shaders;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import net.optifine.shaders.llllIIIIlIIIlIlllIll.*;
import net.optifine.util.*;
import java.util.*;

public class lIIIIlIIIIIlllIllIII
{
    private static int[] llllIIIIlIIIlIlllIll;
    private static boolean IlIlIlIlIlllllllllIl;
    
    static {
        lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll = null;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        if (lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll == null) {
            return -1;
        }
        if (n >= 0 && n < lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll.length) {
            return lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll[n];
        }
        return -1;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        if (lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl) {
            lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = false;
            llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl());
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        IlIlIlIlIlllllllllIl();
        if (lIlIlIIIllIIllIIIllI != null) {
            if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ah.llIllIIIIIllIlIIIIlI() && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl() == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("[Shaders] Delayed loading of entity mappings after resources are loaded");
                lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl = true;
            }
            else {
                final ArrayList list = new ArrayList();
                final String s = "/shaders/entity.properties";
                final InputStream llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s);
                if (llllIIIIlIIIlIlllIll != null) {
                    llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s, list);
                }
                llllIIIIlIIIlIlllIll(list);
                if (list.size() > 0) {
                    lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl(list);
                }
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final List list) {
        final String[] llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            try {
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s, "shaders/entity.properties");
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
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("[Shaders] Parsing entity mappings: " + s);
                final net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = new net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Shaders");
                for (final String s2 : ((Hashtable<String, V>)llIIlllIIlllIIllIllI).keySet()) {
                    final String property = llIIlllIIlllIIllIllI.getProperty(s2);
                    final String s3 = "entity.";
                    if (!s2.startsWith(s3)) {
                        llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid entity ID: " + s2);
                    }
                    else {
                        final int llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s2, s3), -1);
                        if (llllIIIIlIIIlIlllIll3 < 0) {
                            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid entity alias ID: " + llllIIIIlIIIlIlllIll3);
                        }
                        else {
                            final int[] ilIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll2.IlIllIlIlIIIlIlIlIII(property);
                            if (ilIllIlIlIIIlIlIlIII != null && ilIllIlIlIIIlIlIlIII.length >= 1) {
                                for (int i = 0; i < ilIllIlIlIIIlIlIlIII.length; ++i) {
                                    llllIIIIlIIIlIlllIll(list, ilIllIlIlIIIlIlIlIII[i], llllIIIIlIIIlIlllIll3);
                                }
                            }
                            else {
                                llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid entity ID mapping: " + s2 + "=" + property);
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
            list.add(-1);
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
        lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll = null;
    }
}
