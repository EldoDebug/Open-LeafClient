package net.minecraft.client.llIIlIIIlIIIllIlIIIl;

import org.apache.logging.log4j.*;
import net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll.*;
import java.io.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.collect.*;

public class IIlllIIlIllIllIlIIll implements IIIIlllIIIIIIlIIIlll
{
    private static final Logger IlIlIlIlIlllllllllIl;
    private final lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI;
    private String IlIIIlIlIIIllIlIlIIl;
    protected static final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    private Map IlIlIIIllIllIIIIIllI;
    
    static {
        IlIlIlIlIlllllllllIl = LogManager.getLogger();
        llllIIIIlIIIlIlllIll = new lllIIIIlllllIlIIllIl();
    }
    
    public IIlllIIlIllIllIlIIll(final lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI, final String ilIIIlIlIIIllIlIlIIl) {
        this.IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll);
    }
    
    public void llllIIIIlIIIlIlllIll(final List list) {
        this.IlIlIIIllIllIIIIIllI.clear();
        for (final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll : list) {
            try {
                final llIllIlIIIIllIlIIllI llIllIlIIIIllIlIIllI = (llIllIlIIIIllIlIIllI)llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI, "language");
                if (llIllIlIIIIllIlIIllI == null) {
                    continue;
                }
                for (final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII : llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll()) {
                    if (!this.IlIlIIIllIllIIIIIllI.containsKey(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll())) {
                        this.IlIlIIIllIllIIIIIllI.put(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(), ilIllIlIlIIIlIlIlIII);
                    }
                }
            }
            catch (RuntimeException ex) {
                IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.warn("Unable to parse metadata section of resourcepack: " + llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), (Throwable)ex);
            }
            catch (IOException ex2) {
                IIlllIIlIllIllIlIIll.IlIlIlIlIlllllllllIl.warn("Unable to parse metadata section of resourcepack: " + llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl(), (Throwable)ex2);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final ArrayList arrayList = Lists.newArrayList((Object[])new String[] { "en_US" });
        if (!"en_US".equals(this.IlIIIlIlIIIllIlIlIIl)) {
            arrayList.add(this.IlIIIlIlIIIllIlIlIIl);
        }
        IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, arrayList);
        lIllIIlIlIlllllIIIII.llllIIIIlIIIlIlllIll(IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.llIllIIIIIllIlIIIIlI() != null && this.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII) {
        this.IlIIIlIlIIIllIlIlIIl = ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll();
    }
    
    public IlIllIlIlIIIlIlIlIII llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI.containsKey(this.IlIIIlIlIIIllIlIlIIl) ? this.IlIlIIIllIllIIIIIllI.get(this.IlIIIlIlIIIllIlIlIIl) : this.IlIlIIIllIllIIIIIllI.get("en_US");
    }
    
    public SortedSet IlIIIlIlIIIllIlIlIIl() {
        return Sets.newTreeSet((Iterable)this.IlIlIIIllIllIIIIIllI.values());
    }
}
