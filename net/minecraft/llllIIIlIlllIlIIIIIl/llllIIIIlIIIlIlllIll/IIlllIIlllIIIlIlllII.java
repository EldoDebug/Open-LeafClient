package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlllIIlllIIIlIlllII
{
    protected IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    protected double IlIlIlIlIlllllllllIl;
    protected double llIllIIIIIllIlIIIIlI;
    protected double IlIIIlIlIIIllIlIlIIl;
    protected double IlIlIIIllIllIIIIIllI;
    protected boolean IllIIlllIIIIlllIIlIl;
    
    public IIlllIIlllIIIlIlllII(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
        this.llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII;
        this.IlIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
    }
    
    public boolean llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public double IlIlIlIlIlllllllllIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void llllIIIIlIIIlIlllIll(final double ilIlIlIlIlllllllllIl, final double llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl, final double ilIlIIIllIllIIIIIllI) {
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = true;
    }
    
    public void llIllIIIIIllIlIIIIlI() {
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(0.0f);
        if (this.IllIIlllIIIIlllIIlIl) {
            this.IllIIlllIIIIlllIIlIl = false;
            final int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5);
            final double n = this.IlIlIlIlIlllllllllIl - this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
            final double n2 = this.IlIIIlIlIIIllIlIlIIl - this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
            final double n3 = this.llIllIIIIIllIlIIIIlI - llIllIIIIIllIlIIIIlI;
            if (n * n + n3 * n3 + n2 * n2 >= 2.500000277905201E-7) {
                this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll = this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll, (float)(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2, n) * 180.0 / 3.141592653589793) - 90.0f, 30.0f);
                this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl((float)(this.IlIlIIIllIllIIIIIllI * this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI()));
                if (n3 > 0.0 && n * n + n2 * n2 < 1.0) {
                    this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII().llllIIIIlIIIlIlllIll();
                }
            }
        }
    }
    
    protected float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        float llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n2 - n);
        if (llllIIIlIlllIlIIIIIl > n3) {
            llllIIIlIlllIlIIIIIl = n3;
        }
        if (llllIIIlIlllIlIIIIIl < -n3) {
            llllIIIlIlllIlIIIIIl = -n3;
        }
        float n4 = n + llllIIIlIlllIlIIIIIl;
        if (n4 < 0.0f) {
            n4 += 360.0f;
        }
        else if (n4 > 360.0f) {
            n4 -= 360.0f;
        }
        return n4;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public double IlIlIIIllIllIIIIIllI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public double IllIIlllIIIIlllIIlIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
}
