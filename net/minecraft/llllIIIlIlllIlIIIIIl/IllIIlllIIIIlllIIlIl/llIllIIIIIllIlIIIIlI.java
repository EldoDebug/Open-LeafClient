package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    private IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    
    public llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.5f, 0.9f);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, new Byte((byte)0));
    }
    
    @Override
    protected float Z() {
        return 0.1f;
    }
    
    @Override
    protected float aa() {
        return super.aa() * 0.95f;
    }
    
    @Override
    protected String e() {
        return (this.lIIIIlIIIIIlllIllIII() && this.IlIIllIIllIIllIIlIIl.nextInt(4) != 0) ? null : "mob.bat.idle";
    }
    
    @Override
    protected String O() {
        return "mob.bat.hurt";
    }
    
    @Override
    protected String P() {
        return "mob.bat.death";
    }
    
    @Override
    public boolean g_() {
        return false;
    }
    
    @Override
    protected void IlIllIlIlIIIlIlIlIII(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
    }
    
    @Override
    protected void ai() {
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(6.0);
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x1) != 0x0;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll | 0x1));
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFE));
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (this.lIIIIlIIIIIlllIllIII()) {
            final double lIllllllIIllIlIlIlII = 0.0;
            this.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII;
            this.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII;
            this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
            this.llIIIlIlIllIIlIlIlII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII) + 1.0 - this.IlIllllIIlIIlIlIlIll;
        }
        else {
            this.llIIlllIIlllIIllIllI *= 0.6000000238418579;
        }
    }
    
    @Override
    protected void i() {
        super.i();
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        if (this.lIIIIlIIIIIlllIllIII()) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                this.llllIIIIlIIIlIlllIll(false);
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1015, ilIlIlIlIlllllllllIl, 0);
            }
            else {
                if (this.IlIIllIIllIIllIIlIIl.nextInt(200) == 0) {
                    this.lIIlllIlllllIIlllIll = (float)this.IlIIllIIllIIllIIlIIl.nextInt(360);
                }
                if (this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, 4.0) != null) {
                    this.llllIIIIlIIIlIlllIll(false);
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1015, ilIlIlIlIlllllllllIl, 0);
                }
            }
        }
        else {
            if (this.llllIIIIlIIIlIlllIll != null && (!this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll) || this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() < 1)) {
                this.llllIIIIlIIIlIlllIll = null;
            }
            if (this.llllIIIIlIIIlIlllIll == null || this.IlIIllIIllIIllIIlIIl.nextInt(30) == 0 || this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl((int)this.IIlllIlIIllIlIlIlIIl, (int)this.llIIIlIlIllIIlIlIlII, (int)this.lllllIlIIIlIlIIlllII) < 4.0) {
                this.llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl((int)this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextInt(7) - this.IlIIllIIllIIllIIlIIl.nextInt(7), (int)this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextInt(6) - 2, (int)this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextInt(7) - this.IlIIllIIllIIllIIlIIl.nextInt(7));
            }
            final double n = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() + 0.5 - this.IIlllIlIIllIlIlIlIIl;
            final double n2 = this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() + 0.1 - this.llIIIlIlIllIIlIlIlII;
            final double n3 = this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() + 0.5 - this.lllllIlIIIlIlIIlllII;
            this.lIllllllIIllIlIlIlII += (Math.signum(n) * 0.5 - this.lIllllllIIllIlIlIlII) * 0.10000000149011612;
            this.llIIlllIIlllIIllIllI += (Math.signum(n2) * 0.699999988079071 - this.llIIlllIIlllIIllIllI) * 0.10000000149011612;
            this.IIlllIIIlIlllIIlllII += (Math.signum(n3) * 0.5 - this.IIlllIIIlIlllIIlllII) * 0.10000000149011612;
            final float llllIIIlIlllIlIIIIIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl((float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlllIIIlIlllIIlllII, this.lIllllllIIllIlIlIlII) * 180.0 / 3.141592653589793) - 90.0f - this.IIlIIIIIllIlIIIlIIll);
            this.l = 0.5f;
            this.IIlIIIIIllIlIIIlIIll += llllIIIlIlllIlIIIIIl;
            if (this.IlIIllIIllIIllIIlIIl.nextInt(100) == 0 && this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) {
                this.llllIIIIlIIIlIlllIll(true);
            }
        }
    }
    
    @Override
    protected boolean c_() {
        return false;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final double n, final boolean b, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
    }
    
    @Override
    public boolean IIlIlllIlIlllIlIllll() {
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.lIIIIlIIIIIlllIllIII()) {
            this.llllIIIIlIIIlIlllIll(false);
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("BatFlags"));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("BatFlags", this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16));
    }
    
    @Override
    public boolean lIlIlIIIllIIllIIIllI() {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.lllllIlIIIlIlIIlllII);
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= this.IlllllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl()) {
            return false;
        }
        final int ilIlIIIllIIllIlllllI = this.IlllllllIIIlIIIlIlII.IlIlIIIllIIllIlllllI(ilIlIlIlIlllllllllIl);
        int n = 4;
        if (this.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.IIllllIIIlIIIIIIllIl())) {
            n = 7;
        }
        else if (this.IlIIllIIllIIllIIlIIl.nextBoolean()) {
            return false;
        }
        return ilIlIIIllIIllIlllllI <= this.IlIIllIIllIIllIIlIIl.nextInt(n) && super.lIlIlIIIllIIllIIIllI();
    }
    
    private boolean llllIIIIlIIIlIlllIll(final Calendar calendar) {
        return (calendar.get(2) + 1 == 10 && calendar.get(5) >= 20) || (calendar.get(2) + 1 == 11 && calendar.get(5) <= 3);
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return this.IlIllllIIlIIlIlIlIll / 2.0f;
    }
}
