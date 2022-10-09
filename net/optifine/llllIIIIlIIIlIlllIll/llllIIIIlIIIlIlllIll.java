package net.optifine.llllIIIIlIIIlIlllIll;

import net.optifine.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.lang.reflect.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll
{
    private String llIllIIIIIllIlIIIIlI;
    public static final IlIllIlIlIIIlIlIlIII[] llllIIIIlIIIlIlllIll;
    public static final IlIlIlIlIlllllllllIl[] IlIlIlIlIlllllllllIl;
    private static final IllIIlllIIIIlllIIlIl IlIIIlIlIIIllIlIlIIl;
    private static final IllIIlllIIIIlllIIlIl IlIlIIIllIllIIIIIllI;
    
    static {
        llllIIIIlIIIlIlllIll = new IlIllIlIlIIIlIlIlIII[0];
        IlIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl[0];
        IlIIIlIlIIIllIlIlIIl = new net.optifine.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        IlIlIIIllIllIIIIIllI = new llIllIIIIIllIlIIIIlI();
    }
    
    public llllIIIIlIIIlIlllIll(final String llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = null;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public String llllIIIIlIIIlIlllIll(final String s) {
        String s2 = s;
        final int lastIndex = s.lastIndexOf(47);
        if (lastIndex >= 0) {
            s2 = s.substring(lastIndex + 1);
        }
        final int lastIndex2 = s2.lastIndexOf(46);
        if (lastIndex2 >= 0) {
            s2 = s2.substring(0, lastIndex2);
        }
        return s2;
    }
    
    public String IlIlIlIlIlllllllllIl(final String s) {
        final int lastIndex = s.lastIndexOf(47);
        return (lastIndex < 0) ? "" : s.substring(0, lastIndex);
    }
    
    public llIIlIIIlIIIllIlIIIl[] llIllIIIIIllIlIIIIlI(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList list = new ArrayList();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final llIIlIIIlIIIllIlIIIl[] ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll[i]);
            if (ilIIIlIlIIIllIlIlIIl != null) {
                list.addAll(Arrays.asList(ilIIIlIlIIIllIlIlIIl));
            }
        }
        return (llIIlIIIlIIIllIlIIIl[])list.toArray(new llIIlIIIlIIIllIlIIIl[list.size()]);
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final String s, final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final llIIlIIIlIIIllIlIIIl[] ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(s);
        if (ilIIIlIlIIIllIlIlIIl == null) {
            return llIIlIIIlIIIllIlIIIl;
        }
        if (ilIIIlIlIIIllIlIlIIl.length != 1) {
            return llIIlIIIlIIIllIlIIIl;
        }
        return net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl[0].llllIIIIlIIIlIlllIll()).lllIllIIIllllllIllll();
    }
    
    public llIIlIIIlIIIllIlIIIl[] IlIIIlIlIIIllIlIlIIl(String trim) {
        if (trim == null) {
            return null;
        }
        trim = trim.trim();
        if (trim.length() <= 0) {
            return null;
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, ":");
        String s;
        int n;
        if (llllIIIIlIIIlIlllIll.length > 1 && this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
            s = llllIIIIlIIIlIlllIll[0];
            n = 1;
        }
        else {
            s = "minecraft";
            n = 0;
        }
        final String s2 = llllIIIIlIIIlIlllIll[n];
        final String[] array = Arrays.copyOfRange(llllIIIIlIIIlIlllIll, n + 1, llllIIIIlIIIlIlllIll.length);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(s, s2);
        if (llllIIIIlIIIlIlllIll2 == null) {
            return null;
        }
        final llIIlIIIlIIIllIlIIIl[] array2 = new llIIlIIIlIIIllIlIIIl[llllIIIIlIIIlIlllIll2.length];
        for (int i = 0; i < llllIIIIlIIIlIlllIll2.length; ++i) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2[i];
            final int llllIIIIlIIIlIlllIll4 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
            int[] llllIIIIlIIIlIlllIll5 = null;
            if (array.length > 0) {
                llllIIIIlIIIlIlllIll5 = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, array);
                if (llllIIIIlIIIlIlllIll5 == null) {
                    return null;
                }
            }
            array2[i] = new llIIlIIIlIIIllIlIIIl(llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll5);
        }
        return array2;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String[] array) {
        if (array.length < 2) {
            return false;
        }
        final String s = array[1];
        return s.length() >= 1 && !this.IlIlIIIllIllIIIIIllI(s) && !s.contains("=");
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final String s) {
        return s != null && s.length() >= 1 && Character.isDigit(s.charAt(0));
    }
    
    public net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] llllIIIIlIIIlIlllIll(final String s, final String s2) {
        if (this.IlIlIIIllIllIIIIIllI(s2)) {
            final int[] liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII(s2);
            if (liiiIlIIIIIlllIllIII == null) {
                return null;
            }
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] array = new net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[liiiIlIIIIIlllIllIII.length];
            for (int i = 0; i < liiiIlIIIIIlllIllIII.length; ++i) {
                final int n = liiiIlIIIIIlllIllIII[i];
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
                if (llllIIIIlIIIlIlllIll == null) {
                    this.llIllIlIIIIllIlIIllI("Block not found for id: " + n);
                    return null;
                }
                array[i] = llllIIIIlIIIlIlllIll;
            }
            return array;
        }
        else {
            final String string = String.valueOf(s) + ":" + s2;
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(string);
            if (llllIIIIlIIIlIlllIll2 == null) {
                this.llIllIlIIIIllIlIIllI("Block not found for name: " + string);
                return null;
            }
            return new net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[] { llllIIIIlIIIlIlllIll2 };
        }
    }
    
    public int[] llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String[] array) {
        if (array.length <= 0) {
            return null;
        }
        final String s = array[0];
        if (this.IlIlIIIllIllIIIIIllI(s)) {
            return this.lIIIIlIIIIIlllIllIII(s);
        }
        final Collection llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll();
        final HashMap<net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, List<?>> hashMap = (HashMap<net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, List<?>>)new HashMap<Object, List<?>>();
        for (int i = 0; i < array.length; ++i) {
            final String s2 = array[i];
            if (s2.length() > 0) {
                final String[] llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, "=");
                if (llllIIIIlIIIlIlllIll3.length != 2) {
                    this.llIllIlIIIIllIlIIllI("Invalid block property: " + s2);
                    return null;
                }
                final String s3 = llllIIIIlIIIlIlllIll3[0];
                final String s4 = llllIIIIlIIIlIlllIll3[1];
                final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(s3, llllIIIIlIIIlIlllIll2);
                if (llllIIIIlIIIlIlllIll4 == null) {
                    this.llIllIlIIIIllIlIIllI("Property not found: " + s3 + ", block: " + llllIIIIlIIIlIlllIll);
                    return null;
                }
                List<?> list = hashMap.get(s3);
                if (list == null) {
                    list = new ArrayList<Object>();
                    hashMap.put(llllIIIIlIIIlIlllIll4, list);
                }
                final String[] llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s4, ",");
                for (int j = 0; j < llllIIIIlIIIlIlllIll5.length; ++j) {
                    final String s5 = llllIIIIlIIIlIlllIll5[j];
                    final Comparable llllIIIIlIIIlIlllIll6 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, s5);
                    if (llllIIIIlIIIlIlllIll6 == null) {
                        this.llIllIlIIIIllIlIIllI("Property value not found: " + s5 + ", property: " + s3 + ", block: " + llllIIIIlIIIlIlllIll);
                        return null;
                    }
                    list.add(llllIIIIlIIIlIlllIll6);
                }
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        final ArrayList<Integer> list2 = new ArrayList<Integer>();
        for (int k = 0; k < 16; ++k) {
            final int n = k;
            try {
                if (this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n), hashMap)) {
                    list2.add(n);
                }
            }
            catch (IllegalArgumentException ex) {}
        }
        if (list2.size() == 16) {
            return null;
        }
        final int[] array2 = new int[list2.size()];
        for (int l = 0; l < array2.length; ++l) {
            array2[l] = (int)list2.get(l);
        }
        return array2;
    }
    
    private net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        try {
            net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n);
            if (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aJ && n > 7) {
                llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n & 0x7).llllIIIIlIIIlIlllIll(lIIlIIIlIllIlIllIIIl.IIIIIIIIIlllIllIlIlI));
            }
            return llIIlIIIlIIIllIlIIIl;
        }
        catch (IllegalArgumentException ex) {
            return llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
        }
    }
    
    public static Comparable llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final String s) {
        Comparable comparable = llllIIIIlIIIlIlllIll(s, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI());
        if (comparable == null) {
            comparable = llllIIIIlIIIlIlllIll(s, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
        }
        return comparable;
    }
    
    public static Comparable llllIIIIlIIIlIlllIll(final String s, final Collection collection) {
        for (final Comparable comparable : collection) {
            if (llllIIIIlIIIlIlllIll(comparable).equals(s)) {
                return comparable;
            }
        }
        return null;
    }
    
    private static Object llllIIIIlIIIlIlllIll(final Comparable comparable) {
        if (comparable instanceof lIllIIIIIlllIIlIIllI) {
            return ((lIllIIIIIlllIIlIIllI)comparable).llllIIIIlIIIlIlllIll();
        }
        return comparable.toString();
    }
    
    public static Comparable llllIIIIlIIIlIlllIll(final String s, final Class clazz) {
        if (clazz == String.class) {
            return s;
        }
        if (clazz == Boolean.class) {
            return Boolean.valueOf(s);
        }
        if (clazz == Float.class) {
            return Float.valueOf(s);
        }
        if (clazz == Double.class) {
            return Double.valueOf(s);
        }
        if (clazz == Integer.class) {
            return Integer.valueOf(s);
        }
        return (clazz == Long.class) ? Long.valueOf(s) : null;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Map map) {
        for (final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : map.keySet()) {
            final List list = (List)map.get(llllIIIIlIIIlIlllIll);
            final Comparable llllIIIIlIIIlIlllIll2 = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll2 == null) {
                return false;
            }
            if (!list.contains(llllIIIIlIIIlIlllIll2)) {
                return false;
            }
        }
        return true;
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] IllIIlllIIIIlllIIlIl(String s) {
        if (s == null) {
            return null;
        }
        s = s.trim();
        boolean b = false;
        if (s.startsWith("!")) {
            b = true;
            s = s.substring(1);
        }
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        List<E> list = new ArrayList();
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl(s2);
            if (llllIIIlIlllIlIIIIIl == null) {
                this.llIllIlIIIIllIlIIllI("Biome not found: " + s2);
            }
            else {
                list.add((E)llllIIIlIlllIlIIIIIl);
            }
        }
        if (b) {
            final ArrayList list2 = new ArrayList(Arrays.asList(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll()));
            list2.removeAll(list);
            list = list2;
        }
        return list.toArray(new net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[list.size()]);
    }
    
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.equals("nether")) {
            return net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIlllIlllllIlII;
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl[] iiiIlllIIIIIIlIIIlll = net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIIIlllIIIIIIlIIIlll();
        for (int i = 0; i < iiiIlllIIIIIIlIIIlll.length; ++i) {
            final net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = iiiIlllIIIIIIlIIIlll[i];
            if (llIIlIIIlIIIllIlIIIl != null && llIIlIIIlIIIllIlIIIl.lIlIIlllIIlIIlIlllIl.replace(" ", "").toLowerCase().equals(lowerCase)) {
                return llIIlIIIlIIIllIlIIIl;
            }
        }
        return null;
    }
    
    public int llllIIIIlIIIlIlllIll(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, -1);
        if (llllIIIIlIIIlIlllIll < 0) {
            this.llIllIlIIIIllIlIIllI("Invalid number: " + trim);
            return n;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public int[] lIIIIlIIIIIlllIllIII(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList<Integer> list = new ArrayList<Integer>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ,");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            if (s2.contains("-")) {
                final String[] llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, "-");
                if (llllIIIIlIIIlIlllIll2.length != 2) {
                    this.llIllIlIIIIllIlIIllI("Invalid interval: " + s2 + ", when parsing: " + s);
                }
                else {
                    final int llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2[0], -1);
                    final int llllIIIIlIIIlIlllIll4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2[1], -1);
                    if (llllIIIIlIIIlIlllIll3 >= 0 && llllIIIIlIIIlIlllIll4 >= 0 && llllIIIIlIIIlIlllIll3 <= llllIIIIlIIIlIlllIll4) {
                        for (int j = llllIIIIlIIIlIlllIll3; j <= llllIIIIlIIIlIlllIll4; ++j) {
                            list.add(j);
                        }
                    }
                    else {
                        this.llIllIlIIIIllIlIIllI("Invalid interval: " + s2 + ", when parsing: " + s);
                    }
                }
            }
            else {
                final int llllIIIIlIIIlIlllIll5 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, -1);
                if (llllIIIIlIIIlIlllIll5 < 0) {
                    this.llIllIlIIIIllIlIIllI("Invalid number: " + s2 + ", when parsing: " + s);
                }
                else {
                    list.add(llllIIIIlIIIlIlllIll5);
                }
            }
        }
        final int[] array = new int[list.size()];
        for (int k = 0; k < array.length; ++k) {
            array[k] = (int)list.get(k);
        }
        return array;
    }
    
    public boolean[] llllIIIIlIIIlIlllIll(final String s, final boolean[] array) {
        if (s == null) {
            return array;
        }
        final EnumSet<lllIllIIIllllllIllll> all = EnumSet.allOf(lllIllIIIllllllIllll.class);
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ,");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            if (s2.equals("sides")) {
                all.add(lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI);
                all.add(lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl);
                all.add(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI);
                all.add(lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl);
            }
            else if (s2.equals("all")) {
                all.addAll((Collection<?>)Arrays.asList(lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl));
            }
            else {
                final lllIllIIIllllllIllll liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(s2);
                if (liiIlllIIIllIIIllIII != null) {
                    all.add(liiIlllIIIllIIIllIII);
                }
            }
        }
        final boolean[] array2 = new boolean[lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length];
        for (int j = 0; j < array2.length; ++j) {
            array2[j] = all.contains(lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl[j]);
        }
        return array2;
    }
    
    public lllIllIIIllllllIllll lIIIlllIIIllIIIllIII(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        if (lowerCase.equals("bottom") || lowerCase.equals("down")) {
            return lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll;
        }
        if (lowerCase.equals("top") || lowerCase.equals("up")) {
            return lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl;
        }
        if (lowerCase.equals("north")) {
            return lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI;
        }
        if (lowerCase.equals("south")) {
            return lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl;
        }
        if (lowerCase.equals("east")) {
            return lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl;
        }
        if (lowerCase.equals("west")) {
            return lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI;
        }
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Unknown face: " + lowerCase);
        return null;
    }
    
    public void llIIlIIIlIIIllIlIIIl(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI + ": " + s);
    }
    
    public void llIllIlIIIIllIlIIllI(final String s) {
        net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this.llIllIIIIIllIlIIIIlI + ": " + s);
    }
    
    public llllIIllllIlIlIIIIll lIlIlIIIllIIllIIIllI(final String s) {
        if (s == null) {
            return null;
        }
        final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = new llllIIllllIlIlIIIIll();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ,");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iIlllIIlIllIllIlIIll = this.IIlllIIlIllIllIlIIll(llllIIIIlIIIlIlllIll[i]);
            if (iIlllIIlIllIllIlIIll == null) {
                return null;
            }
            llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll);
        }
        return llllIIllllIlIlIIIIll;
    }
    
    private IIIIlllIIIIIIlIIIlll IIlllIIlIllIllIlIIll(final String s) {
        if (s == null) {
            return null;
        }
        if (s.indexOf(45) >= 0) {
            final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, "-");
            if (llllIIIIlIIIlIlllIll.length != 2) {
                this.llIllIlIIIIllIlIIllI("Invalid range: " + s);
                return null;
            }
            final int llllIIIIlIIIlIlllIll2 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[0], -1);
            final int llllIIIIlIIIlIlllIll3 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[1], -1);
            if (llllIIIIlIIIlIlllIll2 >= 0 && llllIIIIlIIIlIlllIll3 >= 0) {
                return new IIIIlllIIIIIIlIIIlll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll3);
            }
            this.llIllIlIIIIllIlIIllI("Invalid range: " + s);
            return null;
        }
        else {
            final int llllIIIIlIIIlIlllIll4 = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, -1);
            if (llllIIIIlIIIlIlllIll4 < 0) {
                this.llIllIlIIIIllIlIIllI("Invalid integer: " + s);
                return null;
            }
            return new IIIIlllIIIIIIlIIIlll(llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll4);
        }
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        if (s == null) {
            return b;
        }
        final String trim = s.toLowerCase().trim();
        if (trim.equals("true")) {
            return true;
        }
        if (trim.equals("false")) {
            return false;
        }
        this.llIllIlIIIIllIlIIllI("Invalid boolean: " + s);
        return b;
    }
    
    public Boolean IlIlIIIllIIllIlllllI(final String s) {
        if (s == null) {
            return null;
        }
        final String trim = s.toLowerCase().trim();
        if (trim.equals("true")) {
            return Boolean.TRUE;
        }
        if (trim.equals("false")) {
            return Boolean.FALSE;
        }
        this.llIllIlIIIIllIlIIllI("Invalid boolean: " + s);
        return null;
    }
    
    public static int IlIlIlIlIlllllllllIl(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        try {
            return Integer.parseInt(trim, 16) & 0xFFFFFF;
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public static int llIllIIIIIllIlIIIIlI(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        try {
            return (int)(Long.parseLong(trim, 16) & -1L);
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public IlIIlIlIIIlIIlIlIlII llllIIIIlIIIlIlllIll(String trim, final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII) {
        if (trim == null) {
            return ilIIlIlIIIlIIlIlIlII;
        }
        trim = trim.toLowerCase().trim();
        final IlIIlIlIIIlIIlIlIlII[] values = IlIIlIlIIIlIIlIlIlII.values();
        for (int i = 0; i < values.length; ++i) {
            final IlIIlIlIIIlIIlIlIlII ilIIlIlIIIlIIlIlIlII2 = values[i];
            if (trim.equals(ilIIlIlIIIlIIlIlIlII2.name().toLowerCase())) {
                return ilIIlIlIIIlIIlIlIlII2;
            }
        }
        return ilIIlIlIIIlIIlIlIlII;
    }
    
    public Object llllIIIIlIIIlIlllIll(final String s, final Object[] array, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final String s2) {
        if (s == null) {
            return null;
        }
        final String trim = s.toLowerCase().trim();
        for (int i = 0; i < array.length; ++i) {
            final Object o = array[i];
            final String llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(o);
            if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.toLowerCase().equals(trim)) {
                return o;
            }
        }
        this.llIllIlIIIIllIlIIllI("Invalid " + s2 + ": " + s);
        return null;
    }
    
    public Object[] llllIIIIlIIIlIlllIll(String trim, final Object[] array, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final String s, final Object[] array2) {
        if (trim == null) {
            return null;
        }
        trim = trim.toLowerCase().trim();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, " ");
        final Object[] array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), llllIIIIlIIIlIlllIll.length);
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final Object llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll[i], array, illIIlllIIIIlllIIlIl, s);
            if (llllIIIIlIIIlIlllIll2 == null) {
                return array2;
            }
            array3[i] = llllIIIIlIIIlIlllIll2;
        }
        return array3;
    }
    
    public Enum llllIIIIlIIIlIlllIll(final String s, final Enum[] array, final String s2) {
        return (Enum)this.llllIIIIlIIIlIlllIll(s, array, net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, s2);
    }
    
    public Enum[] llllIIIIlIIIlIlllIll(final String s, final Enum[] array, final String s2, final Enum[] array2) {
        return (Enum[])this.llllIIIIlIIIlIlllIll(s, array, net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, s2, array2);
    }
    
    public IlIlIlIlIlllllllllIl[] llllIIIIlIIIlIlllIll(final String s, final String s2, final IlIlIlIlIlllllllllIl[] array) {
        return (IlIlIlIlIlllllllllIl[])this.llllIIIIlIIIlIlllIll(s, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.values(), net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI, s2, array);
    }
    
    public IIlllIIlIllIllIlIIll[] llllIIIIlIIIlIlllIll(final String s, final String s2, final IIlllIIlIllIllIlIIll[] array) {
        return (IIlllIIlIllIllIlIIll[])this.llllIIIIlIIIlIlllIll(s, IIlllIIlIllIllIlIIll.values(), net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl, s2, array);
    }
    
    public lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl(final String s, final String s2) {
        return (s != null && s2 != null) ? new lIlIlIIIllIIllIIIllI(s, s2) : null;
    }
    
    public IlIllIlIlIIIlIlIlIII[] IIIIlllIIIIIIlIIIlll(final String s) {
        if (s == null) {
            return null;
        }
        final ArrayList<IlIllIlIlIIIlIlIlIII> list = new ArrayList<IlIllIlIlIIIlIlIlIII>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s2 = llllIIIIlIIIlIlllIll[i];
            final IlIllIlIlIIIlIlIlIII lllIIIIlllllIlIIllIl = this.lllIIIIlllllIlIIllIl(s2);
            if (lllIIIIlllllIlIIllIl == null) {
                this.llIllIlIIIIllIlIIllI("Invalid profession: " + s2);
                return net.optifine.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
            }
            list.add(lllIIIIlllllIlIIllIl);
        }
        if (list.isEmpty()) {
            return null;
        }
        return list.toArray(new IlIllIlIlIIIlIlIlIII[list.size()]);
    }
    
    private IlIllIlIlIIIlIlIlIII lllIIIIlllllIlIIllIl(String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lowerCase, ":");
        if (llllIIIIlIIIlIlllIll.length > 2) {
            return null;
        }
        final String s = llllIIIIlIIIlIlllIll[0];
        String s2 = null;
        if (llllIIIIlIIIlIlllIll.length > 1) {
            s2 = llllIIIIlIIIlIlllIll[1];
        }
        final int ilIlIIIIIIlllIlIllIl = IlIlIIIIIIlllIlIllIl(s);
        if (ilIlIIIIIIlllIlIllIl < 0) {
            return null;
        }
        int[] llllIIIIlIIIlIlllIll2 = null;
        if (s2 != null) {
            llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, s2);
            if (llllIIIIlIIIlIlllIll2 == null) {
                return null;
            }
        }
        return new IlIllIlIlIIIlIlIlIII(ilIlIIIIIIlllIlIllIl, llllIIIIlIIIlIlllIll2);
    }
    
    private static int IlIlIIIIIIlllIlIllIl(final String s) {
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, -1);
        return (llllIIIIlIIIlIlllIll >= 0) ? llllIIIIlIIIlIlllIll : (s.equals("farmer") ? 0 : (s.equals("librarian") ? 1 : (s.equals("priest") ? 2 : (s.equals("blacksmith") ? 3 : (s.equals("butcher") ? 4 : (s.equals("nitwit") ? 5 : -1))))));
    }
    
    private static int[] llllIIIIlIIIlIlllIll(final int n, final String s) {
        final HashSet<Integer> set = new HashSet<Integer>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ",");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(n, llllIIIIlIIIlIlllIll[i]);
            if (ilIlIlIlIlllllllllIl < 0) {
                return null;
            }
            set.add(ilIlIlIlIlllllllllIl);
        }
        final Integer[] array = set.toArray(new Integer[set.size()]);
        final int[] array2 = new int[array.length];
        for (int j = 0; j < array2.length; ++j) {
            array2[j] = array[j];
        }
        return array2;
    }
    
    private static int IlIlIlIlIlllllllllIl(final int n, final String s) {
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, -1);
        if (llllIIIIlIIIlIlllIll >= 0) {
            return llllIIIIlIIIlIlllIll;
        }
        if (n == 0) {
            if (s.equals("farmer")) {
                return 1;
            }
            if (s.equals("fisherman")) {
                return 2;
            }
            if (s.equals("shepherd")) {
                return 3;
            }
            if (s.equals("fletcher")) {
                return 4;
            }
        }
        if (n == 1) {
            if (s.equals("librarian")) {
                return 1;
            }
            if (s.equals("cartographer")) {
                return 2;
            }
        }
        if (n == 2 && s.equals("cleric")) {
            return 1;
        }
        if (n == 3) {
            if (s.equals("armor")) {
                return 1;
            }
            if (s.equals("weapon")) {
                return 2;
            }
            if (s.equals("tool")) {
                return 3;
            }
        }
        if (n == 4) {
            if (s.equals("butcher")) {
                return 1;
            }
            if (s.equals("leather")) {
                return 2;
            }
        }
        return (n == 5 && s.equals("nitwit")) ? 1 : -1;
    }
    
    public int[] llllIIllllIlIlIIIIll(String trim) {
        trim = trim.trim();
        final TreeSet<Integer> set = new TreeSet<Integer>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll(s));
            if (ilIIIlIlIIIllIlIlIIl == null) {
                this.llIllIlIIIIllIlIIllI("Item not found: " + s);
            }
            else {
                final int llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                if (llllIIIIlIIIlIlllIll2 < 0) {
                    this.llIllIlIIIIllIlIIllI("Item has no ID: " + ilIIIlIlIIIllIlIlIIl + ", name: " + s);
                }
                else {
                    set.add(new Integer(llllIIIIlIIIlIlllIll2));
                }
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(set.toArray(new Integer[set.size()]));
    }
    
    public int[] IlIllIlIlIIIlIlIlIII(String trim) {
        trim = trim.trim();
        final TreeSet<Integer> set = new TreeSet<Integer>();
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(trim, " ");
        for (int i = 0; i < llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = llllIIIIlIIIlIlllIll[i];
            final int llllIIIIlIIIlIlllIll2 = net.optifine.util.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(s);
            if (llllIIIIlIIIlIlllIll2 < 0) {
                this.llIllIlIIIIllIlIIllI("Entity not found: " + s);
            }
            else {
                set.add(new Integer(llllIIIIlIIIlIlllIll2));
            }
        }
        return net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(set.toArray(new Integer[set.size()]));
    }
}
