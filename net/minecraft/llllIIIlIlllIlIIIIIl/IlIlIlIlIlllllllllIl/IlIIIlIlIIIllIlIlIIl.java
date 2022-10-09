package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import com.google.common.base.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

public class IlIIIlIlIIIllIlIlIIl extends IIlllIlIIllIlIlIlIIl implements IllIIlllIIIIlllIIlIl, llllllIllIllIlIllllI
{
    private float[] llllIIIIlIIIlIlllIll;
    private float[] IlIlIlIlIlllllllllIl;
    private float[] llIllIIIIIllIlIIIIlI;
    private float[] t;
    private int[] u;
    private int[] v;
    private int w;
    private static final Predicate x;
    
    static {
        x = (Predicate)new IlIlIIIllIllIIIIIllI();
    }
    
    public IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = new float[2];
        this.IlIlIlIlIlllllllllIl = new float[2];
        this.llIllIIIIIllIlIIIIlI = new float[2];
        this.t = new float[2];
        this.u = new int[2];
        this.v = new int[2];
        this.llIllIlIIIIllIlIIllI(this.U());
        this.llllIIIIlIIIlIlllIll(0.9f, 3.5f);
        this.IIIllIIIlIlIIllIIIlI = true;
        ((net.minecraft.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl)this.lIllllllIIllIlIlIlII()).IlIIIlIlIIIllIlIlIIl(true);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0, new llIlIIIIIlIIlIlIIlll(this));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(2, new llllIIIIlIIIlIlllIll(this, 1.0, 40, 20.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(5, new IlIIllIIllIIllIIlIIl(this, 1.0));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(6, new lllllIIIIIlIlIIIIIIl(this, net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, 8.0f));
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(7, new IlIlIllllllllIIIIlII(this));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(1, new IlIlIIIlIIlIlIIlllIl(this, false, new Class[0]));
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(2, new IIlIIIIIllIlIIIlIIll(this, IlIllIlIlIIIlIlIlIII.class, 0, false, false, IlIIIlIlIIIllIlIlIIl.x));
        this.llllIIIlIlllIlIIIIIl = 50;
    }
    
    @Override
    protected void a_() {
        super.a_();
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(17, new Integer(0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(18, new Integer(0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(19, new Integer(0));
        this.IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll(20, new Integer(0));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Invul", this.an());
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        this.lllIIIIlllllIlIIllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("Invul"));
    }
    
    @Override
    protected String e() {
        return "mob.wither.idle";
    }
    
    @Override
    protected String O() {
        return "mob.wither.hurt";
    }
    
    @Override
    protected String P() {
        return "mob.wither.death";
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        this.llIIlllIIlllIIllIllI *= 0.6000000238418579;
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IlIlIIIIIIlllIlIllIl(0) > 0) {
            final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IlIlIIIIIIlllIlIllIl(0));
            if (llllIIIIlIIIlIlllIll != null) {
                if (this.llIIIlIlIllIIlIlIlII < llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII || (!this.ao() && this.llIIIlIlIllIIlIlIlII < llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + 5.0)) {
                    if (this.llIIlllIIlllIIllIllI < 0.0) {
                        this.llIIlllIIlllIIllIllI = 0.0;
                    }
                    this.llIIlllIIlllIIllIllI += (0.5 - this.llIIlllIIlllIIllIllI) * 0.6000000238418579;
                }
                final double n = llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - this.IIlllIlIIllIlIlIlIIl;
                final double n2 = llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - this.lllllIlIIIlIlIIlllII;
                final double n3 = n * n + n2 * n2;
                if (n3 > 9.0) {
                    final double n4 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3);
                    this.lIllllllIIllIlIlIlII += (n / n4 * 0.5 - this.lIllllllIIllIlIlIlII) * 0.6000000238418579;
                    this.IIlllIIIlIlllIIlllII += (n2 / n4 * 0.5 - this.IIlllIIIlIlllIIlllII) * 0.6000000238418579;
                }
            }
        }
        if (this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII > 0.05000000074505806) {
            this.IIlIIIIIllIlIIIlIIll = (float)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlllIIIlIlllIIlllII, this.lIllllllIIllIlIlIlII) * 57.295776f - 90.0f;
        }
        super.IIIlIIIlIlIIlllIIlll();
        for (int i = 0; i < 2; ++i) {
            this.t[i] = this.IlIlIlIlIlllllllllIl[i];
            this.llIllIIIIIllIlIIIIlI[i] = this.llllIIIIlIIIlIlllIll[i];
        }
        for (int j = 0; j < 2; ++j) {
            final int ilIlIIIIIIlllIlIllIl = this.IlIlIIIIIIlllIlIllIl(j + 1);
            llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll2 = null;
            if (ilIlIIIIIIlllIlIllIl > 0) {
                llllIIIIlIIIlIlllIll2 = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
            }
            if (llllIIIIlIIIlIlllIll2 != null) {
                final double iIllIIllIIIlIlIIIIlI = this.IIllIIllIIIlIlIIIIlI(j + 1);
                final double iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll(j + 1);
                final double ilIlIIIlIIlIlIIlllIl = this.IlIlIIIlIIlIlIIlllIl(j + 1);
                final double n5 = llllIIIIlIIIlIlllIll2.IIlllIlIIllIlIlIlIIl - iIllIIllIIIlIlIIIIlI;
                final double n6 = llllIIIIlIIIlIlllIll2.llIIIlIlIllIIlIlIlII + llllIIIIlIIIlIlllIll2.llllIlIllllIIlIIlIlI() - iiIlIIIlIlIIlllIIlll;
                final double n7 = llllIIIIlIIIlIlllIll2.lllllIlIIIlIlIIlllII - ilIlIIIlIIlIlIIlllIl;
                final double n8 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n5 * n5 + n7 * n7);
                final float n9 = (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n7, n5) * 180.0 / 3.141592653589793) - 90.0f;
                this.llllIIIIlIIIlIlllIll[j] = this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll[j], (float)(-(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n6, n8) * 180.0 / 3.141592653589793)), 40.0f);
                this.IlIlIlIlIlllllllllIl[j] = this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl[j], n9, 10.0f);
            }
            else {
                this.IlIlIlIlIlllllllllIl[j] = this.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl[j], this.lIllIlIIIllllllIIlII, 10.0f);
            }
        }
        final boolean ao = this.ao();
        for (int k = 0; k < 3; ++k) {
            final double iIllIIllIIIlIlIIIIlI2 = this.IIllIIllIIIlIlIIIIlI(k);
            final double iiIlIIIlIlIIlllIIlll2 = this.IIIlIIIlIlIIlllIIlll(k);
            final double ilIlIIIlIIlIlIIlllIl2 = this.IlIlIIIlIIlIlIIlllIl(k);
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.lIlIlIIIllIIllIIIllI, iIllIIllIIIlIlIIIIlI2 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.30000001192092896, iiIlIIIlIlIIlllIIlll2 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.30000001192092896, ilIlIIIlIIlIlIIlllIl2 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.30000001192092896, 0.0, 0.0, 0.0, new int[0]);
            if (ao && this.IlllllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(4) == 0) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIllIlIlIIIlIlIlIII, iIllIIllIIIlIlIIIIlI2 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.30000001192092896, iiIlIIIlIlIIlllIIlll2 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.30000001192092896, ilIlIIIlIIlIlIIlllIl2 + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 0.30000001192092896, 0.699999988079071, 0.699999988079071, 0.5, new int[0]);
            }
        }
        if (this.an() > 0) {
            for (int l = 0; l < 3; ++l) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIllIlIlIIIlIlIlIII, this.IIlllIlIIllIlIlIlIIl + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 1.0, this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextFloat() * 3.3f, this.lllllIlIIIlIlIIlllII + this.IlIIllIIllIIllIIlIIl.nextGaussian() * 1.0, 0.699999988079071, 0.699999988079071, 0.8999999761581421, new int[0]);
            }
        }
    }
    
    @Override
    protected void i() {
        if (this.an() > 0) {
            final int n = this.an() - 1;
            if (n <= 0) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII + this.llllIlIllllIIlIIlIlI(), this.lllllIlIIIlIlIIlllII, 7.0f, false, this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing"));
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(1013, new IlIlIlIlIlllllllllIl(this), 0);
            }
            this.lllIIIIlllllIlIIllIl(n);
            if (this.lllllIIIIIlIlIIIIIIl % 10 == 0) {
                this.IlIlIlIlIlllllllllIl(10.0f);
            }
        }
        else {
            super.i();
            for (int i = 1; i < 3; ++i) {
                if (this.lllllIIIIIlIlIIIIIIl >= this.u[i - 1]) {
                    this.u[i - 1] = this.lllllIIIIIlIlIIIIIIl + 10 + this.IlIIllIIllIIllIIlIIl.nextInt(10);
                    if (this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI || this.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll() == net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl) {
                        final int n2 = i - 1;
                        final int n3 = this.v[i - 1];
                        this.v[n2] = this.v[i - 1] + 1;
                        if (n3 > 15) {
                            final float n4 = 10.0f;
                            final float n5 = 5.0f;
                            this.llllIIIIlIIIlIlllIll(i + 1, net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, this.IIlllIlIIllIlIlIlIIl - n4, this.IIlllIlIIllIlIlIlIIl + n4), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, this.llIIIlIlIllIIlIlIlII - n5, this.llIIIlIlIllIIlIlIlII + n5), net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIIllIIllIIllIIlIIl, this.lllllIlIIIlIlIIlllII - n4, this.lllllIlIIIlIlIIlllII + n4), true);
                            this.v[i - 1] = 0;
                        }
                    }
                    final int ilIlIIIIIIlllIlIllIl = this.IlIlIIIIIIlllIlIllIl(i);
                    if (ilIlIIIIIIlllIlIllIl > 0) {
                        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl);
                        if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.llllIllllIllllIlIlII() && this.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll) <= 900.0 && this.IIlllIIlIllIllIlIIll(llllIIIIlIIIlIlllIll)) {
                            if (llllIIIIlIIIlIlllIll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && ((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llllIIIIlIIIlIlllIll).K.llllIIIIlIIIlIlllIll) {
                                this.IlIlIlIlIlllllllllIl(i, 0);
                            }
                            else {
                                this.llllIIIIlIIIlIlllIll(i + 1, (lllIIIIlllllIlIIllIl)llllIIIIlIIIlIlllIll);
                                this.u[i - 1] = this.lllllIIIIIlIlIIIIIIl + 40 + this.IlIIllIIllIIllIIlIIl.nextInt(20);
                                this.v[i - 1] = 0;
                            }
                        }
                        else {
                            this.IlIlIlIlIlllllllllIl(i, 0);
                        }
                    }
                    else {
                        final List llllIIIIlIIIlIlllIll2 = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(20.0, 8.0, 20.0), Predicates.and(IlIIIlIlIIIllIlIlIIl.x, net.minecraft.IlllllllIIIlIIIlIlII.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl));
                        int n6 = 0;
                        while (n6 < 10 && !llllIIIIlIIIlIlllIll2.isEmpty()) {
                            final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = llllIIIIlIIIlIlllIll2.get(this.IlIIllIIllIIllIIlIIl.nextInt(llllIIIIlIIIlIlllIll2.size()));
                            if (lllIIIIlllllIlIIllIl != this && lllIIIIlllllIlIIllIl.llllIllllIllllIlIlII() && this.IIlllIIlIllIllIlIIll(lllIIIIlllllIlIIllIl)) {
                                if (!(lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)) {
                                    this.IlIlIlIlIlllllllllIl(i, lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl());
                                    break;
                                }
                                if (!((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl).K.llllIIIIlIIIlIlllIll) {
                                    this.IlIlIlIlIlllllllllIl(i, lllIIIIlllllIlIIllIl.IlllIIIIlIIIlIlIlIIl());
                                    break;
                                }
                                break;
                            }
                            else {
                                llllIIIIlIIIlIlllIll2.remove(lllIIIIlllllIlIIllIl);
                                ++n6;
                            }
                        }
                    }
                }
            }
            if (this.IIlllIIIlIlllIIlllII() != null) {
                this.IlIlIlIlIlllllllllIl(0, this.IIlllIIIlIlllIIlllII().IlllIIIIlIIIlIlIlIIl());
            }
            else {
                this.IlIlIlIlIlllllllllIl(0, 0);
            }
            if (this.w > 0) {
                --this.w;
                if (this.w == 0 && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
                    final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llIIIlIlIllIIlIlIlII);
                    final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IIlllIlIIllIlIlIlIIl);
                    final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.lllllIlIIIlIlIIlllII);
                    boolean b = false;
                    for (int j = -1; j <= 1; ++j) {
                        for (int k = -1; k <= 1; ++k) {
                            for (int l = 0; l <= 3; ++l) {
                                final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI2 + j, llIllIIIIIllIlIIIIlI + l, llIllIIIIIllIlIIIIlI3 + k);
                                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI4 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
                                if (llIllIIIIIllIlIIIIlI4.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI4)) {
                                    b = (this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, true) || b);
                                }
                            }
                        }
                    }
                    if (b) {
                        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1012, new IlIlIlIlIlllllllllIl(this), 0);
                    }
                }
            }
            if (this.lllllIIIIIlIlIIIIIIl % 20 == 0) {
                this.IlIlIlIlIlllllllllIl(1.0f);
            }
        }
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.J && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.K && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ab && llllIIIIlIIIlIlllIll != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az;
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        this.lllIIIIlllllIlIIllIl(220);
        this.llIllIlIIIIllIlIIllI(this.U() / 3.0f);
    }
    
    @Override
    public void lllllIlIlIlllIlllIlI() {
    }
    
    @Override
    public int R() {
        return 4;
    }
    
    private double IIllIIllIIIlIlIIIIlI(final int n) {
        if (n <= 0) {
            return this.IIlllIlIIllIlIlIlIIl;
        }
        return this.IIlllIlIIllIlIlIlIIl + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl((this.lIllIlIIIllllllIIlII + 180 * (n - 1)) / 180.0f * 3.1415927f) * 1.3;
    }
    
    private double IIIlIIIlIlIIlllIIlll(final int n) {
        return (n <= 0) ? (this.llIIIlIlIllIIlIlIlII + 3.0) : (this.llIIIlIlIllIIlIlIlII + 2.2);
    }
    
    private double IlIlIIIlIIlIlIIlllIl(final int n) {
        if (n <= 0) {
            return this.lllllIlIIIlIlIIlllII;
        }
        return this.lllllIlIIIlIlIIlllII + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.lIllIlIIIllllllIIlII + 180 * (n - 1)) / 180.0f * 3.1415927f) * 1.3;
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
    
    private void llllIIIIlIIIlIlllIll(final int n, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        this.llllIIIIlIIIlIlllIll(n, lllIIIIlllllIlIIllIl.IIlllIlIIllIlIlIlIIl, lllIIIIlllllIlIIllIl.llIIIlIlIllIIlIlIlII + lllIIIIlllllIlIIllIl.llllIlIllllIIlIIlIlI() * 0.5, lllIIIIlllllIlIIllIl.lllllIlIIIlIlIIlllII, n == 0 && this.IlIIllIIllIIllIIlIIl.nextFloat() < 0.001f);
    }
    
    private void llllIIIIlIIIlIlllIll(final int n, final double n2, final double n3, final double n4, final boolean b) {
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, 1014, new IlIlIlIlIlllllllllIl(this), 0);
        final double iIllIIllIIIlIlIIIIlI = this.IIllIIllIIIlIlIIIIlI(n);
        final double iiIlIIIlIlIIlllIIlll = this.IIIlIIIlIlIIlllIIlll(n);
        final double ilIlIIIlIIlIlIIlllIl = this.IlIlIIIlIIlIlIIlllIl(n);
        final net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = new net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl(this.IlllllllIIIlIIIlIlII, this, n2 - iIllIIllIIIlIlIIIIlI, n3 - iiIlIIIlIlIIlllIIlll, n4 - ilIlIIIlIIlIlIIlllIl);
        if (b) {
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(true);
        }
        llIIlIIIlIIIllIlIIIl.llIIIlIlIllIIlIlIlII = iiIlIIIlIlIIlllIIlll;
        llIIlIIIlIIIllIlIIIl.IIlllIlIIllIlIlIlIIl = iIllIIllIIIlIlIIIIlI;
        llIIlIIIlIIIllIlIIIl.lllllIlIIIlIlIIlllII = ilIlIIIlIIlIlIIlllIl;
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl, final float n) {
        this.llllIIIIlIIIlIlllIll(0, lllIIIIlllllIlIIllIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (lIllllllIIllIlIlIlII == lIllllllIIllIlIlIlII.IllIIlllIIIIlllIIlIl || lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof IlIIIlIlIIIllIlIlIIl) {
            return false;
        }
        if (this.an() > 0 && lIllllllIIllIlIlIlII != lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl) {
            return false;
        }
        if (this.ao() && lIllllllIIllIlIlIlII.lIIIlllIIIllIIIllIII() instanceof net.minecraft.llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) {
            return false;
        }
        final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl = lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl();
        if (llIIlIIIlIIIllIlIIIl != null && !(llIIlIIIlIIIllIlIIIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) && llIIlIIIlIIIllIlIIIl instanceof lllIIIIlllllIlIIllIl && ((lllIIIIlllllIlIIllIl)llIIlIIIlIIIllIlIIIl).Y() == this.Y()) {
            return false;
        }
        if (this.w <= 0) {
            this.w = 20;
        }
        for (int i = 0; i < this.v.length; ++i) {
            final int[] v = this.v;
            final int n2 = i;
            v[n2] += 3;
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final boolean b, final int n) {
        final lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.ad, 1);
        if (llllIIIIlIIIlIlllIll != null) {
            llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll();
        }
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final Iterator<net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll> iterator = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(50.0, 100.0, 50.0)).iterator();
            while (iterator.hasNext()) {
                iterator.next().llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl.IlIIIlIIIllllIlIlIlI);
            }
        }
    }
    
    @Override
    protected void h() {
        this.b = 0;
    }
    
    @Override
    public int a_(final float n) {
        return 15728880;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final float n, final float n2) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(300.0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIIIlIlIIIllIlIlIIl).llllIIIIlIIIlIlllIll(0.6000000238418579);
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(40.0);
    }
    
    public float llllIIIIlIIIlIlllIll(final int n) {
        return this.IlIlIlIlIlllllllllIl[n];
    }
    
    public float IlIlIlIlIlllllllllIl(final int n) {
        return this.llllIIIIlIIIlIlllIll[n];
    }
    
    public int an() {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(20);
    }
    
    public void lllIIIIlllllIlIIllIl(final int n) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(20, n);
    }
    
    public int IlIlIIIIIIlllIlIllIl(final int n) {
        return this.IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI(17 + n);
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int n2) {
        this.IIlllIIlllIIIlIlllII.IlIlIlIlIlllllllllIl(17 + n, n2);
    }
    
    public boolean ao() {
        return this.N() <= this.U() / 2.0f;
    }
    
    @Override
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII Y() {
        return net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.IIIlIIIlIlIIlllIIlll = null;
    }
}
