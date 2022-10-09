package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import java.util.regex.*;
import java.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.expr.*;

public class IlIlIIIllIllIIIIIllI
{
    private boolean llllIIIIlIIIlIlllIll;
    private Deque IlIlIlIlIlllllllllIl;
    private Deque llIllIIIIIllIlIIIIlI;
    private Map IlIIIlIlIIIllIlIlIIl;
    private static final Pattern IlIlIIIllIllIIIIIllI;
    private static final Pattern IllIIlllIIIIlllIIlIl;
    private static final Pattern llllIIIlIlllIlIIIIIl;
    private static final Pattern lIIIIlIIIIIlllIllIII;
    private static final String lIIIlllIIIllIIIllIII = "define";
    private static final String llIIlIIIlIIIllIlIIIl = "undef";
    private static final String llIllIlIIIIllIlIIllI = "ifdef";
    private static final String lIlIlIIIllIIllIIIllI = "ifndef";
    private static final String IlIlIIIllIIllIlllllI = "if";
    private static final String IIIIlllIIIIIIlIIIlll = "else";
    private static final String llllIIllllIlIlIIIIll = "elif";
    private static final String IlIllIlIlIIIlIlIlIII = "endif";
    private static final List IIlllIIlIllIllIlIIll;
    
    static {
        IlIlIIIllIllIIIIIllI = Pattern.compile("\\s*#\\s*(\\w+)\\s*(.*)");
        IllIIlllIIIIlllIIlIl = Pattern.compile("defined\\s+(\\w+)");
        llllIIIlIlllIlIIIIIl = Pattern.compile("defined\\s*\\(\\s*(\\w+)\\s*\\)");
        lIIIIlIIIIIlllIllIII = Pattern.compile("(\\w+)");
        IIlllIIlIllIllIlIIll = Arrays.asList("define", "undef", "ifdef", "ifndef", "if", "else", "elif", "endif");
    }
    
    public IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll = true;
        this.IlIlIlIlIlllllllllIl = new ArrayDeque();
        this.llIllIIIIIllIlIIIIlI = new ArrayDeque();
        this.IlIIIlIlIIIllIlIlIIl = new HashMap();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        final Matcher matcher = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.matcher(s);
        if (!matcher.matches()) {
            return this.llllIIIIlIIIlIlllIll;
        }
        final String group = matcher.group(1);
        String s2 = matcher.group(2);
        final int index = s2.indexOf("//");
        if (index >= 0) {
            s2 = s2.substring(0, index);
        }
        final boolean llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll(group, s2);
        this.llllIIIIlIIIlIlllIll = !this.IlIlIlIlIlllllllllIl.contains(Boolean.FALSE);
        return this.llllIIIIlIIIlIlllIll || llllIIIIlIIIlIlllIll;
    }
    
    public static boolean IlIlIlIlIlllllllllIl(final String s) {
        final Matcher matcher = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI.matcher(s);
        return matcher.matches() && net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IIlllIIlIllIllIlIIll.contains(matcher.group(1));
    }
    
    private void llllIIIIlIIIlIlllIll(final String s, final String s2) {
        final StringTokenizer stringTokenizer = new StringTokenizer(s2, " \t");
        final String s3 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : "";
        final String s4 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken("").trim() : "";
        if (s.equals("define")) {
            this.IlIIIlIlIIIllIlIlIIl.put(s3, s4);
        }
        else if (s.equals("undef")) {
            this.IlIIIlIlIIIllIlIlIIl.remove(s3);
        }
        else if (s.equals("ifdef")) {
            final boolean containsKey = this.IlIIIlIlIIIllIlIlIIl.containsKey(s3);
            this.IlIlIlIlIlllllllllIl.add(containsKey);
            this.llIllIIIIIllIlIIIIlI.add(containsKey);
        }
        else if (s.equals("ifndef")) {
            final boolean b = !this.IlIIIlIlIIIllIlIlIIl.containsKey(s3);
            this.IlIlIlIlIlllllllllIl.add(b);
            this.llIllIIIIIllIlIIIIlI.add(b);
        }
        else if (s.equals("if")) {
            final boolean llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(s2);
            this.IlIlIlIlIlllllllllIl.add(llIllIIIIIllIlIIIIlI);
            this.llIllIIIIIllIlIIIIlI.add(llIllIIIIIllIlIIIIlI);
        }
        else if (!this.IlIlIlIlIlllllllllIl.isEmpty()) {
            if (s.equals("elif")) {
                this.IlIlIlIlIlllllllllIl.removeLast();
                final boolean booleanValue = this.llIllIIIIIllIlIIIIlI.removeLast();
                if (booleanValue) {
                    this.IlIlIlIlIlllllllllIl.add(false);
                    this.llIllIIIIIllIlIIIIlI.add(booleanValue);
                }
                else {
                    final boolean llIllIIIIIllIlIIIIlI2 = this.llIllIIIIIllIlIIIIlI(s2);
                    this.IlIlIlIlIlllllllllIl.add(llIllIIIIIllIlIIIIlI2);
                    this.llIllIIIIIllIlIIIIlI.add(llIllIIIIIllIlIIIIlI2);
                }
            }
            else if (s.equals("else")) {
                this.IlIlIlIlIlllllllllIl.removeLast();
                this.IlIlIlIlIlllllllllIl.add(!this.llIllIIIIIllIlIIIIlI.removeLast());
                this.llIllIIIIIllIlIIIIlI.add(true);
            }
            else if (s.equals("endif")) {
                this.IlIlIlIlIlllllllllIl.removeLast();
                this.llIllIIIIIllIlIIIIlI.removeLast();
            }
        }
    }
    
    private boolean llIllIIIIIllIlIIIIlI(String s) {
        s = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.IllIIlllIIIIlllIIlIl.matcher(s).replaceAll("defined_$1");
        s = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.llllIIIlIlllIlIIIIIl.matcher(s).replaceAll("defined_$1");
        int n = 0;
        boolean b;
        do {
            b = false;
            final Matcher matcher = net.optifine.shaders.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lIIIIlIIIIIlllIllIII.matcher(s);
            while (matcher.find()) {
                final String group = matcher.group();
                if (group.length() > 0) {
                    final char char1 = group.charAt(0);
                    if ((Character.isLetter(char1) || char1 == '_') && this.IlIIIlIlIIIllIlIlIIl.containsKey(group)) {
                        String s2 = this.IlIIIlIlIIIllIlIlIIl.get(group);
                        if (s2 == null) {
                            s2 = "1";
                        }
                        s = String.valueOf(s.substring(0, matcher.start())) + " " + s2 + " " + s.substring(matcher.end());
                        b = true;
                        ++n;
                        break;
                    }
                    continue;
                }
            }
        } while (b && n < 100);
        if (n >= 100) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Too many iterations: " + n + ", when resolving: " + s);
            return true;
        }
        try {
            final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = new IlIIIlIlIIIllIlIlIIl(new llIllIIIIIllIlIIIIlI(this.IlIIIlIlIIIllIlIlIIl)).llIllIIIIIllIlIIIIlI(s);
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == net.optifine.expr.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI) {
                return ((llIllIlIIIIllIlIIllI)llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI();
            }
            if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() == net.optifine.expr.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll) {
                return ((IlIlIIIllIIllIlllllI)llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl() != 0.0f;
            }
            throw new IlIlIIIIIIlllIlIllIl("Not a boolean or float expression: " + llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll());
        }
        catch (IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl) {
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Invalid macro expression: " + s);
            net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Error: " + ilIlIIIIIIlllIlIllIl.getMessage());
            return false;
        }
    }
}
