package net.optifine.util;

import java.util.*;

class IIIlIIIlIlIIlllIIlll implements Iterator
{
    IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll;
    final /* synthetic */ IIllIIllIIIlIlIIIIlI IlIlIlIlIlllllllllIl;
    
    IIIlIIIlIlIIlllIIlll(final IIllIIllIIIlIlIIIIlI ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public boolean hasNext() {
        return this.llllIIIIlIIIlIlllIll != null;
    }
    
    public IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll() {
        final IlIlIIIlIIlIlIIlllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        if (this.llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
