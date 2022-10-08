package net.minecraft.IIIlIIIlIlIIlllIIlll;

import java.util.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIllIIllIlllllI
{
    protected final Map llllIIIIlIIIlIlllIll;
    
    public IlIlIIIllIIllIlllllI() {
        this.llllIIIIlIIIlIlllIll = Maps.newConcurrentMap();
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll((IllIIlllIIIIlllIIlIl)llllIIIIlIIIlIlllIll) > 0;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI == null || this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    public int llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll)) {
            return 0;
        }
        int n = 0;
        for (llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI; llllIIIIlIIIlIlllIll2 != null && !this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2); llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI, ++n) {}
        return n;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
        if (!illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() || this.IlIlIlIlIlllllllllIl((llllIIIIlIIIlIlllIll)illIIlllIIIIlllIIlIl)) {
            this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl, this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl) + n);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
        b b = this.llllIIIIlIIIlIlllIll.get(illIIlllIIIIlllIIlIl);
        if (b == null) {
            b = new b();
            this.llllIIIIlIIIlIlllIll.put(illIIlllIIIIlllIIlIl, b);
        }
        b.llllIIIIlIIIlIlllIll(n);
    }
    
    public int llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final b b = this.llllIIIIlIIIlIlllIll.get(illIIlllIIIIlllIIlIl);
        return (b == null) ? 0 : b.llllIIIIlIIIlIlllIll();
    }
    
    public llIIIlIlllIllIIlIllI IlIlIlIlIlllllllllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        final b b = this.llllIIIIlIIIlIlllIll.get(illIIlllIIIIlllIIlIl);
        return (b != null) ? b.IlIlIlIlIlllllllllIl() : null;
    }
    
    public llIIIlIlllIllIIlIllI llllIIIIlIIIlIlllIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlllIllIIlIllI llIIIlIlllIllIIlIllI) {
        b b = this.llllIIIIlIIIlIlllIll.get(illIIlllIIIIlllIIlIl);
        if (b == null) {
            b = new b();
            this.llllIIIIlIIIlIlllIll.put(illIIlllIIIIlllIIlIl, b);
        }
        b.llllIIIIlIIIlIlllIll(llIIIlIlllIllIIlIllI);
        return llIIIlIlllIllIIlIllI;
    }
}
