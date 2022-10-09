package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class lIIIIlIIIIIlllIllIII extends IIIllllllIllIIIlllIl
{
    protected lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        final float lIlIlIIIllIIllIIIllI = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.1f + 0.2f;
        this.llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI;
        this.llIllIlIIIIllIlIIllI = lIlIlIIIllIIllIIIllI;
        this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
        this.llllIIIIlIIIlIlllIll(0);
        this.llllIIIIlIIIlIlllIll(0.02f, 0.02f);
        this.lIIIIlIIIIIlllIllIII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.6f + 0.5f;
        this.lIllllllIIllIlIlIlII *= 0.019999999552965164;
        this.llIIlllIIlllIIllIllI *= 0.019999999552965164;
        this.IIlllIIIlIlllIIlllII *= 0.019999999552965164;
        this.llllIIIlIlllIlIIIIIl = (int)(20.0 / (Math.random() * 0.8 + 0.2));
        this.lIIIIlIlIllllIIlIllI = true;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.99;
        this.llIIlllIIlllIIllIllI *= 0.99;
        this.IIlllIIIlIlllIIlllII *= 0.99;
        if (this.llllIIIlIlllIlIIIIIl-- <= 0) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
}
