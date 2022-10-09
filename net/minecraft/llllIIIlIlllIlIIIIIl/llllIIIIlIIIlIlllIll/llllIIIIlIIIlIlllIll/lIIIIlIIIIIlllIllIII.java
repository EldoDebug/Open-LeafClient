package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import net.minecraft.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class lIIIIlIIIIIlllIllIII extends llIllIIIIIllIlIIIIlI
{
    private final Set IlIlIIIllIllIIIIIllI;
    protected final Map IlIIIlIlIIIllIlIlIIl;
    
    public lIIIIlIIIIIlllIllIII() {
        this.IlIlIIIllIllIIIIIllI = Sets.newHashSet();
        this.IlIIIlIlIIIllIlIlIIl = new IlIlIIIllIllIIIIIllI();
    }
    
    public IllIIlllIIIIlllIIlIl IlIIIlIlIIIllIlIlIIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return (IllIIlllIIIIlllIIlIl)super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
    }
    
    public IllIIlllIIIIlllIIlIl IlIlIlIlIlllllllllIl(final String s) {
        net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(s);
        if (llllIIIIlIIIlIlllIll == null) {
            llllIIIIlIIIlIlllIll = this.IlIIIlIlIIIllIlIlIIl.get(s);
        }
        return (IllIIlllIIIIlllIIlIl)llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIlIlIlllllllllIl = super.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl);
        if (ilIIIlIlIIIllIlIlIIl instanceof llllIIIlIlllIlIIIIIl && ((llllIIIlIlllIlIIIIIl)ilIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI() != null) {
            this.IlIIIlIlIIIllIlIlIIl.put(((llllIIIlIlllIlIIIIIl)ilIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI(), ilIlIlIlIlllllllllIl);
        }
        return ilIlIlIlIlllllllllIl;
    }
    
    @Override
    protected net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI llIllIIIIIllIlIIIIlI(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return new IllIIlllIIIIlllIIlIl(this, ilIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI()) {
            this.IlIlIIIllIllIIIIIllI.add(ilIlIIIllIllIIIIIllI);
        }
        final Iterator<IlIIIlIlIIIllIlIlIIl> iterator = this.llIllIIIIIllIlIIIIlI.get((Object)ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll()).iterator();
        while (iterator.hasNext()) {
            final IllIIlllIIIIlllIIlIl ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(iterator.next());
            if (ilIIIlIlIIIllIlIlIIl != null) {
                ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl();
            }
        }
    }
    
    public Set IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public Collection llIllIIIIIllIlIIIIlI() {
        final HashSet hashSet = Sets.newHashSet();
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI : this.llllIIIIlIIIlIlllIll()) {
            if (ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI()) {
                hashSet.add(ilIlIIIllIllIIIIIllI);
            }
        }
        return hashSet;
    }
}
