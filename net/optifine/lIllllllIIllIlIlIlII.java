package net.optifine;

import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import net.minecraft.client.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.optifine.util.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class lIllllllIIllIlIlIlII
{
    private static lllllIlIIIlIlIIlllII[][] llIIlIIIlIIIllIlIIIl;
    private static lllllIlIIIlIlIIlllII[][] llIllIlIIIIllIlIIllI;
    private static Map lIlIlIIIllIIllIIIllI;
    private static IIIIlllIIIIIIlIIIlll IlIlIIIllIIllIlllllI;
    private static boolean IIIIlllIIIIIIlIIIlll;
    private static boolean llllIIllllIlIlIIIIll;
    public static final int llllIIIIlIIIlIlllIll = 16384;
    public static final int IlIlIlIlIlllllllllIl = 63;
    public static final int llIllIIIIIllIlIIIIlI = 64;
    public static final String IlIIIlIlIIIllIlIlIIl = "texture.potion_overlay";
    public static final String IlIlIIIllIllIIIIIllI = "texture.potion_bottle_splash";
    public static final String IllIIlllIIIIlllIIlIl = "texture.potion_bottle_drinkable";
    public static final String llllIIIlIlllIlIIIIIl = "items/potion_overlay";
    public static final String lIIIIlIIIIIlllIllIII = "items/potion_bottle_splash";
    public static final String lIIIlllIIIllIIIllIII = "items/potion_bottle_drinkable";
    private static final int[][] IlIllIlIlIIIlIlIlIII;
    private static final String IIlllIIlIllIllIlIIll = "normal";
    private static final String lllIIIIlllllIlIIllIl = "splash";
    private static final String IlIlIIIIIIlllIlIllIl = "linger";
    
    static {
        lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl = null;
        lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI = null;
        lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI = null;
        lIllllllIIllIlIlIlII.IlIlIIIllIIllIlllllI = new IIIIlllIIIIIIlIIIlll();
        lIllllllIIllIlIlIlII.IIIIlllIIIIIIlIIIlll = true;
        lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll = false;
        IlIllIlIlIIIlIlIlIII = new int[0][];
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl = null;
        lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI = null;
        lIllllllIIllIlIlIlII.IIIIlllIIIIIIlIIIlll = true;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.p()) {
            llllIIIIlIIIlIlllIll("mcpatcher/cit.properties");
            final llllIIllllIlIlIIIIll[] lllllIIIIIlIlIIIIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl();
            for (int i = lllllIIIIIlIlIIIIIIl.length - 1; i >= 0; --i) {
                llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl[i]);
            }
            llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllIIIIIlllIIlIIllI());
            if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl.length <= 0) {
                lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl = null;
            }
            if (lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI.length <= 0) {
                lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI = null;
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s) {
        try {
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
            if (llllIIIIlIIIlIlllIll == null) {
                return;
            }
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomItems: Loading " + s);
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            lIllllllIIllIlIlIlII.IIIIlllIIIIIIlIIIlll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.getProperty("useGlint"), true);
        }
        catch (FileNotFoundException ex2) {}
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        String[] llllIIIIlIIIlIlllIll = IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, "mcpatcher/cit/", ".properties", null);
        final Map ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll);
        if (ilIlIlIlIlllllllllIl.size() > 0) {
            final Set keySet = ilIlIlIlIlllllllllIl.keySet();
            llllIIIIlIIIlIlllIll = (String[])net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, keySet.toArray(new String[keySet.size()]));
        }
        Arrays.sort(llllIIIIlIIIlIlllIll);
        final List llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl);
        final List llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomItems: " + s);
            try {
                lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = null;
                if (ilIlIlIlIlllllllllIl.containsKey(s)) {
                    lllllIlIIIlIlIIlllII = ilIlIlIlIlllllllllIl.get(s);
                }
                if (lllllIlIIIlIlIIlllII == null) {
                    final InputStream llllIIIIlIIIlIlllIll4 = llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
                    if (llllIIIIlIIIlIlllIll4 == null) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomItems file not found: " + s);
                        continue;
                    }
                    final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                    llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll4);
                    llllIIIIlIIIlIlllIll4.close();
                    lllllIlIIIlIlIIlllII = new lllllIlIIIlIlIIlllII(llIIlllIIlllIIllIllI, s);
                }
                if (lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(s)) {
                    llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll2);
                    IlIlIlIlIlllllllllIl(lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll3);
                }
            }
            catch (FileNotFoundException ex2) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("CustomItems file not found: " + s);
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
        final Comparator ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl();
        for (int j = 0; j < lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl.length; ++j) {
            final lllllIlIIIlIlIIlllII[] array = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl[j];
            if (array != null) {
                Arrays.sort(array, ilIIIlIlIIIllIlIlIIl);
            }
        }
        for (int k = 0; k < lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI.length; ++k) {
            final lllllIlIIIlIlIIlllII[] array2 = lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI[k];
            if (array2 != null) {
                Arrays.sort(array2, ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    private static Comparator IlIIIlIlIIIllIlIlIIl() {
        return new net.optifine.llIIlllIIlllIIllIllI();
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        final Iterator<lllllIlIIIlIlIIlllII> iterator = IlIlIIIllIllIIIIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final Iterator<lllllIlIIIlIlIIlllII> iterator = IlIlIIIllIllIIIIIllI().iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        }
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        for (final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII : IlIlIIIllIllIIIIIllI()) {
            if (lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI == 1) {
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(Minecraft.getMinecraft().IlIllllIIlIIlIlIlIll(), lIllllllIIllIlIlIlII.IlIlIIIllIIllIlllllI);
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll();
            }
        }
    }
    
    private static List IlIlIIIllIllIIIIIllI() {
        final ArrayList list = new ArrayList();
        llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl, list);
        llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI, list);
        return list;
    }
    
    private static void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII[][] array, final List list) {
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final lllllIlIIIlIlIIlllII[] array2 = array[i];
                if (array2 != null) {
                    for (int j = 0; j < array2.length; ++j) {
                        final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = array2[j];
                        if (lllllIlIIIlIlIIlllII != null) {
                            list.add(lllllIlIIIlIlIIlllII);
                        }
                    }
                }
            }
        }
    }
    
    private static Map IlIlIlIlIlllllllllIl(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll) {
        final HashMap hashMap = new HashMap();
        hashMap.putAll(llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, "normal", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.D)));
        hashMap.putAll(llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, "splash", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.D)));
        hashMap.putAll(llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, "linger", net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.D)));
        return hashMap;
    }
    
    private static Map llllIIIIlIIIlIlllIll(final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll, final String s, final int n) {
        final HashMap<String, lllllIlIIIlIlIIlllII> hashMap = new HashMap<String, lllllIlIIIlIlIIlllII>();
        final String string = String.valueOf(s) + "/";
        final String[] array = { "mcpatcher/cit/potion/" + string, "mcpatcher/cit/Potion/" + string };
        final String[] array2 = { ".png" };
        final String[] llllIIIIlIIIlIlllIll = IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll, array, array2);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            final Properties llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(s2, array, array2), s, n, s2);
            if (llllIIIIlIIIlIlllIll2 != null) {
                final String string2 = String.valueOf(IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(s2, array2)) + ".properties";
                hashMap.put(string2, new lllllIlIIIlIlIIlllII(llllIIIIlIIIlIlllIll2, string2));
            }
        }
        return hashMap;
    }
    
    private static Properties llllIIIIlIIIlIlllIll(final String s, final String s2, int llllIIIIlIIIlIlllIll, final String s3) {
        if (IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(s, new String[] { "_n", "_s" })) {
            return null;
        }
        if (s.equals("empty") && s2.equals("normal")) {
            llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(IIllIIllIIIlIlIIIIlI.E);
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            ((Hashtable<String, String>)llIIlllIIlllIIllIllI).put("type", "item");
            ((Hashtable<String, String>)llIIlllIIlllIIllIllI).put("items", new StringBuilder().append(llllIIIIlIIIlIlllIll).toString());
            return llIIlllIIlllIIllIllI;
        }
        final int[] array = IllIIlllIIIIlllIIlIl().get(s);
        if (array == null) {
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Potion not found for image: " + s3);
            return null;
        }
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < array.length; ++i) {
            int n = array[i];
            if (s2.equals("splash")) {
                n |= 0x4000;
            }
            if (i > 0) {
                sb.append(" ");
            }
            sb.append(n);
        }
        int n2 = 16447;
        if (s.equals("water") || s.equals("mundane")) {
            n2 |= 0x40;
        }
        final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI2 = new llIIlllIIlllIIllIllI();
        ((Hashtable<String, String>)llIIlllIIlllIIllIllI2).put("type", "item");
        ((Hashtable<String, String>)llIIlllIIlllIIllIllI2).put("items", new StringBuilder().append(llllIIIIlIIIlIlllIll).toString());
        ((Hashtable<String, String>)llIIlllIIlllIIllIllI2).put("damage", new StringBuilder().append(sb.toString()).toString());
        ((Hashtable<String, String>)llIIlllIIlllIIllIllI2).put("damageMask", new StringBuilder().append(n2).toString());
        if (s2.equals("splash")) {
            ((Hashtable<String, String>)llIIlllIIlllIIllIllI2).put("texture.potion_bottle_splash", s);
        }
        else {
            ((Hashtable<String, String>)llIIlllIIlllIIllIllI2).put("texture.potion_bottle_drinkable", s);
        }
        return llIIlllIIlllIIllIllI2;
    }
    
    private static Map IllIIlllIIIIlllIIlIl() {
        if (lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI == null) {
            (lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI = new LinkedHashMap()).put("water", llllIIIIlIIIlIlllIll(0, 0));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("awkward", llllIIIIlIIIlIlllIll(0, 1));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("thick", llllIIIIlIIIlIlllIll(0, 2));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("potent", llllIIIIlIIIlIlllIll(0, 3));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("regeneration", llllIIIIlIIIlIlllIll(1));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("movespeed", llllIIIIlIIIlIlllIll(2));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("fireresistance", llllIIIIlIIIlIlllIll(3));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("poison", llllIIIIlIIIlIlllIll(4));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("heal", llllIIIIlIIIlIlllIll(5));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("nightvision", llllIIIIlIIIlIlllIll(6));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("clear", llllIIIIlIIIlIlllIll(7, 0));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("bungling", llllIIIIlIIIlIlllIll(7, 1));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("charming", llllIIIIlIIIlIlllIll(7, 2));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("rank", llllIIIIlIIIlIlllIll(7, 3));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("weakness", llllIIIIlIIIlIlllIll(8));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("damageboost", llllIIIIlIIIlIlllIll(9));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("moveslowdown", llllIIIIlIIIlIlllIll(10));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("leaping", llllIIIIlIIIlIlllIll(11));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("harm", llllIIIIlIIIlIlllIll(12));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("waterbreathing", llllIIIIlIIIlIlllIll(13));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("invisibility", llllIIIIlIIIlIlllIll(14));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("thin", llllIIIIlIIIlIlllIll(15, 0));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("debonair", llllIIIIlIIIlIlllIll(15, 1));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("sparkling", llllIIIIlIIIlIlllIll(15, 2));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("stinky", llllIIIIlIIIlIlllIll(15, 3));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("mundane", llllIIIIlIIIlIlllIll(0, 4));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("speed", lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.get("movespeed"));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("fire_resistance", lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.get("fireresistance"));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("instant_health", lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.get("heal"));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("night_vision", lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.get("nightvision"));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("strength", lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.get("damageboost"));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("slowness", lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.get("moveslowdown"));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("instant_damage", lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.get("harm"));
            lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.put("water_breathing", lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI.get("waterbreathing"));
        }
        return lIllllllIIllIlIlIlII.lIlIlIIIllIIllIIIllI;
    }
    
    private static int[] llllIIIIlIIIlIlllIll(final int n) {
        return new int[] { n, n + 16, n + 32, n + 48 };
    }
    
    private static int[] llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return new int[] { n + n2 * 16 };
    }
    
    private static int IlIlIlIlIlllllllllIl(final String s) {
        final String string = "potion." + s;
        final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll[i];
            if (llllIIIIlIIIlIlllIll2 != null && string.equals(llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl())) {
                return llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
            }
        }
        return -1;
    }
    
    private static List llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII[][] array) {
        final ArrayList<ArrayList> list = new ArrayList<ArrayList>();
        if (array != null) {
            for (int i = 0; i < array.length; ++i) {
                final lllllIlIIIlIlIIlllII[] array2 = array[i];
                ArrayList list2 = null;
                if (array2 != null) {
                    list2 = new ArrayList(Arrays.asList(array2));
                }
                list.add(list2);
            }
        }
        return list;
    }
    
    private static lllllIlIIIlIlIIlllII[][] llllIIIIlIIIlIlllIll(final List list) {
        final lllllIlIIIlIlIIlllII[][] array = new lllllIlIIIlIlIIlllII[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            final List list2 = list.get(i);
            if (list2 != null) {
                final lllllIlIIIlIlIIlllII[] array2 = (lllllIlIIIlIlIIlllII[])list2.toArray(new lllllIlIIIlIlIIlllII[list2.size()]);
                Arrays.sort(array2, new IIlllIIIlIlllIIlllII());
                array[i] = array2;
            }
        }
        return array;
    }
    
    private static void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final List list) {
        if (lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl != null) {
            for (int i = 0; i < lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                final int n = lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl[i];
                if (n <= 0) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid item ID: " + n);
                }
                else {
                    llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, list, n);
                }
            }
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final List list) {
        if (lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI == 2 && lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI != null) {
            for (int i = 0; i < 256; ++i) {
                if (lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(i)) {
                    llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, list, i);
                }
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final List list, final int i) {
        while (i >= list.size()) {
            list.add(null);
        }
        List<lllllIlIIIlIlIIlllII> list2 = list.get(i);
        if (list2 == null) {
            list2 = new ArrayList<lllllIlIIIlIlIIlllII>();
            list.set(i, list2);
        }
        list2.add(lllllIlIIIlIlIIlllII);
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lIllllIllIllIIllllll lIllllIllIllIIllllll, final boolean b) {
        if (!b && ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()) {
            return ilIlIlIlIlllllllllIl;
        }
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl == null) {
            return ilIlIlIlIlllllllllIl;
        }
        final lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, 1);
        if (llllIIIIlIIIlIlllIll == null) {
            return ilIlIlIlIlllllllllIl;
        }
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, b);
        return (llllIIIIlIIIlIlllIll2 != null) ? llllIIIIlIIIlIlllIll2 : ilIlIlIlIlllllllllIl;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final String s) {
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl == null) {
            return false;
        }
        final lIllllIllIllIIllllll ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl, n, s);
        if (ilIlIlIlIlllllllllIl == null) {
            return false;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        return true;
    }
    
    private static lIllllIllIllIIllllll IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n, final String s) {
        final lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, 3);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        if (llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII == null) {
            return llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII;
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        if (!(llllIIIIlIIIlIlllIll2 instanceof IIIlIIlIIIIlllIlllII)) {
            return null;
        }
        final String llIllIIIIIllIlIIIIlI = ((IIIlIIlIIIIlllIlllII)llllIIIIlIIIlIlllIll2).lllIIIIlllllIlIIllIl().llIllIIIIIllIlIIIIlI();
        final StringBuffer sb = new StringBuffer();
        sb.append("texture.");
        sb.append(llIllIIIIIllIlIIIIlI);
        sb.append("_layer_");
        sb.append(n);
        if (s != null) {
            sb.append("_");
            sb.append(s);
        }
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII.get(sb.toString());
        return (lIllllIllIllIIllllll == null) ? llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII : lIllllIllIllIIllllll;
    }
    
    private static lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl == null) {
            return null;
        }
        if (lllIIIIlIlIllIIlIIIl == null) {
            return null;
        }
        final int llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll());
        if (llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl.length) {
            final lllllIlIIIlIlIIlllII[] array = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl[llllIIIIlIIIlIlllIll];
            if (array != null) {
                for (int i = 0; i < array.length; ++i) {
                    final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = array[i];
                    if (lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI == n && llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, lllIIIIlIlIllIIlIIIl, null)) {
                        return lllllIlIIIlIlIIlllII;
                    }
                }
            }
        }
        return null;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int[][] array) {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        if (lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII != null) {
            int llllIIIlIlllIlIIIIIl = lllIIIIlIlIllIIlIIIl.llllIIIlIlllIlIIIIIl();
            if (lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI != 0) {
                llllIIIlIlllIlIIIIIl &= lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI;
            }
            if (lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl) {
                llllIIIlIlllIlIIIIIl = (int)(llllIIIlIlllIlIIIIIl * 100 / (double)llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
            }
            if (!lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl)) {
                return false;
            }
        }
        if (lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI != null && !lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl)) {
            return false;
        }
        int[][] array2 = array;
        if (lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI != null) {
            if (array == null) {
                array2 = llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
            }
            boolean b = false;
            for (int i = 0; i < array2.length; ++i) {
                if (lllllIlIIIlIlIIlllII.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(array2[i][0])) {
                    b = true;
                    break;
                }
            }
            if (!b) {
                return false;
            }
        }
        if (lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll != null) {
            if (array2 == null) {
                array2 = llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
            }
            boolean b2 = false;
            for (int j = 0; j < array2.length; ++j) {
                if (lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(array2[j][1])) {
                    b2 = true;
                    break;
                }
            }
            if (!b2) {
                return false;
            }
        }
        if (lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll != null) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
            for (int k = 0; k < lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll.length; ++k) {
                if (!lllllIlIIIlIlIIlllII.llllIIllllIlIlIIIIll[k].llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll)) {
                    return false;
                }
            }
        }
        if (lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII != 0) {
            if (lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII == 1 && lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll) {
                return false;
            }
            if (lllllIlIIIlIlIIlllII.IlIllIlIlIIIlIlIlIII == 2 && !lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll) {
                return false;
            }
        }
        return true;
    }
    
    private static int[][] llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ah) ? IIllIIllIIIlIlIIIIlI.ah.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl) : lllIIIIlIlIllIIlIIIl.IlIllIlIlIIIlIlIlIII();
        if (ilIlIIIlIIlIlIIlllIl != null && ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI() > 0) {
            final int[][] array = new int[ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI()][2];
            for (int i = 0; i < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(); ++i) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl(i);
                final short ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI("id");
                final short ilIlIIIllIllIIIIIllI2 = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI("lvl");
                array[i][0] = ilIlIIIllIllIIIIIllI;
                array[i][1] = ilIlIIIllIllIIIIIllI2;
            }
            return array;
        }
        return lIllllllIIllIlIlIlII.IlIllIlIlIIIlIlIlIII;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IIlllIlIIllIlIlIlIIl illlIlIIllIlIlIlIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI == null) {
            return false;
        }
        if (lllIIIIlIlIllIIlIIIl == null) {
            return false;
        }
        final int[][] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        if (llllIIIIlIIIlIlllIll.length <= 0) {
            return false;
        }
        Set<Integer> set = null;
        boolean b = false;
        final IIlllIIlIllIllIlIIll llIIIlIlllIllIIlIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final int n = llllIIIIlIIIlIlllIll[i][0];
            if (n >= 0 && n < lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI.length) {
                final lllllIlIIIlIlIIlllII[] array = lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI[n];
                if (array != null) {
                    for (int j = 0; j < array.length; ++j) {
                        final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = array[j];
                        if (set == null) {
                            set = new HashSet<Integer>();
                        }
                        if (set.add(n) && llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll) && lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII != null) {
                            llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII);
                            final float llllIIIIlIIIlIlllIll2 = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(llIIIlIlllIllIIlIllI);
                            if (!b) {
                                b = true;
                                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(514);
                                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
                            }
                            net.optifine.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll, 1.0f);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2 / 2.0f, llllIIIIlIIIlIlllIll2 / 2.0f, llllIIIIlIIIlIlllIll2 / 2.0f);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(lllllIlIIIlIlIIlllII.lllIIIIlllllIlIIllIl * (Minecraft.IIIllllllIllIIIlllIl() % 3000L) / 3000.0f / 8.0f, 0.0f, 0.0f);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(lllllIlIIIlIlIIlllII.IlIlIIIIIIlllIlIllIl, 0.0f, 0.0f, 1.0f);
                            illlIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, -1);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
                        }
                    }
                }
            }
        }
        if (b) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl);
        }
        return b;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7) {
        if (lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI == null) {
            return false;
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b() && net.optifine.shaders.llIIlllIIlllIIllIllI.IIlllIIlIllIllIlIIll) {
            return false;
        }
        if (lllIIIIlIlIllIIlIIIl == null) {
            return false;
        }
        final int[][] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        if (llllIIIIlIIIlIlllIll.length <= 0) {
            return false;
        }
        Set<Integer> set = null;
        boolean b = false;
        final IIlllIIlIllIllIlIIll llIIIlIlllIllIIlIllI = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final int n8 = llllIIIIlIIIlIlllIll[i][0];
            if (n8 >= 0 && n8 < lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI.length) {
                final lllllIlIIIlIlIIlllII[] array = lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI[n8];
                if (array != null) {
                    for (int j = 0; j < array.length; ++j) {
                        final lllllIlIIIlIlIIlllII lllllIlIIIlIlIIlllII = array[j];
                        if (set == null) {
                            set = new HashSet<Integer>();
                        }
                        if (set.add(n8) && llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII, lllIIIIlIlIllIIlIIIl, llllIIIIlIIIlIlllIll) && lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII != null) {
                            llIIIlIlllIllIIlIllI.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IlllllllIIIlIIIlIlII);
                            final float llllIIIIlIIIlIlllIll2 = lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(llIIIlIlllIllIIlIllI);
                            if (!b) {
                                b = true;
                                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                                    net.optifine.shaders.IIlllIIIlIlllIIlllII.llllIIllllIlIlIIIIll();
                                }
                                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
                                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(514);
                                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(false);
                            }
                            net.optifine.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllllIlIIIlIlIIlllII.IIlllIIlIllIllIlIIll, 1.0f);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(lllllIlIIIlIlIIlllII.IlIlIIIIIIlllIlIllIl, 0.0f, 0.0f, 1.0f);
                            final float n9 = llllIIIIlIIIlIlllIll2 / 8.0f;
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(n9, n9 / 2.0f, n9);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, lllllIlIIIlIlIIlllII.lllIIIIlllllIlIIllIl * (Minecraft.IIIllllllIllIIIlllIl() % 3000L) / 3000.0f / 8.0f, 0.0f);
                            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, n, n2, n4, n5, n6, n7);
                        }
                    }
                }
            }
        }
        if (b) {
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(770, 771);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5890);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIIIlIlIllIIlIlIlII();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI(5888);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IlIlIIIllIllIIIIIllI();
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(true);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(515);
            net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.b()) {
                net.optifine.shaders.IIlllIIIlIlllIIlllII.IlIllIlIlIIIlIlIlIII();
            }
        }
        return b;
    }
    
    public static boolean llIllIIIIIllIlIIIIlI() {
        return lIllllllIIllIlIlIlII.IIIIlllIIIIIIlIIIlll;
    }
}
