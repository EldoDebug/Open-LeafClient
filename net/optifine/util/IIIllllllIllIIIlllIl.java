package net.optifine.util;

import java.util.*;

public class IIIllllllIllIIIlllIl
{
    public static boolean llllIIIIlIIIlIlllIll(final String s, final String s2, final char c, final char c2) {
        if (s2 == null || s == null) {
            return s2 == s;
        }
        if (s2.indexOf(c) < 0) {
            return (s2.indexOf(c2) < 0) ? s2.equals(s) : IlIlIlIlIlllllllllIl(s, s2, c2);
        }
        final ArrayList<String> list = new ArrayList<String>();
        final String string = new StringBuilder().append(c).toString();
        if (s2.startsWith(string)) {
            list.add("");
        }
        final StringTokenizer stringTokenizer = new StringTokenizer(s2, string);
        while (stringTokenizer.hasMoreElements()) {
            list.add(stringTokenizer.nextToken());
        }
        if (s2.endsWith(string)) {
            list.add("");
        }
        if (!IlIIIlIlIIIllIlIlIIl(s, (String)list.get(0), c2)) {
            return false;
        }
        if (!llIllIIIIIllIlIIIIlI(s, (String)list.get(list.size() - 1), c2)) {
            return false;
        }
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            final String s3 = list.get(i);
            if (s3.length() > 0) {
                final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s, s3, n, c2);
                if (llllIIIIlIIIlIlllIll < 0) {
                    return false;
                }
                n = llllIIIIlIIIlIlllIll + s3.length();
            }
        }
        return true;
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final String s, final String s2, final char c) {
        if (s == null || s2 == null) {
            return s == s2;
        }
        if (s.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s2.length(); ++i) {
            final char char1 = s2.charAt(i);
            if (char1 != c && s.charAt(i) != char1) {
                return false;
            }
        }
        return true;
    }
    
    private static int llllIIIIlIIIlIlllIll(final String s, final String s2, final int n, final char c) {
        if (s == null || s2 == null) {
            return -1;
        }
        if (n < 0 || n > s.length()) {
            return -1;
        }
        if (s.length() < n + s2.length()) {
            return -1;
        }
        for (int n2 = n; n2 + s2.length() <= s.length(); ++n2) {
            if (IlIlIlIlIlllllllllIl(s.substring(n2, n2 + s2.length()), s2, c)) {
                return n2;
            }
        }
        return -1;
    }
    
    private static boolean llIllIIIIIllIlIIIIlI(final String s, final String s2, final char c) {
        if (s != null && s2 != null) {
            return s.length() >= s2.length() && IlIlIlIlIlllllllllIl(s.substring(s.length() - s2.length(), s.length()), s2, c);
        }
        return s == s2;
    }
    
    private static boolean IlIIIlIlIIIllIlIlIIl(final String s, final String s2, final char c) {
        if (s != null && s2 != null) {
            return s.length() >= s2.length() && IlIlIlIlIlllllllllIl(s.substring(0, s2.length()), s2, c);
        }
        return s == s2;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final String s, final String[] array, final char c) {
        for (int i = 0; i < array.length; ++i) {
            if (llllIIIIlIIIlIlllIll(s, array[i], c)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final String s, final String s2, final char c) {
        if (s2 == null || s == null) {
            return s2 == s;
        }
        if (s2.indexOf(c) < 0) {
            return s2.equals(s);
        }
        final ArrayList<String> list = new ArrayList<String>();
        final String string = new StringBuilder().append(c).toString();
        if (s2.startsWith(string)) {
            list.add("");
        }
        final StringTokenizer stringTokenizer = new StringTokenizer(s2, string);
        while (stringTokenizer.hasMoreElements()) {
            list.add(stringTokenizer.nextToken());
        }
        if (s2.endsWith(string)) {
            list.add("");
        }
        if (!s.startsWith((String)list.get(0))) {
            return false;
        }
        if (!s.endsWith((String)list.get(list.size() - 1))) {
            return false;
        }
        int n = 0;
        for (int i = 0; i < list.size(); ++i) {
            final String s3 = list.get(i);
            if (s3.length() > 0) {
                final int index = s.indexOf(s3, n);
                if (index < 0) {
                    return false;
                }
                n = index + s3.length();
            }
        }
        return true;
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final String s, final String s2) {
        if (s == null || s.length() <= 0) {
            return new String[0];
        }
        if (s2 == null) {
            return new String[] { s };
        }
        final ArrayList<String> list = new ArrayList<String>();
        int n = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (llllIIIIlIIIlIlllIll(s.charAt(i), s2)) {
                list.add(s.substring(n, i));
                n = i + 1;
            }
        }
        list.add(s.substring(n, s.length()));
        return list.toArray(new String[list.size()]);
    }
    
    private static boolean llllIIIIlIIIlIlllIll(final char c, final String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == c) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(String trim, String trim2) {
        if (trim != null) {
            trim = trim.trim();
        }
        if (trim2 != null) {
            trim2 = trim2.trim();
        }
        return llllIIIIlIIIlIlllIll(trim, (Object)trim2);
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final String s) {
        return s == null || s.trim().length() <= 0;
    }
    
    public static String IlIlIlIlIlllllllllIl(final String s) {
        int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s, -1);
        if (llllIIIIlIIIlIlllIll == -1) {
            return "";
        }
        ++llllIIIIlIIIlIlllIll;
        return (new StringBuilder().append(llllIIIIlIIIlIlllIll).toString().length() > s.length()) ? "" : llllIIIIlIIIlIlllIll(new StringBuilder().append(llllIIIIlIIIlIlllIll).toString(), s.length(), '0');
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s, final int n) {
        if (s == null) {
            return n;
        }
        try {
            return Integer.parseInt(s);
        }
        catch (NumberFormatException ex) {
            return n;
        }
    }
    
    public static boolean llIllIIIIIllIlIIIIlI(final String s) {
        return !llllIIIIlIIIlIlllIll(s);
    }
    
    public static String llIllIIIIIllIlIIIIlI(String string, final String s) {
        for (int i = 0; i < s.length(); ++i) {
            if (string.indexOf(s.charAt(i)) < 0) {
                string = String.valueOf(string) + s.charAt(i);
            }
        }
        return string;
    }
    
    public static String llllIIIIlIIIlIlllIll(String s, final int n, final char c) {
        if (s == null) {
            s = "";
        }
        if (s.length() >= n) {
            return s;
        }
        final StringBuffer sb = new StringBuffer();
        while (sb.length() < n - s.length()) {
            sb.append(c);
        }
        return String.valueOf(sb.toString()) + s;
    }
    
    public static String IlIlIlIlIlllllllllIl(String s, final int n, final char c) {
        if (s == null) {
            s = "";
        }
        if (s.length() >= n) {
            return s;
        }
        final StringBuffer sb = new StringBuffer(s);
        while (sb.length() < n) {
            sb.append(c);
        }
        return sb.toString();
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final Object o, final Object o2) {
        return o == o2 || (o != null && o.equals(o2)) || (o2 != null && o2.equals(o));
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final String s, final String[] array) {
        if (s == null) {
            return false;
        }
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (s.startsWith(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final String s, final String[] array) {
        if (s == null) {
            return false;
        }
        if (array == null) {
            return false;
        }
        for (int i = 0; i < array.length; ++i) {
            if (s.endsWith(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static String IlIIIlIlIIIllIlIlIIl(String substring, final String s) {
        if (substring != null && s != null) {
            if (substring.startsWith(s)) {
                substring = substring.substring(s.length());
            }
            return substring;
        }
        return substring;
    }
    
    public static String IlIlIIIllIllIIIIIllI(String substring, final String s) {
        if (substring != null && s != null) {
            if (substring.endsWith(s)) {
                substring = substring.substring(0, substring.length() - s.length());
            }
            return substring;
        }
        return substring;
    }
    
    public static String llllIIIIlIIIlIlllIll(String substring, final String s, String s2) {
        if (substring == null || s == null) {
            return substring;
        }
        if (!substring.endsWith(s)) {
            return substring;
        }
        if (s2 == null) {
            s2 = "";
        }
        substring = substring.substring(0, substring.length() - s.length());
        return String.valueOf(substring) + s2;
    }
    
    public static String IlIlIlIlIlllllllllIl(String substring, final String s, String s2) {
        if (substring == null || s == null) {
            return substring;
        }
        if (!substring.startsWith(s)) {
            return substring;
        }
        if (s2 == null) {
            s2 = "";
        }
        substring = substring.substring(s.length());
        return String.valueOf(s2) + substring;
    }
    
    public static int llllIIIIlIIIlIlllIll(final String[] array, final String s) {
        if (array != null && s != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].startsWith(s)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
    
    public static int IlIlIlIlIlllllllllIl(final String[] array, final String s) {
        if (array != null && s != null) {
            for (int i = 0; i < array.length; ++i) {
                if (array[i].endsWith(s)) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
    
    public static String[] llllIIIIlIIIlIlllIll(final String[] array, final int n, final int n2) {
        if (array == null) {
            return array;
        }
        if (n2 <= 0 || n >= array.length) {
            return array;
        }
        if (n >= n2) {
            return array;
        }
        final ArrayList<String> list = new ArrayList<String>(array.length);
        for (int i = 0; i < array.length; ++i) {
            final String s = array[i];
            if (i < n || i >= n2) {
                list.add(s);
            }
        }
        return list.toArray(new String[list.size()]);
    }
    
    public static String llIllIIIIIllIlIIIIlI(String ilIlIIIllIllIIIIIllI, final String[] array) {
        if (ilIlIIIllIllIIIIIllI != null && array != null) {
            final int length = ilIlIIIllIllIIIIIllI.length();
            for (int i = 0; i < array.length; ++i) {
                ilIlIIIllIllIIIIIllI = IlIlIIIllIllIIIIIllI(ilIlIIIllIllIIIIIllI, array[i]);
                if (ilIlIIIllIllIIIIIllI.length() != length) {
                    break;
                }
            }
            return ilIlIIIllIllIIIIIllI;
        }
        return ilIlIIIllIllIIIIIllI;
    }
    
    public static String IlIIIlIlIIIllIlIlIIl(String ilIIIlIlIIIllIlIlIIl, final String[] array) {
        if (ilIIIlIlIIIllIlIlIIl != null && array != null) {
            final int length = ilIIIlIlIIIllIlIlIIl.length();
            for (int i = 0; i < array.length; ++i) {
                ilIIIlIlIIIllIlIlIIl = IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl, array[i]);
                if (ilIIIlIlIIIllIlIlIIl.length() != length) {
                    break;
                }
            }
            return ilIIIlIlIIIllIlIlIIl;
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    public static String llllIIIIlIIIlIlllIll(String s, final String[] array, final String[] array2) {
        s = IlIIIlIlIIIllIlIlIIl(s, array);
        s = llIllIIIIIllIlIIIIlI(s, array2);
        return s;
    }
    
    public static String llIllIIIIIllIlIIIIlI(final String s, final String s2, final String s3) {
        return llllIIIIlIIIlIlllIll(s, new String[] { s2 }, new String[] { s3 });
    }
    
    public static String IlIIIlIlIIIllIlIlIIl(final String s, final String s2, final String s3) {
        if (s == null || s2 == null || s3 == null) {
            return null;
        }
        final int index = s.indexOf(s2);
        if (index < 0) {
            return null;
        }
        final int index2 = s.indexOf(s3, index);
        return (index2 < 0) ? null : s.substring(index, index2 + s3.length());
    }
    
    public static String IllIIlllIIIIlllIIlIl(final String s, final String s2) {
        return (s != null && s2 != null) ? (s.endsWith(s2) ? s : (String.valueOf(s) + s2)) : s;
    }
    
    public static String llllIIIlIlllIlIIIIIl(final String s, final String s2) {
        return (s != null && s2 != null) ? (s.endsWith(s2) ? s : (String.valueOf(s2) + s)) : s;
    }
    
    public static String lIIIIlIIIIIlllIllIII(String s, final String s2) {
        if (s != null && s2 != null) {
            s = lIIIlllIIIllIIIllIII(s, s2);
            s = llIIlIIIlIIIllIlIIIl(s, s2);
            return s;
        }
        return s;
    }
    
    public static String lIIIlllIIIllIIIllIII(final String s, final String s2) {
        if (s != null && s2 != null) {
            for (int length = s.length(), i = 0; i < length; ++i) {
                if (s2.indexOf(s.charAt(i)) < 0) {
                    return s.substring(i);
                }
            }
            return "";
        }
        return s;
    }
    
    public static String llIIlIIIlIIIllIlIIIl(final String s, final String s2) {
        if (s != null && s2 != null) {
            int length;
            int n;
            for (n = (length = s.length()); length > 0 && s2.indexOf(s.charAt(length - 1)) >= 0; --length) {}
            return (length == n) ? s : s.substring(0, length);
        }
        return s;
    }
}
