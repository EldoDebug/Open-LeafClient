package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IIlllIIlIllIllIlIIll extends IIIllllllIllIIIlllIl
{
    protected IIlllIIlIllIllIlIIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, n4, n5, n6);
        this.llIIlIIIlIIIllIlIIIl = 1.0f;
        this.llIllIlIIIIllIlIIllI = 1.0f;
        this.lIlIlIIIllIIllIIIllI = 1.0f;
        this.llllIIIIlIIIlIlllIll(32);
        this.llllIIIIlIIIlIlllIll(0.02f, 0.02f);
        this.lIIIIlIIIIIlllIllIII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.6f + 0.2f;
        this.lIllllllIIllIlIlIlII = n4 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.llIIlllIIlllIIllIllI = n5 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.IIlllIIIlIlllIIlllII = n6 * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.llllIIIlIlllIlIIIIIl = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        this.llIIlllIIlllIIllIllI += 0.002;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.8500000238418579;
        this.llIIlllIIlllIIllIllI *= 0.8500000238418579;
        this.IIlllIIIlIlllIIlllII *= 0.8500000238418579;
        if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            this.IllIllIIIIlIIlIlllII();
        }
        if (this.llllIIIlIlllIlIIIIIl-- <= 0) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
}
