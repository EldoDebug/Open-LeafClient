package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIlIIlIIIIlllIlllII extends IlIlIIIIIIlllIlIllIl
{
    private static final llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI;
    private static final llIIlIIIlIIIllIlIIIl IllIIlllIIIIlllIIlIl;
    private static final llIIlIIIlIIIllIlIIIl llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    
    static {
        IlIlIIIllIllIIIIIllI = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.IlIlIlIlIlllllllllIl);
        IllIIlllIIIIlllIIlIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
        llllIIIlIlllIlIIIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI, IlIllllIIlIIlIlIlIll.llIllIIIIIllIlIIIIlI);
    }
    
    public IIIlIIlIIIIlllIlllII(final boolean b, final boolean liiiIlIIIIIlllIllIII) {
        super(b, 13, 15, IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI, IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl);
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(random);
        if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll)) {
            return false;
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + llllIIIIlIIIlIlllIll, 0, random);
        for (int i = 0; i < llllIIIIlIIIlIlllIll; ++i) {
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i)).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i), this.IlIlIlIlIlllllllllIl);
            }
            if (i < llllIIIIlIIIlIlllIll - 1) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, i, 0)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, i, 0), this.IlIlIlIlIlllllllllIl);
                }
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, i, 1)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, i, 1), this.IlIlIlIlIlllllllllIl);
                }
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI4 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, i, 1)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI4.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI4.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, i, 1), this.IlIlIlIlIlllllllllIl);
                }
            }
        }
        return true;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final int n2, final int n3, final int n4, final Random random) {
        final int n5 = random.nextInt(5) + (this.lIIIIlIIIIIlllIllIII ? this.llllIIIIlIIIlIlllIll : 3);
        int n6 = 0;
        for (int i = n3 - n5; i <= n3; ++i) {
            final int n7 = n3 - i;
            final int n8 = n4 + llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl(n7 / (float)n5 * 3.5f);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(n, i, n2), n8 + ((n7 > 0 && n8 == n6 && (i & 0x1) == 0x0) ? 1 : 0));
            n6 = n8;
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().llIllIIIIIllIlIIIIlI());
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(2).llIllIIIIIllIlIIIIlI());
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI().IlIIIlIlIIIllIlIlIIl(2));
        this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl(2).IlIIIlIlIIIllIlIlIIl(2));
        for (int i = 0; i < 5; ++i) {
            final int nextInt = random.nextInt(64);
            final int n = nextInt % 8;
            final int n2 = nextInt / 8;
            if (n == 0 || n == 7 || n2 == 0 || n2 == 7) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-3 + n, 0, -3 + n2));
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (Math.abs(i) != 2 || Math.abs(j) != 2) {
                    this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j));
                }
            }
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = 2; i >= -3; --i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI();
            if (llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, IIIlIIlIIIIlllIlllII.llllIIIlIlllIlIIIIIl);
                break;
            }
            if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && i < 0) {
                break;
            }
        }
    }
}
