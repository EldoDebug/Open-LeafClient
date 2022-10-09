package net.minecraft.llIIlIIIlIIIllIlIIIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

public class lllIllIIIllllllIllll extends IIIIIllIIIIlIIIIllIl
{
    private final IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll;
    private llllIIIIlIIIlIlllIll IllIIlllIIIIlllIIlIl;
    private int llllIIIlIlllIlIIIIIl;
    private final llIIlllIIlllIIllIllI lIIIIlIIIIIlllIllIII;
    
    public lllIllIIIllllllIllll(final llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl, final llIIlllIIlllIIllIllI liiiIlIIIIIlllIllIII, final IlIIIlIIIllllIlIlIlI llllIIIIlIIIlIlllIll, final int n, final int n2, final int n3) {
        super(llllIIIIlIIIlIlllIll, n, n2, n3);
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return false;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final int n) {
        if (this.IlIlIlIlIlllllllllIl()) {
            this.llllIIIlIlllIlIIIIIl += Math.min(n, this.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl);
        }
        return super.llllIIIIlIIIlIlllIll(n);
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        this.llllIIIlIlllIlIIIIIl += n;
        this.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl);
    }
    
    @Override
    protected void IlIlIIIllIllIIIIIllI(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll(this.IllIIlllIIIIlllIIlIl.IlllllllIIIlIIIlIlII, this.IllIIlllIIIIlllIIlIl, this.llllIIIlIlllIlIIIIIl);
        this.llllIIIlIlllIlIIIIIl = 0;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        this.IlIlIIIllIllIIIIIllI(lllIIIIlIlIllIIlIIIl);
        final net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll illIIlllIIIIlllIIlIl = this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
        if (illIIlllIIIIlllIIlIl != null) {
            lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(0);
            lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI2 = this.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI(1);
            if (this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, lIlIlIIIllIIllIIIllI, lIlIlIIIllIIllIIIllI2) || this.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, lIlIlIIIllIIllIIIllI2, lIlIlIIIllIIllIIIllI)) {
                this.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IIlIIIIIllIlIIIlIIll);
                if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl <= 0) {
                    lIlIlIIIllIIllIIIllI = null;
                }
                if (lIlIlIIIllIIllIIIllI2 != null && lIlIlIIIllIIllIIIllI2.IlIlIlIlIlllllllllIl <= 0) {
                    lIlIlIIIllIIllIIIllI2 = null;
                }
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(0, lIlIlIIIllIIllIIIllI);
                this.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(1, lIlIlIIIllIIllIIIllI2);
            }
        }
    }
    
    private boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIlIIIIlllIlllllIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2) {
        final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll();
        final lllIIIIlIlIllIIlIIIl ilIlIlIlIlllllllllIl = llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl();
        if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() == llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll()) {
            if (ilIlIlIlIlllllllllIl != null && lllIIIIlIlIllIIlIIIl2 != null && ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll() == lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll()) {
                lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl -= llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl;
                lllIIIIlIlIllIIlIIIl2.IlIlIlIlIlllllllllIl -= ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl;
                return true;
            }
            if (ilIlIlIlIlllllllllIl == null && lllIIIIlIlIllIIlIIIl2 == null) {
                lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl -= llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl;
                return true;
            }
        }
        return false;
    }
}
