package net.minecraft.client.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import java.util.*;

public class IlIlIlIlIlllllllllIl implements llllIIIlIlllIlIIIIIl
{
    private final List llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final int IlIIIlIlIIIllIlIlIIl;
    private final boolean IlIlIIIllIllIIIIIllI;
    
    public IlIlIlIlIlllllllllIl(final List llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final boolean ilIlIIIllIllIIIIIllI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public int IlIlIlIlIlllllllllIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public int llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public boolean IlIlIIIllIllIIIIIllI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    private llllIIIIlIIIlIlllIll IlIIIlIlIIIllIlIlIIl(final int n) {
        return this.llllIIIIlIIIlIlllIll.get(n);
    }
    
    public int llllIIIIlIIIlIlllIll(final int n) {
        final llllIIIIlIIIlIlllIll ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(n);
        return ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() ? this.IlIIIlIlIIIllIlIlIIl : ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl();
    }
    
    public boolean IlIlIlIlIlllllllllIl(final int n) {
        return !this.llllIIIIlIIIlIlllIll.get(n).llllIIIIlIIIlIlllIll();
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n) {
        return this.llllIIIIlIIIlIlllIll.get(n).llIllIIIIIllIlIIIIlI();
    }
    
    public Set IllIIlllIIIIlllIIlIl() {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<llllIIIIlIIIlIlllIll> iterator = this.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            hashSet.add(iterator.next().llIllIIIIIllIlIIIIlI());
        }
        return hashSet;
    }
}
