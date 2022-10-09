package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.regex.*;
import com.google.common.collect.*;
import java.util.*;

public enum IlllIIIIlIIIlIlIlIIl
{
    llllIIIIlIIIlIlllIll("BLACK", 0, "BLACK", '0', 0), 
    IlIlIlIlIlllllllllIl("DARK_BLUE", 1, "DARK_BLUE", '1', 1), 
    llIllIIIIIllIlIIIIlI("DARK_GREEN", 2, "DARK_GREEN", '2', 2), 
    IlIIIlIlIIIllIlIlIIl("DARK_AQUA", 3, "DARK_AQUA", '3', 3), 
    IlIlIIIllIllIIIIIllI("DARK_RED", 4, "DARK_RED", '4', 4), 
    IllIIlllIIIIlllIIlIl("DARK_PURPLE", 5, "DARK_PURPLE", '5', 5), 
    llllIIIlIlllIlIIIIIl("GOLD", 6, "GOLD", '6', 6), 
    lIIIIlIIIIIlllIllIII("GRAY", 7, "GRAY", '7', 7), 
    lIIIlllIIIllIIIllIII("DARK_GRAY", 8, "DARK_GRAY", '8', 8), 
    llIIlIIIlIIIllIlIIIl("BLUE", 9, "BLUE", '9', 9), 
    llIllIlIIIIllIlIIllI("GREEN", 10, "GREEN", 'a', 10), 
    lIlIlIIIllIIllIIIllI("AQUA", 11, "AQUA", 'b', 11), 
    IlIlIIIllIIllIlllllI("RED", 12, "RED", 'c', 12), 
    IIIIlllIIIIIIlIIIlll("LIGHT_PURPLE", 13, "LIGHT_PURPLE", 'd', 13), 
    llllIIllllIlIlIIIIll("YELLOW", 14, "YELLOW", 'e', 14), 
    IlIllIlIlIIIlIlIlIII("WHITE", 15, "WHITE", 'f', 15), 
    IIlllIIlIllIllIlIIll("OBFUSCATED", 16, "OBFUSCATED", 'k', true), 
    lllIIIIlllllIlIIllIl("BOLD", 17, "BOLD", 'l', true), 
    IlIlIIIIIIlllIlIllIl("STRIKETHROUGH", 18, "STRIKETHROUGH", 'm', true), 
    IIllIIllIIIlIlIIIIlI("UNDERLINE", 19, "UNDERLINE", 'n', true), 
    IIIlIIIlIlIIlllIIlll("ITALIC", 20, "ITALIC", 'o', true), 
    IlIlIIIlIIlIlIIlllIl("RESET", 21, "RESET", 'r', -1);
    
    private static final Map IlllllllIIIlIIIlIlII;
    private static final Pattern IIlIIIIlllIlllllIlII;
    private final String IIIlIIlIIIIlllIlllII;
    private final char IlIlIllllllllIIIIlII;
    private final boolean IIlllIlIIllIlIlIlIIl;
    private final String llIIIlIlIllIIlIlIlII;
    private final int lllllIlIIIlIlIIlllII;
    
    static {
        lIllllllIIllIlIlIlII = new IlllIIIIlIIIlIlIlIIl[] { IlllIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll, IlllIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl, IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI, IlllIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl, IlllIIIIlIIIlIlIlIIl.IlIlIIIllIllIIIIIllI, IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl, IlllIIIIlIIIlIlIlIIl.llllIIIlIlllIlIIIIIl, IlllIIIIlIIIlIlIlIIl.lIIIIlIIIIIlllIllIII, IlllIIIIlIIIlIlIlIIl.lIIIlllIIIllIIIllIII, IlllIIIIlIIIlIlIlIIl.llIIlIIIlIIIllIlIIIl, IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI, IlllIIIIlIIIlIlIlIIl.lIlIlIIIllIIllIIIllI, IlllIIIIlIIIlIlIlIIl.IlIlIIIllIIllIlllllI, IlllIIIIlIIIlIlIlIIl.IIIIlllIIIIIIlIIIlll, IlllIIIIlIIIlIlIlIIl.llllIIllllIlIlIIIIll, IlllIIIIlIIIlIlIlIIl.IlIllIlIlIIIlIlIlIII, IlllIIIIlIIIlIlIlIIl.IIlllIIlIllIllIlIIll, IlllIIIIlIIIlIlIlIIl.lllIIIIlllllIlIIllIl, IlllIIIIlIIIlIlIlIIl.IlIlIIIIIIlllIlIllIl, IlllIIIIlIIIlIlIlIIl.IIllIIllIIIlIlIIIIlI, IlllIIIIlIIIlIlIlIIl.IIIlIIIlIlIIlllIIlll, IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl };
        IlllllllIIIlIIIlIlII = Maps.newHashMap();
        IIlIIIIlllIlllllIlII = Pattern.compile("(?i)" + String.valueOf('Åò') + "[0-9A-FK-OR]");
        IlllIIIIlIIIlIlIlIIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl = values[i];
            IlllIIIIlIIIlIlIlIIl.IlllllllIIIlIIIlIlII.put(llIllIIIIIllIlIIIIlI(illlIIIIlIIIlIlIlIIl.IIIlIIlIIIIlllIlllII), illlIIIIlIIIlIlIlIIl);
        }
    }
    
    private static String llIllIIIIIllIlIIIIlI(final String s) {
        return s.toLowerCase().replaceAll("[^a-z]", "");
    }
    
    private IlllIIIIlIIIlIlIlIIl(final String s, final int n, final String s2, final char c, final int n2) {
        this(s, n, s2, c, false, n2);
    }
    
    private IlllIIIIlIIIlIlIlIIl(final String s, final int n, final String s2, final char c, final boolean b) {
        this(s, n, s2, c, b, -1);
    }
    
    private IlllIIIIlIIIlIlIlIIl(final String s, final int n, final String iiIlIIlIIIIlllIlllII, final char ilIlIllllllllIIIIlII, final boolean iIlllIlIIllIlIlIlIIl, final int lllllIlIIIlIlIIlllII) {
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
        this.IlIlIllllllllIIIIlII = ilIlIllllllllIIIIlII;
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
        this.llIIIlIlIllIIlIlIlII = "Åò" + ilIlIllllllllIIIIlII;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.lllllIlIIIlIlIIlllII;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IIlllIlIIllIlIlIlIIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return !this.IIlllIlIIllIlIlIlIIl && this != IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl;
    }
    
    public String IlIIIlIlIIIllIlIlIIl() {
        return this.name().toLowerCase();
    }
    
    @Override
    public String toString() {
        return this.llIIIlIlIllIIlIlIlII;
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        return (s == null) ? null : IlllIIIIlIIIlIlIlIIl.IIlIIIIlllIlllllIlII.matcher(s).replaceAll("");
    }
    
    public static IlllIIIIlIIIlIlIlIIl IlIlIlIlIlllllllllIl(final String s) {
        return (s == null) ? null : IlllIIIIlIIIlIlIlIIl.IlllllllIIIlIIIlIlII.get(llIllIIIIIllIlIIIIlI(s));
    }
    
    public static IlllIIIIlIIIlIlIlIIl llllIIIIlIIIlIlllIll(final int n) {
        if (n < 0) {
            return IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl;
        }
        IlllIIIIlIIIlIlIlIIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl = values[i];
            if (illlIIIIlIIIlIlIlIIl.llllIIIIlIIIlIlllIll() == n) {
                return illlIIIIlIIIlIlIlIIl;
            }
        }
        return null;
    }
    
    public static Collection llllIIIIlIIIlIlllIll(final boolean b, final boolean b2) {
        final ArrayList arrayList = Lists.newArrayList();
        IlllIIIIlIIIlIlIlIIl[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final IlllIIIIlIIIlIlIlIIl illlIIIIlIIIlIlIlIIl = values[i];
            if ((!illlIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI() || b) && (!illlIIIIlIIIlIlIlIIl.IlIlIlIlIlllllllllIl() || b2)) {
                arrayList.add(illlIIIIlIIIlIlIlIIl.IlIIIlIlIIIllIlIlIIl());
            }
        }
        return arrayList;
    }
}
