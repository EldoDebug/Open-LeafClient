package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIlIIIIlllIlllllIlII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IlllllllIIIlIIIlIlII extends IIlllIIlIllIllIlIIll
{
    private int IlIlIlIlIlllllllllIl;
    net.minecraft.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll;
    private int llIllIIIIIllIlIIIIlI;
    private int t;
    
    public IlllllllIIIlIIIlIlII(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(1.4f, 2.9f);
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIlIlIlllllllllIl(this, 1.0, true));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IIlllIIIlIlllIIlllII(this, 0.9, 32.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new lllllIlIIIlIlIIlllII(this, 0.6, true));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new llIIlllIIlllIIllIllI(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IIIlIIlIIIIlllIlllII(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IlIIllIIllIIllIIlIIl(this, 0.6));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 6.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IlIlIIIlIIlIlIIlllIl(this, false, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(3, new IIlIIIIlllIlllllIlII(this, IlIllIlIlIIIlIlIlIII.class, 10, false, true, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IllIlIIllIllIIlIllII.c_));
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
    }
    
    @Override
    protected void i() {
        final int ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl - 1;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        if (ilIlIlIlIlllllllllIl <= 0) {
            this.IlIlIlIlIlllllllllIl = 70 + this.IlIIllIIllIIllIIlIIl.nextInt(50);
            this.llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll().llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this), 32);
            if (this.llllIIIIlIIIlIlllIll == null) {
                this.IlIlIIIIIIlllIlIllIl();
            }
            else {
                this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(), (int)(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl() * 0.6f));
            }
        }
        super.i();
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(100.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.25);
    }
    
    @Override
    protected int lIlIlIIIllIIllIIIllI(final int n) {
        return n;
    }
    
    @Override
    protected void IlIllIlIlIIIlIlIlIII(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IllIlIIllIllIIlIllII && !(llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl) && this.B().nextInt(20) == 0) {
            this.IlIlIlIlIlllllllllIl((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI);
        }
        super.IlIllIlIlIIIlIlIlIII(llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        if (this.llIllIIIIIllIlIIIIlI > 0) {
            --this.llIllIIIIIllIlIIIIlI;
        }
        if (this.t > 0) {
            --this.t;
        }
        if (this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII > 2.500000277905201E-7 && this.IlIIllIIllIIllIIlIIl.nextInt(5) == 0) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII - 0.20000000298023224), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII)));
            if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIIIIIIlllIllIlIlI, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * this.IllIllIIIIlIIlIlllII, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.1, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * this.IllIllIIIIlIIlIlllII, 4.0 * (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5), 0.5, (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * 4.0, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl));
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final Class clazz) {
        return (!this.ap() || !llllIIIIlIIIlIlllIll.class.isAssignableFrom(clazz)) && clazz != IlIIIlIlIIIllIlIlIIl.class && super.llllIIIIlIIIlIlllIll(clazz);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("PlayerCreated", this.ap());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lIlIlIIIllIIllIIIllI(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("PlayerCreated"));
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = 10;
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)4);
        final boolean llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), (float)(7 + this.IlIIllIIllIIllIIlIIl.nextInt(15)));
        if (llllIIIIlIIIlIlllIll) {
            llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI += 0.4000000059604645;
            this.llllIIIIlIIIlIlllIll(this, llIllIIIIIllIlIIIIlI);
        }
        this.llllIIIIlIIIlIlllIll("mob.irongolem.throw", 1.0f, 1.0f);
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 4) {
            this.llIllIIIIIllIlIIIIlI = 10;
            this.llllIIIIlIIIlIlllIll("mob.irongolem.throw", 1.0f, 1.0f);
        }
        else if (b == 11) {
            this.t = 400;
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    public net.minecraft.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public int an() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.t = (b ? 400 : 0);
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)11);
    }
    
    @Override
    protected String O() {
        return "mob.irongolem.hit";
    }
    
    @Override
    protected String P() {
        return "mob.irongolem.death";
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.irongolem.walk", 1.0f, 1.0f);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        for (int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(3), i = 0; i < nextInt; ++i) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll), 1, (float)net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
        }
        for (int n2 = 3 + this.IlIIllIIllIIllIIlIIl.nextInt(3), j = 0; j < n2; ++j) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, 1);
        }
    }
    
    public int ao() {
        return this.t;
    }
    
    public boolean ap() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x1) != 0x0;
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll | 0x1));
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFE));
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        if (!this.ap() && this.IlIIlllIIlIlllllIIlI != null && this.llllIIIIlIIIlIlllIll != null) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI.s_(), -5);
        }
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
    }
}
