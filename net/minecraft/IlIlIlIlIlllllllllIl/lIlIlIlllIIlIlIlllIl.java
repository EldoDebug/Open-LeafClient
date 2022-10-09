package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.regex.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import com.google.common.base.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class lIlIlIlllIIlIlIlllIl
{
    private static final Pattern llllIIIIlIIIlIlllIll;
    private static final Pattern IlIlIlIlIlllllllllIl;
    private static final Pattern llIllIIIIIllIlIIIIlI;
    private static final Set IlIIIlIlIIIllIlIlIIl;
    
    static {
        llllIIIIlIIIlIlllIll = Pattern.compile("^@([pare])(?:\\[([\\w=,!-]*)\\])?$");
        IlIlIlIlIlllllllllIl = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
        llIllIIIIIllIlIIIIlI = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");
        IlIIIlIlIIIllIlIlIIl = Sets.newHashSet((Object[])new String[] { "x", "y", "z", "dx", "dy", "dz", "rm", "r" });
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        return (IlIIIlIlIIIllIlIlIIl)llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, s, IlIIIlIlIIIllIlIlIIl.class);
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s, final Class clazz) {
        final List ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, s, clazz);
        return (ilIlIlIlIlllllllllIl.size() == 1) ? ilIlIlIlIlllllllllIl.get(0) : null;
    }
    
    public static llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s) {
        final List ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, s, llIllIIIIIllIlIIIIlI.class);
        if (ilIlIlIlIlllllllllIl.isEmpty()) {
            return null;
        }
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<llIllIIIIIllIlIIIIlI> iterator = ilIlIlIlIlllllllllIl.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next().v_());
        }
        return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(arrayList);
    }
    
    public static List IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String s, final Class clazz) {
        final Matcher matcher = lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll.matcher(s);
        if (!matcher.matches() || !illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(1, "@")) {
            return Collections.emptyList();
        }
        final Map llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(matcher.group(2));
        if (!IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, llIllIIIIIllIlIIIIlI)) {
            return Collections.emptyList();
        }
        final String group = matcher.group(1);
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, illIlIIllIllIIlIllII.IlIlIIIlIIlIlIIlllIl());
        final List llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, llIllIIIIIllIlIIIIlI);
        final ArrayList arrayList = Lists.newArrayList();
        for (final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII : llllIIIIlIIIlIlllIll) {
            if (illlllllIIIlIIIlIlII != null) {
                final ArrayList arrayList2 = Lists.newArrayList();
                arrayList2.addAll(llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, group));
                arrayList2.addAll(IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI));
                arrayList2.addAll(llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI));
                arrayList2.addAll(IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI));
                arrayList2.addAll(IlIlIIIllIllIIIIIllI(llIllIIIIIllIlIIIIlI));
                arrayList2.addAll(IllIIlllIIIIlllIIlIl(llIllIIIIIllIlIIIIlI));
                arrayList2.addAll(llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl));
                arrayList2.addAll(llllIIIlIlllIlIIIIIl(llIllIIIIIllIlIIIIlI));
                arrayList.addAll(llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, clazz, arrayList2, group, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl));
            }
        }
        return llllIIIIlIIIlIlllIll(arrayList, llIllIIIIIllIlIIIIlI, illIlIIllIllIIlIllII, clazz, group, ilIlIlIlIlllllllllIl);
    }
    
    private static List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final Map map) {
        final ArrayList arrayList = Lists.newArrayList();
        if (lIIIIlIIIIIlllIllIII(map)) {
            arrayList.add(illIlIIllIllIIlIllII.k_());
        }
        else {
            Collections.addAll(arrayList, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl);
        }
        return arrayList;
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final Map map) {
        final String ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(map, "type");
        final String s = (ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.startsWith("!")) ? ilIlIlIlIlllllllllIl.substring(1) : ilIlIlIlIlllllllllIl;
        if (s != null && !IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(s)) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("commands.generic.entity.invalidType", new Object[] { s });
            illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
            return false;
        }
        return true;
    }
    
    private static List llllIIIIlIIIlIlllIll(final Map map, final String s) {
        final ArrayList arrayList = Lists.newArrayList();
        String s2 = IlIlIlIlIlllllllllIl(map, "type");
        final boolean b = s2 != null && s2.startsWith("!");
        if (b) {
            s2 = s2.substring(1);
        }
        final boolean b2 = !s.equals("e");
        final boolean b3 = s.equals("r") && s2 != null;
        if ((s2 == null || !s.equals("e")) && !b3) {
            if (b2) {
                arrayList.add(new net.minecraft.IlIlIlIlIlllllllllIl.llIIIIIIlIllIIlIIIll());
            }
        }
        else {
            arrayList.add(new lllllIIIIIlIlIIIIIIl(s2, b));
        }
        return arrayList;
    }
    
    private static List IlIlIlIlIlllllllllIl(final Map map) {
        final ArrayList arrayList = Lists.newArrayList();
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(map, "lm", -1);
        final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(map, "l", -1);
        if (llllIIIIlIIIlIlllIll > -1 || llllIIIIlIIIlIlllIll2 > -1) {
            arrayList.add(new IllIIlllllIIllIIllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2));
        }
        return arrayList;
    }
    
    private static List llIllIIIIIllIlIIIIlI(final Map map) {
        final ArrayList arrayList = Lists.newArrayList();
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(map, "m", lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        if (llllIIIIlIIIlIlllIll != lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) {
            arrayList.add(new lIllIIIIIlllIIlIIllI(llllIIIIlIIIlIlllIll));
        }
        return arrayList;
    }
    
    private static List IlIIIlIlIIIllIlIlIIl(final Map map) {
        final ArrayList arrayList = Lists.newArrayList();
        String s = IlIlIlIlIlllllllllIl(map, "team");
        final boolean b = s != null && s.startsWith("!");
        if (b) {
            s = s.substring(1);
        }
        if (s != null) {
            arrayList.add(new lIlIIlllIIlIIlIlllIl(s, b));
        }
        return arrayList;
    }
    
    private static List IlIlIIIllIllIIIIIllI(final Map map) {
        final ArrayList arrayList = Lists.newArrayList();
        final Map llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(map);
        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.size() > 0) {
            arrayList.add(new llIIIllIlIllIllIIIIl(llllIIIIlIIIlIlllIll));
        }
        return arrayList;
    }
    
    private static List IllIIlllIIIIlllIIlIl(final Map map) {
        final ArrayList arrayList = Lists.newArrayList();
        String s = IlIlIlIlIlllllllllIl(map, "name");
        final boolean b = s != null && s.startsWith("!");
        if (b) {
            s = s.substring(1);
        }
        if (s != null) {
            arrayList.add(new IIIllIIIlIlIIllIIIlI(s, b));
        }
        return arrayList;
    }
    
    private static List llllIIIIlIIIlIlllIll(final Map map, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final ArrayList arrayList = Lists.newArrayList();
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(map, "rm", -1);
        final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(map, "r", -1);
        if (ilIlIlIlIlllllllllIl != null && (llllIIIIlIIIlIlllIll >= 0 || llllIIIIlIIIlIlllIll2 >= 0)) {
            arrayList.add(new IIlllIIlllIIIlIlllII(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll * llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll2 * llllIIIIlIIIlIlllIll2));
        }
        return arrayList;
    }
    
    private static List llllIIIlIlllIlIIIIIl(final Map map) {
        final ArrayList arrayList = Lists.newArrayList();
        if (map.containsKey("rym") || map.containsKey("ry")) {
            arrayList.add(new IlIIlllllIIllIIlllll(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(map, "rym", 0)), llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(map, "ry", 359))));
        }
        if (map.containsKey("rxm") || map.containsKey("rx")) {
            arrayList.add(new lIIIIlIlIllllIIlIllI(llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(map, "rxm", 0)), llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(map, "rx", 359))));
        }
        return arrayList;
    }
    
    private static List llllIIIIlIIIlIlllIll(final Map map, final Class clazz, final List list, final String s, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final ArrayList arrayList = Lists.newArrayList();
        final String ilIlIlIlIlllllllllIl2 = IlIlIlIlIlllllllllIl(map, "type");
        final String s2 = (ilIlIlIlIlllllllllIl2 != null && ilIlIlIlIlllllllllIl2.startsWith("!")) ? ilIlIlIlIlllllllllIl2.substring(1) : ilIlIlIlIlllllllllIl2;
        final boolean b = !s.equals("e");
        final boolean b2 = s.equals("r") && s2 != null;
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(map, "dx", 0);
        final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(map, "dy", 0);
        final int llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll(map, "dz", 0);
        final int llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll(map, "r", -1);
        final Predicate and = Predicates.and((Iterable)list);
        final Predicate and2 = Predicates.and(llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll, and);
        if (ilIlIlIlIlllllllllIl != null) {
            final boolean b3 = illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl.size() < illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.size() / 16;
            if (!map.containsKey("dx") && !map.containsKey("dy") && !map.containsKey("dz")) {
                if (llllIIIIlIIIlIlllIll4 >= 0) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll5 = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - llllIIIIlIIIlIlllIll4, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - llllIIIIlIIIlIlllIll4, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - llllIIIIlIIIlIlllIll4, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + llllIIIIlIIIlIlllIll4 + 1, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + llllIIIIlIIIlIlllIll4 + 1, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + llllIIIIlIIIlIlllIll4 + 1);
                    if (b && b3 && !b2) {
                        arrayList.addAll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(clazz, and2));
                    }
                    else {
                        arrayList.addAll(illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(clazz, llllIIIIlIIIlIlllIll5, and2));
                    }
                }
                else if (s.equals("a")) {
                    arrayList.addAll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(clazz, and));
                }
                else if (!s.equals("p") && (!s.equals("r") || b2)) {
                    arrayList.addAll(illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(clazz, and2));
                }
                else {
                    arrayList.addAll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(clazz, and2));
                }
            }
            else {
                final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3);
                if (b && b3 && !b2) {
                    arrayList.addAll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(clazz, Predicates.and(and2, (Predicate)new llIIIlIlllIllIIlIllI(llllIIIIlIIIlIlllIll6))));
                }
                else {
                    arrayList.addAll(illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(clazz, llllIIIIlIIIlIlllIll6, and2));
                }
            }
        }
        else if (s.equals("a")) {
            arrayList.addAll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(clazz, and));
        }
        else if (!s.equals("p") && (!s.equals("r") || b2)) {
            arrayList.addAll(illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(clazz, and2));
        }
        else {
            arrayList.addAll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(clazz, and2));
        }
        return arrayList;
    }
    
    private static List llllIIIIlIIIlIlllIll(List list, final Map map, final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final Class clazz, final String s, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(map, "c", (!s.equals("a") && !s.equals("e")) ? 1 : 0);
        if (!s.equals("p") && !s.equals("a") && !s.equals("e")) {
            if (s.equals("r")) {
                Collections.shuffle(list);
            }
        }
        else if (ilIlIlIlIlllllllllIl != null) {
            Collections.sort(list, new IlIIllIIllIIllIIlIIl(ilIlIlIlIlllllllllIl));
        }
        final llIllIIIIIllIlIIIIlI l_ = illIlIIllIllIIlIllII.l_();
        if (l_ != null && clazz.isAssignableFrom(l_.getClass()) && llllIIIIlIIIlIlllIll == 1 && list.contains(l_) && !"r".equals(s)) {
            list = (List<Object>)Lists.newArrayList((Object[])new llIllIIIIIllIlIIIIlI[] { l_ });
        }
        if (llllIIIIlIIIlIlllIll != 0) {
            if (llllIIIIlIIIlIlllIll < 0) {
                Collections.reverse(list);
            }
            list = list.subList(0, Math.min(Math.abs(llllIIIIlIIIlIlllIll), list.size()));
        }
        return list;
    }
    
    private static net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final int n2, final int n3) {
        final boolean b = n < 0;
        final boolean b2 = n2 < 0;
        final boolean b3 = n3 < 0;
        return new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (b ? n : 0), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + (b2 ? n2 : 0), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (b3 ? n3 : 0), ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (b ? 0 : n) + 1, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + (b2 ? 0 : n2) + 1, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (b3 ? 0 : n3) + 1);
    }
    
    public static int llllIIIIlIIIlIlllIll(int n) {
        n %= 360;
        if (n >= 160) {
            n -= 360;
        }
        if (n < 0) {
            n += 360;
        }
        return n;
    }
    
    private static IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final Map map, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(map, "x", ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII()), llllIIIIlIIIlIlllIll(map, "y", ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()), llllIIIIlIIIlIlllIll(map, "z", ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()));
    }
    
    private static boolean lIIIIlIIIIIlllIllIII(final Map map) {
        final Iterator<String> iterator = lIlIlIlllIIlIlIlllIl.IlIIIlIlIIIllIlIlIIl.iterator();
        while (iterator.hasNext()) {
            if (map.containsKey(iterator.next())) {
                return true;
            }
        }
        return false;
    }
    
    private static int llllIIIIlIIIlIlllIll(final Map map, final String s, final int n) {
        return map.containsKey(s) ? llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(map.get(s), n) : n;
    }
    
    private static String IlIlIlIlIlllllllllIl(final Map map, final String s) {
        return map.get(s);
    }
    
    public static Map llllIIIIlIIIlIlllIll(final Map map) {
        final HashMap hashMap = Maps.newHashMap();
        for (final String s : map.keySet()) {
            if (s.startsWith("score_") && s.length() > "score_".length()) {
                hashMap.put(s.substring("score_".length()), llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((String)map.get(s), 1));
            }
        }
        return hashMap;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final String s) {
        final Matcher matcher = lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll.matcher(s);
        if (!matcher.matches()) {
            return false;
        }
        final Map llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(matcher.group(2));
        final String group = matcher.group(1);
        return llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, "c", (!"a".equals(group) && !"e".equals(group)) ? 1 : 0) != 1;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final String s) {
        return lIlIlIlllIIlIlIlllIl.llllIIIIlIIIlIlllIll.matcher(s).matches();
    }
    
    private static Map llIllIIIIIllIlIIIIlI(final String s) {
        final HashMap hashMap = Maps.newHashMap();
        if (s == null) {
            return hashMap;
        }
        int n = 0;
        int end = -1;
        final Matcher matcher = lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl.matcher(s);
        while (matcher.find()) {
            String s2 = null;
            switch (n++) {
                case 0: {
                    s2 = "x";
                    break;
                }
                case 1: {
                    s2 = "y";
                    break;
                }
                case 2: {
                    s2 = "z";
                    break;
                }
                case 3: {
                    s2 = "r";
                    break;
                }
            }
            if (s2 != null && matcher.group(1).length() > 0) {
                hashMap.put(s2, matcher.group(1));
            }
            end = matcher.end();
        }
        if (end < s.length()) {
            final Matcher matcher2 = lIlIlIlllIIlIlIlllIl.llIllIIIIIllIlIIIIlI.matcher((end == -1) ? s : s.substring(end));
            while (matcher2.find()) {
                hashMap.put(matcher2.group(1), matcher2.group(2));
            }
        }
        return hashMap;
    }
}
