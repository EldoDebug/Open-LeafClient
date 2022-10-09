package net.optifine.lIIIIlIIIIIlllIllIII;

import java.util.*;
import java.lang.reflect.*;

public class IlIllIlIlIIIlIlIlIII
{
    public static Field llllIIIIlIIIlIlllIll(final Class clazz, final Class clazz2) {
        try {
            final Field[] declaredFields = clazz.getDeclaredFields();
            for (int i = 0; i < declaredFields.length; ++i) {
                final Field field = declaredFields[i];
                if (field.getType() == clazz2) {
                    field.setAccessible(true);
                    return field;
                }
            }
            return null;
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static Field[] IlIlIlIlIlllllllllIl(final Class clazz, final Class clazz2) {
        try {
            return llllIIIIlIIIlIlllIll(clazz.getDeclaredFields(), clazz2);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static Field[] llllIIIIlIIIlIlllIll(final Field[] array, final Class clazz) {
        try {
            final ArrayList<Field> list = new ArrayList<Field>();
            for (int i = 0; i < array.length; ++i) {
                final Field field = array[i];
                if (field.getType() == clazz) {
                    field.setAccessible(true);
                    list.add(field);
                }
            }
            return list.toArray(new Field[list.size()]);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static Field[] llllIIIIlIIIlIlllIll(final Class clazz, final Field field, final Class clazz2) {
        try {
            final List<Field> list = Arrays.asList(clazz.getDeclaredFields());
            final int index = list.indexOf(field);
            if (index < 0) {
                return new Field[0];
            }
            final List<Field> subList = list.subList(index + 1, list.size());
            return llllIIIIlIIIlIlllIll(subList.toArray(new Field[subList.size()]), clazz2);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static Field[] llllIIIIlIIIlIlllIll(final Object o, final Field[] array, final Class clazz, final Object o2) {
        try {
            final ArrayList<Field> list = new ArrayList<Field>();
            for (int i = 0; i < array.length; ++i) {
                final Field field = array[i];
                if (field.getType() == clazz) {
                    final boolean static1 = Modifier.isStatic(field.getModifiers());
                    if ((o != null || static1) && (o == null || !static1)) {
                        field.setAccessible(true);
                        final Object value = field.get(o);
                        if (value == o2) {
                            list.add(field);
                        }
                        else if (value != null && o2 != null && value.equals(o2)) {
                            list.add(field);
                        }
                    }
                }
            }
            return list.toArray(new Field[list.size()]);
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    public static Field llllIIIIlIIIlIlllIll(final Class clazz, final Class clazz2, final int n) {
        final Field[] ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(clazz, clazz2);
        return (n >= 0 && n < ilIlIlIlIlllllllllIl.length) ? ilIlIlIlIlllllllllIl[n] : null;
    }
    
    public static Field llllIIIIlIIIlIlllIll(final Class clazz, final Field field, final Class clazz2, final int n) {
        final Field[] llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(clazz, field, clazz2);
        return (n >= 0 && n < llllIIIIlIIIlIlllIll.length) ? llllIIIIlIIIlIlllIll[n] : null;
    }
    
    public static Object llllIIIIlIIIlIlllIll(final Object o, final Class clazz, final Class clazz2) {
        final lIlIlIIIllIIllIIIllI llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(clazz, clazz2);
        return (llIllIIIIIllIlIIIIlI == null) ? null : (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() ? lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(o, llIllIIIIIllIlIIIIlI) : null);
    }
    
    public static Object llllIIIIlIIIlIlllIll(final Object o, final Class clazz, final Class clazz2, final int n) {
        final lIlIlIIIllIIllIIIllI ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(clazz, clazz2, n);
        return (ilIlIlIlIlllllllllIl == null) ? null : (ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl() ? lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(o, ilIlIlIlIlllllllllIl) : null);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Object o, final Class clazz, final Class clazz2, final Object o2) {
        final lIlIlIIIllIIllIIIllI llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI(clazz, clazz2);
        return llIllIIIIIllIlIIIIlI != null && llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() && lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(o, llIllIIIIIllIlIIIIlI, o2);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Object o, final Class clazz, final Class clazz2, final int n, final Object o2) {
        final lIlIlIIIllIIllIIIllI ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(clazz, clazz2, n);
        return ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl() && lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(o, ilIlIlIlIlllllllllIl, o2);
    }
    
    public static lIlIlIIIllIIllIIIllI llIllIIIIIllIlIIIIlI(final Class clazz, final Class clazz2) {
        final Field llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(clazz, clazz2);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        return new lIlIlIIIllIIllIIIllI(new llIIlIIIlIIIllIlIIIl(clazz), llllIIIIlIIIlIlllIll.getName());
    }
    
    public static lIlIlIIIllIIllIIIllI IlIlIlIlIlllllllllIl(final Class clazz, final Class clazz2, final int n) {
        final Field llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(clazz, clazz2, n);
        if (llllIIIIlIIIlIlllIll == null) {
            return null;
        }
        return new lIlIlIIIllIIllIIIllI(new llIIlIIIlIIIllIlIIIl(clazz), llllIIIIlIIIlIlllIll.getName());
    }
}
