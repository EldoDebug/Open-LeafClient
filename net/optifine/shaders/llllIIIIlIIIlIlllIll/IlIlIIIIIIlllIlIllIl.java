package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.optifine.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.util.*;
import java.util.regex.*;

public class IlIlIIIIIIlllIlIllIl extends IIIIlllIIIIIIlIIIlll
{
    private static final Pattern IlIIIlIlIIIllIlIlIIl;
    private static final Pattern IlIlIIIllIllIIIIIllI;
    
    static {
        IlIIIlIlIIIllIlIlIIl = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
        IlIlIIIllIllIIIIIllI = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");
    }
    
    public IlIlIIIIIIlllIlIllIl(final String s, final String s2, final String s3, final String s4) {
        super(s, s2, s3, new String[] { "false", "true" }, s3, s4);
    }
    
    @Override
    public String llllIIllllIlIlIIIIll() {
        return lIIIIlIIIIIlllIllIII(this.IlIIIlIlIIIllIlIlIIl()) ? ("#define " + this.llllIIIIlIIIlIlllIll() + " // Shader option ON") : ("//#define " + this.llllIIIIlIIIlIlllIll() + " // Shader option OFF");
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl(final String s) {
        final String ilIIIlIlIIIllIlIlIIl = super.IlIIIlIlIIIllIlIlIIl(s);
        return (ilIIIlIlIIIllIlIlIIl != s) ? ilIIIlIlIIIllIlIlIIl : (lIIIIlIIIIIlllIllIII(s) ? IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl() : IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI(final String s) {
        return lIIIIlIIIIIlllIllIII(s) ? "˜a" : "˜c";
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final String s, String ilIIIlIlIIIllIlIlIIl) {
        final Matcher matcher = IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl.matcher(s);
        if (!matcher.matches()) {
            return null;
        }
        final String group = matcher.group(1);
        final String group2 = matcher.group(2);
        final String group3 = matcher.group(3);
        if (group2 != null && group2.length() > 0) {
            final boolean b = !net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(group, (Object)"//");
            ilIIIlIlIIIllIlIlIIl = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl, "/shaders/");
            return new IlIlIIIIIIlllIlIllIl(group2, group3, String.valueOf(b), ilIIIlIlIIIllIlIlIIl);
        }
        return null;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final String s) {
        final Matcher matcher = IlIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl.matcher(s);
        return matcher.matches() && matcher.group(2).matches(this.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public boolean IIIIlllIIIIIIlIIIlll() {
        return true;
    }
    
    @Override
    public boolean llllIIIlIlllIlIIIIIl(final String s) {
        final Matcher matcher = IlIlIIIIIIlllIlIllIl.IlIlIIIllIllIIIIIllI.matcher(s);
        return matcher.matches() && matcher.group(2).equals(this.llllIIIIlIIIlIlllIll());
    }
    
    public static boolean lIIIIlIIIIIlllIllIII(final String s) {
        return Boolean.valueOf(s);
    }
}
