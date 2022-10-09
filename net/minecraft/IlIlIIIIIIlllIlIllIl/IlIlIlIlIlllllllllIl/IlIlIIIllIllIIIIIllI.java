package net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import java.util.*;

public class IlIlIIIllIllIIIIIllI implements Map
{
    private final Map llllIIIIlIIIlIlllIll;
    
    public IlIlIIIllIllIIIIIllI() {
        this.llllIIIIlIIIlIlllIll = Maps.newLinkedHashMap();
    }
    
    @Override
    public int size() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.llllIIIIlIIIlIlllIll.isEmpty();
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.llllIIIIlIIIlIlllIll.containsKey(o.toString().toLowerCase());
    }
    
    @Override
    public boolean containsValue(final Object o) {
        return this.llllIIIIlIIIlIlllIll.containsKey(o);
    }
    
    @Override
    public Object get(final Object o) {
        return this.llllIIIIlIIIlIlllIll.get(o.toString().toLowerCase());
    }
    
    public Object llllIIIIlIIIlIlllIll(final String s, final Object o) {
        return this.llllIIIIlIIIlIlllIll.put(s.toLowerCase(), o);
    }
    
    @Override
    public Object remove(final Object o) {
        return this.llllIIIIlIIIlIlllIll.remove(o.toString().toLowerCase());
    }
    
    @Override
    public void putAll(final Map map) {
        for (final Entry<String, V> entry : map.entrySet()) {
            this.llllIIIIlIIIlIlllIll(entry.getKey(), entry.getValue());
        }
    }
    
    @Override
    public void clear() {
        this.llllIIIIlIIIlIlllIll.clear();
    }
    
    @Override
    public Set keySet() {
        return this.llllIIIIlIIIlIlllIll.keySet();
    }
    
    @Override
    public Collection values() {
        return this.llllIIIIlIIIlIlllIll.values();
    }
    
    @Override
    public Set entrySet() {
        return this.llllIIIIlIIIlIlllIll.entrySet();
    }
}
