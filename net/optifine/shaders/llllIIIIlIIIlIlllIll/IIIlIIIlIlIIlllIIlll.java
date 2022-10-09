package net.optifine.shaders.llllIIIIlIIIlIlllIll;

import net.optifine.shaders.*;
import java.util.regex.*;
import net.optifine.util.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import java.util.*;

public class IIIlIIIlIlIIlllIIlll extends IIIIlllIIIIIIlIIIlll
{
    private static final Pattern IlIIIlIlIIIllIlIlIIl;
    
    static {
        IlIIIlIlIIIllIlIlIIl = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");
    }
    
    public IIIlIIIlIlIIlllIIlll(final String s, final String s2, final String s3, final String[] array, final String s4) {
        super(s, s2, s3, array, s3, s4);
        this.IlIlIlIlIlllllllllIl(this.IlIllIlIlIIIlIlIlIII().length > 1);
    }
    
    @Override
    public String llllIIllllIlIlIIIIll() {
        return "#define " + this.llllIIIIlIIIlIlllIll() + " " + this.IlIIIlIlIIIllIlIlIIl() + " // Shader option " + this.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public String IlIIIlIlIIIllIlIlIIl(final String s) {
        return String.valueOf(llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl(new StringBuilder("prefix.").append(this.llllIIIIlIIIlIlllIll()).toString(), "")) + super.IlIIIlIlIIIllIlIlIIl(s) + llIIlllIIlllIIllIllI.IlIlIlIlIlllllllllIl("suffix." + this.llllIIIIlIIIlIlllIll(), "");
    }
    
    @Override
    public String IlIlIIIllIllIIIIIllI(final String s) {
        final String lowerCase = s.toLowerCase();
        return (!lowerCase.equals("false") && !lowerCase.equals("off")) ? "˜a" : "˜c";
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final String s) {
        final Matcher matcher = IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl.matcher(s);
        return matcher.matches() && matcher.group(1).matches(this.llllIIIIlIIIlIlllIll());
    }
    
    public static IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll(final String s, String ilIIIlIlIIIllIlIlIIl) {
        final Matcher matcher = IIIlIIIlIlIIlllIIlll.IlIIIlIlIIIllIlIlIIl.matcher(s);
        if (!matcher.matches()) {
            return null;
        }
        final String group = matcher.group(1);
        final String group2 = matcher.group(2);
        String s2 = matcher.group(3);
        final String ilIIIlIlIIIllIlIlIIl2 = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s2, "[", "]");
        if (ilIIIlIlIIIllIlIlIIl2 != null && ilIIIlIlIIIllIlIlIIl2.length() > 0) {
            s2 = s2.replace(ilIIIlIlIIIllIlIlIIl2, "").trim();
        }
        final String[] ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(group2, ilIIIlIlIIIllIlIlIIl2);
        if (group != null && group.length() > 0) {
            ilIIIlIlIIIllIlIlIIl = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl, "/shaders/");
            return new IIIlIIIlIlIIlllIIlll(group, s2, group2, ilIlIlIlIlllllllllIl, ilIIIlIlIIIllIlIlIIl);
        }
        return null;
    }
    
    public static String[] IlIlIlIlIlllllllllIl(final String s, String s2) {
        final String[] array = { s };
        if (s2 == null) {
            return array;
        }
        s2 = s2.trim();
        s2 = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(s2, "[");
        s2 = IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(s2, "]");
        s2 = s2.trim();
        if (s2.length() <= 0) {
            return array;
        }
        String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, " ");
        if (llllIIIIlIIIlIlllIll.length <= 0) {
            return array;
        }
        if (!Arrays.asList(llllIIIIlIIIlIlllIll).contains(s)) {
            llllIIIIlIIIlIlllIll = (String[])net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, s, 0);
        }
        return llllIIIIlIIIlIlllIll;
    }
}
