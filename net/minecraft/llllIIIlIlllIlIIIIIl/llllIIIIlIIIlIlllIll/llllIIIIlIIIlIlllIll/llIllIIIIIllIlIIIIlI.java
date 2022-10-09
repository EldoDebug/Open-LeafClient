package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import com.google.common.collect.*;
import java.util.*;

public abstract class llIllIIIIIllIlIIIIlI
{
    protected final Map llllIIIIlIIIlIlllIll;
    protected final Map IlIlIlIlIlllllllllIl;
    protected final Multimap llIllIIIIIllIlIIIIlI;
    
    public llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll = Maps.newHashMap();
        this.IlIlIlIlIlllllllllIl = new IlIlIIIllIllIIIIIllI();
        this.llIllIIIIIllIlIIIIlI = (Multimap)HashMultimap.create();
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return this.llllIIIIlIIIlIlllIll.get(ilIIIlIlIIIllIlIlIIl);
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final String s) {
        return this.IlIlIlIlIlllllllllIl.get(s);
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.IlIlIlIlIlllllllllIl.containsKey(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll())) {
            throw new IllegalArgumentException("Attribute is already registered!");
        }
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
        this.IlIlIlIlIlllllllllIl.put(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(), llIllIIIIIllIlIIIIlI);
        this.llllIIIIlIIIlIlllIll.put(ilIIIlIlIIIllIlIlIIl, llIllIIIIIllIlIIIIlI);
        for (IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl2 = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(); ilIIIlIlIIIllIlIlIIl2 != null; ilIIIlIlIIIllIlIlIIl2 = ilIIIlIlIIIllIlIlIIl2.IlIIIlIlIIIllIlIlIIl()) {
            this.llIllIIIIIllIlIIIIlI.put((Object)ilIIIlIlIIIllIlIlIIl2, (Object)ilIIIlIlIIIllIlIlIIl);
        }
        return llIllIIIIIllIlIIIIlI;
    }
    
    protected abstract net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl p0);
    
    public Collection llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl.values();
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
    }
    
    public void llllIIIIlIIIlIlllIll(final Multimap multimap) {
        for (final Map.Entry<String, V> entry : multimap.entries()) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(entry.getKey());
            if (llllIIIIlIIIlIlllIll != null) {
                llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll)entry.getValue());
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final Multimap multimap) {
        for (final Map.Entry<String, V> entry : multimap.entries()) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(entry.getKey());
            if (llllIIIIlIIIlIlllIll != null) {
                llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI((llllIIIIlIIIlIlllIll)entry.getValue());
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl((llllIIIIlIIIlIlllIll)entry.getValue());
            }
        }
    }
}
