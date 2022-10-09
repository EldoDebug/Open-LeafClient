package net.optifine.util;

import java.util.*;

public class IllIIlllIIIIlllIIlIl
{
    private ArrayList llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    
    public IllIIlllIIIIlllIIlIl() {
        this(10, 0.75f);
    }
    
    public IllIIlllIIIIlllIIlIl(final int n) {
        this(n, 0.75f);
    }
    
    public IllIIlllIIIIlllIIlIl(final int ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = 0;
        this.llIllIIIIIllIlIIIIlI = 1.0f;
        this.IlIIIlIlIIIllIlIlIIl = 0;
        this.llllIIIIlIIIlIlllIll = new ArrayList(ilIlIlIlIlllllllllIl);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final Object o) {
        if (o != null) {
            ++this.IlIIIlIlIIIllIlIlIIl;
        }
        this.llllIIIIlIIIlIlllIll.add(n, o);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final Object o) {
        if (o != null) {
            ++this.IlIIIlIlIIIllIlIlIIl;
        }
        return this.llllIIIIlIIIlIlllIll.add(o);
    }
    
    public Object IlIlIlIlIlllllllllIl(final int n, final Object o) {
        final Object set = this.llllIIIIlIIIlIlllIll.set(n, o);
        if (o != set) {
            if (set == null) {
                ++this.IlIIIlIlIIIllIlIlIIl;
            }
            if (o == null) {
                --this.IlIIIlIlIIIllIlIlIIl;
            }
        }
        return set;
    }
    
    public Object llllIIIIlIIIlIlllIll(final int n) {
        final Object remove = this.llllIIIIlIIIlIlllIll.remove(n);
        if (remove != null) {
            --this.IlIIIlIlIIIllIlIlIIl;
        }
        return remove;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll.clear();
        this.IlIIIlIlIIIllIlIlIIl = 0;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        if (this.IlIIIlIlIIIllIlIlIIl <= 0 && this.llllIIIIlIIIlIlllIll.size() <= 0) {
            this.llllIIIIlIIIlIlllIll();
        }
        else if (this.llllIIIIlIIIlIlllIll.size() > this.IlIlIlIlIlllllllllIl && this.IlIIIlIlIIIllIlIlIIl * 1.0f / this.llllIIIIlIIIlIlllIll.size() <= this.llIllIIIIIllIlIIIIlI) {
            int n = 0;
            for (int i = 0; i < this.llllIIIIlIIIlIlllIll.size(); ++i) {
                final Object value = this.llllIIIIlIIIlIlllIll.get(i);
                if (value != null) {
                    if (i != n) {
                        this.llllIIIIlIIIlIlllIll.set(n, value);
                    }
                    ++n;
                }
            }
            for (int j = this.llllIIIIlIIIlIlllIll.size() - 1; j >= n; --j) {
                this.llllIIIIlIIIlIlllIll.remove(j);
            }
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final Object o) {
        return this.llllIIIIlIIIlIlllIll.contains(o);
    }
    
    public Object IlIlIlIlIlllllllllIl(final int n) {
        return this.llllIIIIlIIIlIlllIll.get(n);
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.llllIIIIlIIIlIlllIll.isEmpty();
    }
    
    public int IlIIIlIlIIIllIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    public int IlIlIIIllIllIIIIIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
