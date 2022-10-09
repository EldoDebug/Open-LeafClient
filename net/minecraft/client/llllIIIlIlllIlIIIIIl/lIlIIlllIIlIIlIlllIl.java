package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIlIIlllIIlIIlIlllIl extends IIIllllllIllIIIlllIl
{
    private float llllIIIIlIIIlIlllIll;
    private double IIIIIIIllllIlIIIIIII;
    private double IIlllIIIllIllIIlIlIl;
    private double llIlllIlllllIIllIIII;
    
    protected lIlIIlllIIlIIlIlllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double lIllllllIIllIlIlIlII, final double llIIlllIIlllIIllIllI, final double iIlllIIIlIlllIIlllII) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, lIllllllIIllIlIlIlII, llIIlllIIlllIIllIllI, iIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        this.IIlllIlIIllIlIlIlIIl = n;
        this.IIIIIIIllllIlIIIIIII = n;
        this.llIIIlIlIllIIlIlIlII = n2;
        this.IIlllIIIllIllIIlIlIl = n2;
        this.lllllIlIIIlIlIIlllII = n3;
        this.llIlllIlllllIIllIIII = n3;
        final float n4 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.6f + 0.4f;
        final float n5 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f + 0.5f;
        this.lIIIIlIIIIIlllIllIII = n5;
        this.llllIIIIlIIIlIlllIll = n5;
        final float llIIlIIIlIIIllIlIIIl = 1.0f * n4;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI *= 0.3f;
        this.llIIlIIIlIIIllIlIIIl *= 0.9f;
        this.llllIIIlIlllIlIIIIIl = (int)(Math.random() * 10.0) + 40;
        this.lIIIIlIlIllllIIlIllI = true;
        this.llllIIIIlIIIlIlllIll((int)(Math.random() * 8.0));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float n7 = 1.0f - (this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll * (1.0f - n7 * n7);
        super.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public int a_(final float n) {
        final int a_ = super.a_(n);
        final float n2 = this.IllIIlllIIIIlllIIlIl / (float)this.llllIIIlIlllIlIIIIIl;
        final float n3 = n2 * n2;
        final float n4 = n3 * n3;
        final int n5 = a_ & 0xFF;
        int n6 = (a_ >> 16 & 0xFF) + (int)(n4 * 15.0f * 16.0f);
        if (n6 > 240) {
            n6 = 240;
        }
        return n5 | n6 << 16;
    }
    
    @Override
    public float b_(final float n) {
        final float b_ = super.b_(n);
        final float n2 = this.IllIIlllIIIIlllIIlIl / (float)this.llllIIIlIlllIlIIIIIl;
        final float n3 = n2 * n2 * n2 * n2;
        return b_ * (1.0f - n3) + n3;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        final float n = this.IllIIlllIIIIlllIIlIl / (float)this.llllIIIlIlllIlIIIIIl;
        final float n2 = 1.0f - (-n + n * n * 2.0f);
        this.IIlllIlIIllIlIlIlIIl = this.IIIIIIIllllIlIIIIIII + this.lIllllllIIllIlIlIlII * n2;
        this.llIIIlIlIllIIlIlIlII = this.IIlllIIIllIllIIlIlIl + this.llIIlllIIlllIIllIllI * n2 + (1.0f - n2);
        this.lllllIlIIIlIlIIlllII = this.llIlllIlllllIIllIIII + this.IIlllIIIlIlllIIlllII * n2;
        if (this.IllIIlllIIIIlllIIlIl++ >= this.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
}
