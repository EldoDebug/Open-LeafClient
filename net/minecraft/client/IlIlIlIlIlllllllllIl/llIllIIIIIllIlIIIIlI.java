package net.minecraft.client.IlIlIlIlIlllllllllIl;

import net.minecraft.client.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.client.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.llllIIIIlIIIlIlllIll.*;
import leaf.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    public final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll;
    private final IlIlIIIllIIllIlllllI R;
    private double S;
    private double T;
    private double U;
    private float V;
    private float W;
    private boolean X;
    private boolean Y;
    private int Z;
    private boolean aa;
    private String ab;
    public IIIIIIIllllIlIIIIIII IlIlIlIlIlllllllllIl;
    protected Minecraft llIllIIIIIllIlIIIIlI;
    protected int IlIIIlIlIIIllIlIlIIl;
    public int IlIlIIIllIllIIIIIllI;
    public float IllIIlllIIIIlllIIlIl;
    public float llllIIIlIlllIlIIIIIl;
    public float lIIIIlIIIIIlllIllIII;
    public float lIIIlllIIIllIIIllIII;
    private int ac;
    private float ad;
    public float llIIlIIIlIIIllIlIIIl;
    public float llIllIlIIIIllIlIIllI;
    
    public llIllIIIIIllIlIIIIlI(final Minecraft llIllIIIIIllIlIIIIlI, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll, final IlIlIIIllIIllIlllllI r) {
        super(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl());
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.R = r;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.lllllIIIIIlIIlllIlIl = 0;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        return false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final float n) {
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        if (llIllIIIIIllIlIIIIlI instanceof llIllIlIIIIllIlIIllI) {
            this.llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(new net.minecraft.client.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(this, (llIllIlIIIIllIlIIllI)llIllIIIIIllIlIIIIlI));
        }
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        if (this.IlllllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl, 0.0, this.lllllIlIIIlIlIIlllII))) {
            super.IIllIIllIIIlIlIIIIlI();
            if (this.IIllIIIlIIIIlIIlIIII()) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI, this.IIIIIllIIIIlIIIIllIl));
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIllIlIlIIIlIlIlIII(this.k, this.l, this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI, this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl));
            }
            else {
                this.IlllllllIIIlIIIlIlII();
            }
        }
    }
    
    public void IlllllllIIIlIIIlIlII() {
        final boolean iiIllIIllIIIIIIlIIlI = this.IIIllIIllIIIIIIlIIlI();
        if (iiIllIIllIIIIIIlIIlI != this.Y) {
            if (iiIllIIllIIIIIIlIIlI) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.IlIIIlIlIIIllIlIlIIl));
            }
            else {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI));
            }
            this.Y = iiIllIIllIIIIIIlIIlI;
        }
        final boolean iiiiIllIIIIlIIIIllIl = this.IIIIIllIIIIlIIIIllIl();
        if (iiiiIllIIIIlIIIIllIl != this.X) {
            if (iiiiIllIIIIlIIIIllIl) {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll));
            }
            else {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl));
            }
            this.X = iiiiIllIIIIlIIIIllIl;
        }
        if (this.IIllllIIIlIIIIIIllIl()) {
            final double n = this.IIlllIlIIllIlIlIlIIl - this.S;
            final double n2 = this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl - this.T;
            final double n3 = this.lllllIlIIIlIlIIlllII - this.U;
            final double n4 = this.IIlIIIIIllIlIIIlIIll - this.V;
            final double n5 = this.llllllIllIllIlIllllI - this.W;
            int n6 = (n * n + n2 * n2 + n3 * n3 > 9.0E-4 || this.Z >= 20) ? 1 : 0;
            final boolean b = n4 != 0.0 || n5 != 0.0;
            if (this.IIIlIIIlIlIIlllIIlll == null) {
                if (n6 != 0 && b) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(this.IIlllIlIIllIlIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.lllllIlIIIlIlIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI, this.IIIIIllIIIIlIIIIllIl));
                }
                else if (n6 != 0) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IllIIlllIIIIlllIIlIl(this.IIlllIlIIllIlIlIlIIl, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl, this.lllllIlIIIlIlIIlllII, this.IIIIIllIIIIlIIIIllIl));
                }
                else if (b) {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new llllIIIlIlllIlIIIIIl(this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI, this.IIIIIllIIIIlIIIIllIl));
                }
                else {
                    this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIlIIIllIllIIIIIllI(this.IIIIIllIIIIlIIIIllIl));
                }
            }
            else {
                this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(this.lIllllllIIllIlIlIlII, -999.0, this.IIlllIIIlIlllIIlllII, this.IIlIIIIIllIlIIIlIIll, this.llllllIllIllIlIllllI, this.IIIIIllIIIIlIIIIllIl));
                n6 = 0;
            }
            ++this.Z;
            if (n6 != 0) {
                this.S = this.IIlllIlIIllIlIlIlIIl;
                this.T = this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl;
                this.U = this.lllllIlIIIlIlIIlllII;
                this.Z = 0;
            }
            if (b) {
                this.V = this.IIlIIIIIllIlIIIlIIll;
                this.W = this.llllllIllIllIlIllllI;
            }
        }
    }
    
    @Override
    public lIIIlllIIIllIIIllIII IlIlIlIlIlllllllllIl(final boolean b) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(b ? net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl : net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IlIlIIIllIllIIIIIllI, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll, net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll));
        return null;
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
    }
    
    public void IlIlIlIlIlllllllllIl(final String s) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(s));
    }
    
    @Override
    public void IIlIIIIlllIlllllIlII() {
        super.IIlIIIIlllIlllllIlII();
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI());
    }
    
    @Override
    public void IIIlIIlIIIIlllIlllII() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IlIlIllllllllIIIIlII(net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llllIIIIlIIIlIlllIll));
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (!this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            this.llIllIlIIIIllIlIIllI(this.N() - n);
        }
    }
    
    public void b_() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIlllIIlIllIllIlIIll(this.t.IlIIIlIlIIIllIlIlIIl));
        this.IIlllIlIIllIlIlIlIIl();
    }
    
    public void IIlllIlIIllIlIlIlIIl() {
        this.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl((lllIIIIlIlIllIIlIIIl)null);
        super.b_();
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
    }
    
    public void llIllIIIIIllIlIIIIlI(final float n) {
        if (this.aa) {
            final float i = this.N() - n;
            if (i <= 0.0f) {
                this.llIllIlIIIIllIlIIllI(n);
                if (i < 0.0f) {
                    this.lIlIIlllIIlIIlIlllIl = this.llllllIIIIIIIlllIIll / 2;
                }
            }
            else {
                this.i = i;
                this.llIllIlIIIIllIlIIllI(this.N());
                this.lIlIIlllIIlIIlIlllIl = this.llllllIIIIIIIlllIIll;
                this.IlIlIlIlIlllllllllIl(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llIllIlIIIIllIlIIllI, i);
                final int n2 = 10;
                this.IIIIIIIllllIlIIIIIII = n2;
                this.IIlllIIlIllIllIlIIll = n2;
            }
        }
        else {
            this.llIllIlIIIIllIlIIllI(n);
            this.aa = true;
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n) {
        if (illIIlllIIIIlllIIlIl != null && illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl) {
            super.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, n);
        }
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII(this.K));
    }
    
    @Override
    public boolean lllllIlIIIlIlIIlllII() {
        return true;
    }
    
    protected void lIllllllIIllIlIlIlII() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl, (int)(this.IlIIIlIIIllllIlIlIlI() * 100.0f)));
    }
    
    public void llIIlllIIlllIIllIllI() {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IIIIlllIIIIIIlIIIlll(this, net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl));
    }
    
    public void llIllIIIIIllIlIIIIlI(final String ab) {
        this.ab = ab;
    }
    
    public String IIlllIIIlIlllIIlllII() {
        return this.ab;
    }
    
    public IlIlIIIllIIllIlllllI IIlIIIIIllIlIIIlIIll() {
        return this.R;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        if (this.lIIIIlIlIllllIIlIllI) {
            return false;
        }
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(n, n2, n3);
        final double n4 = n - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final double n5 = n3 - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        if (!this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl)) {
            int n6 = -1;
            double n7 = 9999.0;
            if (this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI()) && n4 < n7) {
                n7 = n4;
                n6 = 0;
            }
            if (this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl()) && 1.0 - n4 < n7) {
                n7 = 1.0 - n4;
                n6 = 1;
            }
            if (this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI()) && n5 < n7) {
                n7 = n5;
                n6 = 4;
            }
            if (this.IlIlIIIllIllIIIIIllI(ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl()) && 1.0 - n5 < n7) {
                n6 = 5;
            }
            final float n8 = 0.1f;
            if (n6 == 0) {
                this.lIllllllIIllIlIlIlII = -n8;
            }
            if (n6 == 1) {
                this.lIllllllIIllIlIlIlII = n8;
            }
            if (n6 == 4) {
                this.IIlllIIIlIlllIIlllII = -n8;
            }
            if (n6 == 5) {
                this.IIlllIIIlIlllIIlllII = n8;
            }
        }
        return false;
    }
    
    private boolean IlIlIIIllIllIIIIIllI(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return !this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII() && !this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII();
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final boolean b) {
        super.llIllIIIIIllIlIIIIlI(b);
        this.IlIlIIIllIllIIIIIllI = (b ? 600 : 0);
    }
    
    public void llllIIIIlIIIlIlllIll(final float n, final int m, final int l) {
        this.N = n;
        this.M = m;
        this.L = l;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll) {
        this.llIllIIIIIllIlIIIIlI.lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl().llllIIIIlIIIlIlllIll(llIIIIIIlIllIIlIIIll);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final int n, final String s) {
        return n <= 0;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIIIlIIlIlIIlllIl() {
        return new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.IIlllIlIIllIlIlIlIIl + 0.5, this.llIIIlIlIllIIlIlIlII + 0.5, this.lllllIlIIIlIlIIlllII + 0.5);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final String s, final float n, final float n2) {
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl, this.llIIIlIlIllIIlIlIlII, this.lllllIlIIIlIlIIlllII, s, n, n2, false);
    }
    
    @Override
    public boolean llllllIllIllIlIllllI() {
        return true;
    }
    
    public boolean IIIllllllIllIIIlllIl() {
        return this.IIIlIIIlIlIIlllIIlll != null && this.IIIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl && ((net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl)this.IIIlIIIlIlIIlllIIlll).aI();
    }
    
    public float IlIIIlIIIllllIlIlIlI() {
        return this.ad;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll(llIIlllIIlllIIllIllI));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.lIIIlllIIIllIIIllIII(ilIlIIIllIllIIIIIllI));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.Q) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new llIllIIlllllllllllll(this, lllIIIIlIlIllIIlIIIl, true));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        final String s = (llIIIlIlIllIIlIlIlII instanceof net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI) ? ((net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI)llIIIlIlIllIIlIlIlII).IlIIIlIlIIIllIlIlIIl() : "minecraft:container";
        if ("minecraft:chest".equals(s)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII));
        }
        else if ("minecraft:hopper".equals(s)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII));
        }
        else if ("minecraft:furnace".equals(s)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIllIlIlIIIlIlIlIII(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII));
        }
        else if ("minecraft:brewing_stand".equals(s)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII));
        }
        else if ("minecraft:beacon".equals(s)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII));
        }
        else if (!"minecraft:dispenser".equals(s) && !"minecraft:dropper".equals(s)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII));
        }
        else {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.lllIIIIlllllIlIIllIl(this.lIlIlIIIllIIllIIIllI, llIIIlIlIllIIlIlIlII, illIIlllIIIIlllIIlIl));
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIIllIlllllI ilIlIIIllIIllIlllllI) {
        final String ilIIIlIlIIIllIlIlIIl = ilIlIIIllIIllIlllllI.IlIIIlIlIIIllIlIlIIl();
        if ("minecraft:crafting_table".equals(ilIIIlIlIIIllIlIlIIl)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new net.minecraft.client.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI(this.lIlIlIIIllIIllIIIllI, this.IlllllllIIIlIIIlIlII));
        }
        else if ("minecraft:enchanting_table".equals(ilIIIlIlIIIllIlIlIIl)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new IIIlIIIlIlIIlllIIlll(this.lIlIlIIIllIIllIIIllI, this.IlllllllIIIlIIIlIlII, ilIlIIIllIIllIlllllI));
        }
        else if ("minecraft:anvil".equals(ilIIIlIlIIIllIlIlIIl)) {
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new lllllIIlIlIIIlIlIIIl(this.lIlIlIIIllIIllIIIllI, this.IlllllllIIIlIIIlIlII));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIIlllIIlllIIllIllI llIIlllIIlllIIllIllI) {
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(new IIlIlIlIIlIllIIIIIIl(this.lIlIlIIIllIIllIIIllI, llIIlllIIlllIIllIllI, this.IlllllllIIIlIIIlIlII));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, net.minecraft.IlllllllIIIlIIIlIlII.IlIllllIIlIIlIlIlIll.llIllIlIIIIllIlIIllI);
    }
    
    @Override
    public boolean IIIIIllIIIIlIIIIllIl() {
        return this.IlIlIlIlIlllllllllIl != null && this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl && !this.F;
    }
    
    public void IIIIIIIIIlllIllIlIlI() {
        super.IIIIIIIIIlllIllIlIlI();
        if (this.IIllllIIIlIIIIIIllIl()) {
            this.k = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
            this.l = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
            this.j = this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
            this.lIIIIlIIIIIlllIllIII = this.IllIIlllIIIIlllIIlIl;
            this.lIIIlllIIIllIIIllIII = this.llllIIIlIlllIlIIIIIl;
            this.llllIIIlIlllIlIIIIIl += (float)((this.llllllIllIllIlIllllI - this.llllIIIlIlllIlIIIIIl) * 0.5);
            this.IllIIlllIIIIlllIIlIl += (float)((this.IIlIIIIIllIlIIIlIIll - this.IllIIlllIIIIlllIIlIl) * 0.5);
        }
    }
    
    protected boolean IIllllIIIlIIIIIIllIl() {
        return this.llIllIIIIIllIlIIIIlI.lIIIIlIlIllllIIlIllI() == this;
    }
    
    @Override
    public void IIIlIIIlIlIIlllIIlll() {
        if (this.IlIlIIIllIllIIIIIllI > 0) {
            --this.IlIlIIIllIllIIIIIllI;
            if (this.IlIlIIIllIllIIIIIllI == 0) {
                this.llIllIIIIIllIlIIIIlI(false);
            }
        }
        if (this.IlIIIlIlIIIllIlIlIIl > 0) {
            --this.IlIIIlIlIIIllIlIlIIl;
        }
        this.llIllIlIIIIllIlIIllI = this.llIIlIIIlIIIllIlIIIl;
        if (this.IlIIIIIlIIllIIlIlIll) {
            if (this.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll != null && !this.llIllIIIIIllIlIIIIlI.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl()) {
                this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll((lIIllIIIllllIlllIllI)null);
            }
            if (this.llIIlIIIlIIIllIlIIIl == 0.0f) {
                this.llIllIIIIIllIlIIIIlI.IlIIlIlIIIlIIlIlIlII().llllIIIIlIIIlIlllIll(net.minecraft.client.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(new lIllllIllIllIIllllll("portal.trigger"), this.IlIIllIIllIIllIIlIIl.nextFloat() * 0.4f + 0.8f));
            }
            this.llIIlIIIlIIIllIlIIIl += 0.0125f;
            if (this.llIIlIIIlIIIllIlIIIl >= 1.0f) {
                this.llIIlIIIlIIIllIlIIIl = 1.0f;
            }
            this.IlIIIIIlIIllIIlIlIll = false;
        }
        else if (this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI) && this.IlIlIlIlIlllllllllIl(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI).IlIlIlIlIlllllllllIl() > 60) {
            this.llIIlIIIlIIIllIlIIIl += 0.006666667f;
            if (this.llIIlIIIlIIIllIlIIIl > 1.0f) {
                this.llIIlIIIlIIIllIlIIIl = 1.0f;
            }
        }
        else {
            if (this.llIIlIIIlIIIllIlIIIl > 0.0f) {
                this.llIIlIIIlIIIllIlIIIl -= 0.05f;
            }
            if (this.llIIlIIIlIIIllIlIIIl < 0.0f) {
                this.llIIlIIIlIIIllIlIIIl = 0.0f;
            }
        }
        if (this.lllllIIllIlIllIllllI > 0) {
            --this.lllllIIllIlIllIllllI;
        }
        final boolean llIllIIIIIllIlIIIIlI = this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI;
        final boolean ilIIIlIlIIIllIlIlIIl = this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl;
        final float n = 0.8f;
        final boolean b = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl >= n;
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        if (this.g() && !this.IIllIIIlIIIIlIIlIIII()) {
            final IIIIIIIllllIlIIIIIII ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl;
            ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll *= 0.2f;
            final IIIIIIIllllIlIIIIIII ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl;
            ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl *= 0.2f;
            this.IlIIIlIlIIIllIlIlIIl = 0;
        }
        this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl - this.IllIllIIIIlIIlIlllII * 0.35, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5, this.lllllIlIIIlIlIIlllII + this.IllIllIIIIlIIlIlllII * 0.35);
        this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl - this.IllIllIIIIlIIlIlllII * 0.35, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5, this.lllllIlIIIlIlIIlllII - this.IllIllIIIIlIIlIlllII * 0.35);
        this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl + this.IllIllIIIIlIIlIlllII * 0.35, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5, this.lllllIlIIIlIlIIlllII - this.IllIllIIIIlIIlIlllII * 0.35);
        this.llllIIIIlIIIlIlllIll(this.IIlllIlIIllIlIlIlIIl + this.IllIllIIIIlIIlIlllII * 0.35, this.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5, this.lllllIlIIIlIlIIlllII + this.IllIllIIIIlIIlIlllII * 0.35);
        final boolean b2 = this.aq().llllIIIIlIIIlIlllIll() > 6.0f || this.K.llIllIIIIIllIlIIIIlI;
        if (this.IIIIIllIIIIlIIIIllIl && !ilIIIlIlIIIllIlIlIIl && !b && this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl >= n && !this.IIIllIIllIIIIIIlIIlI() && b2 && !this.g() && !this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll)) {
            if (this.IlIIIlIlIIIllIlIlIIl <= 0 && !this.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll.lllllIIIIIlIlIIIIIIl.IlIIIlIlIIIllIlIlIIl()) {
                this.IlIIIlIlIIIllIlIlIIl = 7;
            }
            else {
                this.llIllIIIIIllIlIIIIlI(true);
            }
        }
        if ((!this.IIIllIIllIIIIIIlIIlI() && this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl >= n && b2 && !this.g() && !this.llllIIIIlIIIlIlllIll(net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.IIlllIIlIllIllIlIIll) && this.llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll.lllllIIIIIlIlIIIIIIl.IlIIIlIlIIIllIlIlIIl()) || Leaf.instance.modManager.toggleSprintMod.lIlIlIIIllIIllIIIllI()) {
            this.llIllIIIIIllIlIIIIlI(true);
        }
        if (this.IIIllIIllIIIIIIlIIlI() && (this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl < n || this.IIIIIIIIIlllIllIlIlI || !b2)) {
            this.llIllIIIIIllIlIIIIlI(false);
        }
        if (this.K.llIllIIIIIllIlIIIIlI) {
            if (this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI()) {
                if (!this.K.IlIlIlIlIlllllllllIl) {
                    this.K.IlIlIlIlIlllllllllIl = true;
                    this.llIIIlIlIllIIlIlIlII();
                }
            }
            else if (!llIllIIIIIllIlIIIIlI && this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                if (this.v == 0) {
                    if (Leaf.instance.modManager.toggleSprintMod.speedup) {
                        this.K.llllIIIIlIIIlIlllIll(0.1f);
                    }
                    else {
                        this.K.llllIIIIlIIIlIlllIll(0.05f);
                    }
                    this.v = 7;
                }
                else {
                    this.K.IlIlIlIlIlllllllllIl = !this.K.IlIlIlIlIlllllllllIl;
                    this.llIIIlIlIllIIlIlIlII();
                    this.v = 0;
                }
            }
        }
        if (this.K.IlIlIlIlIlllllllllIl && this.IIllllIIIlIIIIIIllIl()) {
            if (this.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
                this.llIIlllIIlllIIllIllI -= this.K.llllIIIIlIIIlIlllIll() * 3.0f;
            }
            if (this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                this.llIIlllIIlllIIllIllI += this.K.llllIIIIlIIIlIlllIll() * 3.0f;
            }
        }
        if (this.IIIllllllIllIIIlllIl()) {
            if (this.ac < 0) {
                ++this.ac;
                if (this.ac == 0) {
                    this.ad = 0.0f;
                }
            }
            if (llIllIIIIIllIlIIIIlI && !this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                this.ac = -10;
                this.lIllllllIIllIlIlIlII();
            }
            else if (!llIllIIIIIllIlIIIIlI && this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI) {
                this.ac = 0;
                this.ad = 0.0f;
            }
            else if (llIllIIIIIllIlIIIIlI) {
                ++this.ac;
                if (this.ac < 10) {
                    this.ad = this.ac * 0.1f;
                }
                else {
                    this.ad = 0.8f + 2.0f / (this.ac - 9) * 0.1f;
                }
            }
        }
        else {
            this.ad = 0.0f;
        }
        super.IIIlIIIlIlIIlllIIlll();
        if (this.IIIIIllIIIIlIIIIllIl && this.K.IlIlIlIlIlllllllllIl && !this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llIllIlIIIIllIlIIllI()) {
            this.K.IlIlIlIlIlllllllllIl = false;
            this.llIIIlIlIllIIlIlIlII();
        }
    }
}
