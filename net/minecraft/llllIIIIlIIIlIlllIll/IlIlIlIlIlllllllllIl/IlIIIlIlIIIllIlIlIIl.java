package net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.base.*;
import com.google.common.collect.*;

public class IlIIIlIlIIIllIlIlIIl extends IlIlIIIllIllIIIIIllI
{
    private final ImmutableSet llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    
    protected IlIIIlIlIIIllIlIlIIl(final String s, final Class clazz, final Collection collection) {
        super(s, clazz);
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llllIIIIlIIIlIlllIll = ImmutableSet.copyOf(collection);
        for (final Enum enum1 : collection) {
            final String llllIIIIlIIIlIlllIll = ((lIllIIIIIlllIIlIIllI)enum1).llllIIIIlIIIlIlllIll();
            if (this.IlIlIlIlIlllllllllIl.containsKey(llllIIIIlIIIlIlllIll)) {
                throw new IllegalArgumentException("Multiple values have the same name '" + llllIIIIlIIIlIlllIll + "'");
            }
            this.IlIlIlIlIlllllllllIl.put(llllIIIIlIIIlIlllIll, enum1);
        }
    }
    
    @Override
    public Collection IlIlIlIlIlllllllllIl() {
        return (Collection)this.llllIIIIlIIIlIlllIll;
    }
    
    public String llllIIIIlIIIlIlllIll(final Enum enum1) {
        return ((lIllIIIIIlllIIlIIllI)enum1).llllIIIIlIIIlIlllIll();
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s, final Class clazz) {
        return llllIIIIlIIIlIlllIll(s, clazz, Predicates.alwaysTrue());
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s, final Class clazz, final Predicate predicate) {
        return llllIIIIlIIIlIlllIll(s, clazz, Collections2.filter((Collection)Lists.newArrayList((Object[])clazz.getEnumConstants()), predicate));
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s, final Class clazz, final Enum... array) {
        return llllIIIIlIIIlIlllIll(s, clazz, Lists.newArrayList((Object[])array));
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final String s, final Class clazz, final Collection collection) {
        return new IlIIIlIlIIIllIlIlIIl(s, clazz, collection);
    }
}
