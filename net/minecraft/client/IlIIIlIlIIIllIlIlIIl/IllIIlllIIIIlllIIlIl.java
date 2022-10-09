package net.minecraft.client.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.client.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IllIIlllIIIIlllIIlIl extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll llIllIlIIIIllIlIIllI;
    public IIlIIIIIllIlIIIlIIll lIlIlIIIllIIllIIIllI;
    public IIlIIIIIllIlIIIlIIll IlIlIIIllIIllIlllllI;
    public IIlIIIIIllIlIIIlIIll IIIIlllIIIIIIlIIIlll;
    public IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll;
    public IIlIIIIIllIlIIIlIIll IlIllIlIlIIIlIlIlIII;
    public IIlIIIIIllIlIIIlIIll IIlllIIlIllIllIlIIll;
    public int lllIIIIlllllIlIIllIl;
    public int IlIlIIIIIIlllIlIllIl;
    public boolean IIllIIllIIIlIlIIIIlI;
    public boolean IIIlIIIlIlIIlllIIlll;
    
    public IllIIlllIIIIlllIIlIl() {
        this(0.0f);
    }
    
    public IllIIlllIIIIlllIIlIl(final float n) {
        this(n, 0.0f, 64, 32);
    }
    
    public IllIIlllIIIIlllIIlIl(final float n, final float n2, final int liiIlllIIIllIIIllIII, final int llIIlIIIlIIIllIlIIIl) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
        this.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        (this.llIllIlIIIIllIlIIllI = new IIlIIIIIllIlIIIlIIll(this, 0, 0)).llllIIIIlIIIlIlllIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, n);
        this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n2, 0.0f);
        (this.lIlIlIIIllIIllIIIllI = new IIlIIIIIllIlIIIlIIll(this, 32, 0)).llllIIIIlIIIlIlllIll(-4.0f, -8.0f, -4.0f, 8, 8, 8, n + 0.5f);
        this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n2, 0.0f);
        (this.IlIlIIIllIIllIlllllI = new IIlIIIIIllIlIIIlIIll(this, 16, 16)).llllIIIIlIIIlIlllIll(-4.0f, 0.0f, -2.0f, 8, 12, 4, n);
        this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(0.0f, 0.0f + n2, 0.0f);
        (this.IIIIlllIIIIIIlIIIlll = new IIlIIIIIllIlIIIlIIll(this, 40, 16)).llllIIIIlIIIlIlllIll(-3.0f, -2.0f, -2.0f, 4, 12, 4, n);
        this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(-5.0f, 2.0f + n2, 0.0f);
        this.llllIIllllIlIlIIIIll = new IIlIIIIIllIlIIIlIIll(this, 40, 16);
        this.llllIIllllIlIlIIIIll.lIIIlllIIIllIIIllIII = true;
        this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(-1.0f, -2.0f, -2.0f, 4, 12, 4, n);
        this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(5.0f, 2.0f + n2, 0.0f);
        (this.IlIllIlIlIIIlIlIlIII = new IIlIIIIIllIlIIIlIIll(this, 0, 16)).llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, n);
        this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(-1.9f, 12.0f + n2, 0.0f);
        this.IIlllIIlIllIllIlIIll = new IIlIIIIIllIlIIIlIIll(this, 0, 16);
        this.IIlllIIlIllIllIlIIll.lIIIlllIIIllIIIllIII = true;
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(-2.0f, 0.0f, -2.0f, 4, 12, 4, n);
        this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(1.9f, 12.0f + n2, 0.0f);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.llllIIIIlIIIlIlllIll(n, n2, n3, n4, n5, n6, llIllIIIIIllIlIIIIlI);
        lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
        if (this.llllIIIlIlllIlIIIIIl) {
            final float n7 = 2.0f;
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.5f / n7, 1.5f / n7, 1.5f / n7);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 16.0f * n6, 0.0f);
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
            lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
            lllllIlIIIlIlIIlllII.lllllIlIIIlIlIIlllII();
            lllllIlIIIlIlIIlllII.llllIIIIlIIIlIlllIll(1.0f / n7, 1.0f / n7, 1.0f / n7);
            lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 24.0f * n6, 0.0f);
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(n6);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(n6);
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(n6);
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(n6);
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(n6);
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
        }
        else {
            if (llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
                lllllIlIIIlIlIIlllII.IlIlIlIlIlllllllllIl(0.0f, 0.2f, 0.0f);
            }
            this.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(n6);
            this.IlIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll(n6);
            this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(n6);
            this.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll(n6);
            this.IlIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(n6);
            this.IIlllIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(n6);
            this.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(n6);
        }
        lllllIlIIIlIlIIlllII.lIllllllIIllIlIlIlII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl = n4 / 57.295776f;
        this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl = n5 / 57.295776f;
        this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f + 3.1415927f) * 2.0f * n2 * 0.5f;
        this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f) * 2.0f * n2 * 0.5f;
        this.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII = 0.0f;
        this.llllIIllllIlIlIIIIll.lIIIIlIIIIIlllIllIII = 0.0f;
        this.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f) * 1.4f * n2;
        this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n * 0.6662f + 3.1415927f) * 1.4f * n2;
        this.IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl = 0.0f;
        this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl = 0.0f;
        if (this.IllIIlllIIIIlllIIlIl) {
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll = this.IIIIlllIIIIIIlIIIlll;
            iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl -= 0.62831855f;
            final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll;
            llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl -= 0.62831855f;
            this.IlIllIlIlIIIlIlIlIII.IllIIlllIIIIlllIIlIl = -1.2566371f;
            this.IIlllIIlIllIllIlIIll.IllIIlllIIIIlllIIlIl = -1.2566371f;
            this.IlIllIlIlIIIlIlIlIII.llllIIIlIlllIlIIIIIl = 0.31415927f;
            this.IIlllIIlIllIllIlIIll.llllIIIlIlllIlIIIIIl = -0.31415927f;
        }
        if (this.lllIIIIlllllIlIIllIl != 0) {
            this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl = this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl * 0.5f - 0.31415927f * this.lllIIIIlllllIlIIllIl;
        }
        this.IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl = 0.0f;
        this.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII = 0.0f;
        switch (this.IlIlIIIIIIlllIlIllIl) {
            case 1: {
                this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl * 0.5f - 0.31415927f * this.IlIlIIIIIIlllIlIllIl;
                break;
            }
            case 3: {
                this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl * 0.5f - 0.31415927f * this.IlIlIIIIIIlllIlIllIl;
                this.IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl = -0.5235988f;
                break;
            }
        }
        this.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl = 0.0f;
        if (this.IlIlIIIllIllIIIIIllI > -9990.0f) {
            this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI) * 3.1415927f * 2.0f) * 0.2f;
            this.IIIIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl) * 5.0f;
            this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI = -llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl) * 5.0f;
            this.llllIIllllIlIlIIIIll.IlIlIIIllIllIIIIIllI = -llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl) * 5.0f;
            this.llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl) * 5.0f;
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll2 = this.IIIIlllIIIIIIlIIIlll;
            iiiIlllIIIIIIlIIIlll2.llllIIIlIlllIlIIIIIl += this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl;
            final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll2 = this.llllIIllllIlIlIIIIll;
            llllIIllllIlIlIIIIll2.llllIIIlIlllIlIIIIIl += this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl;
            final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll3 = this.llllIIllllIlIlIIIIll;
            llllIIllllIlIlIIIIll3.IllIIlllIIIIlllIIlIl += this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl;
            final float n7 = 1.0f - this.IlIlIIIllIllIIIIIllI;
            final float n8 = n7 * n7;
            this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl -= (float)(llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((1.0f - n8 * n8) * 3.1415927f) * 1.2 + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI * 3.1415927f) * -(this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl - 0.7f) * 0.75f);
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll3 = this.IIIIlllIIIIIIlIIIlll;
            iiiIlllIIIIIIlIIIlll3.llllIIIlIlllIlIIIIIl += this.IlIlIIIllIIllIlllllI.llllIIIlIlllIlIIIIIl * 2.0f;
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll4 = this.IIIIlllIIIIIIlIIIlll;
            iiiIlllIIIIIIlIIIlll4.lIIIIlIIIIIlllIllIII += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIllIIIIIllI * 3.1415927f) * -0.4f;
        }
        if (this.IIllIIllIIIlIlIIIIlI) {
            this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl = 0.5f;
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll5 = this.IIIIlllIIIIIIlIIIlll;
            iiiIlllIIIIIIlIIIlll5.IllIIlllIIIIlllIIlIl += 0.4f;
            final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll4 = this.llllIIllllIlIlIIIIll;
            llllIIllllIlIlIIIIll4.IllIIlllIIIIlllIIlIl += 0.4f;
            this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI = 4.0f;
            this.IIlllIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI = 4.0f;
            this.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl = 9.0f;
            this.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl = 9.0f;
            this.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl = 1.0f;
        }
        else {
            this.IlIlIIIllIIllIlllllI.IllIIlllIIIIlllIIlIl = 0.0f;
            this.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI = 0.1f;
            this.IIlllIIlIllIllIlIIll.IlIlIIIllIllIIIIIllI = 0.1f;
            this.IlIllIlIlIIIlIlIlIII.IlIIIlIlIIIllIlIlIIl = 12.0f;
            this.IIlllIIlIllIllIlIIll.IlIIIlIlIIIllIlIlIIl = 12.0f;
            this.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl = 0.0f;
        }
        final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll6 = this.IIIIlllIIIIIIlIIIlll;
        iiiIlllIIIIIIlIIIlll6.lIIIIlIIIIIlllIllIII += llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.09f) * 0.05f + 0.05f;
        final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll5 = this.llllIIllllIlIlIIIIll;
        llllIIllllIlIlIIIIll5.lIIIIlIIIIIlllIllIII -= llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.09f) * 0.05f + 0.05f;
        final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll7 = this.IIIIlllIIIIIIlIIIlll;
        iiiIlllIIIIIIlIIIlll7.IllIIlllIIIIlllIIlIl += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.067f) * 0.05f;
        final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll6 = this.llllIIllllIlIlIIIIll;
        llllIIllllIlIlIIIIll6.IllIIlllIIIIlllIIlIl -= llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.067f) * 0.05f;
        if (this.IIIlIIIlIlIIlllIIlll) {
            final float n9 = 0.0f;
            final float n10 = 0.0f;
            this.IIIIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII = 0.0f;
            this.llllIIllllIlIlIIIIll.lIIIIlIIIIIlllIllIII = 0.0f;
            this.IIIIlllIIIIIIlIIIlll.llllIIIlIlllIlIIIIIl = -(0.1f - n9 * 0.6f) + this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl;
            this.llllIIllllIlIlIIIIll.llllIIIlIlllIlIIIIIl = 0.1f - n9 * 0.6f + this.llIllIlIIIIllIlIIllI.llllIIIlIlllIlIIIIIl + 0.4f;
            this.IIIIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl = -1.5707964f + this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
            this.llllIIllllIlIlIIIIll.IllIIlllIIIIlllIIlIl = -1.5707964f + this.llIllIlIIIIllIlIIllI.IllIIlllIIIIlllIIlIl;
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll8 = this.IIIIlllIIIIIIlIIIlll;
            iiiIlllIIIIIIlIIIlll8.IllIIlllIIIIlllIIlIl -= n9 * 1.2f - n10 * 0.4f;
            final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll7 = this.llllIIllllIlIlIIIIll;
            llllIIllllIlIlIIIIll7.IllIIlllIIIIlllIIlIl -= n9 * 1.2f - n10 * 0.4f;
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll9 = this.IIIIlllIIIIIIlIIIlll;
            iiiIlllIIIIIIlIIIlll9.lIIIIlIIIIIlllIllIII += llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.09f) * 0.05f + 0.05f;
            final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll8 = this.llllIIllllIlIlIIIIll;
            llllIIllllIlIlIIIIll8.lIIIIlIIIIIlllIllIII -= llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n3 * 0.09f) * 0.05f + 0.05f;
            final IIlIIIIIllIlIIIlIIll iiiIlllIIIIIIlIIIlll10 = this.IIIIlllIIIIIIlIIIlll;
            iiiIlllIIIIIIlIIIlll10.IllIIlllIIIIlllIIlIl += llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.067f) * 0.05f;
            final IIlIIIIIllIlIIIlIIll llllIIllllIlIlIIIIll9 = this.llllIIllllIlIlIIIIll;
            llllIIllllIlIlIIIIll9.IllIIlllIIIIlllIIlIl -= llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n3 * 0.067f) * 0.05f;
        }
        IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this.llIllIlIIIIllIlIIllI, this.lIlIlIIIllIIllIIIllI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
        super.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
        if (ilIIIlIlIIIllIlIlIIl instanceof IllIIlllIIIIlllIIlIl) {
            final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = (IllIIlllIIIIlllIIlIl)ilIIIlIlIIIllIlIlIIl;
            this.lllIIIIlllllIlIIllIl = illIIlllIIIIlllIIlIl.lllIIIIlllllIlIIllIl;
            this.IlIlIIIIIIlllIlIllIl = illIIlllIIIIlllIIlIl.IlIlIIIIIIlllIlIllIl;
            this.IIllIIllIIIlIlIIIIlI = illIIlllIIIIlllIIlIl.IIllIIllIIIlIlIIIIlI;
            this.IIIlIIIlIlIIlllIIlll = illIIlllIIIIlllIIlIl.IIIlIIIlIlIIlllIIlll;
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean llIIlIIIlIIIllIlIIIl) {
        this.llIllIlIIIIllIlIIllI.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIlIIIllIIllIlllllI.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IIIIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IlIllIlIlIIIlIlIlIII.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
        this.IIlllIIlIllIllIlIIll.llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl;
    }
    
    public void llllIIIIlIIIlIlllIll(final float n) {
        this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(n);
    }
}
