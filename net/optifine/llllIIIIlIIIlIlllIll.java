package net.optifine;

import net.minecraft.client.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.optifine.util.*;
import java.io.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class llllIIIIlIIIlIlllIll
{
    private static boolean llllIIIIlIIIlIlllIll;
    private static boolean IlIlIlIlIlllllllllIl;
    private static boolean llIllIIIIIllIlIIIIlI;
    private static boolean IlIIIlIlIIIllIlIlIIl;
    private static boolean IlIlIIIllIllIIIIIllI;
    private static boolean IllIIlllIIIIlllIIlIl;
    private static boolean llllIIIlIlllIlIIIIIl;
    private static IlIlIIIllIIllIlllllI lIIIIlIIIIIlllIllIII;
    private static IlIlIIIllIIllIlllllI lIIIlllIIIllIIIllIII;
    private static IlIlIIIllIIllIlllllI llIIlIIIlIIIllIlIIIl;
    private static IlIlIIIllIIllIlllllI llIllIlIIIIllIlIIllI;
    private static IlIlIIIllIIllIlllllI lIlIlIIIllIIllIIIllI;
    private static boolean IlIlIIIllIIllIlllllI;
    private static IlIlIlIlIlllllllllIl IIIIlllIIIIIIlIIIlll;
    private static IlIlIlIlIlllllllllIl llllIIllllIlIlIIIIll;
    private static IlIlIlIlIlllllllllIl IlIllIlIlIIIlIlIlIII;
    private static IlIlIlIlIlllllllllIl IIlllIIlIllIllIlIIll;
    private static boolean lllIIIIlllllIlIIllIl;
    private static final String IlIlIIIIIIlllIlIllIl = "blocks/grass_top";
    private static final String IIllIIllIIIlIlIIIIlI = "blocks/grass_side";
    private static final String IIIlIIIlIlIIlllIIlll = "blocks/mycelium_top";
    private static final String IlIlIIIlIIlIlIIlllIl = "blocks/dirt_podzol_top";
    private static final String IlllllllIIIlIIIlIlII = "blocks/snow";
    
    static {
        net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll = true;
        net.optifine.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl = true;
        net.optifine.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI = true;
        net.optifine.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl = true;
        net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI = true;
        net.optifine.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = true;
        net.optifine.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = false;
        net.optifine.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = null;
        net.optifine.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = null;
        net.optifine.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = null;
        net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = null;
        net.optifine.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI = null;
        net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI = false;
        net.optifine.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll = null;
        net.optifine.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll = null;
        net.optifine.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII = null;
        net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll = null;
        net.optifine.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl = false;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI = false;
        net.optifine.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl = false;
        IlIlIlIlIlllllllllIl(ilIlIIIIIIlllIlIllIl);
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        if (net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI) {
            net.optifine.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll = net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.optifine.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII, 0);
            if (net.optifine.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl) {
                net.optifine.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll = net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.optifine.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII, -1), net.optifine.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll);
            }
            net.optifine.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll = net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.optifine.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl, -1);
            net.optifine.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII = net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI, 0);
            net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll = net.optifine.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.optifine.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI, -1);
            net.optifine.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl = true;
        }
    }
    
    private static void IlIlIlIlIlllllllllIl(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll = true;
        net.optifine.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl = true;
        net.optifine.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI = true;
        net.optifine.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl = true;
        net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI = true;
        net.optifine.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = true;
        net.optifine.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll("blocks/grass_top"));
        net.optifine.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll("blocks/grass_side"));
        net.optifine.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll("blocks/mycelium_top"));
        net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll("blocks/dirt_podzol_top"));
        net.optifine.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI = ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll("blocks/snow"));
        net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI = true;
        final String s = "optifine/bettergrass.properties";
        try {
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
            if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
                return;
            }
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
            if (llllIIIIlIIIlIlllIll == null) {
                return;
            }
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll)) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("BetterGrass: Parsing default configuration " + s);
            }
            else {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("BetterGrass: Parsing configuration " + s);
            }
            final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
            llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
            net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "grass", true);
            net.optifine.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "mycelium", true);
            net.optifine.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "podzol", true);
            net.optifine.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "grass.snow", true);
            net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "mycelium.snow", true);
            net.optifine.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "podzol.snow", true);
            net.optifine.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "grass.multilayer", false);
            net.optifine.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "texture.grass", "blocks/grass_top", ilIlIIIIIIlllIlIllIl);
            net.optifine.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "texture.grass_side", "blocks/grass_side", ilIlIIIIIIlllIlIllIl);
            net.optifine.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "texture.mycelium", "blocks/mycelium_top", ilIlIIIIIIlllIlIllIl);
            net.optifine.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "texture.podzol", "blocks/dirt_podzol_top", ilIlIIIIIIlllIlIllIl);
            net.optifine.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI, "texture.snow", "blocks/snow", ilIlIIIIIIlllIlIllIl);
        }
        catch (IOException ex) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error reading: " + s + ", " + ex.getClass().getName() + ": " + ex.getMessage());
        }
    }
    
    private static IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll(final Properties properties, final String s, final String s2, final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
        String property = properties.getProperty(s);
        if (property == null) {
            property = s2;
        }
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll("textures/" + property + ".png");
        if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("BetterGrass texture not found: " + lIllllIllIllIIllllll);
            property = s2;
        }
        return ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(new lIllllIllIllIIllllll(property));
    }
    
    public static List llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final List list) {
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl || lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
            return list;
        }
        if (!net.optifine.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl) {
            return list;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI();
        return (llIllIIIIIllIlIIIIlI instanceof e) ? IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, list) : ((llIllIIIIIllIlIIIIlI instanceof IllIllIIIIlIIlIlllII) ? llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, list) : ((llIllIIIIIllIlIIIIlI instanceof IIllIIIlIIIIlIIlIIII) ? IlIIIlIlIIIllIlIlIIl(lIlIlIIIllIIllIIIllI, llIIlIIIlIIIllIlIIIl, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, list) : list));
    }
    
    private static List IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final List list) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI();
        final boolean b = llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllIIIlIlIIllIIIlI()) {
            if (b) {
                if (net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI && llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, lIlIlIIIllIIllIIIllI) == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI) {
                    return net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                }
            }
            else if (net.optifine.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl && llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), lllIllIIIllllllIllll, lIlIlIIIllIIllIIIllI) == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A) {
                return net.optifine.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            }
        }
        else if (b) {
            if (net.optifine.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI) {
                return net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            }
        }
        else if (net.optifine.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
            return net.optifine.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        }
        return list;
    }
    
    private static List llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final List list) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl, lIlIlIIIllIIllIIIllI);
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI) != IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI) {
            return list;
        }
        final boolean b = llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllIIIlIlIIllIIIlI()) {
            if (b) {
                if (net.optifine.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl && llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, lIlIlIIIllIIllIIIllI) == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI) {
                    return net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                }
            }
            else if (net.optifine.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll));
                if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI) == IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI) {
                    return net.optifine.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                }
            }
        }
        else if (b) {
            if (net.optifine.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) {
                return net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            }
        }
        else if (net.optifine.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
            return net.optifine.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        }
        return list;
    }
    
    private static List IlIIIlIlIIIllIlIlIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final List list) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI();
        final boolean b = llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI;
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIllIIIlIlIIllIIIlI()) {
            if (b) {
                if (net.optifine.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll, lIlIlIIIllIIllIIIllI) == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI) {
                    return net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                }
            }
            else if (net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), lllIllIIIllllllIllll, lIlIlIIIllIIllIIIllI) == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
                return net.optifine.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            }
        }
        else if (b) {
            if (net.optifine.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) {
                return net.optifine.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            }
        }
        else if (net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
            return net.optifine.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        }
        return list;
    }
    
    private static net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI) {
        return lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI();
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final Properties properties, final String s, final boolean b) {
        final String property = properties.getProperty(s);
        return (property == null) ? b : Boolean.parseBoolean(property);
    }
}
