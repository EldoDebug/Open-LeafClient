package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class llIIlllIIlllIIllIllI extends IIIllllllIllIIIlllIl
{
    private float llllIIIIlIIIlIlllIll;
    private double IIIIIIIllllIlIIIIIII;
    private double IIlllIIIllIllIIlIlIl;
    private double llIlllIlllllIIllIIII;
    
    protected llIIlllIIlllIIllIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double iiiiiiIllllIlIIIIIII, final double iIlllIIIllIllIIlIlIl, final double llIlllIlllllIIllIIII, final double lIllllllIIllIlIlIlII, final double llIIlllIIlllIIllIllI, final double iIlllIIIlIlllIIlllII) {
        super(illlllllIIIlIIIlIlII, iiiiiiIllllIlIIIIIII, iIlllIIIllIllIIlIlIl, llIlllIlllllIIllIIII, lIllllllIIllIlIlIlII, llIIlllIIlllIIllIllI, iIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        this.IIIIIIIllllIlIIIIIII = iiiiiiIllllIlIIIIIII;
        this.IIlllIIIllIllIIlIlIl = iIlllIIIllIllIIlIlIl;
        this.llIlllIlllllIIllIIII = llIlllIlllllIIllIIII;
        final double n = iiiiiiIllllIlIIIIIII + lIllllllIIllIlIlIlII;
        this.IIlIIIIlllIlllllIlII = n;
        this.IIlllIlIIllIlIlIlIIl = n;
        final double n2 = iIlllIIIllIllIIlIlIl + llIIlllIIlllIIllIllI;
        this.IIIlIIlIIIIlllIlllII = n2;
        this.llIIIlIlIllIIlIlIlII = n2;
        final double n3 = llIlllIlllllIIllIIII + iIlllIIIlIlllIIlllII;
        this.IlIlIllllllllIIIIlII = n3;
        this.lllllIlIIIlIlIIlllII = n3;
        final float n4 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.6f + 0.4f;
        final float n5 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.5f + 0.2f;
        this.lIIIIlIIIIIlllIllIII = n5;
        this.llllIIIIlIIIlIlllIll = n5;
        final float llIIlIIIlIIIllIlIIIl = 1.0f * n4;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI *= 0.9f;
        this.llIIlIIIlIIIllIlIIIl *= 0.9f;
        this.llllIIIlIlllIlIIIIIl = (int)(Math.random() * 10.0) + 30;
        this.lIIIIlIlIllllIIlIllI = true;
        this.llllIIIIlIIIlIlllIll((int)(Math.random() * 26.0 + 1.0 + 224.0));
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
        final float n3 = n2 * n2;
        final float n4 = n3 * n3;
        return b_ * (1.0f - n4) + n4;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        final float n = 1.0f - this.IllIIlllIIIIlllIIlIl / (float)this.llllIIIlIlllIlIIIIIl;
        final float n2 = 1.0f - n;
        final float n3 = n2 * n2;
        final float n4 = n3 * n3;
        this.IIlllIlIIllIlIlIlIIl = this.IIIIIIIllllIlIIIIIII + this.lIllllllIIllIlIlIlII * n;
        this.llIIIlIlIllIIlIlIlII = this.IIlllIIIllIllIIlIlIl + this.llIIlllIIlllIIllIllI * n - n4 * 1.2f;
        this.lllllIlIIIlIlIIlllII = this.llIlllIlllllIIllIIII + this.IIlllIIIlIlllIIlllII * n;
        if (this.IllIIlllIIIIlllIIlIl++ >= this.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
}
