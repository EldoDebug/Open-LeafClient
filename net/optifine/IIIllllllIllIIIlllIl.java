package net.optifine;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.io.*;
import net.optifine.util.*;

public class IIIllllllIllIIIlllIl
{
    private static IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll;
    private static final Random IlIlIlIlIlllllllllIl;
    
    static {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll = null;
        IlIlIlIlIlllllllllIl = new Random();
    }
    
    public static IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll() {
        return IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll;
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll = null;
        final String[] llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.length > 1) {
            final Properties[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
            final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll));
            final String s = llIllIIIIIllIlIIIIlI[llllIIIIlIIIlIlllIll2];
            Properties properties = llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll2];
            if (properties == null) {
                properties = llllIIIIlIIIlIlllIll[0];
            }
            if (properties == null) {
                properties = new llIIlllIIlllIIllIllI();
            }
            IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll = new IlIIIlIIIllllIlIlIlI(s, properties);
        }
    }
    
    private static String[] llIllIIIIIllIlIIIIlI() {
        final ArrayList<String> list = new ArrayList<String>();
        list.add("textures/gui/title/background");
        for (int i = 0; i < 100; ++i) {
            final String string = "optifine/gui/background" + i;
            if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(new lIllllIllIllIIllllll(String.valueOf(string) + "/panorama_0.png"))) {
                list.add(string);
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    private static Properties[] llllIIIIlIIIlIlllIll(final String[] array) {
        final Properties[] array2 = new Properties[array.length];
        for (int i = 0; i < array.length; ++i) {
            String s = array[i];
            if (i == 0) {
                s = "optifine/gui";
            }
            else {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomPanorama: " + s);
            }
            final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(String.valueOf(s) + "/background.properties");
            try {
                final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                if (llllIIIIlIIIlIlllIll != null) {
                    final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                    llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomPanorama: " + lIllllIllIllIIllllll.IlIlIlIlIlllllllllIl());
                    array2[i] = llIIlllIIlllIIllIllI;
                    llllIIIIlIIIlIlllIll.close();
                }
            }
            catch (IOException ex) {}
        }
        return array2;
    }
    
    private static int[] llllIIIIlIIIlIlllIll(final Properties[] array) {
        final int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; ++i) {
            Properties properties = array[i];
            if (properties == null) {
                properties = array[0];
            }
            if (properties == null) {
                array2[i] = 1;
            }
            else {
                array2[i] = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(properties.getProperty("weight", null), 1);
            }
        }
        return array2;
    }
    
    private static int llllIIIIlIIIlIlllIll(final int[] array) {
        final int nextInt = IIIllllllIllIIIlllIl.IlIlIlIlIlllllllllIl.nextInt(IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl(array));
        int n = 0;
        for (int i = 0; i < array.length; ++i) {
            n += array[i];
            if (n > nextInt) {
                return i;
            }
        }
        return array.length - 1;
    }
}
