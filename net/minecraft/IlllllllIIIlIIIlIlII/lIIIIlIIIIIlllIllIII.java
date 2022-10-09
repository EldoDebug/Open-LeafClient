package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.base.*;
import com.google.common.collect.*;
import java.util.*;
import java.lang.reflect.*;

public class lIIIIlIIIIIlllIllIII
{
    public static Iterable llllIIIIlIIIlIlllIll(final Class clazz, final Iterable iterable) {
        return new llIIlIIIlIIIllIlIIIl(clazz, (Iterable[])IlIlIlIlIlllllllllIl(Iterable.class, iterable), null);
    }
    
    public static Iterable llllIIIIlIIIlIlllIll(final Iterable iterable) {
        return IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll(Object.class, iterable));
    }
    
    private static Iterable IlIlIlIlIlllllllllIl(final Iterable iterable) {
        return Iterables.transform(iterable, (Function)new lIIIlllIIIllIIIllIII(null));
    }
    
    private static Object[] IlIlIlIlIlllllllllIl(final Class clazz, final Iterable iterable) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Object> iterator = iterable.iterator();
        while (iterator.hasNext()) {
            arrayList.add(iterator.next());
        }
        return arrayList.toArray(IlIlIlIlIlllllllllIl(clazz, arrayList.size()));
    }
    
    private static Object[] IlIlIlIlIlllllllllIl(final Class clazz, final int n) {
        return (Object[])Array.newInstance(clazz, n);
    }
}
