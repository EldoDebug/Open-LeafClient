package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class IIllllIIIlIIIIIIllIl extends IIIllllllIllIIIlllIl
{
    private int llllIIIIlIIIlIlllIll;
    private boolean IIIIIIIllllIlIIIIIII;
    private boolean IIlllIIIllIllIIlIlIl;
    private final net.minecraft.client.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIlllIlllllIIllIIII;
    private float lllllIlIlIlllIlllIlI;
    private float IlIllllIIlIllIlIlIll;
    private float lllIlIIIIIlIlllllIlI;
    private boolean llIlIIIIllIlIIlIlIII;
    
    public IIllllIIIlIIIIIIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double lIllllllIIllIlIlIlII, final double llIIlllIIlllIIllIllI, final double iIlllIIIlIlllIIlllII, final net.minecraft.client.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIlllIlllllIIllIIII) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llllIIIIlIIIlIlllIll = 160;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
        this.llIlllIlllllIIllIIII = llIlllIlllllIIllIIII;
        this.lIIIIlIIIIIlllIllIII *= 0.75f;
        this.llllIIIlIlllIlIIIIIl = 48 + this.IlIIllIIllIIllIIlIIl.nextInt(12);
        this.lIIIIlIlIllllIIlIllI = false;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean iiiiiiIllllIlIIIIIII) {
        this.IIIIIIIllllIlIIIIIII = iiiiiiIllllIlIIIIIII;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean iIlllIIIllIllIIlIlIl) {
        this.IIlllIIIllIllIIlIlIl = iIlllIIIllIllIIlIlIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        final float n2 = ((n & 0xFF0000) >> 16) / 255.0f;
        final float n3 = ((n & 0xFF00) >> 8) / 255.0f;
        final float n4 = ((n & 0xFF) >> 0) / 255.0f;
        final float n5 = 1.0f;
        this.llllIIIIlIIIlIlllIll(n2 * n5, n3 * n5, n4 * n5);
    }
    
    public void llIllIIIIIllIlIIIIlI(final int n) {
        this.lllllIlIlIlllIlllIlI = ((n & 0xFF0000) >> 16) / 255.0f;
        this.IlIllllIIlIllIlIlIll = ((n & 0xFF00) >> 8) / 255.0f;
        this.lllIlIIIIIlIlllllIlI = ((n & 0xFF) >> 0) / 255.0f;
        this.llIlIIIIllIlIIlIlIII = true;
    }
    
    @Override
    public llllIIIIlIIIlIlllIll h_() {
        return null;
    }
    
    @Override
    public boolean g_() {
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        if (!this.IIlllIIIllIllIIlIlIl || this.IllIIlllIIIIlllIIlIl < this.llllIIIlIlllIlIIIIIl / 3 || (this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl) / 3 % 2 == 0) {
            super.llllIIIIlIIIlIlllIll(liIllIIIllllIlllIllI, llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6);
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        if (this.IllIIlllIIIIlllIIlIl++ >= this.llllIIIlIlllIlIIIIIl) {
            this.IllIllIIIIlIIlIlllII();
        }
        if (this.IllIIlllIIIIlllIIlIl > this.llllIIIlIlllIlIIIIIl / 2) {
            this.IllIIlllIIIIlllIIlIl(1.0f - (this.IllIIlllIIIIlllIIlIl - (float)(this.llllIIIlIlllIlIIIIIl / 2)) / this.llllIIIlIlllIlIIIIIl);
            if (this.llIlIIIIllIlIIlIlIII) {
                this.llIIlIIIlIIIllIlIIIl += (this.lllllIlIlIlllIlllIlI - this.llIIlIIIlIIIllIlIIIl) * 0.2f;
                this.llIllIlIIIIllIlIIllI += (this.IlIllllIIlIllIlIlIll - this.llIllIlIIIIllIlIIllI) * 0.2f;
                this.lIlIlIIIllIIllIIIllI += (this.lllIlIIIIIlIlllllIlI - this.lIlIlIIIllIIllIIIllI) * 0.2f;
            }
        }
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll + (7 - this.IllIIlllIIIIlllIIlIl * 8 / this.llllIIIlIlllIlIIIIIl));
        this.llIIlllIIlllIIllIllI -= 0.004;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.9100000262260437;
        this.llIIlllIIlllIIllIllI *= 0.9100000262260437;
        this.IIlllIIIlIlllIIlllII *= 0.9100000262260437;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
        if (this.IIIIIIIllllIlIIIIIII && this.IllIIlllIIIIlllIIlIl < this.llllIIIlIlllIlIIIIIl / 2 && (this.IllIIlllIIIIlllIIlIl + this.llllIIIlIlllIlIIIIIl) % 2 == 0) {
            final IIllllIIIlIIIIIIllIl illllIIIlIIIIIIllIl = new IIllllIIIlIIIIIIllIl(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, this.llIlllIlllllIIllIIII);
            illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl(0.99f);
            illllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI);
            illllIIIlIIIIIIllIl.IllIIlllIIIIlllIIlIl = illllIIIlIIIIIIllIl.llllIIIlIlllIlIIIIIl / 2;
            if (this.llIlIIIIllIlIIlIlIII) {
                illllIIIlIIIIIIllIl.llIlIIIIllIlIIlIlIII = true;
                illllIIIlIIIIIIllIl.lllllIlIlIlllIlllIlI = this.lllllIlIlIlllIlllIlI;
                illllIIIlIIIIIIllIl.IlIllllIIlIllIlIlIll = this.IlIllllIIlIllIlIlIll;
                illllIIIlIIIIIIllIl.lllIlIIIIIlIlllllIlI = this.lllIlIIIIIlIlllllIlI;
            }
            illllIIIlIIIIIIllIl.IIlllIIIllIllIIlIlIl = this.IIlllIIIllIllIIlIlIl;
            this.llIlllIlllllIIllIIII.llllIIIIlIIIlIlllIll(illllIIIlIIIIIIllIl);
        }
    }
    
    @Override
    public int a_(final float n) {
        return 15728880;
    }
    
    @Override
    public float b_(final float n) {
        return 1.0f;
    }
}
