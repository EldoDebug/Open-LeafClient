package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.optifine.util.*;
import java.util.regex.*;

public class IIllIIllIIIlIlIIIIlI extends IlIlIIIIIIlllIlIllIl
{
    private static final Pattern IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIIIlIlIIIllIlIlIIl = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");
    }
    
    public IIllIIllIIIlIlIIIIlI(final String s, final String s2, final String s3, final String s4) {
        super(s, s2, s3, s4);
    }
    
    @Override
    public String llllIIllllIlIlIIIIll() {
        return "const bool " + this.llllIIIIlIIIlIlllIll() + " = " + this.IlIIIlIlIIIllIlIlIIl() + "; // Shader option " + this.IlIIIlIlIIIllIlIlIIl();
    }
    
    public static IIIIlllIIIIIIlIIIlll IlIlIlIlIlllllllllIl(final String s, String ilIIIlIlIIIllIlIlIIl) {
        final Matcher matcher = IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl.matcher(s);
        if (!matcher.matches()) {
            return null;
        }
        final String group = matcher.group(1);
        final String group2 = matcher.group(2);
        final String group3 = matcher.group(3);
        if (group != null && group.length() > 0) {
            ilIIIlIlIIIllIlIlIIl = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl, "/shaders/");
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI(group, group3, group2, ilIIIlIlIIIllIlIlIIl);
            illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl(false);
            return illIIllIIIlIlIIIIlI;
        }
        return null;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final String s) {
        final Matcher matcher = IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl.matcher(s);
        return matcher.matches() && matcher.group(1).matches(this.llllIIIIlIIIlIlllIll());
    }
    
    @Override
    public boolean IIIIlllIIIIIIlIIIlll() {
        return false;
    }
}
