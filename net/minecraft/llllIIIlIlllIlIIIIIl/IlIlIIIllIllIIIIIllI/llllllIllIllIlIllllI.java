package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llllllIllIllIlIllllI extends IIlllIlIIllIlIlIlIIl implements net.minecraft.llllIIIlIlllIlIIIIIl.llllllIllIllIlIllllI
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    private IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl;
    
    public llllllIllIllIlIllllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = new llllIIIIlIIIlIlllIll(this, 1.0, 20, 60, 15.0f);
        this.IlIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 1.2, false);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new IllIllIIIIlIIlIlllII(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new IIlllIIlIllIllIlIIll(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this, IIIllllllIllIIIlllIl.class, 6.0f, 1.0, 1.2));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new lllllIIIIIlIlIIIIIIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, false, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, true));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(3, new IIlIIIIIllIlIIIlIIll(this, net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlllllllIIIlIIIlIlII.class, true));
        if (illlllllIIIlIIIlIlII != null && !illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.lIIIIlIIIIIlllIllIII();
        }
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.25);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(13, new Byte((byte)0));
    }
    
    @Override
    protected String e() {
        return "mob.skeleton.say";
    }
    
    @Override
    protected String O() {
        return "mob.skeleton.hurt";
    }
    
    @Override
    protected String P() {
        return "mob.skeleton.death";
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.skeleton.step", 0.15f, 1.0f);
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (super.llllIIllllIlIlIIIIll(llIllIIIIIllIlIIIIlI)) {
            if (this.ao() == 1 && llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                ((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll(new IlIIIlIlIIIllIlIlIIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl.llllllIllIllIlIllllI, 200));
            }
            return true;
        }
        return false;
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII Y() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI() && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final float b_ = this.b_(1.0f);
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, (double)Math.round(this.llIIIlIlIllIIlIlIlII), this.lllllIlIIIlIlIIlllII);
            if (b_ > 0.5f && this.IlIIllIIllIIllIIlIIl.nextFloat() * 30.0f < (b_ - 0.4f) * 2.0f && this.IlllllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl)) {
                boolean b = true;
                final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(4);
                if (llIllIIIIIllIlIIIIlI != null) {
                    if (llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl()) {
                        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl() + this.IlIIllIIllIIllIIlIIl.nextInt(2));
                        if (llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl() >= llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII()) {
                            this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
                            this.llllIIIIlIIIlIlllIll(4, (lllIIIIlIlIllIIlIIIl)null);
                        }
                    }
                    b = false;
                }
                if (b) {
                    this.IlIlIIIllIllIIIIIllI(8);
                }
            }
        }
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.ao() == 1) {
            this.llllIIIIlIIIlIlllIll(0.72f, 2.535f);
        }
        super.IIIlIIIlIlIIlllIIlll();
    }
    
    @Override
    public void lIIllIIIllllIlllIllI() {
        super.lIIllIIIllllIlllIllI();
        if (this.IIIlIIIlIlIIlllIIlll instanceof llIIlIIIlIIIllIlIIIl) {
            this.lIllIlIIIllllllIIlII = ((llIIlIIIlIIIllIlIIIl)this.IIIlIIIlIlIIlllIIlll).lIllIlIIIllllllIIlII;
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        if (lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll && lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
            final double n = llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
            final double n2 = llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII;
            if (n * n + n2 * n2 >= 2500.0) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIlIIlIlIIlllIl);
            }
        }
        else if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).lIIIIlIIIIIlllIllIII() && ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).ar()) {
            ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).as();
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 1, (int)((this.ao() == 1) ? 1 : 0)), 0.0f);
        }
    }
    
    @Override
    protected net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        if (this.ao() == 1) {
            for (int n2 = this.IlIIllIIllIIllIIlIIl.nextInt(3 + n) - 1, i = 0; i < n2; ++i) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIIlIIIIIlllIllIII, 1);
            }
        }
        else {
            for (int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(3 + n), j = 0; j < nextInt; ++j) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl, 1);
            }
        }
        for (int nextInt2 = this.IlIIllIIllIIllIIlIIl.nextInt(3 + n), k = 0; k < nextInt2; ++k) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.b, 1);
        }
    }
    
    @Override
    protected void Q() {
        if (this.ao() == 1) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 1, 1), 0.0f);
        }
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl));
    }
    
    @Override
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        llllIIIIlIIIlIlllIll = super.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, llllIIIIlIIIlIlllIll);
        if (this.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII instanceof llIIlllIIlllIIllIllI && this.B().nextInt(5) > 0) {
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, this.IlIlIlIlIlllllllllIl);
            this.llllIIIIlIIIlIlllIll(1);
            this.llllIIIIlIIIlIlllIll(0, new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IIlllIIlIllIllIlIIll));
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(4.0);
        }
        else {
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, this.llllIIIIlIIIlIlllIll);
            this.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI);
            this.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI);
        }
        this.IlIlIlIlIlllllllllIl(this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.55f * ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl());
        if (this.llIllIIIIIllIlIIIIlI(4) == null) {
            final Calendar iIllllIIIlIIIIIIllIl = this.IlllllllIIIlIIIlIlII.IIllllIIIlIIIIIIllIl();
            if (iIllllIIIlIIIIIIllIl.get(2) + 1 == 10 && iIllllIIIlIIIIIIllIl.get(5) == 31 && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.25f) {
                this.llllIIIIlIIIlIlllIll(4, new lllIIIIlIlIllIIlIIIl((this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.1f) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.d : net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI));
                this.IlIlIIIllIIllIlllllI[4] = 0.0f;
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
        final lllIIIIlIlIllIIlIIIl n = this.n();
        if (n != null && n.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IllIIlllIIIIlllIIlIl) {
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, this.llllIIIIlIIIlIlllIll);
        }
        else {
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, this.IlIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
        final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, this, lllIIIIlllllIlIIllIl, 1.6f, (float)(14 - this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll() * 4));
        final int llllIIIIlIIIlIlllIll2 = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.IIlllIlIIllIlIlIlIIl, this.n());
        final int llllIIIIlIIIlIlllIll3 = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl.IIlllIlIIllIlIlIlIIl, this.n());
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n * 2.0f + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.25 + this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll() * 0.11f);
        if (llllIIIIlIIIlIlllIll2 > 0) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl() + llllIIIIlIIIlIlllIll2 * 0.5 + 0.5);
        }
        if (llllIIIIlIIIlIlllIll3 > 0) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
        }
        if (net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(net.minecraft.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IIlllIlIIllIlIlIlIIl, this.n()) > 0 || this.ao() == 1) {
            llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(100);
        }
        this.llllIIIIlIIIlIlllIll("random.bow", 1.0f, 1.0f / (this.B().nextFloat() * 0.4f + 0.8f));
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
    }
    
    public int ao() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(13);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(13, (byte)n);
        this.IIIllIIIlIlIIllIIIlI = (n == 1);
        if (n == 1) {
            this.llllIIIIlIIIlIlllIll(0.72f, 2.535f);
        }
        else {
            this.llllIIIIlIIIlIlllIll(0.6f, 1.95f);
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SkeletonType", 99)) {
            this.llllIIIIlIIIlIlllIll((int)iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("SkeletonType"));
        }
        this.lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SkeletonType", (byte)this.ao());
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        super.llllIIIIlIIIlIlllIll(n, lllIIIIlIlIllIIlIIIl);
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && n == 0) {
            this.lIIIIlIIIIIlllIllIII();
        }
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return (this.ao() == 1) ? super.llllIlIllllIIlIIlIlI() : 1.74f;
    }
    
    @Override
    public double IIllIIIlIIlIlIlIIIII() {
        return this.e_() ? 0.0 : -0.35;
    }
}
