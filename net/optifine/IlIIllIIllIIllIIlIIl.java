package net.optifine;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.io.*;
import net.optifine.util.*;
import java.util.*;

public class IlIIllIIllIIllIIlIIl
{
    private static Map lIIIIlIIIIIlllIllIII;
    private static boolean lIIIlllIIIllIIIllIII;
    private static lllllIIIIIlIlIIIIIIl llIIlIIIlIIIllIlIIIl;
    private static net.optifine.lllllIIIIIlIlIIIIIIl llIllIlIIIIllIlIIllI;
    private static IIIIlllIIIIIIlIIIlll lIlIlIIIllIIllIIIllI;
    private static lIlIIlllIIlIIlIlllIl IlIlIIIllIIllIlllllI;
    private static boolean IIIIlllIIIIIIlIIIlll;
    public static final String llllIIIIlIIIlIlllIll = ".png";
    public static final String IlIlIlIlIlllllllllIl = ".properties";
    public static final String llIllIIIIIllIlIIIIlI = "textures/entity/";
    public static final String IlIIIlIlIIIllIlIlIIl = "textures/painting/";
    public static final String IlIlIIIllIllIIIIIllI = "textures/";
    public static final String IllIIlllIIIIlllIIlIl = "optifine/random/";
    public static final String llllIIIlIlllIlIIIIIl = "mcpatcher/mob/";
    private static final String[] llllIIllllIlIlIIIIll;
    private static final String IlIllIlIlIIIlIlIlIII = "horse/";
    private static final String[] IIlllIIlIllIllIlIIll;
    private static final String[] lllIIIIlllllIlIIllIl;
    
    static {
        IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII = new HashMap();
        IlIIllIIllIIllIIlIIl.lIIIlllIIIllIIIllIII = false;
        IlIIllIIllIIllIIlIIl.llIllIlIIIIllIlIIllI = new net.optifine.lllllIIIIIlIlIIIIIIl();
        IlIIllIIllIIllIIlIIl.IlIlIIIllIIllIlllllI = new lIlIIlllIIlIIlIlllIl();
        IlIIllIIllIIllIIlIIl.IIIIlllIIIIIIlIIIlll = false;
        llllIIllllIlIlIIIIll = new String[] { "_armor", "_eyes", "_exploding", "_shooting", "_fur", "_eyes", "_invulnerable", "_angry", "_tame", "_collar" };
        IIlllIIlIllIllIlIIll = (String[])net.optifine.lIIIIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(null, IllIIlllIIIIlllIIlIl.class, String[].class, 2);
        lllIIIIlllllIlIIllIl = (String[])net.optifine.lIIIIlIIIIIlllIllIII.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(null, IllIIlllIIIIlllIIlIl.class, String[].class, 3);
    }
    
    public static void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (illlllllIIIlIIIlIlII != null) {
            final llllIIIIlIIIlIlllIll llIllIlIlIIIIIIIllII = llIllIIIIIllIlIIIIlI.llIllIlIlIIIIIIIllII();
            llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIIIlIIlIlIIlllIl();
            llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll = illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl);
            final UUID lllIIIIlIlIllIIlIIIl = llIllIIIIIllIlIIIIlI.lllIIIIlIlIllIIlIIIl();
            if (llIllIIIIIllIlIIIIlI instanceof IlIlIllllllllIIIIlII) {
                llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, (IlIlIllllllllIIIIlII)llIllIIIIIllIlIIIIlI);
            }
        }
    }
    
    public static void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
    }
    
    private static void llllIIIIlIIIlIlllIll(final UUID uuid, final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = net.optifine.util.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(uuid);
        if (llllIIIIlIIIlIlllIll instanceof IlIlIllllllllIIIIlII) {
            final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII2 = (IlIlIllllllllIIIIlII)llllIIIIlIIIlIlllIll;
            ilIlIllllllllIIIIlII.lllIIIIlllllIlIIllIl(ilIlIllllllllIIIIlII2.an());
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIlIllllllllIIIIlII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aS, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aS, 0));
            net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(ilIlIllllllllIIIIlII, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aT, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII2, net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.aT, 0));
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII2) {
        if (illlllllIIIlIIIlIlII2 != null) {
            final List iiIlIIIlIlIIlllIIlll = illlllllIIIlIIIlIlII2.IIIlIIIlIlIIlllIIlll();
            for (int i = 0; i < iiIlIIIlIlIIlllIIlll.size(); ++i) {
                llllIIIIlIIIlIlllIll(iiIlIIIlIlIIlllIIlll.get(i), illlllllIIIlIIIlIlII2);
            }
        }
        IlIIllIIllIIllIIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(null);
        IlIIllIIllIIllIIlIIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(null);
    }
    
    public static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        if (!IlIIllIIllIIllIIlIIl.lIIIlllIIIllIIIllIII) {
            return lIllllIllIllIIllllll;
        }
        if (IlIIllIIllIIllIIlIIl.IIIIlllIIIIIIlIIIlll) {
            return lIllllIllIllIIllllll;
        }
        try {
            IlIIllIIllIIllIIlIIl.IIIIlllIIIIIIlIIIlll = true;
            final IlIllllIIlIIlIlIlIll ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl();
            if (ilIlIlIlIlllllllllIl != null) {
                String s = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
                if (s.startsWith("horse/")) {
                    s = llllIIIIlIIIlIlllIll(s, "horse/".length());
                }
                if (!s.startsWith("textures/entity/") && !s.startsWith("textures/painting/")) {
                    return lIllllIllIllIIllllll;
                }
                final IllIIlllllIIllIIllIl illIIlllllIIllIIllIl = IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII.get(s);
                if (illIIlllllIIllIIllIl == null) {
                    return lIllllIllIllIIllllll;
                }
                return illIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, ilIlIlIlIlllllllllIl);
            }
        }
        finally {
            IlIIllIIllIIllIIlIIl.IIIIlllIIIIIIlIIIlll = false;
        }
        IlIIllIIllIIllIIlIIl.IIIIlllIIIIIIlIIIlll = false;
        return lIllllIllIllIIllllll;
    }
    
    private static String llllIIIIlIIIlIlllIll(final String s, final int n) {
        if (IlIIllIIllIIllIIlIIl.IIlllIIlIllIllIlIIll != null && IlIIllIIllIIllIIlIIl.lllIIIIlllllIlIIllIl != null) {
            for (int i = 0; i < IlIIllIIllIIllIIlIIl.lllIIIIlllllIlIIllIl.length; ++i) {
                if (s.startsWith(IlIIllIIllIIllIIlIIl.lllIIIIlllllIlIIllIl[i], n)) {
                    return IlIIllIIllIIllIIlIIl.IIlllIIlIllIllIlIIll[i];
                }
            }
            return s;
        }
        return s;
    }
    
    private static IlIllllIIlIIlIlIlIll IlIlIlIlIlllllllllIl() {
        if (IlIIllIIllIIllIIlIIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI != null) {
            IlIIllIIllIIllIIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(IlIIllIIllIIllIIlIIl.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI);
            return IlIIllIIllIIllIIlIIl.llIllIlIIIIllIlIIllI;
        }
        if (IlIIllIIllIIllIIlIIl.lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll != null) {
            final IlIIIlIlIIIllIlIlIIl llllIIllllIlIlIIIIll = IlIIllIIllIIllIIlIIl.lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll;
            if (llllIIllllIlIlIIIIll.IIlllIIIlIlllIIlllII() != null) {
                IlIIllIIllIIllIIlIIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll);
                return IlIIllIIllIIllIIlIIl.IlIlIIIllIIllIlllllI;
            }
        }
        return null;
    }
    
    private static IllIIlllllIIllIIllIl IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final boolean b) {
        final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        final lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll, b);
        if (llIllIIIIIllIlIIIIlI != null) {
            final IllIIlllllIIllIIllIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, lIllllIllIllIIllllll);
            if (llllIIIIlIIIlIlllIll != null) {
                return llllIIIIlIIIlIlllIll;
            }
        }
        final lIllllIllIllIIllllll[] ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll, b);
        return (ilIIIlIlIIIllIlIlIIl == null) ? null : new IllIIlllllIIllIIllIl(ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl);
    }
    
    private static IllIIlllllIIllIIllIl llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final lIllllIllIllIIllllll lIllllIllIllIIllllll2) {
        try {
            final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
            llllIIIIlIIIlIlllIll(String.valueOf(lIllllIllIllIIllllll2.IlIlIlIlIlllllllllIl()) + ", properties: " + ilIlIlIlIlllllllllIl);
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
            if (llllIIIIlIIIlIlllIll == null) {
                IlIlIlIlIlllllllllIl("Properties not found: " + ilIlIlIlIlllllllllIl);
                return null;
            }
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            final IllIIlllllIIllIIllIl illIIlllllIIllIIllIl = new IllIIlllllIIllIIllIl(llIIlllIIlllIIllIllI, ilIlIlIlIlllllllllIl, lIllllIllIllIIllllll2);
            return illIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl) ? illIIlllllIIllIIllIl : null;
        }
        catch (FileNotFoundException ex2) {
            IlIlIlIlIlllllllllIl("File not found: " + lIllllIllIllIIllllll2.IlIlIlIlIlllllllllIl());
            return null;
        }
        catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private static lIllllIllIllIIllllll llIllIIIIIllIlIIIIlI(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final boolean b) {
        final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, b);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        final String llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        final String ilIlIIIllIllIIIIIllI = IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), ".png");
        final lIllllIllIllIIllllll lIllllIllIllIIllllll2 = new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI, String.valueOf(ilIlIIIllIllIIIIIllI) + ".properties");
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll2)) {
            return lIllllIllIllIIllllll2;
        }
        final String ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl(ilIlIIIllIllIIIIIllI);
        if (ilIIIlIlIIIllIlIlIIl == null) {
            return null;
        }
        final lIllllIllIllIIllllll lIllllIllIllIIllllll3 = new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI, String.valueOf(ilIIIlIlIIIllIlIlIIl) + ".properties");
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll3) ? lIllllIllIllIIllllll3 : null;
    }
    
    protected static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final boolean b) {
        final String llIllIIIIIllIlIIIIlI = lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI();
        final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        String s = "textures/";
        String s2 = "optifine/random/";
        if (b) {
            s = "textures/entity/";
            s2 = "mcpatcher/mob/";
        }
        if (!ilIlIlIlIlllllllllIl.startsWith(s)) {
            return null;
        }
        return new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI, IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, s, s2));
    }
    
    private static String llIllIIIIIllIlIIIIlI(final String s) {
        return s.startsWith("optifine/random/") ? IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(s, "optifine/random/", "textures/") : (s.startsWith("mcpatcher/mob/") ? IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl(s, "mcpatcher/mob/", "textures/entity/") : null);
    }
    
    protected static lIllllIllIllIIllllll llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final int n) {
        if (lIllllIllIllIIllllll == null) {
            return null;
        }
        final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        final int lastIndex = ilIlIlIlIlllllllllIl.lastIndexOf(46);
        if (lastIndex < 0) {
            return null;
        }
        return new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.valueOf(ilIlIlIlIlllllllllIl.substring(0, lastIndex)) + n + ilIlIlIlIlllllllllIl.substring(lastIndex));
    }
    
    private static String IlIIIlIlIIIllIlIlIIl(final String s) {
        for (int i = 0; i < IlIIllIIllIIllIIlIIl.llllIIllllIlIlIIIIll.length; ++i) {
            final String s2 = IlIIllIIllIIllIIlIIl.llllIIllllIlIlIIIIll[i];
            if (s.endsWith(s2)) {
                return IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(s, s2);
            }
        }
        return null;
    }
    
    private static lIllllIllIllIIllllll[] IlIIIlIlIIIllIlIlIIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final boolean b) {
        final ArrayList<lIllllIllIllIIllllll> list = new ArrayList<lIllllIllIllIIllllll>();
        list.add(lIllllIllIllIIllllll);
        final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, b);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        for (int i = 1; i < list.size() + 10; ++i) {
            final lIllllIllIllIIllllll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, i + 1);
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2)) {
                list.add(llllIIIIlIIIlIlllIll2);
            }
        }
        if (list.size() <= 1) {
            return null;
        }
        final lIllllIllIllIIllllll[] array = list.toArray(new lIllllIllIllIIllllll[list.size()]);
        llllIIIIlIIIlIlllIll(String.valueOf(lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl()) + ", variants: " + array.length);
        return array;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII.clear();
        IlIIllIIllIIllIIlIIl.lIIIlllIIIllIIIllIII = false;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIlIlllIlIlllIlIllll()) {
            llIllIIIIIllIlIIIIlI();
        }
    }
    
    private static void llIllIIIIIllIlIIIIlI() {
        IlIIllIIllIIllIIlIIl.llIIlIIIlIIIllIlIIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIlIIlllIIlIIlIlllIl();
        IlIIllIIllIIllIIlIIl.lIlIlIIIllIIllIIIllI = net.minecraft.client.lIIIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl;
        final String[] array = { "optifine/random/", "mcpatcher/mob/" };
        final String[] array2 = { ".png", ".properties" };
        final String[] llllIIIIlIIIlIlllIll = IIlIIIIIllIlIIIlIIll.llllIIIIlIIIlIlllIll(array, array2);
        final HashSet<String> set = new HashSet<String>();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(String.valueOf(IIIllllllIllIIIlllIl.llIIlIIIlIIIllIlIIIl(IIIllllllIllIIIlllIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll[i], array2), "0123456789")) + ".png");
            if (!set.contains(llIllIIIIIllIlIIIIlI)) {
                set.add(llIllIIIIIllIlIIIIlI);
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(llIllIIIIIllIlIIIIlI);
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll) && IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII.get(llIllIIIIIllIlIIIIlI) == null) {
                    IllIIlllllIIllIIllIl illIIlllllIIllIIllIl = IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll, false);
                    if (illIIlllllIIllIIllIl == null) {
                        illIIlllllIIllIIllIl = IlIlIlIlIlllllllllIl(lIllllIllIllIIllllll, true);
                    }
                    if (illIIlllllIIllIIllIl != null) {
                        IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII.put(llIllIIIIIllIlIIIIlI, illIIlllllIIllIIllIl);
                    }
                }
            }
        }
        IlIIllIIllIIllIIlIIl.lIIIlllIIIllIIIllIII = !IlIIllIIllIIllIIlIIl.lIIIIlIIIIIlllIllIII.isEmpty();
    }
    
    public static void llllIIIIlIIIlIlllIll(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("RandomEntities: " + s);
    }
    
    public static void IlIlIlIlIlllllllllIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("RandomEntities: " + s);
    }
}
