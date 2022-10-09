package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIlllIIIllIIIllIII
{
    private lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    
    public lIIIlllIIIllIIIllIII(final lllIIIIlllllIlIIllIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        final double n = this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII;
        final double n2 = this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - this.llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII;
        if (n * n + n2 * n2 > 2.500000277905201E-7) {
            this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII = this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll;
            this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll = this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII, this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll, 75.0f);
            this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll;
            this.IlIlIlIlIlllllllllIl = 0;
        }
        else {
            float n3 = 75.0f;
            if (Math.abs(this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll - this.llIllIIIIIllIlIIIIlI) > 15.0f) {
                this.IlIlIlIlIlllllllllIl = 0;
                this.llIllIIIIIllIlIIIIlI = this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll;
            }
            else {
                ++this.IlIlIlIlIlllllllllIl;
                if (this.IlIlIlIlIlllllllllIl > 10) {
                    n3 = Math.max(1.0f - (this.IlIlIlIlIlllllllllIl - 10) / 10.0f, 0.0f) * 75.0f;
                }
            }
            this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII = this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll, this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII, n3);
        }
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        float llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n - n2);
        if (llllIIIlIlllIlIIIIIl < -n3) {
            llllIIIlIlllIlIIIIIl = -n3;
        }
        if (llllIIIlIlllIlIIIIIl >= n3) {
            llllIIIlIlllIlIIIIIl = n3;
        }
        return n - llllIIIlIlllIlIIIIIl;
    }
}
