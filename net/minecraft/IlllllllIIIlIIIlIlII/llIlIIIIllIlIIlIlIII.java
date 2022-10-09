package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.collect.*;
import java.util.*;

public class llIlIIIIllIlIIlIlIII extends llllllIIIIIIIlllIIll implements IlIIllIIllIIllIIlIIl
{
    protected final IlIllllIIlIllIlIlIll llllIIIIlIIIlIlllIll;
    protected final Map IlIlIlIlIlllllllllIl;
    
    public llIlIIIIllIlIIlIlIII() {
        this.llllIIIIlIIIlIlllIll = new IlIllllIIlIllIlIlIll();
        this.IlIlIlIlIlllllllllIl = (Map)((BiMap)this.llIllIIIIIllIlIIIIlI).inverse();
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final Object o, final Object o2) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(o2, n);
        this.llllIIIIlIIIlIlllIll(o, o2);
    }
    
    @Override
    protected Map llllIIIIlIIIlIlllIll() {
        return (Map)HashBiMap.create();
    }
    
    @Override
    public Object llllIIIIlIIIlIlllIll(final Object o) {
        return super.llllIIIIlIIIlIlllIll(o);
    }
    
    public Object IlIlIlIlIlllllllllIl(final Object o) {
        return this.IlIlIlIlIlllllllllIl.get(o);
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final Object o) {
        return super.llIllIIIIIllIlIIIIlI(o);
    }
    
    public int IlIIIlIlIIIllIlIlIIl(final Object o) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(o);
    }
    
    public Object llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    public Iterator iterator() {
        return this.llllIIIIlIIIlIlllIll.iterator();
    }
}
