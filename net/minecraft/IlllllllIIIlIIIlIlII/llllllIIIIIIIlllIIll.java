package net.minecraft.IlllllllIIIlIIIlIlII;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import org.apache.commons.lang3.*;
import java.util.*;

public class llllllIIIIIIIlllIIll implements IllIIlllllIIllIIllIl
{
    private static final Logger llllIIIIlIIIlIlllIll;
    protected final Map llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
    }
    
    public llllllIIIIIIIlllIIll() {
        this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll();
    }
    
    protected Map llllIIIIlIIIlIlllIll() {
        return Maps.newHashMap();
    }
    
    @Override
    public Object llllIIIIlIIIlIlllIll(final Object o) {
        return this.llIllIIIIIllIlIIIIlI.get(o);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final Object o, final Object o2) {
        Validate.notNull(o);
        Validate.notNull(o2);
        if (this.llIllIIIIIllIlIIIIlI.containsKey(o)) {
            llllllIIIIIIIlllIIll.llllIIIIlIIIlIlllIll.debug("Adding duplicate key '" + o + "' to registry");
        }
        this.llIllIIIIIllIlIIIIlI.put(o, o2);
    }
    
    public Set llIllIIIIIllIlIIIIlI() {
        return Collections.unmodifiableSet(this.llIllIIIIIllIlIIIIlI.keySet());
    }
    
    public boolean llIllIIIIIllIlIIIIlI(final Object o) {
        return this.llIllIIIIIllIlIIIIlI.containsKey(o);
    }
    
    @Override
    public Iterator iterator() {
        return this.llIllIIIIIllIlIIIIlI.values().iterator();
    }
}
