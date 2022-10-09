package net.optifine;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import net.optifine.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import org.lwjgl.opengl.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class lllllIlIIIlIlIIlllII
{
    public String llllIIIIlIIIlIlllIll;
    public String IlIlIlIlIlllllllllIl;
    public int llIllIIIIIllIlIIIIlI;
    public int[] IlIIIlIlIIIllIlIlIIl;
    public String IlIlIIIllIllIIIIIllI;
    public Map IllIIlllIIIIlllIIlIl;
    public String llllIIIlIlllIlIIIIIl;
    public Map lIIIIlIIIIIlllIllIII;
    public llllIIllllIlIlIIIIll lIIIlllIIIllIIIllIII;
    public boolean llIIlIIIlIIIllIlIIIl;
    public int llIllIlIIIIllIlIIllI;
    public llllIIllllIlIlIIIIll lIlIlIIIllIIllIIIllI;
    public llllIIllllIlIlIIIIll IlIlIIIllIIllIlllllI;
    public llllIIllllIlIlIIIIll IIIIlllIIIIIIlIIIlll;
    public lIlIlIIIllIIllIIIllI[] llllIIllllIlIlIIIIll;
    public int IlIllIlIlIIIlIlIlIII;
    public int IIlllIIlIllIllIlIIll;
    public float lllIIIIlllllIlIIllIl;
    public float IlIlIIIIIIlllIlIllIl;
    public int IIllIIllIIIlIlIIIIlI;
    public float IIIlIIIlIlIIlllIIlll;
    public int IlIlIIIlIIlIlIIlllIl;
    public lIllllIllIllIIllllll IlllllllIIIlIIIlIlII;
    public Map IIlIIIIlllIlllllIlII;
    public IlIlIIIllIIllIlllllI IIIlIIlIIIIlllIlllII;
    public Map IlIlIllllllllIIIIlII;
    public IlIlIlIlIlllllllllIl IIlllIlIIllIlIlIlIIl;
    public Map llIIIlIlIllIIlIlIlII;
    public IlIlIlIlIlllllllllIl lllllIlIIIlIlIIlllII;
    public Map lIllllllIIllIlIlIlII;
    private int IIllllIIIlIIIIIIllIl;
    private int IlllIIIIlIIIlIlIlIIl;
    public static final int llIIlllIIlllIIllIllI = 0;
    public static final int IIlllIIIlIlllIIlllII = 1;
    public static final int IIlIIIIIllIlIIIlIIll = 2;
    public static final int llllllIllIllIlIllllI = 3;
    public static final int IIIllllllIllIIIlllIl = 0;
    public static final int IlIIIlIIIllllIlIlIlI = 1;
    public static final int IIIIIllIIIIlIIIIllIl = 2;
    public static final String IIIIIIIIIlllIllIlIlI = "inventory";
    
    public lllllIlIIIlIlIIlllII(final Properties properties, final String s) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = 1;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = null;
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = null;
        this.lIIIlllIIIllIIIllIII = null;
        this.llIIlIIIlIIIllIlIIIl = false;
        this.llIllIlIIIIllIlIIllI = 0;
        this.lIlIlIIIllIIllIIIllI = null;
        this.IlIlIIIllIIllIlllllI = null;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.llllIIllllIlIlIIIIll = null;
        this.IlIllIlIlIIIlIlIlIII = 0;
        this.IIlllIIlIllIllIlIIll = 1;
        this.lllIIIIlllllIlIIllIl = 0.0f;
        this.IlIlIIIIIIlllIlIllIl = 0.0f;
        this.IIllIIllIIIlIlIIIIlI = 0;
        this.IIIlIIIlIlIIlllIIlll = 1.0f;
        this.IlIlIIIlIIlIlIIlllIl = 0;
        this.IlllllllIIIlIIIlIlII = null;
        this.IIlIIIIlllIlllllIlII = null;
        this.IIIlIIlIIIIlllIlllII = null;
        this.IlIlIllllllllIIIIlII = null;
        this.IIlllIlIIllIlIlIlIIl = null;
        this.llIIIlIlIllIIlIlIlII = null;
        this.lllllIlIIIlIlIIlllII = null;
        this.lIllllllIIllIlIlIlII = null;
        this.IIllllIIIlIIIIIIllIl = 0;
        this.IlllIIIIlIIIlIlIlIIl = 0;
        this.llllIIIIlIIIlIlllIll = IlIlIlIlIlllllllllIl(s);
        this.IlIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI(s);
        this.llIllIIIIIllIlIIIIlI = this.IlIIIlIlIIIllIlIlIIl(properties.getProperty("type"));
        this.IlIIIlIlIIIllIlIlIIl = this.llllIIIIlIIIlIlllIll(properties.getProperty("items"), properties.getProperty("matchItems"));
        this.lIIIIlIIIIIlllIllIII = IlIlIlIlIlllllllllIl(properties, this.IlIlIlIlIlllllllllIl);
        this.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll(properties.getProperty("model"), s, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.lIIIIlIIIIIlllIllIII);
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll(properties, this.IlIlIlIlIlllllllllIl);
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll(properties.getProperty("texture"), properties.getProperty("tile"), properties.getProperty("source"), s, this.IlIlIlIlIlllllllllIl, this.llIllIIIIIllIlIIIIlI, this.IllIIlllIIIIlllIIlIl, this.lIIIIlIIIIIlllIllIII == null && this.llllIIIlIlllIlIIIIIl == null);
        final String property = properties.getProperty("damage");
        if (property != null) {
            this.llIIlIIIlIIIllIlIIIl = property.contains("%");
            this.lIIIlllIIIllIIIllIII = this.IlIlIIIllIllIIIIIllI(property.replace("%", ""));
            this.llIllIlIIIIllIlIIllI = this.llllIIIIlIIIlIlllIll(properties.getProperty("damageMask"), 0);
        }
        this.lIlIlIIIllIIllIIIllI = this.IlIlIIIllIllIIIIIllI(properties.getProperty("stackSize"));
        this.IlIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll(properties.getProperty("enchantmentIDs"), new net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI());
        this.IIIIlllIIIIIIlIIIlll = this.IlIlIIIllIllIIIIIllI(properties.getProperty("enchantmentLevels"));
        this.llllIIllllIlIlIIIIll = this.llllIIIIlIIIlIlllIll(properties);
        this.IlIllIlIlIIIlIlIlIII = this.llllIIIlIlllIlIIIIIl(properties.getProperty("hand"));
        this.IIlllIIlIllIllIlIIll = net.optifine.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(properties.getProperty("blend"));
        this.lllIIIIlllllIlIIllIl = this.llllIIIIlIIIlIlllIll(properties.getProperty("speed"), 0.0f);
        this.IlIlIIIIIIlllIlIllIl = this.llllIIIIlIIIlIlllIll(properties.getProperty("rotation"), 0.0f);
        this.IIllIIllIIIlIlIIIIlI = this.llllIIIIlIIIlIlllIll(properties.getProperty("layer"), 0);
        this.IlIlIIIlIIlIlIIlllIl = this.llllIIIIlIIIlIlllIll(properties.getProperty("weight"), 0);
        this.IIIlIIIlIlIIlllIIlll = this.llllIIIIlIIIlIlllIll(properties.getProperty("duration"), 1.0f);
    }
    
    private static String IlIlIlIlIlllllllllIl(final String s) {
        String s2 = s;
        final int lastIndex = s.lastIndexOf(47);
        if (lastIndex >= 0) {
            s2 = s.substring(lastIndex + 1);
        }
        final int lastIndex2 = s2.lastIndexOf(46);
        if (lastIndex2 >= 0) {
            s2 = s2.substring(0, lastIndex2);
        }
        return s2;
    }
    
    private static String llIllIIIIIllIlIIIIlI(final String s) {
        final int lastIndex = s.lastIndexOf(47);
        return (lastIndex < 0) ? "" : s.substring(0, lastIndex);
    }
    
    private int IlIIIlIlIIIllIlIlIIl(final String s) {
        if (s == null) {
            return 1;
        }
        if (s.equals("item")) {
            return 1;
        }
        if (s.equals("enchantment")) {
            return 2;
        }
        if (s.equals("armor")) {
            return 3;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown method: " + s);
        return 0;
    }
    
    private int[] llllIIIIlIIIlIlllIll(String trim, final String s) {
        if (trim == null) {
            trim = s;
        }
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        final TreeSet<Integer> set = new TreeSet<Integer>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, -1);
            if (llllIIIIlIIIlIlllIll2 >= 0) {
                set.add(new Integer(llllIIIIlIIIlIlllIll2));
            }
            else {
                if (s2.contains("-")) {
                    final String[] llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, "-");
                    if (llllIIIIlIIIlIlllIll3.length == 2) {
                        final int llllIIIIlIIIlIlllIll4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3[0], -1);
                        final int llllIIIIlIIIlIlllIll5 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3[1], -1);
                        if (llllIIIIlIIIlIlllIll4 >= 0 && llllIIIIlIIIlIlllIll5 >= 0) {
                            final int min = Math.min(llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll5);
                            for (int max = Math.max(llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll5), j = min; j <= max; ++j) {
                                set.add(new Integer(j));
                            }
                            continue;
                        }
                    }
                }
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll6 = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s2);
                if (llllIIIIlIIIlIlllIll6 == null) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Item not found: " + s2);
                }
                else {
                    final int llllIIIIlIIIlIlllIll7 = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll6);
                    if (llllIIIIlIIIlIlllIll7 <= 0) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Item not found: " + s2);
                    }
                    else {
                        set.add(new Integer(llllIIIIlIIIlIlllIll7));
                    }
                }
            }
        }
        final Integer[] array = set.toArray(new Integer[set.size()]);
        final int[] array2 = new int[array.length];
        for (int k = 0; k < array2.length; ++k) {
            array2[k] = array[k];
        }
        return array2;
    }
    
    private static String llllIIIIlIIIlIlllIll(String s, final String s2, final String s3, final String s4, final String s5, final int n, final Map map, final boolean b) {
        if (s == null) {
            s = s2;
        }
        if (s == null) {
            s = s3;
        }
        if (s != null) {
            final String s6 = ".png";
            if (s.endsWith(s6)) {
                s = s.substring(0, s.length() - s6.length());
            }
            s = IlIlIlIlIlllllllllIl(s, s5);
            return s;
        }
        if (n == 3) {
            return null;
        }
        if (map != null) {
            final String s7 = map.get("texture.bow_standby");
            if (s7 != null) {
                return s7;
            }
        }
        if (!b) {
            return null;
        }
        String s8 = s4;
        final int lastIndex = s4.lastIndexOf(47);
        if (lastIndex >= 0) {
            s8 = s4.substring(lastIndex + 1);
        }
        final int lastIndex2 = s8.lastIndexOf(46);
        if (lastIndex2 >= 0) {
            s8 = s8.substring(0, lastIndex2);
        }
        return IlIlIlIlIlllllllllIl(s8, s5);
    }
    
    private static Map llllIIIIlIIIlIlllIll(final Properties properties, final String s) {
        final Map llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(properties, "texture.");
        if (llIllIIIIIllIlIIIIlI.size() <= 0) {
            return null;
        }
        final Set<String> keySet = llIllIIIIIllIlIIIIlI.keySet();
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (final String s2 : keySet) {
            linkedHashMap.put(s2, IlIlIlIlIlllllllllIl((String)llIllIIIIIllIlIIIIlI.get(s2), s));
        }
        return linkedHashMap;
    }
    
    private static String IlIlIlIlIlllllllllIl(String s, final String s2) {
        s = net.optifine.util.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(s, s2);
        if (!s.startsWith(s2) && !s.startsWith("textures/") && !s.startsWith("mcpatcher/")) {
            s = String.valueOf(s2) + "/" + s;
        }
        if (s.endsWith(".png")) {
            s = s.substring(0, s.length() - 4);
        }
        if (s.startsWith("/")) {
            s = s.substring(1);
        }
        return s;
    }
    
    private static String llllIIIIlIIIlIlllIll(String s, final String s2, final String s3, final int n, final Map map) {
        if (s != null) {
            final String s4 = ".json";
            if (s.endsWith(s4)) {
                s = s.substring(0, s.length() - s4.length());
            }
            s = llIllIIIIIllIlIIIIlI(s, s3);
            return s;
        }
        if (n == 3) {
            return null;
        }
        if (map != null) {
            final String s5 = map.get("model.bow_standby");
            if (s5 != null) {
                return s5;
            }
        }
        return s;
    }
    
    private static Map IlIlIlIlIlllllllllIl(final Properties properties, final String s) {
        final Map llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(properties, "model.");
        if (llIllIIIIIllIlIIIIlI.size() <= 0) {
            return null;
        }
        final Set<String> keySet = llIllIIIIIllIlIIIIlI.keySet();
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (final String s2 : keySet) {
            linkedHashMap.put(s2, llIllIIIIIllIlIIIIlI((String)llIllIIIIIllIlIIIIlI.get(s2), s));
        }
        return linkedHashMap;
    }
    
    private static String llIllIIIIIllIlIIIIlI(String s, final String s2) {
        s = net.optifine.util.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(s, s2);
        final boolean b = s.startsWith("block/") || s.startsWith("item/");
        if (!s.startsWith(s2) && !b && !s.startsWith("mcpatcher/")) {
            s = String.valueOf(s2) + "/" + s;
        }
        final String s3 = ".json";
        if (s.endsWith(s3)) {
            s = s.substring(0, s.length() - s3.length());
        }
        if (s.startsWith("/")) {
            s = s.substring(1);
        }
        return s;
    }
    
    private int llllIIIIlIIIlIlllIll(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, Integer.MIN_VALUE);
        if (llllIIIIlIIIlIlllIll == Integer.MIN_VALUE) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid integer: " + trim);
            return n;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private float llllIIIIlIIIlIlllIll(String trim, final float n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        final float llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, Float.MIN_VALUE);
        if (llllIIIIlIIIlIlllIll == Float.MIN_VALUE) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid float: " + trim);
            return n;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private llllIIllllIlIlIIIIll IlIlIIIllIllIIIIIllI(final String s) {
        return this.llllIIIIlIIIlIlllIll(s, (lIIIIlIIIIIlllIllIII)null);
    }
    
    private llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll(final String s, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        if (s == null) {
            return null;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = new llllIIllllIlIlIIIIll();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            if (liiiIlIIIIIlllIllIII != null) {
                final int llllIIIIlIIIlIlllIll2 = liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(s2, Integer.MIN_VALUE);
                if (llllIIIIlIIIlIlllIll2 != Integer.MIN_VALUE) {
                    llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll2));
                    continue;
                }
            }
            final IIIIlllIIIIIIlIIIlll illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl(s2);
            if (illIIlllIIIIlllIIlIl == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid range list: " + s);
                return null;
            }
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
        }
        return llllIIllllIlIlIIIIll;
    }
    
    private IIIIlllIIIIIIlIIIlll IllIIlllIIIIlllIIlIl(String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (trim.length() - trim.replace("-", "").length() > 1) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid range: " + trim);
            return null;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, "- ");
        final int[] array = new int[llllIIIIlIIIlIlllIll.length];
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i], -1);
            if (llllIIIIlIIIlIlllIll2 < 0) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid range: " + trim);
                return null;
            }
            array[i] = llllIIIIlIIIlIlllIll2;
        }
        if (array.length == 1) {
            final int n = array[0];
            if (trim.startsWith("-")) {
                return new IIIIlllIIIIIIlIIIlll(0, n);
            }
            if (trim.endsWith("-")) {
                return new IIIIlllIIIIIIlIIIlll(n, 65535);
            }
            return new IIIIlllIIIIIIlIIIlll(n, n);
        }
        else {
            if (array.length == 2) {
                return new IIIIlllIIIIIIlIIIlll(Math.min(array[0], array[1]), Math.max(array[0], array[1]));
            }
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid range: " + trim);
            return null;
        }
    }
    
    private lIlIlIIIllIIllIIIllI[] llllIIIIlIIIlIlllIll(final Properties properties) {
        final String s = "nbt.";
        final Map llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(properties, s);
        if (llIllIIIIIllIlIIIIlI.size() <= 0) {
            return null;
        }
        final ArrayList<lIlIlIIIllIIllIIIllI> list = new ArrayList<lIlIlIIIllIIllIIIllI>();
        for (final String s2 : llIllIIIIIllIlIIIIlI.keySet()) {
            list.add(new lIlIlIIIllIIllIIIllI(s2.substring(s.length()), (String)llIllIIIIIllIlIIIIlI.get(s2)));
        }
        return list.toArray(new lIlIlIIIllIIllIIIllI[list.size()]);
    }
    
    private static Map llIllIIIIIllIlIIIIlI(final Properties properties, final String s) {
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        for (final String s2 : ((Hashtable<String, V>)properties).keySet()) {
            final String property = properties.getProperty(s2);
            if (s2.startsWith(s)) {
                linkedHashMap.put(s2, property);
            }
        }
        return linkedHashMap;
    }
    
    private int llllIIIlIlllIlIIIIIl(String lowerCase) {
        if (lowerCase == null) {
            return 0;
        }
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.equals("any")) {
            return 0;
        }
        if (lowerCase.equals("main")) {
            return 1;
        }
        if (lowerCase.equals("off")) {
            return 2;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid hand: " + lowerCase);
        return 0;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (this.llllIIIIlIIIlIlllIll == null || this.llllIIIIlIIIlIlllIll.length() <= 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No name found: " + s);
            return false;
        }
        if (this.IlIlIlIlIlllllllllIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No base path found: " + s);
            return false;
        }
        if (this.llIllIIIIIllIlIIIIlI == 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No type defined: " + s);
            return false;
        }
        if (this.llIllIIIIIllIlIIIIlI == 1 || this.llIllIIIIIllIlIIIIlI == 3) {
            if (this.IlIIIlIlIIIllIlIlIIl == null) {
                this.IlIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl();
            }
            if (this.IlIIIlIlIIIllIlIlIIl == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No items defined: " + s);
                return false;
            }
        }
        if (this.IlIlIIIllIllIIIIIllI == null && this.IllIIlllIIIIlllIIlIl == null && this.llllIIIlIlllIlIIIIIl == null && this.lIIIIlIIIIIlllIllIII == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No texture or model specified: " + s);
            return false;
        }
        if (this.llIllIIIIIllIlIIIIlI == 2 && this.IlIlIIIllIIllIlllllI == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No enchantmentIDs specified: " + s);
            return false;
        }
        return true;
    }
    
    private int[] IlIlIlIlIlllllllllIl() {
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        final int llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        return (int[])((llllIIIIlIIIlIlllIll2 <= 0) ? null : new int[] { llllIIIIlIIIlIlllIll2 });
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        if (this.IlIlIIIllIllIIIIIllI != null) {
            this.IlllllllIIIlIIIlIlII = this.lIIIIlIIIIIlllIllIII(this.IlIlIIIllIllIIIIIllI);
            if (this.llIllIIIIIllIlIIIIlI == 1) {
                this.IIIlIIlIIIIlllIlllII = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII));
            }
        }
        if (this.IllIIlllIIIIlllIIlIl != null) {
            this.IIlIIIIlllIlllllIlII = new HashMap();
            this.IlIlIllllllllIIIIlII = new HashMap();
            for (final String s : this.IllIIlllIIIIlllIIlIl.keySet()) {
                final lIllllIllIllIIllllll liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII(this.IllIIlllIIIIlllIIlIl.get(s));
                this.IIlIIIIlllIlllllIlII.put(s, liiiIlIIIIIlllIllIII);
                if (this.llIllIIIIIllIlIIIIlI == 1) {
                    this.IlIlIllllllllIIIIlII.put(s, ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII)));
                }
            }
        }
    }
    
    private lIllllIllIllIIllllll lIIIIlIIIIIlllIllIII(final String s) {
        if (s == null) {
            return null;
        }
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
        final String llIllIIIIIllIlIIIIlI = lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI();
        String s2 = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        if (!s2.contains("/")) {
            s2 = "textures/items/" + s2;
        }
        final String string = String.valueOf(s2) + ".png";
        final lIllllIllIllIIllllll lIllllIllIllIIllllll2 = new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI, string);
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll2)) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("File not found: " + string);
        }
        return lIllllIllIllIIllllll2;
    }
    
    private lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), net.optifine.util.IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl(), "textures/"), ".png"));
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (this.IlIlIIIllIllIIIIIllI != null || this.IllIIlllIIIIlllIIlIl != null) {
            final String[] ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
            final boolean llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
            this.IIlllIlIIllIlIlIlIIl = llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, iiiIlllIIIIIIlIIIlll, ilIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI);
            if (this.llIllIIIIIllIlIIIIlI == 1 && this.IllIIlllIIIIlllIIlIl != null) {
                for (final String s : this.IllIIlllIIIIlllIIlIl.keySet()) {
                    final String s2 = this.IllIIlllIIIIlllIIlIl.get(s);
                    final String ilIIIlIlIIIllIlIlIIl2 = net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s, "texture.");
                    if (ilIIIlIlIIIllIlIlIIl2.startsWith("bow") || ilIIIlIlIIIllIlIlIIl2.startsWith("fishing_rod") || ilIIIlIlIIIllIlIlIIl2.startsWith("shield")) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, iiiIlllIIIIIIlIIIlll, new String[] { s2 }, llIllIIIIIllIlIIIIlI);
                        if (this.llIIIlIlIllIIlIlIlII == null) {
                            this.llIIIlIlIllIIlIlIlII = new HashMap();
                        }
                        this.llIIIlIlIllIIlIlIlII.put(ilIIIlIlIIIllIlIlIIl2, llllIIIIlIIIlIlllIll);
                    }
                }
            }
        }
    }
    
    private boolean llIllIIIIIllIlIIIIlI() {
        return true;
    }
    
    private static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final String[] array, final boolean b) {
        final String[] array2 = new String[array.length];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(array[i], "textures/");
        }
        return llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, llllIIIIlIIIlIlllIll(array2)), b);
    }
    
    private String[] IlIIIlIlIIIllIlIlIIl() {
        if (this.llIllIIIIIllIlIIIIlI == 1 && this.IlIIIlIlIIIllIlIlIIl.length == 1) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl[0]);
            if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.D && this.lIIIlllIIIllIIIllIII != null && this.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll() > 0) {
                final boolean b = (this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(0).llllIIIIlIIIlIlllIll() & 0x4000) != 0x0;
                final String llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, "texture.potion_overlay", "items/potion_overlay");
                String s;
                if (b) {
                    s = this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, "texture.potion_bottle_splash", "items/potion_bottle_splash");
                }
                else {
                    s = this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, "texture.potion_bottle_drinkable", "items/potion_bottle_drinkable");
                }
                return new String[] { llllIIIIlIIIlIlllIll2, s };
            }
            if (llllIIIIlIIIlIlllIll instanceof IIIlIIlIIIIlllIlllII) {
                final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)llllIIIIlIIIlIlllIll;
                if (iiIlIIlIIIIlllIlllII.lllIIIIlllllIlIIllIl() == net.minecraft.llIllIlIIIIllIlIIllI.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll) {
                    final String s2 = "leather";
                    String s3 = "helmet";
                    if (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 0) {
                        s3 = "helmet";
                    }
                    if (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 1) {
                        s3 = "chestplate";
                    }
                    if (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 2) {
                        s3 = "leggings";
                    }
                    if (iiIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII == 3) {
                        s3 = "boots";
                    }
                    final String string = String.valueOf(s2) + "_" + s3;
                    return new String[] { this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, "texture." + string, "items/" + string), this.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl, "texture." + string + "_overlay", "items/" + string + "_overlay") };
                }
            }
        }
        return new String[] { this.IlIlIIIllIllIIIIIllI };
    }
    
    private String llllIIIIlIIIlIlllIll(final Map map, final String s, final String s2) {
        if (map == null) {
            return s2;
        }
        final String s3 = map.get(s);
        return (s3 == null) ? s2 : s3;
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll(final String[] array) {
        final StringBuffer sb = new StringBuffer();
        sb.append("{\"parent\": \"builtin/generated\",\"textures\": {");
        for (int i = 0; i < array.length; ++i) {
            final String s = array[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append("\"layer" + i + "\": \"" + s + "\"");
        }
        sb.append("}}");
        return net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(sb.toString());
    }
    
    private static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2, final boolean b) {
        final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll;
        final boolean b2 = false;
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll2 = new llIIlIIIlIIIllIlIIIl(ilIlIIIIIIlllIlIllIl2).llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl2.llIllIIIIIllIlIIIIlI("particle")).toString()));
        for (final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : ilIlIIIIIIlllIlIllIl2.llllIIIIlIIIlIlllIll()) {
            for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.keySet()) {
                IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.get(lllIllIIIllllllIllll);
                if (!b) {
                    illIIlllIIIIlllIIlIl = new IllIIlllIIIIlllIIlIl(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl, -1, illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, illIIlllIIIIlllIIlIl.IlIlIIIllIllIIIIIllI);
                }
                final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, illIIlllIIIIlllIIlIl, ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(ilIlIIIIIIlllIlIllIl2.llIllIIIIIllIlIIIIlI(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl)).toString()), lllIllIIIllllllIllll, llllIIIIlIIIlIlllIll, b2);
                if (illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl == null) {
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
                }
                else {
                    llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl), llllIIIIlIIIlIlllIll3);
                }
            }
        }
        return llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
    }
    
    private static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final boolean b) {
        return new net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll, ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl, illIIlllIIIIlllIIlIl, ilIlIIIllIIllIlllllI, lllIllIIIllllllIllll, liiiIlIIIIIlllIllIII, ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl, b, ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public String toString() {
        return this.IlIlIlIlIlllllllllIl + "/" + this.llllIIIIlIIIlIlllIll + ", type: " + this.llIllIIIIIllIlIIIIlI + ", items: [" + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl) + "], textture: " + this.IlIlIIIllIllIIIIIllI;
    }
    
    public float llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        if (this.IIllllIIIlIIIIIIllIl <= 0) {
            if (this.IlllllllIIIlIIIlIlII != null) {
                final int llllIIIIlIIIlIlllIll = illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(this.IlllllllIIIlIIIlIlII).llllIIIIlIIIlIlllIll();
                final int iiiiIllIIIIlIIIIllIl = net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIIllIIIIlIIIIllIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll);
                this.IIllllIIIlIIIIIIllIl = GL11.glGetTexLevelParameteri(3553, 0, 4096);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(iiiiIllIIIIlIIIIllIl);
            }
            if (this.IIllllIIIlIIIIIIllIl <= 0) {
                this.IIllllIIIlIIIIIIllIl = 16;
            }
        }
        return (float)this.IIllllIIIlIIIIIIllIl;
    }
    
    public float IlIlIlIlIlllllllllIl(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        if (this.IlllIIIIlIIIlIlIlIIl <= 0) {
            if (this.IlllllllIIIlIIIlIlII != null) {
                final int llllIIIIlIIIlIlllIll = illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl(this.IlllllllIIIlIIIlIlII).llllIIIIlIIIlIlllIll();
                final int iiiiIllIIIIlIIIIllIl = net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.IIIIIllIIIIlIIIIllIl();
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll);
                this.IlllIIIIlIIIlIlIlIIl = GL11.glGetTexLevelParameteri(3553, 0, 4097);
                net.minecraft.client.lIIIlllIIIllIIIllIII.lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII(iiiiIllIIIIlIIIIllIl);
            }
            if (this.IlllIIIIlIIIlIlIlIIl <= 0) {
                this.IlllIIIIlIIIlIlIlIIl = 16;
            }
        }
        return (float)this.IlllIIIIlIIIlIlIlIIl;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final boolean b) {
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl;
        Map map;
        if (b) {
            ilIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII;
            map = this.lIllllllIIllIlIlIlII;
        }
        else {
            ilIlIlIlIlllllllllIl = this.IIlllIlIIllIlIlIlIIl;
            map = this.llIIIlIlIllIIlIlIlII;
        }
        if (lIllllIllIllIIllllll != null && map != null) {
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = map.get(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
            if (ilIlIlIlIlllllllllIl2 != null) {
                return ilIlIlIlIlllllllllIl2;
            }
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.llllIIIlIlllIlIIIIIl != null) {
            llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, this.llllIIIlIlllIlIIIIIl);
        }
        if (this.llIllIIIIIllIlIIIIlI == 1 && this.lIIIIlIIIIIlllIllIII != null) {
            for (final String s : this.lIIIIlIIIIIlllIllIII.keySet()) {
                final String s2 = this.lIIIIlIIIIIlllIllIII.get(s);
                final String ilIIIlIlIIIllIlIlIIl = net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s, "model.");
                if (ilIIIlIlIIIllIlIlIIl.startsWith("bow") || ilIIIlIlIIIllIlIlIIl.startsWith("fishing_rod") || ilIIIlIlIIIllIlIlIIl.startsWith("shield")) {
                    llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, s2);
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl iIlllIIIlIlllIIlllII = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIIIlIlllIIlllII();
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll();
        if (this.llllIIIlIlllIlIIIIIl != null) {
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl(lIIIlllIIIllIIIllIII(this.llllIIIlIlllIlIIIIIl), "inventory");
            this.lllllIlIIIlIlIIlllII = iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
            if (this.lllllIlIIIlIlIIlllII == llllIIIIlIIIlIlllIll) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Custom Items: Model not found " + llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl());
                this.lllllIlIIIlIlIIlllII = null;
            }
        }
        if (this.llIllIIIIIllIlIIIIlI == 1 && this.lIIIIlIIIIIlllIllIII != null) {
            for (final String s : this.lIIIIlIIIIIlllIllIII.keySet()) {
                final String s2 = this.lIIIIlIIIIIlllIllIII.get(s);
                final String ilIIIlIlIIIllIlIlIIl = net.optifine.util.IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s, "model.");
                if (ilIIIlIlIIIllIlIlIIl.startsWith("bow") || ilIIIlIlIIIllIlIlIIl.startsWith("fishing_rod") || ilIIIlIlIIIllIlIlIIl.startsWith("shield")) {
                    final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new llllIIIlIlllIlIIIIIl(lIIIlllIIIllIIIllIII(s2), "inventory");
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = iIlllIIIlIlllIIlllII.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2);
                    if (llllIIIIlIIIlIlllIll2 == llllIIIIlIIIlIlllIll) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Custom Items: Model not found " + llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl());
                    }
                    else {
                        if (this.lIllllllIIllIlIlIlII == null) {
                            this.lIllllllIIllIlIlIlII = new HashMap();
                        }
                        this.lIllllllIIllIlIlIlII.put(ilIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll2);
                    }
                }
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final String s) {
        final lIllllIllIllIIllllll liiIlllIIIllIIIllIII = lIIIlllIIIllIIIllIII(s);
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl(liiIlllIIIllIIIllIII, "inventory");
        if (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aq.llIllIIIIIllIlIIIIlI()) {
            try {
                final Object llIllIIIIIllIlIIIIlI2 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aw.llIllIIIIIllIlIIIIlI();
                llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, "vanillaLoader is null");
                final Object llllIIIlIlllIlIIIIIl2 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ax, llllIIIlIlllIlIIIIIl);
                llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2, "iModel is null");
                final Map map = (Map)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.ar);
                llllIIIIlIIIlIlllIll(map, "stateModels is null");
                map.put(llllIIIlIlllIlIIIIIl, llllIIIlIlllIlIIIIIl2);
                final Set set = (Set)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.au);
                llllIIIIlIIIlIlllIll(set, "registryTextures is null");
                final Collection collection = (Collection)net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(llllIIIlIlllIlIIIIIl2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.U, new Object[0]);
                llllIIIIlIIIlIlllIll(collection, "modelTextures is null");
                set.addAll(collection);
            }
            catch (Exception ex) {
                llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error registering model with ModelLoader: " + llllIIIlIlllIlIIIIIl + ", " + ex.getClass().getName() + ": " + ex.getMessage());
            }
        }
        else {
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.toString(), llllIIIlIlllIlIIIIIl, liiIlllIIIllIIIllIII);
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final Object o, final String s) {
        if (o == null) {
            throw new NullPointerException(s);
        }
    }
    
    private static lIllllIllIllIIllllll lIIIlllIIIllIIIllIII(final String s) {
        return (net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aq.llIllIIIIIllIlIIIIlI() && !s.startsWith("mcpatcher/") && !s.startsWith("optifine/")) ? new lIllllIllIllIIllllll("models/" + s) : new lIllllIllIllIIllllll(s);
    }
}
