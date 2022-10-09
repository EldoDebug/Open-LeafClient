package net.minecraft.llllIIIlIlllIlIIIIIl;

import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import com.google.common.base.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;

public abstract class lllIIIIlllllIlIIllIl extends llIllIIIIIllIlIIIIlI
{
    private static final UUID llllIIIIlIIIlIlllIll;
    private static final llllIIIIlIIIlIlllIll IlIlIlIlIlllllllllIl;
    private net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI;
    private final llIIIlIlIllIIlIlIlII IlIIIlIlIIIllIlIlIIl;
    private final Map IlIlIIIllIllIIIIIllI;
    private final lllIIIIlIlIllIIlIIIl[] lIIIIlIIIIIlllIllIII;
    public boolean IIIIlllIIIIIIlIIIlll;
    public int llllIIllllIlIlIIIIll;
    public int IlIllIlIlIIIlIlIlIII;
    public int IIlllIIlIllIllIlIIll;
    public int IIIIIIIllllIlIIIIIII;
    public float IIlllIIIllIllIIlIlIl;
    public int llIlllIlllllIIllIIII;
    public float lllllIlIlIlllIlllIlI;
    public float IlIllllIIlIllIlIlIll;
    public float lllIlIIIIIlIlllllIlI;
    public float llIlIIIIllIlIIlIlIII;
    public float IIIIIlllIlIIIIIIIllI;
    public int llllllIIIIIIIlllIIll;
    public float IIlIlllIlIlllIlIllll;
    public float lIllllIllIllIIllllll;
    public float lllIIIIlIlIllIIlIIIl;
    public float IllIlllIllIIIIllllII;
    public float lIllIlIIIllllllIIlII;
    public float IlIllIIllIIlIIIIlIIl;
    public float lIIlllIlllllIIlllIll;
    public float lIllIIlIlIlllllIIIII;
    public float lIIlIIIIIIIlIIlIlIIl;
    protected net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll IlIIlllIIlIlllllIIlI;
    protected int llllIlIllllIIlIIlIlI;
    protected boolean a;
    protected int b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected int h;
    protected float i;
    protected boolean j;
    public float k;
    public float l;
    protected float m;
    protected int n;
    protected double o;
    protected double p;
    protected double q;
    protected double r;
    protected double s;
    private boolean lIIIlllIIIllIIIllIII;
    private lllIIIIlllllIlIIllIl llIIlIIIlIIIllIlIIIl;
    private int llIllIlIIIIllIlIIllI;
    private lllIIIIlllllIlIIllIl lIlIlIIIllIIllIIIllI;
    private int IlIlIIIllIIllIlllllI;
    private float t;
    private int u;
    private float v;
    
    static {
        llllIIIIlIIIlIlllIll = UUID.fromString("662A6B8D-DA3E-4C1C-8813-96EA6097278D");
        IlIlIlIlIlllllllllIl = new llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll, "Sprinting speed boost", 0.30000001192092896, 2).llllIIIIlIIIlIlllIll(false);
    }
    
    @Override
    public void lllIllIIIllllllIllll() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl, Float.MAX_VALUE);
    }
    
    public lllIIIIlllllIlIIllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = new llIIIlIlIllIIlIlIlII(this);
        this.IlIlIIIllIllIIIIIllI = Maps.newHashMap();
        this.lIIIIlIIIIIlllIllIII = new lllIIIIlIlIllIIlIIIl[5];
        this.llllllIIIIIIIlllIIll = 20;
        this.lIIlIIIIIIIlIIlIlIIl = 0.02f;
        this.lIIIlllIIIllIIIllIII = true;
        this.IlIlIllllllllIIIIlII();
        this.llIllIlIIIIllIlIIllI(this.U());
        this.IlIlIIIIIIlllIlIllIl = true;
        this.IllIlllIllIIIIllllII = (float)((Math.random() + 1.0) * 0.009999999776482582);
        this.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII);
        this.lllIIIIlIlIllIIlIIIl = (float)Math.random() * 12398.0f;
        this.IIlIIIIIllIlIIIlIIll = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.lIIlllIlllllIIlllIll = this.IIlIIIIIllIlIIIlIIll;
        this.llIIIIIIlIllIIlIIIll = 0.6f;
    }
    
    @Override
    protected void a_() {
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(7, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(8, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(9, (Object)0);
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(6, 1.0f);
    }
    
    protected void IlIlIllllllllIIIIlII() {
        this.X().IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll);
        this.X().IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI);
        this.X().IlIlIlIlIlllllllllIl(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final double n, final boolean b, final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!this.llIIIlIlllIllIIlIllI()) {
            this.IlIIllIIllIIllIIlIIl();
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IllIlIIllIllIIlIllII > 3.0f && b) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
            final float n2 = (float)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(this.IllIlIIllIllIIlIllII - 3.0f);
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                double n3 = Math.min(0.2f + n2 / 15.0f, 10.0f);
                if (n3 > 2.5) {
                    n3 = 2.5;
                }
                ((IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIllllIIIlIIIIIIllIl, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, (int)(150.0 * n3), 0.0, 0.0, 0.0, 0.15000000596046448, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2));
            }
        }
        super.llllIIIIlIIIlIlllIll(n, b, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
    }
    
    public boolean x() {
        return false;
    }
    
    @Override
    public void IlIllllIIlIIlIlIlIll() {
        this.lllllIlIlIlllIlllIlI = this.IlIllllIIlIllIlIlIll;
        super.IlIllllIIlIIlIlIlIll();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("livingEntityBaseTick");
        final boolean b = this instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;
        if (this.llllIllllIllllIlIlII()) {
            if (this.IIlIlIllllIlllIIIIll()) {
                this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, 1.0f);
            }
            else if (b && !this.IlllllllIIIlIIIlIlII.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI())) {
                final double n = this.IlllllllIIIlIIIlIlII.IllIllIlllIllllIIllI().llllIIIIlIIIlIlllIll(this) + this.IlllllllIIIlIIIlIlII.IllIllIlllIllllIIllI().IlIlIIIllIIllIlllllI();
                if (n < 0.0) {
                    this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI, (float)Math.max(1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(-n * this.IlllllllIIIlIIIlIlII.IllIllIlllIllllIIllI().IIIIlllIIIIIIlIIIlll())));
                }
            }
        }
        if (this.llIIIIIIlIllIIlIIIll() || this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IlIIlIlIIIlIIlIlIlII();
        }
        final boolean b2 = b && ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)this).K.llllIIIIlIIIlIlllIll;
        if (this.llllIllllIllllIlIlII()) {
            if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII)) {
                if (!this.x() && !this.IlIlIIIllIIllIlllllI(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.llllllIllIllIlIllllI) && !b2) {
                    this.lIIIIlIIIIIlllIllIII(this.lIlIlIIIllIIllIIIllI(this.llIlllIlllllIIllIIII()));
                    if (this.llIlllIlllllIIllIIII() == -20) {
                        this.lIIIIlIIIIIlllIllIII(0);
                        for (int i = 0; i < 8; ++i) {
                            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIIIllIllIIIIIllI, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()), this.llIIIlIlIllIIlIlIlII + (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()), this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()), this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII, new int[0]);
                        }
                        this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl, 2.0f);
                    }
                }
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IIllIIIlIIIIlIIlIIII() && this.IIIlIIIlIlIIlllIIlll instanceof lllIIIIlllllIlIIllIl) {
                    this.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)null);
                }
            }
            else {
                this.lIIIIlIIIIIlllIllIII(300);
            }
        }
        if (this.llllIllllIllllIlIlII() && this.lIIIIlIlIllllIIlIllI()) {
            this.IlIIlIlIIIlIIlIlIlII();
        }
        this.IIlIlllIlIlllIlIllll = this.lIllllIllIllIIllllll;
        if (this.IIlllIIlIllIllIlIIll > 0) {
            --this.IIlllIIlIllIllIlIIll;
        }
        if (this.lIlIIlllIIlIIlIlllIl > 0 && !(this instanceof IlIIIlIlIIIllIlIlIIl)) {
            --this.lIlIIlllIIlIIlIlllIl;
        }
        if (this.N() <= 0.0f) {
            this.y();
        }
        if (this.llllIlIllllIIlIIlIlI > 0) {
            --this.llllIlIllllIIlIIlIlI;
        }
        else {
            this.IlIIlllIIlIlllllIIlI = null;
        }
        if (this.lIlIlIIIllIIllIIIllI != null && !this.lIlIlIIIllIIllIIIllI.llllIllllIllllIlIlII()) {
            this.lIlIlIIIllIIllIIIllI = null;
        }
        if (this.llIIlIIIlIIIllIlIIIl != null) {
            if (!this.llIIlIIIlIIIllIlIIIl.llllIllllIllllIlIlII()) {
                this.llIllIIIIIllIlIIIIlI((lllIIIIlllllIlIIllIl)null);
            }
            else if (this.lllllIIIIIlIlIIIIIIl - this.llIllIlIIIIllIlIIllI > 100) {
                this.llIllIIIIIllIlIIIIlI((lllIIIIlllllIlIIllIl)null);
            }
        }
        this.H();
        this.f = this.e;
        this.IlIllIIllIIlIIIIlIIl = this.lIllIlIIIllllllIIlII;
        this.lIllIIlIlIlllllIIIII = this.lIIlllIlllllIIlllIll;
        this.IIIllllllIllIIIlllIl = this.IIlIIIIIllIlIIIlIIll;
        this.IlIIIlIIIllllIlIlIlI = this.llllllIllIllIlIllllI;
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    public boolean e_() {
        return false;
    }
    
    protected void y() {
        ++this.llIlllIlllllIIllIIII;
        if (this.llIlllIlllllIIllIIII == 20) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (this.llllIlIllllIIlIIlIlI > 0 || this.A()) && this.z() && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doMobLoot")) {
                int i = this.IlIlIIIllIllIIIIIllI(this.IlIIlllIIlIlllllIIlI);
                while (i > 0) {
                    final int llllIIIIlIIIlIlllIll = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(i);
                    i -= llllIIIIlIIIlIlllIll;
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll));
                }
            }
            this.IllIllIIIIlIIlIlllII();
            for (int j = 0; j < 20; ++j) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextFloat() * this.IllIllIIIIlIIlIlllII * 2.0f - this.IllIllIIIIlIIlIlllII, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.02, new int[0]);
            }
        }
    }
    
    protected boolean z() {
        return !this.e_();
    }
    
    protected int lIlIlIIIllIIllIIIllI(final int n) {
        final int llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)this);
        return (llllIIIIlIIIlIlllIll > 0 && this.IlIIllIIllIIllIIlIIl.nextInt(llllIIIIlIIIlIlllIll + 1) > 0) ? n : (n - 1);
    }
    
    protected int IlIlIIIllIllIIIIIllI(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return 0;
    }
    
    protected boolean A() {
        return false;
    }
    
    public Random B() {
        return this.IlIIllIIllIIllIIlIIl;
    }
    
    public lllIIIIlllllIlIIllIl C() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    public int D() {
        return this.llIllIlIIIIllIlIIllI;
    }
    
    public void llIllIIIIIllIlIIIIlI(final lllIIIIlllllIlIIllIl llIIlIIIlIIIllIlIIIl) {
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIlIIIIllIlIIllI = this.lllllIIIIIlIlIIIIIIl;
    }
    
    public lllIIIIlllllIlIIllIl E() {
        return this.lIlIlIIIllIIllIIIllI;
    }
    
    public int F() {
        return this.IlIlIIIllIIllIlllllI;
    }
    
    public void IlIlIIIllIIllIlllllI(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
            this.lIlIlIIIllIIllIIIllI = (lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI;
        }
        else {
            this.lIlIlIIIllIIllIIIllI = null;
        }
        this.IlIlIIIllIIllIlllllI = this.lllllIIIIIlIlIIIIIIl;
    }
    
    public int G() {
        return this.b;
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HealF", this.N());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Health", (short)Math.ceil(this.N()));
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HurtTime", (short)this.IIlllIIlIllIllIlIIll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("HurtByTimestamp", this.llIllIlIIIIllIlIIllI);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("DeathTime", (short)this.llIlllIlllllIIllIIII);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("AbsorptionAmount", this.aj());
        lllIIIIlIlIllIIlIIIl[] ilIllllIIIlIllIlIIll;
        for (int length = (ilIllllIIIlIllIlIIll = this.IlIllllIIIlIllIlIIll()).length, i = 0; i < length; ++i) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIllllIIIlIllIlIIll[i];
            if (lllIIIIlIlIllIIlIIIl != null) {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llIIIlIlIllIIlIlIlII());
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Attributes", net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(this.X()));
        lllIIIIlIlIllIIlIIIl[] ilIllllIIIlIllIlIIll2;
        for (int length2 = (ilIllllIIIlIllIlIIll2 = this.IlIllllIIIlIllIlIIll()).length, j = 0; j < length2; ++j) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = ilIllllIIIlIllIlIIll2[j];
            if (lllIIIIlIlIllIIlIIIl2 != null) {
                this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl2.llIIIlIlIllIIlIlIlII());
            }
        }
        if (!this.IlIlIIIllIllIIIIIllI.isEmpty()) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl();
            final Iterator<net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl> iterator = this.IlIlIIIllIllIIIIIllI.values().iterator();
            while (iterator.hasNext()) {
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iterator.next().llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll()));
            }
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ActiveEffects", ilIlIIIlIIlIlIIlllIl);
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.IIIIlllIIIIIIlIIIlll(iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII("AbsorptionAmount"));
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Attributes", 9) && this.IlllllllIIIlIIIlIlII != null && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll(this.X(), iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Attributes", 10));
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ActiveEffects", 9)) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("ActiveEffects", 10);
            for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
                final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i));
                if (ilIlIlIlIlllllllllIl != null) {
                    this.IlIlIIIllIllIIIIIllI.put(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), ilIlIlIlIlllllllllIl);
                }
            }
        }
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("HealF", 99)) {
            this.llIllIlIIIIllIlIIllI(iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII("HealF"));
        }
        else {
            final llllIIIlIlllIlIIIIIl llllIIIIlIIIlIlllIll = iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Health");
            if (llllIIIIlIIIlIlllIll == null) {
                this.llIllIlIIIIllIlIIllI(this.U());
            }
            else if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == 5) {
                this.llIllIlIIIIllIlIIllI(((IlIlIIIIIIlllIlIllIl)llllIIIIlIIIlIlllIll).llIIlIIIlIIIllIlIIIl());
            }
            else if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == 2) {
                this.llIllIlIIIIllIlIIllI((float)((IIlIIIIlllIlllllIlII)llllIIIIlIIIlIlllIll).llllIIIlIlllIlIIIIIl());
            }
        }
        this.IIlllIIlIllIllIlIIll = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("HurtTime");
        this.llIlllIlllllIIllIIII = iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI("DeathTime");
        this.llIllIlIIIIllIlIIllI = iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("HurtByTimestamp");
    }
    
    protected void H() {
        final Iterator<Integer> iterator = this.IlIlIIIllIllIIIIIllI.keySet().iterator();
        while (iterator.hasNext()) {
            final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI.get(iterator.next());
            if (!ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)) {
                if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    continue;
                }
                iterator.remove();
                this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
            }
            else {
                if (ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl() % 600 != 0) {
                    continue;
                }
                this.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, false);
            }
        }
        if (this.lIIIlllIIIllIIIllIII) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.I();
            }
            this.lIIIlllIIIllIIIllIII = false;
        }
        final int llIllIIIIIllIlIIIIlI = this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(7);
        final boolean b = this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(8) > 0;
        if (llIllIIIIIllIlIIIIlI > 0) {
            boolean nextBoolean;
            if (!this.IIIIIIIllllIlIIIIIII()) {
                nextBoolean = this.IlIIllIIllIIllIIlIIl.nextBoolean();
            }
            else {
                nextBoolean = (this.IlIIllIIllIIllIIlIIl.nextInt(15) == 0);
            }
            if (b) {
                nextBoolean &= (this.IlIIllIIllIIllIIlIIl.nextInt(5) == 0);
            }
            if (nextBoolean && llIllIIIIIllIlIIIIlI > 0) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(b ? net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIlllIIlIllIllIlIIll : net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIllIlIlIIIlIlIlIII, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextDouble() * this.IlIllllIIlIIlIlIlIll, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextDouble() - 0.5) * this.IllIllIIIIlIIlIlllII, (llIllIIIIIllIlIIIIlI >> 16 & 0xFF) / 255.0, (llIllIIIIIllIlIIIIlI >> 8 & 0xFF) / 255.0, (llIllIIIIIllIlIIIIlI >> 0 & 0xFF) / 255.0, new int[0]);
            }
        }
    }
    
    protected void I() {
        if (this.IlIlIIIllIllIIIIIllI.isEmpty()) {
            this.J();
            this.IllIIlllIIIIlllIIlIl(false);
        }
        else {
            final int llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.values());
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(8, (byte)(byte)(net.minecraft.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.IlIlIIIllIllIIIIIllI.values()) ? 1 : 0));
            this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(7, llllIIIIlIIIlIlllIll);
            this.IllIIlllIIIIlllIIlIl(this.IlIlIIIllIIllIlllllI(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIllIlIlIIIlIlIlIII.llllllIllIllIlIllllI));
        }
    }
    
    protected void J() {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(8, 0);
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(7, 0);
    }
    
    public void K() {
        final Iterator<Integer> iterator = this.IlIlIIIllIllIIIIIllI.keySet().iterator();
        while (iterator.hasNext()) {
            final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI.get(iterator.next());
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                iterator.remove();
                this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    public Collection L() {
        return this.IlIlIIIllIllIIIIIllI.values();
    }
    
    public boolean IlIlIIIllIIllIlllllI(final int n) {
        return this.IlIlIIIllIllIIIIIllI.containsKey(n);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.IlIlIIIllIllIIIIIllI.containsKey(llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI);
    }
    
    public net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl IlIlIlIlIlllllllllIl(final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.IlIlIIIllIllIIIIIllI.get(llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI);
    }
    
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl)) {
            if (this.IlIlIIIllIllIIIIIllI.containsKey(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll())) {
                this.IlIlIIIllIllIIIIIllI.get(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()).llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                this.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI.get(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()), true);
            }
            else {
                this.IlIlIIIllIllIIIIIllI.put(ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(), ilIIIlIlIIIllIlIlIIl);
                this.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
            }
        }
    }
    
    public boolean IlIlIlIlIlllllllllIl(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (this.Y() == net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl) {
            final int llllIIIIlIIIlIlllIll = ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll();
            if (llllIIIIlIIIlIlllIll == net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllllIllIllIlIllllI || llllIIIIlIIIlIlllIll == net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll.llllllIllIllIlIllllI) {
                return false;
            }
        }
        return true;
    }
    
    public boolean M() {
        return this.Y() == net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl;
    }
    
    public void IIIIlllIIIIIIlIIIlll(final int n) {
        this.IlIlIIIllIllIIIIIllI.remove(n);
    }
    
    public void llllIIllllIlIlIIIIll(final int n) {
        final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.IlIlIIIllIllIIIIIllI.remove(n);
        if (ilIIIlIlIIIllIlIlIIl != null) {
            this.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
        }
    }
    
    protected void llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.lIIIlllIIIllIIIllIII = true;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()].IlIlIlIlIlllllllllIl(this, this.X(), ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI());
        }
    }
    
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final boolean b) {
        this.lIIIlllIIIllIIIllIII = true;
        if (b && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()].llllIIIIlIIIlIlllIll(this, this.X(), ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI());
            net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()].IlIlIlIlIlllllllllIl(this, this.X(), ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI());
        }
    }
    
    protected void IlIIIlIlIIIllIlIlIIl(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        this.lIIIlllIIIllIIIllIII = true;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[ilIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll()].llllIIIIlIIIlIlllIll(this, this.X(), ilIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI());
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final float n) {
        final float n2 = this.N();
        if (n2 > 0.0f) {
            this.llIllIlIIIIllIlIIllI(n2 + n);
        }
    }
    
    public final float N() {
        return this.IIlllIIlllIIIlIlllII.IlIIIlIlIIIllIlIlIIl(6);
    }
    
    public void llIllIlIIIIllIlIIllI(final float n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(6, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n, 0.0f, this.U()));
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return false;
        }
        this.b = 0;
        if (this.N() <= 0.0f) {
            return false;
        }
        if (lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll() && this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll)) {
            return false;
        }
        if ((lIllllllIIllIlIlIlII == lIllllllIIllIlIlIlII.IIIIlllIIIIIIlIIIlll || lIllllllIIllIlIlIlII == lIllllllIIllIlIlIlII.llllIIllllIlIlIIIIll) && this.llIllIIIIIllIlIIIIlI(4) != null) {
            this.llIllIIIIIllIlIIIIlI(4).llllIIIIlIIIlIlllIll((int)(n * 4.0f + this.IlIIllIIllIIllIIlIIl.nextFloat() * n * 2.0f), this);
            n *= 0.75f;
        }
        this.llIlIIIIllIlIIlIlIII = 1.5f;
        boolean b = true;
        if (this.lIlIIlllIIlIIlIlllIl > this.llllllIIIIIIIlllIIll / 2.0f) {
            if (n <= this.i) {
                return false;
            }
            this.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII, n - this.i);
            this.i = n;
            b = false;
        }
        else {
            this.i = n;
            this.lIlIIlllIIlIIlIlllIl = this.llllllIIIIIIIlllIIll;
            this.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII, n);
            final int n2 = 10;
            this.IIIIIIIllllIlIIIIIII = n2;
            this.IIlllIIlIllIllIlIIll = n2;
        }
        this.IIlllIIIllIllIIlIlIl = 0.0f;
        final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
        if (llIIlIIIlIIIllIlIIIl != null) {
            if (llIIlIIIlIIIllIlIIIl instanceof lllIIIIlllllIlIIllIl) {
                this.llIllIIIIIllIlIIIIlI((lllIIIIlllllIlIIllIl)llIIlIIIlIIIllIlIIIl);
            }
            if (llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                this.llllIlIllllIIlIIlIlI = 100;
                this.IlIIlllIIlIlllllIIlI = (net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llIIlIIIlIIIllIlIIIl;
            }
            else if (llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIllllllIllIIIlllIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IIIllllllIllIIIlllIl)llIIlIIIlIIIllIlIIIl).as()) {
                this.llllIlIllllIIlIIlIlI = 100;
                this.IlIIlllIIlIlllllIIlI = null;
            }
        }
        if (b) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)2);
            if (lIllllllIIllIlIlIlII != lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl) {
                this.IIIllIIIlIlIIllIIIlI();
            }
            if (llIIlIIIlIIIllIlIIIl != null) {
                double n3;
                double n4;
                for (n3 = llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl, n4 = llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII; n3 * n3 + n4 * n4 < 1.0E-4; n3 = (Math.random() - Math.random()) * 0.01, n4 = (Math.random() - Math.random()) * 0.01) {}
                this.IIlllIIIllIllIIlIlIl = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n4, n3) * 180.0 / 3.141592653589793 - this.IIlIIIIIllIlIIIlIIll);
                this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, n, n3, n4);
            }
            else {
                this.IIlllIIIllIllIIlIlIl = (float)((int)(Math.random() * 2.0) * 180);
            }
        }
        if (this.N() <= 0.0f) {
            final String p2 = this.P();
            if (b && p2 != null) {
                this.llllIIIIlIIIlIlllIll(p2, this.Z(), this.aa());
            }
            this.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        }
        else {
            final String o = this.O();
            if (b && o != null) {
                this.llllIIIIlIIIlIlllIll(o, this.Z(), this.aa());
            }
        }
        return true;
    }
    
    public void llIllIIIIIllIlIIIIlI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll("random.break", 0.8f, 0.8f + this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() * 0.4f);
        for (int i = 0; i < 5; ++i) {
            final e ilIlIlIlIlllllllllIl = new e((this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0).llllIIIIlIIIlIlllIll(-this.llllllIllIllIlIllllI * 3.1415927f / 180.0f).IlIlIlIlIlllllllllIl(-this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f);
            final e ilIlIlIlIlllllllllIl2 = new e((this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5) * 0.3, -this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.6 - 0.3, 0.6).llllIIIIlIIIlIlllIll(-this.llllllIllIllIlIllllI * 3.1415927f / 180.0f).IlIlIlIlIlllllllllIl(-this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f).IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.llllIlIllllIIlIIlIlI(), this.lllllIlIIIlIlIIlllII);
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IIIIIllIIIIlIIIIllIl, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl + 0.05, ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()));
        }
    }
    
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
        final lllIIIIlllllIlIIllIl t = this.T();
        if (this.h >= 0 && t != null) {
            t.llllIIIIlIIIlIlllIll(this, this.h);
        }
        if (llIIlIIIlIIIllIlIIIl != null) {
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this);
        }
        this.a = true;
        this.S().IlIlIIIllIllIIIIIllI();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            int liiiIlIIIIIlllIllIII = 0;
            if (llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
                liiiIlIIIIIlllIllIII = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.lIIIIlIIIIIlllIllIII((lllIIIIlllllIlIIllIl)llIIlIIIlIIIllIlIIIl);
            }
            if (this.z() && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doMobLoot")) {
                this.llllIIIIlIIIlIlllIll(this.llllIlIllllIIlIIlIlI > 0, liiiIlIIIIIlllIllIII);
                this.IlIlIlIlIlllllllllIl(this.llllIlIllllIIlIIlIlI > 0, liiiIlIIIIIlllIllIII);
                if (this.llllIlIllllIIlIIlIlI > 0 && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.025f + liiiIlIIIIIlllIllIII * 0.01f) {
                    this.Q();
                }
            }
        }
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, (byte)3);
    }
    
    protected void IlIlIlIlIlllllllllIl(final boolean b, final int n) {
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final double n2, final double n3) {
        if (this.IlIIllIIllIIllIIlIIl.nextDouble() >= this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI()) {
            this.llIllIIlllllllllllll = true;
            final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2 * n2 + n3 * n3);
            final float n4 = 0.4f;
            this.lIllllllIIllIlIlIlII /= 2.0;
            this.llIIlllIIlllIIllIllI /= 2.0;
            this.IIlllIIIlIlllIIlllII /= 2.0;
            this.lIllllllIIllIlIlIlII -= n2 / llllIIIIlIIIlIlllIll * n4;
            this.llIIlllIIlllIIllIllI += n4;
            this.IIlllIIIlIlllIIlllII -= n3 / llllIIIIlIIIlIlllIll * n4;
            if (this.llIIlllIIlllIIllIllI > 0.4000000059604645) {
                this.llIIlllIIlllIIllIllI = 0.4000000059604645;
            }
        }
    }
    
    protected String O() {
        return "game.neutral.hurt";
    }
    
    protected String P() {
        return "game.neutral.die";
    }
    
    protected void Q() {
    }
    
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
    }
    
    public boolean f_() {
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI();
        return (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r) && (!(this instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) || !((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)this).IlIIIlIlIIIllIlIlIIl());
    }
    
    @Override
    public boolean llllIllllIllllIlIlII() {
        return !this.IIlIlIlIIlIllIIIIIIl && this.N() > 0.0f;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
        super.IlIIIlIlIIIllIlIlIIl(n, n2);
        final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl);
        final int illIIlllIIIIlllIIlIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl((n - 3.0f - ((ilIlIlIlIlllllllllIl != null) ? ((float)(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() + 1)) : 0.0f)) * n2);
        if (illIIlllIIIIlllIIlIl > 0) {
            this.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII(illIIlllIIIIlllIIlIl), 1.0f, 1.0f);
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII, (float)illIIlllIIIIlllIIlIl);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII - 0.20000000298023224), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl iIlllIIIlIlllIIlllII = llIllIIIIIllIlIIIIlI.IIlllIIIlIlllIIlllII;
                this.llllIIIIlIIIlIlllIll(iIlllIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(), iIlllIIIlIlllIIlllII.IlIIIlIlIIIllIlIlIIl() * 0.5f, iIlllIIIlIlllIIlllII.IlIlIIIllIllIIIIIllI() * 0.75f);
            }
        }
    }
    
    protected String IlIllIlIlIIIlIlIlIII(final int n) {
        return (n > 4) ? "game.neutral.hurt.fall.big" : "game.neutral.hurt.fall.small";
    }
    
    @Override
    public void lllllIIIIIlIIlllIlIl() {
        final int n = 10;
        this.IIIIIIIllllIlIIIIIII = n;
        this.IIlllIIlIllIllIlIIll = n;
        this.IIlllIIIllIllIIlIlIl = 0.0f;
    }
    
    public int R() {
        int n = 0;
        lllIIIIlIlIllIIlIIIl[] ilIllllIIIlIllIlIIll;
        for (int length = (ilIllllIIIlIllIlIIll = this.IlIllllIIIlIllIlIIll()).length, i = 0; i < length; ++i) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = ilIllllIIIlIllIlIIll[i];
            if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII) {
                n += ((IIIlIIlIIIIlllIlllII)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).lIIIlllIIIllIIIllIII;
            }
        }
        return n;
    }
    
    protected void lIlIlIIIllIIllIIIllI(final float n) {
    }
    
    protected float llIllIIIIIllIlIIIIlI(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float n) {
        if (!lIllllllIIllIlIlIlII.IlIlIIIllIllIIIIIllI()) {
            final float n2 = n * (25 - this.R());
            this.lIlIlIIIllIIllIIIllI(n);
            n = n2 / 25.0f;
        }
        return n;
    }
    
    protected float IlIIIlIlIIIllIlIlIIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float n) {
        if (lIllllllIIllIlIlIlII.lIIIIlIIIIIlllIllIII()) {
            return n;
        }
        if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI) && lIllllllIIllIlIlIlII != lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl) {
            n = n * (25 - (this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI).llIllIIIIIllIlIIIIlI() + 1) * 5) / 25.0f;
        }
        if (n <= 0.0f) {
            return 0.0f;
        }
        int llllIIIIlIIIlIlllIll = net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(this.IlIllllIIIlIllIlIIll(), lIllllllIIllIlIlIlII);
        if (llllIIIIlIIIlIlllIll > 20) {
            llllIIIIlIIIlIlllIll = 20;
        }
        if (llllIIIIlIIIlIlllIll > 0 && llllIIIIlIIIlIlllIll <= 20) {
            n = n * (25 - llllIIIIlIIIlIlllIll) / 25.0f;
        }
        return n;
    }
    
    protected void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float n) {
        if (!this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            n = this.llIllIIIIIllIlIIIIlI(lIllllllIIllIlIlIlII, n);
            final float ilIIIlIlIIIllIlIlIIl;
            n = (ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(lIllllllIIllIlIlIlII, n));
            n = Math.max(n - this.aj(), 0.0f);
            this.IIIIlllIIIIIIlIIIlll(this.aj() - (ilIIIlIlIIIllIlIlIIl - n));
            if (n != 0.0f) {
                final float n2 = this.N();
                this.llIllIlIIIIllIlIIllI(n2 - n);
                this.S().llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n2, n);
                this.IIIIlllIIIIIIlIIIlll(this.aj() - n);
            }
        }
    }
    
    public llIIIlIlIllIIlIlIlII S() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public lllIIIIlllllIlIIllIl T() {
        return (this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() != null) ? this.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI() : ((this.IlIIlllIIlIlllllIIlI != null) ? this.IlIIlllIIlIlllllIIlI : ((this.llIIlIIIlIIIllIlIIIl != null) ? this.llIIlIIIlIIIllIlIIIl : null));
    }
    
    public final float U() {
        return (float)this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).IlIlIIIllIllIIIIIllI();
    }
    
    public final int V() {
        return this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(9);
    }
    
    public final void IIlllIIlIllIllIlIIll(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(9, (byte)n);
    }
    
    private int lIIIIlIIIIIlllIllIII() {
        return this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI) ? (6 - (1 + this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI()) * 1) : (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl) ? (6 + (1 + this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI()) * 2) : 6);
    }
    
    public void IIlIIIIlllIlllllIlII() {
        if (!this.IIIIlllIIIIIIlIIIlll || this.llllIIllllIlIlIIIIll >= this.lIIIIlIIIIIlllIllIII() / 2 || this.llllIIllllIlIlIIIIll < 0) {
            this.llllIIllllIlIlIIIIll = -1;
            this.IIIIlllIIIIIIlIIIlll = true;
            if (this.IlllllllIIIlIIIlIlII instanceof IIIllllllIllIIIlllIl) {
                ((IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(this, new IlIlIIIllIIllIlllllI(this, 0));
            }
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final byte b) {
        if (b == 2) {
            this.llIlIIIIllIlIIlIlIII = 1.5f;
            this.lIlIIlllIIlIIlIlllIl = this.llllllIIIIIIIlllIIll;
            final int n = 10;
            this.IIIIIIIllllIlIIIIIII = n;
            this.IIlllIIlIllIllIlIIll = n;
            this.IIlllIIIllIllIIlIlIl = 0.0f;
            if (this.O() != null) {
                this.llllIIIIlIIIlIlllIll(this.O(), this.Z(), (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
            }
            this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI, 0.0f);
        }
        else if (b == 3) {
            if (this.P() != null) {
                this.llllIIIIlIIIlIlllIll(this.P(), this.Z(), (this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
            }
            this.llIllIlIIIIllIlIIllI(0.0f);
            this.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI);
        }
        else {
            super.llllIIIIlIIIlIlllIll(b);
        }
    }
    
    @Override
    protected void IllIlIIllIllIIlIllII() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl, 4.0f);
    }
    
    protected void W() {
        final int liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        if (this.IIIIlllIIIIIIlIIIlll) {
            ++this.llllIIllllIlIlIIIIll;
            if (this.llllIIllllIlIlIIIIll >= liiiIlIIIIIlllIllIII) {
                this.llllIIllllIlIlIIIIll = 0;
                this.IIIIlllIIIIIIlIIIlll = false;
            }
        }
        else {
            this.llllIIllllIlIlIIIIll = 0;
        }
        this.IlIllllIIlIllIlIlIll = this.llllIIllllIlIlIIIIll / (float)liiiIlIIIIIlllIllIII;
    }
    
    public IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        return this.X().llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
    }
    
    public net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI X() {
        if (this.llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = new lIIIIlIIIIIlllIllIII();
        }
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public IlIlIllllllllIIIIlII Y() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll;
    }
    
    public abstract lllIIIIlIlIllIIlIIIl n();
    
    public abstract lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI(final int p0);
    
    public abstract lllIIIIlIlIllIIlIIIl llIllIlIIIIllIlIIllI(final int p0);
    
    @Override
    public abstract void llllIIIIlIIIlIlllIll(final int p0, final lllIIIIlIlIllIIlIIIl p1);
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final boolean b) {
        super.llIllIIIIIllIlIIIIlI(b);
        final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl);
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll) != null) {
            llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl);
        }
        if (b) {
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl);
        }
    }
    
    @Override
    public abstract lllIIIIlIlIllIIlIIIl[] IlIllllIIIlIllIlIIll();
    
    protected float Z() {
        return 1.0f;
    }
    
    protected float aa() {
        return this.e_() ? ((this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.5f) : ((this.IlIIllIIllIIllIIlIIl.nextFloat() - this.IlIIllIIllIIllIIlIIl.nextFloat()) * 0.2f + 1.0f);
    }
    
    protected boolean ab() {
        return this.N() <= 0.0f;
    }
    
    public void IIIIlllIIIIIIlIIIlll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        double iIlllIlIIllIlIlIlIIl = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl;
        double n = llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + llIllIIIIIllIlIIIIlI.IlIllllIIlIIlIlIlIll;
        double lllllIlIIIlIlIIlllII = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII;
        for (int n2 = 1, i = -n2; i <= n2; ++i) {
            for (int j = -n2; j < n2; ++j) {
                if (i != 0 || j != 0) {
                    final int n3 = (int)(this.IIlllIlIIllIlIlIlIIl + i);
                    final int n4 = (int)(this.lllllIlIIIlIlIIlllII + j);
                    if (this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIIlllIIlIlllllIIlI().llIllIIIIIllIlIIIIlI(i, 1.0, j)).isEmpty()) {
                        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(n3, (int)this.llIIIlIlIllIIlIlIlII, n4))) {
                            this.llIIlIIIlIIIllIlIIIl(this.IIlllIlIIllIlIlIlIIl + i, this.llIIIlIlIllIIlIlIlII + 1.0, this.lllllIlIIIlIlIIlllII + j);
                            return;
                        }
                        if (net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(n3, (int)this.llIIIlIlIllIIlIlIlII - 1, n4)) || this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(n3, (int)this.llIIIlIlIllIIlIlIlII - 1, n4)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                            iIlllIlIIllIlIlIlIIl = this.IIlllIlIIllIlIlIlIIl + i;
                            n = this.llIIIlIlIllIIlIlIlII + 1.0;
                            lllllIlIIIlIlIIlllII = this.lllllIlIIIlIlIIlllII + j;
                        }
                    }
                }
            }
        }
        this.llIIlIIIlIIIllIlIIIl(iIlllIlIIllIlIlIlIIl, n, lllllIlIIIlIlIIlllII);
    }
    
    @Override
    public boolean lIIlllIlllllIIlllIll() {
        return false;
    }
    
    protected float ac() {
        return 0.42f;
    }
    
    protected void ad() {
        this.llIIlllIIlllIIllIllI = this.ac();
        if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl)) {
            this.llIIlllIIlllIIllIllI += (this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl).llIllIIIIIllIlIIIIlI() + 1) * 0.1f;
        }
        if (this.IIIllIIllIIIIIIlIIlI()) {
            final float n = this.IIlIIIIIllIlIIIlIIll * 0.017453292f;
            this.lIllllllIIllIlIlIlII -= net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n) * 0.2f;
            this.IIlllIIIlIlllIIlllII += net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n) * 0.2f;
        }
        this.llIllIIlllllllllllll = true;
    }
    
    protected void ae() {
        this.llIIlllIIlllIIllIllI += 0.03999999910593033;
    }
    
    protected void af() {
        this.llIIlllIIlllIIllIllI += 0.03999999910593033;
    }
    
    public void IllIIlllIIIIlllIIlIl(final float n, final float n2) {
        if (this.llllllIllIllIlIllllI()) {
            if (!this.llIIIlIlllIllIIlIllI() || (this instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)this).K.IlIlIlIlIlllllllllIl)) {
                if (!this.llIIIllIlIllIllIIIIl() || (this instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)this).K.IlIlIlIlIlllllllllIl)) {
                    float n3 = 0.91f;
                    if (this.IIIIIllIIIIlIIIIllIl) {
                        n3 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) - 1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI().IlIIIlIIIllllIlIlIlI * 0.91f;
                    }
                    final float n4 = 0.16277136f / (n3 * n3 * n3);
                    float liIlIIIIIIIlIIlIlIIl;
                    if (this.IIIIIllIIIIlIIIIllIl) {
                        liIlIIIIIIIlIIlIlIIl = this.ag() * n4;
                    }
                    else {
                        liIlIIIIIIIlIIlIlIIl = this.lIIlIIIIIIIlIIlIlIIl;
                    }
                    this.IlIlIlIlIlllllllllIl(n, n2, liIlIIIIIIIlIIlIlIIl);
                    float n5 = 0.91f;
                    if (this.IIIIIllIIIIlIIIIllIl) {
                        n5 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl) - 1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI().IlIIIlIIIllllIlIlIlI * 0.91f;
                    }
                    if (this.f_()) {
                        final float n6 = 0.15f;
                        this.lIllllllIIllIlIlIlII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII, -n6, n6);
                        this.IIlllIIIlIlllIIlllII = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlllIIIlIlllIIlllII, -n6, n6);
                        this.IllIlIIllIllIIlIllII = 0.0f;
                        if (this.llIIlllIIlllIIllIllI < -0.15) {
                            this.llIIlllIIlllIIllIllI = -0.15;
                        }
                        if (this.IIIIIllIIIIlIIIIllIl() && this instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && this.llIIlllIIlllIIllIllI < 0.0) {
                            this.llIIlllIIlllIIllIllI = 0.0;
                        }
                    }
                    this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
                    if (this.IIIIIIIIIlllIllIlIlI && this.f_()) {
                        this.llIIlllIIlllIIllIllI = 0.2;
                    }
                    if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (!this.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(new IlIlIlIlIlllllllllIl((int)this.IIlllIlIIllIlIlIlIIl, 0, (int)this.lllllIlIIIlIlIIlllII)) || !this.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl(new IlIlIlIlIlllllllllIl((int)this.IIlllIlIIllIlIlIlIIl, 0, (int)this.lllllIlIIIlIlIIlllII)).llllIIllllIlIlIIIIll())) {
                        if (this.llIIIlIlIllIIlIlIlII > 0.0) {
                            this.llIIlllIIlllIIllIllI = -0.1;
                        }
                        else {
                            this.llIIlllIIlllIIllIllI = 0.0;
                        }
                    }
                    else {
                        this.llIIlllIIlllIIllIllI -= 0.08;
                    }
                    this.llIIlllIIlllIIllIllI *= 0.9800000190734863;
                    this.lIllllllIIllIlIlIlII *= n5;
                    this.IIlllIIIlIlllIIlllII *= n5;
                }
                else {
                    final double llIIIlIlIllIIlIlIlII = this.llIIIlIlIllIIlIlIlII;
                    this.IlIlIlIlIlllllllllIl(n, n2, 0.02f);
                    this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
                    this.lIllllllIIllIlIlIlII *= 0.5;
                    this.llIIlllIIlllIIllIllI *= 0.5;
                    this.IIlllIIIlIlllIIlllII *= 0.5;
                    this.llIIlllIIlllIIllIllI -= 0.02;
                    if (this.IIIIIIIIIlllIllIlIlI && this.llIllIIIIIllIlIIIIlI(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI + 0.6000000238418579 - this.llIIIlIlIllIIlIlIlII + llIIIlIlIllIIlIlIlII, this.IIlllIIIlIlllIIlllII)) {
                        this.llIIlllIIlllIIllIllI = 0.30000001192092896;
                    }
                }
            }
            else {
                final double llIIIlIlIllIIlIlIlII2 = this.llIIIlIlIllIIlIlIlII;
                float n7 = 0.8f;
                float n8 = 0.02f;
                float n9 = (float)net.minecraft.IllIIlllIIIIlllIIlIl.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI)this);
                if (n9 > 3.0f) {
                    n9 = 3.0f;
                }
                if (!this.IIIIIllIIIIlIIIIllIl) {
                    n9 *= 0.5f;
                }
                if (n9 > 0.0f) {
                    n7 += (0.54600006f - n7) * n9 / 3.0f;
                    n8 += (this.ag() * 1.0f - n8) * n9 / 3.0f;
                }
                this.IlIlIlIlIlllllllllIl(n, n2, n8);
                this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
                this.lIllllllIIllIlIlIlII *= n7;
                this.llIIlllIIlllIIllIllI *= 0.800000011920929;
                this.IIlllIIIlIlllIIlllII *= n7;
                this.llIIlllIIlllIIllIllI -= 0.02;
                if (this.IIIIIIIIIlllIllIlIlI && this.llIllIIIIIllIlIIIIlI(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI + 0.6000000238418579 - this.llIIIlIlIllIIlIlIlII + llIIIlIlIllIIlIlIlII2, this.IIlllIIIlIlllIIlllII)) {
                    this.llIIlllIIlllIIllIllI = 0.30000001192092896;
                }
            }
        }
        this.lllIlIIIIIlIlllllIlI = this.llIlIIIIllIlIIlIlIII;
        final double n10 = this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII;
        final double n11 = this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII;
        float n12 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n10 * n10 + n11 * n11) * 4.0f;
        if (n12 > 1.0f) {
            n12 = 1.0f;
        }
        this.llIlIIIIllIlIIlIlIII += (n12 - this.llIlIIIIllIlIIlIlIII) * 0.4f;
        this.IIIIIlllIlIIIIIIIllI += this.llIlIIIIllIlIIlIlIII;
    }
    
    public float ag() {
        return this.t;
    }
    
    public void llIIlIIIlIIIllIlIIIl(final float t) {
        this.t = t;
    }
    
    public boolean llllIIllllIlIlIIIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IlIlIIIllIIllIlllllI(llIllIIIIIllIlIIIIlI);
        return false;
    }
    
    public boolean ah() {
        return false;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        super.IIllIIllIIIlIlIIIIlI();
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final int v = this.V();
            if (v > 0) {
                if (this.IlIllIlIlIIIlIlIlIII <= 0) {
                    this.IlIllIlIlIIIlIlIlIII = 20 * (30 - v);
                }
                --this.IlIllIlIlIIIlIlIlIII;
                if (this.IlIllIlIlIIIlIlIlIII <= 0) {
                    this.IIlllIIlIllIllIlIIll(v - 1);
                }
            }
            for (int i = 0; i < 5; ++i) {
                final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.lIIIIlIIIIIlllIllIII[i];
                final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(i);
                if (!net.minecraft.llIllIlIIIIllIlIIllI.lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, lllIIIIlIlIllIIlIIIl)) {
                    ((IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).lIIIIlIlIllllIIlIllI().llllIIIIlIIIlIlllIll(this, new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI(this.IlllIIIIlIIIlIlIlIIl(), i, llIllIIIIIllIlIIIIlI));
                    if (lllIIIIlIlIllIIlIIIl != null) {
                        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llIIIlIlIllIIlIlIlII());
                    }
                    if (llIllIIIIIllIlIIIIlI != null) {
                        this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII());
                    }
                    this.lIIIIlIIIIIlllIllIII[i] = ((llIllIIIIIllIlIIIIlI == null) ? null : llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl());
                }
            }
            if (this.lllllIIIIIlIlIIIIIIl % 20 == 0) {
                this.S().IlIlIIIllIllIIIIIllI();
            }
        }
        this.IIIlIIIlIlIIlllIIlll();
        final double n = this.IIlllIlIIllIlIlIlIIl - this.IIlIIIIlllIlllllIlII;
        final double n2 = this.lllllIlIIIlIlIIlllII - this.IlIlIllllllllIIIIlII;
        final float n3 = (float)(n * n + n2 * n2);
        float n4 = this.lIllIlIIIllllllIIlII;
        float n5 = 0.0f;
        this.c = this.d;
        float n6 = 0.0f;
        if (n3 > 0.0025000002f) {
            n6 = 1.0f;
            n5 = (float)Math.sqrt(n3) * 3.0f;
            n4 = (float)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2, n) * 180.0f / 3.1415927f - 90.0f;
        }
        if (this.IlIllllIIlIllIlIlIll > 0.0f) {
            n4 = this.IIlIIIIIllIlIIIlIIll;
        }
        if (!this.IIIIIllIIIIlIIIIllIl) {
            n6 = 0.0f;
        }
        this.d += (n6 - this.d) * 0.3f;
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("headTurn");
        final float llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl(n4, n5);
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("rangeChecks");
        while (this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl < -180.0f) {
            this.IIIllllllIllIIIlllIl -= 360.0f;
        }
        while (this.IIlIIIIIllIlIIIlIIll - this.IIIllllllIllIIIlllIl >= 180.0f) {
            this.IIIllllllIllIIIlllIl += 360.0f;
        }
        while (this.lIllIlIIIllllllIIlII - this.IlIllIIllIIlIIIIlIIl < -180.0f) {
            this.IlIllIIllIIlIIIIlIIl -= 360.0f;
        }
        while (this.lIllIlIIIllllllIIlII - this.IlIllIIllIIlIIIIlIIl >= 180.0f) {
            this.IlIllIIllIIlIIIIlIIl += 360.0f;
        }
        while (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI < -180.0f) {
            this.IlIIIlIIIllllIlIlIlI -= 360.0f;
        }
        while (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI >= 180.0f) {
            this.IlIIIlIIIllllIlIlIlI += 360.0f;
        }
        while (this.lIIlllIlllllIIlllIll - this.lIllIIlIlIlllllIIIII < -180.0f) {
            this.lIllIIlIlIlllllIIIII -= 360.0f;
        }
        while (this.lIIlllIlllllIIlllIll - this.lIllIIlIlIlllllIIIII >= 180.0f) {
            this.lIllIIlIlIlllllIIIII += 360.0f;
        }
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.e += llllIIIlIlllIlIIIIIl;
    }
    
    protected float llllIIIlIlllIlIIIIIl(final float n, float n2) {
        this.lIllIlIIIllllllIIlII += net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n - this.lIllIlIIIllllllIIlII) * 0.3f;
        float llllIIIlIlllIlIIIIIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.IIlIIIIIllIlIIIlIIll - this.lIllIlIIIllllllIIlII);
        final boolean b = llllIIIlIlllIlIIIIIl < -90.0f || llllIIIlIlllIlIIIIIl >= 90.0f;
        if (llllIIIlIlllIlIIIIIl < -75.0f) {
            llllIIIlIlllIlIIIIIl = -75.0f;
        }
        if (llllIIIlIlllIlIIIIIl >= 75.0f) {
            llllIIIlIlllIlIIIIIl = 75.0f;
        }
        this.lIllIlIIIllllllIIlII = this.IIlIIIIIllIlIIIlIIll - llllIIIlIlllIlIIIIIl;
        if (llllIIIlIlllIlIIIIIl * llllIIIlIlllIlIIIIIl > 2500.0f) {
            this.lIllIlIIIllllllIIlII += llllIIIlIlllIlIIIIIl * 0.2f;
        }
        if (b) {
            n2 *= -1.0f;
        }
        return n2;
    }
    
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.u > 0) {
            --this.u;
        }
        if (this.n > 0) {
            final double n = this.IIlllIlIIllIlIlIlIIl + (this.o - this.IIlllIlIIllIlIlIlIIl) / this.n;
            final double n2 = this.llIIIlIlIllIIlIlIlII + (this.p - this.llIIIlIlIllIIlIlIlII) / this.n;
            final double n3 = this.lllllIlIIIlIlIIlllII + (this.q - this.lllllIlIIIlIlIIlllII) / this.n;
            this.IIlIIIIIllIlIIIlIIll += (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.r - this.IIlIIIIIllIlIIIlIIll) / this.n);
            this.llllllIllIllIlIllllI += (float)((this.s - this.llllllIllIllIlIllllI) / this.n);
            --this.n;
            this.IlIlIlIlIlllllllllIl(n, n2, n3);
            this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
        }
        else if (!this.llllllIllIllIlIllllI()) {
            this.lIllllllIIllIlIlIlII *= 0.98;
            this.llIIlllIIlllIIllIllI *= 0.98;
            this.IIlllIIIlIlllIIlllII *= 0.98;
        }
        if (Math.abs(this.lIllllllIIllIlIlIlII) < 0.005) {
            this.lIllllllIIllIlIlIlII = 0.0;
        }
        if (Math.abs(this.llIIlllIIlllIIllIllI) < 0.005) {
            this.llIIlllIIlllIIllIllI = 0.0;
        }
        if (Math.abs(this.IIlllIIIlIlllIIlllII) < 0.005) {
            this.IIlllIIIlIlllIIlllII = 0.0;
        }
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("ai");
        if (this.ab()) {
            this.j = false;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = 0.0f;
        }
        else if (this.llllllIllIllIlIllllI()) {
            this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("newAi");
            this.IIIIIIIIIlllIllIlIlI();
            this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        }
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("jump");
        if (this.j) {
            if (this.llIIIlIlllIllIIlIllI()) {
                this.ae();
            }
            else if (this.llIIIllIlIllIllIIIIl()) {
                this.af();
            }
            else if (this.IIIIIllIIIIlIIIIllIl && this.u == 0) {
                this.ad();
                this.u = 10;
            }
        }
        else {
            this.u = 0;
        }
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("travel");
        this.k *= 0.98f;
        this.l *= 0.98f;
        this.m *= 0.9f;
        this.IllIIlllIIIIlllIIlIl(this.k, this.l);
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("push");
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.ai();
        }
        this.IlllllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
    }
    
    protected void IIIIIIIIIlllIllIlIlI() {
    }
    
    protected void ai() {
        final List llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(0.20000000298023224, 0.0, 0.20000000298023224), Predicates.and(net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl, (Predicate)new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIIIIlllIlIllIl(this)));
        if (!llllIIIIlIIIlIlllIll.isEmpty()) {
            for (int i = 0; i < llllIIIIlIIIlIlllIll.size(); ++i) {
                this.IlIllIlIlIIIlIlIlIII(llllIIIIlIIIlIlllIll.get(i));
            }
        }
    }
    
    protected void IlIllIlIlIIIlIlIlIII(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl(this);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (this.IIIlIIIlIlIIlllIIlll != null && llIllIIIIIllIlIIIIlI == null) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.IIIIlllIIIIIIlIIIlll(this.IIIlIIIlIlIIlllIIlll);
            }
            if (this.IIIlIIIlIlIIlllIIlll != null) {
                this.IIIlIIIlIlIIlllIIlll.IIllIIllIIIlIlIIIIlI = null;
            }
            this.IIIlIIIlIlIIlllIIlll = null;
        }
        else {
            super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        }
    }
    
    @Override
    public void lIIllIIIllllIlllIllI() {
        super.lIIllIIIllllIlllIllI();
        this.c = this.d;
        this.d = 0.0f;
        this.IllIlIIllIllIIlIllII = 0.0f;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final double o, final double p7, final double q, final float n, final float n2, final int n3, final boolean b) {
        this.o = o;
        this.p = p7;
        this.q = q;
        this.r = n;
        this.s = n2;
        this.n = n3;
    }
    
    public void llIllIlIIIIllIlIIllI(final boolean j) {
        this.j = j;
    }
    
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n) {
        if (!llIllIIIIIllIlIIIIlI.IIlIlIlIIlIllIIIIIIl && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlllllllIIIlIIIlIlII liiiIlIlIllllIIlIllI = ((IIIllllllIllIIIlllIl)this.IlllllllIIIlIIIlIlII).lIIIIlIlIllllIIlIllI();
            if (llIllIIIIIllIlIIIIlI instanceof lIIIlllIIIllIIIllIII) {
                liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, new llllIIllllIlIlIIIIll(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl(), this.IlllIIIIlIIIlIlIlIIl()));
            }
            if (llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
                liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, new llllIIllllIlIlIIIIll(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl(), this.IlllIIIIlIIIlIlIlIIl()));
            }
            if (llIllIIIIIllIlIIIIlI instanceof IlIlIIIlIIlIlIIlllIl) {
                liiiIlIlIllllIIlIllI.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, new llllIIllllIlIlIIIIll(llIllIIIIIllIlIIIIlI.IlllIIIIlIIIlIlIlIIl(), this.IlllIIIIlIIIlIlIlIIl()));
            }
        }
    }
    
    public boolean IIlllIIlIllIllIlIIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new e(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.llllIlIllllIIlIIlIlI(), this.lllllIlIIIlIlIIlllII), new e(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl, llIllIIIIIllIlIIIIlI.llIIIlIlIllIIlIlIlII + llIllIIIIIllIlIIIIlI.llllIlIllllIIlIIlIlI(), llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII)) == null;
    }
    
    @Override
    public e IlIIIIIlIIllIIlIlIll() {
        return this.llllIIIIlIIIlIlllIll(1.0f);
    }
    
    @Override
    public e llllIIIIlIIIlIlllIll(final float n) {
        if (this instanceof net.minecraft.client.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
            return super.llllIIIIlIIIlIlllIll(n);
        }
        if (n == 1.0f) {
            return this.IlIlIIIllIllIIIIIllI(this.llllllIllIllIlIllllI, this.lIIlllIlllllIIlllIll);
        }
        return this.IlIlIIIllIllIIIIIllI(this.IlIIIlIIIllllIlIlIlI + (this.llllllIllIllIlIllllI - this.IlIIIlIIIllllIlIlIlI) * n, this.lIllIIlIlIlllllIIIII + (this.lIIlllIlllllIIlllIll - this.lIllIIlIlIlllllIIIII) * n);
    }
    
    public float IlIlIIIllIIllIlllllI(final float n) {
        float n2 = this.IlIllllIIlIllIlIlIll - this.lllllIlIlIlllIlllIlI;
        if (n2 < 0.0f) {
            ++n2;
        }
        return this.lllllIlIlIlllIlllIlI + n2 * n;
    }
    
    public boolean llllllIllIllIlIllllI() {
        return !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII;
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return !this.IIlIlIlIIlIllIIIIIIl;
    }
    
    @Override
    public boolean g_() {
        return !this.IIlIlIlIIlIllIIIIIIl;
    }
    
    @Override
    protected void IIIllIIIlIlIIllIIIlI() {
        this.lllIllIIIllllllIllll = (this.IlIIllIIllIIllIIlIIl.nextDouble() >= this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llIllIIIIIllIlIIIIlI).IlIlIIIllIllIIIIIllI());
    }
    
    @Override
    public float lllIlIIIIIlIlllllIlI() {
        return this.lIIlllIlllllIIlllIll;
    }
    
    @Override
    public void lIIIIlIIIIIlllIllIII(final float liIlllIlllllIIlllIll) {
        this.lIIlllIlllllIIlllIll = liIlllIlllllIIlllIll;
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(final float lIllIlIIIllllllIIlII) {
        this.lIllIlIIIllllllIIlII = lIllIlIIIllllllIIlII;
    }
    
    public float aj() {
        return this.v;
    }
    
    public void IIIIlllIIIIIIlIIIlll(float v) {
        if (v < 0.0f) {
            v = 0.0f;
        }
        this.v = v;
    }
    
    public net.minecraft.lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI w() {
        return this.IlllllllIIIlIIIlIlII.IlllIIIIlIIIlIlIlIIl().IllIIlllIIIIlllIIlIl(this.lllIIIIlIlIllIIlIIIl().toString());
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        return this.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.w());
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        return this.w() != null && this.w().llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI);
    }
    
    public void ak() {
    }
    
    public void al() {
    }
    
    protected void am() {
        this.lIIIlllIIIllIIIllIII = true;
    }
}
