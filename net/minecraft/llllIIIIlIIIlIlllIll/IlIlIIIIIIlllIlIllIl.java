package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IlIlIIIIIIlllIlIllIl extends IIlIlIlIIlIllIIIIIIl
{
    public static final IlIIIlIlIIIllIlIlIIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll("part", IIllIIllIIIlIlIIIIlI.class);
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("occupied");
    }
    
    public IlIlIIIIIIlllIlIllIl() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IIIIlllIIIIIIlIIIlll);
        this.lIIIIlIIIIIlllIllIII(this.IIIIIllIIIIlIIIIllIl.IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI, net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl, false));
        this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI) != net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
            llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl));
            llIIlIIIlIIIllIlIIIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() != this) {
                return true;
            }
        }
        if (!illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IlIlIIIllIllIIIIIllI() || illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll) == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.IIlIIIIlllIlllllIlII) {
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll);
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl)).IlIlIIIllIllIIIIIllI());
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI() == this) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll3);
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(null, llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII() + 0.5, llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII() + 0.5, llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() + 0.5, 5.0f, true, true);
            return true;
        }
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl)) {
            if (this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll) != null) {
                llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("tile.bed.occupied", new Object[0]));
                return true;
            }
            llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl, false);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl, 4);
        }
        final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll4 == net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll) {
            llIIlIIIlIIIllIlIIIl = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl, true);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIIlIIIlIIIllIlIIIl, 4);
            return true;
        }
        if (llllIIIIlIIIlIlllIll4 == net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI) {
            llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("tile.bed.noSleep", new Object[0]));
        }
        else if (llllIIIIlIIIlIlllIll4 == net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl) {
            llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.IIllIIllIIIlIlIIIIlI("tile.bed.notSafe", new Object[0]));
        }
        return true;
    }
    
    private net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll : illlllllIIIlIIIlIlII.IllIIlllIIIIlllIIlIl) {
            if (llllIIIIlIIIlIlllIll.ah() && llllIIIIlIIIlIlllIll.G.equals(ilIlIlIlIlllllllllIl)) {
                return llllIIIIlIIIlIlllIll;
            }
        }
        return null;
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
    public void llIllIIIIIllIlIIIIlI(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.IllIllIIIIlIIlIlllII();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl);
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI) == net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI())).llIllIIIIIllIlIIIIlI() != this) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
        }
        else if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)).llIllIIIIIllIlIIIIlI() != this) {
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
            }
        }
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI) == net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) ? null : net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.e;
    }
    
    private void IllIllIIIIlIIlIlllII() {
        this.llllIIIIlIIIlIlllIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }
    
    public static net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, int n) {
        final lllIllIIIllllllIllll lllIllIIIllllllIllll = (lllIllIIIllllllIllll)illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl);
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        for (int i = 0; i <= 1; ++i) {
            final int n2 = liiiIlIIIIIlllIllIII - lllIllIIIllllllIllll.lIIIIlIIIIIlllIllIII() * i - 1;
            final int n3 = llIIlIIIlIIIllIlIIIl - lllIllIIIllllllIllll.llIIlIIIlIIIllIlIIIl() * i - 1;
            final int n4 = n2 + 2;
            final int n5 = n3 + 2;
            for (int j = n2; j <= n4; ++j) {
                for (int k = n3; k <= n5; ++k) {
                    final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(j, liiIlllIIIllIIIllIII, k);
                    if (lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2)) {
                        if (n <= 0) {
                            return ilIlIlIlIlllllllllIl2;
                        }
                        --n;
                    }
                }
            }
        }
        return null;
    }
    
    protected static boolean lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl() && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl();
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI) == net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl) {
            super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, n, 0);
        }
    }
    
    @Override
    public int IIlIIIIIllIlIIIlIIll() {
        return 1;
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return IlIIlIlIIIlIIlIlIlII.llIllIIIIIllIlIIIIlI;
    }
    
    @Override
    public net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl IlIlIIIllIllIIIIIllI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return net.minecraft.lIIIlllIIIllIIIllIII.IIllIIllIIIlIlIIIIlI.e;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl && llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI) == net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl)).IlIlIIIllIllIIIIIllI());
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI() == this) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2);
            }
        }
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI(final int n) {
        final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl = net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(n);
        return ((n & 0x8) > 0) ? this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI, net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl, (n & 0x4) > 0) : this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI, net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI) == net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll((lllIllIIIllllllIllll)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl)));
            if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() == this) {
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl));
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        int n = 0x0 | ((lllIllIIIllllllIllll)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl)).llIllIIIIIllIlIIIIlI();
        if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI) == net.minecraft.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll) {
            n |= 0x8;
            if (llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl)) {
                n |= 0x4;
            }
        }
        return n;
    }
    
    @Override
    protected net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl() {
        return new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(this, new net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll[] { IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl, IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI, IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl });
    }
}
