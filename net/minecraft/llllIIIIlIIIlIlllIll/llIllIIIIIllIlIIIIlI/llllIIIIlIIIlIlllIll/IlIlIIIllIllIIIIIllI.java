package net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

public class IlIlIIIllIllIIIIIllI implements Predicate
{
    private final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final Map IlIlIlIlIlllllllllIl;
    
    private IlIlIIIllIllIIIIIllI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this.IlIlIlIlIlllllllllIl = Maps.newHashMap();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public static IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return new IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll.IlllIIIIlIIIlIlIlIIl());
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (llIIlIIIlIIIllIlIIIl != null && llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().equals(this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI())) {
            for (final Map.Entry<net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, V> entry : this.IlIlIlIlIlllllllllIl.entrySet()) {
                if (!((Predicate)entry.getValue()).apply((Object)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(entry.getKey()))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final Predicate predicate) {
        if (!this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl().contains(llllIIIIlIIIlIlllIll)) {
            throw new IllegalArgumentException(this.llllIIIIlIIIlIlllIll + " cannot support property " + llllIIIIlIIIlIlllIll);
        }
        this.IlIlIlIlIlllllllllIl.put(llllIIIIlIIIlIlllIll, predicate);
        return this;
    }
}
