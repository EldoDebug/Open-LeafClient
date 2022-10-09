package net.optifine;

import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.optifine.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class lIIIlllIIIllIIIllIII
{
    public String llllIIIIlIIIlIlllIll;
    public String IlIlIlIlIlllllllllIl;
    public llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI;
    public int[] IlIIIlIlIIIllIlIlIIl;
    public String[] IlIlIIIllIllIIIIIllI;
    public int IllIIlllIIIIlllIIlIl;
    public String[] llllIIIlIlllIlIIIIIl;
    public int lIIIIlIIIIIlllIllIII;
    public int lIIIlllIIIllIIIllIII;
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] llIIlIIIlIIIllIlIIIl;
    public llllIIllllIlIlIIIIll llIllIlIIIIllIlIIllI;
    public int lIlIlIIIllIIllIIIllI;
    public boolean IlIlIIIllIIllIlllllI;
    public int[] IIIIlllIIIIIIlIIIlll;
    public int llllIIllllIlIlIIIIll;
    public int IlIllIlIlIIIlIlIlIII;
    public int[] IIlllIIlIllIllIlIIll;
    public int lllIIIIlllllIlIIllIl;
    public int IlIlIIIIIIlllIlIllIl;
    public boolean IIllIIllIIIlIlIIIIlI;
    public lIlIlIIIllIIllIIIllI IIIlIIIlIlIIlllIIlll;
    public int[] IlIlIIIlIIlIlIIlllIl;
    public int IlllllllIIIlIIIlIlII;
    public IlIlIIIllIIllIlllllI[] IIlIIIIlllIlllllIlII;
    public IlIlIIIllIIllIlllllI[] IIIlIIlIIIIlllIlllII;
    public llIIlIIIlIIIllIlIIIl[] IlIlIllllllllIIIIlII;
    public String[] IIlllIlIIllIlIlIlIIl;
    public IlIlIIIllIIllIlllllI[] llIIIlIlIllIIlIlIlII;
    public int lllllIlIIIlIlIIlllII;
    public net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl lIllllllIIllIlIlIlII;
    public IlIIlIlIIIlIIlIlIlII llIIlllIIlllIIllIllI;
    public static final int IIlllIIIlIlllIIlllII = 0;
    public static final int IIlIIIIIllIlIIIlIIll = 1;
    public static final int llllllIllIllIlIllllI = 2;
    public static final int IIIllllllIllIIIlllIl = 3;
    public static final int IlIIIlIIIllllIlIlIlI = 4;
    public static final int IIIIIllIIIIlIIIIllIl = 5;
    public static final int IIIIIIIIIlllIllIlIlI = 6;
    public static final int IIllllIIIlIIIIIIllIl = 7;
    public static final int IlllIIIIlIIIlIlIlIIl = 8;
    public static final int lllIllIIIllllllIllll = 9;
    public static final int llIllIlIlIIIIIIIllII = 10;
    public static final int IIlIlIlIIlIllIIIIIIl = 11;
    public static final int IllIllIIIIlIIlIlllII = 12;
    public static final int IlIllllIIlIIlIlIlIll = 13;
    public static final int IllIllIlllIllllIIllI = 14;
    public static final int llIlIIIIIlIIlIlIIlll = 15;
    public static final int IlIIlIlIIIlIIlIlIlII = 0;
    public static final int IllIlIIllIllIIlIllII = 1;
    public static final int lIIlIIIlIllIlIllIIIl = 2;
    public static final int IIlIIIlllIllIllIlIII = 3;
    public static final int lIlIlIlllIIlIlIlllIl = 128;
    public static final int llIIIIIIlIllIIlIIIll = 1;
    public static final int lIIIIlIlIllllIIlIllI = 2;
    public static final int llIIIlIlllIllIIlIllI = 4;
    public static final int IlIIllIIllIIllIIlIIl = 8;
    public static final int lllllIIIIIlIlIIIIIIl = 16;
    public static final int IllIIlllllIIllIIllIl = 32;
    public static final int lIllIIIIIlllIIlIIllI = 60;
    public static final int lIlIIlllIIlIIlIlllIl = 63;
    public static final int llIIIllIlIllIllIIIIl = 128;
    public static final int IIIllIIIlIlIIllIIIlI = 1;
    public static final int IIlllIIlllIIIlIlllII = 2;
    public static final int IlIIlllllIIllIIlllll = 6;
    public static final int lllllIIlIlIIIlIlIIIl = 128;
    public static final String IIlllllIllIllIlIlIII = "<skip>.png";
    public static final String llllIllllIllllIlIlII = "<default>.png";
    
    public lIIIlllIIIllIIIllIII(final Properties properties, final String s) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = null;
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = 0;
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = 0;
        this.lIIIlllIIIllIIIllIII = 63;
        this.llIIlIIIlIIIllIlIIIl = null;
        this.llIllIlIIIIllIlIIllI = null;
        this.lIlIlIIIllIIllIIIllI = 0;
        this.IlIlIIIllIIllIlllllI = false;
        this.IIIIlllIIIIIIlIIIlll = null;
        this.llllIIllllIlIlIIIIll = 0;
        this.IlIllIlIlIIIlIlIlIII = 0;
        this.IIlllIIlIllIllIlIIll = null;
        this.lllIIIIlllllIlIIllIl = 0;
        this.IlIlIIIIIIlllIlIllIl = 1;
        this.IIllIIllIIIlIlIIIIlI = false;
        this.IIIlIIIlIlIIlllIIlll = null;
        this.IlIlIIIlIIlIlIIlllIl = null;
        this.IlllllllIIIlIIIlIlII = 1;
        this.IIlIIIIlllIlllllIlII = null;
        this.IIIlIIlIIIIlllIlllII = null;
        this.IlIlIllllllllIIIIlII = null;
        this.IIlllIlIIllIlIlIlIIl = null;
        this.llIIIlIlIllIIlIlIlII = null;
        this.lllllIlIIIlIlIIlllII = -1;
        this.lIllllllIIllIlIlIlII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        this.llIIlllIIlllIIllIllI = null;
        final net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("ConnectedTextures");
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s);
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s);
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(properties.getProperty("matchBlocks"));
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(properties.getProperty("metadata"));
        this.IlIlIIIllIllIIIIIllI = this.IlIlIlIlIlllllllllIl(properties.getProperty("matchTiles"));
        this.IllIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl(properties.getProperty("method"));
        this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI(properties.getProperty("tiles"));
        this.lIIIIlIIIIIlllIllIII = lIIIlllIIIllIIIllIII(properties.getProperty("connect"));
        this.lIIIlllIIIllIIIllIII = llllIIIlIlllIlIIIIIl(properties.getProperty("faces"));
        this.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(properties.getProperty("biomes"));
        this.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(properties.getProperty("heights"));
        if (this.llIllIlIIIIllIlIIllI == null) {
            final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("minHeight"), -1);
            final int llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("maxHeight"), 1024);
            if (llllIIIIlIIIlIlllIll2 != -1 || llllIIIIlIIIlIlllIll3 != 1024) {
                this.llIllIlIIIIllIlIIllI = new llllIIllllIlIlIIIIll(new IIIIlllIIIIIIlIIIlll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3));
            }
        }
        this.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("renderPass"), -1);
        this.IlIlIIIllIIllIlllllI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("innerSeams"), false);
        this.IIIIlllIIIIIIlIIIlll = this.llllIIIIlIIIlIlllIll(properties);
        this.llllIIllllIlIlIIIIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("width"), -1);
        this.IlIllIlIlIIIlIlIlIII = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("height"), -1);
        this.IIlllIIlIllIllIlIIll = llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(properties.getProperty("weights"));
        this.lllIIIIlllllIlIIllIl = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("randomLoops"), 0);
        this.IlIlIIIIIIlllIlIllIl = IllIIlllIIIIlllIIlIl(properties.getProperty("symmetry"));
        this.IIllIIllIIIlIlIIIIlI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("linked"), false);
        this.IIIlIIIlIlIIlllIIlll = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("name", properties.getProperty("name"));
        this.IlIlIllllllllIIIIlII = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(properties.getProperty("connectBlocks"));
        this.IIlllIlIIllIlIlIlIIl = this.IlIlIlIlIlllllllllIl(properties.getProperty("connectTiles"));
        this.lllllIlIIIlIlIIlllII = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("tintIndex"), -1);
        this.lIllllllIIllIlIlIlII = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("tintBlock"), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
        this.llIIlllIIlllIIllIllI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("layer"), net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl);
    }
    
    private int[] llllIIIIlIIIlIlllIll(final Properties properties) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            return null;
        }
        final HashMap<Object, Integer> hashMap = new HashMap<Object, Integer>();
        for (final String next : ((Hashtable<String, V>)properties).keySet()) {
            if (next instanceof String) {
                final String s = next;
                final String s2 = "ctm.";
                if (!s.startsWith(s2)) {
                    continue;
                }
                final String substring = s.substring(s2.length());
                final String property = properties.getProperty(s);
                if (property == null) {
                    continue;
                }
                final String trim = property.trim();
                final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(substring, -1);
                if (llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll <= 46) {
                    final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, -1);
                    if (llllIIIIlIIIlIlllIll2 >= 0 && llllIIIIlIIIlIlllIll2 < this.llllIIIlIlllIlIIIIIl.length) {
                        hashMap.put(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
                    }
                    else {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid CTM tile index: " + trim);
                    }
                }
                else {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid CTM index: " + substring);
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        final int[] array = new int[47];
        for (int i = 0; i < array.length; ++i) {
            array[i] = -1;
            if (hashMap.containsKey(i)) {
                array[i] = hashMap.get(i);
            }
        }
        return array;
    }
    
    private String[] IlIlIlIlIlllllllllIl(final String s) {
        if (s == null) {
            return null;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            String substring = llllIIIIlIIIlIlllIll[i];
            if (substring.endsWith(".png")) {
                substring = substring.substring(0, substring.length() - 4);
            }
            llllIIIIlIIIlIlllIll[i] = net.optifine.util.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(substring, this.IlIlIlIlIlllllllllIl);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    private static String llIllIIIIIllIlIIIIlI(final String s) {
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
    
    private static String IlIIIlIlIIIllIlIlIIl(final String s) {
        final int lastIndex = s.lastIndexOf(47);
        return (lastIndex < 0) ? "" : s.substring(0, lastIndex);
    }
    
    private String[] IlIlIIIllIllIIIIIllI(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList<String> list = new ArrayList<String>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ,");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            if (s2.contains("-")) {
                final String[] llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, "-");
                if (llllIIIIlIIIlIlllIll2.length == 2) {
                    final int llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2[0], -1);
                    final int llllIIIIlIIIlIlllIll4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2[1], -1);
                    if (llllIIIIlIIIlIlllIll3 >= 0 && llllIIIIlIIIlIlllIll4 >= 0) {
                        if (llllIIIIlIIIlIlllIll3 > llllIIIIlIIIlIlllIll4) {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid interval: " + s2 + ", when parsing: " + s);
                            continue;
                        }
                        for (int j = llllIIIIlIIIlIlllIll3; j <= llllIIIIlIIIlIlllIll4; ++j) {
                            list.add(String.valueOf(j));
                        }
                        continue;
                    }
                }
            }
            list.add(s2);
        }
        final String[] array = list.toArray(new String[list.size()]);
        for (int k = 0; k < array.length; ++k) {
            String s3 = net.optifine.util.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(array[k], this.IlIlIlIlIlllllllllIl);
            if (!s3.startsWith(this.IlIlIlIlIlllllllllIl) && !s3.startsWith("textures/") && !s3.startsWith("mcpatcher/")) {
                s3 = String.valueOf(this.IlIlIlIlIlllllllllIl) + "/" + s3;
            }
            if (s3.endsWith(".png")) {
                s3 = s3.substring(0, s3.length() - 4);
            }
            if (s3.startsWith("/")) {
                s3 = s3.substring(1);
            }
            array[k] = s3;
        }
        return array;
    }
    
    private static int IllIIlllIIIIlllIIlIl(String trim) {
        if (trim == null) {
            return 1;
        }
        trim = trim.trim();
        if (trim.equals("opposite")) {
            return 2;
        }
        if (trim.equals("all")) {
            return 6;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown symmetry: " + trim);
        return 1;
    }
    
    private static int llllIIIlIlllIlIIIIIl(final String s) {
        if (s == null) {
            return 63;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ,");
        int n = 0;
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            n |= lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll[i]);
        }
        return n;
    }
    
    private static int lIIIIlIIIIIlllIllIII(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.equals("bottom") || lowerCase.equals("down")) {
            return 1;
        }
        if (lowerCase.equals("top") || lowerCase.equals("up")) {
            return 2;
        }
        if (lowerCase.equals("north")) {
            return 4;
        }
        if (lowerCase.equals("south")) {
            return 8;
        }
        if (lowerCase.equals("east")) {
            return 32;
        }
        if (lowerCase.equals("west")) {
            return 16;
        }
        if (lowerCase.equals("sides")) {
            return 60;
        }
        if (lowerCase.equals("all")) {
            return 63;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown face: " + lowerCase);
        return 128;
    }
    
    private static int lIIIlllIIIllIIIllIII(String trim) {
        if (trim == null) {
            return 0;
        }
        trim = trim.trim();
        if (trim.equals("block")) {
            return 1;
        }
        if (trim.equals("tile")) {
            return 2;
        }
        if (trim.equals("material")) {
            return 3;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown connect: " + trim);
        return 128;
    }
    
    public static net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final String s, final Collection collection) {
        for (final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : collection) {
            if (s.equals(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll())) {
                return llllIIIIlIIIlIlllIll;
            }
        }
        return null;
    }
    
    private static int llIIlIIIlIIIllIlIIIl(String trim) {
        if (trim == null) {
            return 1;
        }
        trim = trim.trim();
        if (trim.equals("ctm") || trim.equals("glass")) {
            return 1;
        }
        if (trim.equals("ctm_compact")) {
            return 10;
        }
        if (trim.equals("horizontal") || trim.equals("bookshelf")) {
            return 2;
        }
        if (trim.equals("vertical")) {
            return 6;
        }
        if (trim.equals("top")) {
            return 3;
        }
        if (trim.equals("random")) {
            return 4;
        }
        if (trim.equals("repeat")) {
            return 5;
        }
        if (trim.equals("fixed")) {
            return 7;
        }
        if (trim.equals("horizontal+vertical") || trim.equals("h+v")) {
            return 8;
        }
        if (trim.equals("vertical+horizontal") || trim.equals("v+h")) {
            return 9;
        }
        if (trim.equals("overlay")) {
            return 11;
        }
        if (trim.equals("overlay_fixed")) {
            return 12;
        }
        if (trim.equals("overlay_random")) {
            return 13;
        }
        if (trim.equals("overlay_repeat")) {
            return 14;
        }
        if (trim.equals("overlay_ctm")) {
            return 15;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown method: " + trim);
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
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
        }
        if (this.IlIlIIIllIllIIIIIllI == null && this.llIllIIIIIllIlIIIIlI == null) {
            this.IlIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI();
        }
        if (this.llIllIIIIIllIlIIIIlI == null && this.IlIlIIIllIllIIIIIllI == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No matchBlocks or matchTiles specified: " + s);
            return false;
        }
        if (this.IllIIlllIIIIlllIIlIl == 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No method: " + s);
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl == null || this.llllIIIlIlllIlIIIIIl.length <= 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No tiles specified: " + s);
            return false;
        }
        if (this.lIIIIlIIIIIlllIllIII == 0) {
            this.lIIIIlIIIIIlllIllIII = this.IlIlIlIlIlllllllllIl();
        }
        if (this.lIIIIlIIIIIlllIllIII == 128) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid connect in: " + s);
            return false;
        }
        if (this.lIlIlIIIllIIllIIIllI > 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Render pass not supported: " + this.lIlIlIIIllIIllIIIllI);
            return false;
        }
        if ((this.lIIIlllIIIllIIIllIII & 0x80) != 0x0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid faces in: " + s);
            return false;
        }
        if ((this.IlIlIIIIIIlllIlIllIl & 0x80) != 0x0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid symmetry in: " + s);
            return false;
        }
        switch (this.IllIIlllIIIIlllIIlIl) {
            case 1: {
                return this.lIlIlIIIllIIllIIIllI(s);
            }
            case 2: {
                return this.IlIlIIIIIIlllIlIllIl(s);
            }
            case 3: {
                return this.IlIlIllllllllIIIIlII(s);
            }
            case 4: {
                return this.IlllllllIIIlIIIlIlII(s);
            }
            case 5: {
                return this.IIlIIIIlllIlllllIlII(s);
            }
            case 6: {
                return this.IIllIIllIIIlIlIIIIlI(s);
            }
            case 7: {
                return this.IIIlIIlIIIIlllIlllII(s);
            }
            case 8: {
                return this.IIIlIIIlIlIIlllIIlll(s);
            }
            case 9: {
                return this.IlIlIIIlIIlIlIIlllIl(s);
            }
            case 10: {
                return this.IlIlIIIllIIllIlllllI(s);
            }
            case 11: {
                return this.IIIIlllIIIIIIlIIIlll(s);
            }
            case 12: {
                return this.llllIIllllIlIlIIIIll(s);
            }
            case 13: {
                return this.IlIllIlIlIIIlIlIlIII(s);
            }
            case 14: {
                return this.IIlllIIlIllIllIlIIll(s);
            }
            case 15: {
                return this.lllIIIIlllllIlIIllIl(s);
            }
            default: {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown method: " + s);
                return false;
            }
        }
    }
    
    private int IlIlIlIlIlllllllllIl() {
        return (this.llIllIIIIIllIlIIIIlI != null) ? 1 : ((this.IlIlIIIllIllIIIIIllI != null) ? 2 : 128);
    }
    
    private llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI() {
        final int[] ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl == null) {
            return null;
        }
        final llIIlIIIlIIIllIlIIIl[] array = new llIIlIIIlIIIllIlIIIl[ilIIIlIlIIIllIlIlIIl.length];
        for (int i = 0; i < array.length; ++i) {
            array[i] = new llIIlIIIlIIIllIlIIIl(ilIIIlIlIIIllIlIlIIl[i]);
        }
        return array;
    }
    
    private int[] IlIIIlIlIIIllIlIlIIl() {
        if (!this.llllIIIIlIIIlIlllIll.startsWith("block")) {
            return null;
        }
        int i;
        int n;
        for (n = (i = "block".length()); i < this.llllIIIIlIIIlIlllIll.length(); ++i) {
            final char char1 = this.llllIIIIlIIIlIlllIll.charAt(i);
            if (char1 < '0') {
                break;
            }
            if (char1 > '9') {
                break;
            }
        }
        if (i == n) {
            return null;
        }
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.substring(n, i), -1);
        return (int[])((llllIIIIlIIIlIlllIll < 0) ? null : new int[] { llllIIIIlIIIlIlllIll });
    }
    
    private String[] IlIlIIIllIllIIIIIllI() {
        return (String[])((llIllIlIIIIllIlIIllI(this.llllIIIIlIIIlIlllIll) == null) ? null : new String[] { this.llllIIIIlIIIlIlllIll });
    }
    
    private static IlIlIIIllIIllIlllllI llIllIlIIIIllIlIIllI(final String s) {
        final IlIlIIIIIIlllIlIllIl ilIllllIIlIIlIlIlIll = Minecraft.getMinecraft().IlIllllIIlIIlIlIlIll();
        final IlIlIIIllIIllIlllllI llIllIIIIIllIlIIIIlI = ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI(s);
        if (llIllIIIIIllIlIIIIlI != null) {
            return llIllIIIIIllIlIIIIlI;
        }
        return ilIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI("blocks/" + s);
    }
    
    private boolean lIlIlIIIllIIllIIIllI(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI("0-11 16-27 32-43 48-58");
        }
        if (this.llllIIIlIlllIlIIIIIl.length < 47) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tiles, must be at least 47: " + s);
            return false;
        }
        return true;
    }
    
    private boolean IlIlIIIllIIllIlllllI(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI("0-4");
        }
        if (this.llllIIIlIlllIlIIIIIl.length < 5) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tiles, must be at least 5: " + s);
            return false;
        }
        return true;
    }
    
    private boolean IIIIlllIIIIIIlIIIlll(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI("0-16");
        }
        if (this.llllIIIlIlllIlIIIIIl.length < 17) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tiles, must be at least 17: " + s);
            return false;
        }
        if (this.llIIlllIIlllIIllIllI != null && this.llIIlllIIlllIIllIllI != net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) {
            return true;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid overlay layer: " + this.llIIlllIIlllIIllIllI);
        return false;
    }
    
    private boolean llllIIllllIlIlIIIIll(final String s) {
        if (!this.IIIlIIlIIIIlllIlllII(s)) {
            return false;
        }
        if (this.llIIlllIIlllIIllIllI != null && this.llIIlllIIlllIIllIllI != net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) {
            return true;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid overlay layer: " + this.llIIlllIIlllIIllIllI);
        return false;
    }
    
    private boolean IlIllIlIlIIIlIlIlIII(final String s) {
        if (!this.IlllllllIIIlIIIlIlII(s)) {
            return false;
        }
        if (this.llIIlllIIlllIIllIllI != null && this.llIIlllIIlllIIllIllI != net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) {
            return true;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid overlay layer: " + this.llIIlllIIlllIIllIllI);
        return false;
    }
    
    private boolean IIlllIIlIllIllIlIIll(final String s) {
        if (!this.IIlIIIIlllIlllllIlII(s)) {
            return false;
        }
        if (this.llIIlllIIlllIIllIllI != null && this.llIIlllIIlllIIllIllI != net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) {
            return true;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid overlay layer: " + this.llIIlllIIlllIIllIllI);
        return false;
    }
    
    private boolean lllIIIIlllllIlIIllIl(final String s) {
        if (!this.lIlIlIIIllIIllIIIllI(s)) {
            return false;
        }
        if (this.llIIlllIIlllIIllIllI != null && this.llIIlllIIlllIIllIllI != net.minecraft.IlllllllIIIlIIIlIlII.IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll) {
            return true;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid overlay layer: " + this.llIIlllIIlllIIllIllI);
        return false;
    }
    
    private boolean IlIlIIIIIIlllIlIllIl(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI("12-15");
        }
        if (this.llllIIIlIlllIlIIIIIl.length != 4) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tiles, must be exactly 4: " + s);
            return false;
        }
        return true;
    }
    
    private boolean IIllIIllIIIlIlIIIIlI(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No tiles defined for vertical: " + s);
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl.length != 4) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tiles, must be exactly 4: " + s);
            return false;
        }
        return true;
    }
    
    private boolean IIIlIIIlIlIIlllIIlll(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No tiles defined for horizontal+vertical: " + s);
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl.length != 7) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tiles, must be exactly 7: " + s);
            return false;
        }
        return true;
    }
    
    private boolean IlIlIIIlIIlIlIIlllIl(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("No tiles defined for vertical+horizontal: " + s);
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl.length != 7) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tiles, must be exactly 7: " + s);
            return false;
        }
        return true;
    }
    
    private boolean IlllllllIIIlIIIlIlII(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null || this.llllIIIlIlllIlIIIIIl.length <= 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Tiles not defined: " + s);
            return false;
        }
        if (this.IIlllIIlIllIllIlIIll != null) {
            if (this.IIlllIIlIllIllIlIIll.length > this.llllIIIlIlllIlIIIIIl.length) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("More weights defined than tiles, trimming weights: " + s);
                final int[] iIlllIIlIllIllIlIIll = new int[this.llllIIIlIlllIlIIIIIl.length];
                System.arraycopy(this.IIlllIIlIllIllIlIIll, 0, iIlllIIlIllIllIlIIll, 0, iIlllIIlIllIllIlIIll.length);
                this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
            }
            if (this.IIlllIIlIllIllIlIIll.length < this.llllIIIlIlllIlIIIIIl.length) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Less weights defined than tiles, expanding weights: " + s);
                final int[] iIlllIIlIllIllIlIIll2 = new int[this.llllIIIlIlllIlIIIIIl.length];
                System.arraycopy(this.IIlllIIlIllIllIlIIll, 0, iIlllIIlIllIllIlIIll2, 0, this.IIlllIIlIllIllIlIIll.length);
                final int llllIIIIlIIIlIlllIll = net.optifine.util.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll);
                for (int i = this.IIlllIIlIllIllIlIIll.length; i < iIlllIIlIllIllIlIIll2.length; ++i) {
                    iIlllIIlIllIllIlIIll2[i] = llllIIIIlIIIlIlllIll;
                }
                this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll2;
            }
            this.IlIlIIIlIIlIlIIlllIl = new int[this.IIlllIIlIllIllIlIIll.length];
            int illlllllIIIlIIIlIlII = 0;
            for (int j = 0; j < this.IIlllIIlIllIllIlIIll.length; ++j) {
                illlllllIIIlIIIlIlII += this.IIlllIIlIllIllIlIIll[j];
                this.IlIlIIIlIIlIlIIlllIl[j] = illlllllIIIlIIIlIlII;
            }
            this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
            if (this.IlllllllIIIlIIIlIlII <= 0) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid sum of all weights: " + illlllllIIIlIIIlIlII);
                this.IlllllllIIIlIIIlIlII = 1;
            }
        }
        if (this.lllIIIIlllllIlIIllIl >= 0 && this.lllIIIIlllllIlIIllIl <= 9) {
            return true;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid randomLoops: " + this.lllIIIIlllllIlIIllIl);
        return false;
    }
    
    private boolean IIlIIIIlllIlllllIlII(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Tiles not defined: " + s);
            return false;
        }
        if (this.llllIIllllIlIlIIIIll <= 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid width: " + s);
            return false;
        }
        if (this.IlIllIlIlIIIlIlIlIII <= 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid height: " + s);
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl.length != this.llllIIllllIlIlIIIIll * this.IlIllIlIlIIIlIlIlIII) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Number of tiles does not equal width x height: " + s);
            return false;
        }
        return true;
    }
    
    private boolean IIIlIIlIIIIlllIlllII(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Tiles not defined: " + s);
            return false;
        }
        if (this.llllIIIlIlllIlIIIIIl.length != 1) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Number of tiles should be 1 for method: fixed.");
            return false;
        }
        return true;
    }
    
    private boolean IlIlIllllllllIIIIlII(final String s) {
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIlIlllIlIIIIIl = this.IlIlIIIllIllIIIIIllI("66");
        }
        if (this.llllIIIlIlllIlIIIIIl.length != 1) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid tiles, must be exactly 1: " + s);
            return false;
        }
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        if (this.IlIlIIIllIllIIIIIllI != null) {
            this.IIlIIIIlllIlllllIlII = llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI, ilIlIIIIIIlllIlIllIl, false, false);
        }
        if (this.IIlllIlIIllIlIlIlIIl != null) {
            this.llIIIlIlIllIIlIlIlII = llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, ilIlIIIIIIlllIlIllIl, false, false);
        }
        if (this.llllIIIlIlllIlIIIIIl != null) {
            this.IIIlIIlIIIIlllIlllII = llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, ilIlIIIIIIlllIlIllIl, true, !IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl));
        }
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final int n) {
        switch (n) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15: {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private static IlIlIIIllIIllIlllllI[] llllIIIIlIIIlIlllIll(final String[] array, final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final boolean b, final boolean b2) {
        if (array == null) {
            return null;
        }
        final ArrayList<IlIlIIIllIIllIlllllI> list = new ArrayList<IlIlIIIllIIllIlllllI>();
        for (int i = 0; i < array.length; ++i) {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(array[i]);
            final String llIllIIIIIllIlIIIIlI = lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI();
            String s = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
            if (!s.contains("/")) {
                s = "textures/blocks/" + s;
            }
            final String string = String.valueOf(s) + ".png";
            if (b && string.endsWith("<skip>.png")) {
                list.add(null);
            }
            else if (b2 && string.endsWith("<default>.png")) {
                list.add(net.optifine.llIIlIIIlIIIllIlIIIl.lIIIlllIIIllIIIllIII);
            }
            else {
                if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI, string))) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("File not found: " + string);
                }
                final String s2 = "textures/";
                String substring = s;
                if (s.startsWith(s2)) {
                    substring = s.substring(s2.length());
                }
                list.add(ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI, substring)));
            }
        }
        return list.toArray(new IlIlIIIllIIllIlllllI[list.size()]);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n) {
        return net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n, this.llIllIIIIIllIlIIIIlI);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n, n2, this.llIllIIIIIllIlIIIIlI) && net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n2, this.IlIIIlIlIIIllIlIlIIl);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, this.IIlIIIIlllIlllllIlII);
    }
    
    @Override
    public String toString() {
        return "CTM name: " + this.llllIIIIlIIIlIlllIll + ", basePath: " + this.IlIlIlIlIlllllllllIl + ", matchBlocks: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI) + ", matchTiles: " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, this.llIIlIIIlIIIllIlIIIl);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        int n = this.llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl, -1);
        if (this.llIllIIIIIllIlIIIIlI != null) {
            for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.length; ++i) {
                n = this.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI[i].IlIlIlIlIlllllllllIl(), n);
            }
        }
        return n;
    }
    
    private int llllIIIIlIIIlIlllIll(final int[] array, int n) {
        if (array == null) {
            return n;
        }
        for (int i = 0; i < array.length; ++i) {
            final int n2 = array[i];
            if (n2 > n) {
                n = n2;
            }
        }
        return n;
    }
}
