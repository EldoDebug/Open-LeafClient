package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.optifine.lIIIIlIIIIIlllIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;

public abstract class IlIllIlIlIIIlIlIlIII extends lllIIIIlllllIlIIllIl
{
    public int IllIIlllIIIIlllIIlIl;
    protected int llllIIIlIlllIlIIIIIl;
    private lIlIIlllIIlIIlIlllIl llllIIIIlIIIlIlllIll;
    protected IIlllIIlllIIIlIlllII lIIIIlIIIIIlllIllIII;
    protected lIllIIIIIlllIIlIIllI lIIIlllIIIllIIIllIII;
    private lIIIlllIIIllIIIllIII IlIlIlIlIlllllllllIl;
    protected IlIIIlIlIIIllIlIlIIl llIIlIIIlIIIllIlIIIl;
    protected final lIIlIIIlIllIlIllIIIl llIllIlIIIIllIlIIllI;
    protected final lIIlIIIlIllIlIllIIIl lIlIlIIIllIIllIIIllI;
    private lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI;
    private IlIIlllllIIllIIlllll IlIIIlIlIIIllIlIlIIl;
    private lllIIIIlIlIllIIlIIIl[] IlIlIIIllIllIIIIIllI;
    protected float[] IlIlIIIllIIllIlllllI;
    private boolean t;
    private boolean u;
    private boolean v;
    private llIllIIIIIllIlIIIIlI w;
    private IIIIlllIIIIIIlIIIlll x;
    private UUID y;
    private String z;
    
    public IlIllIlIlIIIlIlIlIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIlIIIllIllIIIIIllI = new lllIIIIlIlIllIIlIIIl[5];
        this.IlIlIIIllIIllIlllllI = new float[5];
        this.y = null;
        this.z = null;
        this.llIllIlIIIIllIlIIllI = new lIIlIIIlIllIlIllIIIl((illlllllIIIlIIIlIlII != null && illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII != null) ? illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII : null);
        this.lIlIlIIIllIIllIIIllI = new lIIlIIIlIllIlIllIIIl((illlllllIIIlIIIlIlII != null && illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII != null) ? illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII : null);
        this.llllIIIIlIIIlIlllIll = new lIlIIlllIIlIIlIlllIl(this);
        this.lIIIIlIIIIIlllIllIII = new IIlllIIlllIIIlIlllII(this);
        this.lIIIlllIIIllIIIllIII = new lIllIIIIIlllIIlIIllI(this);
        this.IlIlIlIlIlllllllllIl = new lIIIlllIIIllIIIllIII(this);
        this.llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = new IlIIlllllIIllIIlllll(this);
        for (int i = 0; i < this.IlIlIIIllIIllIlllllI.length; ++i) {
            this.IlIlIIIllIIllIlllllI[i] = 0.085f;
        }
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.X().IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(16.0);
    }
    
    protected IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return new IllIIlllIIIIlllIIlIl(this, illlllllIIIlIIIlIlII);
    }
    
    public lIlIIlllIIlIIlIlllIl IIlllIlIIllIlIlIlIIl() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    public IIlllIIlllIIIlIlllII llIIIlIlIllIIlIlIlII() {
        return this.lIIIIlIIIIIlllIllIII;
    }
    
    public lIllIIIIIlllIIlIIllI lllllIlIIIlIlIIlllII() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public IlIIIlIlIIIllIlIlIIl lIllllllIIllIlIlIlII() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public IlIIlllllIIllIIlllll llIIlllIIlllIIllIllI() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lllIIIIlllllIlIIllIl IIlllIIIlIlllIIlllII() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIlIlIlIlllllllllIl(final lllIIIIlllllIlIIllIl llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIIIIlllIlIIIIIIIllI, this, llIllIIIIIllIlIIIIlI);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final Class clazz) {
        return clazz != llIllIlIIIIllIlIIllI.class;
    }
    
    public void IIlIIIIIllIlIIIlIIll() {
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(15, (Object)0);
    }
    
    public int IIIllllllIllIIIlllIl() {
        return 80;
    }
    
    public void IlIIIlIIIllllIlIlIlI() {
        final String e = this.e();
        if (e != null) {
            this.llllIIIIlIIIlIlllIll(e, this.Z(), this.aa());
        }
    }
    
    @Override
    public void IlIllllIIlIIlIlIlIll() {
        super.IlIllllIIlIIlIlIlIll();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("mobBaseTick");
        if (this.llllIllllIllllIlIlII() && this.IlIIllIIllIIllIIlIIl.nextInt(1000) < this.IllIIlllIIIIlllIIlIl++) {
            this.IllIIlllIIIIlllIIlIl = -this.IIIllllllIllIIIlllIl();
            this.IlIIIlIIIllllIlIlIlI();
        }
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    @Override
    protected int IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.llllIIIlIlllIlIIIIIl > 0) {
            int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl;
            final lllIIIIlIlIllIIlIIIl[] ilIllllIIIlIllIlIIll = this.IlIllllIIIlIllIlIIll();
            for (int i = 0; i < ilIllllIIIlIllIlIIll.length; ++i) {
                if (ilIllllIIIlIllIlIIll[i] != null && this.IlIlIIIllIIllIlllllI[i] <= 1.0f) {
                    llllIIIlIlllIlIIIIIl += 1 + this.IlIIllIIllIIllIIlIIl.nextInt(3);
                }
            }
            return llllIIIlIlllIlIIIIIl;
        }
        return this.llllIIIlIlllIlIIIIIl;
    }
    
    public void IIllllIIIlIIIIIIllIl() {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            for (int i = 0; i < 20; ++i) {
                final double n = this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02;
                final double n2 = this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02;
                final double n3 = this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02;
                final double n4 = 10.0;
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII - n * n4, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll - n2 * n4, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII - n3 * n4, n, n2, n3, new int[0]);
            }
        }
        else {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)20);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 20) {
            this.IIllllIIIlIIIIIIllIl();
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (net.minecraft.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll.h() && this.llllIIllllIlIlIIIIll()) {
            this.IlIllIlIlIIIlIlIlIII();
        }
        else {
            super.IIllIIllIIIlIlIIIIlI();
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.IIIlIIlIIIIlllIlllII();
            }
        }
    }
    
    @Override
    protected float llllIIIlIlllIlIIIIIl(final float n, final float n2) {
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        return n2;
    }
    
    protected String e() {
        return null;
    }
    
    protected net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f() {
        return null;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl f = this.f();
        if (f != null) {
            int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(3);
            if (n > 0) {
                nextInt += this.IlIIllIIllIIllIIlIIl.nextInt(n + 1);
            }
            for (int i = 0; i < nextInt; ++i) {
                this.llllIIIIlIIIlIlllIll(f, 1);
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("CanPickUpLoot", this.q());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("PersistenceRequired", this.u);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
            if (this.IlIlIIIllIllIIIIIllI[i] != null) {
                this.IlIlIIIllIllIIIIIllI[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
            }
            ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Equipment", ilIlIIIlIIlIlIIlllIl);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = new IlIlIIIlIIlIlIIlllIl();
        for (int j = 0; j < this.IlIlIIIllIIllIlllllI.length; ++j) {
            ilIlIIIlIIlIlIIlllIl2.llllIIIIlIIIlIlllIll(new IlIlIIIIIIlllIlIllIl(this.IlIlIIIllIIllIlllllI[j]));
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DropChances", ilIlIIIlIIlIlIIlllIl2);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Leashed", this.v);
        if (this.w != null) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll3 = new IIIIlllIIIIIIlIIIlll();
            if (this.w instanceof lllIIIIlllllIlIIllIl) {
                iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("UUIDMost", this.w.lllIIIIlIlIllIIlIIIl().getMostSignificantBits());
                iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("UUIDLeast", this.w.lllIIIIlIlIllIIlIIIl().getLeastSignificantBits());
            }
            else if (this.w instanceof lIlIlIIIllIIllIIIllI) {
                final IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI = ((lIlIlIIIllIIllIIIllI)this.w).lIlIlIIIllIIllIIIllI();
                iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("X", lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII());
                iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("Y", lIlIlIIIllIIllIIIllI.lIIIlllIIIllIIIllIII());
                iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("Z", lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl());
            }
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Leash", iiiIlllIIIIIIlIIIlll3);
        }
        if (this.v()) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("NoAI", this.v());
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("CanPickUpLoot", 1)) {
            this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("CanPickUpLoot"));
        }
        this.u = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("PersistenceRequired");
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Equipment", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Equipment", 10);
            for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.length; ++i) {
                this.IlIlIIIllIllIIIIIllI[i] = net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i));
            }
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("DropChances", 9)) {
            final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI2 = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("DropChances", 5);
            for (int j = 0; j < llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI(); ++j) {
                this.IlIlIIIllIIllIlllllI[j] = llIllIIIIIllIlIIIIlI2.IlIlIIIllIllIIIIIllI(j);
            }
        }
        this.v = iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("Leashed");
        if (this.v && iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Leash", 10)) {
            this.x = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Leash");
        }
        this.llIIlIIIlIIIllIlIIIl(iiiIlllIIIIIIlIIIlll.IIIIlllIIIIIIlIIIlll("NoAI"));
    }
    
    public void IllIIlllIIIIlllIIlIl(final float l) {
        this.l = l;
    }
    
    @Override
    public void llIIlIIIlIIIllIlIIIl(final float n) {
        super.llIIlIIIlIIIllIlIIIl(n);
        this.IllIIlllIIIIlllIIlIl(n);
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        super.IIIlIIIlIlIIlllIIlll();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("looting");
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.q() && !this.a && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
            for (final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII : this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(1.0, 0.0, 1.0))) {
                if (!liiIlllIIIllIIIllIII.IIlIlIlIIlIllIIIIIIl && liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII() != null && !liiIlllIIIllIIIllIII.IlIlIIIIIIlllIlIllIl()) {
                    this.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII);
                }
            }
        }
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
        final lllIIIIlIlIllIIlIIIl liiiIlIIIIIlllIllIII = liiIlllIIIllIIIllIII.lIIIIlIIIIIlllIllIII();
        final int ilIlIlIlIlllllllllIl = IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII);
        if (ilIlIlIlIlllllllllIl > -1) {
            boolean b = true;
            final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
            if (llIllIIIIIllIlIIIIlI != null) {
                if (ilIlIlIlIlllllllllIl == 0) {
                    if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() instanceof IllIlllIllIIIIllllII && !(llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() instanceof IllIlllIllIIIIllllII)) {
                        b = true;
                    }
                    else if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() instanceof IllIlllIllIIIIllllII && llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() instanceof IllIlllIllIIIIllllII) {
                        final IllIlllIllIIIIllllII illIlllIllIIIIllllII = (IllIlllIllIIIIllllII)liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
                        final IllIlllIllIIIIllllII illIlllIllIIIIllllII2 = (IllIlllIllIIIIllllII)llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
                        if (illIlllIllIIIIllllII.lllIIIIlllllIlIIllIl() != illIlllIllIIIIllllII2.lllIIIIlllllIlIIllIl()) {
                            b = (illIlllIllIIIIllllII.lllIIIIlllllIlIIllIl() > illIlllIllIIIIllllII2.lllIIIIlllllIlIIllIl());
                        }
                        else {
                            b = (liiiIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII() > llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() || (liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll() && !llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll()));
                        }
                    }
                    else {
                        b = (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() instanceof IIIllllllIllIIIlllIl && llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() instanceof IIIllllllIllIIIlllIl && liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll() && !llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll());
                    }
                }
                else if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII && !(llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII)) {
                    b = true;
                }
                else if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII && llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
                    final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII = (IIIlIIlIIIIlllIlllII)liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll();
                    final IIIlIIlIIIIlllIlllII iiIlIIlIIIIlllIlllII2 = (IIIlIIlIIIIlllIlllII)llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll();
                    if (iiIlIIlIIIIlllIlllII.lIIIlllIIIllIIIllIII != iiIlIIlIIIIlllIlllII2.lIIIlllIIIllIIIllIII) {
                        b = (iiIlIIlIIIIlllIlllII.lIIIlllIIIllIIIllIII > iiIlIIlIIIIlllIlllII2.lIIIlllIIIllIIIllIII);
                    }
                    else {
                        b = (liiiIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII() > llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII() || (liiiIlIIIIIlllIllIII.IIIIlllIIIIIIlIIIlll() && !llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll()));
                    }
                }
                else {
                    b = false;
                }
            }
            if (b && this.a_(liiiIlIIIIIlllIllIII)) {
                if (llIllIIIIIllIlIIIIlI != null && this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.1f < this.IlIlIIIllIIllIlllllI[ilIlIlIlIlllllllllIl]) {
                    this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0.0f);
                }
                if (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII && liiIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI() != null) {
                    final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.lIlIlIIIllIIllIIIllI());
                    if (llllIIIIlIIIlIlllIll != null) {
                        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII);
                    }
                }
                this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII);
                this.IlIlIIIllIIllIlllllI[ilIlIlIlIlllllllllIl] = 2.0f;
                this.u = true;
                this.IlIlIlIlIlllllllllIl(liiIlllIIIllIIIllIII, 1);
                liiIlllIIIllIIIllIII.IllIllIIIIlIIlIlllII();
            }
        }
    }
    
    protected boolean a_(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return true;
    }
    
    protected boolean g() {
        return true;
    }
    
    protected void h() {
        final Object llllIIIIlIIIlIlllIll = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IIlllIIIlIlllIIlllII);
        final Object llllIIIIlIIIlIlllIll2 = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.lIllllllIIllIlIlIlII);
        if (this.u) {
            this.b = 0;
        }
        else {
            final Object llllIIIlIlllIlIIIIIl;
            if ((this.b & 0x1F) == 0x1F && (llllIIIlIlllIlIIIIIl = net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(net.optifine.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII.IlIIIIIlIIllIIlIlIll, this)) != llllIIIIlIIIlIlllIll) {
                if (llllIIIlIlllIlIIIIIl == llllIIIIlIIIlIlllIll2) {
                    this.b = 0;
                }
                else {
                    this.IllIllIIIIlIIlIlllII();
                }
            }
            else {
                final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, -1.0);
                if (llllIIIIlIIIlIlllIll3 != null) {
                    final double n = llllIIIIlIIIlIlllIll3.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
                    final double n2 = llllIIIIlIIIlIlllIll3.llIIIlIlIllIIlIlIlII - this.llIIIlIlIllIIlIlIlII;
                    final double n3 = llllIIIIlIIIlIlllIll3.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII;
                    final double n4 = n * n + n2 * n2 + n3 * n3;
                    if (this.g() && n4 > 16384.0) {
                        this.IllIllIIIIlIIlIlllII();
                    }
                    if (this.b > 600 && this.IlIIllIIllIIllIIlIIl.nextInt(800) == 0 && n4 > 1024.0 && this.g()) {
                        this.IllIllIIIIlIIlIlllII();
                    }
                    else if (n4 < 1024.0) {
                        this.b = 0;
                    }
                }
            }
        }
    }
    
    @Override
    protected final void IIIIIIIIIlllIllIlIlI() {
        ++this.b;
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("checkDespawn");
        this.h();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("sensing");
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("targetSelector");
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("goalSelector");
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("navigation");
        this.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("mob tick");
        this.i();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("controls");
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("move");
        this.lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("look");
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI("jump");
        this.lIIIlllIIIllIIIllIII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    protected void i() {
    }
    
    public int j() {
        return 40;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2) {
        final double n3 = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
        final double n4 = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII;
        double n5;
        if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI;
            n5 = lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII + lllIIIIlllllIlIIllIl.llllIlIllllIIlIIlIlI() - (this.llIIIlIlIllIIlIlIlII + this.llllIlIllllIIlIIlIlI());
        }
        else {
            n5 = (llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIIIllIllIIIIIllI) / 2.0 - (this.llIIIlIlIllIIlIlIlII + this.llllIlIllllIIlIIlIlI());
        }
        final double n6 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * n3 + n4 * n4);
        final float n7 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n4, n3) * 180.0 / 3.141592653589793) - 90.0f;
        this.llllllIllIllIlIllllI = this.llllIIIIlIIIlIlllIll(this.llllllIllIllIlIllllI, (float)(-(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n5, n6) * 180.0 / 3.141592653589793)), n2);
        this.IIlIIIIIllIlIIIlIIll = this.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll, n7, n);
    }
    
    private float llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3) {
        float llllIIIlIlllIlIIIIIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n2 - n);
        if (llllIIIlIlllIlIIIIIl > n3) {
            llllIIIlIlllIlIIIIIl = n3;
        }
        if (llllIIIlIlllIlIIIIIl < -n3) {
            llllIIIlIlllIlIIIIIl = -n3;
        }
        return n + llllIIIlIlllIlIIIIIl;
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return true;
    }
    
    public boolean k() {
        return this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI(), this) && this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIIlllIIlIlllllIIlI()).isEmpty() && !this.IlllllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(this.IlIIlllIIlIlllllIIlI());
    }
    
    public float l() {
        return 1.0f;
    }
    
    public int m() {
        return 4;
    }
    
    @Override
    public int llIlIIIIllIlIIlIlIII() {
        if (this.IIlllIIIlIlllIIlllII() == null) {
            return 3;
        }
        int n = (int)(this.N() - this.U() * 0.33f) - (3 - this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll()) * 4;
        if (n < 0) {
            n = 0;
        }
        return n + 3;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl n() {
        return this.IlIlIIIllIllIIIIIllI[0];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.IlIlIIIllIllIIIIIllI[n];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llIllIlIIIIllIlIIllI(final int n) {
        return this.IlIlIIIllIllIIIIIllI[n + 1];
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IlIlIIIllIllIIIIIllI[n] = lllIIIIlIlIllIIlIIIl;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl[] IlIllllIIIlIllIlIIll() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final boolean b, final int n) {
        for (int i = 0; i < this.IlIllllIIIlIllIlIIll().length; ++i) {
            final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(i);
            final boolean b2 = this.IlIlIIIllIIllIlllllI[i] > 1.0f;
            if (llIllIIIIIllIlIIIIlI != null && (b || b2) && this.IlIIllIIllIIllIIlIIl.nextFloat() - n * 0.01f < this.IlIlIIIllIIllIlllllI[i]) {
                if (!b2 && llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl()) {
                    final int max = Math.max(llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII() - 25, 1);
                    int n2 = llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII() - this.IlIIllIIllIIllIIlIIl.nextInt(this.IlIIllIIllIIllIIlIIl.nextInt(max) + 1);
                    if (n2 > max) {
                        n2 = max;
                    }
                    if (n2 < 1) {
                        n2 = 1;
                    }
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2);
                }
                this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, 0.0f);
            }
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.15f * ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl()) {
            int nextInt = this.IlIIllIIllIIllIIlIIl.nextInt(2);
            final float n = (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) ? 0.1f : 0.25f;
            if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.095f) {
                ++nextInt;
            }
            if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.095f) {
                ++nextInt;
            }
            if (this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.095f) {
                ++nextInt;
            }
            for (int i = 3; i >= 0; --i) {
                final lllIIIIlIlIllIIlIIIl llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI(i);
                if (i < 3 && this.IlIIllIIllIIllIIlIIl.nextFloat() < n) {
                    break;
                }
                if (llIllIlIIIIllIlIIllI == null) {
                    final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(i + 1, nextInt);
                    if (llllIIIIlIIIlIlllIll != null) {
                        this.llllIIIIlIIIlIlllIll(i + 1, new lllIIIIlIlIllIIlIIIl(llllIIIIlIIIlIlllIll));
                    }
                }
            }
        }
    }
    
    public static int IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI) && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.ab) {
            if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
                switch (((IIIlIIlIIIIlllIlllII)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).lIIIIlIIIIIlllIllIII) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 2;
                    }
                    case 3: {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 4;
    }
    
    public static net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final int n, final int n2) {
        switch (n) {
            case 4: {
                if (n2 == 0) {
                    return IIllIIllIIIlIlIIIIlI.IIlIlIlIIlIllIIIIIIl;
                }
                if (n2 == 1) {
                    return IIllIIllIIIlIlIIIIlI.lIllIIIIIlllIIlIIllI;
                }
                if (n2 == 2) {
                    return IIllIIllIIIlIlIIIIlI.llIlIIIIIlIIlIlIIlll;
                }
                if (n2 == 3) {
                    return IIllIIllIIIlIlIIIIlI.IIlIIIlllIllIllIlIII;
                }
                if (n2 == 4) {
                    return IIllIIllIIIlIlIIIIlI.llIIIlIlllIllIIlIllI;
                }
            }
            case 3: {
                if (n2 == 0) {
                    return IIllIIllIIIlIlIIIIlI.IllIllIIIIlIIlIlllII;
                }
                if (n2 == 1) {
                    return IIllIIllIIIlIlIIIIlI.lIlIIlllIIlIIlIlllIl;
                }
                if (n2 == 2) {
                    return IIllIIllIIIlIlIIIIlI.IlIIlIlIIIlIIlIlIlII;
                }
                if (n2 == 3) {
                    return IIllIIllIIIlIlIIIIlI.lIlIlIlllIIlIlIlllIl;
                }
                if (n2 == 4) {
                    return IIllIIllIIIlIlIIIIlI.IlIIllIIllIIllIIlIIl;
                }
            }
            case 2: {
                if (n2 == 0) {
                    return IIllIIllIIIlIlIIIIlI.IlIllllIIlIIlIlIlIll;
                }
                if (n2 == 1) {
                    return IIllIIllIIIlIlIIIIlI.llIIIllIlIllIllIIIIl;
                }
                if (n2 == 2) {
                    return IIllIIllIIIlIlIIIIlI.IllIlIIllIllIIlIllII;
                }
                if (n2 == 3) {
                    return IIllIIllIIIlIlIIIIlI.llIIIIIIlIllIIlIIIll;
                }
                if (n2 == 4) {
                    return IIllIIllIIIlIlIIIIlI.lllllIIIIIlIlIIIIIIl;
                }
            }
            case 1: {
                if (n2 == 0) {
                    return IIllIIllIIIlIlIIIIlI.IllIllIlllIllllIIllI;
                }
                if (n2 == 1) {
                    return IIllIIllIIIlIlIIIIlI.IIIllIIIlIlIIllIIIlI;
                }
                if (n2 == 2) {
                    return IIllIIllIIIlIlIIIIlI.lIIlIIIlIllIlIllIIIl;
                }
                if (n2 == 3) {
                    return IIllIIllIIIlIlIIIIlI.lIIIIlIlIllllIIlIllI;
                }
                if (n2 == 4) {
                    return IIllIIllIIIlIlIIIIlI.IllIIlllllIIllIIllIl;
                }
                break;
            }
        }
        return null;
    }
    
    protected void IlIlIlIlIlllllllllIl(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        final float ilIlIlIlIlllllllllIl = ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
        if (this.n() != null && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.25f * ilIlIlIlIlllllllllIl) {
            net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, this.n(), (int)(5.0f + ilIlIlIlIlllllllllIl * this.IlIIllIIllIIllIIlIIl.nextInt(18)));
        }
        for (int i = 0; i < 4; ++i) {
            final lllIIIIlIlIllIIlIIIl llIllIlIIIIllIlIIllI = this.llIllIlIIIIllIlIIllI(i);
            if (llIllIlIIIIllIlIIllI != null && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.5f * ilIlIlIlIlllllllllIl) {
                net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, llIllIlIIIIllIlIIllI, (int)(5.0f + ilIlIlIlIlllllllllIl * this.IlIIllIIllIIllIIlIIl.nextInt(18)));
            }
        }
    }
    
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll(final IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).IlIlIlIlIlllllllllIl(new net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Random spawn bonus", this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.05, 1));
        return llIIIlIlIllIIlIlIlII;
    }
    
    public boolean o() {
        return false;
    }
    
    public void p() {
        this.u = true;
    }
    
    public void llllIIIIlIIIlIlllIll(final int n, final float n2) {
        this.IlIlIIIllIIllIlllllI[n] = n2;
    }
    
    public boolean q() {
        return this.t;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean t) {
        this.t = t;
    }
    
    public boolean r() {
        return this.u;
    }
    
    @Override
    public final boolean a_(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.t() && this.u() == llllIIIIlIIIlIlllIll) {
            this.llllIIIIlIIIlIlllIll(true, !llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl);
            return true;
        }
        final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.IlIIIlIlIIIllIlIlIIl();
        if (ilIIIlIlIIIllIlIlIIl != null && ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ar && this.s()) {
            if (!(this instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIlIIlIIIIlllIlllII) || !((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIlIIlIIIIlllIlllII)this).as()) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, true);
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIIIlIlIIIllIlIlIIl;
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                return true;
            }
            if (((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIlIIlIIIIlllIlllII)this).IlIlIIIllIllIIIIIllI((lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll)) {
                this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, true);
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = ilIIIlIlIIIllIlIlIIl;
                --lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl;
                return true;
            }
        }
        return this.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) || super.a_(llllIIIIlIIIlIlllIll);
    }
    
    protected boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return false;
    }
    
    protected void IIIlIIlIIIIlllIlllII() {
        if (this.x != null) {
            this.lIIIIlIIIIIlllIllIII();
        }
        if (this.v) {
            if (!this.llllIllllIllllIlIlII()) {
                this.llllIIIIlIIIlIlllIll(true, true);
            }
            if (this.w == null || this.w.IIlIlIlIIlIllIIIIIIl) {
                this.llllIIIIlIIIlIlllIll(true, true);
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b, final boolean b2) {
        if (this.v) {
            this.v = false;
            this.w = null;
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && b2) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ar, 1);
            }
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && b && this.IlllllllIIIlIIIlIlII instanceof net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl) {
                ((net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(this, new lllllIlIIIlIlIIlllII(1, this, null));
            }
        }
    }
    
    public boolean s() {
        return !this.t() && !(this instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.IllIlIIllIllIIlIllII);
    }
    
    public boolean t() {
        return this.v;
    }
    
    public llIllIIIIIllIlIIIIlI u() {
        return this.w;
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI w, final boolean b) {
        this.v = true;
        this.w = w;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && b && this.IlllllllIIIlIIIlIlII instanceof net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl) {
            ((net.minecraft.IIIlIIlIIIIlllIlllII.IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(this, new lllllIlIIIlIlIIlllII(1, this, this.w));
        }
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        if (this.v && this.x != null) {
            if (this.x.IlIlIlIlIlllllllllIl("UUIDMost", 4) && this.x.IlIlIlIlIlllllllllIl("UUIDLeast", 4)) {
                final UUID uuid = new UUID(this.x.llllIIIlIlllIlIIIIIl("UUIDMost"), this.x.llllIIIlIlllIlIIIIIl("UUIDLeast"));
                for (final lllIIIIlllllIlIIllIl w : this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(10.0, 10.0, 10.0))) {
                    if (w.lllIIIIlIlIllIIlIIIl().equals(uuid)) {
                        this.w = w;
                        break;
                    }
                }
            }
            else if (this.x.IlIlIlIlIlllllllllIl("X", 99) && this.x.IlIlIlIlIlllllllllIl("Y", 99) && this.x.IlIlIlIlIlllllllllIl("Z", 99)) {
                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(this.x.IllIIlllIIIIlllIIlIl("X"), this.x.IllIIlllIIIIlllIIlIl("Y"), this.x.IllIIlllIIIIlllIIlIl("Z"));
                IlIlIIIllIIllIlllllI w2 = net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIIllIlllllI.IlIlIlIlIlllllllllIl(this.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                if (w2 == null) {
                    w2 = net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                }
                this.w = w2;
            }
            else {
                this.llllIIIIlIIIlIlllIll(false, true);
            }
        }
        this.x = null;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        int n2;
        if (n == 99) {
            n2 = 0;
        }
        else {
            n2 = n - 100 + 1;
            if (n2 < 0 || n2 >= this.IlIlIIIllIllIIIIIllI.length) {
                return false;
            }
        }
        if (lllIIIIlIlIllIIlIIIl == null || IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl) == n2 || (n2 == 4 && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIlllIIIlIlllIIlllII)) {
            this.llllIIIIlIIIlIlllIll(n2, lllIIIIlIlIllIIlIIIl);
            return true;
        }
        return false;
    }
    
    @Override
    public boolean llllllIllIllIlIllllI() {
        return super.llllllIllIllIlIllllI() && !this.v();
    }
    
    public void llIIlIIIlIIIllIlIIIl(final boolean b) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(15, (byte)(byte)(b ? 1 : 0));
    }
    
    public boolean v() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(15) != 0;
    }
    
    private boolean llllIIllllIlIlIIIIll() {
        if (this.e_()) {
            return false;
        }
        if (this.IIlllIIlIllIllIlIIll > 0) {
            return false;
        }
        if (this.lllllIIIIIlIlIIIIIIl < 20) {
            return false;
        }
        final IlllllllIIIlIIIlIlII k_ = this.k_();
        if (k_ == null) {
            return false;
        }
        if (k_.IllIIlllIIIIlllIIlIl.size() != 1) {
            return false;
        }
        final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = k_.IllIIlllIIIIlllIIlIl.get(0);
        final double max = Math.max(Math.abs(this.IIlllIlIIllIlIlIlIIl - llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl) - 16.0, 0.0);
        final double max2 = Math.max(Math.abs(this.lllllIlIIIlIlIIlllII - llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII) - 16.0, 0.0);
        return !this.llllIIIIlIIIlIlllIll(max * max + max2 * max2);
    }
    
    private void IlIllIlIlIIIlIlIlIII() {
        ++this.b;
        if (this instanceof IIlllIlIIllIlIlIlIIl && this.b_(1.0f) > 0.5f) {
            this.b += 2;
        }
        this.h();
    }
    
    @Override
    public net.minecraft.lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI w() {
        final UUID lllIIIIlIlIllIIlIIIl = this.lllIIIIlIlIllIIlIIIl();
        if (this.y != lllIIIIlIlIllIIlIIIl) {
            this.y = lllIIIIlIlIllIIlIIIl;
            this.z = lllIIIIlIlIllIIlIIIl.toString();
        }
        return this.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl().IllIIlllIIIIlllIIlIl(this.z);
    }
}
