package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import com.google.common.collect.*;
import java.util.*;

class IlIlIIIllIllIIIIIllI extends IllIIlllIIIIlllIIlIl
{
    private final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private final ImmutableMap IlIlIlIlIlllllllllIl;
    private ImmutableTable llIllIIIIIllIlIIIIlI;
    
    private IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final ImmutableMap ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public Collection llllIIIIlIIIlIlllIll() {
        return Collections.unmodifiableCollection((Collection<?>)this.IlIlIlIlIlllllllllIl.keySet());
    }
    
    @Override
    public Comparable llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlIlIlIlIlllllllllIl.containsKey((Object)llllIIIIlIIIlIlllIll)) {
            throw new IllegalArgumentException("Cannot get property " + llllIIIIlIIIlIlllIll + " as it does not exist in " + this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl());
        }
        return llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().cast(this.IlIlIlIlIlllllllllIl.get((Object)llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final Comparable comparable) {
        if (!this.IlIlIlIlIlllllllllIl.containsKey((Object)llllIIIIlIIIlIlllIll)) {
            throw new IllegalArgumentException("Cannot set property " + llllIIIIlIIIlIlllIll + " as it does not exist in " + this.llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl());
        }
        if (!llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().contains(comparable)) {
            throw new IllegalArgumentException("Cannot set property " + llllIIIIlIIIlIlllIll + " to " + comparable + " on block " + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll) + ", it is not an allowed value");
        }
        return (this.IlIlIlIlIlllllllllIl.get((Object)llllIIIIlIIIlIlllIll) == comparable) ? this : ((llIIlIIIlIIIllIlIIIl)this.llIllIIIIIllIlIIIIlI.get((Object)llllIIIIlIIIlIlllIll, (Object)comparable));
    }
    
    @Override
    public ImmutableMap IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o;
    }
    
    @Override
    public int hashCode() {
        return this.IlIlIlIlIlllllllllIl.hashCode();
    }
    
    public void llllIIIIlIIIlIlllIll(final Map map) {
        if (this.llIllIIIIIllIlIIIIlI != null) {
            throw new IllegalStateException();
        }
        final HashBasedTable create = HashBasedTable.create();
        for (final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : this.IlIlIlIlIlllllllllIl.keySet()) {
            for (final Comparable comparable : llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()) {
                if (comparable != this.IlIlIlIlIlllllllllIl.get((Object)llllIIIIlIIIlIlllIll)) {
                    ((Table)create).put((Object)llllIIIIlIIIlIlllIll, (Object)comparable, (Object)map.get(this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, comparable)));
                }
            }
        }
        this.llIllIIIIIllIlIIIIlI = ImmutableTable.copyOf((Table)create);
    }
    
    private Map IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final Comparable comparable) {
        final HashMap hashMap = Maps.newHashMap((Map)this.IlIlIlIlIlllllllllIl);
        hashMap.put(llllIIIIlIIIlIlllIll, comparable);
        return hashMap;
    }
}
