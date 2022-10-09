package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IIlIIIIIllIlIIIlIIll extends IIIllllllIllIIIlllIl
{
    protected IIlIIIIIllIlIIIlIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        this.lIllllllIIllIlIlIlII = n4 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        this.llIIlllIIlllIIllIllI = n5 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        this.IIlllIIIlIlllIIlllII = n6 + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        final float llIIlIIIlIIIllIlIIIl = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.3f + 0.7f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIIlIIIIIlllIllIII = this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIIllIIllIIllIIlIIl.nextFloat() * 6.0f + 1.0f;
        this.llllIIIlIlllIlIIIIIl = (int)(16.0 / (this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.8 + 0.2)) + 2;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        if (this.IllIIlllIIIIlllIIlIl++ >= this.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII();
        }
        this.llllIIIIlIIIlIlllIll(7 - this.IllIIlllIIIIlllIIlIl * 8 / this.llllIIIlIlllIlIIIIIl);
        this.llIIlllIIlllIIllIllI += 0.004;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.8999999761581421;
        this.llIIlllIIlllIIllIllI *= 0.8999999761581421;
        this.IIlllIIIlIlllIIlllII *= 0.8999999761581421;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
}
