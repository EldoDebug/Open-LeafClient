package net.minecraft.lIlIlIIIllIIllIIIllI;

import java.util.regex.*;
import org.apache.logging.log4j.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final Pattern IlIlIlIlIlllllllllIl;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = Pattern.compile("\\[[-+\\d|,\\s]+\\]");
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(String trim) {
        trim = trim.trim();
        if (!trim.startsWith("{")) {
            throw new lIIIlllIIIllIIIllIII("Invalid tag encountered, expected '{' as first char.");
        }
        if (IlIlIlIlIlllllllllIl(trim) != 1) {
            throw new lIIIlllIIIllIIIllIII("Encountered multiple top tags, only one expected");
        }
        return (IIIIlllIIIIIIlIIIlll)llllIIIIlIIIlIlllIll("tag", trim).llllIIIIlIIIlIlllIll();
    }
    
    static int IlIlIlIlIlllllllllIl(final String s) {
        int n = 0;
        boolean b = false;
        final Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 == '\"') {
                if (IlIlIlIlIlllllllllIl(s, i)) {
                    if (!b) {
                        throw new lIIIlllIIIllIIIllIII("Illegal use of \\\": " + s);
                    }
                }
                else {
                    b = !b;
                }
            }
            else if (!b) {
                if (char1 != '{' && char1 != '[') {
                    if (char1 == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                        throw new lIIIlllIIIllIIIllIII("Unbalanced curly brackets {}: " + s);
                    }
                    if (char1 == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                        throw new lIIIlllIIIllIIIllIII("Unbalanced square brackets []: " + s);
                    }
                }
                else {
                    if (stack.isEmpty()) {
                        ++n;
                    }
                    stack.push(char1);
                }
            }
        }
        if (b) {
            throw new lIIIlllIIIllIIIllIII("Unbalanced quotation: " + s);
        }
        if (!stack.isEmpty()) {
            throw new lIIIlllIIIllIIIllIII("Unbalanced brackets: " + s);
        }
        if (n == 0 && !s.isEmpty()) {
            n = 1;
        }
        return n;
    }
    
    static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final String... array) {
        return llllIIIIlIIIlIlllIll(array[0], array[1]);
    }
    
    static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final String s, String s2) {
        s2 = s2.trim();
        if (s2.startsWith("{")) {
            s2 = s2.substring(1, s2.length() - 1);
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(s);
            while (s2.length() > 0) {
                final String ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(s2, true);
                if (ilIlIlIlIlllllllllIl.length() > 0) {
                    ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl.add(llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, false));
                }
                if (s2.length() < ilIlIlIlIlllllllllIl.length() + 1) {
                    break;
                }
                final char char1 = s2.charAt(ilIlIlIlIlllllllllIl.length());
                if (char1 != ',' && char1 != '{' && char1 != '}' && char1 != '[' && char1 != ']') {
                    throw new lIIIlllIIIllIIIllIII("Unexpected token '" + char1 + "' at: " + s2.substring(ilIlIlIlIlllllllllIl.length()));
                }
                s2 = s2.substring(ilIlIlIlIlllllllllIl.length() + 1);
            }
            return ilIIIlIlIIIllIlIlIIl;
        }
        if (s2.startsWith("[") && !net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.matcher(s2).matches()) {
            s2 = s2.substring(1, s2.length() - 1);
            final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI = new IlIlIIIllIllIIIIIllI(s);
            while (s2.length() > 0) {
                final String ilIlIlIlIlllllllllIl2 = IlIlIlIlIlllllllllIl(s2, false);
                if (ilIlIlIlIlllllllllIl2.length() > 0) {
                    ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl.add(llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, true));
                }
                if (s2.length() < ilIlIlIlIlllllllllIl2.length() + 1) {
                    break;
                }
                final char char2 = s2.charAt(ilIlIlIlIlllllllllIl2.length());
                if (char2 != ',' && char2 != '{' && char2 != '}' && char2 != '[' && char2 != ']') {
                    throw new lIIIlllIIIllIIIllIII("Unexpected token '" + char2 + "' at: " + s2.substring(ilIlIlIlIlllllllllIl2.length()));
                }
                s2 = s2.substring(ilIlIlIlIlllllllllIl2.length() + 1);
            }
            return ilIlIIIllIllIIIIIllI;
        }
        return new IllIIlllIIIIlllIIlIl(s, s2);
    }
    
    private static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final String s, final boolean b) {
        return llllIIIIlIIIlIlllIll(new String[] { llIllIIIIIllIlIIIIlI(s, b), IlIIIlIlIIIllIlIlIIl(s, b) });
    }
    
    private static String IlIlIlIlIlllllllllIl(final String s, final boolean b) {
        int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s, ':');
        final int llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(s, ',');
        if (b) {
            if (llllIIIIlIIIlIlllIll == -1) {
                throw new lIIIlllIIIllIIIllIII("Unable to locate name/value separator for string: " + s);
            }
            if (llllIIIIlIIIlIlllIll2 != -1 && llllIIIIlIIIlIlllIll2 < llllIIIIlIIIlIlllIll) {
                throw new lIIIlllIIIllIIIllIII("Name error at: " + s);
            }
        }
        else if (llllIIIIlIIIlIlllIll == -1 || llllIIIIlIIIlIlllIll > llllIIIIlIIIlIlllIll2) {
            llllIIIIlIIIlIlllIll = -1;
        }
        return llllIIIIlIIIlIlllIll(s, llllIIIIlIIIlIlllIll);
    }
    
    private static String llllIIIIlIIIlIlllIll(final String s, final int n) {
        final Stack<Character> stack = new Stack<Character>();
        int i = n + 1;
        boolean b = false;
        boolean b2 = false;
        int n2 = 0;
        int n3 = 0;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 == '\"') {
                if (IlIlIlIlIlllllllllIl(s, i)) {
                    if (!b) {
                        throw new lIIIlllIIIllIIIllIII("Illegal use of \\\": " + s);
                    }
                }
                else {
                    b = !b;
                    if (b && n2 == 0) {
                        b2 = true;
                    }
                    if (!b) {
                        n3 = i;
                    }
                }
            }
            else if (!b) {
                if (char1 != '{' && char1 != '[') {
                    if (char1 == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                        throw new lIIIlllIIIllIIIllIII("Unbalanced curly brackets {}: " + s);
                    }
                    if (char1 == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                        throw new lIIIlllIIIllIIIllIII("Unbalanced square brackets []: " + s);
                    }
                    if (char1 == ',' && stack.isEmpty()) {
                        return s.substring(0, i);
                    }
                }
                else {
                    stack.push(char1);
                }
            }
            if (!Character.isWhitespace(char1)) {
                if (!b && b2 && n3 != i) {
                    return s.substring(0, n3 + 1);
                }
                n2 = 1;
            }
            ++i;
        }
        return s.substring(0, i);
    }
    
    private static String llIllIIIIIllIlIIIIlI(String trim, final boolean b) {
        if (b) {
            trim = trim.trim();
            if (trim.startsWith("{") || trim.startsWith("[")) {
                return "";
            }
        }
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(trim, ':');
        if (llllIIIIlIIIlIlllIll != -1) {
            return trim.substring(0, llllIIIIlIIIlIlllIll).trim();
        }
        if (b) {
            return "";
        }
        throw new lIIIlllIIIllIIIllIII("Unable to locate name/value separator for string: " + trim);
    }
    
    private static String IlIIIlIlIIIllIlIlIIl(String trim, final boolean b) {
        if (b) {
            trim = trim.trim();
            if (trim.startsWith("{") || trim.startsWith("[")) {
                return trim;
            }
        }
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(trim, ':');
        if (llllIIIIlIIIlIlllIll != -1) {
            return trim.substring(llllIIIIlIIIlIlllIll + 1).trim();
        }
        if (b) {
            return trim;
        }
        throw new lIIIlllIIIllIIIllIII("Unable to locate name/value separator for string: " + trim);
    }
    
    private static int llllIIIIlIIIlIlllIll(final String s, final char c) {
        int i = 0;
        boolean b = true;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (char1 == '\"') {
                if (!IlIlIlIlIlllllllllIl(s, i)) {
                    b = !b;
                }
            }
            else if (b) {
                if (char1 == c) {
                    return i;
                }
                if (char1 == '{' || char1 == '[') {
                    return -1;
                }
            }
            ++i;
        }
        return -1;
    }
    
    private static boolean IlIlIlIlIlllllllllIl(final String s, final int n) {
        return n > 0 && s.charAt(n - 1) == '\\' && !IlIlIlIlIlllllllllIl(s, n - 1);
    }
}
