package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;

public class lIllllllIIllIlIlIlII extends IllIIlllIIIIlllIIlIl
{
    public IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    public IIlIIIIIllIlIIIlIIll IlIlIlIlIlllllllllIl;
    public IIlIIIIIllIlIIIlIIll llIllIIIIIllIlIIIIlI;
    public IIlIIIIIllIlIIIlIIll IlIIIlIlIIIllIlIlIIl;
    public IIlIIIIIllIlIIIlIIll IlIlIIIlIIlIlIIlllIl;
    private IIlIIIIIllIlIIIlIIll IlllllllIIIlIIIlIlII;
    private IIlIIIIIllIlIIIlIIll IIlIIIIlllIlllllIlII;
    private boolean IIIlIIlIIIIlllIlllII;
    
    public lIllllllIIllIlIlIlII(final float n, final boolean iiIlIIlIIIIlllIlllII) {
        super(n, 0.0f, 64, 64);
        this.IIIlIIlIIIIlllIlllII = iiIlIIlIIIIlllIlllII;
        (this.IIlIIIIlllIlllllIlII = new IIlIIIIIllIlIIIlIIll(this, 24, 0)).llllIIIIlIIIlIlllIll(-3.0f, -6.0f, -1.0f, 6, 6, 1, n);
        (this.IlllllllIIIlIIIlIlII = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).IlIlIlIlIlllllllllIl(64, 32);
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(-5.0f, 0.0f, -1.0f, 10, 16, 1, n);
        if (iiIlIIlIIIIlllIlllII) {
            (this.llllIIllllIlIlIIIIll = new IIlIIIIIllIlIIIlIIll(this, 32, 48)).llllIIIIlIIIlIlllIll(-1.0f, -2.0f, -2.0f, 3, 12, 4, n);
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(5.0f, 2.5f, 0.0f);
            (this.IIIIlllIIIIIIlIIIlll = new IIlIIIIIllIlIIIlIIll(this, 40, 16)).llllIIIIlIIIlIlllIll(-2.0f, -2.0f, -2.0f, 3, 12, 4, n);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(-5.0f, 2.5f, 0.0f);
            (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 48, 48)).llllIIIIlIIIlIlllIll(-1.0f, -2.0f, -2.0f, 3, 12, 4, n + 0.25f);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(5.0f, 2.5f, 0.0f);
            (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 40, 32)).llllIIIIlIIIlIlllIll(-2.0f, -2.0f, -2.0f, 3, 12, 4, n + 0.25f);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-5.0f, 2.5f, 10.0f);
        }
        else {
            (this.llllIIllllIlIlIIIIll = new IIlIIIIIllIlIIIlIIll(this, 32, 48)).llllIIIIlIIIlIlllIll(-1.0f, -2.0f, -2.0f, 4, 12, 4, n);
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(5.0f, 2.0f, 0.0f);
            (this.llllIIIIlIIIlIlllIll = new IIlIIIIIllIlIIIlIIll(this, 48, 48)).llllIIIIlIIIlIlllIll(-1.0f, -2.0f, -2.0f, 4, 12, 4, n + 0.25f);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(5.0f, 2.0f, 0.0f);
            (this.IlIlIlIlIlllllllllIl = new IIlIIIIIllIlIIIlIIll(this, 40, 32)).llllIIIIlIIIlIlllIll(-3.0f, -2.0f, -2.0f, 4, 12, 4, n + 0.25f);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-5.0f, 2.0f, 10.0f);
        }
        (this.IIlllIIlIllIllIlIIll = new IIlIIIIIllIlIIIlIIll(this, 16, 48)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, n);
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(1.9f, 12.0f, 0.0f);
        (this.llIllIIIIIllIlIIIIlI = new IIlIIIIIllIlIIIlIIll(this, 0, 48)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, n + 0.25f);
        this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(1.9f, 12.0f, 0.0f);
        (this.IlIIIlIlIIIllIlIlIIl = new IIlIIIIIllIlIIIlIIll(this, 0, 32)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, n + 0.25f);
        this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(-1.9f, 12.0f, 0.0f);
        (this.IlIlIIIlIIlIlIIlllIl = new IIlIIIIIllIlIIIlIIll(this, 16, 32)).llllIIIIlIIIlIlllIll(-4.0f, 0.0f, -2.0f, 8, 12, 4, n + 0.25f);
        this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        super.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, n2, n3, n4, n5, n6);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        if (this.llllIIIlIlllIlIIIIIl) {
            final float n7 = 2.0f;
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / n7, 1.0f / n7, 1.0f / n7);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 24.0f * n6, 0.0f);
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n6);
        }
        else {
            if (llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.2f, 0.0f);
            }
            this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(n6);
            this.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(n6);
            this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(n6);
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    public void IlIlIlIlIlllllllllIl(final float n) {
        net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.IIlIIIIlllIlllllIlII);
        this.IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI = 0.0f;
        this.IIlIIIIlllIlllllIlII.IlIIIlIlIIIllIlIlIIl = 0.0f;
        this.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll(n);
    }
    
    public void llIllIIIIIllIlIIIIlI(final float n) {
        this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IIlllIIlIllIllIlIIll, this.llIllIIIIIllIlIIIIlI);
        net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII, this.IlIIIlIlIIIllIlIlIIl);
        net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llllIIllllIlIlIIIIll, this.llllIIIIlIIIlIlllIll);
        net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IIIIlllIIIIIIlIIIlll, this.IlIlIlIlIlllllllllIl);
        net.minecraft.client.IlIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI, this.IlIlIIIlIIlIlIIlllIl);
    }
    
    public void llllIIIIlIIIlIlllIll() {
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(0.0625f);
        this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0625f);
    }
    
    public void IlIlIlIlIlllllllllIl() {
        this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(0.0625f);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0.0625f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final boolean llIIlIIIlIIIllIlIIIl) {
        super.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl);
        this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIIIlIlIIIllIlIlIIl.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIlIIIlIIlIlIIlllIl.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlllllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IIlIIIIlllIlllllIlII.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n) {
        if (this.IIIlIIlIIIIlllIlllII) {
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
            ++iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI;
            this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(n);
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll2 = this.IIIIlllIIIIIIlIIIlll;
            --iiiIlllIIIIIIlIIIlll2.llIllIIIIIllIlIIIIlI;
        }
        else {
            this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(n);
        }
    }
}
