package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;
import com.google.common.collect.*;

class IlIlIllllllllIIIIlII implements Iterable
{
    final /* synthetic */ IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Class IlIlIlIlIlllllllllIl;
    
    IlIlIllllllllIIIIlII(final IIIlIIlIIIIlllIlllII llllIIIIlIIIlIlllIll, final Class ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public Iterator iterator() {
        final List list = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.get(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.IlIlIlIlIlllllllllIl));
        if (list == null) {
            return (Iterator)Iterators.emptyIterator();
        }
        return (Iterator)Iterators.filter((Iterator)list.iterator(), this.IlIlIlIlIlllllllllIl);
    }
}
