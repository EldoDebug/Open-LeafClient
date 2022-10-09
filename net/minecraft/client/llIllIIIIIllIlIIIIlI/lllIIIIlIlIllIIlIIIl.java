package net.minecraft.client.llIllIIIIIllIlIIIIlI;

import net.minecraft.client.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import org.lwjgl.input.*;

public abstract class lllIIIIlIlIllIIlIIIl
{
    protected final Minecraft llIllIIIIIllIlIIIIlI;
    protected int IlIIIlIlIIIllIlIlIIl;
    protected int IlIlIIIllIllIIIIIllI;
    protected int IllIIlllIIIIlllIIlIl;
    protected int llllIIIlIlllIlIIIIIl;
    protected int lIIIIlIIIIIlllIllIII;
    protected int lIIIlllIIIllIIIllIII;
    protected final int llIIlIIIlIIIllIlIIIl;
    private int llllIIIIlIIIlIlllIll;
    private int IlIlIlIlIlllllllllIl;
    protected int llIllIlIIIIllIlIIllI;
    protected int lIlIlIIIllIIllIIIllI;
    protected boolean IlIlIIIllIIllIlllllI;
    protected int IIIIlllIIIIIIlIIIlll;
    protected float llllIIllllIlIlIIIIll;
    protected float IlIllIlIlIIIlIlIlIII;
    protected int IIlllIIlIllIllIlIIll;
    protected long lllIIIIlllllIlIIllIl;
    protected boolean IlIlIIIIIIlllIlIllIl;
    protected boolean IIllIIllIIIlIlIIIIlI;
    protected boolean IIIlIIIlIlIIlllIIlll;
    protected int IlIlIIIlIIlIlIIlllIl;
    private boolean IlllllllIIIlIIIlIlII;
    
    public lllIIIIlIlIllIIlIIIl(final Minecraft llIllIIIIIllIlIIIIlI, final int n, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl, final int llIIlIIIlIIIllIlIIIl) {
        this.IlIlIIIllIIllIlllllI = true;
        this.IIIIlllIIIIIIlIIIlll = -2;
        this.IIlllIIlIllIllIlIIll = -1;
        this.IlIlIIIIIIlllIlIllIl = true;
        this.IIllIIllIIIlIlIIIIlI = true;
        this.IlllllllIIIlIIIlIlII = true;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = n;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIIIlllIIIllIIIllIII = 0;
        this.lIIIIlIIIIIlllIllIII = n;
    }
    
    public void IlIlIlIlIlllllllllIl(final int n, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl, final int llllIIIlIlllIlIIIIIl) {
        this.IlIIIlIlIIIllIlIlIIl = n;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIlllIIIllIIIllIII = 0;
        this.lIIIIlIIIIIlllIllIII = n;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean iIllIIllIIIlIlIIIIlI) {
        this.IIllIIllIIIlIlIIIIlI = iIllIIllIIIlIlIIIIlI;
    }
    
    protected void llllIIIIlIIIlIlllIll(final boolean iiIlIIIlIlIIlllIIlll, final int ilIlIIIlIIlIlIIlllIl) {
        this.IIIlIIIlIlIIlllIIlll = iiIlIIIlIlIIlllIIlll;
        this.IlIlIIIlIIlIlIIlllIl = ilIlIIIlIIlIlIIlllIl;
        if (!iiIlIIIlIlIIlllIIlll) {
            this.IlIlIIIlIIlIlIIlllIl = 0;
        }
    }
    
    protected abstract int llllIIIIlIIIlIlllIll();
    
    protected abstract void llllIIIIlIIIlIlllIll(final int p0, final boolean p1, final int p2, final int p3);
    
    protected abstract boolean llllIIIIlIIIlIlllIll(final int p0);
    
    protected int IllIIlllIIIIlllIIlIl() {
        return this.llllIIIIlIIIlIlllIll() * this.llIIlIIIlIIIllIlIIIl + this.IlIlIIIlIIlIlIIlllIl;
    }
    
    protected abstract void IlIlIlIlIlllllllllIl();
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
    }
    
    protected abstract void llllIIIIlIIIlIlllIll(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII) {
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    protected void IlIlIlIlIlllllllllIl(final int n, final int n2) {
    }
    
    public int llIllIIIIIllIlIIIIlI(final int n, final int n2) {
        final int n3 = this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl / 2 - this.m_() / 2;
        final int n4 = this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl / 2 + this.m_() / 2;
        final int n5 = n2 - this.IllIIlllIIIIlllIIlIl - this.IlIlIIIlIIlIlIIlllIl + (int)this.IlIllIlIlIIIlIlIlIII - 4;
        final int n6 = n5 / this.llIIlIIIlIIIllIlIIIl;
        return (n < this.llllIIIlIlllIlIIIIIl() && n >= n3 && n <= n4 && n6 >= 0 && n5 >= 0 && n6 < this.llllIIIIlIIIlIlllIll()) ? n6 : -1;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    protected void lIlIlIIIllIIllIIIllI() {
        this.IlIllIlIlIIIlIlIlIII = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, 0.0f, (float)this.IlIlIIIllIIllIlllllI());
    }
    
    public int IlIlIIIllIIllIlllllI() {
        return Math.max(0, this.IllIIlllIIIIlllIIlIl() - (this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl - 4));
    }
    
    public int IIIIlllIIIIIIlIIIlll() {
        return (int)this.IlIllIlIlIIIlIlIlIII;
    }
    
    public boolean IllIIlllIIIIlllIIlIl(final int n) {
        return n >= this.IllIIlllIIIIlllIIlIl && n <= this.llllIIIlIlllIlIIIIIl && this.llIllIlIIIIllIlIIllI >= this.lIIIlllIIIllIIIllIII && this.llIllIlIIIIllIlIIllI <= this.lIIIIlIIIIIlllIllIII;
    }
    
    public void llllIIIlIlllIlIIIIIl(final int n) {
        this.IlIllIlIlIIIlIlIlIII += n;
        this.lIlIlIIIllIIllIIIllI();
        this.IIIIlllIIIIIIlIIIlll = -2;
    }
    
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.lIlIlIIIllIIllIIIllI) {
            if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == this.llllIIIIlIIIlIlllIll) {
                this.IlIllIlIlIIIlIlIlIII -= this.llIIlIIIlIIIllIlIIIl * 2 / 3;
                this.IIIIlllIIIIIIlIIIlll = -2;
                this.lIlIlIIIllIIllIIIllI();
            }
            else if (ilIIIlIlIIIllIlIlIIl.llIllIlIIIIllIlIIllI == this.IlIlIlIlIlllllllllIl) {
                this.IlIllIlIlIIIlIlIlIII += this.llIIlIIIlIIIllIlIIIl * 2 / 3;
                this.IIIIlllIIIIIIlIIIlll = -2;
                this.lIlIlIIIllIIllIIIllI();
            }
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final int llIllIlIIIIllIlIIllI, final int lIlIlIIIllIIllIIIllI, final float n) {
        if (this.IlIlIIIIIIlllIlIllIl) {
            this.llIllIlIIIIllIlIIllI = llIllIlIIIIllIlIIllI;
            this.lIlIlIIIllIIllIIIllI = lIlIlIIIllIIllIIIllI;
            this.IlIlIlIlIlllllllllIl();
            final int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl();
            final int n2 = llllIIIlIlllIlIIIIIl + 6;
            this.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.IllIIlllIIIIlllIIlIl();
            lllllIlIIIlIlIIlllII.IIIIlllIIIIIIlIIIlll();
            final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
            final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            final int n3 = this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl / 2 - this.m_() / 2 + 2;
            final int n4 = this.IllIIlllIIIIlllIIlIl + 4 - (int)this.IlIllIlIlIIIlIlIlIII;
            if (this.IIIlIIIlIlIIlllIIlll) {
                this.llllIIIIlIIIlIlllIll(n3, n4, llllIIIIlIIIlIlllIll);
            }
            this.llllIIIIlIIIlIlllIll(n3, n4, llIllIlIIIIllIlIIllI, lIlIlIIIllIIllIIIllI);
            lllllIlIIIlIlIIlllII.lIIIlllIIIllIIIllIII();
            final int n5 = 4;
            this.llIllIIIIIllIlIIIIlI(0, this.IllIIlllIIIIlllIIlIl, 255, 255);
            this.llIllIIIIIllIlIIIIlI(this.llllIIIlIlllIlIIIIIl, this.IlIlIIIllIllIIIIIllI, 255, 255);
            lllllIlIIIlIlIIlllII.lIlIlIIIllIIllIIIllI();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(770, 771, 0, 1);
            lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7425);
            lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, this.IllIIlllIIIIlllIIlIl + n5, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl + n5, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, this.IllIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, this.llllIIIlIlllIlIIIIIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.llllIIIlIlllIlIIIIIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.llllIIIlIlllIlIIIIIl - n5, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 0).IlIlIIIllIllIIIIIllI();
            llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, this.llllIIIlIlllIlIIIIIl - n5, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 0).IlIlIIIllIllIIIIIllI();
            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            final int ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI();
            if (ilIlIIIllIIllIlllllI > 0) {
                final int llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl) * (this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl) / this.IllIIlllIIIIlllIIlIl(), 32, this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl - 8);
                int illIIlllIIIIlllIIlIl = (int)this.IlIllIlIlIIIlIlIlIII * (this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl - llllIIIIlIIIlIlllIll2) / ilIlIIIllIIllIlllllI + this.IllIIlllIIIIlllIIlIl;
                if (illIIlllIIIIlllIIlIl < this.IllIIlllIIIIlllIIlIl) {
                    illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl;
                }
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, this.llllIIIlIlllIlIIIIIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, this.llllIIIlIlllIlIIIIIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, this.IllIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, this.IllIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, illIIlllIIIIlllIIlIl + llllIIIIlIIIlIlllIll2, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, illIIlllIIIIlllIIlIl + llllIIIIlIIIlIlllIll2, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2, illIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, illIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, illIIlllIIIIlllIIlIl + llllIIIIlIIIlIlllIll2 - 1, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(192, 192, 192, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2 - 1, illIIlllIIIIlllIIlIl + llllIIIIlIIIlIlllIll2 - 1, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(192, 192, 192, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n2 - 1, illIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(192, 192, 192, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl, illIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(192, 192, 192, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
            }
            this.IlIlIlIlIlllllllllIl(llIllIlIIIIllIlIIllI, lIlIlIIIllIIllIIIllI);
            lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            lllllIlIIIlIlIIlllII.llIIlIIIlIIIllIlIIIl(7424);
            lllllIlIIIlIlIIlllII.IlIIIlIlIIIllIlIlIIl();
            lllllIlIIIlIlIIlllII.llIllIlIIIIllIlIIllI();
        }
    }
    
    public void lIIIIlIIIIIlllIllIII() {
        if (this.IllIIlllIIIIlllIIlIl(this.lIlIlIIIllIIllIIIllI)) {
            if (Mouse.getEventButton() == 0 && Mouse.getEventButtonState() && this.lIlIlIIIllIIllIIIllI >= this.IllIIlllIIIIlllIIlIl && this.lIlIlIIIllIIllIIIllI <= this.llllIIIlIlllIlIIIIIl) {
                final int n = (this.IlIIIlIlIIIllIlIlIIl - this.m_()) / 2;
                final int n2 = (this.IlIIIlIlIIIllIlIlIIl + this.m_()) / 2;
                final int n3 = this.lIlIlIIIllIIllIIIllI - this.IllIIlllIIIIlllIIlIl - this.IlIlIIIlIIlIlIIlllIl + (int)this.IlIllIlIlIIIlIlIlIII - 4;
                final int iIlllIIlIllIllIlIIll = n3 / this.llIIlIIIlIIIllIlIIIl;
                if (iIlllIIlIllIllIlIIll < this.llllIIIIlIIIlIlllIll() && this.llIllIlIIIIllIlIIllI >= n && this.llIllIlIIIIllIlIIllI <= n2 && iIlllIIlIllIllIlIIll >= 0 && n3 >= 0) {
                    this.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll, false, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI);
                    this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll;
                }
                else if (this.llIllIlIIIIllIlIIllI >= n && this.llIllIlIIIIllIlIIllI <= n2 && n3 < 0) {
                    this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI - n, this.lIlIlIIIllIIllIIIllI - this.IllIIlllIIIIlllIIlIl + (int)this.IlIllIlIlIIIlIlIlIII - 4);
                }
            }
            if (Mouse.isButtonDown(0) && this.llllIIllllIlIlIIIIll()) {
                if (this.IIIIlllIIIIIIlIIIlll != -1) {
                    if (this.IIIIlllIIIIIIlIIIlll >= 0) {
                        this.IlIllIlIlIIIlIlIlIII -= (this.lIlIlIIIllIIllIIIllI - this.IIIIlllIIIIIIlIIIlll) * this.llllIIllllIlIlIIIIll;
                        this.IIIIlllIIIIIIlIIIlll = this.lIlIlIIIllIIllIIIllI;
                    }
                }
                else {
                    boolean b = true;
                    if (this.lIlIlIIIllIIllIIIllI >= this.IllIIlllIIIIlllIIlIl && this.lIlIlIIIllIIllIIIllI <= this.llllIIIlIlllIlIIIIIl) {
                        final int n4 = (this.IlIIIlIlIIIllIlIlIIl - this.m_()) / 2;
                        final int n5 = (this.IlIIIlIlIIIllIlIlIIl + this.m_()) / 2;
                        final int n6 = this.lIlIlIIIllIIllIIIllI - this.IllIIlllIIIIlllIIlIl - this.IlIlIIIlIIlIlIIlllIl + (int)this.IlIllIlIlIIIlIlIlIII - 4;
                        final int iIlllIIlIllIllIlIIll2 = n6 / this.llIIlIIIlIIIllIlIIIl;
                        if (iIlllIIlIllIllIlIIll2 < this.llllIIIIlIIIlIlllIll() && this.llIllIlIIIIllIlIIllI >= n4 && this.llIllIlIIIIllIlIIllI <= n5 && iIlllIIlIllIllIlIIll2 >= 0 && n6 >= 0) {
                            this.llllIIIIlIIIlIlllIll(iIlllIIlIllIllIlIIll2, iIlllIIlIllIllIlIIll2 == this.IIlllIIlIllIllIlIIll && Minecraft.IIIllllllIllIIIlllIl() - this.lllIIIIlllllIlIIllIl < 250L, this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI);
                            this.IIlllIIlIllIllIlIIll = iIlllIIlIllIllIlIIll2;
                            this.lllIIIIlllllIlIIllIl = Minecraft.IIIllllllIllIIIlllIl();
                        }
                        else if (this.llIllIlIIIIllIlIIllI >= n4 && this.llIllIlIIIIllIlIIllI <= n5 && n6 < 0) {
                            this.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI - n4, this.lIlIlIIIllIIllIIIllI - this.IllIIlllIIIIlllIIlIl + (int)this.IlIllIlIlIIIlIlIlIII - 4);
                            b = false;
                        }
                        final int llllIIIlIlllIlIIIIIl = this.llllIIIlIlllIlIIIIIl();
                        final int n7 = llllIIIlIlllIlIIIIIl + 6;
                        if (this.llIllIlIIIIllIlIIllI >= llllIIIlIlllIlIIIIIl && this.llIllIlIIIIllIlIIllI <= n7) {
                            this.llllIIllllIlIlIIIIll = -1.0f;
                            int ilIlIIIllIIllIlllllI = this.IlIlIIIllIIllIlllllI();
                            if (ilIlIIIllIIllIlllllI < 1) {
                                ilIlIIIllIIllIlllllI = 1;
                            }
                            this.llllIIllllIlIlIIIIll /= (this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl - llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((int)((this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl) * (this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl) / (float)this.IllIIlllIIIIlllIIlIl()), 32, this.llllIIIlIlllIlIIIIIl - this.IllIIlllIIIIlllIIlIl - 8)) / (float)ilIlIIIllIIllIlllllI;
                        }
                        else {
                            this.llllIIllllIlIlIIIIll = 1.0f;
                        }
                        if (b) {
                            this.IIIIlllIIIIIIlIIIlll = this.lIlIlIIIllIIllIIIllI;
                        }
                        else {
                            this.IIIIlllIIIIIIlIIIlll = -2;
                        }
                    }
                    else {
                        this.IIIIlllIIIIIIlIIIlll = -2;
                    }
                }
            }
            else {
                this.IIIIlllIIIIIIlIIIlll = -1;
            }
            int eventDWheel = Mouse.getEventDWheel();
            if (eventDWheel != 0) {
                if (eventDWheel > 0) {
                    eventDWheel = -1;
                }
                else if (eventDWheel < 0) {
                    eventDWheel = 1;
                }
                this.IlIllIlIlIIIlIlIlIII += eventDWheel * this.llIIlIIIlIIIllIlIIIl / 2;
            }
        }
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean illlllllIIIlIIIlIlII) {
        this.IlllllllIIIlIIIlIlII = illlllllIIIlIIIlIlII;
    }
    
    public boolean llllIIllllIlIlIIIIll() {
        return this.IlllllllIIIlIIIlIlII;
    }
    
    public int m_() {
        return 220;
    }
    
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll();
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll2 = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI();
        for (int i = 0; i < llllIIIIlIIIlIlllIll; ++i) {
            final int n5 = n2 + i * this.llIIlIIIlIIIllIlIIIl + this.IlIlIIIlIIlIlIIlllIl;
            final int n6 = this.llIIlIIIlIIIllIlIIIl - 4;
            if (n5 > this.llllIIIlIlllIlIIIIIl || n5 + n6 < this.IllIIlllIIIIlllIIlIl) {
                this.llllIIIIlIIIlIlllIll(i, n, n5);
            }
            if (this.IIllIIllIIIlIlIIIIlI && this.llllIIIIlIIIlIlllIll(i)) {
                final int n7 = this.lIIIlllIIIllIIIllIII + (this.IlIIIlIlIIIllIlIlIIl / 2 - this.m_() / 2);
                final int n8 = this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl / 2 + this.m_() / 2;
                lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
                lllllIlIIIlIlIIlllII.IlIlIIIlIIlIlIIlllIl();
                llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n7, n5 + n6 + 2, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n8, n5 + n6 + 2, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n8, n5 - 2, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n7, n5 - 2, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(128, 128, 128, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n7 + 1, n5 + n6 + 1, 0.0).llllIIIIlIIIlIlllIll(0.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n8 - 1, n5 + n6 + 1, 0.0).llllIIIIlIIIlIlllIll(1.0, 1.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n8 - 1, n5 - 1, 0.0).llllIIIIlIIIlIlllIll(1.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(n7 + 1, n5 - 1, 0.0).llllIIIIlIIIlIlllIll(0.0, 0.0).IlIlIlIlIlllllllllIl(0, 0, 0, 255).IlIlIIIllIllIIIIIllI();
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl();
                lllllIlIIIlIlIIlllII.IIIlIIIlIlIIlllIIlll();
            }
            if (!(this instanceof llllIllllIllllIlIlII) || (n5 >= this.IllIIlllIIIIlllIIlIl - this.llIIlIIIlIIIllIlIIIl && n5 <= this.llllIIIlIlllIlIIIIIl)) {
                this.llllIIIIlIIIlIlllIll(i, n, n5, n6, n3, n4);
            }
        }
    }
    
    protected int llllIIIlIlllIlIIIIIl() {
        return this.IlIIIlIlIIIllIlIlIIl / 2 + 124;
    }
    
    protected void llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3, final int n4) {
        final IIlllIIlllIIIlIlllII llllIIIIlIIIlIlllIll = IIlllIIlllIIIlIlllII.llllIIIIlIIIlIlllIll();
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
        this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, n2, 0.0).llllIIIIlIIIlIlllIll(0.0, n2 / 32.0f).IlIlIlIlIlllllllllIl(64, 64, 64, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl, n2, 0.0).llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl / 32.0f, n2 / 32.0f).IlIlIlIlIlllllllllIl(64, 64, 64, n4).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl, n, 0.0).llllIIIIlIIIlIlllIll(this.IlIIIlIlIIIllIlIlIIl / 32.0f, n / 32.0f).IlIlIlIlIlllllllllIl(64, 64, 64, n3).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, n, 0.0).llllIIIIlIIIlIlllIll(0.0, n / 32.0f).IlIlIlIlIlllllllllIl(64, 64, 64, n3).IlIlIIIllIllIIIIIllI();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
    }
    
    public void lIIIIlIIIIIlllIllIII(final int liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.lIIIIlIIIIIlllIllIII = liiIlllIIIllIIIllIII + this.IlIIIlIlIIIllIlIlIIl;
    }
    
    public int IlIllIlIlIIIlIlIlIII() {
        return this.llIIlIIIlIIIllIlIIIl;
    }
    
    protected void llllIIIIlIIIlIlllIll(final IIlllIIlllIIIlIlllII illlIIlllIIIlIlllII) {
        final lIIllIIIllllIlllIllI llIllIIIIIllIlIIIIlI = illlIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI();
        this.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.client.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll);
        lllllIlIIIlIlIIlllII.llIllIIIIIllIlIIIIlI(1.0f, 1.0f, 1.0f, 1.0f);
        final float n = 32.0f;
        llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(7, net.minecraft.client.lIIIlllIIIllIIIllIII.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI);
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, this.llllIIIlIlllIlIIIIIl, 0.0).llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII / n, (this.llllIIIlIlllIlIIIIIl + (int)this.IlIllIlIlIIIlIlIlIII) / n).IlIlIlIlIlllllllllIl(32, 32, 32, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.llllIIIlIlllIlIIIIIl, 0.0).llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII / n, (this.llllIIIlIlllIlIIIIIl + (int)this.IlIllIlIlIIIlIlIlIII) / n).IlIlIlIlIlllllllllIl(32, 32, 32, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII, this.IllIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII / n, (this.IllIIlllIIIIlllIIlIl + (int)this.IlIllIlIlIIIlIlIlIII) / n).IlIlIlIlIlllllllllIl(32, 32, 32, 255).IlIlIIIllIllIIIIIllI();
        llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this.lIIIlllIIIllIIIllIII, this.IllIIlllIIIIlllIIlIl, 0.0).llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII / n, (this.IllIIlllIIIIlllIIlIl + (int)this.IlIllIlIlIIIlIlIlIII) / n).IlIlIlIlIlllllllllIl(32, 32, 32, 255).IlIlIIIllIllIIIIIllI();
        illlIIlllIIIlIlllII.IlIlIlIlIlllllllllIl();
    }
}
