package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;

public class IlIllIlIlIIIlIlIlIII
{
    private e llllIIIIlIIIlIlllIll;
    private long IlIlIlIlIlllllllllIl;
    
    public IlIllIlIlIIIlIlIlIII() {
        this.llllIIIIlIIIlIlllIll = null;
        this.IlIlIlIlIlllllllllIl = System.currentTimeMillis();
    }
    
    public e llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        if (this.llllIIIIlIIIlIlllIll == null) {
            return this.llllIIIIlIIIlIlllIll = new e(n, n2, n3);
        }
        final long currentTimeMillis = System.currentTimeMillis();
        final long n4 = currentTimeMillis - this.IlIlIlIlIlllllllllIl;
        if (n4 == 0L) {
            return this.llllIIIIlIIIlIlllIll;
        }
        this.IlIlIlIlIlllllllllIl = currentTimeMillis;
        if (Math.abs(n - this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) < 0.004 && Math.abs(n2 - this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) < 0.004 && Math.abs(n3 - this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) < 0.004) {
            return this.llllIIIIlIIIlIlllIll;
        }
        final double llllIIIIlIIIlIlllIll = net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n4 * 0.001, 0.0, 1.0);
        return this.llllIIIIlIIIlIlllIll = new e(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll + (n - this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) * llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + (n2 - this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) * llllIIIIlIIIlIlllIll, this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + (n3 - this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) * llllIIIIlIIIlIlllIll);
    }
}
