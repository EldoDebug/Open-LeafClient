package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;
import java.util.*;

public class IIllIIIlIIlIlIlIIIII
{
    public static Map llllIIIIlIIIlIlllIll(final Iterable iterable, final Iterable iterable2) {
        return llllIIIIlIIIlIlllIll(iterable, iterable2, Maps.newLinkedHashMap());
    }
    
    public static Map llllIIIIlIIIlIlllIll(final Iterable iterable, final Iterable iterable2, final Map map) {
        final Iterator<Object> iterator = iterable2.iterator();
        final Iterator<Object> iterator2 = iterable.iterator();
        while (iterator2.hasNext()) {
            map.put(iterator2.next(), iterator.next());
        }
        if (iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        return map;
    }
}
