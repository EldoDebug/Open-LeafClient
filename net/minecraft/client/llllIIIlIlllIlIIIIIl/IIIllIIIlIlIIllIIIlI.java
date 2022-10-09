package net.minecraft.client.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class IIIllIIIlIlIIllIIIlI extends IIIllllllIllIIIlllIl
{
    protected IIIllIIIlIlIIllIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3, 0.0, 0.0, 0.0);
        this.lIllllllIIllIlIlIlII *= 0.30000001192092896;
        this.llIIlllIIlllIIllIllI = Math.random() * 0.20000000298023224 + 0.10000000149011612;
        this.IIlllIIIlIlllIIlllII *= 0.30000001192092896;
        this.llIIlIIIlIIIllIlIIIl = 1.0f;
        this.llIllIlIIIIllIlIIllI = 1.0f;
        this.lIlIlIIIllIIllIIIllI = 1.0f;
        this.llllIIIIlIIIlIlllIll(19 + this.IlIIllIIllIIllIIlIIl.nextInt(4));
        this.llllIIIIlIIIlIlllIll(0.01f, 0.01f);
        this.lIIIlllIIIllIIIllIII = 0.06f;
        this.llllIIIlIlllIlIIIIIl = (int)(8.0 / (Math.random() * 0.8 + 0.2));
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
        if (this.llllIIIlIlllIlIIIIIl-- <= 0) {
            this.IllIllIIIIlIIlIlllII();
        }
        if (this.IIIIIllIIIIlIIIIllIl) {
            if (Math.random() < 0.5) {
                this.IllIllIIIIlIIlIlllII();
            }
            this.lIllllllIIllIlIlIlII *= 0.699999988079071;
            this.IIlllIIIlIlllIIlllII *= 0.699999988079071;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
        llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)this.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
        if (illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll() || illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl()) {
            double iiIlIIIlIlIIlllIIlll;
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() instanceof IlIIlllIIlIlllllIIlI) {
                iiIlIIIlIlIIlllIIlll = 1.0f - IlIIlllIIlIlllllIIlI.IlIlIIIllIllIIIIIllI((int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl));
            }
            else {
                iiIlIIIlIlIIlllIIlll = llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll();
            }
            if (this.llIIIlIlIllIIlIlIlII < net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII) + iiIlIIIlIlIIlllIIlll) {
                this.IllIllIIIIlIIlIlllII();
            }
        }
    }
}
