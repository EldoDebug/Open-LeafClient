package net.minecraft.llllIIIlIlllIlIIIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import org.apache.commons.lang3.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public abstract class lIlIlIIIllIIllIIIllI extends llIllIIIIIllIlIIIIlI
{
    private int llIllIIIIIllIlIIIIlI;
    protected IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll;
    public lllIllIIIllllllIllll IlIlIlIlIlllllllllIl;
    
    public lIlIlIIIllIIllIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll(0.5f, 0.5f);
    }
    
    public lIlIlIIIllIIllIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll) {
        this(illlllllIIIlIIIlIlII);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    protected void a_() {
    }
    
    protected void llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl) {
        Validate.notNull((Object)ilIlIlIlIlllllllllIl);
        Validate.isTrue(ilIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI().IlIIIlIlIIIllIlIlIIl());
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        final float n = (float)(this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() * 90);
        this.IIlIIIIIllIlIIIlIIll = n;
        this.IIIllllllIllIIIlllIl = n;
        this.llllIIllllIlIlIIIIll();
    }
    
    private void llllIIllllIlIlIIIIll() {
        if (this.IlIlIlIlIlllllllllIl != null) {
            final double n = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() + 0.5;
            final double n2 = this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() + 0.5;
            final double n3 = this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() + 0.5;
            final double llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(this.lIIIIlIIIIIlllIllIII());
            final double llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(this.lIIIlllIIIllIIIllIII());
            final double n4 = n - this.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() * 0.46875;
            final double n5 = n3 - this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() * 0.46875;
            final double llIIIlIlIllIIlIlIlII = n2 + llllIIIIlIIIlIlllIll2;
            final lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl = this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl();
            final double iIlllIlIIllIlIlIlIIl = n4 + llllIIIIlIIIlIlllIll * llllIIIlIlllIlIIIIIl.lIIIIlIIIIIlllIllIII();
            final double lllllIlIIIlIlIIlllII = n5 + llllIIIIlIIIlIlllIll * llllIIIlIlllIlIIIIIl.llIIlIIIlIIIllIlIIIl();
            this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
            this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
            this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
            double n6 = this.lIIIIlIIIIIlllIllIII();
            final double n7 = this.lIIIlllIIIllIIIllIII();
            double n8 = this.lIIIIlIIIIIlllIllIII();
            if (this.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI() == net.minecraft.IlllllllIIIlIIIlIlII.llIllIlIlIIIIIIIllII.llIllIIIIIllIlIIIIlI) {
                n8 = 1.0;
            }
            else {
                n6 = 1.0;
            }
            final double n9 = n6 / 32.0;
            final double n10 = n7 / 32.0;
            final double n11 = n8 / 32.0;
            this.llllIIIIlIIIlIlllIll(new llllIIIIlIIIlIlllIll(iIlllIlIIllIlIlIlIIl - n9, llIIIlIlIllIIlIlIlII - n10, lllllIlIIIlIlIIlllII - n11, iIlllIlIIllIlIlIlIIl + n9, llIIIlIlIllIIlIlIlII + n10, lllllIlIIIlIlIIlllII + n11));
        }
    }
    
    private double llllIIIIlIIIlIlllIll(final int n) {
        return (n % 32 == 0) ? 0.5 : 0.0;
    }
    
    @Override
    public void IIllIIllIIIlIlIIIIlI() {
        this.IIlIIIIlllIlllllIlII = this.IIlllIlIIllIlIlIlIIl;
        this.IIIlIIlIIIIlllIlllII = this.llIIIlIlIllIIlIlIlII;
        this.IlIlIllllllllIIIIlII = this.lllllIlIIIlIlIIlllII;
        if (this.llIllIIIIIllIlIIIIlI++ == 100 && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.llIllIIIIIllIlIIIIlI = 0;
            if (!this.IIlIlIlIIlIllIIIIIIl && !this.llllIIIlIlllIlIIIIIl()) {
                this.IllIllIIIIlIIlIlllII();
                this.IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI)null);
            }
        }
    }
    
    public boolean llllIIIlIlllIlIIIIIl() {
        if (!this.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this, this.IlIIlllIIlIlllllIIlI()).isEmpty()) {
            return false;
        }
        final int max = Math.max(1, this.lIIIIlIIIIIlllIllIII() / 16);
        final int max2 = Math.max(1, this.lIIIlllIIIllIIIllIII() / 16);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI());
        final lllIllIIIllllllIllll llllIIIlIlllIlIIIIIl = this.IlIlIlIlIlllllllllIl.llllIIIlIlllIlIIIIIl();
        for (int i = 0; i < max; ++i) {
            for (int j = 0; j < max2; ++j) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, i).llllIIIIlIIIlIlllIll(j)).llIllIIIIIllIlIIIIlI();
                if (!llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl() && !bb.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI)) {
                    return false;
                }
            }
        }
        final Iterator<llIllIIIIIllIlIIIIlI> iterator = (Iterator<llIllIIIIIllIlIIIIlI>)this.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this, this.IlIIlllIIlIlllllIIlI()).iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof lIlIlIIIllIIllIIIllI) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public boolean IIlllIIlllIIIlIlllII() {
        return true;
    }
    
    @Override
    public boolean lIIIlllIIIllIIIllIII(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return llIllIIIIIllIlIIIIlI instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && this.llllIIIIlIIIlIlllIll(net.minecraft.IlllllllIIIlIIIlIlII.lIllllllIIllIlIlIlII.llllIIIIlIIIlIlllIll((net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI), 0.0f);
    }
    
    @Override
    public lllIllIIIllllllIllll lIllIIlIlIlllllIIIII() {
        return this.IlIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIllllllIIllIlIlIlII lIllllllIIllIlIlIlII, final float n) {
        if (this.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII)) {
            return false;
        }
        if (!this.IIlIlIlIIlIllIIIIIIl && !this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            this.IllIllIIIIlIIlIlllII();
            this.IIIllIIIlIlIIllIIIlI();
            this.IlIlIlIlIlllllllllIl(lIllllllIIllIlIlIlII.llIIlIIIlIIIllIlIIIl());
        }
        return true;
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final double n, final double n2, final double n3) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IIlIlIlIIlIllIIIIIIl && n * n + n2 * n2 + n3 * n3 > 0.0) {
            this.IllIllIIIIlIIlIlllII();
            this.IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI)null);
        }
    }
    
    @Override
    public void llllIIIlIlllIlIIIIIl(final double n, final double n2, final double n3) {
        if (!this.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && !this.IIlIlIlIIlIllIIIIIIl && n * n + n2 * n2 + n3 * n3 > 0.0) {
            this.IllIllIIIIlIIlIlllII();
            this.IlIlIlIlIlllllllllIl((llIllIIIIIllIlIIIIlI)null);
        }
    }
    
    public void llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Facing", (byte)this.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TileX", this.lIlIlIIIllIIllIIIllI().lIIIIlIIIIIlllIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TileY", this.lIlIlIIIllIIllIIIllI().lIIIlllIIIllIIIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("TileZ", this.lIlIlIIIllIIllIIIllI().llIIlIIIlIIIllIlIIIl());
    }
    
    public void IlIlIlIlIlllllllllIl(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll) {
        this.llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("TileX"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("TileY"), iiiIlllIIIIIIlIIIlll.IllIIlllIIIIlllIIlIl("TileZ"));
        lllIllIIIllllllIllll lllIllIIIllllllIllll;
        if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Direction", 99)) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Direction"));
            this.llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        }
        else if (iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl("Facing", 99)) {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Facing"));
        }
        else {
            lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl("Dir"));
        }
        this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
    }
    
    public abstract int lIIIIlIIIIIlllIllIII();
    
    public abstract int lIIIlllIIIllIIIllIII();
    
    public abstract void IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI p0);
    
    @Override
    protected boolean IlIIlllllIIllIIlllll() {
        return false;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final double iIlllIlIIllIlIlIlIIl, final double llIIIlIlIllIIlIlIlII, final double lllllIlIIIlIlIIlllII) {
        this.IIlllIlIIllIlIlIlIIl = iIlllIlIIllIlIlIlIIl;
        this.llIIIlIlIllIIlIlIlII = llIIIlIlIllIIlIlIlII;
        this.lllllIlIIIlIlIIlllII = lllllIlIIIlIlIIlllII;
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll;
        this.llllIIIIlIIIlIlllIll = new IlIlIlIlIlllllllllIl(iIlllIlIIllIlIlIlIIl, llIIIlIlIllIIlIlIlII, lllllIlIIIlIlIIlllII);
        if (!this.llllIIIIlIIIlIlllIll.equals(llllIIIIlIIIlIlllIll)) {
            this.llllIIllllIlIlIIIIll();
            this.llIllIIlllllllllllll = true;
        }
    }
    
    public IlIlIlIlIlllllllllIl lIlIlIIIllIIllIIIllI() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
