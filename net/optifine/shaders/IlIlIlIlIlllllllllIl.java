package net.optifine.shaders;

import net.minecraft.client.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import net.optifine.shaders.llllIIIIlIIIlIlllIll.*;
import net.optifine.util.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl
{
    private static llllIIIIlIIIlIlllIll[][] llllIIIIlIIIlIlllIll;
    private static llIIlllIIlllIIllIllI IlIlIlIlIlllllllllIl;
    private static boolean llIllIIIIIllIlIIIIlI;
    
    static {
        net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = null;
        net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl = null;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2) {
        if (net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll == null) {
            return n;
        }
        if (n < 0 || n >= net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.length) {
            return n;
        }
        final llllIIIIlIIIlIlllIll[] array = net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[n];
        if (array == null) {
            return n;
        }
        for (int i = 0; i < array.length; ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = array[i];
            if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2)) {
                return llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
            }
        }
        return n;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        if (net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = false;
            llllIIIIlIIIlIlllIll(net.optifine.shaders.llIIlllIIlllIIllIllI.IlIIIlIlIIIllIlIlIIl());
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        llIllIIIIIllIlIIIIlI();
        if (lIlIlIIIllIIllIIIllI != null) {
            if (lIIIIlIIIIIlllIllIII.ah.llIllIIIIIllIlIIIIlI() && Minecraft.getMinecraft().IIlIlIlIIlIllIIIIIIl() == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("[Shaders] Delayed loading of block mappings after resources are loaded");
                net.optifine.shaders.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI = true;
            }
            else {
                final ArrayList list = new ArrayList();
                final String s = "/shaders/block.properties";
                final InputStream llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s);
                if (llllIIIIlIIIlIlllIll != null) {
                    llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s, list);
                }
                llllIIIIlIIIlIlllIll(list);
                if (list.size() > 0) {
                    net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl(list);
                }
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final List list) {
        final String[] llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            try {
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s, "shaders/block.properties");
                llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll), lIllllIllIllIIllllll.toString(), list);
            }
            catch (IOException ex) {}
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(InputStream llllIIIIlIIIlIlllIll, final String s, final List list) {
        if (llllIIIIlIIIlIlllIll != null) {
            try {
                llllIIIIlIIIlIlllIll = IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s);
                final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
                llllIIIIlIIIlIlllIll.close();
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("[Shaders] Parsing block mappings: " + s);
                final net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = new net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Shaders");
                for (final String s2 : ((Hashtable<String, V>)llIIlllIIlllIIllIllI).keySet()) {
                    final String property = llIIlllIIlllIIllIllI.getProperty(s2);
                    if (s2.startsWith("layer.")) {
                        if (net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl == null) {
                            net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl = new llIIlllIIlllIIllIllI();
                        }
                        net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.put(s2, property);
                    }
                    else {
                        final String s3 = "block.";
                        if (!s2.startsWith(s3)) {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid block ID: " + s2);
                        }
                        else {
                            final int llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s2, s3), -1);
                            if (llllIIIIlIIIlIlllIll3 < 0) {
                                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid block ID: " + s2);
                            }
                            else {
                                final llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(property);
                                if (llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI.length >= 1) {
                                    llllIIIIlIIIlIlllIll(list, new llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llIllIIIIIllIlIIIIlI));
                                }
                                else {
                                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid block ID mapping: " + s2 + "=" + property);
                                }
                            }
                        }
                    }
                }
            }
            catch (IOException ex) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Error reading: " + s);
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final List list, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final int[] ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        for (int i = 0; i < ilIlIlIlIlllllllllIl.length; ++i) {
            final int j = ilIlIlIlIlllllllllIl[i];
            while (j >= list.size()) {
                list.add(null);
            }
            List<?> list2 = list.get(j);
            if (list2 == null) {
                list2 = new ArrayList<Object>();
                list.set(j, list2);
            }
            list2.add(new llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(j)));
        }
    }
    
    private static llllIIIIlIIIlIlllIll[][] IlIlIlIlIlllllllllIl(final List list) {
        final llllIIIIlIIIlIlllIll[][] array = new llllIIIIlIIIlIlllIll[list.size()][];
        for (int i = 0; i < array.length; ++i) {
            final List list2 = list.get(i);
            if (list2 != null) {
                array[i] = (llllIIIIlIIIlIlllIll[])list2.toArray(new llllIIIIlIIIlIlllIll[list2.size()]);
            }
        }
        return array;
    }
    
    public static llIIlllIIlllIIllIllI IlIlIlIlIlllllllllIl() {
        return net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        net.optifine.shaders.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll = null;
        net.optifine.shaders.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl = null;
    }
}
