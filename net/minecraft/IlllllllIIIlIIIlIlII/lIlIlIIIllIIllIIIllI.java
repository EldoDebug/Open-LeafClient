package net.minecraft.IlllllllIIIlIIIlIlII;

public class lIlIlIIIllIIllIIIllI
{
    public static final char[] llllIIIIlIIIlIlllIll;
    
    static {
        llllIIIIlIIIlIlllIll = new char[] { '/', '\n', '\r', '\t', '\0', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':' };
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final char c) {
        return c != '˜' && c >= ' ' && c != '\u007f';
    }
    
    public static String llllIIIIlIIIlIlllIll(final String s) {
        final StringBuilder sb = new StringBuilder();
        char[] charArray;
        for (int length = (charArray = s.toCharArray()).length, i = 0; i < length; ++i) {
            final char c = charArray[i];
            if (llllIIIIlIIIlIlllIll(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
