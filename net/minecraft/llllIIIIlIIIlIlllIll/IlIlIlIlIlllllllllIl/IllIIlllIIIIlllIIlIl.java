package net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl;

import com.google.common.collect.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl extends IlIlIIIllIllIIIIIllI
{
    private final ImmutableSet llllIIIIlIIIlIlllIll;
    
    protected IllIIlllIIIIlllIIlIl(final String s, final int n, final int n2) {
        super(s, Integer.class);
        if (n < 0) {
            throw new IllegalArgumentException("Min value of " + s + " must be 0 or greater");
        }
        if (n2 <= n) {
            throw new IllegalArgumentException("Max value of " + s + " must be greater than min (" + n + ")");
        }
        final HashSet hashSet = Sets.newHashSet();
        for (int i = n; i <= n2; ++i) {
            hashSet.add(i);
        }
        this.llllIIIIlIIIlIlllIll = ImmutableSet.copyOf((Collection)hashSet);
    }
    
    @Override
    public Collection IlIlIlIlIlllllllllIl() {
        return (Collection)this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && super.equals(o) && this.llllIIIIlIIIlIlllIll.equals((Object)((IllIIlllIIIIlllIIlIl)o).llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public int hashCode() {
        return 31 * super.hashCode() + this.llllIIIIlIIIlIlllIll.hashCode();
    }
    
    public static IllIIlllIIIIlllIIlIl llllIIIIlIIIlIlllIll(final String s, final int n, final int n2) {
        return new IllIIlllIIIIlllIIlIl(s, n, n2);
    }
    
    public String llllIIIIlIIIlIlllIll(final Integer n) {
        return n.toString();
    }
}
