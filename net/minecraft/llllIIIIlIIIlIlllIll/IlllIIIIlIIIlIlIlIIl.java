package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IlllIIIIlIIIlIlIlIIl extends IIlIIIIlllIlllllIlII implements dt
{
    public static final IllIIlllIIIIlllIIlIl IIIIIIIIIlllIllIlIlI;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("age", 0, 7);
    }
    
    protected IlllIIIIlIIIlIlIlIIl() {
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI, 0));
        this.llllIIIIlIIIlIlllIll(true);
        final float n = 0.5f;
        this.llllIIIIlIIIlIlllIll(0.5f - n, 0.0f, 0.5f - n, 0.5f + n, 0.25f, 0.5f + n);
        this.llllIIIIlIIIlIlllIll((net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll)null);
        this.llIllIIIIIllIlIIIIlI(0.0f);
        this.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IllIIlllIIIIlllIIlIl);
        this.IIlllIIIlIlllIIlllII();
    }
    
    @Override
    protected boolean llIllIIIIIllIlIIIIlI(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        return llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        super.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, random);
        if (illlllllIIIlIIIlIlII.IlIlIIIllIIllIlllllI(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) >= 9) {
            final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI);
            if (intValue < 7 && random.nextInt((int)(25.0f / llllIIIIlIIIlIlllIll(this, illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl)) + 1) == 0) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI, intValue + 1), 2);
            }
        }
    }
    
    public void llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI) + llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, 2, 5);
        if (n > 7) {
            n = 7;
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI, n), 2);
    }
    
    protected static float llllIIIIlIIIlIlllIll(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        float n = 1.0f;
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                float n2 = 0.0f;
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(i, 0, j));
                if (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII) {
                    n2 = 1.0f;
                    if ((int)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(lllllIIlIlIIIlIlIIIl.IIIIIIIIIlllIllIlIlI) > 0) {
                        n2 = 3.0f;
                    }
                }
                if (i != 0 || j != 0) {
                    n2 /= 4.0f;
                }
                n += n2;
            }
        }
        final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl = ilIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl();
        final IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI = ilIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI();
        final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = ilIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl();
        final boolean b = llllIIIIlIIIlIlllIll == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI() || llllIIIIlIIIlIlllIll == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI();
        final boolean b2 = llllIIIIlIIIlIlllIll == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI).llIllIIIIIllIlIIIIlI() || llllIIIIlIIIlIlllIll == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI();
        if (b && b2) {
            n /= 2.0f;
        }
        else if (llllIIIIlIIIlIlllIll == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI() || llllIIIIlIIIlIlllIll == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.llIllIIIIIllIlIIIIlI()).llIllIIIIIllIlIIIIlI() || llllIIIIlIIIlIlllIll == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI() || llllIIIIlIIIlIlllIll == illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI.IlIIIlIlIIIllIlIlIIl()).llIllIIIIIllIlIIIIlI()) {
            n /= 2.0f;
        }
        return n;
    }
    
    @Override
    public boolean IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (illlllllIIIlIIIlIlII.lIlIlIIIllIIllIIIllI(ilIlIlIlIlllllllllIl) >= 8 || illlllllIIIlIIIlIlII.llIIlIIIlIIIllIlIIIl(ilIlIlIlIlllllllllIl)) && this.llIllIIIIIllIlIIIIlI(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI());
    }
    
    protected IlIIIlIlIIIllIlIlIIl IllIllIIIIlIIlIlllII() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.IlllIIIIlIIIlIlIlIIl;
    }
    
    protected IlIIIlIlIIIllIlIlIIl IlIllllIIlIIlIlIlIll() {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, n, 0);
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI);
            if (intValue >= 7) {
                for (int n3 = 3 + n2, i = 0; i < n3; ++i) {
                    if (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(15) <= intValue) {
                        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(this.IllIllIIIIlIIlIlllII(), 1, 0));
                    }
                }
            }
        }
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return ((int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI) == 7) ? this.IlIllllIIlIIlIlIlIll() : this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI) < 7;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return true;
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI, n);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IlllIIIIlIIIlIlIlIIl.IIIIIIIIIlllIllIlIlI });
    }
}
