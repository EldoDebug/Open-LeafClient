package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlIlIlIIlIllIIIIIIl extends IIIllllllIllIIIlllIl
{
    private float llllIIIIlIIIlIlllIll;
    
    protected IIlIlIlIIlIllIIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        this.lIllllllIIllIlIlIlII = this.lIllllllIIllIlIlIlII * 0.009999999776482582 + n4;
        this.llIIlllIIlllIIllIllI = this.llIIlllIIlllIIllIllI * 0.009999999776482582 + n5;
        this.IIlllIIIlIlllIIlllII = this.IIlllIIIlIlllIIlllII * 0.009999999776482582 + n6;
        this.IIlllIlIIllIlIlIlIIl += (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.05f;
        this.llIIIlIlIllIIlIlIlII += (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.05f;
        this.lllllIlIIIlIlIIlllII += (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.05f;
        this.llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII;
        final float llIIlIIIlIIIllIlIIIl = 1.0f;
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llllIIIlIlllIlIIIIIl = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
        this.lIIIIlIlIllllIIlIllI = true;
        this.llllIIIIlIIIlIlllIll(48);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        final float n7 = (this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll * (1.0f - n7 * n7 * 0.5f);
        super.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6);
    }
    
    @Override
    public int a_(final float n) {
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl, 0.0f, 1.0f);
        final int a_ = super.a_(n);
        final int n2 = a_ & 0xFF;
        final int n3 = a_ >> 16 & 0xFF;
        int n4 = n2 + (int)(llllIIIIlIIIlIlllIll * 15.0f * 16.0f);
        if (n4 > 240) {
            n4 = 240;
        }
        return n4 | n3 << 16;
    }
    
    @Override
    public float b_(final float n) {
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl, 0.0f, 1.0f);
        return super.b_(n) * llllIIIIlIIIlIlllIll + (1.0f - llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        if (this.IllIIlllIIIIlllIIlIl++ >= this.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII();
        }
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.9599999785423279;
        this.llIIlllIIlllIIllIllI *= 0.9599999785423279;
        this.IIlllIIIlIlllIIlllII *= 0.9599999785423279;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
}
