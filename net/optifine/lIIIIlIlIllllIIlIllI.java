package net.optifine;

import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;
import net.optifine.util.*;
import java.io.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIIlIlIllllIIlIllI
{
    private static llIIIIIIlIllIIlIIIll[] llllIIIIlIIIlIlllIll;
    
    static {
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll = new llIIIIIIlIllIIlIIIll[0];
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll = new llIIIIIIlIllIIlIIIll[0];
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIllIIlIlIlllllIIIII()) {
            final String s = "optifine/natural.properties";
            try {
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
                if (!net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("NaturalTextures: configuration \"" + s + "\" not found");
                    return;
                }
                final boolean ilIIIlIlIIIllIlIlIIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(lIllllIllIllIIllllll);
                final InputStream llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
                final ArrayList<llIIIIIIlIllIIlIIIll> list = new ArrayList<llIIIIIIlIllIIlIIIll>(256);
                final String ilIlIlIlIlllllllllIl = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                llllIIIIlIIIlIlllIll.close();
                final String[] llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, "\n\r");
                if (ilIIIlIlIIIllIlIlIIl) {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Natural Textures: Parsing default configuration \"" + s + "\"");
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Natural Textures: Valid only for textures from default resource pack");
                }
                else {
                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Natural Textures: Parsing configuration \"" + s + "\"");
                }
                final IlIlIIIIIIlllIlIllIl ilIlIlIlIlllllllllIl2 = IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl();
                for (int i = 0; i < llllIIIIlIIIlIlllIll2.length; ++i) {
                    final String trim = llllIIIIlIIIlIlllIll2[i].trim();
                    if (!trim.startsWith("#")) {
                        final String[] llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, "=");
                        if (llllIIIIlIIIlIlllIll3.length != 2) {
                            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Natural Textures: Invalid \"" + s + "\" line: " + trim);
                        }
                        else {
                            final String trim2 = llllIIIIlIIIlIlllIll3[0].trim();
                            final String trim3 = llllIIIIlIIIlIlllIll3[1].trim();
                            final IlIlIIIllIIllIlllllI llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI("minecraft:blocks/" + trim2);
                            if (llIllIIIIIllIlIIIIlI == null) {
                                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Natural Textures: Texture not found: \"" + s + "\" line: " + trim);
                            }
                            else {
                                final int iiiIlllIIIIIIlIIIlll = llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll();
                                if (iiiIlllIIIIIIlIIIlll < 0) {
                                    net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Natural Textures: Invalid \"" + s + "\" line: " + trim);
                                }
                                else {
                                    if (ilIIIlIlIIIllIlIlIIl && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(new lIllllIllIllIIllllll("textures/blocks/" + trim2 + ".png"))) {
                                        return;
                                    }
                                    final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = new llIIIIIIlIllIIlIIIll(trim3);
                                    if (llIIIIIIlIllIIlIIIll.llllIIIIlIIIlIlllIll()) {
                                        while (list.size() <= iiiIlllIIIIIIlIIIlll) {
                                            list.add(null);
                                        }
                                        list.set(iiiIlllIIIIIIlIIIlll, llIIIIIIlIllIIlIIIll);
                                        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("NaturalTextures: " + trim2 + " = " + trim3);
                                    }
                                }
                            }
                        }
                    }
                }
                lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll = list.toArray(new llIIIIIIlIllIIlIIIll[list.size()]);
            }
            catch (FileNotFoundException ex2) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("NaturalTextures: configuration \"" + s + "\" not found");
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public static net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IlIlIIIllIIllIlllllI llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll2 == null) {
            return llllIIIIlIIIlIlllIll;
        }
        final llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
        if (llllIIIIlIIIlIlllIll3 == null) {
            return llllIIIIlIIIlIlllIll;
        }
        final int llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI()));
        int n = 0;
        boolean b = false;
        if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll > 1) {
            n = (llllIIIIlIIIlIlllIll4 & 0x3);
        }
        if (llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll == 2) {
            n = n / 2 * 2;
        }
        if (llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl) {
            b = ((llllIIIIlIIIlIlllIll4 & 0x4) != 0x0);
        }
        return llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n, b);
    }
    
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        if (!(ilIlIIIllIIllIlllllI instanceof IlIlIIIllIIllIlllllI)) {
            return null;
        }
        final int iiiIlllIIIIIIlIIIlll = ilIlIIIllIIllIlllllI.IIIIlllIIIIIIlIIIlll();
        if (iiiIlllIIIIIIlIIIlll >= 0 && iiiIlllIIIIIIlIIIlll < lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll.length) {
            return lIIIIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll[iiiIlllIIIIIIlIIIlll];
        }
        return null;
    }
}
