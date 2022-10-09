package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public abstract class IIlllIlIIllIlIlIlIIl extends llIIlIIIlIIIllIlIIIl implements IllIlIIllIllIIlIllII
{
    public IIlllIlIIllIlIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIlIlllIlIIIIIl = 5;
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        this.W();
        if (this.b_(1.0f) > 0.5f) {
            this.b += 2;
        }
        super.IIIlIIIlIlIIlllIIlll();
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    @Override
    protected String lIIlIIIlIllIlIllIIIl() {
        return "game.hostile.swim";
    }
    
    @Override
    protected String lIlIIlllIIlIIlIlllIl() {
        return "game.hostile.swim.splash";
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n)) {
            final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
            return this.IIllIIllIIIlIlIIIIlI == llIIlIIIlIIIllIlIIIl || this.IIIlIIIlIlIIlllIIlll == llIIlIIIlIIIllIlIIIl || true;
        }
        return false;
    }
    
    @Override
    protected String O() {
        return "game.hostile.hurt";
    }
    
    @Override
    protected String P() {
        return "game.hostile.die";
    }
    
    @Override
    protected String IlIllIlIlIIIlIlIlIII(final int n) {
        return (n > 4) ? "game.hostile.hurt.fall.big" : "game.hostile.hurt.fall.small";
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        float n = (float)this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).IlIlIIIllIllIIIIIllI();
        int n2 = 0;
        if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
            n += net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.n(), ((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI).Y());
            n2 += net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this);
        }
        final boolean llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), n);
        if (llllIIIIlIIIlIlllIll) {
            if (n2 > 0) {
                llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(-net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f) * n2 * 0.5f, 0.1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f) * n2 * 0.5f);
                this.lIllllllIIllIlIlIlII *= 0.6;
                this.IIlllIIIlIlllIIlllII *= 0.6;
            }
            final int ilIlIlIlIlllllllllIl = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this);
            if (ilIlIlIlIlllllllllIl > 0) {
                llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl * 4);
            }
            this.llllIIIIlIIIlIlllIll(this, llIllIIIIIllIlIIIIlI);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public float llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return 0.5f - this.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII(ilIlIlIlIlllllllllIl);
    }
    
    protected boolean t_() {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.lllllIlIIIlIlIIlllII);
        if (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl) > this.IlIIllIIllIIllIIlIIl.nextInt(32)) {
            return false;
        }
        int n = this.IlllllllIIIlIIIlIlII.IlIlIIIllIIllIlllllI(ilIlIlIlIlllllllllIl);
        if (this.IlllllllIIIlIIIlIlII.IIlIIIIIllIlIIIlIIll()) {
            final int llIllIlIlIIIIIIIllII = this.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII();
            this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(10);
            n = this.IlllllllIIIlIIIlIlII.IlIlIIIllIIllIlllllI(ilIlIlIlIlllllllllIl);
            this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llIllIlIlIIIIIIIllII);
        }
        return n <= this.IlIIllIIllIIllIIlIIl.nextInt(8);
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() != net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll && this.t_() && super.lIlIlIIIllIIllIIIllI();
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.X().IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    protected boolean z() {
        return true;
    }
}
