package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class lIIIIlIlIllllIIlIllI extends IIIllllllIllIIIlllIl
{
    private float llllIIIIlIIIlIlllIll;
    
    protected lIIIIlIlIllllIIlIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.lIllllllIIllIlIlIlII *= 0.800000011920929;
        this.llIIlllIIlllIIllIllI *= 0.800000011920929;
        this.IIlllIIIlIlllIIlllII *= 0.800000011920929;
        this.llIIlllIIlllIIllIllI = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.4f + 0.05f;
        final float llIIlIIIlIIIllIlIIIl = 1.0f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIIlIIIIIlllIllIII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f + 0.2f;
        this.llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.lIIIIlIlIllllIIlIllI = false;
        this.llllIIIIlIIIlIlllIll(49);
    }
    
    @Override
    public int a_(final float n) {
        net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl, 0.0f, 1.0f);
        return 0xF0 | (super.a_(n) >> 16 & 0xFF) << 16;
    }
    
    @Override
    public float b_(final float n) {
        return 1.0f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float n7 = (this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll * (1.0f - n7 * n7);
        super.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        if (this.IllIIlllIIIIlllIIlIl++ >= this.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII();
        }
        if (this.IlIIllIIllIIllIIlIIl.nextFloat() > this.IllIIlllIIIIlllIIlIl / (float)this.llllIIIlIlllIlIIIIIl) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
        }
        this.llIIlllIIlllIIllIllI -= 0.03;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.9990000128746033;
        this.llIIlllIIlllIIllIllI *= 0.9990000128746033;
        this.IIlllIIIlIlllIIlllII *= 0.9990000128746033;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
}
