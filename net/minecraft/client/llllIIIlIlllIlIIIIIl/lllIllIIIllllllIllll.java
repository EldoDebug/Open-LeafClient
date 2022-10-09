package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class lllIllIIIllllllIllll extends IIIllllllIllIIIlllIl
{
    protected lllIllIIIllllllIllll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final double lIllllllIIllIlIlIlII, final double llIIlllIIlllIIllIllI, final double iIlllIIIlIlllIIlllII) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.lIllllllIIllIlIlIlII *= 0.30000001192092896;
        this.llIIlllIIlllIIllIllI = Math.random() * 0.20000000298023224 + 0.10000000149011612;
        this.IIlllIIIlIlllIIlllII *= 0.30000001192092896;
        this.llIIlIIIlIIIllIlIIIl = 1.0f;
        this.llIllIlIIIIllIlIIllI = 1.0f;
        this.lIlIlIIIllIIllIIIllI = 1.0f;
        this.llllIIIIlIIIlIlllIll(19);
        this.llllIIIIlIIIlIlllIll(0.01f, 0.01f);
        this.llllIIIlIlllIlIIIIIl = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.lIIIlllIIIllIIIllIII = 0.0f;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
        this.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        this.llIIlllIIlllIIllIllI -= this.lIIIlllIIIllIIIllIII;
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.9800000190734863;
        this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
        this.IIlllIIIlIlllIIlllII *= 0.9800000190734863;
        final int n = 60 - this.llllIIIlIlllIlIIIIIl;
        final float n2 = n * 0.001f;
        this.llllIIIIlIIIlIlllIll(n2, n2);
        this.llllIIIIlIIIlIlllIll(19 + n % 4);
        if (this.llllIIIlIlllIlIIIIIl-- <= 0) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
}
