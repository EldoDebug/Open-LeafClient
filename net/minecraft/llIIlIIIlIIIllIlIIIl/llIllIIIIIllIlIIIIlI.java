package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class llIllIIIIIllIlIIIIlI extends IlIlIlIlIlllllllllIl
{
    private llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll;
    private final IlIIIlIlIIIllIlIlIIl IllIIlllIIIIlllIIlIl;
    
    public llIllIIIIIllIlIIIIlI(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl(this.IllIIlllIIIIlllIIlIl = new IlIIIlIlIIIllIlIlIIl(this, llllIIIIlIIIlIlllIll, 0, 136, 110));
        final int n = 36;
        final int n2 = 137;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llIIIlIlIllIIlIlIlII, j + i * 9 + 9, n + j * 18, n2 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llIIIlIlIllIIlIlIlII, k, n + k * 18, 58 + n2));
        }
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        super.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII);
        ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n, n2);
    }
    
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl());
            if (llllIIIIlIIIlIlllIll2 != null) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, false);
            }
        }
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
            if (n == 0) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 1, 37, true)) {
                    return null;
                }
                iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIIlIIIlIIIllIlIIIl);
            }
            else if (!this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() && this.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2) && llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 1) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0, 1, false)) {
                    return null;
                }
            }
            else if (n >= 1 && n < 28) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 28, 37, false)) {
                    return null;
                }
            }
            else if (n >= 28 && n < 37) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 1, 28, false)) {
                    return null;
                }
            }
            else if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 1, 37, false)) {
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
}
