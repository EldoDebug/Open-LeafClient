package net.minecraft.IIIlIIlIIIIlllIlllII;

import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class llllIIIIlIIIlIlllIll implements lIlIlIIIllIIllIIIllI
{
    protected int llllIIIIlIIIlIlllIll;
    protected int IlIlIlIlIlllllllllIl;
    protected net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll[][] llIllIIIIIllIlIIIIlI;
    protected boolean IlIIIlIlIIIllIlIlIIl;
    protected IlllllllIIIlIIIlIlII IlIlIIIllIllIIIIIllI;
    
    public llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII ilIlIIIllIllIIIIIllI, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2, final int n) {
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n >> 4;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n >> 4;
        final int n2 = ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() + n >> 4;
        final int n3 = ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() + n >> 4;
        this.llIllIIIIIllIlIIIIlI = new net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll[n2 - this.llllIIIIlIIIlIlllIll + 1][n3 - this.IlIlIlIlIlllllllllIl + 1];
        this.IlIIIlIlIIIllIlIlIIl = true;
        for (int i = this.llllIIIIlIIIlIlllIll; i <= n2; ++i) {
            for (int j = this.IlIlIlIlIlllllllllIl; j <= n3; ++j) {
                this.llIllIIIIIllIlIIIIlI[i - this.llllIIIIlIIIlIlllIll][j - this.IlIlIlIlIlllllllllIl] = ilIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(i, j);
            }
        }
        for (int k = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4; k <= ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() >> 4; ++k) {
            for (int l = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4; l <= ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() >> 4; ++l) {
                final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI[k - this.llllIIIIlIIIlIlllIll][l - this.IlIlIlIlIlllllllllIl];
                if (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII())) {
                    this.IlIIIlIlIIIllIlIlIIl = false;
                }
            }
        }
    }
    
    @Override
    public boolean q_() {
        return this.IlIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llIllIIIIIllIlIIIIlI[(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4) - this.llllIIIIlIIIlIlllIll][(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4) - this.IlIlIlIlIlllllllllIl].llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl);
        int ilIlIlIlIlllllllllIl3 = this.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl3 < n) {
            ilIlIlIlIlllllllllIl3 = n;
        }
        return ilIlIlIlIlllllllllIl2 << 20 | ilIlIlIlIlllllllllIl3 << 4;
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256) {
            final int n = (ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4) - this.llllIIIIlIIIlIlllIll;
            final int n2 = (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4) - this.IlIlIlIlIlllllllllIl;
            if (n >= 0 && n < this.llIllIIIIIllIlIIIIlI.length && n2 >= 0 && n2 < this.llIllIIIIIllIlIIIIlI[n].length) {
                final net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI[n][n2];
                if (llllIIIIlIIIlIlllIll != null) {
                    return llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl);
                }
            }
        }
        return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll();
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
    }
    
    private int IlIlIlIlIlllllllllIl(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (llllIIIlIlllIlIIIIIl == llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll && this.IlIlIIIllIllIIIIIllI.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll()) {
            return 0;
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 0 || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 256) {
            return llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
        }
        if (this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IlIlIIIllIllIIIIIllI()) {
            int n = 0;
            lllIllIIIllllllIllll[] values;
            for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(values[i]));
                if (llllIIIIlIIIlIlllIll > n) {
                    n = llllIIIIlIIIlIlllIll;
                }
                if (n >= 15) {
                    return n;
                }
            }
            return n;
        }
        return this.llIllIIIIIllIlIIIIlI[(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4) - this.llllIIIIlIIIlIlllIll][(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4) - this.IlIlIlIlIlllllllllIl].llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public boolean IlIIIlIlIIIllIlIlIIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 0 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256) {
            return this.llIllIIIIIllIlIIIIlI[(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() >> 4) - this.llllIIIIlIIIlIlllIll][(ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() >> 4) - this.IlIlIlIlIlllllllllIl].llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl, ilIlIlIlIlllllllllIl);
        }
        return llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IlIlIlIlIlllllllllIl(this, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll);
    }
    
    @Override
    public llIllIlIlIIIIIIIllII p_() {
        return this.IlIlIIIllIllIIIIIllI.p_();
    }
}
