package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIIllIIllIIllIIlIIl extends IIIllllllIllIIIlllIl
{
    float llllIIIIlIIIlIlllIll;
    
    protected IlIIllIIllIIllIIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        this(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6, 2.0f);
    }
    
    protected IlIIllIIllIIllIIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6, final float n7) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.lIllllllIIllIlIlIlII *= 0.009999999776482582;
        this.llIIlllIIlllIIllIllI *= 0.009999999776482582;
        this.IIlllIIIlIlllIIlllII *= 0.009999999776482582;
        this.llIIlllIIlllIIllIllI += 0.2;
        this.llIIlIIIlIIIllIlIIIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(((float)n4 + 0.0f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.llIllIlIIIIllIlIIllI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(((float)n4 + 0.33333334f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.lIlIlIIIllIIllIIIllI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(((float)n4 + 0.6666667f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.lIIIIlIIIIIlllIllIII *= 0.75f;
        this.lIIIIlIIIIIlllIllIII *= n7;
        this.llllIIIIlIIIlIlllIll = this.lIIIIlIIIIIlllIllIII;
        this.llllIIIlIlllIlIIIIIl = 6;
        this.lIIIIlIlIllllIIlIllI = false;
        this.llllIIIIlIIIlIlllIll(64);
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
        if (this.llIIIlIlIllIIlIlIlII == this.IIIlIIlIIIIlllIlllII) {
            this.lIllllllIIllIlIlIlII *= 1.1;
            this.IIlllIIIlIlllIIlllII *= 1.1;
        }
        this.lIllllllIIllIlIlIlII *= 0.6600000262260437;
        this.llIIlllIIlllIIllIllI *= 0.6600000262260437;
        this.IIlllIIIlIlllIIlllII *= 0.6600000262260437;
        if (this.IIIIIllIIIIlIIIIllIl) {
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
    }
}
