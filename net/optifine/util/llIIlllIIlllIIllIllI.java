package net.optifine.util;

import java.util.*;

public class llIIlllIIlllIIllIllI extends Properties
{
    private Set llllIIIIlIIIlIlllIll;
    
    public llIIlllIIlllIIllIllI() {
        this.llllIIIIlIIIlIlllIll = new LinkedHashSet();
    }
    
    @Override
    public synchronized Object put(final Object o, final Object o2) {
        this.llllIIIIlIIIlIlllIll.add(o);
        return super.put(o, o2);
    }
    
    @Override
    public Set keySet() {
        this.llllIIIIlIIIlIlllIll.retainAll(super.keySet());
        return Collections.unmodifiableSet((Set<?>)this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public synchronized Enumeration keys() {
        return Collections.enumeration((Collection<Object>)this.keySet());
    }
}
