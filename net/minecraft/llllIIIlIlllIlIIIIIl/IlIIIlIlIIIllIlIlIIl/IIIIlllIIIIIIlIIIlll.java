package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public abstract class IIIIlllIIIIIIlIIIlll extends llIllIlIIIIllIlIIllI implements net.minecraft.IIIlIIlIIIIlllIlllII.IIIIlllIIIIIIlIIIlll
{
    private lllIIIIlIlIllIIlIIIl[] llllIIIIlIIIlIlllIll;
    private boolean IlIlIlIlIlllllllllIl;
    
    public IIIIlllIIIIIIlIIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl[36];
        this.IlIlIlIlIlllllllllIl = true;
    }
    
    public IIIIlllIIIIIIlIIIlll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final double n, final double n2, final double n3) {
        super(illlllllIIIlIIIlIlII, n, n2, n3);
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl[36];
        this.IlIlIlIlIlllllllllIl = true;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII) {
        super.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII);
        if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
            net.minecraft.llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, this, this);
        }
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI(final int n) {
        return this.llllIIIIlIIIlIlllIll[n];
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl(final int n, final int n2) {
        if (this.llllIIIIlIIIlIlllIll[n] == null) {
            return null;
        }
        if (this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl <= n2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIIlIIIlIlllIll[n];
            this.llllIIIIlIIIlIlllIll[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll[n].llllIIIIlIIIlIlllIll(n2);
        if (this.llllIIIIlIIIlIlllIll[n].IlIlIlIlIlllllllllIl == 0) {
            this.llllIIIIlIIIlIlllIll[n] = null;
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIIIllIIllIlllllI(final int n) {
        if (this.llllIIIIlIIIlIlllIll[n] != null) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = this.llllIIIIlIIIlIlllIll[n];
            this.llllIIIIlIIIlIlllIll[n] = null;
            return lllIIIIlIlIllIIlIIIl;
        }
        return null;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll[n] = lllIIIIlIlIllIIlIIIl;
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl > this.lllllIlIIIlIlIIlllII()) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = this.lllllIlIIIlIlIIlllII();
        }
    }
    
    @Override
    public void llIIIlIlIllIIlIlIlII() {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return !this.IIlIlIlIIlIllIIIIIIl && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this) <= 64.0;
    }
    
    @Override
    public void IlIlIIIllIllIIIIIllI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public void IllIIlllIIIIlllIIlIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final int n, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return true;
    }
    
    @Override
    public String s_() {
        return this.w_() ? this.lIllIlIIIllllllIIlII() : "container.minecart";
    }
    
    @Override
    public int lllllIlIIIlIlIIlllII() {
        return 64;
    }
    
    @Override
    public void lIIIlllIIIllIIIllIII(final int n) {
        this.IlIlIlIlIlllllllllIl = false;
        super.lIIIlllIIIllIIIllIII(n);
    }
    
    @Override
    public void IllIllIIIIlIIlIlllII() {
        if (this.IlIlIlIlIlllllllllIl) {
            net.minecraft.llIIlIIIlIIIllIlIIIl.llllllIllIllIlIllllI.llllIIIIlIIIlIlllIll(this.IlllllllIIIlIIIlIlII, this, this);
        }
        super.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            if (this.llllIIIIlIIIlIlllIll[i] != null) {
                final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Slot", (byte)i);
                this.llllIIIIlIIIlIlllIll[i].IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll2);
            }
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Items", ilIlIIIlIIlIlIIlllIl);
    }
    
    @Override
    protected void IlIlIlIlIlllllllllIl(final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        final IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Items", 10);
        this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl[this.lIIIlllIIIllIIIllIII()];
        for (int i = 0; i < llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); ++i) {
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll ilIlIlIlIlllllllllIl = llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i);
            final int n = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl("Slot") & 0xFF;
            if (n >= 0 && n < this.llllIIIIlIIIlIlllIll.length) {
                this.llllIIIIlIIIlIlllIll[n] = lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    @Override
    public boolean a_(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llIIIlIlIllIIlIlIlII)this);
        }
        return true;
    }
    
    @Override
    protected void IlIllIlIlIIIlIlIlIII() {
        final float n = 0.98f + (15 - net.minecraft.llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(this)) * 0.001f;
        this.lIllllllIIllIlIlIlII *= n;
        this.llIIlllIIlllIIllIllI *= 0.0;
        this.IIlllIIIlIlllIIlllII *= n;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final int n) {
        return 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI() {
        return 0;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl() {
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll) {
    }
    
    @Override
    public IIlllIIlIllIllIlIIll u_() {
        return IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void lIllllllIIllIlIlIlII() {
        for (int i = 0; i < this.llllIIIIlIIIlIlllIll.length; ++i) {
            this.llllIIIIlIIIlIlllIll[i] = null;
        }
    }
}
