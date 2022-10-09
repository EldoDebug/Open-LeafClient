package net.minecraft.llllIIllllIlIlIIIIll;

import net.optifine.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.collect.*;

public class llllIIIlIlllIlIIIIIl
{
    public static final String llllIIIIlIIIlIlllIll;
    public static final String IlIlIlIlIlllllllllIl = "-0+1-2-3&4-4+13";
    public static final String llIllIIIIIllIlIIIIlI = "+0-1-2-3&4-4+13";
    public static final String IlIIIlIlIIIllIlIlIIl = "-0-1+2-3&4-4+13";
    public static final String IlIlIIIllIllIIIIIllI = "-0+3-4+13";
    public static final String IllIIlllIIIIlllIIlIl = "+0-1+2-3&4-4+13";
    public static final String llllIIIlIlllIlIIIIIl = "+0-1-2+3&4-4+13";
    public static final String lIIIIlIIIIIlllIllIII = "+0+1-2-3&4-4+13";
    public static final String lIIIlllIIIllIIIllIII = "-5+6-7";
    public static final String llIIlIIIlIIIllIlIIIl = "+5-6-7";
    public static final String llIllIlIIIIllIlIIllI = "+14&13-13";
    public static final String lIlIlIIIllIIllIIIllI = "-0+1+2-3+13&4-4";
    public static final String IlIlIIIllIIllIlllllI = "+0-1+2+3+13&4-4";
    public static final String IIIIlllIIIIIIlIIIlll = "+0+1-2+3&4-4+13";
    private static final Map llllIIllllIlIlIIIIll;
    private static final Map IlIllIlIlIIIlIlIlIII;
    private static final Map IIlllIIlIllIllIlIIll;
    private static final String[] lllIIIIlllllIlIIllIl;
    
    static {
        llllIIIIlIIIlIlllIll = null;
        llllIIllllIlIlIIIIll = Maps.newHashMap();
        IlIllIlIlIIIlIlIlIII = Maps.newHashMap();
        IIlllIIlIllIllIlIIll = Maps.newHashMap();
        lllIIIIlllllIlIIllIl = new String[] { "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky" };
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(), "0 & !1 & !2 & !3 & 0+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "!0 & 1 & !2 & !3 & 1+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(), "0 & 1 & !2 & !3 & 0+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "0 & !1 & 2 & !3");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(), "!0 & !1 & 2 & !3 & 2+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(), "!0 & !1 & !2 & 3 & 3+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), "!0 & !1 & 2 & 3");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(), "!0 & 1 & !2 & 3 & 3+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "0 & !1 & !2 & 3 & 3+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(), "!0 & 1 & 2 & !3 & 2+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(), "!0 & 1 & 2 & 3 & 2+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), "0 & !1 & 2 & 3 & 2+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "0 & 1 & !2 & 3 & 3+6");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(), "5");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(), "5");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(), "5");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(), "5");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(), "5");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(), "5");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(), "5");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(), "5");
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.put(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(), "5");
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n, final int n2) {
        return (n & 1 << n2) != 0x0;
    }
    
    private static int IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return llllIIIIlIIIlIlllIll(n, n2) ? 1 : 0;
    }
    
    private static int llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        return llllIIIIlIIIlIlllIll(n, n2) ? 0 : 1;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n) {
        return llllIIIIlIIIlIlllIll(n, 5, 4, 3, 2, 1);
    }
    
    public static int llllIIIIlIIIlIlllIll(final Collection collection) {
        final int n = 3694022;
        if (collection == null || collection.isEmpty()) {
            return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl() ? net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(0, n) : n;
        }
        float n2 = 0.0f;
        float n3 = 0.0f;
        float n4 = 0.0f;
        float n5 = 0.0f;
        for (final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl : collection) {
            if (ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI()) {
                int n6 = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()].llIIlIIIlIIIllIlIIIl();
                if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl()) {
                    n6 = net.optifine.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(), n6);
                }
                for (int i = 0; i <= ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI(); ++i) {
                    n2 += (n6 >> 16 & 0xFF) / 255.0f;
                    n3 += (n6 >> 8 & 0xFF) / 255.0f;
                    n4 += (n6 >> 0 & 0xFF) / 255.0f;
                    ++n5;
                }
            }
        }
        if (n5 == 0.0f) {
            return 0;
        }
        return (int)(n2 / n5 * 255.0f) << 16 | (int)(n3 / n5 * 255.0f) << 8 | (int)(n4 / n5 * 255.0f);
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final Collection collection) {
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!iterator.next().IlIIIlIlIIIllIlIlIIl()) {
                return false;
            }
        }
        return true;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final boolean b) {
        final Integer llllIIIIlIIIlIlllIll = IlIIlllllIIllIIlllll.llllIIIIlIIIlIlllIll(n);
        if (b) {
            return llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, true));
        }
        if (net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IIlllIIlIllIllIlIIll.containsKey(llllIIIIlIIIlIlllIll)) {
            return (int)net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IIlllIIlIllIllIlIIll.get(llllIIIIlIIIlIlllIll);
        }
        final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, false));
        net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IIlllIIlIllIllIlIIll.put(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        return llllIIIIlIIIlIlllIll2;
    }
    
    public static String IlIlIlIlIlllllllllIl(final int n) {
        return net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.lllIIIIlllllIlIIllIl[llllIIIIlIIIlIlllIll(n)];
    }
    
    private static int llllIIIIlIIIlIlllIll(final boolean b, final boolean b2, final boolean b3, final int n, final int n2, final int n3, final int n4) {
        int n5 = 0;
        if (b) {
            n5 = llIllIIIIIllIlIIIIlI(n4, n2);
        }
        else if (n != -1) {
            if (n == 0 && llIllIIIIIllIlIIIIlI(n4) == n2) {
                n5 = 1;
            }
            else if (n == 1 && llIllIIIIIllIlIIIIlI(n4) > n2) {
                n5 = 1;
            }
            else if (n == 2 && llIllIIIIIllIlIIIIlI(n4) < n2) {
                n5 = 1;
            }
        }
        else {
            n5 = IlIlIlIlIlllllllllIl(n4, n2);
        }
        if (b2) {
            n5 *= n3;
        }
        if (b3) {
            n5 *= -1;
        }
        return n5;
    }
    
    private static int llIllIIIIIllIlIIIIlI(int i) {
        int n;
        for (n = 0; i > 0; i &= i - 1, ++n) {}
        return n;
    }
    
    private static int llllIIIIlIIIlIlllIll(final String s, final int n, final int n2, final int n3) {
        if (n >= s.length() || n2 < 0 || n >= n2) {
            return 0;
        }
        final int index = s.indexOf(124, n);
        if (index >= 0 && index < n2) {
            final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s, n, index - 1, n3);
            if (llllIIIIlIIIlIlllIll > 0) {
                return llllIIIIlIIIlIlllIll;
            }
            final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(s, index + 1, n2, n3);
            return (llllIIIIlIIIlIlllIll2 > 0) ? llllIIIIlIIIlIlllIll2 : false;
        }
        else {
            final int index2 = s.indexOf(38, n);
            if (index2 < 0 || index2 >= n2) {
                int n4 = 0;
                boolean b = false;
                int n5 = 0;
                boolean b2 = false;
                boolean b3 = false;
                int n6 = -1;
                int n7 = 0;
                int n8 = 0;
                int n9 = 0;
                for (int i = n; i < n2; ++i) {
                    final char char1 = s.charAt(i);
                    if (char1 >= '0' && char1 <= '9') {
                        if (n4 != 0) {
                            n8 = char1 - '0';
                            b = true;
                        }
                        else {
                            n7 = n7 * 10 + (char1 - '0');
                            n5 = 1;
                        }
                    }
                    else if (char1 == '*') {
                        n4 = 1;
                    }
                    else if (char1 == '!') {
                        if (n5 != 0) {
                            n9 += llllIIIIlIIIlIlllIll(b2, b, b3, n6, n7, n8, n3);
                            b3 = false;
                            n4 = 0;
                            b = false;
                            n5 = 0;
                            n8 = 0;
                            n7 = 0;
                            n6 = -1;
                        }
                        b2 = true;
                    }
                    else if (char1 == '-') {
                        if (n5 != 0) {
                            n9 += llllIIIIlIIIlIlllIll(b2, b, b3, n6, n7, n8, n3);
                            b2 = false;
                            n4 = 0;
                            b = false;
                            n5 = 0;
                            n8 = 0;
                            n7 = 0;
                            n6 = -1;
                        }
                        b3 = true;
                    }
                    else if (char1 != '=' && char1 != '<' && char1 != '>') {
                        if (char1 == '+' && n5 != 0) {
                            n9 += llllIIIIlIIIlIlllIll(b2, b, b3, n6, n7, n8, n3);
                            b2 = false;
                            b3 = false;
                            n4 = 0;
                            b = false;
                            n5 = 0;
                            n8 = 0;
                            n7 = 0;
                            n6 = -1;
                        }
                    }
                    else {
                        if (n5 != 0) {
                            n9 += llllIIIIlIIIlIlllIll(b2, b, b3, n6, n7, n8, n3);
                            b2 = false;
                            b3 = false;
                            n4 = 0;
                            b = false;
                            n5 = 0;
                            n8 = 0;
                            n7 = 0;
                            n6 = -1;
                        }
                        if (char1 == '=') {
                            n6 = 0;
                        }
                        else if (char1 == '<') {
                            n6 = 2;
                        }
                        else if (char1 == '>') {
                            n6 = 1;
                        }
                    }
                }
                if (n5 != 0) {
                    n9 += llllIIIIlIIIlIlllIll(b2, b, b3, n6, n7, n8, n3);
                }
                return n9;
            }
            final int llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(s, n, index2 - 1, n3);
            if (llllIIIIlIIIlIlllIll3 <= 0) {
                return 0;
            }
            final int llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll(s, index2 + 1, n2, n3);
            return (llllIIIIlIIIlIlllIll4 <= 0) ? 0 : ((llllIIIIlIIIlIlllIll3 > llllIIIIlIIIlIlllIll4) ? llllIIIIlIIIlIlllIll3 : llllIIIIlIIIlIlllIll4);
        }
    }
    
    public static List IlIlIlIlIlllllllllIl(final int n, final boolean b) {
        List<IlIIIlIlIIIllIlIlIIl> arrayList = null;
        llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll;
        for (int length = (llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll).length, i = 0; i < length; ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll[i];
            if (llllIIIIlIIIlIlllIll2 != null && (!llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() || b)) {
                final String s = net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIllllIlIlIIIIll.get(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
                if (s != null) {
                    final int llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(s, 0, s.length(), n);
                    if (llllIIIIlIIIlIlllIll3 > 0) {
                        int llllIIIIlIIIlIlllIll4 = 0;
                        final String s2 = net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.get(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl());
                        if (s2 != null) {
                            llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll(s2, 0, s2.length(), n);
                            if (llllIIIIlIIIlIlllIll4 < 0) {
                                llllIIIIlIIIlIlllIll4 = 0;
                            }
                        }
                        int n2;
                        if (llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI()) {
                            n2 = 1;
                        }
                        else {
                            n2 = (int)Math.round((1200 * (llllIIIIlIIIlIlllIll3 * 3 + (llllIIIIlIIIlIlllIll3 - 1) * 2) >> llllIIIIlIIIlIlllIll4) * llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII());
                            if ((n & 0x4000) != 0x0) {
                                n2 = (int)Math.round(n2 * 0.75 + 0.5);
                            }
                        }
                        if (arrayList == null) {
                            arrayList = (List<IlIIIlIlIIIllIlIlIIl>)Lists.newArrayList();
                        }
                        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(), n2, llllIIIIlIIIlIlllIll4);
                        if ((n & 0x4000) != 0x0) {
                            ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(true);
                        }
                        arrayList.add(ilIIIlIlIIIllIlIlIIl);
                    }
                }
            }
        }
        return arrayList;
    }
    
    private static int llllIIIIlIIIlIlllIll(int n, final int n2, final boolean b, final boolean b2, final boolean b3) {
        if (b3) {
            if (!llllIIIIlIIIlIlllIll(n, n2)) {
                return 0;
            }
        }
        else if (b) {
            n &= ~(1 << n2);
        }
        else if (b2) {
            if ((n & 1 << n2) == 0x0) {
                n |= 1 << n2;
            }
            else {
                n &= ~(1 << n2);
            }
        }
        else {
            n |= 1 << n2;
        }
        return n;
    }
    
    public static int llllIIIIlIIIlIlllIll(int n, final String s) {
        final int n2 = 0;
        final int length = s.length();
        int n3 = 0;
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        int n4 = 0;
        for (int i = n2; i < length; ++i) {
            final char char1 = s.charAt(i);
            if (char1 >= '0' && char1 <= '9') {
                n4 = n4 * 10 + (char1 - '0');
                n3 = 1;
            }
            else if (char1 == '!') {
                if (n3 != 0) {
                    n = llllIIIIlIIIlIlllIll(n, n4, b2, b, b3);
                    b3 = false;
                    b2 = false;
                    n3 = 0;
                    n4 = 0;
                }
                b = true;
            }
            else if (char1 == '-') {
                if (n3 != 0) {
                    n = llllIIIIlIIIlIlllIll(n, n4, b2, b, b3);
                    b3 = false;
                    b = false;
                    n3 = 0;
                    n4 = 0;
                }
                b2 = true;
            }
            else if (char1 == '+') {
                if (n3 != 0) {
                    n = llllIIIIlIIIlIlllIll(n, n4, b2, b, b3);
                    b3 = false;
                    b = false;
                    b2 = false;
                    n3 = 0;
                    n4 = 0;
                }
            }
            else if (char1 == '&') {
                if (n3 != 0) {
                    n = llllIIIIlIIIlIlllIll(n, n4, b2, b, b3);
                    b = false;
                    b2 = false;
                    n3 = 0;
                    n4 = 0;
                }
                b3 = true;
            }
        }
        if (n3 != 0) {
            n = llllIIIIlIIIlIlllIll(n, n4, b2, b, b3);
        }
        return n & 0x7FFF;
    }
    
    public static int llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return (llllIIIIlIIIlIlllIll(n, n2) ? 16 : 0) | (llllIIIIlIIIlIlllIll(n, n3) ? 8 : 0) | (llllIIIIlIIIlIlllIll(n, n4) ? 4 : 0) | (llllIIIIlIIIlIlllIll(n, n5) ? 2 : 0) | (llllIIIIlIIIlIlllIll(n, n6) ? 1 : 0);
    }
}
