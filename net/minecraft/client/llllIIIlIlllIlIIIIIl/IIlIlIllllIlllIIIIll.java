package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIlIlIllllIlllIIIIll extends IIIllllllIllIIIlllIl
{
    float llllIIIIlIIIlIlllIll;
    
    protected IIlIlIllllIlllIIIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6, 1.0f);
    }
    
    protected IIlIlIllllIlllIIIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        this.lIllllllIIllIlIlIlII *= 0.10000000149011612;
        this.llIIlllIIlllIIllIllI *= 0.10000000149011612;
        this.IIlllIIIlIlllIIlllII *= 0.10000000149011612;
        this.lIllllllIIllIlIlIlII += n4;
        this.llIIlllIIlllIIllIllI += n5;
        this.IIlllIIIlIlllIIlllII += n6;
        final float llIIlIIIlIIIllIlIIIl = 1.0f - (float)(Math.random() * 0.30000001192092896);
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIIlIIIIIlllIllIII *= 0.75f;
        this.lIIIIlIIIIIlllIllIII *= n7;
        this.llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.llllIIIlIlllIlIIIIIl *= (int)n7;
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
        this.llIIlllIIlllIIllIllI -= 0.03;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.9900000095367432;
        this.llIIlllIIlllIIllIllI *= 0.9900000095367432;
        this.IIlllIIIlIlllIIlllII *= 0.9900000095367432;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
}
