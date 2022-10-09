package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llIIIlIlIllIIlIlIlII extends IIIllllllIllIIIlllIl
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    private int IIIIIIIllllIlIIIIIII;
    
    protected llIIIlIlIllIIlIlIlII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3, final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        final double lIllllllIIllIlIlIlII = 0.0;
        this.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII;
        this.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        if (llllIIIIlIIIlIlllIll == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            this.llIIlIIIlIIIllIlIIIl = 0.0f;
            this.llIllIlIIIIllIlIIllI = 0.0f;
            this.lIlIlIIIllIIllIIIllI = 1.0f;
        }
        else {
            this.llIIlIIIlIIIllIlIIIl = 1.0f;
            this.llIllIlIIIIllIlIIllI = 0.0f;
            this.lIlIlIIIllIIllIIIllI = 0.0f;
        }
        this.llllIIIIlIIIlIlllIll(113);
        this.llllIIIIlIIIlIlllIll(0.01f, 0.01f);
        this.lIIIlllIIIllIIIllIII = 0.06f;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IIIIIIIllllIlIIIIIII = 40;
        this.llllIIIlIlllIlIIIIIl = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        final double lIllllllIIllIlIlIlII2 = 0.0;
        this.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII2;
        this.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII2;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII2;
    }
    
    @Override
    public int a_(final float n) {
        return (this.llllIIIIlIIIlIlllIll == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) ? super.a_(n) : 257;
    }
    
    @Override
    public float b_(final float n) {
        return (this.llllIIIIlIIIlIlllIll == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) ? super.b_(n) : 1.0f;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        if (this.llllIIIIlIIIlIlllIll == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            this.llIIlIIIlIIIllIlIIIl = 0.2f;
            this.llIllIlIIIIllIlIIllI = 0.3f;
            this.lIlIlIIIllIIllIIIllI = 1.0f;
        }
        else {
            this.llIIlIIIlIIIllIlIIIl = 1.0f;
            this.llIllIlIIIIllIlIIllI = 16.0f / (40 - this.IIIIIIIllllIlIIIIIII + 16);
            this.lIlIlIIIllIIllIIIllI = 4.0f / (40 - this.IIIIIIIllllIlIIIIIII + 8);
        }
        this.llIIlllIIlllIIllIllI -= this.lIIIlllIIIllIIIllIII;
        if (this.IIIIIIIllllIlIIIIIII-- > 0) {
            this.lIllllllIIllIlIlIlII *= 0.02;
            this.llIIlllIIlllIIllIllI *= 0.02;
            this.IIlllIIIlIlllIIlllII *= 0.02;
            this.llllIIIIlIIIlIlllIll(113);
        }
        else {
            this.llllIIIIlIIIlIlllIll(112);
        }
        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
        this.lIllllllIIllIlIlIlII *= 0.9800000190734863;
        this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
        this.IIlllIIIlIlllIIlllII *= 0.9800000190734863;
        if (this.llllIIIlIlllIlIIIIIl-- <= 0) {
            this.IllIllIIIIlIIlIlllII();
        }
        if (this.IIIIIllIIIIlIIIIllIl) {
            if (this.llllIIIIlIIIlIlllIll == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                this.IllIllIIIIlIIlIlllII();
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, 0.0, 0.0, 0.0, new int[0]);
            }
            else {
                this.llllIIIIlIIIlIlllIll(114);
            }
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this));
        final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
        if (illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll() || illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()) {
            double n = 0.0;
            if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() instanceof IlIIlllIIlIlllllIIlI) {
                n = IlIIlllIIlIlllllIIlI.IlIlIIIllIllIIIIIllI((int)ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl));
            }
            if (this.llIIIlIlIllIIlIlIlII < net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII) + 1 - n) {
                this.IllIllIIIIlIIlIlllII();
            }
        }
    }
}
