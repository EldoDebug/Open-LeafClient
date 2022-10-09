package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import com.google.common.collect.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl extends IlIllIlIlIIIlIlIlIII implements IllIlIIllIllIIlIllII, IllIIlllIIIIlllIIlIl, lllllIlIIIlIlIIlllII
{
    public double llllIIIIlIIIlIlllIll;
    public double IlIlIlIlIlllllllllIl;
    public double llIllIIIIIllIlIIIIlI;
    public double[][] IlIIIlIlIIIllIlIlIIl;
    public int IlIlIIIllIllIIIIIllI;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI[] t;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI u;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI v;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI w;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI x;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI y;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI z;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI A;
    public float B;
    public float C;
    public boolean D;
    public boolean E;
    private llIllIIIIIllIlIIIIlI H;
    public int F;
    public net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI G;
    
    public IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.IlIIIlIlIIIllIlIlIIl = new double[64][3];
        this.IlIlIIIllIllIIIIIllI = -1;
        this.t = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI[] { this.u = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this, "head", 6.0f, 6.0f), this.v = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this, "body", 8.0f, 8.0f), this.w = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this, "tail", 4.0f, 4.0f), this.x = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this, "tail", 4.0f, 4.0f), this.y = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this, "tail", 4.0f, 4.0f), this.z = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this, "wing", 4.0f, 4.0f), this.A = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(this, "wing", 4.0f, 4.0f) };
        this.llIllIlIIIIllIlIIllI(this.U());
        this.llllIIIIlIIIlIlllIll(16.0f, 8.0f);
        this.lIIIIlIlIllllIIlIllI = true;
        this.IIIllIIIlIlIIllIIIlI = true;
        this.IlIlIlIlIlllllllllIl = 100.0;
        this.IIllIIIlIIlIlIlIIIII = true;
    }
    
    @Override
    protected void IlIlIllllllllIIIIlII() {
        super.IlIlIllllllllIIIIlII();
        this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIIIllllIlIlIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(200.0);
    }
    
    @Override
    protected void a_() {
        super.a_();
    }
    
    public double[] IlIlIlIlIlllllllllIl(final int n, float n2) {
        if (this.N() <= 0.0f) {
            n2 = 0.0f;
        }
        n2 = 1.0f - n2;
        final int n3 = this.IlIlIIIllIllIIIIIllI - n * 1 & 0x3F;
        final int n4 = this.IlIlIIIllIllIIIIIllI - n * 1 - 1 & 0x3F;
        final double[] array = new double[3];
        final double n5 = this.IlIIIlIlIIIllIlIlIIl[n3][0];
        array[0] = n5 + net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.IlIIIlIlIIIllIlIlIIl[n4][0] - n5) * n2;
        final double n6 = this.IlIIIlIlIIIllIlIlIIl[n3][1];
        array[1] = n6 + (this.IlIIIlIlIIIllIlIlIIl[n4][1] - n6) * n2;
        array[2] = this.IlIIIlIlIIIllIlIlIIl[n3][2] + (this.IlIIIlIlIIIllIlIlIIl[n4][2] - this.IlIIIlIlIIIllIlIlIIl[n3][2]) * n2;
        return array;
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final float ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.C * 3.1415927f * 2.0f);
            if (net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.B * 3.1415927f * 2.0f) <= -0.3f && ilIlIlIlIlllllllllIl >= -0.3f && !this.lIlIlIlllIIlIlIlllIl()) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, "mob.enderdragon.wings", 5.0f, 0.8f + this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.3f, false);
            }
        }
        this.B = this.C;
        if (this.N() <= 0.0f) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 8.0f, this.llIIIlIlIllIIlIlIlII + 2.0 + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 4.0f, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 8.0f, 0.0, 0.0, 0.0, new int[0]);
        }
        else {
            this.lIIIIlIIIIIlllIllIII();
            final float n = 0.2f / (net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII) * 10.0f + 1.0f) * (float)Math.pow(2.0, this.llIIlllIIlllIIllIllI);
            if (this.E) {
                this.C += n * 0.5f;
            }
            else {
                this.C += n;
            }
            this.IIlIIIIIllIlIIIlIIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.IIlIIIIIllIlIIIlIIll);
            if (this.v()) {
                this.C = 0.5f;
            }
            else {
                if (this.IlIlIIIllIllIIIIIllI < 0) {
                    for (int i = 0; i < this.IlIIIlIlIIIllIlIlIIl.length; ++i) {
                        this.IlIIIlIlIIIllIlIlIIl[i][0] = this.IIlIIIIIllIlIIIlIIll;
                        this.IlIIIlIlIIIllIlIlIIl[i][1] = this.llIIIlIlIllIIlIlIlII;
                    }
                }
                if (++this.IlIlIIIllIllIIIIIllI == this.IlIIIlIlIIIllIlIlIIl.length) {
                    this.IlIlIIIllIllIIIIIllI = 0;
                }
                this.IlIIIlIlIIIllIlIlIIl[this.IlIlIIIllIllIIIIIllI][0] = this.IIlIIIIIllIlIIIlIIll;
                this.IlIIIlIlIIIllIlIlIIl[this.IlIlIIIllIllIIIIIllI][1] = this.llIIIlIlIllIIlIlIlII;
                if (this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    if (this.n > 0) {
                        final double n2 = this.IIlllIlIIllIlIlIlIIl + (this.o - this.IIlllIlIIllIlIlIlIIl) / this.n;
                        final double n3 = this.llIIIlIlIllIIlIlIlII + (this.p - this.llIIIlIlIllIIlIlIlII) / this.n;
                        final double n4 = this.lllllIlIIIlIlIIlllII + (this.q - this.lllllIlIIIlIlIIlllII) / this.n;
                        this.IIlIIIIIllIlIIIlIIll += (float)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.r - this.IIlIIIIIllIlIIIlIIll) / this.n);
                        this.llllllIllIllIlIllllI += (float)((this.s - this.llllllIllIllIlIllllI) / this.n);
                        --this.n;
                        this.IlIlIlIlIlllllllllIl(n2, n3, n4);
                        this.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI);
                    }
                }
                else {
                    final double n5 = this.llllIIIIlIIIlIlllIll - this.IIlllIlIIllIlIlIlIIl;
                    final double n6 = this.IlIlIlIlIlllllllllIl - this.llIIIlIlIllIIlIlIlII;
                    final double n7 = this.llIllIIIIIllIlIIIIlI - this.lllllIlIIIlIlIIlllII;
                    final double n8 = n5 * n5 + n6 * n6 + n7 * n7;
                    if (this.H != null) {
                        this.llllIIIIlIIIlIlllIll = this.H.IIlllIlIIllIlIlIlIIl;
                        this.llIllIIIIIllIlIIIIlI = this.H.lllllIlIIIlIlIIlllII;
                        final double n9 = this.llllIIIIlIIIlIlllIll - this.IIlllIlIIllIlIlIlIIl;
                        final double n10 = this.llIllIIIIIllIlIIIIlI - this.lllllIlIIIlIlIIlllII;
                        double n11 = 0.4000000059604645 + Math.sqrt(n9 * n9 + n10 * n10) / 80.0 - 1.0;
                        if (n11 > 10.0) {
                            n11 = 10.0;
                        }
                        this.IlIlIlIlIlllllllllIl = this.H.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + n11;
                    }
                    else {
                        this.llllIIIIlIIIlIlllIll += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 2.0;
                        this.llIllIIIIIllIlIIIIlI += this.IlIIllIIllIIllIIlIIl.nextGaussian() * 2.0;
                    }
                    if (this.D || n8 < 100.0 || n8 > 22500.0 || this.IIIIIIIIIlllIllIlIlI || this.IIllllIIIlIIIIIIllIl) {
                        this.llllIIllllIlIlIIIIll();
                    }
                    final double n12 = n6 / net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n5 * n5 + n7 * n7);
                    final float n13 = 0.6f;
                    this.llIIlllIIlllIIllIllI += net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n12, -n13, n13) * 0.10000000149011612;
                    this.IIlIIIIIllIlIIIlIIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(this.IIlIIIIIllIlIIIlIIll);
                    double llllIIIlIlllIlIIIIIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(180.0 - net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n5, n7) * 180.0 / 3.141592653589793 - this.IIlIIIIIllIlIIIlIIll);
                    if (llllIIIlIlllIlIIIIIl > 50.0) {
                        llllIIIlIlllIlIIIIIl = 50.0;
                    }
                    if (llllIIIlIlllIlIIIIIl < -50.0) {
                        llllIIIlIlllIlIIIIIl = -50.0;
                    }
                    final e llllIIIIlIIIlIlllIll = new e(this.llllIIIIlIIIlIlllIll - this.IIlllIlIIllIlIlIlIIl, this.IlIlIlIlIlllllllllIl - this.llIIIlIlIllIIlIlIlII, this.llIllIIIIIllIlIIIIlI - this.lllllIlIIIlIlIIlllII).llllIIIIlIIIlIlllIll();
                    final e llllIIIIlIIIlIlllIll2 = new e(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f), this.llIIlllIIlllIIllIllI, -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f)).llllIIIIlIIIlIlllIll();
                    float n14 = ((float)llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll) + 0.5f) / 1.5f;
                    if (n14 < 0.0f) {
                        n14 = 0.0f;
                    }
                    this.m *= 0.8f;
                    final float n15 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII) * 1.0f + 1.0f;
                    double n16 = Math.sqrt(this.lIllllllIIllIlIlIlII * this.lIllllllIIllIlIlIlII + this.IIlllIIIlIlllIIlllII * this.IIlllIIIlIlllIIlllII) * 1.0 + 1.0;
                    if (n16 > 40.0) {
                        n16 = 40.0;
                    }
                    this.m += (float)(llllIIIlIlllIlIIIIIl * (0.699999988079071 / n16 / n15));
                    this.IIlIIIIIllIlIIIlIIll += this.m * 0.1f;
                    final float n17 = (float)(2.0 / (n16 + 1.0));
                    this.IlIlIlIlIlllllllllIl(0.0f, -1.0f, 0.06f * (n14 * n17 + (1.0f - n17)));
                    if (this.E) {
                        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII * 0.800000011920929, this.llIIlllIIlllIIllIllI * 0.800000011920929, this.IIlllIIIlIlllIIlllII * 0.800000011920929);
                    }
                    else {
                        this.IlIIIlIlIIIllIlIlIIl(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII);
                    }
                    final float n18 = 0.8f + 0.15f * (((float)new e(this.lIllllllIIllIlIlIlII, this.llIIlllIIlllIIllIllI, this.IIlllIIIlIlllIIlllII).llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2) + 1.0f) / 2.0f);
                    this.lIllllllIIllIlIlIlII *= n18;
                    this.IIlllIIIlIlllIIlllII *= n18;
                    this.llIIlllIIlllIIllIllI *= 0.9100000262260437;
                }
                this.lIllIlIIIllllllIIlII = this.IIlIIIIIllIlIIIlIIll;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI u = this.u;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI u2 = this.u;
                final float n19 = 3.0f;
                u2.IlIllllIIlIIlIlIlIll = n19;
                u.IllIllIIIIlIIlIlllII = n19;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI w = this.w;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI w2 = this.w;
                final float n20 = 2.0f;
                w2.IlIllllIIlIIlIlIlIll = n20;
                w.IllIllIIIIlIIlIlllII = n20;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI x = this.x;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI x2 = this.x;
                final float n21 = 2.0f;
                x2.IlIllllIIlIIlIlIlIll = n21;
                x.IllIllIIIIlIIlIlllII = n21;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI y = this.y;
                final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI y2 = this.y;
                final float n22 = 2.0f;
                y2.IlIllllIIlIIlIlIlIll = n22;
                y.IllIllIIIIlIIlIlllII = n22;
                this.v.IlIllllIIlIIlIlIlIll = 3.0f;
                this.v.IllIllIIIIlIIlIlllII = 5.0f;
                this.z.IlIllllIIlIIlIlIlIll = 2.0f;
                this.z.IllIllIIIIlIIlIlllII = 4.0f;
                this.A.IlIllllIIlIIlIlIlIll = 3.0f;
                this.A.IllIllIIIIlIIlIlllII = 4.0f;
                final float n23 = (float)(this.IlIlIlIlIlllllllllIl(5, 1.0f)[1] - this.IlIlIlIlIlllllllllIl(10, 1.0f)[1]) * 10.0f / 180.0f * 3.1415927f;
                final float ilIlIlIlIlllllllllIl2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n23);
                final float n24 = -net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n23);
                final float n25 = this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f;
                final float llllIIIIlIIIlIlllIll3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n25);
                final float ilIlIlIlIlllllllllIl3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n25);
                this.v.IIllIIllIIIlIlIIIIlI();
                this.v.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + llllIIIIlIIIlIlllIll3 * 0.5f, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII - ilIlIlIlIlllllllllIl3 * 0.5f, 0.0f, 0.0f);
                this.z.IIllIIllIIIlIlIIIIlI();
                this.z.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + ilIlIlIlIlllllllllIl3 * 4.5f, this.llIIIlIlIllIIlIlIlII + 2.0, this.lllllIlIIIlIlIIlllII + llllIIIIlIIIlIlllIll3 * 4.5f, 0.0f, 0.0f);
                this.A.IIllIIllIIIlIlIIIIlI();
                this.A.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl - ilIlIlIlIlllllllllIl3 * 4.5f, this.llIIIlIlIllIIlIlIlII + 2.0, this.lllllIlIIIlIlIIlllII - llllIIIIlIIIlIlllIll3 * 4.5f, 0.0f, 0.0f);
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && this.IIlllIIlIllIllIlIIll == 0) {
                    this.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.z.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(4.0, 2.0, 4.0).llIllIIIIIllIlIIIIlI(0.0, -2.0, 0.0)));
                    this.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.A.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(4.0, 2.0, 4.0).llIllIIIIIllIlIIIIlI(0.0, -2.0, 0.0)));
                    this.IlIlIlIlIlllllllllIl(this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.u.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(1.0, 1.0, 1.0)));
                }
                final double[] ilIlIlIlIlllllllllIl4 = this.IlIlIlIlIlllllllllIl(5, 1.0f);
                final double[] ilIlIlIlIlllllllllIl5 = this.IlIlIlIlIlllllllllIl(0, 1.0f);
                final float llllIIIIlIIIlIlllIll4 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f - this.m * 0.01f);
                final float ilIlIlIlIlllllllllIl6 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f - this.m * 0.01f);
                this.u.IIllIIllIIIlIlIIIIlI();
                this.u.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + llllIIIIlIIIlIlllIll4 * 5.5f * ilIlIlIlIlllllllllIl2, this.llIIIlIlIllIIlIlIlII + (ilIlIlIlIlllllllllIl5[1] - ilIlIlIlIlllllllllIl4[1]) * 1.0 + n24 * 5.5f, this.lllllIlIIIlIlIIlllII - ilIlIlIlIlllllllllIl6 * 5.5f * ilIlIlIlIlllllllllIl2, 0.0f, 0.0f);
                for (int j = 0; j < 3; ++j) {
                    llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = null;
                    if (j == 0) {
                        llIllIIIIIllIlIIIIlI = this.w;
                    }
                    if (j == 1) {
                        llIllIIIIIllIlIIIIlI = this.x;
                    }
                    if (j == 2) {
                        llIllIIIIIllIlIIIIlI = this.y;
                    }
                    final double[] ilIlIlIlIlllllllllIl7 = this.IlIlIlIlIlllllllllIl(12 + j * 2, 1.0f);
                    final float n26 = this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f + this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl7[0] - ilIlIlIlIlllllllllIl4[0]) * 3.1415927f / 180.0f * 1.0f;
                    final float llllIIIIlIIIlIlllIll5 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n26);
                    final float ilIlIlIlIlllllllllIl8 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n26);
                    final float n27 = 1.5f;
                    final float n28 = (j + 1) * 2.0f;
                    llIllIIIIIllIlIIIIlI.IIllIIllIIIlIlIIIIlI();
                    llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl - (llllIIIIlIIIlIlllIll3 * n27 + llllIIIIlIIIlIlllIll5 * n28) * ilIlIlIlIlllllllllIl2, this.llIIIlIlIllIIlIlIlII + (ilIlIlIlIlllllllllIl7[1] - ilIlIlIlIlllllllllIl4[1]) * 1.0 - (n28 + n27) * n24 + 1.5, this.lllllIlIIIlIlIIlllII + (ilIlIlIlIlllllllllIl3 * n27 + ilIlIlIlIlllllllllIl8 * n28) * ilIlIlIlIlllllllllIl2, 0.0f, 0.0f);
                }
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    this.E = (this.IlIlIlIlIlllllllllIl(this.u.IlIIlllIIlIlllllIIlI()) | this.IlIlIlIlIlllllllllIl(this.v.IlIIlllIIlIlllllIIlI()));
                }
            }
        }
    }
    
    private void lIIIIlIIIIIlllIllIII() {
        if (this.G != null) {
            if (this.G.IIlIlIlIIlIllIIIIIIl) {
                if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    this.llllIIIIlIIIlIlllIll(this.u, net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll((lIIIIlIIIIIlllIllIII)null), 10.0f);
                }
                this.G = null;
            }
            else if (this.lllllIIIIIlIlIIIIIIl % 10 == 0 && this.N() < this.U()) {
                this.llIllIlIIIIllIlIIllI(this.N() + 1.0f);
            }
        }
        if (this.IlIIllIIllIIllIIlIIl.nextInt(10) == 0) {
            final float n = 32.0f;
            final List llllIIIIlIIIlIlllIll = this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI.class, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(n, n, n));
            net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI g = null;
            double n2 = Double.MAX_VALUE;
            for (final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : llllIIIIlIIIlIlllIll) {
                final double ilIlIIIllIllIIIIIllI = llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(this);
                if (ilIlIIIllIllIIIIIllI < n2) {
                    n2 = ilIlIIIllIllIIIIIllI;
                    g = llIllIIIIIllIlIIIIlI;
                }
            }
            this.G = g;
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final List list) {
        final double n = (this.v.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll + this.v.IlIIlllIIlIlllllIIlI().IlIIIlIlIIIllIlIlIIl) / 2.0;
        final double n2 = (this.v.IlIIlllIIlIlllllIIlI().llIllIIIIIllIlIIIIlI + this.v.IlIIlllIIlIlllllIIlI().IllIIlllIIIIlllIIlIl) / 2.0;
        for (final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI : list) {
            if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                final double n3 = llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl - n;
                final double n4 = llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII - n2;
                final double n5 = n3 * n3 + n4 * n4;
                llIllIIIIIllIlIIIIlI.llllIIIlIlllIlIIIIIl(n3 / n5 * 4.0, 0.20000000298023224, n4 / n5 * 4.0);
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final List list) {
        for (int i = 0; i < list.size(); ++i) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = list.get(i);
            if (llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl) {
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll(this), 10.0f);
                this.llllIIIIlIIIlIlllIll(this, llIllIIIIIllIlIIIIlI);
            }
        }
    }
    
    private void llllIIllllIlIlIIIIll() {
        this.D = false;
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl);
        final Iterator<llllIIIIlIIIlIlllIll> iterator = (Iterator<llllIIIIlIIIlIlllIll>)arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().IlIIIlIlIIIllIlIlIIl()) {
                iterator.remove();
            }
        }
        if (this.IlIIllIIllIIllIIlIIl.nextInt(2) == 0 && !arrayList.isEmpty()) {
            this.H = (llllIIIIlIIIlIlllIll)arrayList.get(this.IlIIllIIllIIllIIlIIl.nextInt(arrayList.size()));
        }
        else {
            double n;
            double n2;
            double n3;
            do {
                this.llllIIIIlIIIlIlllIll = 0.0;
                this.IlIlIlIlIlllllllllIl = 70.0f + this.IlIIllIIllIIllIIlIIl.nextFloat() * 50.0f;
                this.llIllIIIIIllIlIIIIlI = 0.0;
                this.llllIIIIlIIIlIlllIll += this.IlIIllIIllIIllIIlIIl.nextFloat() * 120.0f - 60.0f;
                this.llIllIIIIIllIlIIIIlI += this.IlIIllIIllIIllIIlIIl.nextFloat() * 120.0f - 60.0f;
                n = this.IIlllIlIIllIlIlIlIIl - this.llllIIIIlIIIlIlllIll;
                n2 = this.llIIIlIlIllIIlIlIlII - this.IlIlIlIlIlllllllllIl;
                n3 = this.lllllIlIIIlIlIIlllII - this.llIllIIIIIllIlIIIIlI;
            } while (n * n + n2 * n2 + n3 * n3 <= 100.0);
            this.H = null;
        }
    }
    
    private float IlIlIlIlIlllllllllIl(final double n) {
        return (float)net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(n);
    }
    
    private boolean IlIlIlIlIlllllllllIl(final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final int llIllIIIIIllIlIIIIlI = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI2 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl);
        final int llIllIIIIIllIlIIIIlI3 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        final int llIllIIIIIllIlIIIIlI4 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
        final int llIllIIIIIllIlIIIIlI5 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
        final int llIllIIIIIllIlIIIIlI6 = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
        boolean b = false;
        boolean b2 = false;
        for (int i = llIllIIIIIllIlIIIIlI; i <= llIllIIIIIllIlIIIIlI4; ++i) {
            for (int j = llIllIIIIIllIlIIIIlI2; j <= llIllIIIIIllIlIIIIlI5; ++j) {
                for (int k = llIllIIIIIllIlIIIIlI3; k <= llIllIIIIIllIlIIIIlI6; ++k) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(i, j, k);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI7 = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
                    if (llIllIIIIIllIlIIIIlI7.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        if (llIllIIIIIllIlIIIIlI7 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az && llIllIIIIIllIlIIIIlI7 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl && llIllIIIIIllIlIIIIlI7 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.L && llIllIIIIIllIlIIIIlI7 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII && llIllIIIIIllIlIIIIlI7 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ab && this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("mobGriefing")) {
                            b2 = (this.IlllllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl) || b2);
                        }
                        else {
                            b = true;
                        }
                    }
                }
            }
        }
        if (b2) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll + (llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl - llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) * this.IlIIllIIllIIllIIlIIl.nextFloat(), llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl + (llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI - llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) * this.IlIIllIIllIIllIIlIIl.nextFloat(), llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI + (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl - llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) * this.IlIIllIIllIIllIIlIIl.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
        }
        return b;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, float n) {
        if (llIllIIIIIllIlIIIIlI != this.u) {
            n = n / 4.0f + 1.0f;
        }
        final float n2 = this.IIlIIIIIllIlIIIlIIll * 3.1415927f / 180.0f;
        final float llllIIIIlIIIlIlllIll = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n2);
        final float ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n2);
        this.llllIIIIlIIIlIlllIll = this.IIlllIlIIllIlIlIlIIl + llllIIIIlIIIlIlllIll * 5.0f + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 2.0f;
        this.IlIlIlIlIlllllllllIl = this.llIIIlIlIllIIlIlIlII + this.IlIIllIIllIIllIIlIIl.nextFloat() * 3.0f + 1.0;
        this.llIllIIIIIllIlIIIIlI = this.lllllIlIIIlIlIIlllII - ilIlIlIlIlllllllllIl * 5.0f + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 2.0f;
        this.H = null;
        if (lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl() instanceof llllIIIIlIIIlIlllIll || lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI()) {
            this.IlIlIIIllIllIIIIIllI(lIllllllIIllIlIlIlII, n);
        }
        return true;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (lIllllllIIllIlIlIlII instanceof IIlllIIIlIlllIIlllII && ((IIlllIIIlIlllIIlllII)lIllllllIIllIlIlIlII).IlllllllIIIlIIIlIlII()) {
            this.IlIlIIIllIllIIIIIllI(lIllllllIIllIlIlIlII, n);
        }
        return false;
    }
    
    protected boolean IlIlIIIllIllIIIIIllI(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public void lllIllIIIllllllIllll() {
        this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    protected void y() {
        ++this.F;
        if (this.F >= 180 && this.F <= 200) {
            this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI, this.IIlllIlIIllIlIlIlIIl + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 8.0f, this.llIIIlIlIllIIlIlIlII + 2.0 + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 4.0f, this.lllllIlIIIlIlIIlllII + (this.IlIIllIIllIIllIIlIIl.nextFloat() - 0.5f) * 8.0f, 0.0, 0.0, 0.0, new int[0]);
        }
        final boolean ilIlIlIlIlllllllllIl = this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doMobLoot");
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (this.F > 150 && this.F % 5 == 0 && ilIlIlIlIlllllllllIl) {
                int i = 1000;
                while (i > 0) {
                    final int llllIIIIlIIIlIlllIll = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(i);
                    i -= llllIIIIlIIIlIlllIll;
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll));
                }
            }
            if (this.F == 1) {
                this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(1018, new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this), 0);
            }
        }
        this.IlIIIlIlIIIllIlIlIIl(0.0, 0.10000000149011612, 0.0);
        final float n = this.IIlIIIIIllIlIIIlIIll + 20.0f;
        this.IIlIIIIIllIlIIIlIIll = n;
        this.lIllIlIIIllllllIIlII = n;
        if (this.F == 200 && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            if (ilIlIlIlIlllllllllIl) {
                int j = 2000;
                while (j > 0) {
                    final int llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(j);
                    j -= llllIIIIlIIIlIlllIll2;
                    this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new IlIlIIIlIIlIlIIlllIl(this.IlllllllIIIlIIIlIlII, this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, llllIIIIlIIIlIlllIll2));
                }
            }
            this.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, 64.0, this.lllllIlIIIlIlIIlllII));
            this.IllIllIIIIlIIlIlllII();
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = -1; i <= 32; ++i) {
            for (int j = -4; j <= 4; ++j) {
                for (int k = -4; k <= 4; ++k) {
                    final double n = j * j + k * k;
                    if (n <= 12.25) {
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(j, i, k);
                        if (i < 0) {
                            if (n <= 6.25) {
                                this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
                            }
                        }
                        else if (i > 0) {
                            this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll());
                        }
                        else if (n > 6.25) {
                            this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
                        }
                        else {
                            this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.J.lllIllIIIllllllIllll());
                        }
                    }
                }
            }
        }
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(2);
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(de.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl));
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(de.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI));
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(de.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl));
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(de.IIIIIIIIIlllIllIlIlI, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llIllIIIIIllIlIIIIlI));
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(3), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
        this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(4), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.M.lllIllIIIllllllIllll());
    }
    
    @Override
    protected void h() {
    }
    
    @Override
    public llIllIIIIIllIlIIIIlI[] IlIllllIIlIllIlIlIll() {
        return this.t;
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return false;
    }
    
    @Override
    public IlllllllIIIlIIIlIlII llllIIIIlIIIlIlllIll() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    @Override
    protected String e() {
        return "mob.enderdragon.growl";
    }
    
    @Override
    protected String O() {
        return "mob.enderdragon.hit";
    }
    
    @Override
    protected float Z() {
        return 5.0f;
    }
}
