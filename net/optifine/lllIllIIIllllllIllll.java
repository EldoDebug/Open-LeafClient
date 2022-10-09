package net.optifine;

import java.util.*;

public class lllIllIIIllllllIllll
{
    private Map llllIIIIlIIIlIlllIll;
    private List IlIlIlIlIlllllllllIl;
    private boolean llIllIIIIIllIlIIIIlI;
    
    public lllIllIIIllllllIllll() {
        this.llllIIIIlIIIlIlllIll = new HashMap();
        this.IlIlIlIlIlllllllllIl = new ArrayList();
        this.llIllIIIIIllIlIIIIlI = false;
    }
    
    public IIllllIIIlIIIIIIllIl llllIIIIlIIIlIlllIll(final int n, final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl) {
        final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl2 = this.llllIIIIlIIIlIlllIll.put(n, illllIIIlIIIIIIllIl);
        this.IlIIIlIlIIIllIlIlIIl();
        return illllIIIlIIIIIIllIl2;
    }
    
    public IIllllIIIlIIIIIIllIl llllIIIIlIIIlIlllIll(final int n) {
        return this.llllIIIIlIIIlIlllIll.get(n);
    }
    
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll.size();
    }
    
    public IIllllIIIlIIIIIIllIl IlIlIlIlIlllllllllIl(final int n) {
        final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = this.llllIIIIlIIIlIlllIll.remove(n);
        if (illllIIIlIIIIIIllIl != null) {
            this.IlIIIlIlIIIllIlIlIIl();
        }
        return illllIIIlIIIIIIllIl;
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIIIlIIIlIlllIll.clear();
        this.IlIlIlIlIlllllllllIl.clear();
        this.IlIIIlIlIIIllIlIlIIl();
    }
    
    private void IlIIIlIlIIIllIlIlIIl() {
        this.llIllIIIIIllIlIIIIlI = true;
    }
    
    public List llIllIIIIIllIlIIIIlI() {
        if (this.llIllIIIIIllIlIIIIlI) {
            this.IlIlIlIlIlllllllllIl.clear();
            this.IlIlIlIlIlllllllllIl.addAll(this.llllIIIIlIIIlIlllIll.values());
            this.llIllIIIIIllIlIIIIlI = false;
        }
        return this.IlIlIlIlIlllllllllIl;
    }
}
