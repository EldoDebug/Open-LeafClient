package net.minecraft.IIIIlllIIIIIIlIIIlll;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl extends IlIIIlIlIIIllIlIlIIl
{
    protected llIllIIIIIllIlIIIIlI IlIlIIIllIllIIIIIllI;
    private boolean IllIIlllIIIIlllIIlIl;
    
    public IllIIlllIIIIlllIIlIl(final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        super(ilIllIlIlIIIlIlIlIII, illlllllIIIlIIIlIlII);
    }
    
    @Override
    protected net.minecraft.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll() {
        (this.IlIlIIIllIllIIIIIllI = new llIllIIIIIllIlIIIIlI()).llllIIIIlIIIlIlllIll(true);
        return new net.minecraft.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI(this.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    protected boolean lIIIlllIIIllIIIllIII() {
        return this.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl || (this.IIIIlllIIIIIIlIIIlll() && this.llIIlIIIlIIIllIlIIIl()) || (this.llllIIIIlIIIlIlllIll.IIllIIIlIIIIlIIlIIII() && this.llllIIIIlIIIlIlllIll instanceof llIlIIIIIlIIlIlIIlll && this.llllIIIIlIIIlIlllIll.IIIlIIIlIlIIlllIIlll instanceof net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    protected e lIIIIlIIIIIlllIllIII() {
        return new e(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, this.llllIIllllIlIlIIIIll(), this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII);
    }
    
    private int llllIIllllIlIlIIIIll() {
        if (this.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI() && this.IIIIlllIIIIIIlIIIlll()) {
            int n = (int)this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl;
            net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl), n, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI();
            int n2 = 0;
            while (llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl) {
                ++n;
                llllIIIIlIIIlIlllIll = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl), n, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII))).llIllIIIIIllIlIIIIlI();
                if (++n2 > 16) {
                    return (int)this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl;
                }
            }
            return n;
        }
        return (int)(this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5);
    }
    
    @Override
    protected void llIllIlIIIIllIlIIllI() {
        super.llIllIlIIIIllIlIIllI();
        if (this.IllIIlllIIIIlllIIlIl) {
            if (this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(new IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl), (int)(this.llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(this.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII)))) {
                return;
            }
            for (int i = 0; i < this.llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(); ++i) {
                final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(i);
                if (this.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(new IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI))) {
                    this.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(i - 1);
                    return;
                }
            }
        }
    }
    
    @Override
    protected boolean llllIIIIlIIIlIlllIll(final e e, final e e2, int n, final int n2, int n3) {
        int llIllIIIIIllIlIIIIlI = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e.llllIIIIlIIIlIlllIll);
        int llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e.llIllIIIIIllIlIIIIlI);
        final double n4 = e2.llllIIIIlIIIlIlllIll - e.llllIIIIlIIIlIlllIll;
        final double n5 = e2.llIllIIIIIllIlIIIIlI - e.llIllIIIIIllIlIIIIlI;
        final double n6 = n4 * n4 + n5 * n5;
        if (n6 < 1.0E-8) {
            return false;
        }
        final double n7 = 1.0 / Math.sqrt(n6);
        final double n8 = n4 * n7;
        final double n9 = n5 * n7;
        n += 2;
        n3 += 2;
        if (!this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, (int)e.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI2, n, n2, n3, e, n8, n9)) {
            return false;
        }
        n -= 2;
        n3 -= 2;
        final double n10 = 1.0 / Math.abs(n8);
        final double n11 = 1.0 / Math.abs(n9);
        double n12 = llIllIIIIIllIlIIIIlI * 1 - e.llllIIIIlIIIlIlllIll;
        double n13 = llIllIIIIIllIlIIIIlI2 * 1 - e.llIllIIIIIllIlIIIIlI;
        if (n8 >= 0.0) {
            ++n12;
        }
        if (n9 >= 0.0) {
            ++n13;
        }
        double n14 = n12 / n8;
        double n15 = n13 / n9;
        final int n16 = (n8 < 0.0) ? -1 : 1;
        final int n17 = (n9 < 0.0) ? -1 : 1;
        final int llIllIIIIIllIlIIIIlI3 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e2.llllIIIIlIIIlIlllIll);
        final int llIllIIIIIllIlIIIIlI4 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(e2.llIllIIIIIllIlIIIIlI);
        int n18 = llIllIIIIIllIlIIIIlI3 - llIllIIIIIllIlIIIIlI;
        int n19 = llIllIIIIIllIlIIIIlI4 - llIllIIIIIllIlIIIIlI2;
        while (n18 * n16 > 0 || n19 * n17 > 0) {
            if (n14 < n15) {
                n14 += n10;
                llIllIIIIIllIlIIIIlI += n16;
                n18 = llIllIIIIIllIlIIIIlI3 - llIllIIIIIllIlIIIIlI;
            }
            else {
                n15 += n11;
                llIllIIIIIllIlIIIIlI2 += n17;
                n19 = llIllIIIIIllIlIIIIlI4 - llIllIIIIIllIlIIIIlI2;
            }
            if (!this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, (int)e.IlIlIlIlIlllllllllIl, llIllIIIIIllIlIIIIlI2, n, n2, n3, e, n8, n9)) {
                return false;
            }
        }
        return true;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final e e, final double n7, final double n8) {
        final int n9 = n - n4 / 2;
        final int n10 = n3 - n6 / 2;
        if (!this.IlIlIlIlIlllllllllIl(n9, n2, n10, n4, n5, n6, e, n7, n8)) {
            return false;
        }
        for (int i = n9; i < n9 + n4; ++i) {
            for (int j = n10; j < n10 + n6; ++j) {
                if ((i + 0.5 - e.llllIIIIlIIIlIlllIll) * n7 + (j + 0.5 - e.llIllIIIIIllIlIIIIlI) * n8 >= 0.0) {
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(i, n2 - 1, j)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
                    if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        return false;
                    }
                    if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII && !this.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI()) {
                        return false;
                    }
                    if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    private boolean IlIlIlIlIlllllllllIl(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final e e, final double n7, final double n8) {
        for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl : net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(new IlIlIlIlIlllllllllIl(n, n2, n3), new IlIlIlIlIlllllllllIl(n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1))) {
            if ((ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 0.5 - e.llllIIIIlIIIlIlllIll) * n7 + (ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 0.5 - e.llIllIIIIIllIlIIIIlI) * n8 >= 0.0 && !this.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll((lIlIlIIIllIIllIIIllI)this.IlIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl)) {
                return false;
            }
        }
        return true;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean b) {
        this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI(b);
    }
    
    public boolean lIlIlIIIllIIllIIIllI() {
        return this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean b) {
        this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl(b);
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean b) {
        this.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll(b);
    }
    
    public boolean IlIlIIIllIIllIlllllI() {
        return this.IlIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl();
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final boolean b) {
        this.IlIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl(b);
    }
    
    public boolean IIIIlllIIIIIIlIIIlll() {
        return this.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI();
    }
    
    public void IlIlIIIllIllIIIIIllI(final boolean illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
}
