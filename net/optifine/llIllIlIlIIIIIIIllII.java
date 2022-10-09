package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.util.*;
import java.io.*;

public class llIllIlIlIIIIIIIllII
{
    private static String llllIIIIlIIIlIlllIll;
    private static String IlIlIlIlIlllllllllIl;
    private static boolean llIllIIIIIllIlIIIIlI;
    private static boolean IlIIIlIlIIIllIlIlIIl;
    private static boolean IlIlIIIllIllIIIIIllI;
    private static boolean IllIIlllIIIIlllIIlIl;
    private static float llllIIIlIlllIlIIIIIl;
    private static float lIIIIlIIIIIlllIllIII;
    private static final String lIIIlllIIIllIIIllIII = ".png";
    private static final lIllllIllIllIIllllll llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll = null;
        llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl = null;
        llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI = false;
        llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl = false;
        llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI = false;
        llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl = false;
        llIIlIIIlIIIllIlIIIl = new lIllllIllIllIIllllll("mcpatcher/ctm/default/empty.png");
    }
    
    public static boolean llllIIIIlIIIlIlllIll() {
        return llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI;
    }
    
    public static String IlIlIlIlIlllllllllIl() {
        return llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll;
    }
    
    public static void llIllIIIIIllIlIIIIlI() {
        llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl = true;
        llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI = false;
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final Map map) {
        if (!llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl) {
            return ilIIIlIlIIIllIlIlIIl;
        }
        if (!(ilIIIlIlIIIllIlIlIIl instanceof lIIIlllIIIllIIIllIII)) {
            return ilIIIlIlIIIllIlIlIIl;
        }
        lIllllIllIllIIllllll lIllllIllIllIIllllll = ((lIIIlllIIIllIIIllIII)ilIIIlIlIIIllIlIlIIl).llIIlIIIlIIIllIlIIIl;
        if (!llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl) {
            if (lIllllIllIllIIllllll != null) {
                llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI = true;
            }
            return ilIIIlIlIIIllIlIlIIl;
        }
        if (lIllllIllIllIIllllll == null) {
            lIllllIllIllIIllllll = llIllIlIlIIIIIIIllII.llIIlIIIlIIIllIlIIIl;
        }
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = map.get(lIllllIllIllIIllllll);
        if (ilIIIlIlIIIllIlIlIIl2 == null) {
            ilIIIlIlIIIllIlIlIIl2 = new lIIIlllIIIllIIIllIII(lIllllIllIllIIllllll);
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI().llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll, ilIIIlIlIIIllIlIlIIl2);
        }
        return ilIIIlIlIIIllIlIlIIl2;
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl() {
        return llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI;
    }
    
    public static void IlIlIIIllIllIIIIIllI() {
        llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl = lIIIIlIlIllllIIlIllI.IllIllIlllIllllIIllI;
        llIllIlIlIIIIIIIllII.lIIIIlIIIIIlllIllIII = lIIIIlIlIllllIIlIllI.llIlIIIIIlIIlIlIIlll;
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, 240.0f, llIllIlIlIIIIIIIllII.lIIIIlIIIIIlllIllIII);
        llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl = true;
    }
    
    public static void IllIIlllIIIIlllIIlIl() {
        llIllIlIlIIIIIIIllII.IllIIlllIIIIlllIIlIl = false;
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(lIIIIlIlIllllIIlIllI.lllIIIIlllllIlIIllIl, llIllIlIlIIIIIIIllII.llllIIIlIlllIlIIIIIl, llIllIlIlIIIIIIIllII.lIIIIlIIIIIlllIllIII);
    }
    
    public static void llllIIIlIlllIlIIIIIl() {
        llIllIlIlIIIIIIIllII.IlIIIlIlIIIllIlIlIIl = false;
        llIllIlIlIIIIIIIllII.IlIlIIIllIllIIIIIllI = false;
    }
    
    public static void lIIIIlIIIIIlllIllIII() {
        llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI = false;
        llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll = null;
        llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl = null;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIlIIIIIIIlIIlIlIIl()) {
            try {
                final String s = "optifine/emissive.properties";
                final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
                if (llllIIIIlIIIlIlllIll == null) {
                    return;
                }
                llllIIIIlIIIlIlllIll("Loading " + s);
                final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
                llllIIIIlIIIlIlllIll.close();
                llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll = llIIlllIIlllIIllIllI.getProperty("suffix.emissive");
                if (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll != null) {
                    llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl = String.valueOf(llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll) + ".png";
                }
                llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI = (llIllIlIlIIIIIIIllII.llllIIIIlIIIlIlllIll != null);
            }
            catch (FileNotFoundException ex2) {}
            catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("EmissiveTextures: " + s);
    }
    
    private static void IlIlIlIlIlllllllllIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("EmissiveTextures: " + s);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        return llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl != null && lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl().endsWith(llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl);
    }
    
    public static void llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        if (lIllllIllIllIIllllll != null && liiIlllIIIllIIIllIII != null) {
            liiIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI = false;
            liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = null;
            if (llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl != null) {
                final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
                if (ilIlIlIlIlllllllllIl.endsWith(".png")) {
                    if (ilIlIlIlIlllllllllIl.endsWith(llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl)) {
                        liiIlllIIIllIIIllIII.llIllIlIIIIllIlIIllI = true;
                    }
                    else {
                        final lIllllIllIllIIllllll llIIlIIIlIIIllIlIIIl = new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.valueOf(ilIlIlIlIlllllllllIl.substring(0, ilIlIlIlIlllllllllIl.length() - ".png".length())) + llIllIlIlIIIIIIIllII.IlIlIlIlIlllllllllIl);
                        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(llIIlIIIlIIIllIlIIIl)) {
                            liiIlllIIIllIIIllIII.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
                        }
                    }
                }
            }
        }
    }
}
