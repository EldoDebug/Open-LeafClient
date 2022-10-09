package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IIllIIllIIIlIlIIIIlI extends IlIlIlIlIlllllllllIl
{
    public IIlllIIIlIlllIIlllII llllIIIIlIIIlIlllIll;
    public llIIIlIlIllIIlIlIlII IllIIlllIIIIlllIIlIl;
    public boolean llllIIIlIlllIlIIIIIl;
    private final llllIIIIlIIIlIlllIll lIIIIlIIIIIlllIllIII;
    
    public IIllIIllIIIlIlIIIIlI(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final boolean llllIIIlIlllIlIIIIIl, final llllIIIIlIIIlIlllIll liiiIlIIIIIlllIllIII) {
        this.llllIIIIlIIIlIlllIll = new IIlllIIIlIlllIIlllII(this, 2, 2);
        this.IllIIlllIIIIlllIIlIl = new llIIlllIIlllIIllIllI();
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.IlIlIlIlIlllllllllIl(new IIIIIIIIIlllIllIlIlI(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, this.llllIIIIlIIIlIlllIll, this.IllIIlllIIIIlllIIlIl, 0, 144, 36));
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 2; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(this.llllIIIIlIIIlIlllIll, j + i * 2, 88 + j * 18, 26 + i * 18));
            }
        }
        for (int k = 0; k < 4; ++k) {
            this.IlIlIlIlIlllllllllIl(new IIIlIIIlIlIIlllIIlll(this, illIIlllIIIIlllIIlIl, illIIlllIIIIlllIIlIl.lIIIlllIIIllIIIllIII() - 1 - k, 8, 8 + k * 18, k));
        }
        for (int l = 0; l < 3; ++l) {
            for (int n = 0; n < 9; ++n) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, n + (l + 1) * 9, 8 + n * 18, 84 + l * 18));
            }
        }
        for (int n2 = 0; n2 < 9; ++n2) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, n2, 8 + n2 * 18, 142));
        }
        this.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(0, net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, this.lIIIIlIIIIIlllIllIII.IlllllllIIIlIIIlIlII));
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        for (int i = 0; i < 4; ++i) {
            final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI(i);
            if (ilIlIIIllIIllIlllllI != null) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, false);
            }
        }
        this.IllIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(0, null);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return true;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final int n) {
        lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = null;
        final IIIIIllIIIIlIIIIllIl iiiiIllIIIIlIIIIllIl = this.llIllIIIIIllIlIIIIlI.get(n);
        if (iiiiIllIIIIlIIIIllIl != null && iiiiIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl()) {
            final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll();
            llIIlIIIlIIIllIlIIIl = llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl();
            if (n == 0) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 9, 45, true)) {
                    return null;
                }
                iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIIlIIIlIIIllIlIIIl);
            }
            else if (n >= 1 && n < 5) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 9, 45, false)) {
                    return null;
                }
            }
            else if (n >= 5 && n < 9) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 9, 45, false)) {
                    return null;
                }
            }
            else if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll() instanceof IIIlIIlIIIIlllIlllII && !((IIIIIllIIIIlIIIIllIl)this.llIllIIIIIllIlIIIIlI.get(5 + ((IIIlIIlIIIIlllIlllII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll()).lIIIIlIIIIIlllIllIII)).IlIlIlIlIlllllllllIl()) {
                final int n2 = 5 + ((IIIlIIlIIIIlllIlllII)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll()).lIIIIlIIIIIlllIllIII;
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, n2, n2 + 1, false)) {
                    return null;
                }
            }
            else if (n >= 9 && n < 36) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 36, 45, false)) {
                    return null;
                }
            }
            else if (n >= 36 && n < 45) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 9, 36, false)) {
                    return null;
                }
            }
            else if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 9, 45, false)) {
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
