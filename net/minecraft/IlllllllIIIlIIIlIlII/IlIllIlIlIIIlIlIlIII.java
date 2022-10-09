package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;
import com.google.common.collect.*;
import com.google.common.base.*;

public abstract class IlIllIlIlIIIlIlIlIII implements llIIIIIIlIllIIlIIIll
{
    protected List llllIIIIlIIIlIlllIll;
    private IlIlIIIlIIlIlIIlllIl IlIlIlIlIlllllllllIl;
    
    public IlIllIlIlIIIlIlIlIII() {
        this.llllIIIIlIIIlIlllIll = Lists.newArrayList();
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl());
        this.llllIIIIlIIIlIlllIll.add(llIIIIIIlIllIIlIIIll);
        return this;
    }
    
    @Override
    public List IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll IlIlIlIlIlllllllllIl(final String s) {
        return this.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(s));
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final IlIlIIIlIIlIlIIlllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            iterator.next().llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl());
        }
        return this;
    }
    
    @Override
    public IlIlIIIlIIlIlIIlllIl llllIIIlIlllIlIIIIIl() {
        if (this.IlIlIlIlIlllllllllIl == null) {
            this.IlIlIlIlIlllllllllIl = new IlIlIIIlIIlIlIIlllIl();
            final Iterator<llIIIIIIlIllIIlIIIll> iterator = this.llllIIIIlIIIlIlllIll.iterator();
            while (iterator.hasNext()) {
                iterator.next().llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
            }
        }
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public Iterator iterator() {
        return Iterators.concat((Iterator)Iterators.forArray((Object[])new IlIllIlIlIIIlIlIlIII[] { this }), llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll));
    }
    
    @Override
    public final String lIIIIlIIIIIlllIllIII() {
        final StringBuilder sb = new StringBuilder();
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next().llIllIIIIIllIlIIIIlI());
        }
        return sb.toString();
    }
    
    @Override
    public final String lIIIlllIIIllIIIllIII() {
        final StringBuilder sb = new StringBuilder();
        for (final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll : this) {
            sb.append(llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl().llIllIlIIIIllIlIIllI());
            sb.append(llIIIIIIlIllIIlIIIll.llIllIIIIIllIlIIIIlI());
            sb.append(IlllIIIIlIIIlIlIlIIl.IlIlIIIlIIlIlIIlllIl);
        }
        return sb.toString();
    }
    
    public static Iterator llllIIIIlIIIlIlllIll(final Iterable iterable) {
        return Iterators.transform(Iterators.concat(Iterators.transform((Iterator)iterable.iterator(), (Function)new IIlllIIlIllIllIlIIll())), (Function)new lllIIIIlllllIlIIllIl());
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IlIllIlIlIIIlIlIlIII)) {
            return false;
        }
        final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (IlIllIlIlIIIlIlIlIII)o;
        return this.llllIIIIlIIIlIlllIll.equals(ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll) && this.llllIIIlIlllIlIIIIIl().equals(ilIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl());
    }
    
    @Override
    public int hashCode() {
        return 31 * this.IlIlIlIlIlllllllllIl.hashCode() + this.llllIIIIlIIIlIlllIll.hashCode();
    }
    
    @Override
    public String toString() {
        return "BaseComponent{style=" + this.IlIlIlIlIlllllllllIl + ", siblings=" + this.llllIIIIlIIIlIlllIll + '}';
    }
}
