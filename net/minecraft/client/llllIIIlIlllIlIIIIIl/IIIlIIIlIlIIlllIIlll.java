package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIlIIIlIlIIlllIIlll extends IIIllllllIllIIIlllIl
{
    float llllIIIIlIIIlIlllIll;
    
    protected IIIlIIIlIlIIlllIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6, 1.0f);
    }
    
    protected IIIlIIIlIlIIlllIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.lIllllllIIllIlIlIlII *= 0.10000000149011612;
        this.llIIlllIIlllIIllIllI *= 0.10000000149011612;
        this.IIlllIIIlIlllIIlllII *= 0.10000000149011612;
        this.lIllllllIIllIlIlIlII += n4 * 0.4;
        this.llIIlllIIlllIIllIllI += n5 * 0.4;
        this.IIlllIIIlIlllIIlllII += n6 * 0.4;
        final float llIIlIIIlIIIllIlIIIl = (float)(Math.random() * 0.30000001192092896 + 0.6000000238418579);
        this.lIlIlIIIllIIllIIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = llIIlIIIlIIIllIlIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIIlIIIIIlllIllIII *= 0.75f;
        this.lIIIIlIIIIIlllIllIII *= n7;
        this.llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.llllIIIlIlllIlIIIIIl *= (int)n7;
        this.lIIIIlIlIllllIIlIllI = false;
        this.llllIIIIlIIIlIlllIll(65);
        this.IIllIIllIIIlIlIIIIlI();
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
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.llIllIlIIIIllIlIIllI *= (float)0.96;
        this.lIlIlIIIllIIllIIIllI *= (float)0.9;
        this.lIllllllIIllIlIlIlII *= 0.699999988079071;
        this.llIIlllIIlllIIllIllI *= 0.699999988079071;
        this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        this.llIIlllIIlllIIllIllI -= 0.019999999552965164;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
}
