package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;

class IIIlIIIlIlIIlllIIlll extends IIlllIIlllIIIlIlllII
{
    private lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl;
    
    public IIIlIIIlIlIIlllIIlll(final lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl) {
        super(llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        if (this.IllIIlllIIIIlllIIlIl && !this.llllIIIlIlllIlIIIIIl.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl()) {
            final double n = this.IlIlIlIlIlllllllllIl - this.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl;
            final double n2 = this.llIllIIIIIllIlIIIIlI - this.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII;
            final double n3 = this.IlIIIlIlIIIllIlIlIIl - this.llllIIIlIlllIlIIIIIl.lllllIlIIIlIlIIlllII;
            final double n4 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n2 * n2 + n3 * n3);
            final double n5 = n2 / n4;
            this.llllIIIlIlllIlIIIIIl.IIlIIIIIllIlIIIlIIll = this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl.IIlIIIIIllIlIIIlIIll, (float)(llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3, n) * 180.0 / 3.141592653589793) - 90.0f, 30.0f);
            this.llllIIIlIlllIlIIIIIl.lIllIlIIIllllllIIlII = this.llllIIIlIlllIlIIIIIl.IIlIIIIIllIlIIIlIIll;
            this.llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl(this.llllIIIlIlllIlIIIIIl.ag() + ((float)(this.IlIlIIIllIllIIIIIllI * this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI()) - this.llllIIIlIlllIlIIIIIl.ag()) * 0.125f);
            final double n6 = Math.sin((this.llllIIIlIlllIlIIIIIl.lllllIIIIIlIlIIIIIIl + this.llllIIIlIlllIlIIIIIl.IlllIIIIlIIIlIlIlIIl()) * 0.5) * 0.05;
            final double cos = Math.cos(this.llllIIIlIlllIlIIIIIl.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
            final double sin = Math.sin(this.llllIIIlIlllIlIIIIIl.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
            final lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            llllIIIlIlllIlIIIIIl.lIllllllIIllIlIlIlII += n6 * cos;
            final lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl2 = this.llllIIIlIlllIlIIIIIl;
            llllIIIlIlllIlIIIIIl2.IIlllIIIlIlllIIlllII += n6 * sin;
            final double n7 = Math.sin((this.llllIIIlIlllIlIIIIIl.lllllIIIIIlIlIIIIIIl + this.llllIIIlIlllIlIIIIIl.IlllIIIIlIIIlIlIlIIl()) * 0.75) * 0.05;
            final lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl3 = this.llllIIIlIlllIlIIIIIl;
            llllIIIlIlllIlIIIIIl3.llIIlllIIlllIIllIllI += n7 * (sin + cos) * 0.25;
            final lllIIIIlllllIlIIllIl llllIIIlIlllIlIIIIIl4 = this.llllIIIlIlllIlIIIIIl;
            llllIIIlIlllIlIIIIIl4.llIIlllIIlllIIllIllI += this.llllIIIlIlllIlIIIIIl.ag() * n5 * 0.1;
            final lIlIIlllIIlIIlIlllIl iIlllIlIIllIlIlIlIIl = this.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl();
            final double n8 = this.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl + n / n4 * 2.0;
            final double n9 = this.llllIIIlIlllIlIIIIIl.llllIlIllllIIlIIlIlI() + this.llllIIIlIlllIlIIIIIl.llIIIlIlIllIIlIlIlII + n5 / n4 * 1.0;
            final double n10 = this.llllIIIlIlllIlIIIIIl.lllllIlIIIlIlIIlllII + n3 / n4 * 2.0;
            double llIllIIIIIllIlIIIIlI = iIlllIlIIllIlIlIlIIl.llIllIIIIIllIlIIIIlI();
            double ilIIIlIlIIIllIlIlIIl = iIlllIlIIllIlIlIlIIl.IlIIIlIlIIIllIlIlIIl();
            double ilIlIIIllIllIIIIIllI = iIlllIlIIllIlIlIlIIl.IlIlIIIllIllIIIIIllI();
            if (!iIlllIlIIllIlIlIlIIl.IlIlIlIlIlllllllllIl()) {
                llIllIIIIIllIlIIIIlI = n8;
                ilIIIlIlIIIllIlIlIIl = n9;
                ilIlIIIllIllIIIIIllI = n10;
            }
            this.llllIIIlIlllIlIIIIIl.IIlllIlIIllIlIlIlIIl().llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI + (n8 - llIllIIIIIllIlIIIIlI) * 0.125, ilIIIlIlIIIllIlIlIIl + (n9 - ilIIIlIlIIIllIlIlIIl) * 0.125, ilIlIIIllIllIIIIIllI + (n10 - ilIlIIIllIllIIIIIllI) * 0.125, 10.0f, 40.0f);
            this.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI(true);
        }
        else {
            this.llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl(0.0f);
            this.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI(false);
        }
    }
}
