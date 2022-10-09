package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public abstract class lIllIlIIIllllllIIlII extends IlIllIIllIIlIIIIlIIl
{
    public static final IlIlIlIlIlllllllllIl IIIIIIIIIlllIllIlIlI;
    public static final IlIlIlIlIlllllllllIl IIllllIIIlIIIIIIllIl;
    int[] IlllIIIIlIIIlIlIlIIl;
    protected int lllIllIIIllllllIllll;
    protected boolean llIllIlIlIIIIIIIllII;
    
    static {
        IIIIIIIIIlllIllIlIlI = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("decayable");
        IIllllIIIlIIIIIIllIl = net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll("check_decay");
    }
    
    public lIllIlIIIllllllIIlII() {
        super(net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl, false);
        this.llllIIIIlIIIlIlllIll(true);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
        this.llIllIIIIIllIlIIIIlI(0.2f);
        this.IlIIIlIlIIIllIlIlIIl(1);
        this.llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public int IIlIIIIlllIlllllIlII() {
        return net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll(0.5, 1.0);
    }
    
    @Override
    public int IlIlIIIllIllIIIIIllI(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI();
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        return net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void IlIIIlIlIIIllIlIlIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final int n = 1;
        final int n2 = n + 1;
        final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
        final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
        final int llIIlIIIlIIIllIlIIIl2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
        if (illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII - n2, liiIlllIIIllIIIllIII - n2, llIIlIIIlIIIllIlIIIl2 - n2), new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII + n2, liiIlllIIIllIIIllIII + n2, llIIlIIIlIIIllIlIIIl2 + n2))) {
            for (int i = -n; i <= n; ++i) {
                for (int j = -n; j <= n; ++j) {
                    for (int k = -n; k <= n; ++k) {
                        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, j, k);
                        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl && !(boolean)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl)) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, true), 4);
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl) && (boolean)llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIIIIIIIIlllIllIlIlI)) {
            final int n = 4;
            final int n2 = n + 1;
            final int liiiIlIIIIIlllIllIII = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
            final int liiIlllIIIllIIIllIII = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII();
            final int llIIlIIIlIIIllIlIIIl2 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
            final int n3 = 32;
            final int n4 = n3 * n3;
            final int n5 = n3 / 2;
            if (this.IlllIIIIlIIIlIlIlIIl == null) {
                this.IlllIIIIlIIIlIlIlIIl = new int[n3 * n3 * n3];
            }
            if (illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII - n2, liiIlllIIIllIIIllIII - n2, llIIlIIIlIIIllIlIIIl2 - n2), new net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII + n2, liiIlllIIIllIIIllIII + n2, llIIlIIIlIIIllIlIIIl2 + n2))) {
                final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
                for (int i = -n; i <= n; ++i) {
                    for (int j = -n; j <= n; ++j) {
                        for (int k = -n; k <= n; ++k) {
                            final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII + i, liiIlllIIIllIIIllIII + j, llIIlIIIlIIIllIlIIIl2 + k)).llIllIIIIIllIlIIIIlI();
                            if (llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl && llIllIIIIIllIlIIIIlI != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl) {
                                if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                                    this.IlllIIIIlIIIlIlIlIIl[(i + n5) * n4 + (j + n5) * n3 + k + n5] = -2;
                                }
                                else {
                                    this.IlllIIIIlIIIlIlIlIIl[(i + n5) * n4 + (j + n5) * n3 + k + n5] = -1;
                                }
                            }
                            else {
                                this.IlllIIIIlIIIlIlIlIIl[(i + n5) * n4 + (j + n5) * n3 + k + n5] = 0;
                            }
                        }
                    }
                }
                for (int l = 1; l <= 4; ++l) {
                    for (int n6 = -n; n6 <= n; ++n6) {
                        for (int n7 = -n; n7 <= n; ++n7) {
                            for (int n8 = -n; n8 <= n; ++n8) {
                                if (this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5) * n3 + n8 + n5] == l - 1) {
                                    if (this.IlllIIIIlIIIlIlIlIIl[(n6 + n5 - 1) * n4 + (n7 + n5) * n3 + n8 + n5] == -2) {
                                        this.IlllIIIIlIIIlIlIlIIl[(n6 + n5 - 1) * n4 + (n7 + n5) * n3 + n8 + n5] = l;
                                    }
                                    if (this.IlllIIIIlIIIlIlIlIIl[(n6 + n5 + 1) * n4 + (n7 + n5) * n3 + n8 + n5] == -2) {
                                        this.IlllIIIIlIIIlIlIlIIl[(n6 + n5 + 1) * n4 + (n7 + n5) * n3 + n8 + n5] = l;
                                    }
                                    if (this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5 - 1) * n3 + n8 + n5] == -2) {
                                        this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5 - 1) * n3 + n8 + n5] = l;
                                    }
                                    if (this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5 + 1) * n3 + n8 + n5] == -2) {
                                        this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5 + 1) * n3 + n8 + n5] = l;
                                    }
                                    if (this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5) * n3 + (n8 + n5 - 1)] == -2) {
                                        this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5) * n3 + (n8 + n5 - 1)] = l;
                                    }
                                    if (this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5) * n3 + n8 + n5 + 1] == -2) {
                                        this.IlllIIIIlIIIlIlIlIIl[(n6 + n5) * n4 + (n7 + n5) * n3 + n8 + n5 + 1] = l;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (this.IlllIIIIlIIIlIlIlIIl[n5 * n4 + n5 * n3 + n5] >= 0) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false), 4);
            }
            else {
                this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
            }
        }
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random) {
        if (illlllllIIIlIIIlIlII.llIIIlIlIllIIlIlIlII(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) && !net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) && random.nextInt(15) == 1) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIIIIIIlllIlIllIl, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextFloat(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 0.05, ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextFloat(), 0.0, 0.0, 0.0, new int[0]);
        }
    }
    
    private void lIIIlllIIIllIIIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl), 0);
        illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final Random random) {
        return (random.nextInt(20) == 0) ? 1 : 0;
    }
    
    @Override
    public IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final Random random, final int n) {
        return net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final float n, final int n2) {
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            int liiIlllIIIllIIIllIII = this.lIIIlllIIIllIIIllIII(llIIlIIIlIIIllIlIIIl);
            if (n2 > 0) {
                liiIlllIIIllIIIllIII -= 2 << n2;
                if (liiIlllIIIllIIIllIII < 10) {
                    liiIlllIIIllIIIllIII = 10;
                }
            }
            if (illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextInt(liiIlllIIIllIIIllIII) == 0) {
                net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, new lllIIIIlIlIllIIlIIIl(this.llllIIIIlIIIlIlllIll(llIIlIIIlIIIllIlIIIl, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, n2), 1, this.IlIIIlIlIIIllIlIlIIl(llIIlIIIlIIIllIlIIIl)));
            }
            int n3 = 200;
            if (n2 > 0) {
                n3 -= 10 << n2;
                if (n3 < 40) {
                    n3 = 40;
                }
            }
            this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, n3);
        }
    }
    
    protected void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
    }
    
    protected int lIIIlllIIIllIIIllIII(final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        return 20;
    }
    
    @Override
    public boolean llllIIllllIlIlIIIIll() {
        return !this.IIlIlIlIIlIllIIIIIIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean b) {
        this.llIllIlIlIIIIIIIllII = b;
        this.IIlIlIlIIlIllIIIIIIl = b;
        this.lllIllIIIllllllIllll = (b ? 0 : 1);
    }
    
    @Override
    public IlIIlIlIIIlIIlIlIlII IIlllIIlIllIllIlIIll() {
        return this.llIllIlIlIIIIIIIllII ? IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl : IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean lIIIlllIIIllIIIllIII() {
        return false;
    }
    
    public abstract aa IlIlIIIllIllIIIIIllI(final int p0);
}
