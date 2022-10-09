package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IIlllIIlIllIllIlIIll extends llIIlIIIlIIIllIlIIIl
{
    private int IlIllllIIlIllIlIlIll;
    protected static final llllIIllllIlIlIIIIll IIlllIIIllIllIIlIlIl;
    protected static final llllIIllllIlIlIIIIll llIlllIlllllIIllIIII;
    protected static final llllIIIlIlllIlIIIIIl lllllIlIlIlllIlllIlI;
    
    static {
        IIlllIIIllIllIIlIlIl = new llllIIllllIlIlIIIIll(false, true);
        llIlllIlllllIIllIIII = new llllIIllllIlIlIIIIll(false, false);
        lllllIlIlIlllIlllIlI = new llllIIIlIlllIlIIIIIl(false);
    }
    
    public IIlllIIlIllIllIlIIll(final int n, final int ilIllllIIlIllIlIlIll) {
        super(n);
        this.IlIllllIIlIllIlIlIll = ilIllllIIlIllIlIlIll;
        this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 10;
        this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 2;
        if (this.IlIllllIIlIllIlIlIll == 1) {
            this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 6;
            this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 100;
            this.IIllIIIlIIlIlIlIIIII.lllllIlIIIlIlIIlllII = 1;
        }
        this.llllIIIIlIIIlIlllIll(5159473);
        this.llllIIIIlIIIlIlllIll(0.7f, 0.8f);
        if (this.IlIllllIIlIllIlIlIll == 2) {
            this.IIIllIIIlIlIIllIIIlI = 353825;
            this.llIIIllIlIllIllIIIIl = 3175492;
            this.llllIIIIlIIIlIlllIll(0.6f, 0.6f);
        }
        if (this.IlIllllIIlIllIlIlIll == 0) {
            this.lllllIIllIlIllIllllI.add(new lIlIlIIIllIIllIIIllI(IIIllllllIllIIIlllIl.class, 5, 4, 4));
        }
        if (this.IlIllllIIlIllIlIlIll == 3) {
            this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = -999;
        }
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int llIIIllIlIllIllIIIIl, final boolean b) {
        if (this.IlIllllIIlIllIlIlIll == 2) {
            this.IIIllIIIlIlIIllIIIlI = 353825;
            this.llIIIllIlIllIllIIIIl = llIIIllIlIllIllIIIIl;
            if (b) {
                this.IIIllIIIlIlIIllIIIlI = (this.IIIllIIIlIlIIllIIIlI & 0xFEFEFE) >> 1;
            }
            return this;
        }
        return super.llllIIIIlIIIlIlllIll(llIIIllIlIllIllIIIIl, b);
    }
    
    @Override
    public llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return (this.IlIllllIIlIllIlIlIll == 3 && random.nextInt(3) > 0) ? IIlllIIlIllIllIlIIll.lllllIlIlIlllIlllIlI : ((this.IlIllllIIlIllIlIlIll != 2 && random.nextInt(5) != 0) ? this.IIllIIIlIIIIlIIlIIII : IIlllIIlIllIllIlIIll.llIlllIlllllIIllIIII);
    }
    
    @Override
    public llIllIIlllllllllllll llllIIIIlIIIlIlllIll(final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IlIllllIIlIllIlIlIll == 1) {
            final llIllIIlllllllllllll llIllIIlllllllllllll = net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.values()[(int)(net.minecraft.IlllllllIIIlIIIlIlII.llIllIIlllllllllllll.llllIIIIlIIIlIlllIll((1.0 + IIlllIIlIllIllIlIIll.IllIIlllllIIllIIllIl.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() / 48.0, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() / 48.0)) / 2.0, 0.0, 0.9999) * net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.values().length)];
            return (llIllIIlllllllllllll == net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI) ? net.minecraft.llllIIIIlIIIlIlllIll.llIllIIlllllllllllll.IlIlIlIlIlllllllllIl : llIllIIlllllllllllll;
        }
        return super.llllIIIIlIIIlIlllIll(random, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (this.IlIllllIIlIllIlIlIll == 3) {
            for (int i = 0; i < 4; ++i) {
                for (int j = 0; j < 4; ++j) {
                    final IlIlIlIlIlllllllllIl iiiIlllIIIIIIlIIIlll = illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i * 4 + 1 + 8 + random.nextInt(3), 0, j * 4 + 1 + 8 + random.nextInt(3)));
                    if (random.nextInt(20) == 0) {
                        new net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, iiiIlllIIIIIIlIIIlll);
                    }
                    else {
                        final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(random);
                        llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
                        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, iiiIlllIIIIIIlIIIlll)) {
                            llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, random, iiiIlllIIIIIIlIIIlll);
                        }
                    }
                }
            }
        }
        int n = random.nextInt(5) - 3;
        if (this.IlIllllIIlIllIlIlIll == 1) {
            n += 2;
        }
        for (int k = 0; k < n; ++k) {
            final int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                IIlllIIlIllIllIlIIll.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl);
            }
            else if (nextInt == 1) {
                IIlllIIlIllIllIlIIll.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IlIlIIIllIllIIIIIllI);
            }
            else if (nextInt == 2) {
                IIlllIIlIllIllIlIIll.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.IllIIlllIIIIlllIIlIl);
            }
            for (int l = 0; l < 5; ++l) {
                final int n2 = random.nextInt(16) + 8;
                final int n3 = random.nextInt(16) + 8;
                if (IIlllIIlIllIllIlIIll.lIllIIIIIlllIIlIIllI.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n2, random.nextInt(illlllllIIIlIIIlIlII.IIIIlllIIIIIIlIIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n2, 0, n3)).lIIIlllIIIllIIIllIII() + 32), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n3))) {
                    break;
                }
            }
        }
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int ilIlIlIlIlllllllllIl2 = super.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        return (this.IlIllllIIlIllIlIlIll == 3) ? ((ilIlIlIlIlllllllllIl2 & 0xFEFEFE) + 2634762 >> 1) : ilIlIlIlIlllllllllIl2;
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final int n) {
        if (this.lIIIIIlIlIIIlIIIIlIl == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIllIIllIIIlIlIIIIlI.lIIIIIlIlIIIlIIIIlIl) {
            final IIlllIIlIllIllIlIIll illlIIlIllIllIlIIll = new IIlllIIlIllIllIlIIll(n, 1);
            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(new llIllIlIIIIllIlIIllI(this.IIlllllIllIllIlIlIII, this.llllIllllIllllIlIlII + 0.2f));
            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll("Flower Forest");
            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(6976549, true);
            illlIIlIllIllIlIIll.llllIIIIlIIIlIlllIll(8233509);
            return illlIIlIllIllIlIIll;
        }
        return (this.lIIIIIlIlIIIlIIIIlIl != net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIlIlIIlIllIIIIIIl.lIIIIIlIlIIIlIIIIlIl && this.lIIIIIlIlIIIlIIIIlIl != net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IllIllIIIIlIIlIlllII.lIIIIIlIlIIIlIIIIlIl) ? new lllIIIIlllllIlIIllIl(this, n, this) : new IlIlIIIIIIlllIlIllIl(this, n, this);
    }
}
