package net.minecraft.IIIIlllIIIIIIlIIIlll;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public abstract class IlIIIlIlIIIllIlIlIIl
{
    protected IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll;
    protected IlllllllIIIlIIIlIlII IlIlIlIlIlllllllllIl;
    protected IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI;
    protected double IlIIIlIlIIIllIlIlIIl;
    private final IlIlIIIllIllIIIIIllI IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private e lIIIIlIIIIIlllIllIII;
    private float lIIIlllIIIllIIIllIII;
    private final llIllIIIIIllIlIIIIlI llIIlIIIlIIIllIlIIIl;
    
    public IlIIIlIlIIIllIlIlIIl(final IlIllIlIlIIIlIlIlIII llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII ilIlIlIlIlllllllllIl) {
        this.lIIIIlIIIIIlllIllIII = new e(0.0, 0.0, 0.0);
        this.lIIIlllIIIllIIIllIII = 1.0f;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.IlIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIIIlIIIllllIlIlIlI.IlIlIlIlIlllllllllIl);
        this.llIIlIIIlIIIllIlIIIl = this.llllIIIIlIIIlIlllIll();
    }
    
    protected abstract llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll();
    
    public void llllIIIIlIIIlIlllIll(final double ilIIIlIlIIIllIlIlIIl) {
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    public float IlIlIlIlIlllllllllIl() {
        return (float)this.IlIlIIIllIllIIIIIllI.IlIlIIIllIllIIIIIllI();
    }
    
    public final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3) {
        return this.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n), (int)n2, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3)));
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (!this.lIIIlllIIIllIIIllIII()) {
            return null;
        }
        final float ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("pathfind");
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll);
        final int n = (int)(ilIlIlIlIlllllllllIl2 + 8.0f);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(new llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(-n, -n, -n), ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(n, n, n), 0), this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        return llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final double n, final double n2, final double n3, final double n4) {
        return this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n), (int)n2, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3)), n4);
    }
    
    public void llllIIIIlIIIlIlllIll(final float liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!this.lIIIlllIIIllIIIllIII()) {
            return null;
        }
        final float ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl();
        this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll("pathfind");
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll();
        final int n = (int)(ilIlIlIlIlllllllllIl + 16.0f);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = this.llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(new llllIIIIlIIIlIlllIll(this.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(-n, -n, -n), llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n, n), 0), this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl);
        this.IlIlIlIlIlllllllllIl.IIlIIIIlllIlllllIlII.IlIlIlIlIlllllllllIl();
        return llllIIIIlIIIlIlllIll2;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI);
        return llllIIIIlIIIlIlllIll != null && this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, n);
    }
    
    public boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI, final double ilIIIlIlIIIllIlIlIIl) {
        if (llIllIIIIIllIlIIIIlI == null) {
            this.llIllIIIIIllIlIIIIlI = null;
            return false;
        }
        if (!llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llIllIIIIIllIlIIIIlI)) {
            this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        }
        this.llIllIlIIIIllIlIIllI();
        if (this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl() == 0) {
            return false;
        }
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        final e liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        this.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        return true;
    }
    
    public IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    public void IlIIIlIlIIIllIlIlIIl() {
        ++this.IllIIlllIIIIlllIIlIl;
        if (!this.IllIIlllIIIIlllIIlIl()) {
            if (this.lIIIlllIIIllIIIllIII()) {
                this.IlIlIIIllIllIIIIIllI();
            }
            else if (this.llIllIIIIIllIlIIIIlI != null && this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() < this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl()) {
                final e liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
                final e llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI());
                if (liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl > llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl && !this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl && llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) == llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) && llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) == llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI)) {
                    this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI() + 1);
                }
            }
            if (!this.IllIIlllIIIIlllIIlIl()) {
                final e llllIIIIlIIIlIlllIll2 = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
                if (llllIIIIlIIIlIlllIll2 != null) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll ilIlIlIlIlllllllllIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI).IlIlIlIlIlllllllllIl(0.5, 0.5, 0.5);
                    final List llllIIIIlIIIlIlllIll3 = this.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0.0, -1.0, 0.0));
                    double ilIlIlIlIlllllllllIl2 = -1.0;
                    final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI(0.0, 1.0, 0.0);
                    final Iterator<net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll> iterator = llllIIIIlIIIlIlllIll3.iterator();
                    while (iterator.hasNext()) {
                        ilIlIlIlIlllllllllIl2 = iterator.next().IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, ilIlIlIlIlllllllllIl2);
                    }
                    this.llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl + ilIlIlIlIlllllllllIl2, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl);
                }
            }
        }
    }
    
    protected void IlIlIIIllIllIIIIIllI() {
        final e liiiIlIIIIIlllIllIII = this.lIIIIlIIIIIlllIllIII();
        int ilIIIlIlIIIllIlIlIIl = this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl();
        for (int i = this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); i < this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(); ++i) {
            if (this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(i).IlIlIlIlIlllllllllIl != (int)liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl) {
                ilIIIlIlIIIllIlIlIIl = i;
                break;
            }
        }
        final float n = this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII * this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII * this.lIIIlllIIIllIIIllIII;
        for (int j = this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); j < ilIIIlIlIIIllIlIlIIl; ++j) {
            if (liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, j)) < n) {
                this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(j + 1);
            }
        }
        final int illIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(this.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII);
        final int n2 = (int)this.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll + 1;
        final int n3 = illIIlllIIIIlllIIlIl;
        for (int k = ilIIIlIlIIIllIlIlIIl - 1; k >= this.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI(); --k) {
            if (this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII, this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, k), illIIlllIIIIlllIIlIl, n2, n3)) {
                this.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(k);
                break;
            }
        }
        this.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
    }
    
    protected void llllIIIIlIIIlIlllIll(final e liiiIlIIIIIlllIllIII) {
        if (this.IllIIlllIIIIlllIIlIl - this.llllIIIlIlllIlIIIIIl > 100) {
            if (liiiIlIIIIIlllIllIII.llllIIIlIlllIlIIIIIl(this.lIIIIlIIIIIlllIllIII) < 2.25) {
                this.llllIIIlIlllIlIIIIIl();
            }
            this.llllIIIlIlllIlIIIIIl = this.IllIIlllIIIIlllIIlIl;
            this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        }
    }
    
    public boolean IllIIlllIIIIlllIIlIl() {
        return this.llIllIIIIIllIlIIIIlI == null || this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl();
    }
    
    public void llllIIIlIlllIlIIIIIl() {
        this.llIllIIIIIllIlIIIIlI = null;
    }
    
    protected abstract e lIIIIlIIIIIlllIllIII();
    
    protected abstract boolean lIIIlllIIIllIIIllIII();
    
    protected boolean llIIlIIIlIIIllIlIIIl() {
        return this.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI() || this.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl();
    }
    
    protected void llIllIlIIIIllIlIIllI() {
    }
    
    protected abstract boolean llllIIIIlIIIlIlllIll(final e p0, final e p1, final int p2, final int p3, final int p4);
}
