package net.optifine;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.optifine.util.*;
import java.io.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.optifine.lIIIlllIIIllIIIllIII.*;

public class IIIIIllIIIIlIIIIllIl
{
    private static IIIIIIIIIlllIllIlIlI[][] llllIIIIlIIIlIlllIll;
    
    static {
        IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll = null;
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll = null;
    }
    
    public static void IlIlIlIlIlllllllllIl() {
        llllIIIIlIIIlIlllIll();
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IllIlllIllIIIIllllII()) {
            IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI();
        }
    }
    
    private static IIIIIIIIIlllIllIlIlI[][] llIllIIIIIllIlIIIIlI() {
        final IIIIIIIIIlllIllIlIlI[][] array = new IIIIIIIIIlllIllIlIlI[10][0];
        final String s = "mcpatcher/sky/world";
        int n = -1;
        for (int i = 0; i < array.length; ++i) {
            final String string = String.valueOf(s) + i + "/sky";
            final ArrayList<IIIIIIIIIlllIllIlIlI> list = new ArrayList<IIIIIIIIIlllIllIlIlI>();
            for (int j = 1; j < 1000; ++j) {
                final String string2 = String.valueOf(string) + j + ".properties";
                try {
                    final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(string2));
                    if (llllIIIIlIIIlIlllIll == null) {
                        break;
                    }
                    final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                    llIIlllIIlllIIllIllI.load(llllIIIIlIIIlIlllIll);
                    llllIIIIlIIIlIlllIll.close();
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("CustomSky properties: " + string2);
                    final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = new IIIIIIIIIlllIllIlIlI(llIIlllIIlllIIllIllI, String.valueOf(string) + j + ".png");
                    if (iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll(string2)) {
                        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll);
                        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                        if (llllIIIIlIIIlIlllIll2 == null) {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI("CustomSky: Texture not found: " + lIllllIllIllIIllllll);
                        }
                        else {
                            iiiiiiiiIlllIllIlIlI.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
                            list.add(iiiiiiiiIlllIllIlIlI);
                            llllIIIIlIIIlIlllIll.close();
                        }
                    }
                }
                catch (FileNotFoundException ex2) {
                    break;
                }
                catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (list.size() > 0) {
                array[i] = list.toArray(new IIIIIIIIIlllIllIlIlI[list.size()]);
                n = i;
            }
        }
        if (n < 0) {
            return null;
        }
        final IIIIIIIIIlllIllIlIlI[][] array2 = new IIIIIIIIIlllIllIlIlI[n + 1][0];
        for (int k = 0; k < array2.length; ++k) {
            array2[k] = array[k];
        }
        return array2;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll, final float n) {
        if (IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll != null) {
            final int iIlllIIlIllIllIlIIll = illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
            if (iIlllIIlIllIllIlIIll >= 0 && iIlllIIlIllIllIlIIll < IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll.length) {
                final IIIIIIIIIlllIllIlIlI[] array = IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll[iIlllIIlIllIllIlIIll];
                if (array != null) {
                    final int n2 = (int)(illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII() % 24000L);
                    final float llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(n);
                    final float llIIlIIIlIIIllIlIIIl = illlllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(n);
                    float liiiIlIIIIIlllIllIII = illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(n);
                    if (llIIlIIIlIIIllIlIIIl > 0.0f) {
                        liiiIlIIIIIlllIllIII /= llIIlIIIlIIIllIlIIIl;
                    }
                    for (int i = 0; i < array.length; ++i) {
                        final IIIIIIIIIlllIllIlIlI iiiiiiiiIlllIllIlIlI = array[i];
                        if (iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n2)) {
                            iiiiiiiiIlllIllIlIlI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n2, llIllIIIIIllIlIIIIlI, llIIlIIIlIIIllIlIIIl, liiiIlIIIIIlllIllIII);
                        }
                    }
                    IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1.0f - llIIlIIIlIIIllIlIIIl);
                }
            }
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        if (IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        final int iIlllIIlIllIllIlIIll = illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIlllIIlIllIllIlIIll();
        if (iIlllIIlIllIllIlIIll >= 0 && iIlllIIlIllIllIlIIll < IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll.length) {
            final IIIIIIIIIlllIllIlIlI[] array = IIIIIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll[iIlllIIlIllIllIlIIll];
            return array != null && array.length > 0;
        }
        return false;
    }
}
