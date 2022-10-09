package net.optifine.llllIIIIlIIIlIlllIll;

import java.util.regex.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import org.apache.commons.lang3.*;
import java.util.*;
import net.optifine.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class lIlIlIIIllIIllIIIllI
{
    private String[] llllIIIIlIIIlIlllIll;
    private String IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private String IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private static final int llllIIIlIlllIlIIIIIl = 0;
    private static final int lIIIIlIIIIIlllIllIII = 1;
    private static final int lIIIlllIIIllIIIllIII = 2;
    private static final int llIIlIIIlIIIllIlIIIl = 3;
    private static final int llIllIlIIIIllIlIIllI = 4;
    private static final String lIlIlIIIllIIllIIIllI = "pattern:";
    private static final String IlIlIIIllIIllIlllllI = "ipattern:";
    private static final String IIIIlllIIIIIIlIIIlll = "regex:";
    private static final String llllIIllllIlIlIIIIll = "iregex:";
    private static final int IlIllIlIlIIIlIlIlIII = 0;
    private static final int IIlllIIlIllIllIlIIll = 1;
    private static final String lllIIIIlllllIlIIllIl = "#";
    private static final Pattern IlIlIIIIIIlllIlIllIl;
    
    static {
        IlIlIIIIIIlllIlIllIl = Pattern.compile("^#[0-9a-f]{6}+$");
    }
    
    public lIlIlIIIllIIllIIIllI(final String s, String ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = null;
        this.llIllIIIIIllIlIIIIlI = false;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.IlIlIIIllIllIIIIIllI = null;
        this.IllIIlllIIIIlllIIlIl = 0;
        final String[] llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, ".");
        this.llllIIIIlIIIlIlllIll = Arrays.copyOfRange(llllIIIIlIIIlIlllIll, 0, llllIIIIlIIIlIlllIll.length - 1);
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll.length - 1];
        if (ilIlIIIllIllIIIIIllI.startsWith("!")) {
            this.llIllIIIIIllIlIIIIlI = true;
            ilIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI.substring(1);
        }
        if (ilIlIIIllIllIIIIIllI.startsWith("pattern:")) {
            this.IlIIIlIlIIIllIlIlIIl = 1;
            ilIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI.substring("pattern:".length());
        }
        else if (ilIlIIIllIllIIIIIllI.startsWith("ipattern:")) {
            this.IlIIIlIlIIIllIlIlIIl = 2;
            ilIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI.substring("ipattern:".length()).toLowerCase();
        }
        else if (ilIlIIIllIllIIIIIllI.startsWith("regex:")) {
            this.IlIIIlIlIIIllIlIlIIl = 3;
            ilIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI.substring("regex:".length());
        }
        else if (ilIlIIIllIllIIIIIllI.startsWith("iregex:")) {
            this.IlIIIlIlIIIllIlIlIIl = 4;
            ilIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI.substring("iregex:".length()).toLowerCase();
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl = 0;
        }
        ilIlIIIllIllIIIIIllI = StringEscapeUtils.unescapeJava(ilIlIIIllIllIIIIIllI);
        if (this.IlIIIlIlIIIllIlIlIIl == 0 && net.optifine.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIlIIIIIIlllIlIllIl.matcher(ilIlIIIllIllIIIIIllI).matches()) {
            this.IllIIlllIIIIlllIIlIl = 1;
        }
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        return this.llIllIIIIIllIlIIIIlI ? (!this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll)) : this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    public boolean IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (iiiIlllIIIIIIlIIIlll == null) {
            return false;
        }
        llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll;
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll[i]);
            if (llllIIIIlIIIlIlllIll == null) {
                return false;
            }
        }
        if (this.IlIlIlIlIlllllllllIl.equals("*")) {
            return this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        }
        final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
        return llllIIIIlIIIlIlllIll2 != null && this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
    }
    
    private boolean IlIlIlIlIlllllllllIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        if (llllIIIlIlllIlIIIIIl instanceof IIIIlllIIIIIIlIIIlll) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = (IIIIlllIIIIIIlIIIlll)llllIIIlIlllIlIIIIIl;
            final Iterator iterator = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI().iterator();
            while (iterator.hasNext()) {
                if (this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(iterator.next()))) {
                    return true;
                }
            }
        }
        if (llllIIIlIlllIlIIIIIl instanceof IlIlIIIlIIlIlIIlllIl) {
            final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (IlIlIIIlIIlIlIIlllIl)llllIIIlIlllIlIIIIIl;
            for (int ilIlIIIllIllIIIIIllI = ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI(), i = 0; i < ilIlIIIllIllIIIIIllI; ++i) {
                if (this.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl(i))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private static llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final String s) {
        if (llllIIIlIlllIlIIIIIl instanceof IIIIlllIIIIIIlIIIlll) {
            return ((IIIIlllIIIIIIlIIIlll)llllIIIlIlllIlIIIIIl).llllIIIIlIIIlIlllIll(s);
        }
        if (!(llllIIIlIlllIlIIIIIl instanceof IlIlIIIlIIlIlIIlllIl)) {
            return null;
        }
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = (IlIlIIIlIIlIlIIlllIl)llllIIIlIlllIlIIIIIl;
        if (s.equals("count")) {
            return new IIllIIllIIIlIlIIIIlI(ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI());
        }
        final int llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s, -1);
        return (llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI()) ? ilIlIIIlIIlIlIIlllIl.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll) : null;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl) {
        return llllIIIlIlllIlIIIIIl != null && this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, this.IllIIlllIIIIlllIIlIl));
    }
    
    public boolean llllIIIIlIIIlIlllIll(final String s) {
        if (s == null) {
            return false;
        }
        switch (this.IlIIIlIlIIIllIlIlIIl) {
            case 0: {
                return s.equals(this.IlIlIIIllIllIIIIIllI);
            }
            case 1: {
                return this.llllIIIIlIIIlIlllIll(s, this.IlIlIIIllIllIIIIIllI);
            }
            case 2: {
                return this.llllIIIIlIIIlIlllIll(s.toLowerCase(), this.IlIlIIIllIllIIIIIllI);
            }
            case 3: {
                return this.IlIlIlIlIlllllllllIl(s, this.IlIlIIIllIllIIIIIllI);
            }
            case 4: {
                return this.IlIlIlIlIlllllllllIl(s.toLowerCase(), this.IlIlIIIllIllIIIIIllI);
            }
            default: {
                throw new IllegalArgumentException("Unknown NbtTagValue type: " + this.IlIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final String s, final String s2) {
        return IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(s, s2, '*', '?');
    }
    
    private boolean IlIlIlIlIlllllllllIl(final String s, final String s2) {
        return s.matches(s2);
    }
    
    private static String llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final int n) {
        if (llllIIIlIlllIlIIIIIl == null) {
            return null;
        }
        if (llllIIIlIlllIlIIIIIl instanceof IIIlIIlIIIIlllIlllII) {
            return ((IIIlIIlIIIIlllIlllII)llllIIIlIlllIlIIIIIl).IlIIIlIlIIIllIlIlIIl();
        }
        if (llllIIIlIlllIlIIIIIl instanceof IIllIIllIIIlIlIIIIlI) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = (IIllIIllIIIlIlIIIIlI)llllIIIlIlllIlIIIIIl;
            return (n == 1) ? ("#" + IIIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(Integer.toHexString(illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl()), 6, '0')) : Integer.toString(illIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl());
        }
        if (llllIIIlIlllIlIIIIIl instanceof net.minecraft.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI) {
            return Byte.toString(((net.minecraft.lIlIlIIIllIIllIIIllI.lIlIlIIIllIIllIIIllI)llllIIIlIlllIlIIIIIl).lIIIIlIIIIIlllIllIII());
        }
        if (llllIIIlIlllIlIIIIIl instanceof IIlIIIIlllIlllllIlII) {
            return Short.toString(((IIlIIIIlllIlllllIlII)llllIIIlIlllIlIIIIIl).llllIIIlIlllIlIIIIIl());
        }
        if (llllIIIlIlllIlIIIIIl instanceof IlllllllIIIlIIIlIlII) {
            return Long.toString(((IlllllllIIIlIIIlIlII)llllIIIlIlllIlIIIIIl).IlIlIIIllIllIIIIIllI());
        }
        if (llllIIIlIlllIlIIIIIl instanceof IlIlIIIIIIlllIlIllIl) {
            return Float.toString(((IlIlIIIIIIlllIlIllIl)llllIIIlIlllIlIIIIIl).llIIlIIIlIIIllIlIIIl());
        }
        if (llllIIIlIlllIlIIIIIl instanceof IIlllIIlIllIllIlIIll) {
            return Double.toString(((IIlllIIlIllIllIlIIll)llllIIIlIlllIlIIIIIl).lIIIlllIIIllIIIllIII());
        }
        return llllIIIlIlllIlIIIIIl.toString();
    }
    
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            final String s = this.llllIIIIlIIIlIlllIll[i];
            if (i > 0) {
                sb.append(".");
            }
            sb.append(s);
        }
        if (sb.length() > 0) {
            sb.append(".");
        }
        sb.append(this.IlIlIlIlIlllllllllIl);
        sb.append(" = ");
        sb.append(this.IlIlIIIllIllIIIIIllI);
        return sb.toString();
    }
}
