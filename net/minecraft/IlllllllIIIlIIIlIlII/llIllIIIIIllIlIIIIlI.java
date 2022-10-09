package net.minecraft.IlllllllIIIlIIIlIlII;

import java.util.*;

class llIllIIIIIllIlIIIIlI implements Iterable
{
    private final /* synthetic */ IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private final /* synthetic */ IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    
    llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public Iterator iterator() {
        return (Iterator)new IlIIIlIlIIIllIlIlIIl(this, this.llllIIIIlIIIlIlllIll, this.IlIlIlIlIlllllllllIl);
    }
}
