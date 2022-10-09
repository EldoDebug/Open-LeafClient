package net.minecraft.IlIllIlIlIIIlIlIlIII;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.optifine.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import java.util.*;

public class IlIIIlIlIIIllIlIlIIl
{
    private static final Logger llIllIIIIIllIlIIIIlI;
    private final List IlIIIlIlIIIllIlIlIIl;
    private final List IlIlIIIllIllIIIIIllI;
    public boolean llllIIIIlIIIlIlllIll;
    private String IllIIlllIIIIlllIIlIl;
    private final Map llllIIIlIlllIlIIIIIl;
    public boolean IlIlIlIlIlllllllllIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private static final String lIIIlllIIIllIIIllIII = "scheduledExecutables";
    private static final String llIIlIIIlIIIllIlIIIl = "tick";
    private static final String llIllIlIIIIllIlIIllI = "preRenderErrors";
    private static final String lIlIlIIIllIIllIIIllI = "render";
    private static final String IlIlIIIllIIllIlllllI = "display";
    private static final int IIIIlllIIIIIIlIIIlll;
    private static final int llllIIllllIlIlIIIIll;
    private static final int IlIllIlIlIIIlIlIlIII;
    private static final int IIlllIIlIllIllIlIIll;
    private static final int lllIIIIlllllIlIIllIl;
    
    static {
        llIllIIIIIllIlIIIIlI = LogManager.getLogger();
        IIIIlllIIIIIIlIIIlll = "scheduledExecutables".hashCode();
        llllIIllllIlIlIIIIll = "tick".hashCode();
        IlIllIlIlIIIlIlIlIII = "preRenderErrors".hashCode();
        IIlllIIlIllIllIlIIll = "render".hashCode();
        lllIIIIlllllIlIIllIl = "display".hashCode();
    }
    
    public IlIIIlIlIIIllIlIlIIl() {
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = Lists.newArrayList();
        this.IllIIlllIIIIlllIIlIl = "";
        this.llllIIIlIlllIlIIIIIl = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl = true;
        this.lIIIIlIIIIIlllIllIII = this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIlIlllIlIIIIIl.clear();
        this.IllIIlllIIIIlllIIlIl = "";
        this.IlIIIlIlIIIllIlIlIIl.clear();
        this.lIIIIlIIIIIlllIllIII = this.IlIlIlIlIlllllllllIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final String s) {
        if (IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl()) {
            final int hashCode = s.hashCode();
            if (hashCode == net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.IIIIlllIIIIIIlIIIlll && s.equals("scheduledExecutables")) {
                IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
            }
            else if (hashCode == net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.llllIIllllIlIlIIIIll && s.equals("tick") && net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll()) {
                IllIllIlllIllllIIllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
                IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            }
            else if (hashCode == net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.IlIllIlIlIIIlIlIlIII && s.equals("preRenderErrors")) {
                IllIllIlllIllllIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
            }
        }
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI()) {
            final int hashCode2 = s.hashCode();
            if (hashCode2 == net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.IIlllIIlIllIllIlIIll && s.equals("render")) {
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll = false;
            }
            else if (hashCode2 == net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.lllIIIIlllllIlIIllIl && s.equals("display")) {
                lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll = true;
            }
        }
        if (this.lIIIIlIIIIIlllIllIII && this.llllIIIIlIIIlIlllIll) {
            if (this.IllIIlllIIIIlllIIlIl.length() > 0) {
                this.IllIIlllIIIIlllIIlIl = String.valueOf(this.IllIIlllIIIIlllIIlIl) + ".";
            }
            this.IllIIlllIIIIlllIIlIl = String.valueOf(this.IllIIlllIIIIlllIIlIl) + s;
            this.IlIIIlIlIIIllIlIlIIl.add(this.IllIIlllIIIIlllIIlIl);
            this.IlIlIIIllIllIIIIIllI.add(System.nanoTime());
        }
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.lIIIIlIIIIIlllIllIII && this.llllIIIIlIIIlIlllIll) {
            final long nanoTime = System.nanoTime();
            final long longValue = this.IlIlIIIllIllIIIIIllI.remove(this.IlIlIIIllIllIIIIIllI.size() - 1);
            this.IlIIIlIlIIIllIlIlIIl.remove(this.IlIIIlIlIIIllIlIlIIl.size() - 1);
            final long n = nanoTime - longValue;
            if (this.llllIIIlIlllIlIIIIIl.containsKey(this.IllIIlllIIIIlllIIlIl)) {
                this.llllIIIlIlllIlIIIIIl.put(this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl.get(this.IllIIlllIIIIlllIIlIl) + n);
            }
            else {
                this.llllIIIlIlllIlIIIIIl.put(this.IllIIlllIIIIlllIIlIl, n);
            }
            if (n > 100000000L) {
                net.minecraft.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.warn("Something's taking too long! '" + this.IllIIlllIIIIlllIIlIl + "' took aprox " + n / 1000000.0 + " ms");
            }
            this.IllIIlllIIIIlllIIlIl = (this.IlIIIlIlIIIllIlIlIIl.isEmpty() ? "" : this.IlIIIlIlIIIllIlIlIIl.get(this.IlIIIlIlIIIllIlIlIIl.size() - 1));
        }
    }
    
    public List IlIlIlIlIlllllllllIl(String string) {
        if (!this.llllIIIIlIIIlIlllIll) {
            return null;
        }
        long n = this.llllIIIlIlllIlIIIIIl.containsKey("root") ? this.llllIIIlIlllIlIIIIIl.get("root") : 0L;
        final long n2 = this.llllIIIlIlllIlIIIIIl.containsKey(string) ? this.llllIIIlIlllIlIIIIIl.get(string) : -1L;
        final ArrayList arrayList = Lists.newArrayList();
        if (string.length() > 0) {
            string = String.valueOf(string) + ".";
        }
        long n3 = 0L;
        for (final String s : this.llllIIIlIlllIlIIIIIl.keySet()) {
            if (s.length() > string.length() && s.startsWith(string) && s.indexOf(".", string.length() + 1) < 0) {
                n3 += (long)this.llllIIIlIlllIlIIIIIl.get(s);
            }
        }
        final float n4 = (float)n3;
        if (n3 < n2) {
            n3 = n2;
        }
        if (n < n3) {
            n = n3;
        }
        for (final String s2 : this.llllIIIlIlllIlIIIIIl.keySet()) {
            if (s2.length() > string.length() && s2.startsWith(string) && s2.indexOf(".", string.length() + 1) < 0) {
                final long longValue = this.llllIIIlIlllIlIIIIIl.get(s2);
                arrayList.add(new IlIlIIIllIllIIIIIllI(s2.substring(string.length()), longValue * 100.0 / n3, longValue * 100.0 / n));
            }
        }
        for (final String s3 : this.llllIIIlIlllIlIIIIIl.keySet()) {
            this.llllIIIlIlllIlIIIIIl.put(s3, (long)this.llllIIIlIlllIlIIIIIl.get(s3) * 950L / 1000L);
        }
        if (n3 > n4) {
            arrayList.add(new IlIlIIIllIllIIIIIllI("unspecified", (n3 - n4) * 100.0 / n3, (n3 - n4) * 100.0 / n));
        }
        Collections.sort((List<Comparable>)arrayList);
        arrayList.add(0, new IlIlIIIllIllIIIIIllI(string, 100.0, n3 * 100.0 / n));
        return arrayList;
    }
    
    public void llIllIIIIIllIlIIIIlI(final String s) {
        if (this.lIIIIlIIIIIlllIllIII) {
            this.IlIlIlIlIlllllllllIl();
            this.llllIIIIlIIIlIlllIll(s);
        }
    }
    
    public String llIllIIIIIllIlIIIIlI() {
        return (this.IlIIIlIlIIIllIlIlIIl.size() == 0) ? "[UNKNOWN]" : this.IlIIIlIlIIIllIlIlIIl.get(this.IlIIIlIlIIIllIlIlIIl.size() - 1);
    }
    
    public void llllIIIIlIIIlIlllIll(final Class clazz) {
        if (this.llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(clazz.getSimpleName());
        }
    }
}
