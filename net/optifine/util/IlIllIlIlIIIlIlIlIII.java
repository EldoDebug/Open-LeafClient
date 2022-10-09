package net.optifine.util;

import java.util.*;

public class IlIllIlIlIIIlIlIlIII implements IIlllIIlIllIllIlIIll
{
    private List llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    
    @Override
    public void llllIIIIlIIIlIlllIll(final List llllIIIIlIIIlIlllIll) {
        if (this.llIllIIIIIllIlIIIIlI) {
            throw new RuntimeException("Iterator still used, oldList: " + this.llllIIIIlIIIlIlllIll + ", newList: " + llllIIIIlIIIlIlllIll);
        }
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = (llllIIIIlIIIlIlllIll != null && this.IlIlIlIlIlllllllllIl < llllIIIIlIIIlIlllIll.size());
    }
    
    @Override
    public Object next() {
        if (!this.llIllIIIIIllIlIIIIlI) {
            return null;
        }
        final Object value = this.llllIIIIlIIIlIlllIll.get(this.IlIlIlIlIlllllllllIl);
        ++this.IlIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = (this.IlIlIlIlIlllllllllIl < this.llllIIIIlIIIlIlllIll.size());
        return value;
    }
    
    @Override
    public boolean hasNext() {
        if (!this.llIllIIIIIllIlIIIIlI) {
            IlIlIlIlIlllllllllIl(this);
            return false;
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
