package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIIlllllIIllIIlllll extends IIIllllllIllIIIlllIl
{
    float llllIIIIlIIIlIlllIll;
    
    protected IlIIlllllIIllIIlllll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final float n4, final float n5, final float n6) {
        this(illlllllIIIlIIIlIlII, n, n2, n3, 1.0f, n4, n5, n6);
    }
    
    protected IlIIlllllIIllIIlllll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final float n4, float n5, final float n6, final float n7) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.lIllllllIIllIlIlIlII *= 0.10000000149011612;
        this.llIIlllIIlllIIllIllI *= 0.10000000149011612;
        this.IIlllIIIlIlllIIlllII *= 0.10000000149011612;
        if (n5 == 0.0f) {
            n5 = 1.0f;
        }
        final float n8 = (float)Math.random() * 0.4f + 0.6f;
        this.llIIlIIIlIIIllIlIIIl = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * n5 * n8;
        this.llIllIlIIIIllIlIIllI = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * n6 * n8;
        this.lIlIlIIIllIIllIIIllI = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * n7 * n8;
        this.lIIIIlIIIIIlllIllIII *= 0.75f;
        this.lIIIIlIIIIIlllIllIII *= n4;
        this.llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.llllIIIlIlllIlIIIIIl *= (int)n4;
        this.lIIIIlIlIllllIIlIllI = false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIIllIIIllllIlllIllI liIllIIIllllIlllIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IllIIlllIIIIlllIIlIl + n) / this.llllIIIlIlllIlIIIIIl * 32.0f, 0.0f, 1.0f);
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
        this.llllIIIIlIIIlIlllIll(7 - this.IllIIlllIIIIlllIIlIl * 8 / this.llllIIIlIlllIlIIIIIl);
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        if (this.llIIIlIlIllIIlIlIlII == this.IIIlIIlIIIIlllIlllII) {
            this.lIllllllIIllIlIlIlII *= 1.1;
            this.IIlllIIIlIlllIIlllII *= 1.1;
        }
        this.lIllllllIIllIlIlIlII *= 0.9599999785423279;
        this.llIIlllIIlllIIllIllI *= 0.9599999785423279;
        this.IIlllIIIlIlllIIlllII *= 0.9599999785423279;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
}
