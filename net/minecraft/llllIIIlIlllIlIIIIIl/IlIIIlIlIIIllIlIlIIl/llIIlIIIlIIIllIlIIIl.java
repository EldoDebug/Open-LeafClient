package net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class llIIlIIIlIIIllIlIIIl extends lIlIlIIIllIIllIIIllI
{
    private float llIllIIIIIllIlIIIIlI;
    
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llIllIIIIIllIlIIIIlI = 1.0f;
    }
    
    public llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        super(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        this.llIllIIIIIllIlIIIIlI = 1.0f;
        this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
    }
    
    @Override
    protected void a_() {
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(8, 5);
        this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(9, (Object)0);
    }
    
    @Override
    public float lllllIIllIlIllIllllI() {
        return 0.0f;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (!lIllllllIIllIlIlIlII.llIllIIIIIllIlIIIIlI() && this.llllIIllllIlIlIIIIll() != null) {
            if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl(), false);
                this.llllIIIIlIIIlIlllIll((lllIIIIlIlIllIIlIIIl)null);
            }
            return true;
        }
        return super.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII, n);
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII() {
        return 12;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return 12;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final double n) {
        final double n2 = 16.0 * 64.0 * this.lllIIIIlllllIlIIllIl;
        return n < n2 * n2;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, true);
    }
    
    public void llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final boolean b) {
        if (this.IlllllllIIIlIIIlIlII.llIIlllIIlllIIllIllI().IlIlIlIlIlllllllllIl("doEntityDrops")) {
            final lllIIIIlIlIllIIlIIIl llllIIllllIlIlIIIIll = this.llllIIllllIlIlIIIIll();
            if (llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll && ((llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).K.IlIIIlIlIIIllIlIlIIl) {
                this.IlIlIlIlIlllllllllIl(llllIIllllIlIlIIIIll);
                return;
            }
            if (b) {
                this.llllIIIIlIIIlIlllIll(new lllIIIIlIlIllIIlIIIl(net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.T), 0.0f);
            }
            if (llllIIllllIlIlIIIIll != null && this.IlIIllIIllIIllIIlIIl.nextFloat() < this.llIllIIIIIllIlIIIIlI) {
                final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = llllIIllllIlIlIIIIll.llIIlIIIlIIIllIlIIIl();
                this.IlIlIlIlIlllllllllIl(llIIlIIIlIIIllIlIIIl);
                this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, 0.0f);
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        if (lllIIIIlIlIllIIlIIIl != null) {
            if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.h) {
                ((IIlllllIllIllIlIlIII)lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll()).llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, this.IlllllllIIIlIIIlIlII).lIIIIlIIIIIlllIllIII.remove("frame-" + this.IlllIIIIlIIIlIlIlIIl());
            }
            lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll((llIIlIIIlIIIllIlIIIl)null);
        }
    }
    
    public lllIIIIlIlIllIIlIIIl llllIIllllIlIlIIIIll() {
        return this.llIllIlIlIIIIIIIllII().IllIIlllIIIIlllIIlIl(8);
    }
    
    public void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, true);
    }
    
    private void llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        if (llIIlIIIlIIIllIlIIIl != null) {
            llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llIIlIIIlIIIllIlIIIl();
            llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = 1;
            llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(this);
        }
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(8, llIIlIIIlIIIllIlIIIl);
        this.llIllIlIlIIIIIIIllII().lIIIIlIIIIIlllIllIII(8);
        if (b && this.llllIIIIlIIIlIlllIll != null) {
            this.IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        }
    }
    
    public int IlIllIlIlIIIlIlIlIII() {
        return this.llIllIlIlIIIIIIIllII().llllIIIIlIIIlIlllIll(9);
    }
    
    public void llllIIIIlIIIlIlllIll(final int n) {
        this.IlIlIlIlIlllllllllIl(n, true);
    }
    
    private void IlIlIlIlIlllllllllIl(final int n, final boolean b) {
        this.llIllIlIlIIIIIIIllII().IlIlIlIlIlllllllllIl(9, (byte)(n % 8));
        if (b && this.llllIIIIlIIIlIlllIll != null) {
            this.IlllllllIIIlIIIlIlII.IlIlIIIllIllIIIIIllI(this.llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll);
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        if (this.llllIIllllIlIlIIIIll() != null) {
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Item", this.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl(new IIIIlllIIIIIIlIIIlll()));
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ItemRotation", (byte)this.IlIllIlIlIIIlIlIlIII());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("ItemDropChance", this.llIllIIIIIllIlIIIIlI);
        }
        super.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI("Item");
        if (ilIlIIIllIIllIlllllI != null && !ilIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI()) {
            this.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI), false);
            this.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("ItemRotation"), false);
            if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("ItemDropChance", 99)) {
                this.llIllIIIIIllIlIIIIlI = iiiIlllIIIIIIlIIIlll.lIIIIlIIIIIlllIllIII("ItemDropChance");
            }
            if (iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI("Direction")) {
                this.IlIlIlIlIlllllllllIl(this.IlIllIlIlIIIlIlIlIII() * 2, false);
            }
        }
        super.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
    }
    
    @Override
    public boolean a_(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (this.llllIIllllIlIlIIIIll() == null) {
            final lllIIIIlIlIllIIlIIIl n = llllIIIIlIIIlIlllIll.n();
            if (n != null && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.llllIIIIlIIIlIlllIll(n);
                if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                    final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = n;
                    if (--lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
                        llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, null);
                    }
                }
            }
        }
        else if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.llllIIIIlIIIlIlllIll(this.IlIllIlIlIIIlIlIlIII() + 1);
        }
        return true;
    }
    
    public int IIlllIIlIllIllIlIIll() {
        return (this.llllIIllllIlIlIIIIll() == null) ? 0 : (this.IlIllIlIlIIIlIlIlIII() % 8 + 1);
    }
}
