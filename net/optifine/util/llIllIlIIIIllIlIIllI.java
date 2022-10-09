package net.optifine.util;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.io.*;
import java.util.*;

public class llIllIlIIIIllIlIIllI
{
    public static Properties llllIIIIlIIIlIlllIll(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
        final String s = ".png";
        if (!ilIlIlIlIlllllllllIl.endsWith(s)) {
            return llIIlllIIlllIIllIllI;
        }
        final String string = String.valueOf(ilIlIlIlIlllllllllIl.substring(0, ilIlIlIlIlllllllllIl.length() - s.length())) + ".properties";
        try {
            final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl(), new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), string));
            if (llllIIIIlIIIlIlllIll == null) {
                return llIIlllIIlllIIllIllI;
            }
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("Loading " + string);
            llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
            llllIIIIlIIIlIlllIll.close();
        }
        catch (FileNotFoundException ex2) {}
        catch (IOException ex) {
            ex.printStackTrace();
        }
        return llIIlllIIlllIIllIllI;
    }
    
    public static void llllIIIIlIIIlIlllIll(final Properties properties, final float[] array) {
        for (final String s : ((Hashtable<String, V>)properties).keySet()) {
            final String s2 = "width.";
            if (s.startsWith(s2)) {
                final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s.substring(s2.length()), -1);
                if (llllIIIIlIIIlIlllIll < 0 || llllIIIIlIIIlIlllIll >= array.length) {
                    continue;
                }
                final float llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty(s), -1.0f);
                if (llllIIIIlIIIlIlllIll2 < 0.0f) {
                    continue;
                }
                array[llllIIIIlIIIlIlllIll] = llllIIIIlIIIlIlllIll2;
            }
        }
    }
    
    public static float llllIIIIlIIIlIlllIll(final Properties properties, final String s, final float n) {
        final String property = properties.getProperty(s);
        if (property == null) {
            return n;
        }
        final float llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(property, Float.MIN_VALUE);
        if (llllIIIIlIIIlIlllIll == Float.MIN_VALUE) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid value for " + s + ": " + property);
            return n;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Properties properties, final String s, final boolean b) {
        final String property = properties.getProperty(s);
        if (property == null) {
            return b;
        }
        final String trim = property.toLowerCase().trim();
        if (trim.equals("true") || trim.equals("on")) {
            return true;
        }
        if (!trim.equals("false") && !trim.equals("off")) {
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid value for " + s + ": " + property);
            return b;
        }
        return false;
    }
    
    public static lIllllIllIllIIllllll IlIlIlIlIlllllllllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll) {
        if (!llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII()) {
            return lIllllIllIllIIllllll;
        }
        if (lIllllIllIllIIllllll == null) {
            return lIllllIllIllIIllllll;
        }
        if (!llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll()) {
            return lIllllIllIllIIllllll;
        }
        final String ilIlIlIlIlllllllllIl = lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl();
        final String s = "textures/";
        final String s2 = "mcpatcher/";
        if (!ilIlIlIlIlllllllllIl.startsWith(s)) {
            return lIllllIllIllIIllllll;
        }
        final lIllllIllIllIIllllll lIllllIllIllIIllllll2 = new lIllllIllIllIIllllll(lIllllIllIllIIllllll.llIllIIIIIllIlIIIIlI(), String.valueOf(s2) + ilIlIlIlIlllllllllIl.substring(s.length()));
        return llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIIllIIllIIllIIlIIl(), lIllllIllIllIIllllll2) ? lIllllIllIllIIllllll2 : lIllllIllIllIIllllll;
    }
}
