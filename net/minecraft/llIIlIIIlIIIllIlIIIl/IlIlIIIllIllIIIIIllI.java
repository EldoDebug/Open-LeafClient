package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIlIIIllIllIIIIIllI extends IlIlIlIlIlllllllllIl
{
    private llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll;
    private final IIIIIllIIIIlIIIIllIl IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    
    public IlIlIIIllIllIIIIIllI(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl(new llllIIIlIlllIlIIIIIl(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, 0, 56, 46));
        this.IlIlIlIlIlllllllllIl(new llllIIIlIlllIlIIIIIl(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, 1, 79, 53));
        this.IlIlIlIlIlllllllllIl(new llllIIIlIlllIlIIIIIl(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, 2, 102, 46));
        this.IllIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl(new net.minecraft.llIIlIIIlIIIllIlIIIl.IllIIlllIIIIlllIIlIl(this, llllIIIIlIIIlIlllIll, 3, 79, 17));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, k, 8 + k * 18, 142));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        super.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
        for (int i = 0; i < this.IlIlIIIllIllIIIIIllI.size(); ++i) {
            final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII = this.IlIlIIIllIllIIIIIllI.get(i);
            if (this.llllIIIlIlllIlIIIIIl != this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0)) {
                ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 0, this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0));
            }
        }
        this.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = null;
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n);
        if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl()) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
            if ((n < 0 || n > 2) && n != 3) {
                if (!this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() && this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
                    if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 3, 4, false)) {
                        return null;
                    }
                }
                else if (net.minecraft.llIIlIIIlIIIllIlIIIl.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl(llIIlIIIlIIIllIlIIIl)) {
                    if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0, 3, false)) {
                        return null;
                    }
                }
                else if (n >= 4 && n < 31) {
                    if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 31, 40, false)) {
                        return null;
                    }
                }
                else if (n >= 31 && n < 40) {
                    if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 4, 31, false)) {
                        return null;
                    }
                }
                else if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 4, 40, false)) {
                    return null;
                }
            }
            else {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 4, 40, true)) {
                    return null;
                }
                iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIIlIIIlIIIllIlIIIl);
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
}
