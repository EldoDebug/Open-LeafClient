package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class lIIIIlIIIIIlllIllIII extends IlIlIlIlIlllllllllIl
{
    private llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll;
    private int IllIIlllIIIIlllIIlIl;
    
    public lIIIIlIIIIIlllIllIII(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() / 9;
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll2);
        final int n = (this.IllIIlllIIIIlllIIlIl - 4) * 18;
        for (int i = 0; i < this.IllIIlllIIIIlllIIlIl; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llllIIIIlIIIlIlllIll, j + i * 9, 8 + j * 18, 18 + i * 18));
            }
        }
        for (int k = 0; k < 3; ++k) {
            for (int l = 0; l < 9; ++l) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llIIIlIlIllIIlIlIlII, l + k * 9 + 9, 8 + l * 18, 103 + k * 18 + n));
            }
        }
        for (int n2 = 0; n2 < 9; ++n2) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llIIIlIlIllIIlIlIlII, n2, 8 + n2 * 18, 161 + n));
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
            if (n < this.IllIIlllIIIIlllIIlIl * 9) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, this.IllIIlllIIIIlllIIlIl * 9, this.llIllIIIIIllIlIIIIlI.size(), true)) {
                    return null;
                }
            }
            else if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0, this.IllIIlllIIIIlllIIlIl * 9, false)) {
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
    
    public llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll;
    }
}
