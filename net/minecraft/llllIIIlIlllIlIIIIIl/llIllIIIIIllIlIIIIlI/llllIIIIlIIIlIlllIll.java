package net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llllIIIIlIIIlIlllIll extends IlIlIlIlIlllllllllIl
{
    private int IlIlIlIlIlllllllllIl;
    public long llllIIIIlIIIlIlllIll;
    private int llIllIIIIIllIlIIIIlI;
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIlIlIlllllllllIl(n, n2, n3, 0.0f, 0.0f);
        this.IlIlIlIlIlllllllllIl = 2;
        this.llllIIIIlIIIlIlllIll = this.IlIIllIIllIIllIIlIIl.nextLong();
        this.llIllIIIIIllIlIIIIlI = this.IlIIllIIllIIllIIlIIl.nextInt(3) + 1;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && illlllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doFireTick") && (illlllllIIIlIIIlIlII.lllIllIIIllllllIllll() == IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI || illlllllIIIlIIIlIlII.lllIllIIIllllllIllll() == IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, 10)) {
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll());
            }
            for (int i = 0; i < 4; ++i) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl.nextInt(3) - 1, this.IlIIllIIllIIllIIlIIl.nextInt(3) - 1, this.IlIIllIIllIIllIIlIIl.nextInt(3) - 1);
                if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll)) {
                    illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll());
                }
            }
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.IlIlIlIlIlllllllllIl == 2) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, "ambient.weather.thunder", 10000.0f, 0.8f + this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f);
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, "random.explode", 2.0f, 0.5f + this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.2f);
        }
        --this.IlIlIlIlIlllllllllIl;
        if (this.IlIlIlIlIlllllllllIl < 0) {
            if (this.llIllIIIIIllIlIIIIlI == 0) {
                this.IllIllIIIIlIIlIlllII();
            }
            else if (this.IlIlIlIlIlllllllllIl < -this.IlIIllIIllIIllIIlIIl.nextInt(10)) {
                --this.llIllIIIIIllIlIIIIlI;
                this.IlIlIlIlIlllllllllIl = 1;
                this.llllIIIIlIIIlIlllIll = this.IlIIllIIllIIllIIlIIl.nextLong();
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doFireTick") && this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, 10) && this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.IlIIIlIlIIIllIlIlIIl(this.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) {
                    this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI.lllIllIIIllllllIllll());
                }
            }
        }
        if (this.IlIlIlIlIlllllllllIl >= 0) {
            if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(2);
            }
            else {
                final double n = 3.0;
                final List ilIlIlIlIlllllllllIl2 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl - n, this.llIIIlIlIllIIlIlIlII - n, this.lllllIlIIIlIlIIlllII - n, this.IIlllIlIIllIlIlIlIIl + n, this.llIIIlIlIllIIlIlIlII + 6.0 + n, this.lllllIlIIIlIlIIlllII + n));
                for (int i = 0; i < ilIlIlIlIlllllllllIl2.size(); ++i) {
                    ilIlIlIlIlllllllllIl2.get(i).llllIIIIlIIIlIlllIll(this);
                }
            }
        }
    }
    
    @Override
    protected void a_() {
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
    }
}
