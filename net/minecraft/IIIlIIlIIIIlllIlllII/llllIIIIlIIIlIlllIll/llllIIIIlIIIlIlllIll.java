package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.collect.*;

public class llllIIIIlIIIlIlllIll
{
    private final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll;
    private long IlIlIlIlIlllllllllIl;
    private lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI;
    private List IlIIIlIlIIIllIlIlIIl;
    
    public llllIIIIlIIIlIlllIll(final IIIllllllIllIIIlllIl llllIIIIlIIIlIlllIll) {
        this.llIllIIIIIllIlIIIIlI = new lIIllIIIllllIlllIllI();
        this.IlIIIlIlIIIllIlIlIIl = Lists.newArrayList();
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(int n, int n2) {
        n >>= 4;
        n2 >>= 4;
        final long n3 = ((long)n & 0xFFFFFFFFL) | ((long)n2 & 0xFFFFFFFFL) << 32;
        IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = (IlIlIlIlIlllllllllIl)this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n3);
        if (ilIlIlIlIlllllllllIl == null) {
            ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this, n, n2);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n3, ilIlIlIlIlllllllllIl);
            this.IlIIIlIlIIIllIlIlIIl.add(ilIlIlIlIlllllllllIl);
        }
        ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI();
        return ilIlIlIlIlllllllllIl;
    }
    
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(n, n2).llllIIIIlIIIlIlllIll(n, n2);
        return (llllIIIIlIIIlIlllIll == null) ? llIIlIIIlIIIllIlIIIl : llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final long lllllIIllIlIllIllllI = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI();
        final long n = lllllIIllIlIllIllllI - this.IlIlIlIlIlllllllllIl;
        if (n > 7500L || n < 0L) {
            this.IlIlIlIlIlllllllllIl = lllllIIllIlIllIllllI;
            for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.size(); ++i) {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = this.IlIIIlIlIIIllIlIlIIl.get(i);
                final long n2 = lllllIIllIlIllIllllI - ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI;
                if (n2 > 30000L || n2 < 0L) {
                    this.IlIIIlIlIIIllIlIlIIl.remove(i--);
                    this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(((long)ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI & 0xFFFFFFFFL) | ((long)ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl & 0xFFFFFFFFL) << 32);
                }
            }
        }
    }
    
    public llIIlIIIlIIIllIlIIIl[] IlIlIlIlIlllllllllIl(final int n, final int n2) {
        return this.llllIIIIlIIIlIlllIll(n, n2).IlIlIlIlIlllllllllIl;
    }
}
