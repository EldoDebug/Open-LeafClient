package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;

import com.google.common.base.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import com.google.common.collect.*;

public abstract class IllIIlllIIIIlllIIlIl implements llIIlIIIlIIIllIlIIIl
{
    private static final Joiner llllIIIIlIIIlIlllIll;
    private static final Function IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private lIllllIllIllIIllllll IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = Joiner.on(',');
        IlIlIlIlIlllllllllIl = (Function)new llllIIIlIlllIlIIIIIl();
    }
    
    public IllIIlllIIIIlllIIlIl() {
        this.llIllIIIIIllIlIIIIlI = -1;
        this.IlIIIlIlIIIllIlIlIIl = -1;
        this.IlIlIIIllIllIIIIIllI = -1;
        this.IllIIlllIIIIlllIIlIl = null;
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        if (this.llIllIIIIIllIlIIIIlI < 0) {
            this.llIllIIIIIllIlIIIIlI = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI());
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        if (this.IlIIIlIlIIIllIlIlIIl < 0) {
            this.IlIIIlIlIIIllIlIlIIl = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
        }
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IllIIlllIIIIlllIIlIl() {
        if (this.IlIlIIIllIllIIIIIllI < 0) {
            this.IlIlIIIllIllIIIIIllI = this.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(this);
        }
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public lIllllIllIllIIllllll llllIIIlIlllIlIIIIIl() {
        if (this.IllIIlllIIIIlllIIlIl == null) {
            this.IllIIlllIIIIlllIIlIl = (lIllllIllIllIIllllll)net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI());
        }
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public ImmutableTable lIIIIlIIIIIlllIllIII() {
        return null;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, (Comparable)llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)));
    }
    
    protected static Object llllIIIIlIIIlIlllIll(final Collection collection, final Object o) {
        final Iterator<Object> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                if (iterator.hasNext()) {
                    return iterator.next();
                }
                return collection.iterator().next();
            }
        }
        return iterator.next();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI()));
        if (!this.IlIlIlIlIlllllllllIl().isEmpty()) {
            sb.append("[");
            net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.appendTo(sb, Iterables.transform((Iterable)this.IlIlIlIlIlllllllllIl().entrySet(), net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl));
            sb.append("]");
        }
        return sb.toString();
    }
}
