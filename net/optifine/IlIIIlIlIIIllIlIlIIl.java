package net.optifine;

import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIIIlIlIIIllIlIlIIl extends IlIlIlIlIlllllllllIl
{
    private int llIllIIIIIllIlIIIIlI;
    private int IlIIIlIlIIIllIlIlIIl;
    private int IlIlIIIllIllIIIIIllI;
    private int IllIIlllIIIIlllIIlIl;
    private IlIIIlIlIIIllIlIlIIl[] llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    public IlIIIlIlIIIllIlIlIIl(final int n, final int n2, final int n3) {
        this(n, n2, n3, 0);
    }
    
    public IlIIIlIlIIIllIlIlIIl(final double n, final double n2, final double n3) {
        this(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3));
    }
    
    public IlIIIlIlIIIllIlIlIIl(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI, final int illIIlllIIIIlllIIlIl) {
        super(0, 0, 0);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    @Override
    public int lIIIIlIIIIIlllIllIII() {
        return this.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int lIIIlllIIIllIIIllIII() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public int llIIlIIIlIIIllIlIIIl() {
        return this.IlIlIIIllIllIIIIIllI;
    }
    
    public void IlIlIlIlIlllllllllIl(final int llIllIIIIIllIlIIIIlI, final int ilIIIlIlIIIllIlIlIIl, final int ilIlIIIllIllIIIIIllI) {
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.lIIIIlIIIIIlllIllIII = true;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final double n, final double n2, final double n3) {
        this.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3));
    }
    
    public IlIIIlIlIIIllIlIlIIl llllIIIlIlllIlIIIIIl(final f f) {
        this.IlIlIlIlIlllllllllIl(f.lIIIIlIIIIIlllIllIII(), f.lIIIlllIIIllIIIllIII(), f.llIIlIIIlIIIllIlIIIl());
        return this;
    }
    
    public IlIIIlIlIIIllIlIlIIl llIllIIIIIllIlIIIIlI(final int n, final int n2, final int n3) {
        this.IlIlIlIlIlllllllllIl(n, n2, n3);
        return this;
    }
    
    public IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        if (this.IllIIlllIIIIlllIIlIl <= 0) {
            return super.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, 1);
        }
        if (this.llllIIIlIlllIlIIIIIl == null) {
            this.llllIIIlIlllIlIIIIIl = new IlIIIlIlIIIllIlIlIIl[lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl.length];
        }
        if (this.lIIIIlIIIIIlllIllIII) {
            this.lIlIlIIIllIIllIIIllI();
        }
        final int ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl();
        IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.llllIIIlIlllIlIIIIIl[ilIlIlIlIlllllllllIl];
        if (ilIIIlIlIIIllIlIlIIl == null) {
            ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII(), this.IlIIIlIlIIIllIlIlIIl + lllIllIIIllllllIllll.lIIIlllIIIllIIIllIII(), this.IlIlIIIllIllIIIIIllI + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl(), this.IllIIlllIIIIlllIIlIl - 1);
            this.llllIIIlIlllIlIIIIIl[ilIlIlIlIlllllllllIl] = ilIIIlIlIIIllIlIlIIl;
        }
        return ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final int n) {
        return (n == 1) ? this.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll) : super.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll, n);
    }
    
    private void lIlIlIIIllIIllIIIllI() {
        for (int i = 0; i < 6; ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = this.llllIIIlIlllIlIIIIIl[i];
            if (ilIIIlIlIIIllIlIlIIl != null) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl[i];
                ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII(), this.IlIIIlIlIIIllIlIlIIl + lllIllIIIllllllIllll.lIIIlllIIIllIIIllIII(), this.IlIlIIIllIllIIIIIllI + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl());
            }
        }
        this.lIIIIlIIIIIlllIllIII = false;
    }
    
    public IlIlIlIlIlllllllllIl llIllIlIIIIllIlIIllI() {
        return new IlIlIlIlIlllllllllIl(this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI);
    }
    
    public static Iterable llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        return new IlIlIIIllIllIIIIIllI(new IlIlIlIlIlllllllllIl(Math.min(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII()), Math.min(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII()), Math.min(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl())), new IlIlIlIlIlllllllllIl(Math.max(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII()), Math.max(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII()), Math.max(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl())));
    }
}
