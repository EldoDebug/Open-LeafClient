package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.concurrent.*;
import java.util.*;
import com.google.common.collect.*;
import net.optifine.util.*;

public class IIIlIIlIIIIlllIlllII extends AbstractSet
{
    private static final Set IlIlIlIlIlllllllllIl;
    private final Map llIllIIIIIllIlIIIIlI;
    private final Set IlIIIlIlIIIllIlIlIIl;
    private final Class IlIlIIIllIllIIIIIllI;
    private final List IllIIlllIIIIlllIIlIl;
    public boolean llllIIIIlIIIlIlllIll;
    
    static {
        IlIlIlIlIlllllllllIl = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
    }
    
    public IIIlIIlIIIIlllIlllII(final Class ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        this.IlIIIlIlIIIllIlIlIIl = Sets.newIdentityHashSet();
        this.IllIIlllIIIIlllIIlIl = Lists.newArrayList();
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IlIIIlIlIIIllIlIlIIl.add(ilIlIIIllIllIIIIIllI);
        this.llIllIIIIIllIlIIIIlI.put(ilIlIIIllIllIIIIIllI, this.IllIIlllIIIIlllIIlIl);
        final Iterator<Class> iterator = IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.iterator();
        while (iterator.hasNext()) {
            this.llllIIIIlIIIlIlllIll(iterator.next());
        }
        this.llllIIIIlIIIlIlllIll = (this.IllIIlllIIIIlllIIlIl.size() == 0);
    }
    
    protected void llllIIIIlIIIlIlllIll(final Class clazz) {
        IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.add(clazz);
        for (int size = this.IllIIlllIIIIlllIIlIl.size(), i = 0; i < size; ++i) {
            final Object value = this.IllIIlllIIIIlllIIlIl.get(i);
            if (clazz.isAssignableFrom(value.getClass())) {
                this.llllIIIIlIIIlIlllIll(value, clazz);
            }
        }
        this.IlIIIlIlIIIllIlIlIIl.add(clazz);
    }
    
    protected Class IlIlIlIlIlllllllllIl(final Class clazz) {
        if (this.IlIlIIIllIllIIIIIllI.isAssignableFrom(clazz)) {
            if (!this.IlIIIlIlIIIllIlIlIIl.contains(clazz)) {
                this.llllIIIIlIIIlIlllIll(clazz);
            }
            return clazz;
        }
        throw new IllegalArgumentException("Don't know how to search for " + clazz);
    }
    
    @Override
    public boolean add(final Object o) {
        for (final Class clazz : this.IlIIIlIlIIIllIlIlIIl) {
            if (clazz.isAssignableFrom(o.getClass())) {
                this.llllIIIIlIIIlIlllIll(o, clazz);
            }
        }
        this.llllIIIIlIIIlIlllIll = (this.IllIIlllIIIIlllIIlIl.size() == 0);
        return true;
    }
    
    private void llllIIIIlIIIlIlllIll(final Object o, final Class clazz) {
        final List<Object> list = this.llIllIIIIIllIlIIIIlI.get(clazz);
        if (list == null) {
            this.llIllIIIIIllIlIIIIlI.put(clazz, Lists.newArrayList(new Object[] { o }));
        }
        else {
            list.add(o);
        }
        this.llllIIIIlIIIlIlllIll = (this.IllIIlllIIIIlllIIlIl.size() == 0);
    }
    
    @Override
    public boolean remove(final Object o) {
        boolean b = false;
        for (final Class clazz : this.IlIIIlIlIIIllIlIlIIl) {
            if (clazz.isAssignableFrom(o.getClass())) {
                final List list = this.llIllIIIIIllIlIIIIlI.get(clazz);
                if (list == null || !list.remove(o)) {
                    continue;
                }
                b = true;
            }
        }
        this.llllIIIIlIIIlIlllIll = (this.IllIIlllIIIIlllIIlIl.size() == 0);
        return b;
    }
    
    @Override
    public boolean contains(final Object o) {
        return Iterators.contains((Iterator)this.llIllIIIIIllIlIIIIlI(o.getClass()).iterator(), o);
    }
    
    public Iterable llIllIIIIIllIlIIIIlI(final Class clazz) {
        return new IlIlIllllllllIIIIlII(this, clazz);
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)(this.IllIIlllIIIIlllIIlIl.isEmpty() ? Iterators.emptyIterator() : llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl));
    }
    
    @Override
    public int size() {
        return this.IllIIlllIIIIlllIIlIl.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
