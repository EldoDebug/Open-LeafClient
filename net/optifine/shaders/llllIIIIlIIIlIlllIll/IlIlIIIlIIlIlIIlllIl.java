package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import java.util.regex.*;
import net.optifine.util.*;

public class IlIlIIIlIIlIlIIlllIl extends IIIlIIIlIlIIlllIIlll
{
    private String IlIIIlIlIIIllIlIlIIl;
    private static final Pattern IlIlIIIllIllIIIIIllI;
    
    static {
        IlIlIIIllIllIIIIIllI = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");
    }
    
    public IlIlIIIlIIlIlIIlllIl(final String s, final String ilIIIlIlIIIllIlIlIIl, final String s2, final String s3, final String[] array, final String s4) {
        super(s, s2, s3, array, s4);
        this.IlIIIlIlIIIllIlIlIIl = null;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public String llllIIllllIlIlIIIIll() {
        return "const " + this.IlIIIlIlIIIllIlIlIIl + " " + this.llllIIIIlIIIlIlllIll() + " = " + this.IlIIIlIlIIIllIlIlIIl() + "; // Shader option " + this.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final String s) {
        final Matcher matcher = IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI.matcher(s);
        return matcher.matches() && matcher.group(2).matches(this.llllIIIIlIIIlIlllIll());
    }
    
    public static IIIIlllIIIIIIlIIIlll llIllIIIIIllIlIIIIlI(final String s, String ilIIIlIlIIIllIlIlIIl) {
        final Matcher matcher = IlIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI.matcher(s);
        if (!matcher.matches()) {
            return null;
        }
        final String group = matcher.group(1);
        final String group2 = matcher.group(2);
        final String group3 = matcher.group(3);
        String s2 = matcher.group(4);
        final String ilIIIlIlIIIllIlIlIIl2 = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s2, "[", "]");
        if (ilIIIlIlIIIllIlIlIIl2 != null && ilIIIlIlIIIllIlIlIIl2.length() > 0) {
            s2 = s2.replace(ilIIIlIlIIIllIlIlIIl2, "").trim();
        }
        final String[] ilIlIlIlIlllllllllIl = IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(group3, ilIIIlIlIIIllIlIlIIl2);
        if (group2 != null && group2.length() > 0) {
            ilIIIlIlIIIllIlIlIIl = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl, "/shaders/");
            return new IlIlIIIlIIlIlIIlllIl(group2, group, s2, group3, ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl);
        }
        return null;
    }
}
