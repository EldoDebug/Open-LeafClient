package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class IIIIlllIIIIIIlIIIlll extends IlIlIlIlIlllllllllIl
{
    private final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll;
    private int IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private int lIIIIlIIIIIlllIllIII;
    private int lIIIlllIIIllIIIllIII;
    
    public IIIIlllIIIIIIlIIIlll(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIIlIlIllIIlIlIlII llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(llllIIIIlIIIlIlllIll, 0, 56, 17));
        this.IlIlIlIlIlllllllllIl(new IIllllIIIlIIIIIIllIl(llllIIIIlIIIlIlllIll, 1, 56, 53));
        this.IlIlIlIlIlllllllllIl(new IlllIIIIlIIIlIlIlIIl(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, 2, 116, 35));
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
            if (this.IllIIlllIIIIlllIIlIl != this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(2)) {
                ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 2, this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(2));
            }
            if (this.lIIIIlIIIIIlllIllIII != this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0)) {
                ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 0, this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0));
            }
            if (this.lIIIlllIIIllIIIllIII != this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1)) {
                ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 1, this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1));
            }
            if (this.llllIIIlIlllIlIIIIIl != this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(3)) {
                ilIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(this, 3, this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(3));
            }
        }
        this.IllIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(2);
        this.lIIIIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(0);
        this.lIIIlllIIIllIIIllIII = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(1);
        this.llllIIIlIlllIlIIIIIl = this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(3);
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
            if (n == 2) {
                if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 3, 39, true)) {
                    return null;
                }
                iiiiIllIIIIlIIIIllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llIIlIIIlIIIllIlIIIl);
            }
            else if (n != 1 && n != 0) {
                if (net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2) != null) {
                    if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 0, 1, false)) {
                        return null;
                    }
                }
                else if (IIlIIIIlllIlllllIlII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2)) {
                    if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 1, 2, false)) {
                        return null;
                    }
                }
                else if (n >= 3 && n < 30) {
                    if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 30, 39, false)) {
                        return null;
                    }
                }
                else if (n >= 30 && n < 39 && !this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 3, 30, false)) {
                    return null;
                }
            }
            else if (!this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, 3, 39, false)) {
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
