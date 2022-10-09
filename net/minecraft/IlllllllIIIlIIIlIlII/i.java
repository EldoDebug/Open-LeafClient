package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;

public class i
{
    public static int llllIIIIlIIIlIlllIll(final Collection collection) {
        int n = 0;
        final Iterator<j> iterator = collection.iterator();
        while (iterator.hasNext()) {
            n += iterator.next().llIllIIIIIllIlIIIIlI;
        }
        return n;
    }
    
    public static j llllIIIIlIIIlIlllIll(final Random random, final Collection collection, final int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        return llllIIIIlIIIlIlllIll(collection, random.nextInt(n));
    }
    
    public static j llllIIIIlIIIlIlllIll(final Collection collection, int n) {
        for (final j j : collection) {
            n -= j.llIllIIIIIllIlIIIIlI;
            if (n < 0) {
                return j;
            }
        }
        return null;
    }
    
    public static j llllIIIIlIIIlIlllIll(final Random random, final Collection collection) {
        return llllIIIIlIIIlIlllIll(random, collection, llllIIIIlIIIlIlllIll(collection));
    }
}
