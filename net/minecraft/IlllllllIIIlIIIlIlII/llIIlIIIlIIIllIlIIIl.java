package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;

class llIIlIIIlIIIllIlIIIl implements Iterable
{
    private final Class llllIIIIlIIIlIlllIll;
    private final Iterable[] IlIlIlIlIlllllllllIl;
    
    private llIIlIIIlIIIllIlIIIl(final Class llllIIIIlIIIlIlllIll, final Iterable[] ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)((this.IlIlIlIlIlllllllllIl.length <= 0) ? Collections.singletonList(IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll, 0)).iterator() : new llIllIlIIIIllIlIIllI(this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl, null));
    }
}
