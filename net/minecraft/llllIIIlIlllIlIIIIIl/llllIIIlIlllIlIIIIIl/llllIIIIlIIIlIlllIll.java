package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl;

import com.mojang.authlib.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import com.google.common.collect.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import com.google.common.base.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public abstract class llllIIIIlIIIlIlllIll extends lllIIIIlllllIlIIllIl
{
    public IllIIlllIIIIlllIIlIl lIlIlIIIllIIllIIIllI;
    private IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    public IlIlIlIlIlllllllllIl IlIlIIIllIIllIlllllI;
    public IlIlIlIlIlllllllllIl t;
    protected net.minecraft.IlllllllIIIlIIIlIlII.IllIlIIllIllIIlIllII u;
    protected int v;
    public float w;
    public float x;
    public int y;
    public double z;
    public double A;
    public double B;
    public double C;
    public double D;
    public double E;
    protected boolean F;
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl G;
    private int IlIlIlIlIlllllllllIl;
    public float H;
    public float I;
    public float J;
    private net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    private boolean IlIIIlIlIIIllIlIlIIl;
    private net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIIIllIllIIIIIllI;
    public lIIIIlIIIIIlllIllIII K;
    public int L;
    public int M;
    public float N;
    private int IllIIlllIIIIlllIIlIl;
    private lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    protected float O;
    protected float P;
    private int lIIIlllIIIllIIIllIII;
    private final GameProfile llIIlIIIlIIIllIlIIIl;
    private boolean llIllIlIIIIllIlIIllI;
    public IlIIIlIlIIIllIlIlIIl Q;
    private static volatile /* synthetic */ int[] R;
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final GameProfile llIIlIIIlIIIllIlIIIl) {
        super(illlllllIIIlIIIlIlII);
        this.lIlIlIIIllIIllIIIllI = new IllIIlllIIIIlllIIlIl(this);
        this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll();
        this.u = new net.minecraft.IlllllllIIIlIIIlIlII.IllIlIIllIllIIlIllII();
        this.K = new lIIIIlIIIIIlllIllIII();
        this.O = 0.1f;
        this.P = 0.02f;
        this.llIllIlIIIIllIlIIllI = false;
        this.IIIllIIllIIIIIIlIIlI = llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIlIIIllIIllIlllllI = new IIllIIllIIIlIlIIIIlI(this.lIlIlIIIllIIllIIIllI, !illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII, this);
        this.t = this.IlIlIIIllIIllIlllllI;
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl iIlllIlIIllIlIlIlIIl = illlllllIIIlIIIlIlII.IIlllIlIIllIlIlIlIIl();
        this.IlIlIlIlIlllllllllIl(iIlllIlIIllIlIlIlIIl.lIIIIlIIIIIlllIllIII() + 0.5, iIlllIlIIllIlIlIlIIl.lIIIlllIIIllIIIllIII() + 1, iIlllIlIIllIlIlIlIIl.llIIlIIIlIIIllIlIIIl() + 0.5, 0.0f, 0.0f);
        this.g = 180.0f;
        this.IllIIlllllIIllIIllIl = 20;
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.X().IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).llllIIIIlIIIlIlllIll(1.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.10000000149011612);
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(16, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17, 0.0f);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(10, (Object)0);
    }
    
    public lllIIIIlIlIllIIlIIIl e() {
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public int f() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public boolean g() {
        return this.llllIIIlIlllIlIIIIIl != null;
    }
    
    public int h() {
        return this.g() ? (this.llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI() - this.lIIIIlIIIIIlllIllIII) : 0;
    }
    
    public void i() {
        if (this.llllIIIlIlllIlIIIIIl != null) {
            this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.IlllllllIIIlIIIlIlII, this, this.lIIIIlIIIIIlllIllIII);
        }
        this.j();
    }
    
    public void j() {
        this.llllIIIlIlllIlIIIIIl = null;
        this.lIIIIlIIIIIlllIllIII = 0;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.llllIIIlIlllIlIIIIIl(false);
        }
    }
    
    public boolean k() {
        return this.g() && this.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll().llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl) == net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.lIIIIlIlIllllIIlIllI = this.IlIIIlIlIIIllIlIlIIl();
        if (this.IlIIIlIlIIIllIlIlIIl()) {
            this.IIIIIllIIIIlIIIIllIl = false;
        }
        if (this.llllIIIlIlllIlIIIIIl != null) {
            final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
            if (ilIIIlIlIIIllIlIlIIl == this.llllIIIlIlllIlIIIIIl) {
                if (this.lIIIIlIIIIIlllIllIII <= 25 && this.lIIIIlIIIIIlllIllIII % 4 == 0) {
                    this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, 5);
                }
                if (--this.lIIIIlIIIIIlllIllIII == 0 && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    this.l();
                }
            }
            else {
                this.j();
            }
        }
        if (this.y > 0) {
            --this.y;
        }
        if (this.ah()) {
            ++this.IlIlIlIlIlllllllllIl;
            if (this.IlIlIlIlIlllllllllIl > 100) {
                this.IlIlIlIlIlllllllllIl = 100;
            }
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                if (!this.lIIIIlIIIIIlllIllIII()) {
                    this.llllIIIIlIIIlIlllIll(true, true, false);
                }
                else if (this.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI()) {
                    this.llllIIIIlIIIlIlllIll(false, true, true);
                }
            }
        }
        else if (this.IlIlIlIlIlllllllllIl > 0) {
            ++this.IlIlIlIlIlllllllllIl;
            if (this.IlIlIlIlIlllllllllIl >= 110) {
                this.IlIlIlIlIlllllllllIl = 0;
            }
        }
        super.IIllIIllIIIlIlIIIIlI();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.t != null && !this.t.llllIIIIlIIIlIlllIll(this)) {
            this.b_();
            this.t = this.IlIlIIIllIIllIlllllI;
        }
        if (this.lIIIIIlIlIIIlIIIIlIl() && this.K.llllIIIIlIIIlIlllIll) {
            this.IlIIlIlIIIlIIlIlIlII();
        }
        this.z = this.C;
        this.A = this.D;
        this.B = this.E;
        final double n = this.IIlllIlIIllIlIlIlIIl - this.C;
        final double n2 = this.llIIIlIlIllIIlIlIlII - this.D;
        final double n3 = this.lllllIlIIIlIlIIlllII - this.E;
        final double n4 = 10.0;
        if (n > n4) {
            final double iIlllIlIIllIlIlIlIIl = this.IIlllIlIIllIlIlIlIIl;
            this.C = iIlllIlIIllIlIlIlIIl;
            this.z = iIlllIlIIllIlIlIlIIl;
        }
        if (n3 > n4) {
            final double lllllIlIIIlIlIIlllII = this.lllllIlIIIlIlIIlllII;
            this.E = lllllIlIIIlIlIIlllII;
            this.B = lllllIlIIIlIlIIlllII;
        }
        if (n2 > n4) {
            final double llIIIlIlIllIIlIlIlII = this.llIIIlIlIllIIlIlIlII;
            this.D = llIIIlIlIllIIlIlIlII;
            this.A = llIIIlIlIllIIlIlIlII;
        }
        if (n < -n4) {
            final double iIlllIlIIllIlIlIlIIl2 = this.IIlllIlIIllIlIlIlIIl;
            this.C = iIlllIlIIllIlIlIlIIl2;
            this.z = iIlllIlIIllIlIlIlIIl2;
        }
        if (n3 < -n4) {
            final double lllllIlIIIlIlIIlllII2 = this.lllllIlIIIlIlIIlllII;
            this.E = lllllIlIIIlIlIIlllII2;
            this.B = lllllIlIIIlIlIIlllII2;
        }
        if (n2 < -n4) {
            final double llIIIlIlIllIIlIlIlII2 = this.llIIIlIlIllIIlIlIlII;
            this.D = llIIIlIlIllIIlIlIlII2;
            this.A = llIIIlIlIllIIlIlIlII2;
        }
        this.C += n * 0.25;
        this.E += n3 * 0.25;
        this.D += n2 * 0.25;
        if (this.IIIlIIIlIlIIlllIIlll == null) {
            this.IlIlIIIllIllIIIIIllI = null;
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.u.llllIIIIlIIIlIlllIll(this);
            this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl);
            if (this.llllIllllIllllIlIlII()) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII);
            }
        }
        final double llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, -2.9999999E7, 2.9999999E7);
        final double llllIIIIlIIIlIlllIll2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lllllIlIIIlIlIIlllII, -2.9999999E7, 2.9999999E7);
        if (llllIIIIlIIIlIlllIll != this.IIlllIlIIllIlIlIlIIl || llllIIIIlIIIlIlllIll2 != this.lllllIlIIIlIlIIlllII) {
            this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, this.llIIIlIlIllIIlIlIlII, llllIIIIlIIIlIlllIll2);
        }
    }
    
    @Override
    public int IllIllIlllIllllIIllI() {
        return this.K.llllIIIIlIIIlIlllIll ? 0 : 80;
    }
    
    @Override
    protected String lIIlIIIlIllIlIllIIIl() {
        return "game.player.swim";
    }
    
    @Override
    protected String lIlIIlllIIlIIlIlllIl() {
        return "game.player.swim.splash";
    }
    
    @Override
    public int IllllIIlIlIllIIIllII() {
        return 10;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final float n, final float n2) {
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, s, n, n2);
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        if (lllIIIIlIlIllIIlIIIl.IlIlIIIllIIllIlllllI() == net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
            this.llllIIIIlIIIlIlllIll("random.drink", 0.5f, this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() * 0.1f + 0.9f);
        }
        if (lllIIIIlIlIllIIlIIIl.IlIlIIIllIIllIlllllI() == net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
            for (int i = 0; i < n; ++i) {
                final e ilIlIlIlIlllllllllIl = new e((this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0).llllIIIIlIIIlIlllIll(-this.llllllIllIllIlIllllI * 3.1415927f / 180.0f).IlIlIlIlIlllllllllIl(-this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
                final e ilIlIlIlIlllllllllIl2 = new e((this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * 0.3, -this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.6 - 0.3, 0.6).llllIIIIlIIIlIlllIll(-this.llllllIllIllIlIllllI * 3.1415927f / 180.0f).IlIlIlIlIlllllllllIl(-this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f).IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.llllIlIllllIIlIIlIlI(), this.lllllIlIIIlIlIIlllII);
                if (lllIIIIlIlIllIIlIIIl.IlIlIIIllIllIIIIIllI()) {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIIllIIIIlIIIIllIl, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + 0.05, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()), lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
                }
                else {
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIIllIIIIlIIIIllIl, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + 0.05, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()));
                }
            }
            this.llllIIIIlIIIlIlllIll("random.eat", 0.5f + 0.5f * this.IlIIllIIllIIllIIlIIl.nextInt(2), (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
        }
    }
    
    protected void l() {
        if (this.llllIIIlIlllIlIIIIIl != null) {
            this.llllIIIIlIIIlIlllIll(this.llllIIIlIlllIlIIIIIl, 16);
            final int ilIlIlIlIlllllllllIl = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;
            final lllIIIIlIlIllIIlIIIl ilIlIlIlIlllllllllIl2 = this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.IlllllllIIIlIIIlIlII, this);
            if (ilIlIlIlIlllllllllIl2 != this.llllIIIlIlllIlIIIIIl || (ilIlIlIlIlllllllllIl2 != null && ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl != ilIlIlIlIlllllllllIl)) {
                this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = ilIlIlIlIlllllllllIl2;
                if (ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl == 0) {
                    this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll[this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI] = null;
                }
            }
            this.j();
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 9) {
            this.l();
        }
        else if (b == 23) {
            this.llIllIlIIIIllIlIIllI = false;
        }
        else if (b == 22) {
            this.llIllIlIIIIllIlIIllI = true;
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    @Override
    protected boolean ab() {
        return this.N() <= 0.0f || this.ah();
    }
    
    protected void b_() {
        this.t = this.IlIlIIIllIIllIlllllI;
    }
    
    @Override
    public void lIIllIIIllllIlllIllI() {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IIIIIllIIIIlIIIIllIl()) {
            this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
            this.IlIlIIIllIllIIIIIllI(false);
        }
        else {
            final double iIlllIlIIllIlIlIlIIl = this.IIlllIlIIllIlIlIlIIl;
            final double llIIIlIlIllIIlIlIlII = this.llIIIlIlIllIIlIlIlII;
            final double lllllIlIIIlIlIIlllII = this.lllllIlIIIlIlIIlllII;
            final float iIlIIIIIllIlIIIlIIll = this.IIlIIIIIllIlIIIlIIll;
            final float llllllIllIllIlIllllI = this.llllllIllIllIlIllllI;
            super.lIIllIIIllllIlllIllI();
            this.w = this.x;
            this.x = 0.0f;
            this.lIlIlIIIllIIllIIIllI(this.IIlllIlIIllIlIlIlIIl - iIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII - llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII - lllllIlIIIlIlIIlllII);
            if (this.IIIlIIIlIlIIlllIIlll instanceof llIllIlIIIIllIlIIllI) {
                this.llllllIllIllIlIllllI = llllllIllIllIlIllllI;
                this.IIlIIIIIllIlIIIlIIll = iIlIIIIIllIlIIIlIIll;
                this.lIllIlIIIllllllIIlII = ((llIllIlIIIIllIlIIllI)this.IIIlIIIlIlIIlllIIlll).lIllIlIIIllllllIIlII;
            }
        }
    }
    
    public void IIlIlIlIIlIllIIIIIIl() {
        this.llllIIIIlIIIlIlllIll(0.6f, 1.8f);
        super.IIlIlIlIIlIllIIIIIIl();
        this.llIllIlIIIIllIlIIllI(this.U());
        this.llIlllIlllllIIllIIII = 0;
    }
    
    @Override
    protected void IIIIIIIIIlllIllIlIlI() {
        super.IIIIIIIIIlllIllIlIlI();
        this.W();
        this.lIIlllIlllllIIlllIll = this.IIlIIIIIllIlIIIlIIll;
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.v > 0) {
            --this.v;
        }
        if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("naturalRegeneration")) {
            if (this.N() < this.U() && this.lllllIIIIIlIlIIIIIIl % 20 == 0) {
                this.IlIlIlIlIlllllllllIl(1.0f);
            }
            if (this.u.llIllIIIIIllIlIIIIlI() && this.lllllIIIIIlIlIIIIIIl % 10 == 0) {
                this.u.llllIIIIlIIIlIlllIll(this.u.llllIIIIlIIIlIlllIll() + 1);
            }
        }
        this.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII();
        this.w = this.x;
        super.IIIlIIIlIlIIlllIIlll();
        final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl);
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.K.IlIlIlIlIlllllllllIl());
        }
        this.lIIlIIIIIIIlIIlIlIIl = this.P;
        if (this.IIIllIIllIIIIIIlIIlI()) {
            this.lIIlIIIIIIIlIIlIlIIl += (float)(this.P * 0.3);
        }
        this.llIIlIIIlIIIllIlIIIl((float)llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI());
        float llllIIIIlIIIlIlllIll2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII);
        float n = (float)(Math.atan(-this.llIIlllIIlllIIllIllI * 0.20000000298023224) * 15.0);
        if (llllIIIIlIIIlIlllIll2 > 0.1f) {
            llllIIIIlIIIlIlllIll2 = 0.1f;
        }
        if (!this.IIIIIllIIIIlIIIIllIl || this.N() <= 0.0f) {
            llllIIIIlIIIlIlllIll2 = 0.0f;
        }
        if (this.IIIIIllIIIIlIIIIllIl || this.N() <= 0.0f) {
            n = 0.0f;
        }
        this.x += (llllIIIIlIIIlIlllIll2 - this.x) * 0.4f;
        this.lIllllIllIllIIllllll += (n - this.lIllllIllIllIIllllll) * 0.8f;
        if (this.N() > 0.0f && !this.IlIIIlIlIIIllIlIlIIl()) {
            net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3;
            if (this.IIIlIIIlIlIIlllIIlll != null && !this.IIIlIIIlIlIIlllIIlll.IIlIlIlIIlIllIIIIIIl) {
                llllIIIIlIIIlIlllIll3 = this.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll(this.IIIlIIIlIlIIlllIIlll.IlIIlllIIlIlllllIIlI()).IlIlIlIlIlllllllllIl(1.0, 0.0, 1.0);
            }
            else {
                llllIIIIlIIIlIlllIll3 = this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(1.0, 0.5, 1.0);
            }
            final List ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, llllIIIIlIIIlIlllIll3);
            for (int i = 0; i < ilIlIlIlIlllllllllIl.size(); ++i) {
                final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.get(i);
                if (!llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl) {
                    this.IIllIIllIIIlIlIIIIlI(llIllIIIIIllIlIIIIlI);
                }
            }
        }
    }
    
    private void IIllIIllIIIlIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        llIllIIIIIllIlIIIIlI.b_(this);
    }
    
    public int m() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(18);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, n);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(18, this.m() + n);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        this.llllIIIIlIIIlIlllIll(0.2f, 0.2f);
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        this.llIIlllIIlllIIllIllI = 0.10000000149011612;
        if (this.s_().equals("Notch")) {
            this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlIlIIIllIllIIIIIllI, 1), true, false);
        }
        if (!this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("keepInventory")) {
            this.lIlIlIIIllIIllIIIllI.llIllIlIIIIllIlIIllI();
        }
        if (lIllllllIIllIlIlIlII != null) {
            this.lIllllllIIllIlIlIlII = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((this.IIlllIIIllIllIIlIlIl + this.IIlIIIIIllIlIIIlIIll) * 3.1415927f / 180.0f) * 0.1f;
            this.IIlllIIIlIlllIIlllII = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.IIlllIIIllIllIIlIlIl + this.IIlIIIIIllIlIIIlIIll) * 3.1415927f / 180.0f) * 0.1f;
        }
        else {
            final double n = 0.0;
            this.IIlllIIIlIlllIIlllII = n;
            this.lIllllllIIllIlIlIlII = n;
        }
        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIIlIIlIIIIlllIlllII);
        this.IlIlIlIlIlllllllllIl(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII);
    }
    
    @Override
    protected String O() {
        return "game.player.hurt";
    }
    
    @Override
    protected String P() {
        return "game.player.die";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        this.IlIlIlIlIlllllllllIl(n);
        final Collection llllIIIIlIIIlIlllIll = this.au().llllIIIIlIIIlIlllIll(net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl);
        if (llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIIIlIlIllIIlIlIlII);
            llllIIIIlIIIlIlllIll.addAll(this.au().llllIIIIlIIIlIlllIll(net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI));
            llllIIIIlIIIlIlllIll.addAll(this.IIIlIIIlIlIIlllIIlll(llIllIIIIIllIlIIIIlI));
        }
        else {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIlIllllllllIIIIlII);
        }
        final Iterator<net.minecraft.lllIIIIlllllIlIIllIl.lIIIIlIIIIIlllIllIII> iterator = llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            this.au().IlIlIlIlIlllllllllIl(this.s_(), iterator.next()).llllIIIIlIIIlIlllIll();
        }
    }
    
    private Collection IIIlIIIlIlIIlllIIlll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        final lIIIlllIIIllIIIllIII illIIlllIIIIlllIIlIl = this.au().IllIIlllIIIIlllIIlIl(this.s_());
        if (illIIlllIIIIlllIIlIl != null) {
            final int llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llIllIlIIIIllIlIIllI().llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll >= 0 && llllIIIIlIIIlIlllIll < net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII.length) {
                final Iterator iterator = this.au().llllIIIIlIIIlIlllIll(net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII[llllIIIIlIIIlIlllIll]).iterator();
                while (iterator.hasNext()) {
                    this.au().IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.s_(), iterator.next()).llllIIIIlIIIlIlllIll();
                }
            }
        }
        final lIIIlllIIIllIIIllIII illIIlllIIIIlllIIlIl2 = this.au().IllIIlllIIIIlllIIlIl(llIllIIIIIllIlIIIIlI.s_());
        if (illIIlllIIIIlllIIlIl2 != null) {
            final int llllIIIIlIIIlIlllIll2 = illIIlllIIIIlllIIlIl2.llIllIlIIIIllIlIIllI().llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll2 >= 0 && llllIIIIlIIIlIlllIll2 < net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII.length) {
                return this.au().llllIIIIlIIIlIlllIll(net.minecraft.lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII[llllIIIIlIIIlIlllIll2]);
            }
        }
        return Lists.newArrayList();
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII IlIlIlIlIlllllllllIl(final boolean b) {
        return this.llllIIIIlIIIlIlllIll(this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, (b && this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl() != null) ? this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl().IlIlIlIlIlllllllllIl : 1), false, true);
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final boolean b) {
        return this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, false, false);
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final boolean b, final boolean b2) {
        if (lllIIIIlIlIllIIlIIIl == null) {
            return null;
        }
        if (lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl == 0) {
            return null;
        }
        final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII - 0.30000001192092896 + this.llllIlIllllIIlIIlIlI(), this.lllllIlIIIlIlIIlllII, lllIIIIlIlIllIIlIIIl);
        liiIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(40);
        if (b2) {
            liiIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl(this.s_());
        }
        if (b) {
            final float n = this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.5f;
            final float n2 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 3.1415927f * 2.0f;
            liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2) * n;
            liiIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2) * n;
            liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI = 0.20000000298023224;
        }
        else {
            final float n3 = 0.3f;
            liiIlllIIIllIIIllIII.lIllllllIIllIlIlIlII = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n3;
            liiIlllIIIllIIIllIII.IIlllIIIlIlllIIlllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll / 180.0f * 3.1415927f) * net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n3;
            liiIlllIIIllIIIllIII.llIIlllIIlllIIllIllI = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.llllllIllIllIlIllllI / 180.0f * 3.1415927f) * n3 + 0.1f;
            final float n4 = this.IlIIllIIllIIllIIlIIl.nextFloat() * 3.1415927f * 2.0f;
            final float n5 = 0.02f * this.IlIIllIIllIIllIIlIIl.nextFloat();
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII2 = liiIlllIIIllIIIllIII;
            liiIlllIIIllIIIllIII2.lIllllllIIllIlIlIlII += Math.cos(n4) * n5;
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII3 = liiIlllIIIllIIIllIII;
            liiIlllIIIllIIIllIII3.llIIlllIIlllIIllIllI += (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.1f;
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII4 = liiIlllIIIllIIIllIII;
            liiIlllIIIllIIIllIII4.IIlllIIIlIlllIIlllII += Math.sin(n4) * n5;
        }
        this.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
        if (b2) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIlIIIlIIlIlIIlllIl);
        }
        return liiIlllIIIllIIIllIII;
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
    }
    
    public float llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        float llllIIIIlIIIlIlllIll2 = this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll2 > 1.0f) {
            final int llIllIIIIIllIlIIIIlI = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(this);
            final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
            if (llIllIIIIIllIlIIIIlI > 0 && ilIIIlIlIIIllIlIlIIl != null) {
                llllIIIIlIIIlIlllIll2 += llIllIIIIIllIlIIIIlI * llIllIIIIIllIlIIIIlI + 1;
            }
        }
        if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI)) {
            llllIIIIlIIIlIlllIll2 *= 1.0f + (this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI() + 1) * 0.2f;
        }
        if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl)) {
            float n = 0.0f;
            switch (this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI()) {
                case 0: {
                    n = 0.3f;
                    break;
                }
                case 1: {
                    n = 0.09f;
                    break;
                }
                case 2: {
                    n = 0.0027f;
                    break;
                }
                default: {
                    n = 8.1E-4f;
                    break;
                }
            }
            llllIIIIlIIIlIlllIll2 *= n;
        }
        if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) && !net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII(this)) {
            llllIIIIlIIIlIlllIll2 /= 5.0f;
        }
        if (!this.IIIIIllIIIIlIIIIllIl) {
            llllIIIIlIIIlIlllIll2 /= 5.0f;
        }
        return llllIIIIlIIIlIlllIll2;
    }
    
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.IIIllIIllIIIIIIlIIlI = llllIIIIlIIIlIlllIll(this.llIIlIIIlIIIllIlIIIl);
        this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Inventory", 10));
        this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("SelectedItemSlot");
        this.F = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Sleeping");
        this.IlIlIlIlIlllllllllIl = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("SleepTimer");
        this.N = iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII("XpP");
        this.L = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("XpLevel");
        this.M = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("XpTotal");
        this.IllIIlllIIIIlllIIlIl = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("XpSeed");
        if (this.IllIIlllIIIIlllIIlIl == 0) {
            this.IllIIlllIIIIlllIIlIl = this.IlIIllIIllIIllIIlIIl.nextInt();
        }
        this.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Score"));
        if (this.F) {
            this.G = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
            this.llllIIIIlIIIlIlllIll(true, true, false);
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SpawnX", 99) && iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SpawnY", 99) && iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("SpawnZ", 99)) {
            this.llIllIIIIIllIlIIIIlI = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("SpawnX"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("SpawnY"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("SpawnZ"));
            this.IlIIIlIlIIIllIlIlIIl = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("SpawnForced");
        }
        this.u.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        this.K.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("EnderItems", 9)) {
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("EnderItems", 10));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Inventory", this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl()));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SelectedItemSlot", this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Sleeping", this.F);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SleepTimer", (short)this.IlIlIlIlIlllllllllIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("XpP", this.N);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("XpLevel", this.L);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("XpTotal", this.M);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("XpSeed", this.IllIIlllIIIIlllIIlIl);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Score", this.m());
        if (this.llIllIIIIIllIlIIIIlI != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnX", this.llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnY", this.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnZ", this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SpawnForced", this.IlIIIlIlIIIllIlIlIIl);
        }
        this.u.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.K.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("EnderItems", this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("SelectedItem", ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll()));
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (this.K.llllIIIIlIIIlIlllIll && !lIllllllIIllIlIlIlII.llllIIIlIlllIlIIIIIl()) {
            return false;
        }
        this.b = 0;
        if (this.N() <= 0.0f) {
            return false;
        }
        if (this.ah() && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.llllIIIIlIIIlIlllIll(true, true, false);
        }
        if (lIllllllIIllIlIlIlII.lllIIIIlllllIlIIllIl()) {
            if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll) {
                n = 0.0f;
            }
            if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl) {
                n = n / 2.0f + 1.0f;
            }
            if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) {
                n = n * 3.0f / 2.0f;
            }
        }
        if (n == 0.0f) {
            return false;
        }
        final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
        if (llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll && ((net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI != null) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ((net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll)llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI;
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IlIlIIIllIIllIlllllI w = this.w();
        final IlIlIIIllIIllIlllllI w2 = llllIIIIlIIIlIlllIll.w();
        return w == null || !w.llllIIIIlIIIlIlllIll(w2) || w.IllIIlllIIIIlllIIlIl();
    }
    
    @Override
    protected void lIlIlIIIllIIllIIIllI(final float n) {
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    public int R() {
        return this.lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
    }
    
    public float o() {
        int n = 0;
        lllIIIIlIlIllIIlIIIl[] ilIlIlIlIlllllllllIl;
        for (int length = (ilIlIlIlIlllllllllIl = this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl).length, i = 0; i < length; ++i) {
            if (ilIlIlIlIlllllllllIl[i] != null) {
                ++n;
            }
        }
        return n / (float)this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.length;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float n) {
        if (!this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            if (!lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI() && this.k() && n > 0.0f) {
                n = (1.0f + n) * 0.5f;
            }
            n = this.llIllIIIIIllIlIIIIlI(lIllllllIIllIlIlIlII, n);
            final float ilIIIlIlIIIllIlIlIIl;
            n = (ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(lIllllllIIllIlIlIlII, n));
            n = Math.max(n - this.aj(), 0.0f);
            this.IIIIlllIIIIIIlIIIlll(this.aj() - (ilIIIlIlIIIllIlIlIIl - n));
            if (n != 0.0f) {
                this.IlIIIlIlIIIllIlIlIIl(lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl());
                final float n2 = this.N();
                this.llIllIlIIIIllIlIIllI(this.N() - n);
                this.S().llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n2, n);
                if (n < 3.4028235E37f) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIlIIIIlllIlllllIlII, Math.round(n * 10.0f));
                }
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
    }
    
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
    }
    
    public boolean lllIIIIlllllIlIIllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.IlIIIlIlIIIllIlIlIIl()) {
            if (llIllIIIIIllIlIIIIlI instanceof llIIIlIlIllIIlIlIlII) {
                this.llllIIIIlIIIlIlllIll((llIIIlIlIllIIlIlIlII)llIllIIIIIllIlIIIIlI);
            }
            return false;
        }
        lllIIIIlIlIllIIlIIIl p = this.p();
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = (p != null) ? p.llIIlIIIlIIIllIlIIIl() : null;
        if (!llIllIIIIIllIlIIIIlI.a_(this)) {
            if (p != null && llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                if (this.K.IlIIIlIlIIIllIlIlIIl) {
                    p = lllIIIIlIlIllIIlIIIl;
                }
                if (p.llllIIIIlIIIlIlllIll(this, (lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI)) {
                    if (p.IlIlIlIlIlllllllllIl <= 0 && !this.K.IlIIIlIlIIIllIlIlIIl) {
                        this.q();
                    }
                    return true;
                }
            }
            return false;
        }
        if (p != null && p == this.p()) {
            if (p.IlIlIlIlIlllllllllIl <= 0 && !this.K.IlIIIlIlIIIllIlIlIIl) {
                this.q();
            }
            else if (p.IlIlIlIlIlllllllllIl < lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl && this.K.IlIIIlIlIIIllIlIlIIl) {
                p.IlIlIlIlIlllllllllIl = lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
        }
        return true;
    }
    
    public lllIIIIlIlIllIIlIIIl p() {
        return this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void q() {
        this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
    }
    
    @Override
    public double IIllIIIlIIlIlIlIIIII() {
        return -0.35;
    }
    
    public void IlIlIIIIIIlllIlIllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI.i_() && !llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII(this)) {
            float n = (float)this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIIIllIllIIIIIllI).IlIlIIIllIllIIIIIllI();
            final int n2 = 0;
            float n3;
            if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                n3 = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.n(), ((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI).Y());
            }
            else {
                n3 = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.n(), net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll);
            }
            int n4 = n2 + net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this);
            if (this.IIIllIIllIIIIIIlIIlI()) {
                ++n4;
            }
            if (n > 0.0f || n3 > 0.0f) {
                final boolean b = this.IllIlIIllIllIIlIllII > 0.0f && !this.IIIIIllIIIIlIIIIllIl && !this.f_() && !this.llIIIlIlllIllIIlIllI() && !this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll) && this.IIIlIIIlIlIIlllIIlll == null && llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl;
                if (b && n > 0.0f) {
                    n *= 1.5f;
                }
                final float n5 = n + n3;
                boolean b2 = false;
                final int ilIlIlIlIlllllllllIl = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this);
                if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl && ilIlIlIlIlllllllllIl > 0 && !llIllIIIIIllIlIIIIlI.lIIIIIlIlIIIlIIIIlIl()) {
                    b2 = true;
                    llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(1);
                }
                final double lIllllllIIllIlIlIlII = llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII;
                final double llIIlllIIlllIIllIllI = llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI;
                final double iIlllIIIlIlllIIlllII = llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII;
                if (llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), n5)) {
                    if (n4 > 0) {
                        llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(-net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f) * n4 * 0.5f, 0.1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f) * n4 * 0.5f);
                        this.lIllllllIIllIlIlIlII *= 0.6;
                        this.IIlllIIIlIlllIIlllII *= 0.6;
                        this.llIllIIIIIllIlIIIIlI(false);
                    }
                    if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl && llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll) {
                        ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIllIIllIIIlIlIIIIlI(llIllIIIIIllIlIIIIlI));
                        llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll = false;
                        llIllIIIIIllIlIIIIlI.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
                        llIllIIIIIllIlIIIIlI.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI;
                        llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII = iIlllIIIlIlllIIlllII;
                    }
                    if (b) {
                        this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
                    }
                    if (n3 > 0.0f) {
                        this.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI);
                    }
                    if (n5 >= 18.0f) {
                        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIlllIIIlIlllIIlllII);
                    }
                    this.IlIlIIIllIIllIlllllI(llIllIIIIIllIlIIIIlI);
                    if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                        net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI, this);
                    }
                    net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(this, llIllIIIIIllIlIIIIlI);
                    final lllIIIIlIlIllIIlIIIl p = this.p();
                    llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI2 = llIllIIIIIllIlIIIIlI;
                    if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                        final lllllIlIIIlIlIIlllII llllIIIIlIIIlIlllIll = ((net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI)llIllIIIIIllIlIIIIlI).llllIIIIlIIIlIlllIll;
                        if (llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
                            llIllIIIIIllIlIIIIlI2 = (lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll;
                        }
                    }
                    if (p != null && llIllIIIIIllIlIIIIlI2 instanceof lllIIIIlllllIlIIllIl) {
                        p.llllIIIIlIIIlIlllIll((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI2, this);
                        if (p.IlIlIlIlIlllllllllIl <= 0) {
                            this.q();
                        }
                    }
                    if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlllllllIIIlIIIlIlII, Math.round(n5 * 10.0f));
                        if (ilIlIlIlIlllllllllIl > 0) {
                            llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl * 4);
                        }
                    }
                    this.IlIIIlIlIIIllIlIlIIl(0.3f);
                }
                else if (b2) {
                    llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII();
                }
            }
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
    }
    
    public void llIllIIIIIllIlIIIIlI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
    }
    
    public void IIIlIIlIIIIlllIlllII() {
    }
    
    @Override
    public void IllIllIIIIlIIlIlllII() {
        super.IllIllIIIIlIIlIlllII();
        this.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(this);
        if (this.t != null) {
            this.t.IlIlIlIlIlllllllllIl(this);
        }
    }
    
    @Override
    public boolean IIlIlIllllIlllIIIIll() {
        return !this.F && super.IIlIlIllllIlllIIIIll();
    }
    
    public boolean lllllIlIIIlIlIIlllII() {
        return false;
    }
    
    public GameProfile r() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl g) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (this.ah() || !this.llllIllllIllllIlIlII()) {
                return net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI;
            }
            if (!this.IlllllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl()) {
                return net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl;
            }
            if (this.IlllllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI()) {
                return net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI;
            }
            if (Math.abs(this.IIlllIlIIllIlIlIlIIl - g.lIIIIlIIIIIlllIllIII()) > 3.0 || Math.abs(this.llIIIlIlIllIIlIlIlII - g.lIIIlllIIIllIIIllIII()) > 2.0 || Math.abs(this.lllllIlIIIlIlIIlllII - g.llIIlIIIlIIIllIlIIIl()) > 3.0) {
                return net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl;
            }
            final double n = 8.0;
            final double n2 = 5.0;
            if (!this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IIlllIlIIllIlIlIlIIl.class, new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(g.lIIIIlIIIIIlllIllIII() - n, g.lIIIlllIIIllIIIllIII() - n2, g.llIIlIIIlIIIllIlIIIl() - n, g.lIIIIlIIIIIlllIllIII() + n, g.lIIIlllIIIllIIIllIII() + n2, g.llIIlIIIlIIIllIlIIIl() + n)).isEmpty()) {
                return net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl;
            }
        }
        if (this.IIllIIIlIIIIlIIlIIII()) {
            this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
        }
        this.llllIIIIlIIIlIlllIll(0.2f, 0.2f);
        if (this.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(g)) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(g).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl.IlllIIIIlIIIlIlIlIIl);
            float n3 = 0.5f;
            float n4 = 0.5f;
            switch (aw()[lllIllIIIllllllIllll.ordinal()]) {
                case 4: {
                    n4 = 0.9f;
                    break;
                }
                case 3: {
                    n4 = 0.1f;
                    break;
                }
                case 5: {
                    n3 = 0.1f;
                    break;
                }
                case 6: {
                    n3 = 0.9f;
                    break;
                }
            }
            this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            this.IlIlIlIlIlllllllllIl(g.lIIIIlIIIIIlllIllIII() + n3, g.lIIIlllIIIllIIIllIII() + 0.6875f, (double)(g.llIIlIIIlIIIllIlIIIl() + n4));
        }
        else {
            this.IlIlIlIlIlllllllllIl(g.lIIIIlIIIIIlllIllIII() + 0.5f, g.lIIIlllIIIllIIIllIII() + 0.6875f, (double)(g.llIIlIIIlIIIllIlIIIl() + 0.5f));
        }
        this.F = true;
        this.IlIlIlIlIlllllllllIl = 0;
        this.G = g;
        final double lIllllllIIllIlIlIlII = 0.0;
        this.llIIlllIIlllIIllIllI = lIllllllIIllIlIlIlII;
        this.IIlllIIIlIlllIIlllII = lIllllllIIllIlIlIlII;
        this.lIllllllIIllIlIlIlII = lIllllllIIllIlIlIlII;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlllllllIIIlIIIlIlII.IIlllIIIlIlllIIlllII();
        }
        return net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;
    }
    
    private void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this.H = 0.0f;
        this.J = 0.0f;
        switch (aw()[lllIllIIIllllllIllll.ordinal()]) {
            case 4: {
                this.J = -1.8f;
                break;
            }
            case 3: {
                this.J = 1.8f;
                break;
            }
            case 5: {
                this.H = 1.8f;
                break;
            }
            case 6: {
                this.H = -1.8f;
                break;
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b, final boolean b2, final boolean b3) {
        this.llllIIIIlIIIlIlllIll(0.6f, 1.8f);
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.G);
        if (this.G != null && ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.G, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl, false), 4);
            net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(this.IlllllllIIIlIIIlIlII, this.G, 0);
            if (ilIlIlIlIlllllllllIl2 == null) {
                ilIlIlIlIlllllllllIl2 = this.G.llllIIIIlIIIlIlllIll();
            }
            this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() + 0.1f, (double)(ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() + 0.5f));
        }
        this.F = false;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && b2) {
            this.IlllllllIIIlIIIlIlII.IIlllIIIlIlllIIlllII();
        }
        this.IlIlIlIlIlllllllllIl = (b ? 0 : 100);
        if (b3) {
            this.llllIIIIlIIIlIlllIll(this.G, false);
        }
    }
    
    private boolean lIIIIlIIIIIlllIllIII() {
        return this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.G).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
    }
    
    public static net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final boolean b) {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII) {
            return IlIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, 0);
        }
        if (!b) {
            return null;
        }
        final boolean llIIIlIlIllIIlIlIlII = llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII();
        final boolean llIIIlIlIllIIlIlIlII2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().llIIIlIlIllIIlIlIlII();
        return (llIIIlIlIllIIlIlIlII && llIIIlIlIllIIlIlIlII2) ? ilIlIlIlIlllllllllIl : null;
    }
    
    public float s() {
        if (this.G != null) {
            switch (aw()[((lllIllIIIllllllIllll)this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.G).llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IIlIlIlIIlIllIIIIIIl.IlllIIIIlIIIlIlIlIIl)).ordinal()]) {
                case 4: {
                    return 90.0f;
                }
                case 3: {
                    return 270.0f;
                }
                case 5: {
                    return 0.0f;
                }
                case 6: {
                    return 180.0f;
                }
            }
        }
        return 0.0f;
    }
    
    @Override
    public boolean ah() {
        return this.F;
    }
    
    public boolean t() {
        return this.F && this.IlIlIlIlIlllllllllIl >= 100;
    }
    
    public int u() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl v() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public boolean an() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI, final boolean ilIIIlIlIIIllIlIlIIl) {
        if (llIllIIIIIllIlIIIIlI != null) {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
            this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        }
        else {
            this.llIllIIIIIllIlIIIIlI = null;
            this.IlIIIlIlIIIllIlIlIIl = false;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
        this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, 1);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
    }
    
    public void IlIlIlIlIlllllllllIl(final net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl) {
    }
    
    public void ad() {
        super.ad();
        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIIlIIIlIlIIlllIIlll);
        if (this.IIIllIIllIIIIIIlIIlI()) {
            this.IlIIIlIlIIIllIlIlIIl(0.8f);
        }
        else {
            this.IlIIIlIlIIIllIlIlIIl(0.2f);
        }
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final float n, final float n2) {
        final double iIlllIlIIllIlIlIlIIl = this.IIlllIlIIllIlIlIlIIl;
        final double llIIIlIlIllIIlIlIlII = this.llIIIlIlIllIIlIlIlII;
        final double lllllIlIIIlIlIIlllII = this.lllllIlIIIlIlIIlllII;
        if (this.K.IlIlIlIlIlllllllllIl && this.IIIlIIIlIlIIlllIIlll == null) {
            final double llIIlllIIlllIIllIllI = this.llIIlllIIlllIIllIllI;
            final float liIlIIIIIIIlIIlIlIIl = this.lIIlIIIIIIIlIIlIlIIl;
            this.lIIlIIIIIIIlIIlIlIIl = this.K.llllIIIIlIIIlIlllIll() * (this.IIIllIIllIIIIIIlIIlI() ? 2 : 1);
            super.IllIIlllIIIIlllIIlIl(n, n2);
            this.llIIlllIIlllIIllIllI = llIIlllIIlllIIllIllI * 0.6;
            this.lIIlIIIIIIIlIIlIlIIl = liIlIIIIIIIlIIlIlIIl;
        }
        else {
            super.IllIIlllIIIIlllIIlIl(n, n2);
        }
        this.llIllIlIIIIllIlIIllI(this.IIlllIlIIllIlIlIlIIl - iIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII - llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII - lllllIlIIIlIlIIlllII);
    }
    
    @Override
    public float ag() {
        return (float)this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).IlIlIIIllIllIIIIIllI();
    }
    
    public void llIllIlIIIIllIlIIllI(final double n, final double n2, final double n3) {
        if (this.IIIlIIIlIlIIlllIIlll == null) {
            if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII)) {
                final int round = Math.round(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n2 * n2 + n3 * n3) * 100.0f);
                if (round > 0) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIllIlIlIIIlIlIlIII, round);
                    this.IlIIIlIlIIIllIlIlIIl(0.015f * round * 0.01f);
                }
            }
            else if (this.llIIIlIlllIllIIlIllI()) {
                final int round2 = Math.round(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n3 * n3) * 100.0f);
                if (round2 > 0) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIlIlIIIllIIllIIIllI, round2);
                    this.IlIIIlIlIIIllIlIlIIl(0.015f * round2 * 0.01f);
                }
            }
            else if (this.f_()) {
                if (n2 > 0.0) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll, (int)Math.round(n2 * 100.0));
                }
            }
            else if (this.IIIIIllIIIIlIIIIllIl) {
                final int round3 = Math.round(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n3 * n3) * 100.0f);
                if (round3 > 0) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII, round3);
                    if (this.IIIllIIllIIIIIIlIIlI()) {
                        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIllIlIIIIllIlIIllI, round3);
                        this.IlIIIlIlIIIllIlIlIIl(0.099999994f * round3 * 0.01f);
                    }
                    else {
                        if (this.IIIIIllIIIIlIIIIllIl()) {
                            this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl, round3);
                        }
                        this.IlIIIlIlIIIllIlIlIIl(0.01f * round3 * 0.01f);
                    }
                }
            }
            else {
                final int round4 = Math.round(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n3 * n3) * 100.0f);
                if (round4 > 25) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll, round4);
                }
            }
        }
    }
    
    private void lIlIlIIIllIIllIIIllI(final double n, final double n2, final double n3) {
        if (this.IIIlIIIlIlIIlllIIlll != null) {
            final int round = Math.round(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n * n + n2 * n2 + n3 * n3) * 100.0f);
            if (round > 0) {
                if (this.IIIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIlllIIlIllIllIlIIll, round);
                    if (this.IlIlIIIllIllIIIIIllI == null) {
                        this.IlIlIIIllIllIIIIIllI = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this);
                    }
                    else if (this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII)) >= 1000000.0) {
                        this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIlllIIlIllIllIlIIll);
                    }
                }
                else if (this.IIIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.lllIIIIlllllIlIIllIl, round);
                }
                else if (this.IIIlIIIlIlIIlllIIlll instanceof llIllIlIIIIllIlIIllI) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIlIIIIIIlllIlIllIl, round);
                }
                else if (this.IIIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IIllIIllIIIlIlIIIIlI, round);
                }
            }
        }
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
        if (!this.K.llIllIIIIIllIlIIIIlI) {
            if (n >= 2.0f) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI, (int)Math.round(n * 100.0));
            }
            super.IlIIIlIlIIIllIlIlIIl(n, n2);
        }
    }
    
    @Override
    protected void lllllIIIIIlIlIIIIIIl() {
        if (!this.IlIIIlIlIIIllIlIlIIl()) {
            super.lllllIIIIIlIlIIIIIIl();
        }
    }
    
    @Override
    protected String IlIllIlIlIIIlIlIlIII(final int n) {
        return (n > 4) ? "game.player.hurt.fall.big" : "game.player.hurt.fall.small";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IllIlIIllIllIIlIllII) {
            this.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIlIIIIIIlllIlIllIl);
        }
        final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.get(net.minecraft.llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl));
        if (llllIIllllIlIlIIIIll != null) {
            this.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl);
        }
    }
    
    @Override
    public void lllllIlIlIlllIlllIlI() {
        if (!this.K.IlIlIlIlIlllllllllIl) {
            super.lllllIlIlIlllIlllIlI();
        }
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llIllIlIIIIllIlIIllI(final int n) {
        return this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(n);
    }
    
    public void lllIIIIlllllIlIIllIl(int n) {
        this.IlIlIlIlIlllllllllIl(n);
        final int n2 = Integer.MAX_VALUE - this.M;
        if (n > n2) {
            n = n2;
        }
        this.N += n / (float)this.ap();
        this.M += n;
        while (this.N >= 1.0f) {
            this.N = (this.N - 1.0f) * this.ap();
            this.IIllIIllIIIlIlIIIIlI(1);
            this.N /= this.ap();
        }
    }
    
    public int ao() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public void IlIlIIIIIIlllIlIllIl(final int n) {
        this.L -= n;
        if (this.L < 0) {
            this.L = 0;
            this.N = 0.0f;
            this.M = 0;
        }
        this.IllIIlllIIIIlllIIlIl = this.IlIIllIIllIIllIIlIIl.nextInt();
    }
    
    public void IIllIIllIIIlIlIIIIlI(final int n) {
        this.L += n;
        if (this.L < 0) {
            this.L = 0;
            this.N = 0.0f;
            this.M = 0;
        }
        if (n > 0 && this.L % 5 == 0 && this.lIIIlllIIIllIIIllIII < this.lllllIIIIIlIlIIIIIIl - 100.0f) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this, "random.levelup", ((this.L > 30) ? 1.0f : (this.L / 30.0f)) * 0.75f, 1.0f);
            this.lIIIlllIIIllIIIllIII = this.lllllIIIIIlIlIIIIIIl;
        }
    }
    
    public int ap() {
        return (this.L >= 30) ? (112 + (this.L - 30) * 9) : ((this.L >= 15) ? (37 + (this.L - 15) * 5) : (7 + this.L * 2));
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final float n) {
        if (!this.K.llllIIIIlIIIlIlllIll && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.u.llllIIIIlIIIlIlllIll(n);
        }
    }
    
    public net.minecraft.IlllllllIIIlIIIlIlII.IllIlIIllIllIIlIllII aq() {
        return this.u;
    }
    
    public boolean llIIlIIIlIIIllIlIIIl(final boolean b) {
        return (b || this.u.llIllIIIIIllIlIIIIlI()) && !this.K.llllIIIIlIIIlIlllIll;
    }
    
    public boolean ar() {
        return this.N() > 0.0f && this.N() < this.U();
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl llllIIIlIlllIlIIIIIl, final int liiiIlIIIIIlllIllIII) {
        if (llllIIIlIlllIlIIIIIl != this.llllIIIlIlllIlIIIIIl) {
            this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.llllIIIlIlllIlIIIIIl(true);
            }
        }
    }
    
    public boolean as() {
        return this.K.IlIlIIIllIllIIIIIllI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return this.K.IlIlIIIllIllIIIIIllI || (lllIIIIlIlIllIIlIIIl != null && (lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI())).llIllIIIIIllIlIIIIlI()) || lllIIIIlIlIllIIlIIIl.IIlIIIIlllIlllllIlII()));
    }
    
    @Override
    protected int IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("keepInventory")) {
            return 0;
        }
        final int n = this.L * 7;
        return (n > 100) ? 100 : n;
    }
    
    @Override
    protected boolean A() {
        return true;
    }
    
    @Override
    public boolean lIIlllIlllllIIlllIll() {
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final boolean b) {
        if (b) {
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
            this.llIllIlIIIIllIlIIllI(llllIIIIlIIIlIlllIll.N());
            this.u = llllIIIIlIIIlIlllIll.u;
            this.L = llllIIIIlIIIlIlllIll.L;
            this.M = llllIIIIlIIIlIlllIll.M;
            this.N = llllIIIIlIIIlIlllIll.N;
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.m());
            this.IlIllllIIIlIllIlIIll = llllIIIIlIIIlIlllIll.IlIllllIIIlIllIlIIll;
            this.lIIIIIlIlIIIlIIIIlIl = llllIIIIlIIIlIlllIll.lIIIIIlIlIIIlIIIIlIl;
            this.IIllIIIlIIIIlIIlIIII = llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII;
        }
        else if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("keepInventory")) {
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
            this.L = llllIIIIlIIIlIlllIll.L;
            this.M = llllIIIIlIIIlIlllIll.M;
            this.N = llllIIIIlIIIlIlllIll.N;
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.m());
        }
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll;
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(10, llllIIIIlIIIlIlllIll.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(10));
    }
    
    @Override
    protected boolean c_() {
        return !this.K.IlIlIlIlIlllllllllIl;
    }
    
    public void llIIIlIlIllIIlIlIlII() {
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
    }
    
    @Override
    public String s_() {
        return this.llIIlIIIlIIIllIlIIIl.getName();
    }
    
    public IIlIIIIIllIlIIIlIIll at() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return (n == 0) ? this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl() : this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl[n - 1];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl n() {
        return this.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl[n] = lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IIIIIIIllllIlIIIIIII()) {
            return false;
        }
        if (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl()) {
            return false;
        }
        final IlIlIIIllIIllIlllllI w = this.w();
        return w == null || llllIIIIlIIIlIlllIll == null || llllIIIIlIIIlIlllIll.w() != w || !w.llllIIIlIlllIlIIIIIl();
    }
    
    public abstract boolean IlIIIlIlIIIllIlIlIIl();
    
    @Override
    public lllIIIIlIlIllIIlIIIl[] IlIllllIIIlIllIlIIll() {
        return this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean IllIlllIllIIIIllllII() {
        return !this.K.IlIlIlIlIlllllllllIl;
    }
    
    public net.minecraft.lllIIIIlllllIlIIllIl.llIIlIIIlIIIllIlIIIl au() {
        return this.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl();
    }
    
    @Override
    public IlIlIIIllIIllIlllllI w() {
        return this.au().IllIIlllIIIIlllIIlIl(this.s_());
    }
    
    @Override
    public llIIIIIIlIllIIlIIIll v_() {
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIIIIIIlllIlIllIl(net.minecraft.lllIIIIlllllIlIIllIl.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll(this.w(), this.s_()));
        ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.minecraft.lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, "/msg " + this.s_() + " "));
        ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.lIIlIIIIIIIlIIlIlIIl());
        ilIlIIIIIIlllIlIllIl.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(this.s_());
        return ilIlIIIIIIlllIlIllIl;
    }
    
    @Override
    public float llllIlIllllIIlIIlIlI() {
        float n = 1.62f;
        if (this.ah()) {
            n = 0.2f;
        }
        if (this.IIIIIllIIIIlIIIIllIl()) {
            n -= 0.08f;
        }
        return n;
    }
    
    @Override
    public void IIIIlllIIIIIIlIIIlll(float n) {
        if (n < 0.0f) {
            n = 0.0f;
        }
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(17, n);
    }
    
    @Override
    public float aj() {
        return this.llIllIlIlIIIIIIIllII().IlIIIlIlIIIllIlIlIIl(17);
    }
    
    public static UUID llllIIIIlIIIlIlllIll(final GameProfile gameProfile) {
        UUID uuid = gameProfile.getId();
        if (uuid == null) {
            uuid = IlIlIIIllIllIIIIIllI(gameProfile.getName());
        }
        return uuid;
    }
    
    public static UUID IlIlIIIllIllIIIIIllI(final String s) {
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + s).getBytes(Charsets.UTF_8));
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
        if (illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll()) {
            return true;
        }
        final lllIIIIlIlIllIIlIIIl p = this.p();
        return p != null && p.IlIlIIIIIIlllIlIllIl() && p.IIlllIIlIllIllIlIIll().equals(illlIIlIllIllIlIIll.IlIlIlIlIlllllllllIl());
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        return (this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(10) & ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll()) == ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public boolean d_() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IlIIIlIlIIIllIlIlIIl[0].llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("sendCommandFeedback");
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (n >= 0 && n < this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.length) {
            this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(n, lllIIIIlIlIllIIlIIIl);
            return true;
        }
        final int n2 = n - 100;
        if (n2 >= 0 && n2 < this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.length) {
            final int n3 = n2 + 1;
            if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != null) {
                if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
                    if (net.minecraft.llllIIIlIlllIlIIIIIl.IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl) != n3) {
                        return false;
                    }
                }
                else if (n3 != 4 || (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ab && !(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIlllIIIlIlllIIlllII))) {
                    return false;
                }
            }
            this.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(n2 + this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.length, lllIIIIlIlIllIIlIIIl);
            return true;
        }
        final int n4 = n - 200;
        if (n4 >= 0 && n4 < this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) {
            this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(n4, lllIIIIlIlIllIIlIIIl);
            return true;
        }
        return false;
    }
    
    public boolean av() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void lIlIlIIIllIIllIIIllI(final boolean llIllIlIIIIllIlIIllI) {
        this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
    }
    
    static /* synthetic */ int[] aw() {
        final int[] r = llllIIIIlIIIlIlllIll.R;
        if (r != null) {
            return r;
        }
        final int[] r2 = new int[lllIllIIIllllllIllll.values().length];
        try {
            r2[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            r2[lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError2) {}
        try {
            r2[lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError3) {}
        try {
            r2[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError4) {}
        try {
            r2[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError5) {}
        try {
            r2[lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError6) {}
        return llllIIIIlIIIlIlllIll.R = r2;
    }
}
