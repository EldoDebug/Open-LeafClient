package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class lIIIIIlIlIIIlIIIIlIl extends IIIllllllIllIIIlllIl
{
    protected lIIIIIlIlIIIlIIIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(illlllllIIIlIIIlIlII, n, n2 - 0.125, n3, n4, n5, n6);
        this.llIIlIIIlIIIllIlIIIl = 0.4f;
        this.llIllIlIIIIllIlIIllI = 0.4f;
        this.lIlIlIIIllIIllIIIllI = 0.7f;
        this.llllIIIIlIIIlIlllIll(0);
        this.llllIIIIlIIIlIlllIll(0.01f, 0.01f);
        this.lIIIIlIIIIIlllIllIII *= this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.6f + 0.2f;
        this.lIllllllIIllIlIlIlII = n4 * 0.0;
        this.llIIlllIIlllIIllIllI = n5 * 0.0;
        this.IIlllIIIlIlllIIlllII = n6 * 0.0;
        this.llllIIIlIlllIlIIIIIl = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(this)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            this.IllIllIIIIlIIlIlllII();
        }
        if (this.llllIIIlIlllIlIIIIIl-- <= 0) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
}
