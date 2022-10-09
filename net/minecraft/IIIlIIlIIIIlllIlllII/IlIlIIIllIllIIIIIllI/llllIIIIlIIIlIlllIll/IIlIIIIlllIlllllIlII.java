package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IIlIIIIlllIlllllIlII extends IlIlIIIIIIlllIlIllIl
{
    public IIlIIIIlllIlllllIlII(final boolean b, final int n, final int n2, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2) {
        super(b, n, n2, llIIlIIIlIIIllIlIIIl, llIIlIIIlIIIllIlIIIl2);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(random);
        if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll)) {
            return false;
        }
        this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll), 2);
        for (int i = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + llllIIIIlIIIlIlllIll - 2 - random.nextInt(4); i > ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + llllIIIIlIIIlIlllIll / 2; i -= 2 + random.nextInt(4)) {
            final float n = random.nextFloat() * 3.1415927f * 2.0f;
            int n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (int)(0.5f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n) * 4.0f);
            int n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (int)(0.5f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n) * 4.0f);
            for (int j = 0; j < 5; ++j) {
                n2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + (int)(1.5f + llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(n) * j);
                n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + (int)(1.5f + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(n) * j);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(n2, i - 3 + j / 2, n3), this.IlIlIlIlIlllllllllIl);
            }
            final int n4 = 1 + random.nextInt(2);
            for (int n5 = i, k = i - n4; k <= n5; ++k) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, new IlIlIlIlIlllllllllIl(n2, k, n3), 1 - (k - n5));
            }
        }
        for (int l = 0; l < llllIIIIlIIIlIlllIll; ++l) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l);
            if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI())) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, this.IlIlIlIlIlllllllllIl);
                if (l > 0) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, llllIIIIlIIIlIlllIll2.IlIlIIIllIllIIIIIllI(), dk.IlllIIIIlIIIlIlIlIIl);
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, llllIIIIlIIIlIlllIll2.llIllIIIIIllIlIIIIlI(), dk.lllIllIIIllllllIllll);
                }
            }
            if (l < llllIIIIlIIIlIlllIll - 1) {
                final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll2.IllIIlllIIIIlllIIlIl();
                if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI())) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, illIIlllIIIIlllIIlIl, this.IlIlIlIlIlllllllllIl);
                    if (l > 0) {
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl.IllIIlllIIIIlllIIlIl(), dk.llIllIlIlIIIIIIIllII);
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI(), dk.lllIllIIIllllllIllll);
                    }
                }
                final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl2 = llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl().IllIIlllIIIIlllIIlIl();
                if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl2).llIllIIIIIllIlIIIIlI())) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, illIIlllIIIIlllIIlIl2, this.IlIlIlIlIlllllllllIl);
                    if (l > 0) {
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl2.IllIIlllIIIIlllIIlIl(), dk.llIllIlIlIIIIIIIllII);
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, illIIlllIIIIlllIIlIl2.IlIIIlIlIIIllIlIlIIl(), dk.IIllllIIIlIIIIIIllIl);
                    }
                }
                final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll2.IlIIIlIlIIIllIlIlIIl();
                if (this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI())) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIIIlIlIIIllIlIlIIl, this.IlIlIlIlIlllllllllIl);
                    if (l > 0) {
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIIIlIlIIIllIlIlIIl.IlIlIIIllIllIIIIIllI(), dk.IlllIIIIlIIIlIlIlIIl);
                        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIIIlIlIIIllIlIlIIl.IlIIIlIlIIIllIlIlIIl(), dk.IIllllIIIlIIIIIIllIl);
                    }
                }
            }
        }
        return true;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        if (random.nextInt(3) > 0 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl)) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, true));
        }
    }
    
    private void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        for (int i = -2; i <= 0; ++i) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i), n + 1 - i);
        }
    }
}
