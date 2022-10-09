package net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;

public class IIIllllllIllIIIlllIl extends IIIlIIlIIIIlllIlllII
{
    private float v;
    private float w;
    private boolean x;
    private boolean y;
    private float z;
    private float A;
    
    public IIIllllllIllIIIlllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.6f, 0.8f);
        ((IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).llllIIIIlIIIlIlllIll(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(1, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, this.u);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(3, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII(this, 0.4f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(4, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(this, 1.0, true));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IlIlIIIIIIlllIlIllIl(this, 1.0, 10.0f, 2.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new IIlllIlIIllIlIlIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(8, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(this, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(9, new lllllIIIIIlIlIIIIIIl(this, llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(9, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IIllllIIIlIIIIIIllIl(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IlllIIIIlIIIlIlIlIIl(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(3, new IlIlIIIlIIlIlIIlllIl(this, true, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(4, new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.IllIlIIllIllIIlIllII(this, IlIlIlIlIlllllllllIl.class, false, (Predicate)new IlIIIlIIIllllIlIlIlI(this)));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(5, new IIlIIIIIllIlIIIlIIll(this, llllllIllIllIlIllllI.class, false));
        this.lIlIlIIIllIIllIIIllI(false);
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.30000001192092896);
        if (this.as()) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(20.0);
        }
        else {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(8.0);
        }
        this.X().IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(2.0);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        super.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl);
        if (lllIIIIlllllIlIIllIl == null) {
            this.llllIIllllIlIlIIIIll(false);
        }
        else if (!this.as()) {
            this.llllIIllllIlIlIIIIll(true);
        }
    }
    
    @Override
    protected void i() {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, this.N());
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, new Float(this.N()));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(19, new Byte((byte)0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(20, new Byte((byte)net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl()));
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll("mob.wolf.step", 0.15f, 1.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Angry", this.ax());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CollarColor", (byte)this.ay().llIllIIIIIllIlIIIIlI());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.llllIIllllIlIlIIIIll(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Angry"));
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CollarColor", 99)) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("CollarColor")));
        }
    }
    
    @Override
    protected String e() {
        return this.ax() ? "mob.wolf.growl" : ((this.IlIIllIIllIIllIIlIIl.nextInt(3) == 0) ? ((this.as() && this.IIlllIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl(18) < 10.0f) ? "mob.wolf.whine" : "mob.wolf.panting") : "mob.wolf.bark");
    }
    
    @Override
    protected String O() {
        return "mob.wolf.hurt";
    }
    
    @Override
    protected String P() {
        return "mob.wolf.death";
    }
    
    @Override
    protected float Z() {
        return 0.4f;
    }
    
    @Override
    protected IlIIIlIlIIIllIlIlIIl f() {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(-1);
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.x && !this.y && !this.llllIIllllIlIlIIIIll() && this.IIIIIllIIIIlIIIIllIl) {
            this.y = true;
            this.z = 0.0f;
            this.A = 0.0f;
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)8);
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IIlllIIIlIlllIIlllII() == null && this.ax()) {
            this.llllIIllllIlIlIIIIll(false);
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        this.w = this.v;
        if (this.az()) {
            this.v += (1.0f - this.v) * 0.4f;
        }
        else {
            this.v += (0.0f - this.v) * 0.4f;
        }
        if (this.lIIIIlIlIllllIIlIllI()) {
            this.x = true;
            this.y = false;
            this.z = 0.0f;
            this.A = 0.0f;
        }
        else if ((this.x || this.y) && this.y) {
            if (this.z == 0.0f) {
                this.llllIIIIlIIIlIlllIll("mob.wolf.shake", this.Z(), (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
            }
            this.A = this.z;
            this.z += 0.05f;
            if (this.A >= 2.0f) {
                this.x = false;
                this.y = false;
                this.A = 0.0f;
                this.z = 0.0f;
            }
            if (this.z > 0.4f) {
                final float n = (float)this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl;
                for (int n2 = (int)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.z - 0.4f) * 3.1415927f) * 7.0f), i = 0; i < n2; ++i) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f - 1.0f) * this.IllIllIIIIlIIlIlllII * 0.5f, n + 0.8f, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextFloat() * 2.0f - 1.0f) * this.IllIllIIIIlIIlIlllII * 0.5f, this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
                }
            }
        }
    }
    
    public boolean aq() {
        return this.x;
    }
    
    public float llllIIllllIlIlIIIIll(final float n) {
        return 0.75f + (this.A + (this.z - this.A) * n) / 2.0f * 0.25f;
    }
    
    public float lIIIIlIIIIIlllIllIII(final float n, final float n2) {
        float n3 = (this.A + (this.z - this.A) * n + n2) / 1.8f;
        if (n3 < 0.0f) {
            n3 = 0.0f;
        }
        else if (n3 > 1.0f) {
            n3 = 1.0f;
        }
        return net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 3.1415927f * 11.0f) * 0.15f * 3.1415927f;
    }
    
    public float IlIllIlIlIIIlIlIlIII(final float n) {
        return (this.w + (this.v - this.w) * n) * 0.15f * 3.1415927f;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        return this.IlIllllIIlIIlIlIlIll * 0.8f;
    }
    
    @Override
    public int j() {
        return this.at() ? 20 : super.j();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
        this.u.llllIIIIlIIIlIlllIll(false);
        if (llIIlIIIlIIIllIlIIIl != null && !(llIIlIIIlIIIllIlIIIl instanceof llllIIIIlIIIlIlllIll) && !(llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)) {
            n = (n + 1.0f) / 2.0f;
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final boolean llllIIIIlIIIlIlllIll = llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), (float)(int)this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).IlIlIIIllIllIIIIIllI());
        if (llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(this, llIllIIIIIllIlIIIIlI);
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void lIlIlIIIllIIllIIIllI(final boolean b) {
        super.lIlIlIIIllIIllIIIllI(b);
        if (b) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(20.0);
        }
        else {
            this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(8.0);
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(4.0);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (this.as()) {
            if (ilIIIlIlIIIllIlIlIIl != null) {
                if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() instanceof lIllIIIIIlllIIlIIllI) {
                    final lIllIIIIIlllIIlIIllI lIllIIIIIlllIIlIIllI = (lIllIIIIIlllIIlIIllI)ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
                    if (lIllIIIIIlllIIlIIllI.lllIIIIlllllIlIIllIl() && this.IIlllIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl(18) < 20.0f) {
                        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIIIlIlIIIllIlIlIIl;
                            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                        }
                        this.IlIlIlIlIlllllllllIl((float)lIllIIIIIlllIIlIIllI.llIllIlIIIIllIlIIllI(ilIIIlIlIIIllIlIlIIl));
                        if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl <= 0) {
                            llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
                        }
                        return true;
                    }
                }
                else if (ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.a) {
                    final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII());
                    if (llllIIIIlIIIlIlllIll2 != this.ay()) {
                        this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
                        if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = ilIIIlIlIIIllIlIlIIl;
                            if (--lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl <= 0) {
                                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
                            }
                        }
                        return true;
                    }
                }
            }
            if (this.IlIlIIIllIllIIIIIllI((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll) && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl)) {
                this.u.llllIIIIlIIIlIlllIll(!this.at());
                this.j = false;
                this.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl();
                this.IlIlIlIlIlllllllllIl((lllIIIIlllllIlIIllIl)null);
            }
        }
        else if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.b && !this.ax()) {
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl3 = ilIIIlIlIIIllIlIlIIl;
                --lllIIIIlIlIllIIlIIIl3.IlIlIlIlIlllllllllIl;
            }
            if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl <= 0) {
                llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
            }
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                if (this.IlIIllIIllIIllIIlIIl.nextInt(3) == 0) {
                    this.lIlIlIIIllIIllIIIllI(true);
                    this.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl();
                    this.IlIlIlIlIlllllllllIl((lllIIIIlllllIlIIllIl)null);
                    this.u.llllIIIIlIIIlIlllIll(true);
                    this.llIllIlIIIIllIlIIllI(20.0f);
                    this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lllIIIIlIlIllIIlIIIl().toString());
                    this.IlIlIIIllIIllIlllllI(true);
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)7);
                }
                else {
                    this.IlIlIIIllIIllIlllllI(false);
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)6);
                }
            }
            return true;
        }
        return super.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 8) {
            this.y = true;
            this.z = 0.0f;
            this.A = 0.0f;
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    public float aw() {
        return this.ax() ? 1.5393804f : (this.as() ? ((0.55f - (20.0f - this.IIlllIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl(18)) * 0.02f) * 3.1415927f) : 0.62831855f);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof lIllIIIIIlllIIlIIllI && ((lIllIIIIIlllIIlIIllI)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).lllIIIIlllllIlIIllIl();
    }
    
    @Override
    public int m() {
        return 8;
    }
    
    public boolean ax() {
        return (this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16) & 0x2) != 0x0;
    }
    
    public void llllIIllllIlIlIIIIll(final boolean b) {
        final byte llllIIIIlIIIlIlllIll = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16);
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll | 0x2));
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(16, (byte)(llllIIIIlIIIlIlllIll & 0xFFFFFFFD));
        }
    }
    
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ay() {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(20) & 0xF);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(20, (byte)(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() & 0xF));
    }
    
    public IIIllllllIllIIIlllIl IlIlIlIlIlllllllllIl(final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII) {
        final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = new IIIllllllIllIIIlllIl(this.IlllllllIIIlIIIlIlII);
        final String ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        if (ilIlIlIlIlllllllllIl != null && ilIlIlIlIlllllllllIl.trim().length() > 0) {
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            iiIllllllIllIIIlllIl.lIlIlIIIllIIllIIIllI(true);
        }
        return iiIllllllIllIIIlllIl;
    }
    
    public void IlIllIlIlIIIlIlIlIII(final boolean b) {
        if (b) {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(19, 1);
        }
        else {
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(19, 0);
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == this) {
            return false;
        }
        if (!this.as()) {
            return false;
        }
        if (!(ilIlIlIlIlllllllllIl instanceof IIIllllllIllIIIlllIl)) {
            return false;
        }
        final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = (IIIllllllIllIIIlllIl)ilIlIlIlIlllllllllIl;
        return iiIllllllIllIIIlllIl.as() && !iiIllllllIllIIIlllIl.at() && (this.ao() && iiIllllllIllIIIlllIl.ao());
    }
    
    public boolean az() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(19) == 1;
    }
    
    @Override
    protected boolean g() {
        return !this.as() && this.lllllIIIIIlIlIIIIIIl > 2400;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl2) {
        if (!(lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl) && !(lllIIIIlllllIlIIllIl instanceof llIllIlIIIIllIlIIllI)) {
            if (lllIIIIlllllIlIIllIl instanceof IIIllllllIllIIIlllIl) {
                final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = (IIIllllllIllIIIlllIl)lllIIIIlllllIlIIllIl;
                if (iiIllllllIllIIIlllIl.as() && iiIllllllIllIIIlllIl.au() == lllIIIIlllllIlIIllIl2) {
                    return false;
                }
            }
            return (!(lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll) || !(lllIIIIlllllIlIIllIl2 instanceof llllIIIIlIIIlIlllIll) || ((llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl2).IlIIIlIlIIIllIlIlIIl((llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl)) && (!(lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl) || !((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl)lllIIIIlllllIlIIllIl).at());
        }
        return false;
    }
    
    @Override
    public boolean s() {
        return !this.ax() && super.s();
    }
}
