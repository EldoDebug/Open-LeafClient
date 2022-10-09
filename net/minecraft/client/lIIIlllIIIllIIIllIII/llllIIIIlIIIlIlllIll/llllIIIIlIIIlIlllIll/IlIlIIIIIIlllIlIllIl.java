package net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import org.apache.logging.log4j.*;
import com.google.gson.*;
import java.lang.reflect.*;
import java.io.*;
import java.util.*;

public class IlIlIIIIIIlllIlIllIl
{
    private static final Logger IllIIlllIIIIlllIIlIl;
    static final Gson llllIIIIlIIIlIlllIll;
    private final List llllIIIlIlllIlIIIIIl;
    private final boolean lIIIIlIIIIIlllIllIII;
    private final boolean lIIIlllIIIllIIIllIII;
    private llIllIlIIIIllIlIIllI llIIlIIIlIIIllIlIIIl;
    public String IlIlIlIlIlllllllllIl;
    protected final Map llIllIIIIIllIlIIIIlI;
    protected IlIlIIIIIIlllIlIllIl IlIIIlIlIIIllIlIlIIl;
    protected lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI;
    
    static {
        IllIIlllIIIIlllIIlIl = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new GsonBuilder().registerTypeAdapter((Type)IlIlIIIIIIlllIlIllIl.class, (Object)new IIIlIIIlIlIIlllIIlll()).registerTypeAdapter((Type)IlIIIlIlIIIllIlIlIIl.class, (Object)new IlIlIIIllIllIIIIIllI()).registerTypeAdapter((Type)IllIIlllIIIIlllIIlIl.class, (Object)new llllIIIlIlllIlIIIIIl()).registerTypeAdapter((Type)IlIlIlIlIlllllllllIl.class, (Object)new llIllIIIIIllIlIIIIlI()).registerTypeAdapter((Type)IIlllIIlIllIllIlIIll.class, (Object)new lllIIIIlllllIlIIllIl()).registerTypeAdapter((Type)llIllIlIIIIllIlIIllI.class, (Object)new lIlIlIIIllIIllIIIllI()).create();
    }
    
    public static IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll(final Reader reader) {
        return (IlIlIIIIIIlllIlIllIl)IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.fromJson(reader, (Class)IlIlIIIIIIlllIlIllIl.class);
    }
    
    public static IlIlIIIIIIlllIlIllIl llllIIIIlIIIlIlllIll(final String s) {
        return llllIIIIlIIIlIlllIll(new StringReader(s));
    }
    
    protected IlIlIIIIIIlllIlIllIl(final List list, final Map map, final boolean b, final boolean b2, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this(null, list, map, b, b2, llIllIlIIIIllIlIIllI);
    }
    
    protected IlIlIIIIIIlllIlIllIl(final lIllllIllIllIIllllll lIllllIllIllIIllllll, final Map map, final boolean b, final boolean b2, final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI) {
        this(lIllllIllIllIIllllll, Collections.emptyList(), map, b, b2, llIllIlIIIIllIlIIllI);
    }
    
    private IlIlIIIIIIlllIlIllIl(final lIllllIllIllIIllllll ilIlIIIllIllIIIIIllI, final List llllIIIlIlllIlIIIIIl, final Map llIllIIIIIllIlIIIIlI, final boolean liiIlllIIIllIIIllIII, final boolean liiiIlIIIIIlllIllIII, final llIllIlIIIIllIlIIllI llIIlIIIlIIIllIlIIIl) {
        this.IlIlIlIlIlllllllllIl = "";
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public List llllIIIIlIIIlIlllIll() {
        return this.lIIIIlIIIIIlllIllIII() ? this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() : this.llllIIIlIlllIlIIIIIl;
    }
    
    private boolean lIIIIlIIIIIlllIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl != null;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.lIIIIlIIIIIlllIllIII() ? this.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() : this.lIIIlllIIIllIIIllIII;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIIIllIllIIIIIllI == null || (this.IlIIIlIlIIIllIlIlIIl != null && this.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl());
    }
    
    public void llllIIIIlIIIlIlllIll(final Map map) {
        if (this.IlIlIIIllIllIIIIIllI != null) {
            this.IlIIIlIlIIIllIlIlIIl = map.get(this.IlIlIIIllIllIIIIIllI);
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final String s) {
        return !"missingno".equals(this.llIllIIIIIllIlIIIIlI(s));
    }
    
    public String llIllIIIIIllIlIIIIlI(String string) {
        if (!this.IlIIIlIlIIIllIlIlIIl(string)) {
            string = String.valueOf('#') + string;
        }
        return this.llllIIIIlIIIlIlllIll(string, new IIllIIllIIIlIlIIIIlI(this, null));
    }
    
    private String llllIIIIlIIIlIlllIll(final String s, final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI) {
        if (!this.IlIIIlIlIIIllIlIlIIl(s)) {
            return s;
        }
        if (this == illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl) {
            IlIlIIIIIIlllIlIllIl.IllIIlllIIIIlllIIlIl.warn("Unable to resolve texture due to upward reference: " + s + " in " + this.IlIlIlIlIlllllllllIl);
            return "missingno";
        }
        String s2 = this.llIllIIIIIllIlIIIIlI.get(s.substring(1));
        if (s2 == null && this.lIIIIlIIIIIlllIllIII()) {
            s2 = this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(s, illIIllIIIlIlIIIIlI);
        }
        illIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl = this;
        if (s2 != null && this.IlIIIlIlIIIllIlIlIIl(s2)) {
            s2 = illIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(s2, illIIllIIIlIlIIIIlI);
        }
        return (s2 != null && !this.IlIIIlIlIIIllIlIlIIl(s2)) ? s2 : "missingno";
    }
    
    private boolean IlIIIlIlIIIllIlIlIIl(final String s) {
        return s.charAt(0) == '#';
    }
    
    public lIllllIllIllIIllllll IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public IlIlIIIIIIlllIlIllIl IllIIlllIIIIlllIIlIl() {
        return this.lIIIIlIIIIIlllIllIII() ? this.IlIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl() : this;
    }
    
    public llIllIlIIIIllIlIIllI llllIIIlIlllIlIIIIIl() {
        return new llIllIlIIIIllIlIIllI(this.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl), this.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI), this.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl), this.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IlIlIIIllIllIIIIIllI), this.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl), this.llllIIIIlIIIlIlllIll(IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl));
    }
    
    private IIlllIIlIllIllIlIIll llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return (this.IlIIIlIlIIIllIlIlIIl != null && !this.llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI(ilIlIIIllIIllIlllllI)) ? this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI) : this.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl(ilIlIIIllIIllIlllllI);
    }
    
    public static void IlIlIlIlIlllllllllIl(final Map map) {
        for (final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl : map.values()) {
            try {
                for (IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl2 = ilIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl, ilIlIIIIIIlllIlIllIl3 = ilIlIIIIIIlllIlIllIl2.IlIIIlIlIIIllIlIlIIl; ilIlIIIIIIlllIlIllIl2 != ilIlIIIIIIlllIlIllIl3; ilIlIIIIIIlllIlIllIl2 = ilIlIIIIIIlllIlIllIl2.IlIIIlIlIIIllIlIlIIl, ilIlIIIIIIlllIlIllIl3 = ilIlIIIIIIlllIlIllIl3.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl) {}
                throw new IlIlIIIlIIlIlIIlllIl();
            }
            catch (NullPointerException ex) {}
        }
    }
}
