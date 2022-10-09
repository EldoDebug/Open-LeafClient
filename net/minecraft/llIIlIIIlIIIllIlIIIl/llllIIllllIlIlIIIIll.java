package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class llllIIllllIlIlIIIIll extends IlIlIlIlIlllllllllIl
{
    private final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll;
    
    public llllIIllllIlIlIIIIll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        (this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll).IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll2);
        final int n = 51;
        for (int i = 0; i < llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(); ++i) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llllIIIIlIIIlIlllIll, i, 44 + i * 18, 20));
        }
        for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, k + j * 9 + 9, 8 + k * 18, j * 18 + n));
            }
        }
        for (int l = 0; l < 9; ++l) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, l, 8 + l * 18, 58 + n));
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
            if (n < this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII()) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), this.llIllIIIIIllIlIIIIlI.size(), true)) {
                    return null;
                }
            }
            else if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0, this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), false)) {
                return null;
            }
            if (llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl == 0) {
                iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl(null);
            }
            else {
                iiiiIllIIIIlIIIIllIl.llIllIIIIIllIlIIIIlI();
            }
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll);
    }
}
