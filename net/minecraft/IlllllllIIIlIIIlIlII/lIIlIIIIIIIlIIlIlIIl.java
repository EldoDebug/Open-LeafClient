package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.regex.*;
import org.apache.commons.lang3.*;

public class lIIlIIIIIIIlIIlIlIIl
{
    private static final Pattern llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");
    }
    
    public static String llllIIIIlIIIlIlllIll(final int n) {
        final int n2 = n / 20;
        final int n3 = n2 / 60;
        final int n4 = n2 % 60;
        return (n4 < 10) ? (String.valueOf(n3) + ":0" + n4) : (String.valueOf(n3) + ":" + n4);
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        return lIIlIIIIIIIlIIlIlIIl.llllIIIIlIIIlIlllIll.matcher(s).replaceAll("");
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final String s) {
        return StringUtils.isEmpty((CharSequence)s);
    }
}
