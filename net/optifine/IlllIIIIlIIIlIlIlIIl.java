package net.optifine;

import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.io.*;
import net.optifine.util.*;
import net.optifine.llllIIIIlIIIlIlllIll.*;
import net.minecraft.client.IlIlIIIllIllIIIIIllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlllIIIIlIIIlIlIlIIl
{
    private static lllIllIIIllllllIllll llllIIIIlIIIlIlllIll;
    private static Map IlIlIlIlIlllllllllIl;
    private static Map llIllIIIIIllIlIIIIlI;
    private static long IlIIIlIlIIIllIlIlIIl;
    private static final double IlIlIIIllIllIIIIIllI = 7.5;
    private static final double IllIIlllIIIIlllIIlIl = 56.25;
    private static final int llllIIIlIlllIlIIIIIl = 15;
    private static final int lIIIIlIIIIIlllIllIII = 15;
    private static final int lIIIlllIIIllIIIllIII = 10;
    private static final int llIIlIIIlIIIllIlIIIl = 8;
    private static final int llIllIlIIIIllIlIIllI = 13;
    private static final int lIlIlIIIllIIllIIIllI = 8;
    private static final int IlIlIIIllIIllIlllllI = 8;
    private static boolean IIIIlllIIIIIIlIIIlll;
    
    static {
        IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll = new lllIllIIIllllllIllll();
        IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl = new HashMap();
        IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI = new HashMap();
        IlllIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl = 0L;
    }
    
    public static void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
    }
    
    public static void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        synchronized (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            final IIllllIIIlIIIIIIllIl ilIlIlIlIlllllllllIl = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
            if (ilIlIlIlIlllllllllIl != null) {
                ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(lllllIIIIIlIlIIIIIIl);
            }
        }
        // monitorexit(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll)
    }
    
    public static void llllIIIIlIIIlIlllIll(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        final long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis >= IlllIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl + 50L) {
            IlllIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl = currentTimeMillis;
            if (!IlllIIIIlIIIlIlIlIIl.IIIIlllIIIIIIlIIIlll) {
                llIllIIIIIllIlIIIIlI();
            }
            synchronized (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll) {
                llIllIIIIIllIlIIIIlI(lllllIIIIIlIlIIIIIIl);
                if (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() > 0) {
                    final List llIllIIIIIllIlIIIIlI = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                    for (int i = 0; i < llIllIIIIIllIlIIIIlI.size(); ++i) {
                        llIllIIIIIllIlIIIIlI.get(i).llllIIIIlIIIlIlllIll(lllllIIIIIlIlIIIIIIl);
                    }
                }
            }
            // monitorexit(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll)
        }
    }
    
    private static void llIllIIIIIllIlIIIIlI() {
        IlllIIIIlIIIlIlIlIIl.IIIIlllIIIIIIlIIIlll = true;
        IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl.clear();
        IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI.clear();
        final String[] llllIIIIlIIIlIlllIll = net.optifine.lIIIIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            try {
                final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s, "optifine/dynamic_lights.properties");
                llllIIIIlIIIlIlllIll(net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll), lIllllIllIllIIllllll.toString(), s);
            }
            catch (IOException ex) {}
        }
        if (IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl.size() > 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("DynamicLights entities: " + IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl.size());
        }
        if (IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI.size() > 0) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("DynamicLights items: " + IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI.size());
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final InputStream inputStream, final String s, final String s2) {
        if (inputStream != null) {
            try {
                final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI = new llIIlllIIlllIIllIllI();
                llIIlllIIlllIIllIllI.load(inputStream);
                inputStream.close();
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("DynamicLights: Parsing " + s);
                final net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("DynamicLights");
                llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.getProperty("entities"), IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl, new IlIIIlIlIIIllIlIlIIl(), llllIIIIlIIIlIlllIll, s, s2);
                llllIIIIlIIIlIlllIll(llIIlllIIlllIIllIllI.getProperty("items"), IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI, new lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll, s, s2);
            }
            catch (IOException ex) {
                net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("DynamicLights: Error reading " + s);
            }
        }
    }
    
    private static void llllIIIIlIIIlIlllIll(final String s, final Map map, final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s2, final String s3) {
        if (s != null) {
            final String[] llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
            for (int i = 0; i < llllIIIIlIIIlIlllIll2.length; ++i) {
                final String s4 = llllIIIIlIIIlIlllIll2[i];
                final String[] llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s4, ":");
                if (llllIIIIlIIIlIlllIll3.length != 2) {
                    llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI("Invalid entry: " + s4 + ", in:" + s2);
                }
                else {
                    final String s5 = llllIIIIlIIIlIlllIll3[0];
                    final String s6 = llllIIIIlIIIlIlllIll3[1];
                    final String string = String.valueOf(s3) + ":" + s5;
                    final Object llllIIIIlIIIlIlllIll4 = llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(string));
                    if (llllIIIIlIIIlIlllIll4 == null) {
                        llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI("Object not found: " + string);
                    }
                    else {
                        final int llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s6, -1);
                        if (llllIIIIlIIIlIlllIll5 >= 0 && llllIIIIlIIIlIlllIll5 <= 15) {
                            map.put(llllIIIIlIIIlIlllIll4, new Integer(llllIIIIlIIIlIlllIll5));
                        }
                        else {
                            llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI("Invalid light level: " + s4);
                        }
                    }
                }
            }
        }
    }
    
    private static void llIllIIIIIllIlIIIIlI(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIIIIIIlllIlIllIl = lllllIIIIIlIlIIIIIIl.IlIlIIIIIIlllIlIllIl();
        if (ilIlIIIIIIlllIlIllIl != null) {
            for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : ilIlIIIIIIlllIlIllIl.IIIlIIIlIlIIlllIIlll()) {
                if (llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI) > 0) {
                    final int illlIIIIlIIIlIlIlIIl = llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl();
                    if (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl) != null) {
                        continue;
                    }
                    IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlIIIIlIIIlIlIlIIl, new IIllllIIIlIIIIIIllIl(llIllIIIIIllIlIIIIlI));
                }
                else {
                    final IIllllIIIlIIIIIIllIl ilIlIlIlIlllllllllIl = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl());
                    if (ilIlIlIlIlllllllllIl == null) {
                        continue;
                    }
                    ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(lllllIIIIIlIlIIIIIIl);
                }
            }
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, int llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl), llllIIIIlIIIlIlllIll);
        return llllIIIIlIIIlIlllIll;
    }
    
    public static int llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, int llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI), llllIIIIlIIIlIlllIll);
        return llllIIIIlIIIlIlllIll;
    }
    
    public static int llllIIIIlIIIlIlllIll(final double n, int n2) {
        if (n > 0.0) {
            final int n3 = (int)(n * 16.0);
            if (n3 > (n2 & 0xFF)) {
                n2 &= 0xFFFFFF00;
                n2 |= n3;
            }
        }
        return n2;
    }
    
    public static double llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        double n = 0.0;
        synchronized (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            final List llIllIIIIIllIlIIIIlI = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            for (int size = llIllIIIIIllIlIIIIlI.size(), i = 0; i < size; ++i) {
                final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = llIllIIIIIllIlIIIIlI.get(i);
                int n2 = illllIIIlIIIIIIllIl.IlIlIIIllIllIIIIIllI();
                if (n2 > 0) {
                    final double ilIlIlIlIlllllllllIl2 = illllIIIlIIIIIIllIl.IlIlIlIlIlllllllllIl();
                    final double llIllIIIIIllIlIIIIlI2 = illllIIIlIIIIIIllIl.llIllIIIIIllIlIIIIlI();
                    final double ilIIIlIlIIIllIlIlIIl = illllIIIlIIIIIIllIl.IlIIIlIlIIIllIlIlIIl();
                    final double n3 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - ilIlIlIlIlllllllllIl2;
                    final double n4 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - llIllIIIIIllIlIIIIlI2;
                    final double n5 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - ilIIIlIlIIIllIlIlIIl;
                    double n6 = n3 * n3 + n4 * n4 + n5 * n5;
                    if (illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI()) {
                        n2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n2 - 2, 0, 15);
                        n6 *= 2.0;
                    }
                    if (n6 <= 56.25) {
                        final double n7 = (1.0 - Math.sqrt(n6) / 7.5) * n2;
                        if (n7 > n) {
                            n = n7;
                        }
                    }
                }
            }
        }
        // monitorexit(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll)
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, 0.0, 15.0);
    }
    
    public static int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl == null) {
            return 0;
        }
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll();
        if (llllIIIIlIIIlIlllIll instanceof IIlllIIIlIlllIIlllII) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll lllIIIIlllllIlIIllIl = ((IIlllIIIlIlllIIlllII)llllIIIIlIIIlIlllIll).lllIIIIlllllIlIIllIl();
            if (lllIIIIlllllIlIIllIl != null) {
                return lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl();
            }
        }
        if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.IlIllllIIIlIllIlIIll) {
            return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        }
        if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.z || llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.H) {
            return 10;
        }
        if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.lIIlIIIIIIIlIIlIlIIl) {
            return 8;
        }
        if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.aH) {
            return 8;
        }
        if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.I) {
            return 8;
        }
        if (llllIIIIlIIIlIlllIll == IIllIIllIIIlIlIIIIlI.ad) {
            return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ac.IlIIIlIlIIIllIlIlIIl() / 2;
        }
        if (!IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI.isEmpty()) {
            final Integer n = IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI.get(llllIIIIlIIIlIlllIll);
            if (n != null) {
                return n;
            }
        }
        return 0;
    }
    
    public static int llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI == net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lIIIIlIlIllllIIlIllI() && !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.z()) {
            return 0;
        }
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).IlIIIlIlIIIllIlIlIIl()) {
            return 0;
        }
        if (llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl()) {
            return 15;
        }
        if (!IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl.isEmpty()) {
            final Integer n = IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl.get(llIllIIIIIllIlIIIIlI.getClass());
            if (n != null) {
                return n;
            }
        }
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) {
            return 15;
        }
        if (llIllIIIIIllIlIIIIlI instanceof IIIlIIIlIlIIlllIIlll) {
            return 15;
        }
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) {
            return ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).lIIIIlIIIIIlllIllIII() ? 15 : 10;
        }
        if (llIllIIIIIllIlIIIIlI instanceof IlIlIllllllllIIIIlII) {
            return (((IlIlIllllllllIIIIlII)llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl > 0.6) ? 13 : 8;
        }
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI).IlIIIlIlIIIllIlIlIIl(0.0f) > 0.001) {
            return 15;
        }
        if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI;
            return Math.max(llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.n()), llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(4)));
        }
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII) {
            return llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII)llIllIIIIIllIlIIIIlI));
        }
        return 0;
    }
    
    public static void IlIlIlIlIlllllllllIl(final lllllIIIIIlIlIIIIIIl lllllIIIIIlIlIIIIIIl) {
        synchronized (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            final List llIllIIIIIllIlIIIIlI = IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.size(); ++i) {
                llIllIIIIIllIlIIIIlI.get(i).IlIlIlIlIlllllllllIl(lllllIIIIIlIlIIIIIIl);
            }
            IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        }
        // monitorexit(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll)
    }
    
    public static void llllIIIIlIIIlIlllIll() {
        synchronized (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        }
        // monitorexit(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll)
    }
    
    public static int IlIlIlIlIlllllllllIl() {
        synchronized (IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll) {
            // monitorexit(IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll)
            return IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        }
    }
    
    public static lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        return liiIlllIIIllIIIllIII.llIllIlIlIIIIIIIllII().IllIIlllIIIIlllIIlIl(10);
    }
}
