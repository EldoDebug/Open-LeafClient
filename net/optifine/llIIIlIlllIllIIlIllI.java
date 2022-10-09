package net.optifine;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.collect.*;
import java.util.*;

public class llIIIlIlllIllIIlIllI extends TreeSet
{
    private lIIllIIIllllIlllIllI llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private static final int IllIIlllIIIIlllIIlIl = Integer.MIN_VALUE;
    
    public llIIIlIlllIllIIlIllI(final Set set) {
        this.llllIIIIlIIIlIlllIll = new lIIllIIIllllIlllIllI();
        this.IlIlIlIlIlllllllllIl = Integer.MIN_VALUE;
        this.llIllIIIIIllIlIIIIlI = Integer.MIN_VALUE;
        this.IlIIIlIlIIIllIlIlIIl = Integer.MIN_VALUE;
        this.IlIlIIIllIllIIIIIllI = Integer.MIN_VALUE;
        final Iterator<Object> iterator = set.iterator();
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }
    
    @Override
    public boolean contains(final Object o) {
        if (!(o instanceof IlIlIIIIIIlllIlIllIl)) {
            return false;
        }
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = (IlIlIIIIIIlllIlIllIl)o;
        final Set llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, false);
        return llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.contains(ilIlIIIIIIlllIlIllIl);
    }
    
    @Override
    public boolean add(final Object o) {
        if (!(o instanceof IlIlIIIIIIlllIlIllIl)) {
            return false;
        }
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = (IlIlIIIIIIlllIlIllIl)o;
        final boolean add = this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, true).add(ilIlIIIIIIlllIlIllIl);
        final boolean add2 = super.add(o);
        if (add != add2) {
            throw new IllegalStateException("Added: " + add + ", addedParent: " + add2);
        }
        return add2;
    }
    
    @Override
    public boolean remove(final Object o) {
        if (!(o instanceof IlIlIIIIIIlllIlIllIl)) {
            return false;
        }
        final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = (IlIlIIIIIIlllIlIllIl)o;
        final Set llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl, false);
        if (llllIIIIlIIIlIlllIll == null) {
            return false;
        }
        final boolean remove = llllIIIIlIIIlIlllIll.remove(ilIlIIIIIIlllIlIllIl);
        final boolean remove2 = super.remove(ilIlIIIIIIlllIlIllIl);
        if (remove != remove2) {
            throw new IllegalStateException("Added: " + remove + ", addedParent: " + remove2);
        }
        return remove2;
    }
    
    private Set llllIIIIlIIIlIlllIll(final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl, final boolean b) {
        if (ilIlIIIIIIlllIlIllIl == null) {
            return null;
        }
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll;
        return this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() >> 4, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() >> 4, b);
    }
    
    private Set llllIIIIlIIIlIlllIll(final int n, final int n2, final boolean b) {
        final long llllIIIIlIIIlIlllIll = net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n, n2);
        HashSet set = (HashSet)this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (set == null && b) {
            set = new HashSet();
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, set);
        }
        return set;
    }
    
    @Override
    public Iterator iterator() {
        if (this.IlIlIlIlIlllllllllIl == Integer.MIN_VALUE) {
            return super.iterator();
        }
        if (this.size() <= 0) {
            return (Iterator)Iterators.emptyIterator();
        }
        final int n = this.IlIlIlIlIlllllllllIl >> 4;
        final int n2 = this.llIllIIIIIllIlIIIIlI >> 4;
        final int n3 = this.IlIIIlIlIIIllIlIlIIl >> 4;
        final int n4 = this.IlIlIIIllIllIIIIIllI >> 4;
        final ArrayList<Object> list = new ArrayList<Object>();
        for (int i = n; i <= n3; ++i) {
            for (int j = n2; j <= n4; ++j) {
                final Set llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(i, j, false);
                if (llllIIIIlIIIlIlllIll != null) {
                    list.add(llllIIIIlIIIlIlllIll.iterator());
                }
            }
        }
        if (list.size() <= 0) {
            return (Iterator)Iterators.emptyIterator();
        }
        if (list.size() == 1) {
            return (Iterator)list.get(0);
        }
        return Iterators.concat((Iterator)list.iterator());
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        this.IlIlIlIlIlllllllllIl = Math.min(n, n3);
        this.llIllIIIIIllIlIIIIlI = Math.min(n2, n4);
        this.IlIIIlIlIIIllIlIlIIl = Math.max(n, n3);
        this.IlIlIIIllIllIIIIIllI = Math.max(n2, n4);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IlIlIlIlIlllllllllIl = Integer.MIN_VALUE;
        this.llIllIIIIIllIlIIIIlI = Integer.MIN_VALUE;
        this.IlIIIlIlIIIllIlIlIIl = Integer.MIN_VALUE;
        this.IlIlIIIllIllIIIIIllI = Integer.MIN_VALUE;
    }
}
