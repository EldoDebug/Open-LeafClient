package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;
import com.google.common.base.*;
import com.google.common.collect.*;

public class IlIllllIIlIllIlIlIll implements IlIIllIIllIIllIIlIIl
{
    private final IdentityHashMap llllIIIIlIIIlIlllIll;
    private final List IlIlIlIlIlllllllllIl;
    
    public IlIllllIIlIllIlIlIll() {
        this.llllIIIIlIIIlIlllIll = new IdentityHashMap(512);
        this.IlIlIlIlIlllllllllIl = Lists.newArrayList();
    }
    
    public void llllIIIIlIIIlIlllIll(final Object o, final int n) {
        this.llllIIIIlIIIlIlllIll.put(o, n);
        while (this.IlIlIlIlIlllllllllIl.size() <= n) {
            this.IlIlIlIlIlllllllllIl.add(null);
        }
        this.IlIlIlIlIlllllllllIl.set(n, o);
    }
    
    public int llllIIIIlIIIlIlllIll(final Object o) {
        final Integer n = this.llllIIIIlIIIlIlllIll.get(o);
        return (n == null) ? -1 : n;
    }
    
    public final Object llllIIIIlIIIlIlllIll(final int n) {
        return (n >= 0 && n < this.IlIlIlIlIlllllllllIl.size()) ? this.IlIlIlIlIlllllllllIl.get(n) : null;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)Iterators.filter((Iterator)this.IlIlIlIlIlllllllllIl.iterator(), Predicates.notNull());
    }
}
