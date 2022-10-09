package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIlIIlllIIlIIlIlllIl
{
    private IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    private float IlIlIlIlIlllllllllIl;
    private float llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private double IlIlIIIllIllIIIIIllI;
    private double IllIIlllIIIIlllIIlIl;
    private double llllIIIlIlllIlIIIIIl;
    
    public lIlIIlllIIlIIlIlllIl(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI2) {
        this.IlIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
        if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
            this.IllIIlllIIIIlllIIlIl = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI();
        }
        else {
            this.IllIIlllIIIIlllIIlIl = (llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIIIllIllIIIIIllI) / 2.0;
        }
        this.llllIIIlIlllIlIIIIIl = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI2;
        this.IlIIIlIlIIIllIlIlIIl = true;
    }
    
    public void llllIIIIlIIIlIlllIll(final double ilIlIIIllIllIIIIIllI, final double illIIlllIIIIlllIIlIl, final double llllIIIlIlllIlIIIIIl, final float ilIlIlIlIlllllllllIl, final float llIllIIIIIllIlIIIIlI) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = true;
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI = 0.0f;
        if (this.IlIIIlIlIIIllIlIlIIl) {
            this.IlIIIlIlIIIllIlIlIIl = false;
            final double n = this.IlIlIIIllIllIIIIIllI - this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
            final double n2 = this.IllIIlllIIIIlllIIlIl - (this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + this.llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI());
            final double n3 = this.llllIIIlIlllIlIIIIIl - this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
            final double n4 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n3 * n3);
            final float n5 = (float)(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3, n) * 180.0 / 3.141592653589793) - 90.0f;
            this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI = this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI, (float)(-(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2, n4) * 180.0 / 3.141592653589793)), this.llIllIIIIIllIlIIIIlI);
            this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll = this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll, n5, this.IlIlIlIlIlllllllllIl);
        }
        else {
            this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll = this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll, this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII, 10.0f);
        }
        final float llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll - this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII);
        if (!this.llllIIIIlIIIlIlllIll.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl()) {
            if (llllIIIlIlllIlIIIIIl < -75.0f) {
                this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll = this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII - 75.0f;
            }
            if (llllIIIlIlllIlIIIIIl > 75.0f) {
                this.llllIIIIlIIIlIlllIll.lIIlllIlllllIIlllIll = this.llllIIIIlIIIlIlllIll.lIllIlIIIllllllIIlII + 75.0f;
            }
        }
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        float llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n2 - n);
        if (llllIIIlIlllIlIIIIIl > n3) {
            llllIIIlIlllIlIIIIIl = n3;
        }
        if (llllIIIlIlllIlIIIIIl < -n3) {
            llllIIIlIlllIlIIIIIl = -n3;
        }
        return n + llllIIIlIlllIlIIIIIl;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public double llIllIIIIIllIlIIIIlI() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public double IlIIIlIlIIIllIlIlIIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public double IlIlIIIllIllIIIIIllI() {
        return this.llllIIIlIlllIlIIIIIl;
    }
}
