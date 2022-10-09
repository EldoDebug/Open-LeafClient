package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IIIlIIlIIIIlllIlllII extends IlIlIlIlIlllllllllIl
{
    public IIlllIIIlIlllIIlllII llllIIIIlIIIlIlllIll;
    public llIIIlIlIllIIlIlIlII IllIIlllIIIIlllIIlIl;
    private IlllllllIIIlIIIlIlII llllIIIlIlllIlIIIIIl;
    private net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl lIIIIlIIIIIlllIllIII;
    
    public IIIlIIlIIIIlllIlllII(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final IlllllllIIIlIIIlIlII llllIIIlIlllIlIIIIIl, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = new IIlllIIIlIlllIIlllII(this, 3, 3);
        this.IllIIlllIIIIlllIIlIl = new llIIlllIIlllIIllIllI();
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIlIlIlIlllllllllIl(new IIIIIIIIIlllIllIlIlI(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll, this.IllIIlllIIIIlllIIlIl, 0, 124, 35));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(this.llllIIIIlIIIlIlllIll, j + i * 3, 30 + j * 18, 17 + i * 18));
            }
        }
        for (int k = 0; k < 3; ++k) {
            for (int l = 0; l < 9; ++l) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, l + k * 9 + 9, 8 + l * 18, 84 + k * 18));
            }
        }
        for (int n = 0; n < 9; ++n) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, n, 8 + n * 18, 142));
        }
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(0, net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.llllIIIlIlllIlIIIIIl));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (!this.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII) {
            for (int i = 0; i < 9; ++i) {
                final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(i);
                if (ilIlIIIllIIllIlllllI != null) {
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, false);
                }
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(this.lIIIIlIIIIIlllIllIII).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIllIlIllIllIIIIl && llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(this.lIIIIlIIIIIlllIllIII.lIIIIlIIIIIlllIllIII() + 0.5, this.lIIIIlIIIIIlllIllIII.lIIIlllIIIllIIIllIII() + 0.5, this.lIIIIlIIIIIlllIllIII.llIIlIIIlIIIllIlIIIl() + 0.5) <= 64.0;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = null;
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n);
        if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl()) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
            if (n == 0) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 10, 46, true)) {
                    return null;
                }
                iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIIlIIIlIIIllIlIIIl);
            }
            else if (n >= 10 && n < 37) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 37, 46, false)) {
                    return null;
                }
            }
            else if (n >= 37 && n < 46) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 10, 37, false)) {
                    return null;
                }
            }
            else if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 10, 46, false)) {
                return null;
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 0) {
                iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl(null);
            }
            else {
                iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI();
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl) {
                return null;
            }
            iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl) {
        return iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl != this.IllIIlllIIIIlllIIlIl && super.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, iiiiIllIIIIlIIIIllIl);
    }
}
