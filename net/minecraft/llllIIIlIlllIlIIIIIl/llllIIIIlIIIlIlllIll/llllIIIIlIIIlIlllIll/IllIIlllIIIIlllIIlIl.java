package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;

import com.google.common.collect.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl implements IlIlIIIllIllIIIIIllI
{
    private final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private final IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl;
    private final Map llIllIIIIIllIlIIIIlI;
    private final Map IlIIIlIlIIIllIlIlIIl;
    private final Map IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private double lIIIIlIIIIIlllIllIII;
    
    public IllIIlllIIIIlllIIlIl(final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll, final IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl) {
        this.llIllIIIIIllIlIIIIlI = Maps.newHashMap();
        this.IlIIIlIlIIIllIlIlIIl = Maps.newHashMap();
        this.IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        this.llllIIIlIlllIlIIIIIl = true;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IllIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        for (int i = 0; i < 3; ++i) {
            this.llIllIIIIIllIlIIIIlI.put(i, Sets.newHashSet());
        }
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public double IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double illIIlllIIIIlllIIlIl) {
        if (illIIlllIIIIlllIIlIl != this.IlIlIlIlIlllllllllIl()) {
            this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
            this.IllIIlllIIIIlllIIlIl();
        }
    }
    
    @Override
    public Collection llllIIIIlIIIlIlllIll(final int n) {
        return this.llIllIIIIIllIlIIIIlI.get(n);
    }
    
    @Override
    public Collection llIllIIIIIllIlIIIIlI() {
        final HashSet hashSet = Sets.newHashSet();
        for (int i = 0; i < 3; ++i) {
            hashSet.addAll(this.llllIIIIlIIIlIlllIll(i));
        }
        return hashSet;
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final UUID uuid) {
        return this.IlIlIIIllIllIIIIIllI.get(uuid);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.IlIlIIIllIllIIIIIllI.get(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) != null;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) != null) {
            throw new IllegalArgumentException("Modifier is already applied on this attribute!");
        }
        Set<llllIIIIlIIIlIlllIll> hashSet = this.IlIIIlIlIIIllIlIlIIl.get(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
        if (hashSet == null) {
            hashSet = (Set<llllIIIIlIIIlIlllIll>)Sets.newHashSet();
            this.IlIIIlIlIIIllIlIlIIl.put(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), hashSet);
        }
        this.llIllIIIIIllIlIIIIlI.get(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()).add(llllIIIIlIIIlIlllIll);
        hashSet.add(llllIIIIlIIIlIlllIll);
        this.IlIlIIIllIllIIIIIllI.put(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), llllIIIIlIIIlIlllIll);
        this.IllIIlllIIIIlllIIlIl();
    }
    
    protected void IllIIlllIIIIlllIIlIl() {
        this.llllIIIlIlllIlIIIIIl = true;
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        for (int i = 0; i < 3; ++i) {
            ((Set)this.llIllIIIIIllIlIIIIlI.get(i)).remove(llllIIIIlIIIlIlllIll);
        }
        final Set set = this.IlIIIlIlIIIllIlIlIIl.get(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
        if (set != null) {
            set.remove(llllIIIIlIIIlIlllIll);
            if (set.isEmpty()) {
                this.IlIIIlIlIIIllIlIlIIl.remove(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
            }
        }
        this.IlIlIIIllIllIIIIIllI.remove(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll());
        this.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl() {
        final Collection llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != null) {
            final Iterator iterator = Lists.newArrayList((Iterable)llIllIIIIIllIlIIIIlI).iterator();
            while (iterator.hasNext()) {
                this.llIllIIIIIllIlIIIIlI(iterator.next());
            }
        }
    }
    
    @Override
    public double IlIlIIIllIllIIIIIllI() {
        if (this.llllIIIlIlllIlIIIIIl) {
            this.lIIIIlIIIIIlllIllIII = this.llllIIIlIlllIlIIIIIl();
            this.llllIIIlIlllIlIIIIIl = false;
        }
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    private double llllIIIlIlllIlIIIIIl() {
        double ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        final Iterator<llllIIIIlIIIlIlllIll> iterator = this.IlIlIlIlIlllllllllIl(0).iterator();
        while (iterator.hasNext()) {
            ilIlIlIlIlllllllllIl += iterator.next().IlIIIlIlIIIllIlIlIIl();
        }
        double n = ilIlIlIlIlllllllllIl;
        final Iterator<llllIIIIlIIIlIlllIll> iterator2 = this.IlIlIlIlIlllllllllIl(1).iterator();
        while (iterator2.hasNext()) {
            n += ilIlIlIlIlllllllllIl * iterator2.next().IlIIIlIlIIIllIlIlIIl();
        }
        final Iterator<llllIIIIlIIIlIlllIll> iterator3 = this.IlIlIlIlIlllllllllIl(2).iterator();
        while (iterator3.hasNext()) {
            n *= 1.0 + iterator3.next().IlIIIlIlIIIllIlIlIIl();
        }
        return this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n);
    }
    
    private Collection IlIlIlIlIlllllllllIl(final int n) {
        final HashSet hashSet = Sets.newHashSet((Iterable)this.llllIIIIlIIIlIlllIll(n));
        for (IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl(); ilIIIlIlIIIllIlIlIIl != null; ilIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl()) {
            final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
            if (llllIIIIlIIIlIlllIll != null) {
                hashSet.addAll(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n));
            }
        }
        return hashSet;
    }
}
