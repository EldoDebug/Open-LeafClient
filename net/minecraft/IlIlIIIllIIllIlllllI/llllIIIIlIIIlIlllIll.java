package net.minecraft.IlIlIIIllIIllIlllllI;

import java.util.*;
import com.google.common.collect.*;
import org.apache.logging.log4j.*;

public enum llllIIIIlIIIlIlllIll
{
    llllIIIIlIIIlIlllIll("HANDSHAKING", 0, -1), 
    IlIlIlIlIlllllllllIl("PLAY", 1, 0), 
    llIllIIIIIllIlIIIIlI("STATUS", 2, 1), 
    IlIIIlIlIIIllIlIlIIl("LOGIN", 3, 2);
    
    private static int IlIlIIIllIllIIIIIllI;
    private static int IllIIlllIIIIlllIIlIl;
    private static final llllIIIIlIIIlIlllIll[] llllIIIlIlllIlIIIIIl;
    private static final Map lIIIIlIIIIIlllIllIII;
    private final int lIIIlllIIIllIIIllIII;
    private final Map llIIlIIIlIIIllIlIIIl;
    
    static {
        llIllIlIIIIllIlIIllI = new llllIIIIlIIIlIlllIll[] { llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl };
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI = -1;
        llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl = 2;
        llllIIIlIlllIlIIIIIl = new llllIIIIlIIIlIlllIll[llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl - llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI + 1];
        lIIIIlIIIIIlllIllIII = Maps.newHashMap();
        llllIIIIlIIIlIlllIll[] values;
        for (int length = (values = values()).length, i = 0; i < length; ++i) {
            final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = values[i];
            final int llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll3 < llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI || llllIIIIlIIIlIlllIll3 > llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) {
                throw new Error("Invalid protocol ID " + Integer.toString(llllIIIIlIIIlIlllIll3));
            }
            llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl[llllIIIIlIIIlIlllIll3 - llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI] = llllIIIIlIIIlIlllIll2;
            final Iterator<IllIIlllIIIIlllIIlIl> iterator = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl.keySet().iterator();
            while (iterator.hasNext()) {
                for (final Class clazz : llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl.get(iterator.next()).values()) {
                    if (llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.containsKey(clazz) && llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.get(clazz) != llllIIIIlIIIlIlllIll2) {
                        throw new Error("Packet " + clazz + " is already assigned to protocol " + llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.get(clazz) + " - can't reassign to " + llllIIIIlIIIlIlllIll2);
                    }
                    try {
                        clazz.newInstance();
                    }
                    catch (Throwable t) {
                        throw new Error("Packet " + clazz + " fails instantiation checks! " + clazz);
                    }
                    llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.put(clazz, llllIIIIlIIIlIlllIll2);
                }
            }
        }
    }
    
    private llllIIIIlIIIlIlllIll(final String s, final int n, final int liiIlllIIIllIIIllIII) {
        this.llIIlIIIlIIIllIlIIIl = Maps.newEnumMap((Class)IllIIlllIIIIlllIIlIl.class);
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    protected llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final Class clazz) {
        Object create = this.llIIlIIIlIIIllIlIIIl.get(illIIlllIIIIlllIIlIl);
        if (create == null) {
            create = HashBiMap.create();
            this.llIIlIIIlIIIllIlIIIl.put(illIIlllIIIIlllIIlIl, create);
        }
        if (((BiMap)create).containsValue((Object)clazz)) {
            final String string = illIIlllIIIIlllIIlIl + " packet " + clazz + " is already known to ID " + ((BiMap)create).inverse().get((Object)clazz);
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        ((BiMap)create).put((Object)((BiMap)create).size(), (Object)clazz);
        return this;
    }
    
    public Integer llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        return (Integer)this.llIIlIIIlIIIllIlIIIl.get(illIIlllIIIIlllIIlIl).inverse().get((Object)ilIIIIIllIlIIIlIIll.getClass());
    }
    
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
        final Class clazz = (Class)this.llIIlIIIlIIIllIlIIIl.get(illIIlllIIIIlllIIlIl).get((Object)n);
        return (clazz == null) ? null : clazz.newInstance();
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final int n) {
        return (n >= llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI && n <= llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) ? llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl[n - llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI] : null;
    }
    
    public static llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IIlIIIIIllIlIIIlIIll ilIIIIIllIlIIIlIIll) {
        return llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.get(ilIIIIIllIlIIIlIIll.getClass());
    }
}
