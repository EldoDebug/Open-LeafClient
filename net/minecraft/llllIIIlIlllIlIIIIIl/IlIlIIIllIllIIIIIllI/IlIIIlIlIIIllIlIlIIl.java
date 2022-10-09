package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIIIlIlIIIllIlIlIIl extends IIlllIlIIllIlIlIlIIl
{
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    private int llIllIIIIIllIlIIIIlI;
    private int t;
    private int u;
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llIllIIIIIllIlIIIIlI = 30;
        this.t = 3;
        this.u = 0;
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new lIIIlllIIIllIIIllIII(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(this, net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.llIIlIIIlIIIllIlIIIl.class, 6.0f, 1.0, 1.2));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new IlIlIlIlIlllllllllIl(this, 1.0, false));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IlIIllIIllIIllIIlIIl(this, 0.8));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IIlIIIIIllIlIIIlIIll(this, llllIIIIlIIIlIlllIll.class, true));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IlIlIIIlIIlIlIIlllIl(this, false, new Class[0]));
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.25);
    }
    
    @Override
    public int llIlIIIIllIlIIlIlIII() {
        return (this.IIlllIIIlIlllIIlllII() == null) ? 3 : (3 + (int)(this.N() - 1.0f));
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
        super.IlIIIlIlIIIllIlIlIIl(n, n2);
        this.IlIlIlIlIlllllllllIl += (int)(n * 1.5f);
        if (this.IlIlIlIlIlllllllllIl > this.llIllIIIIIllIlIIIIlI - 5) {
            this.IlIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI - 5;
        }
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)(-1));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, (Object)0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        if (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17) == 1) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("powered", true);
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Fuse", (short)this.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ExplosionRadius", (byte)this.t);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ignited", this.ap());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(17, (byte)(byte)(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("powered") ? 1 : 0));
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Fuse", 99)) {
            this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("Fuse");
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ExplosionRadius", 99)) {
            this.t = iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("ExplosionRadius");
        }
        if (iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("ignited")) {
            this.aq();
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (this.llllIllllIllllIlIlII()) {
            this.llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl;
            if (this.ap()) {
                this.llllIIIIlIIIlIlllIll(1);
            }
            final int ao = this.ao();
            if (ao > 0 && this.IlIlIlIlIlllllllllIl == 0) {
                this.llllIIIIlIIIlIlllIll("creeper.primed", 1.0f, 0.5f);
            }
            this.IlIlIlIlIlllllllllIl += ao;
            if (this.IlIlIlIlIlllllllllIl < 0) {
                this.IlIlIlIlIlllllllllIl = 0;
            }
            if (this.IlIlIlIlIlllllllllIl >= this.llIllIIIIIllIlIIIIlI) {
                this.IlIlIlIlIlllllllllIl = this.llIllIIIIIllIlIIIIlI;
                this.at();
            }
        }
        super.IIllIIllIIIlIlIIIIlI();
    }
    
    @Override
    protected String O() {
        return "mob.creeper.say";
    }
    
    @Override
    protected String P() {
        return "mob.creeper.death";
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof llllllIllIllIlIllllI) {
            final int llllIIIIlIIIlIlllIll = net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.au);
            this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll + this.IlIIllIIllIIllIIlIIl.nextInt(net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.aF) - llllIIIIlIIIlIlllIll + 1)), 1);
        }
        else if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof IlIIIlIlIIIllIlIlIIl && lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() != this && ((IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).lIIIIlIIIIIlllIllIII() && ((IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).ar()) {
            ((IlIIIlIlIIIllIlIlIIl)lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl()).as();
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab, 1, 4), 0.0f);
        }
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return true;
    }
    
    public boolean lIIIIlIIIIIlllIllIII() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17) == 1;
    }
    
    public float IlIIIlIlIIIllIlIlIIl(final float n) {
        return (this.llllIIIIlIIIlIlllIll + (this.IlIlIlIlIlllllllllIl - this.llllIIIIlIIIlIlllIll) * n) / (this.llIllIIIIIllIlIIIIlI - 2);
    }
    
    @Override
    protected net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI;
    }
    
    public int ao() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(17, 1);
    }
    
    @Override
    protected boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIIIlIlIIIllIlIlIIl) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl + 0.5, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII + 0.5, "fire.ignite", 1.0f, this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.4f + 0.8f);
            llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII();
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.aq();
                ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(1, llllIIIIlIIIlIlllIll);
                return true;
            }
        }
        return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    private void at() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, this.t * (this.lIIIIlIIIIIlllIllIII() ? 2.0f : 1.0f), this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing"));
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    public boolean ap() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18) != 0;
    }
    
    public void aq() {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, 1);
    }
    
    public boolean ar() {
        return this.u < 1 && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doMobLoot");
    }
    
    public void as() {
        ++this.u;
    }
}
