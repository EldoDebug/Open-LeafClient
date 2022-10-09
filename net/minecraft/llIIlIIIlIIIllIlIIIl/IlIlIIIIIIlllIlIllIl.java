package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlIlIIIIIIlllIlIllIl extends IlIlIlIlIlllllllllIl
{
    private llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll;
    private IlIIIlIIIllllIlIlIlI IllIIlllIIIIlllIIlIl;
    private final IlllllllIIIlIIIlIlII llllIIIlIlllIlIIIIIl;
    
    public IlIlIIIIIIlllIlIllIl(final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final llIIlllIIlllIIllIllI llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII llllIIIlIlllIlIIIIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.IllIIlllIIIIlllIIlIl = new IlIIIlIIIllllIlIlIlI(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll);
        this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(this.IllIIlllIIIIlllIIlIl, 0, 36, 53));
        this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(this.IllIIlllIIIIlllIIlIl, 1, 62, 53));
        this.IlIlIlIlIlllllllllIl(new lllIllIIIllllllIllll(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl, llllIIIIlIIIlIlllIll, this.IllIIlllIIIIlllIIlIl, 2, 120, 53));
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 9; ++j) {
                this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }
        for (int k = 0; k < 9; ++k) {
            this.IlIlIlIlIlllllllllIl(new IIIIIllIIIIlIIIIllIl(illIIlllIIIIlllIIlIl, k, 8 + k * 18, 142));
        }
    }
    
    public IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIlIllllllllIIIIlII ilIlIllllllllIIIIlII) {
        super.llllIIIIlIIIlIlllIll(ilIlIllllllllIIIIlII);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI() {
        super.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llIIIlIlIllIIlIlIlII llIIIlIlIllIIlIlIlII) {
        this.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl();
        super.llllIIIIlIIIlIlllIll(llIIIlIlIllIIlIlIlII);
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final int n) {
        this.IllIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl(n);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final int n, final int n2) {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll() == llllIIIIlIIIlIlllIll;
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
            else if (n != 0 && n != 1) {
                if (n >= 3 && n < 30) {
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
    
    @Override
    public void IlIlIlIlIlllllllllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((llllIIIIlIIIlIlllIll)null);
        super.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        if (!this.llllIIIlIlllIlIIIIIl.IlIlIllllllllIIIIlII) {
            final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI = this.IllIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI(0);
            if (ilIlIIIllIIllIlllllI != null) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI, false);
            }
            final lllIIIIlIlIllIIlIIIl ilIlIIIllIIllIlllllI2 = this.IllIIlllIIIIlllIIlIl.IlIlIIIllIIllIlllllI(1);
            if (ilIlIIIllIIllIlllllI2 != null) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIIIllIIllIlllllI2, false);
            }
        }
    }
}
