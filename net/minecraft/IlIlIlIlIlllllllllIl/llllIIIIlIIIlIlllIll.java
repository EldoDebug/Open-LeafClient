package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.primitives.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.base.*;
import com.google.common.collect.*;
import java.util.*;

public abstract class llllIIIIlIIIlIlllIll implements llIlIIIIIlIIlIlIIlll
{
    private static IllIllIlllIllllIIllI llllIIIIlIIIlIlllIll;
    
    public int llllIIIIlIIIlIlllIll() {
        return 4;
    }
    
    @Override
    public List IlIlIlIlIlllllllllIl() {
        return Collections.emptyList();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(), this.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return null;
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s) {
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException ex) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.invalid", new Object[] { s });
        }
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s, final int n) {
        return llllIIIIlIIIlIlllIll(s, n, Integer.MAX_VALUE);
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s);
        if (llllIIIIlIIIlIlllIll < n) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.tooSmall", new Object[] { llllIIIIlIIIlIlllIll, n });
        }
        if (llllIIIIlIIIlIlllIll > n2) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.tooBig", new Object[] { llllIIIIlIIIlIlllIll, n2 });
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public static long IlIlIlIlIlllllllllIl(final String s) {
        try {
            return Long.parseLong(s);
        }
        catch (NumberFormatException ex) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.invalid", new Object[] { s });
        }
    }
    
    public static long llllIIIIlIIIlIlllIll(final String s, final long n, final long n2) {
        final long ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(s);
        if (ilIlIlIlIlllllllllIl < n) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.tooSmall", new Object[] { ilIlIlIlIlllllllllIl, n });
        }
        if (ilIlIlIlIlllllllllIl > n2) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.tooBig", new Object[] { ilIlIlIlIlllllllllIl, n2 });
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    public static IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final int n, final boolean b) {
        final IlIlIlIlIlllllllllIl ilIlIIIlIIlIlIIlllIl = illIlIIllIllIIlIllII.IlIlIIIlIIlIlIIlllIl();
        return new IlIlIlIlIlllllllllIl(IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl.lIIIIlIIIIIlllIllIII(), array[n], -30000000, 30000000, b), IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl.lIIIlllIIIllIIIllIII(), array[n + 1], 0, 256, false), IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl(), array[n + 2], -30000000, 30000000, b));
    }
    
    public static double llIllIIIIIllIlIIIIlI(final String s) {
        try {
            final double double1 = Double.parseDouble(s);
            if (!Doubles.isFinite(double1)) {
                throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.invalid", new Object[] { s });
            }
            return double1;
        }
        catch (NumberFormatException ex) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.invalid", new Object[] { s });
        }
    }
    
    public static double llllIIIIlIIIlIlllIll(final String s, final double n) {
        return llllIIIIlIIIlIlllIll(s, n, Double.MAX_VALUE);
    }
    
    public static double llllIIIIlIIIlIlllIll(final String s, final double n, final double n2) {
        final double llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(s);
        if (llIllIIIIIllIlIIIIlI < n) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.double.tooSmall", new Object[] { llIllIIIIIllIlIIIIlI, n });
        }
        if (llIllIIIIIllIlIIIIlI > n2) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.double.tooBig", new Object[] { llIllIIIIIllIlIIIIlI, n2 });
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    public static boolean IlIIIlIlIIIllIlIlIIl(final String s) {
        if (s.equals("true") || s.equals("1")) {
            return true;
        }
        if (!s.equals("false") && !s.equals("0")) {
            throw new IIIIlllIIIIIIlIIIlll("commands.generic.boolean.invalid", new Object[] { s });
        }
        return false;
    }
    
    public static IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        if (illIlIIllIllIIlIllII instanceof IlIIIlIlIIIllIlIlIIl) {
            return (IlIIIlIlIIIllIlIlIIl)illIlIIllIllIIlIllII;
        }
        throw new IIlIIIlllIllIllIlIII("You must specify which player you wish to perform this action on.", new Object[0]);
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, s);
        if (ilIIIlIlIIIllIlIlIIl == null) {
            try {
                ilIIIlIlIIIllIlIlIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(UUID.fromString(s));
            }
            catch (IllegalArgumentException ex) {}
        }
        if (ilIIIlIlIIIllIlIlIIl == null) {
            ilIIIlIlIIIllIlIlIIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(s);
        }
        if (ilIIIlIlIIIllIlIlIIl == null) {
            throw new IIlIIIlllIllIllIlIII();
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public static llIllIIIIIllIlIIIIlI IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        return llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, s, llIllIIIIIllIlIIIIlI.class);
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s, final Class clazz) {
        llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, s, clazz);
        final net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll iiiiIllIIIIlIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl();
        if (llIllIIIIIllIlIIIIlI == null) {
            llIllIIIIIllIlIIIIlI = iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(s);
        }
        if (llIllIIIIIllIlIIIIlI == null) {
            try {
                final UUID fromString = UUID.fromString(s);
                llIllIIIIIllIlIIIIlI = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(fromString);
                if (llIllIIIIIllIlIIIIlI == null) {
                    llIllIIIIIllIlIIIIlI = iiiiIllIIIIlIIIIllIl.IIlllIIlllIIIlIlllII().llllIIIIlIIIlIlllIll(fromString);
                }
            }
            catch (IllegalArgumentException ex) {
                throw new IlIllllIIlIIlIlIlIll("commands.generic.entity.invalidUuid", new Object[0]);
            }
        }
        if (llIllIIIIIllIlIIIIlI != null && clazz.isAssignableFrom(llIllIIIIIllIlIIIIlI.getClass())) {
            return llIllIIIIIllIlIIIIlI;
        }
        throw new IlIllllIIlIIlIlIlIll();
    }
    
    public static List llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        return lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(s) ? lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, s, llIllIIIIIllIlIIIIlI.class) : Lists.newArrayList((Object[])new llIllIIIIIllIlIIIIlI[] { IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, s) });
    }
    
    public static String IlIIIlIlIIIllIlIlIIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        try {
            return llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, s).s_();
        }
        catch (IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII) {
            if (lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(s)) {
                throw ilIIIlllIllIllIlIII;
            }
            return s;
        }
    }
    
    public static String IlIlIIIllIllIIIIIllI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        try {
            return llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, s).s_();
        }
        catch (IIlIIIlllIllIllIlIII ilIIIlllIllIllIlIII) {
            try {
                return IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, s).lllIIIIlIlIllIIlIIIl().toString();
            }
            catch (IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll) {
                if (lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(s)) {
                    throw ilIllllIIlIIlIlIlIll;
                }
                return s;
            }
        }
    }
    
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final int n) {
        return IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array, n, false);
    }
    
    public static llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final int n, final boolean b) {
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl("");
        for (int i = n; i < array.length; ++i) {
            if (i > n) {
                ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(" ");
            }
            llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll = new IlIlIIIIIIlllIlIllIl(array[i]);
            if (b) {
                final llIIIIIIlIllIIlIIIll ilIlIlIlIlllllllllIl = lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, array[i]);
                if (ilIlIlIlIlllllllllIl == null) {
                    if (lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(array[i])) {
                        throw new IIlIIIlllIllIllIlIII();
                    }
                }
                else {
                    llIIIIIIlIllIIlIIIll = ilIlIlIlIlllllllllIl;
                }
            }
            ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
        }
        return ilIlIIIIIIlllIlIllIl;
    }
    
    public static String llllIIIIlIIIlIlllIll(final String[] array, final int n) {
        final StringBuilder sb = new StringBuilder();
        for (int i = n; i < array.length; ++i) {
            if (i > n) {
                sb.append(" ");
            }
            sb.append(array[i]);
        }
        return sb.toString();
    }
    
    public static net.minecraft.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final double n, final String s, final boolean b) {
        return llllIIIIlIIIlIlllIll(n, s, -30000000, 30000000, b);
    }
    
    public static net.minecraft.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final double n, String substring, final int n2, final int n3, final boolean b) {
        final boolean startsWith = substring.startsWith("~");
        if (startsWith && Double.isNaN(n)) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.invalid", new Object[] { n });
        }
        double n4 = 0.0;
        if (!startsWith || substring.length() > 1) {
            final boolean contains = substring.contains(".");
            if (startsWith) {
                substring = substring.substring(1);
            }
            n4 += llIllIIIIIllIlIIIIlI(substring);
            if (!contains && !startsWith && b) {
                n4 += 0.5;
            }
        }
        if (n2 != 0 || n3 != 0) {
            if (n4 < n2) {
                throw new lIIlIIIlIllIlIllIIIl("commands.generic.double.tooSmall", new Object[] { n4, n2 });
            }
            if (n4 > n3) {
                throw new lIIlIIIlIllIlIllIIIl("commands.generic.double.tooBig", new Object[] { n4, n3 });
            }
        }
        return new net.minecraft.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(n4 + (startsWith ? n : 0.0), n4, startsWith);
    }
    
    public static double IlIlIlIlIlllllllllIl(final double n, final String s, final boolean b) {
        return IlIlIlIlIlllllllllIl(n, s, -30000000, 30000000, b);
    }
    
    public static double IlIlIlIlIlllllllllIl(final double n, String substring, final int n2, final int n3, final boolean b) {
        final boolean startsWith = substring.startsWith("~");
        if (startsWith && Double.isNaN(n)) {
            throw new lIIlIIIlIllIlIllIIIl("commands.generic.num.invalid", new Object[] { n });
        }
        double n4 = startsWith ? n : 0.0;
        if (!startsWith || substring.length() > 1) {
            final boolean contains = substring.contains(".");
            if (startsWith) {
                substring = substring.substring(1);
            }
            n4 += llIllIIIIIllIlIIIIlI(substring);
            if (!contains && !startsWith && b) {
                n4 += 0.5;
            }
        }
        if (n2 != 0 || n3 != 0) {
            if (n4 < n2) {
                throw new lIIlIIIlIllIlIllIIIl("commands.generic.double.tooSmall", new Object[] { n4, n2 });
            }
            if (n4 > n3) {
                throw new lIIlIIIlIllIlIllIIIl("commands.generic.double.tooBig", new Object[] { n4, n3 });
            }
        }
        return n4;
    }
    
    public static net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IllIIlllIIIIlllIIlIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl)net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        if (ilIIIlIlIIIllIlIlIIl == null) {
            throw new lIIlIIIlIllIlIllIIIl("commands.give.item.notFound", new Object[] { lIllllIllIllIIllllll });
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public static net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        final lIllllIllIllIIllllll lIllllIllIllIIllllll = new lIllllIllIllIIllllll(s);
        if (!net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lIllllIllIllIIllllll)) {
            throw new lIIlIIIlIllIlIllIIIl("commands.give.block.notFound", new Object[] { lIllllIllIllIIllllll });
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lIllllIllIllIIllllll);
        if (llllIIIIlIIIlIlllIll == null) {
            throw new lIIlIIIlIllIlIllIIIl("commands.give.block.notFound", new Object[] { lIllllIllIllIIllllll });
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public static String llllIIIIlIIIlIlllIll(final Object[] array) {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; ++i) {
            final String string = array[i].toString();
            if (i > 0) {
                if (i == array.length - 1) {
                    sb.append(" and ");
                }
                else {
                    sb.append(", ");
                }
            }
            sb.append(string);
        }
        return sb.toString();
    }
    
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final List list) {
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new IlIlIIIIIIlllIlIllIl("");
        for (int i = 0; i < list.size(); ++i) {
            if (i > 0) {
                if (i == list.size() - 1) {
                    ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(" and ");
                }
                else if (i > 0) {
                    ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(", ");
                }
            }
            ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(list.get(i));
        }
        return ilIlIIIIIIlllIlIllIl;
    }
    
    public static String llllIIIIlIIIlIlllIll(final Collection collection) {
        return llllIIIIlIIIlIlllIll((Object[])collection.toArray(new String[collection.size()]));
    }
    
    public static List llllIIIIlIIIlIlllIll(final String[] array, final int n, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == null) {
            return null;
        }
        final int n2 = array.length - 1;
        String s;
        if (n2 == n) {
            s = Integer.toString(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        }
        else if (n2 == n + 1) {
            s = Integer.toString(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII());
        }
        else {
            if (n2 != n + 2) {
                return null;
            }
            s = Integer.toString(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        return Lists.newArrayList((Object[])new String[] { s });
    }
    
    public static List IlIlIlIlIlllllllllIl(final String[] array, final int n, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == null) {
            return null;
        }
        final int n2 = array.length - 1;
        String s;
        if (n2 == n) {
            s = Integer.toString(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII());
        }
        else {
            if (n2 != n + 1) {
                return null;
            }
            s = Integer.toString(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
        }
        return Lists.newArrayList((Object[])new String[] { s });
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final String s, final String s2) {
        return s2.regionMatches(true, 0, s, 0, s.length());
    }
    
    public static List llllIIIIlIIIlIlllIll(final String[] array, final String... array2) {
        return llllIIIIlIIIlIlllIll(array, Arrays.asList(array2));
    }
    
    public static List llllIIIIlIIIlIlllIll(final String[] array, final Collection collection) {
        final String s = array[array.length - 1];
        final ArrayList arrayList = Lists.newArrayList();
        if (!collection.isEmpty()) {
            for (final String s2 : Iterables.transform((Iterable)collection, Functions.toStringFunction())) {
                if (llllIIIIlIIIlIlllIll(s, s2)) {
                    arrayList.add(s2);
                }
            }
            if (arrayList.isEmpty()) {
                for (final lIllllIllIllIIllllll next : collection) {
                    if (next instanceof lIllllIllIllIIllllll && llllIIIIlIIIlIlllIll(s, next.IlIlIlIlIlllllllllIl())) {
                        arrayList.add(String.valueOf(next));
                    }
                }
            }
        }
        return arrayList;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return false;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll, final String s, final Object... array) {
        llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llIlIIIIIlIIlIlIIlll, 0, s, array);
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll, final int n, final String s, final Object... array) {
        if (net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll != null) {
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llIlIIIIIlIIlIlIIlll, n, s, array);
        }
    }
    
    public static void llllIIIIlIIIlIlllIll(final IllIllIlllIllllIIllI llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll) {
        return this.llIllIIIIIllIlIIIIlI().compareTo(llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI());
    }
}
