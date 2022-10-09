package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class IlIIlllIIlIlllllIIlI extends llllIIIIlIIIlIlllIll
{
    public static final IllIIlllIIIIlllIIlIl IIllllIIIlIIIIIIllIl;
    
    static {
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IllIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll("level", 0, 15);
    }
    
    protected IlIIlllIIlIlllllIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl, 0));
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        this.llllIIIIlIIIlIlllIll(true);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return this.llllllIllIllIlIllllI != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) ? net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl) : 16777215;
    }
    
    public static float IlIlIIIllIllIIIIIllI(int n) {
        if (n >= 8) {
            n = 0;
        }
        return (n + 1) / 9.0f;
    }
    
    protected int IlIlIIIllIllIIIIIllI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (int)((lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == this.llllllIllIllIlIllllI) ? lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl) : -1);
    }
    
    protected int IllIIlllIIIIlllIIlIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
        return (ilIlIIIllIllIIIIIllI >= 8) ? 0 : ilIlIIIllIllIIIIIllI;
    }
    
    @Override
    public boolean llIIlIIIlIIIllIlIIIl() {
        return false;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return false;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final boolean b) {
        return b && (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl) == 0;
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
        return illIIlllIIIIlllIIlIl != this.llllllIllIllIlIllllI && (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl || (illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlllllllIIIlIIIlIlII && super.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll)));
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        return lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != this.llllllIllIllIlIllllI && (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl || super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl, lllIllIIIllllllIllll));
    }
    
    public boolean llllIIIlIlllIlIIIIIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, 0, j)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != this.llllllIllIllIlIllllI && !llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return null;
    }
    
    @Override
    public int llIllIlIIIIllIlIIllI() {
        return 1;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return null;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return 0;
    }
    
    protected e lIIIIlIIIIIlllIllIII(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        e e = new e(0.0, 0.0, 0.0);
        final int illIIlllIIIIlllIIlIl = this.IllIIlllIIIIlllIIlIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
        final Iterator iterator = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
        while (iterator.hasNext()) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator.next());
            final int illIIlllIIIIlllIIlIl2 = this.IllIIlllIIIIlllIIlIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll);
            if (illIIlllIIIIlllIIlIl2 < 0) {
                if (lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIIIlIlIIIllIlIlIIl()) {
                    continue;
                }
                final int illIIlllIIIIlllIIlIl3 = this.IllIIlllIIIIlllIIlIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl());
                if (illIIlllIIIIlllIIlIl3 < 0) {
                    continue;
                }
                final int n = illIIlllIIIIlllIIlIl3 - (illIIlllIIIIlllIIlIl - 8);
                e = e.IlIlIlIlIlllllllllIl((llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII()) * n, (llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) * n, (llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()) * n);
            }
            else {
                if (illIIlllIIIIlllIIlIl2 < 0) {
                    continue;
                }
                final int n2 = illIIlllIIIIlllIIlIl2 - illIIlllIIIIlllIIlIl;
                e = e.IlIlIlIlIlllllllllIl((llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII()) * n2, (llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) * n2, (llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl()) * n2);
            }
        }
        if ((int)lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl) >= 8) {
            for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                if (this.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll) || this.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(), lllIllIIIllllllIllll)) {
                    e = e.llllIIIIlIIIlIlllIll().IlIlIlIlIlllllllllIl(0.0, -6.0, 0.0);
                    break;
                }
            }
        }
        return e.llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public e llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final e e) {
        return e.IlIlIIIllIllIIIIIllI(this.lIIIIlIIIIIlllIllIII((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl));
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        return (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) ? 5 : ((this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) ? (illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.llllIIllllIlIlIIIIll() ? 10 : 30) : 0);
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, 0);
        final int llllIIIIlIIIlIlllIll2 = lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(), 0);
        final int n = llllIIIIlIIIlIlllIll & 0xFF;
        final int n2 = llllIIIIlIIIlIlllIll2 & 0xFF;
        final int n3 = llllIIIIlIIIlIlllIll >> 16 & 0xFF;
        final int n4 = llllIIIIlIIIlIlllIll2 >> 16 & 0xFF;
        return ((n > n2) ? n : n2) | ((n3 > n4) ? n3 : n4) << 16;
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) ? IlIIlIlIIIlIIlIlIlII.IlIIIlIlIIIllIlIlIIl : IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        final double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            final int intValue = (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl);
            if (intValue > 0 && intValue < 8) {
                if (random.nextInt(64) == 0) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n + 0.5, n2 + 0.5, n3 + 0.5, "liquid.water", random.nextFloat() * 0.25f + 0.75f, random.nextFloat() * 1.0f + 0.5f, false);
                }
            }
            else if (random.nextInt(10) == 0) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.lIIIIlIIIIIlllIllIII, n + random.nextFloat(), n2 + random.nextFloat(), n3 + random.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
            }
        }
        if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().llllIIllllIlIlIIIIll()) {
            if (random.nextInt(100) == 0) {
                final double n4 = n + random.nextFloat();
                final double n5 = n2 + this.lIllllllIIllIlIlIlII;
                final double n6 = n3 + random.nextFloat();
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.llIIIlIlIllIIlIlIlII, n4, n5, n6, 0.0, 0.0, 0.0, new int[0]);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n4, n5, n6, "liquid.lavapop", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
            if (random.nextInt(200) == 0) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n, n2, n3, "liquid.lava", 0.2f + random.nextFloat() * 0.2f, 0.9f + random.nextFloat() * 0.15f, false);
            }
        }
        if (random.nextInt(10) == 0 && net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl())) {
            final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(2)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
            if (!illIIlllIIIIlllIIlIl.IlIIIlIlIIIllIlIlIIl() && !illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll()) {
                final double n7 = n + random.nextFloat();
                final double n8 = n2 - 1.05;
                final double n9 = n3 + random.nextFloat();
                if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIIIIIIlllIlIllIl, n7, n8, n9, 0.0, 0.0, 0.0, new int[0]);
                }
                else {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IIllIIllIIIlIlIIIIlI, n7, n8, n9, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
    }
    
    public static double llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        final e liiiIlIIIIIlllIllIII = llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2).lIIIIlIIIIIlllIllIII(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
        return (liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll == 0.0 && liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI == 0.0) ? -1000.0 : (llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll) - 1.5707963267948966);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    public boolean IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
            boolean b = false;
            lllIllIIIllllllIllll[] values;
            for (int length = (values = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.values()).length, i = 0; i < length; ++i) {
                final lllIllIIIllllllIllll lllIllIIIllllllIllll = values[i];
                if (lllIllIIIllllllIllll != net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                    b = true;
                    break;
                }
            }
            if (b) {
                final Integer n = (Integer)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl);
                if (n == 0) {
                    illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIlllIIlIlIlllIl.lllIllIIIllllllIllll());
                    this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                    return true;
                }
                if (n <= 4) {
                    illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll());
                    this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                    return true;
                }
            }
        }
        return false;
    }
    
    protected void lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final double n = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final double n2 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final double n3 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(n + 0.5, n2 + 0.5, n3 + 0.5, "random.fizz", 0.5f, 2.6f + (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() - illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat()) * 0.8f);
        for (int i = 0; i < 8; ++i) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIIIllIIllIlllllI, n + Math.random(), n2 + 1.2, n3 + Math.random(), 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        return this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl, n);
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return (int)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl);
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IlIIlllIIlIlllllIIlI.IIllllIIIlIIIIIIllIl });
    }
    
    public static IllIIlllllIIllIIllIl llllIIIIlIIIlIlllIll(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII;
        }
        if (ilIlIlIlIlllllllllIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
            return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIlIIIIllIlIIllI;
        }
        throw new IllegalArgumentException("Invalid material");
    }
    
    public static cq IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (ilIlIlIlIlllllllllIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl;
        }
        if (ilIlIlIlIlllllllllIl == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
            return net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI;
        }
        throw new IllegalArgumentException("Invalid material");
    }
}
