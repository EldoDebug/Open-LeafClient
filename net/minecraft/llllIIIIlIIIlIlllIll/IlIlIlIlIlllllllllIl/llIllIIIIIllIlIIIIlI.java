package net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;

import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.base.*;
import com.google.common.collect.*;

public class llIllIIIIIllIlIIIIlI extends IlIIIlIlIIIllIlIlIIl
{
    protected llIllIIIIIllIlIIIIlI(final String s, final Collection collection) {
        super(s, lllIllIIIllllllIllll.class, collection);
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final String s) {
        return llllIIIIlIIIlIlllIll(s, Predicates.alwaysTrue());
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final String s, final Predicate predicate) {
        return llllIIIIlIIIlIlllIll(s, Collections2.filter((Collection)Lists.newArrayList((Object[])lllIllIIIllllllIllll.values()), predicate));
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final String s, final Collection collection) {
        return new llIllIIIIIllIlIIIIlI(s, collection);
    }
}
