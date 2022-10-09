package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.regex.*;
import net.optifine.shaders.*;
import net.optifine.util.*;
import java.io.*;
import net.optifine.shaders.llIllIIIIIllIlIIIIlI.*;
import net.optifine.expr.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;
import java.util.*;

public class IlllllllIIIlIIIlIlII
{
    private static final Pattern llllIIIIlIIIlIlllIll;
    private static final Pattern IlIlIlIlIlllllllllIl;
    private static final Set llIllIIIIIllIlIIIIlI;
    private static final Map IlIIIlIlIIIllIlIlIIl;
    private static final Map IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = Pattern.compile("^\\s*#version\\s+.*$");
        IlIlIlIlIlllllllllIl = Pattern.compile("^\\s*#include\\s+\"([A-Za-z0-9_/\\.]+)\".*$");
        llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll();
        IlIIIlIlIIIllIlIlIIl = IlIlIlIlIlllllllllIl();
        IlIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI();
    }
    
    public static IIIIlllIIIIIIlIIIlll[] llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final String[] array, final List list) {
        if (lIlIlIIIllIIllIIIllI == null) {
            return new IIIIlllIIIIIIlIIIlll[0];
        }
        final HashMap hashMap = new HashMap();
        llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, "/shaders", array, hashMap);
        final Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, "/shaders/world" + (int)iterator.next(), array, hashMap);
        }
        final Collection values = hashMap.values();
        final IIIIlllIIIIIIlIIIlll[] array2 = (IIIIlllIIIIIIlIIIlll[])values.toArray(new IIIIlllIIIIIIlIIIlll[values.size()]);
        Arrays.sort(array2, new IIlIIIIlllIlllllIlII());
        return array2;
    }
    
    private static void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final String s, final String[] array, final Map map) {
        for (int i = 0; i < array.length; ++i) {
            final String s2 = array[i];
            if (!s2.equals("")) {
                final String string = String.valueOf(s) + "/" + s2 + ".vsh";
                final String string2 = String.valueOf(s) + "/" + s2 + ".fsh";
                llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, string, map);
                llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, string2, map);
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final String s, final Map map) {
        final String[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, s);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i], s);
            if (llllIIIIlIIIlIlllIll2 != null && !llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll().startsWith(IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl()) && (!llllIIIIlIIIlIlllIll2.IIIIlllIIIIIIlIIIlll() || llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll))) {
                final String llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = map.get(llllIIIIlIIIlIlllIll3);
                if (iiiIlllIIIIIIlIIIlll != null) {
                    if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI(), (Object)llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI())) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Ambiguous shader option: " + llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll());
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(" - in " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII()) + ": " + iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI());
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(" - in " + net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII()) + ": " + llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI());
                        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(false);
                    }
                    if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl() == null || iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl().length() <= 0) {
                        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
                    }
                    iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII());
                }
                else {
                    map.put(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll2);
                }
            }
        }
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final String[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (iiiIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    private static String[] llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final String s) {
        try {
            final String llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s, lIlIlIIIllIIllIIIllI, 0, new ArrayList(), 0);
            if (llllIIIIlIIIlIlllIll == null) {
                return new String[0];
            }
            return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new ByteArrayInputStream(llllIIIIlIIIlIlllIll.getBytes()));
        }
        catch (IOException ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(String.valueOf(ex.getClass().getName()) + ": " + ex.getMessage());
            return new String[0];
        }
    }
    
    private static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final String s, final String s2) {
        IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = null;
        if (iiiIlllIIIIIIlIIIlll == null) {
            iiiIlllIIIIIIlIIIlll = IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(s, s2);
        }
        if (iiiIlllIIIIIIlIIIlll == null) {
            iiiIlllIIIIIIlIIIlll = IIIlIIIlIlIIlllIIlll.llllIIIIlIIIlIlllIll(s, s2);
        }
        if (iiiIlllIIIIIIlIIIlll != null) {
            return iiiIlllIIIIIIlIIIlll;
        }
        if (iiiIlllIIIIIIlIIIlll == null) {
            iiiIlllIIIIIIlIIIlll = IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(s, s2);
        }
        if (iiiIlllIIIIIIlIIIlll == null) {
            iiiIlllIIIIIIlIIIlll = IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI(s, s2);
        }
        return (iiiIlllIIIIIIlIIIlll != null && IlllllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI.contains(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll())) ? iiiIlllIIIIIIlIIIlll : null;
    }
    
    private static Set llllIIIIlIIIlIlllIll() {
        final HashSet<String> set = new HashSet<String>();
        set.add("shadowMapResolution");
        set.add("shadowMapFov");
        set.add("shadowDistance");
        set.add("shadowDistanceRenderMul");
        set.add("shadowIntervalSize");
        set.add("generateShadowMipmap");
        set.add("generateShadowColorMipmap");
        set.add("shadowHardwareFiltering");
        set.add("shadowHardwareFiltering0");
        set.add("shadowHardwareFiltering1");
        set.add("shadowtex0Mipmap");
        set.add("shadowtexMipmap");
        set.add("shadowtex1Mipmap");
        set.add("shadowcolor0Mipmap");
        set.add("shadowColor0Mipmap");
        set.add("shadowcolor1Mipmap");
        set.add("shadowColor1Mipmap");
        set.add("shadowtex0Nearest");
        set.add("shadowtexNearest");
        set.add("shadow0MinMagNearest");
        set.add("shadowtex1Nearest");
        set.add("shadow1MinMagNearest");
        set.add("shadowcolor0Nearest");
        set.add("shadowColor0Nearest");
        set.add("shadowColor0MinMagNearest");
        set.add("shadowcolor1Nearest");
        set.add("shadowColor1Nearest");
        set.add("shadowColor1MinMagNearest");
        set.add("wetnessHalflife");
        set.add("drynessHalflife");
        set.add("eyeBrightnessHalflife");
        set.add("centerDepthHalflife");
        set.add("sunPathRotation");
        set.add("ambientOcclusionLevel");
        set.add("superSamplingLevel");
        set.add("noiseTextureResolution");
        return set;
    }
    
    public static IlIlIllllllllIIIIlII[] llllIIIIlIIIlIlllIll(final Properties properties, final IIIIlllIIIIIIlIIIlll[] array) {
        final String s = "profile.";
        final ArrayList<IlIlIllllllllIIIIlII> list = new ArrayList<IlIlIllllllllIIIIlII>();
        for (final String s2 : ((Hashtable<String, V>)properties).keySet()) {
            if (s2.startsWith(s)) {
                final String substring = s2.substring(s.length());
                properties.getProperty(s2);
                final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(substring, properties, new HashSet(), array);
                if (llllIIIIlIIIlIlllIll == null) {
                    continue;
                }
                list.add(llllIIIIlIIIlIlllIll);
            }
        }
        if (list.size() <= 0) {
            return null;
        }
        return list.toArray(new IlIlIllllllllIIIIlII[list.size()]);
    }
    
    public static Map IlIlIlIlIlllllllllIl(final Properties properties, final IIIIlllIIIIIIlIIIlll[] array) {
        final Pattern compile = Pattern.compile("program\\.([^.]+)\\.enabled");
        final HashMap<String, llIllIlIIIIllIlIIllI> hashMap = new HashMap<String, llIllIlIIIIllIlIIllI>();
        for (final String s : ((Hashtable<String, V>)properties).keySet()) {
            final Matcher matcher = compile.matcher(s);
            if (matcher.matches()) {
                final String group = matcher.group(1);
                final llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(properties.getProperty(s).trim(), array);
                if (llllIIIIlIIIlIlllIll == null) {
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Error parsing program condition: " + s);
                }
                else {
                    hashMap.put(group, llllIIIIlIIIlIlllIll);
                }
            }
        }
        return hashMap;
    }
    
    private static llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final String s, final IIIIlllIIIIIIlIIIlll[] array) {
        try {
            return new IlIIIlIlIIIllIlIlIIl(new IlIllIlIlIIIlIlIlIII(array)).IlIlIlIlIlllllllllIl(s);
        }
        catch (net.optifine.expr.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(String.valueOf(ilIlIIIIIIlllIlIllIl.getClass().getName()) + ": " + ilIlIIIIIIlllIlIllIl.getMessage());
            return null;
        }
    }
    
    public static Set llIllIIIIIllIlIIIIlI(final Properties properties, final IIIIlllIIIIIIlIIIlll[] array) {
        final HashSet<String> set = new HashSet<String>();
        final String property = properties.getProperty("sliders");
        if (property == null) {
            return set;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(property, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            if (lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(s, array) == null) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid shader option: " + s);
            }
            else {
                set.add(s);
            }
        }
        return set;
    }
    
    private static IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll(final String s, final Properties properties, final Set set, final IIIIlllIIIIIIlIIIlll[] array) {
        final String s2 = "profile.";
        final String string = String.valueOf(s2) + s;
        if (set.contains(string)) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Profile already parsed: " + s);
            return null;
        }
        set.add(s);
        final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = new IlIlIllllllllIIIIlII(s);
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty(string), " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s3 = llllIIIIlIIIlIlllIll[i];
            if (s3.startsWith(s2)) {
                final IlIlIllllllllIIIIlII llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(s3.substring(s2.length()), properties, set, array);
                if (ilIlIllllllllIIIIlII != null) {
                    ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                    ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI());
                }
            }
            else {
                final String[] llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s3, ":=");
                if (llllIIIIlIIIlIlllIll3.length == 1) {
                    String substring = llllIIIIlIIIlIlllIll3[0];
                    boolean b = true;
                    if (substring.startsWith("!")) {
                        b = false;
                        substring = substring.substring(1);
                    }
                    final String s4 = "program.";
                    if (substring.startsWith(s4)) {
                        final String substring2 = substring.substring(s4.length());
                        if (!llIIlllIIlllIIllIllI.llIIlIIIlIIIllIlIIIl(substring2)) {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid program: " + substring2 + " in profile: " + ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll());
                        }
                        else if (b) {
                            ilIlIllllllllIIIIlII.llIllIIIIIllIlIIIIlI(substring2);
                        }
                        else {
                            ilIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl(substring2);
                        }
                    }
                    else {
                        final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll4 = lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(substring, array);
                        if (!(llllIIIIlIIIlIlllIll4 instanceof IlIlIIIIIIlllIlIllIl)) {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid option: " + substring);
                        }
                        else {
                            ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(substring, String.valueOf(b));
                            llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl(true);
                        }
                    }
                }
                else if (llllIIIIlIIIlIlllIll3.length != 2) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid option value: " + s3);
                }
                else {
                    final String s5 = llllIIIIlIIIlIlllIll3[0];
                    final String s6 = llllIIIIlIIIlIlllIll3[1];
                    final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll5 = lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(s5, array);
                    if (llllIIIIlIIIlIlllIll5 == null) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid option: " + s3);
                    }
                    else if (!llllIIIIlIIIlIlllIll5.llIllIIIIIllIlIIIIlI(s6)) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid value: " + s3);
                    }
                    else {
                        llllIIIIlIIIlIlllIll5.IlIlIlIlIlllllllllIl(true);
                        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(s5, s6);
                    }
                }
            }
        }
        return ilIlIllllllllIIIIlII;
    }
    
    public static Map llllIIIIlIIIlIlllIll(final Properties properties, final IlIlIllllllllIIIIlII[] array, final IIIIlllIIIIIIlIIIlll[] array2) {
        final HashMap hashMap = new HashMap();
        llllIIIIlIIIlIlllIll("screen", properties, hashMap, array, array2);
        return hashMap.isEmpty() ? null : hashMap;
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final String s, final Properties properties, final Map map, final IlIlIllllllllIIIIlII[] array, final IIIIlllIIIIIIlIIIlll[] array2) {
        final String property = properties.getProperty(s);
        if (property == null) {
            return false;
        }
        final ArrayList<net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll> list = new ArrayList<net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll>();
        final HashSet<String> set = new HashSet<String>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(property, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            if (s2.equals("<empty>")) {
                list.add(null);
            }
            else if (set.contains(s2)) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Duplicate option: " + s2 + ", key: " + s);
            }
            else {
                set.add(s2);
                if (s2.equals("<profile>")) {
                    if (array == null) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Option profile can not be used, no profiles defined: " + s2 + ", key: " + s);
                    }
                    else {
                        list.add(new net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll(array, array2));
                    }
                }
                else if (s2.equals("*")) {
                    list.add((net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll)new IIlllIIlIllIllIlIIll("<rest>"));
                }
                else if (s2.startsWith("[") && s2.endsWith("]")) {
                    final String llIllIIIIIllIlIIIIlI = IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(s2, "[", "]");
                    if (!llIllIIIIIllIlIIIIlI.matches("^[a-zA-Z0-9_]+$")) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid screen: " + s2 + ", key: " + s);
                    }
                    else if (!llllIIIIlIIIlIlllIll("screen." + llIllIIIIIllIlIIIIlI, properties, map, array, array2)) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid screen: " + s2 + ", key: " + s);
                    }
                    else {
                        list.add((net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll)new lllIIIIlllllIlIIllIl(llIllIIIIIllIlIIIIlI));
                    }
                }
                else {
                    final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll2 = lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(s2, array2);
                    if (llllIIIIlIIIlIlllIll2 == null) {
                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("[Shaders] Invalid option: " + s2 + ", key: " + s);
                        list.add(null);
                    }
                    else {
                        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(true);
                        list.add((net.optifine.shaders.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll)llllIIIIlIIIlIlllIll2);
                    }
                }
            }
        }
        map.put(s, new llIIlIIIlIIIllIlIIIl(s, list.toArray(new IIIIlllIIIIIIlIIIlll[list.size()]), net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty(String.valueOf(s) + ".columns"), 2)));
        return true;
    }
    
    public static BufferedReader llllIIIIlIIIlIlllIll(final BufferedReader bufferedReader, final String s, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n, final List list, final int n2) {
        String substring = "/";
        final int lastIndex = s.lastIndexOf("/");
        if (lastIndex >= 0) {
            substring = s.substring(0, lastIndex);
        }
        final CharArrayWriter charArrayWriter = new CharArrayWriter();
        int n3 = -1;
        final LinkedHashSet<net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI> set = new LinkedHashSet<net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI>();
        int n4 = 1;
        while (true) {
            String s2 = bufferedReader.readLine();
            if (s2 == null) {
                char[] array = charArrayWriter.toCharArray();
                if (n3 >= 0 && set.size() > 0) {
                    final StringBuilder sb = new StringBuilder();
                    for (final net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2 : set) {
                        sb.append("#define ");
                        sb.append(lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll());
                        sb.append(" ");
                        sb.append(lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl());
                        sb.append("\n");
                    }
                    final String string = sb.toString();
                    final StringBuilder sb2 = new StringBuilder(new String(array));
                    sb2.insert(n3, string);
                    array = sb2.toString().toCharArray();
                }
                return new BufferedReader(new CharArrayReader(array));
            }
            if (n3 < 0 && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll.matcher(s2).matches()) {
                final String string2 = String.valueOf(s2) + "\n" + (String.valueOf(IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl()) + IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl());
                s2 = String.valueOf(string2) + ("#line " + (n4 + 1) + " " + n);
                n3 = charArrayWriter.size() + string2.length();
            }
            final Matcher matcher = IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.matcher(s2);
            if (matcher.matches()) {
                final String group = matcher.group(1);
                final String s3 = group.startsWith("/") ? ("/shaders" + group) : (String.valueOf(substring) + "/" + group);
                if (!list.contains(s3)) {
                    list.add(s3);
                }
                final int n5 = list.indexOf(s3) + 1;
                String s4 = llllIIIIlIIIlIlllIll(s3, lIlIlIIIllIIllIIIllI, n5, list, n2);
                if (s4 == null) {
                    throw new IOException("Included file not found: " + s);
                }
                if (s4.endsWith("\n")) {
                    s4 = s4.substring(0, s4.length() - 1);
                }
                String string3 = "#line 1 " + n5 + "\n";
                if (s4.startsWith("#version ")) {
                    string3 = "";
                }
                s2 = String.valueOf(string3) + s4 + "\n" + "#line " + (n4 + 1) + " " + n;
            }
            if (n3 >= 0 && s2.contains(IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl())) {
                final net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s2, IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI());
                for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
                    set.add(llllIIIIlIIIlIlllIll[i]);
                }
            }
            charArrayWriter.write(s2);
            charArrayWriter.write("\n");
            ++n4;
        }
    }
    
    private static net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI[] llllIIIIlIIIlIlllIll(final String s, final net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI[] array) {
        final ArrayList<net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI> list = new ArrayList<net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI>();
        for (int i = 0; i < array.length; ++i) {
            final net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI = array[i];
            if (s.contains(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll())) {
                list.add(lIlIlIIIllIIllIIIllI);
            }
        }
        return list.toArray(new net.optifine.shaders.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI[list.size()]);
    }
    
    private static String llllIIIIlIIIlIlllIll(final String s, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final int n, final List list, int n2) {
        if (n2 >= 10) {
            throw new IOException("#include depth exceeded: " + n2 + ", file: " + s);
        }
        ++n2;
        final InputStream llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(s);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        final BufferedReader llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(new BufferedReader(new InputStreamReader(llllIIIIlIIIlIlllIll, "ASCII")), s, lIlIlIIIllIIllIIIllI, n, list, n2);
        final CharArrayWriter charArrayWriter = new CharArrayWriter();
        while (true) {
            final String line = llllIIIIlIIIlIlllIll2.readLine();
            if (line == null) {
                break;
            }
            charArrayWriter.write(line);
            charArrayWriter.write("\n");
        }
        return charArrayWriter.toString();
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final Properties properties) {
        final String s = "uniform";
        final String s2 = "variable";
        new StringBuilder(String.valueOf(s)).append(".").toString();
        new StringBuilder(String.valueOf(s2)).append(".").toString();
        final HashMap<String, net.optifine.expr.llIIlIIIlIIIllIlIIIl> hashMap = new HashMap<String, net.optifine.expr.llIIlIIIlIIIllIlIIIl>();
        final ArrayList<net.optifine.shaders.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll> list = new ArrayList<net.optifine.shaders.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll>();
        for (final String s3 : ((Hashtable<String, V>)properties).keySet()) {
            final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s3, ".");
            if (llllIIIIlIIIlIlllIll.length == 3) {
                final String s4 = llllIIIIlIIIlIlllIll[0];
                final String s5 = llllIIIIlIIIlIlllIll[1];
                final String s6 = llllIIIIlIIIlIlllIll[2];
                final String trim = properties.getProperty(s3).trim();
                if (hashMap.containsKey(s6)) {
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Expression already defined: " + s6);
                }
                else {
                    if (!s4.equals(s) && !s4.equals(s2)) {
                        continue;
                    }
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llIllIIIIIllIlIIIIlI("Custom " + s4 + ": " + s6);
                    final net.optifine.shaders.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(s4, s6, s5, trim, hashMap);
                    if (llllIIIIlIIIlIlllIll2 == null) {
                        continue;
                    }
                    hashMap.put(s6, llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI());
                    if (s4.equals(s2)) {
                        continue;
                    }
                    list.add(llllIIIIlIIIlIlllIll2);
                }
            }
        }
        if (list.size() <= 0) {
            return null;
        }
        return new IlIlIlIlIlllllllllIl(list.toArray(new net.optifine.shaders.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll[list.size()]), hashMap);
    }
    
    private static net.optifine.shaders.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final String s, final String s2, final String s3, final String s4, final Map map) {
        try {
            final net.optifine.shaders.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl ilIlIlIlIlllllllllIl = net.optifine.shaders.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(s3);
            if (ilIlIlIlIlllllllllIl == null) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Unknown " + s + " type: " + ilIlIlIlIlllllllllIl);
                return null;
            }
            final net.optifine.expr.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = new IlIIIlIlIIIllIlIlIIl(new llIllIIIIIllIlIIIIlI(map)).llIllIIIIIllIlIIIIlI(s4);
            final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
            if (!ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl("Expression type does not match " + s + " type, expression: " + llllIIIIlIIIlIlllIll + ", " + s + ": " + ilIlIlIlIlllllllllIl + " " + s2);
                return null;
            }
            return new net.optifine.shaders.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(s2, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI));
        }
        catch (net.optifine.expr.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(String.valueOf(ilIlIIIIIIlllIlIllIl.getClass().getName()) + ": " + ilIlIIIIIIlllIlIllIl.getMessage());
            return null;
        }
    }
    
    private static net.optifine.expr.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final net.optifine.expr.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (llIIlIIIlIIIllIlIIIl instanceof net.optifine.expr.IlIlIIIllIIllIlllllI) ? new net.optifine.expr.llIllIIIIIllIlIIIIlI((net.optifine.expr.IlIlIIIllIIllIlllllI)llIIlIIIlIIIllIlIIIl) : ((llIIlIIIlIIIllIlIIIl instanceof net.optifine.expr.IIIIlllIIIIIIlIIIlll) ? new net.optifine.expr.IlIlIlIlIlllllllllIl((net.optifine.expr.IIIIlllIIIIIIlIIIlll)llIIlIIIlIIIllIlIIIl) : llIIlIIIlIIIllIlIIIl);
    }
    
    public static void IlIlIlIlIlllllllllIl(final Properties properties) {
        for (final String s : ((Hashtable<String, V>)properties).keySet()) {
            final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ".");
            if (llllIIIIlIIIlIlllIll.length == 2) {
                final String s2 = llllIIIIlIIIlIlllIll[0];
                final String s3 = llllIIIIlIIIlIlllIll[1];
                if (!s2.equals("alphaTest")) {
                    continue;
                }
                final net.optifine.shaders.IlIllIlIlIIIlIlIlIII llIllIlIIIIllIlIIllI = llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI(s3);
                if (llIllIlIIIIllIlIIllI == null) {
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid program name: " + s3);
                }
                else {
                    final net.optifine.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(properties.getProperty(s).trim());
                    if (llllIIIIlIIIlIlllIll2 == null) {
                        continue;
                    }
                    llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                }
            }
        }
    }
    
    private static net.optifine.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final String s) {
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        if (llllIIIIlIIIlIlllIll.length == 1) {
            final String s2 = llllIIIIlIIIlIlllIll[0];
            if (s2.equals("off") || s2.equals("false")) {
                return new net.optifine.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI(false);
            }
        }
        else if (llllIIIIlIIIlIlllIll.length == 2) {
            final String s3 = llllIIIIlIIIlIlllIll[0];
            final String s4 = llllIIIIlIIIlIlllIll[1];
            final Integer n = IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl.get(s3);
            final float llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s4, -1.0f);
            if (n != null && llllIIIIlIIIlIlllIll2 >= 0.0f) {
                return new net.optifine.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI(true, n, llllIIIIlIIIlIlllIll2);
            }
        }
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid alpha test: " + s);
        return null;
    }
    
    public static void llIllIIIIIllIlIIIIlI(final Properties properties) {
        for (final String s : ((Hashtable<String, V>)properties).keySet()) {
            final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ".");
            if (llllIIIIlIIIlIlllIll.length == 2) {
                final String s2 = llllIIIIlIIIlIlllIll[0];
                final String s3 = llllIIIIlIIIlIlllIll[1];
                if (!s2.equals("blend")) {
                    continue;
                }
                final net.optifine.shaders.IlIllIlIlIIIlIlIlIII llIllIlIIIIllIlIIllI = llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI(s3);
                if (llIllIlIIIIllIlIIllI == null) {
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid program name: " + s3);
                }
                else {
                    final IllIIlllIIIIlllIIlIl ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(properties.getProperty(s).trim());
                    if (ilIlIlIlIlllllllllIl == null) {
                        continue;
                    }
                    llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                }
            }
        }
    }
    
    private static IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl(final String s) {
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        if (llllIIIIlIIIlIlllIll.length == 1) {
            final String s2 = llllIIIIlIIIlIlllIll[0];
            if (s2.equals("off") || s2.equals("false")) {
                return new IllIIlllIIIIlllIIlIl(false);
            }
        }
        else if (llllIIIIlIIIlIlllIll.length == 2 || llllIIIIlIIIlIlllIll.length == 4) {
            final String s3 = llllIIIIlIIIlIlllIll[0];
            final String s4 = llllIIIIlIIIlIlllIll[1];
            String s5 = s3;
            String s6 = s4;
            if (llllIIIIlIIIlIlllIll.length == 4) {
                s5 = llllIIIIlIIIlIlllIll[2];
                s6 = llllIIIIlIIIlIlllIll[3];
            }
            final Integer n = IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI.get(s3);
            final Integer n2 = IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI.get(s4);
            final Integer n3 = IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI.get(s5);
            final Integer n4 = IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI.get(s6);
            if (n != null && n2 != null && n3 != null && n4 != null) {
                return new IllIIlllIIIIlllIIlIl(true, n, n2, n3, n4);
            }
        }
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid blend mode: " + s);
        return null;
    }
    
    public static void IlIIIlIlIIIllIlIlIIl(final Properties properties) {
        for (final String s : ((Hashtable<String, V>)properties).keySet()) {
            final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ".");
            if (llllIIIIlIIIlIlllIll.length == 2) {
                final String s2 = llllIIIIlIIIlIlllIll[0];
                final String s3 = llllIIIIlIIIlIlllIll[1];
                if (!s2.equals("scale")) {
                    continue;
                }
                final net.optifine.shaders.IlIllIlIlIIIlIlIlIII llIllIlIIIIllIlIIllI = llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI(s3);
                if (llIllIlIIIIllIlIIllI == null) {
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid program name: " + s3);
                }
                else {
                    final lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(properties.getProperty(s).trim());
                    if (llIllIIIIIllIlIIIIlI == null) {
                        continue;
                    }
                    llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
                }
            }
        }
    }
    
    private static lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI(final String s) {
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        final float llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[0], -1.0f);
        float llllIIIIlIIIlIlllIll3 = 0.0f;
        float llllIIIIlIIIlIlllIll4 = 0.0f;
        if (llllIIIIlIIIlIlllIll.length > 1) {
            if (llllIIIIlIIIlIlllIll.length != 3) {
                net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid render scale: " + s);
                return null;
            }
            llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[1], -1.0f);
            llllIIIIlIIIlIlllIll4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[2], -1.0f);
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2, 0.0f, 1.0f) && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3, 0.0f, 1.0f) && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4, 0.0f, 1.0f)) {
            return new lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll4);
        }
        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid render scale: " + s);
        return null;
    }
    
    public static void IlIlIIIllIllIIIIIllI(final Properties properties) {
        for (final String s : ((Hashtable<String, V>)properties).keySet()) {
            final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ".");
            if (llllIIIIlIIIlIlllIll.length == 3) {
                final String s2 = llllIIIIlIIIlIlllIll[0];
                final String s3 = llllIIIIlIIIlIlllIll[1];
                final String s4 = llllIIIIlIIIlIlllIll[2];
                if (!s2.equals("flip")) {
                    continue;
                }
                final net.optifine.shaders.IlIllIlIlIIIlIlIlIII llIllIlIIIIllIlIIllI = llIIlllIIlllIIllIllI.llIllIlIIIIllIlIIllI(s3);
                if (llIllIlIIIIllIlIIllI == null) {
                    net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid program name: " + s3);
                }
                else {
                    final Boolean[] lllIIIIlllllIlIIllIl = llIllIlIIIIllIlIIllI.lllIIIIlllllIlIIllIl();
                    final int liiiIlIIIIIlllIllIII = llIIlllIIlllIIllIllI.lIIIIlIIIIIlllIllIII(s4);
                    if (liiiIlIIIIIlllIllIII >= 0 && liiiIlIIIIIlllIllIII < lllIIIIlllllIlIIllIl.length) {
                        final String trim = properties.getProperty(s).trim();
                        final Boolean llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, (Boolean)null);
                        if (llllIIIIlIIIlIlllIll2 == null) {
                            net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid boolean value: " + trim);
                        }
                        else {
                            lllIIIIlllllIlIIllIl[liiiIlIIIIIlllIllIII] = llllIIIIlIIIlIlllIll2;
                        }
                    }
                    else {
                        net.optifine.shaders.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll("Invalid buffer name: " + s4);
                    }
                }
            }
        }
    }
    
    private static Map IlIlIlIlIlllllllllIl() {
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("NEVER", new Integer(512));
        hashMap.put("LESS", new Integer(513));
        hashMap.put("EQUAL", new Integer(514));
        hashMap.put("LEQUAL", new Integer(515));
        hashMap.put("GREATER", new Integer(516));
        hashMap.put("NOTEQUAL", new Integer(517));
        hashMap.put("GEQUAL", new Integer(518));
        hashMap.put("ALWAYS", new Integer(519));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    private static Map llIllIIIIIllIlIIIIlI() {
        final HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("ZERO", new Integer(0));
        hashMap.put("ONE", new Integer(1));
        hashMap.put("SRC_COLOR", new Integer(768));
        hashMap.put("ONE_MINUS_SRC_COLOR", new Integer(769));
        hashMap.put("DST_COLOR", new Integer(774));
        hashMap.put("ONE_MINUS_DST_COLOR", new Integer(775));
        hashMap.put("SRC_ALPHA", new Integer(770));
        hashMap.put("ONE_MINUS_SRC_ALPHA", new Integer(771));
        hashMap.put("DST_ALPHA", new Integer(772));
        hashMap.put("ONE_MINUS_DST_ALPHA", new Integer(773));
        hashMap.put("CONSTANT_COLOR", new Integer(32769));
        hashMap.put("ONE_MINUS_CONSTANT_COLOR", new Integer(32770));
        hashMap.put("CONSTANT_ALPHA", new Integer(32771));
        hashMap.put("ONE_MINUS_CONSTANT_ALPHA", new Integer(32772));
        hashMap.put("SRC_ALPHA_SATURATE", new Integer(776));
        return Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
}
