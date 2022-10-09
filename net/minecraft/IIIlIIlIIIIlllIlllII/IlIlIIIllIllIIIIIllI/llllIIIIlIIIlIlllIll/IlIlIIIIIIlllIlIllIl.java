package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class IlIlIIIIIIlllIlIllIl extends llllIIIIlIIIlIlllIll
{
    protected final int llllIIIIlIIIlIlllIll;
    protected final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    protected final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    protected int IlIIIlIlIIIllIlIlIIl;
    
    public IlIlIIIIIIlllIlIllIl(final boolean b, final int llllIIIIlIIIlIlllIll, final int ilIIIlIlIIIllIlIlIIl, final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI) {
        super(b);
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    protected int llllIIIIlIIIlIlllIll(final Random random) {
        int n = random.nextInt(3) + this.llllIIIIlIIIlIlllIll;
        if (this.IlIIIlIlIIIllIlIlIIl > 1) {
            n += random.nextInt(this.IlIIIlIlIIIllIlIlIIl);
        }
        return n;
    }
    
    private boolean llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        boolean b = true;
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 1 && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n + 1 <= 256) {
            for (int i = 0; i <= 1 + n; ++i) {
                int n2 = 2;
                if (i == 0) {
                    n2 = 1;
                }
                else if (i >= 1 + n - 2) {
                    n2 = 2;
                }
                for (int n3 = -n2; n3 <= n2 && b; ++n3) {
                    for (int n4 = -n2; n4 <= n2 && b; ++n4) {
                        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + i < 0 || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + i >= 256 || !this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n3, i, n4)).llIllIIIIIllIlIIIIlI())) {
                            b = false;
                        }
                    }
                }
            }
            return b;
        }
        return false;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
        if ((llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() >= 2) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2.IllIIlllIIIIlllIIlIl());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2.IlIIIlIlIIIllIlIlIIl());
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2.IlIIIlIlIIIllIlIlIIl().IllIIlllIIIIlllIIlIl());
            return true;
        }
        return false;
    }
    
    protected boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, n) && this.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, illlllllIIIlIIIlIlII);
    }
    
    protected void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int n2 = n * n;
        for (int i = -n; i <= n + 1; ++i) {
            for (int j = -n; j <= n + 1; ++j) {
                final int n3 = i - 1;
                final int n4 = j - 1;
                if (i * i + j * j <= n2 || n3 * n3 + n4 * n4 <= n2 || i * i + n4 * n4 <= n2 || n3 * n3 + j * j <= n2) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
                    if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI);
                    }
                }
            }
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        final int n2 = n * n;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                if (i * i + j * j <= n2) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
                    if (illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || illIIlllIIIIlllIIlIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, this.llIllIIIIIllIlIIIIlI);
                    }
                }
            }
        }
    }
}
