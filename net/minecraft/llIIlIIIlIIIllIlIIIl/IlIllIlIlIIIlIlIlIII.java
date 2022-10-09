package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIllIlIlIIIlIlIlIII extends IlIlIlIlIlllllllllIl
{
    private llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll;
    private IllIIlllIIIIlllIIlIl IllIIlllIIIIlllIIlIl;
    
    public IlIllIlIlIIIlIlIlIII(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII, final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        final int n = 3;
        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI(llllIIIIlIIIlIlllIll2);
        final int n2 = (n - 4) * 18;
        this.IlIlIlIlIlllllllllIl(new IIlllIIlIllIllIlIIll(this, llllIIIIlIIIlIlllIll, 0, 8, 18));
        this.IlIlIlIlIlllllllllIl(new lllIIIIlllllIlIIllIl(this, llllIIIIlIIIlIlllIll, 1, 8, 36, illIIlllIIIIlllIIlIl));
        if (illIIlllIIIIlllIIlIl.ay()) {
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < 5; ++j) {
                    this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llllIIIIlIIIlIlllIll, 2 + j + i * 5, 80 + j * 18, 18 + i * 18));
                }
            }
        }
        for (int k = 0; k < 3; ++k) {
            for (int l = 0; l < 9; ++l) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llIIIlIlIllIIlIlIlII, l + k * 9 + 9, 8 + l * 18, 102 + k * 18 + n2));
            }
        }
        for (int n3 = 0; n3 < 9; ++n3) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llIIIlIlIllIIlIlIlII, n3, 8 + n3 * 18, 160 + n2));
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && this.IllIIlllIIIIlllIIlIl.llllIllllIllllIlIlII() && this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) < 8.0f;
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
            else if (this.llllIIIIlIIIlIlllIll(1).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2) && !this.llllIIIIlIIIlIlllIll(1).IlIlIlIlIlllllllllIl()) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 1, 2, false)) {
                    return null;
                }
            }
            else if (this.llllIIIIlIIIlIlllIll(0).llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2)) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0, 1, false)) {
                    return null;
                }
            }
            else if (this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() <= 2 || !this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 2, this.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), false)) {
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
