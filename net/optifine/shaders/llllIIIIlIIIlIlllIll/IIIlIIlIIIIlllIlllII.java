package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import java.util.regex.*;

public class IIIlIIlIIIIlllIlllII
{
    public static Pattern llllIIIIlIIIlIlllIll;
    public static Pattern IlIlIlIlIlllllllllIl;
    public static Pattern llIllIIIIIllIlIIIIlI;
    public static Pattern IlIIIlIlIIIllIlIlIIl;
    public static Pattern IlIlIIIllIllIIIIIllI;
    public static Pattern IllIIlllIIIIlllIIlIl;
    public static Pattern llllIIIlIlllIlIIIIIl;
    public static Pattern lIIIIlIIIIIlllIllIII;
    public static Pattern lIIIlllIIIllIIIllIII;
    public static Pattern llIIlIIIlIIIllIlIIIl;
    public static Pattern llIllIlIIIIllIlIIllI;
    public static Pattern lIlIlIIIllIIllIIIllI;
    
    static {
        IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll = Pattern.compile("\\s*uniform\\s+\\w+\\s+(\\w+).*");
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl = Pattern.compile("\\s*attribute\\s+\\w+\\s+(\\w+).*");
        IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI = Pattern.compile("\\s*const\\s+int\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
        IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl = Pattern.compile("\\s*const\\s+float\\s+(\\w+)\\s*=\\s*([-+.\\w]+)\\s*;.*");
        IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI = Pattern.compile("\\s*const\\s+vec4\\s+(\\w+)\\s*=\\s*(.+)\\s*;.*");
        IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl = Pattern.compile("\\s*const\\s+bool\\s+(\\w+)\\s*=\\s*(\\w+)\\s*;.*");
        IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl = Pattern.compile("\\s*(/\\*|//)?\\s*([A-Z]+):\\s*(\\w+)\\s*(\\*/.*|\\s*)");
        IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII = Pattern.compile("\\s*#\\s*extension\\s+(\\w+)\\s*:\\s*(\\w+).*");
        IIIlIIlIIIIlllIlllII.lIIIlllIIIllIIIllIII = Pattern.compile(".*deferred[0-9]*\\.fsh");
        IIIlIIlIIIIlllIlllII.llIIlIIIlIIIllIlIIIl = Pattern.compile(".*composite[0-9]*\\.fsh");
        IIIlIIlIIIIlllIlllII.llIllIlIIIIllIlIIllI = Pattern.compile(".*final\\.fsh");
        IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI = Pattern.compile("[0-7N]*");
    }
    
    public static llIllIlIIIIllIlIIllI llllIIIIlIIIlIlllIll(final String s) {
        final Matcher matcher = IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.matcher(s);
        if (matcher.matches()) {
            return new llIllIlIIIIllIlIIllI(1, matcher.group(1), "", s);
        }
        final Matcher matcher2 = IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.matcher(s);
        if (matcher2.matches()) {
            return new llIllIlIIIIllIlIIllI(2, matcher2.group(1), "", s);
        }
        final Matcher matcher3 = IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.matcher(s);
        if (matcher3.matches()) {
            return new llIllIlIIIIllIlIIllI(6, matcher3.group(2), matcher3.group(3), s);
        }
        final Matcher matcher4 = IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.matcher(s);
        if (matcher4.matches()) {
            return new llIllIlIIIIllIlIIllI(3, matcher4.group(1), matcher4.group(2), s);
        }
        final Matcher matcher5 = IIIlIIlIIIIlllIlllII.IlIIIlIlIIIllIlIlIIl.matcher(s);
        if (matcher5.matches()) {
            return new llIllIlIIIIllIlIIllI(4, matcher5.group(1), matcher5.group(2), s);
        }
        final Matcher matcher6 = IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.matcher(s);
        if (matcher6.matches()) {
            return new llIllIlIIIIllIlIIllI(5, matcher6.group(1), matcher6.group(2), s);
        }
        final Matcher matcher7 = IIIlIIlIIIIlllIlllII.lIIIIlIIIIIlllIllIII.matcher(s);
        if (matcher7.matches()) {
            return new llIllIlIIIIllIlIIllI(7, matcher7.group(1), matcher7.group(2), s);
        }
        final Matcher matcher8 = IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.matcher(s);
        return matcher8.matches() ? new llIllIlIIIIllIlIIllI(8, matcher8.group(1), matcher8.group(2), s) : null;
    }
    
    public static int llllIIIIlIIIlIlllIll(final String s, final String s2, final int n, final int n2) {
        if (s.length() != s2.length() + 1) {
            return -1;
        }
        if (!s.startsWith(s2)) {
            return -1;
        }
        final int n3 = s.charAt(s2.length()) - '0';
        return (n3 >= n && n3 <= n2) ? n3 : -1;
    }
    
    public static int IlIlIlIlIlllllllllIl(final String s) {
        return s.equals("shadow") ? 0 : (s.equals("watershadow") ? 1 : llllIIIIlIIIlIlllIll(s, "shadowtex", 0, 1));
    }
    
    public static int llIllIIIIIllIlIIIIlI(final String s) {
        return s.equals("shadowcolor") ? 0 : llllIIIIlIIIlIlllIll(s, "shadowcolor", 0, 1);
    }
    
    public static int IlIIIlIlIIIllIlIlIIl(final String s) {
        return llllIIIIlIIIlIlllIll(s, "depthtex", 0, 2);
    }
    
    public static int IlIlIIIllIllIIIIIllI(final String s) {
        final int llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(s, "gaux", 1, 4);
        return (llllIIIIlIIIlIlllIll > 0) ? (llllIIIIlIIIlIlllIll + 3) : llllIIIIlIIIlIlllIll(s, "colortex", 4, 7);
    }
    
    public static boolean IllIIlllIIIIlllIIlIl(final String s) {
        return IIIlIIlIIIIlllIlllII.lIIIlllIIIllIIIllIII.matcher(s).matches();
    }
    
    public static boolean llllIIIlIlllIlIIIIIl(final String s) {
        return IIIlIIlIIIIlllIlllII.llIIlIIIlIIIllIlIIIl.matcher(s).matches();
    }
    
    public static boolean lIIIIlIIIIIlllIllIII(final String s) {
        return IIIlIIlIIIIlllIlllII.llIllIlIIIIllIlIIllI.matcher(s).matches();
    }
    
    public static boolean lIIIlllIIIllIIIllIII(final String s) {
        return IIIlIIlIIIIlllIlllII.lIlIlIIIllIIllIIIllI.matcher(s).matches();
    }
}
