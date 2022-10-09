package net.optifine.util;

import java.lang.reflect.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl
{
    public static boolean llllIIIIlIIIlIlllIll(final Object[] array, final Object o) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == o) {
                return true;
            }
        }
        return false;
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final int[] array, final int[] array2) {
        if (array != null && array2 != null) {
            final int length = array.length;
            final int[] array3 = new int[length + array2.length];
            System.arraycopy(array, 0, array3, 0, length);
            for (int i = 0; i < array2.length; ++i) {
                array3[i + length] = array2[i];
            }
            return array3;
        }
        throw new NullPointerException("The given array is NULL");
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final int[] array, final int n) {
        return llllIIIIlIIIlIlllIll(array, new int[] { n });
    }
    
    public static Object[] llllIIIIlIIIlIlllIll(final Object[] array, final Object[] array2) {
        if (array == null) {
            throw new NullPointerException("The given array is NULL");
        }
        if (array2.length == 0) {
            return array;
        }
        final int length = array.length;
        final Object[] array3 = (Object[])Array.newInstance(array.getClass().getComponentType(), length + array2.length);
        System.arraycopy(array, 0, array3, 0, length);
        System.arraycopy(array2, 0, array3, length, array2.length);
        return array3;
    }
    
    public static Object[] IlIlIlIlIlllllllllIl(final Object[] array, final Object o) {
        if (array == null) {
            throw new NullPointerException("The given array is NULL");
        }
        final int length = array.length;
        final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), length + 1);
        System.arraycopy(array, 0, array2, 0, length);
        array2[length] = o;
        return array2;
    }
    
    public static Object[] llllIIIIlIIIlIlllIll(final Object[] array, final Object o, final int n) {
        final ArrayList<Object> list = new ArrayList<Object>(Arrays.asList(array));
        list.add(n, o);
        return list.toArray((Object[])Array.newInstance(array.getClass().getComponentType(), list.size()));
    }
    
    public static String llllIIIIlIIIlIlllIll(final boolean[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final boolean b = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(b));
        }
        return sb.toString();
    }
    
    public static String llllIIIIlIIIlIlllIll(final float[] array) {
        return llllIIIIlIIIlIlllIll(array, ", ");
    }
    
    public static String llllIIIIlIIIlIlllIll(final float[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final float n = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(n));
        }
        return sb.toString();
    }
    
    public static String llllIIIIlIIIlIlllIll(final float[] array, final String s, final String s2) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final float n = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.format(s2, n));
        }
        return sb.toString();
    }
    
    public static String llllIIIIlIIIlIlllIll(final int[] array) {
        return llllIIIIlIIIlIlllIll(array, ", ");
    }
    
    public static String llllIIIIlIIIlIlllIll(final int[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(n));
        }
        return sb.toString();
    }
    
    public static String IlIlIlIlIlllllllllIl(final int[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final int n = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append("0x");
            sb.append(Integer.toHexString(n));
        }
        return sb.toString();
    }
    
    public static String llllIIIIlIIIlIlllIll(final Object[] array) {
        return llllIIIIlIIIlIlllIll(array, ", ");
    }
    
    public static String llllIIIIlIIIlIlllIll(final Object[] array, final String s) {
        if (array == null) {
            return "";
        }
        final StringBuffer sb = new StringBuffer(array.length * 5);
        for (int i = 0; i < array.length; ++i) {
            final Object o = array[i];
            if (i > 0) {
                sb.append(s);
            }
            sb.append(String.valueOf(o));
        }
        return sb.toString();
    }
    
    public static Object[] llllIIIIlIIIlIlllIll(final Collection collection, final Class clazz) {
        if (collection == null) {
            return null;
        }
        if (clazz == null) {
            return null;
        }
        if (clazz.isPrimitive()) {
            throw new IllegalArgumentException("Can not make arrays with primitive elements (int, double), element class: " + clazz);
        }
        return collection.toArray((Object[])Array.newInstance(clazz, collection.size()));
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final int n, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Object o, final Object[] array) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (llllIIIIlIIIlIlllIll(o, array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2));
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final Object o, final Object[] array) {
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (o == array[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static Object[] llIllIIIIIllIlIIIIlI(final Object[] array, final Object o) {
        final ArrayList list = new ArrayList((Collection<? extends E>)Arrays.asList(array));
        list.remove(o);
        return llllIIIIlIIIlIlllIll(list, array.getClass().getComponentType());
    }
    
    public static int[] llllIIIIlIIIlIlllIll(final Integer[] array) {
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return new int[0];
        }
        final int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = array[i];
        }
        return array2;
    }
}
