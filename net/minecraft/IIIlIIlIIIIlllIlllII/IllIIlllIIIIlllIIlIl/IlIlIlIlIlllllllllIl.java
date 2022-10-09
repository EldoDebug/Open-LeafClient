package net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIlIlIlllllllllIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        super.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        return this.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().llIllIIIIIllIlIIIIlI));
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3) {
        return this.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n - llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII / 2.0f), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2 + 0.5), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3 - llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII / 2.0f));
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII[] array, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2, final float n) {
        int n2 = 0;
        lllIllIIIllllllIllll[] values;
        for (int length = (values = lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
            final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
            final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll + lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII(), liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl + lllIllIIIllllllIllll.lIIIlllIIIllIIIllIII(), liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI + lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl());
            if (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2) < n) {
                array[n2++] = llllIIIIlIIIlIlllIll;
            }
        }
        return n2;
    }
    
    private lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final int n2, final int n3) {
        return (this.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI, n, n2, n3) == -1) ? this.llllIIIIlIIIlIlllIll(n, n2, n3) : null;
    }
    
    private int IlIlIlIlIlllllllllIl(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final int n2, final int n3) {
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
        for (int i = n; i < n + this.llIllIIIIIllIlIIIIlI; ++i) {
            for (int j = n2; j < n2 + this.IlIIIlIlIIIllIlIlIIl; ++j) {
                for (int k = n3; k < n3 + this.IlIlIIIllIllIIIIIllI; ++k) {
                    if (this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, j, k)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                        return 0;
                    }
                }
            }
        }
        return -1;
    }
}
