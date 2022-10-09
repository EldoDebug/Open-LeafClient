package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class IIIIIIIIIlllIllIlIlI extends llllIIIIlIIIlIlllIll
{
    private static final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private static final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    private final int llIllIIIIIllIlIIIIlI;
    private final boolean IlIIIlIlIIIllIlIlIIl;
    private final llIIlIIIlIIIllIlIIIl IlIlIIIllIllIIIIIllI;
    private final llIIlIIIlIIIllIlIIIl IllIIlllIIIIlllIIlIl;
    
    static {
        llllIIIIlIIIlIlllIll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(q.IIllllIIIlIIIIIIllIl, aa.llllIIIIlIIIlIlllIll);
        IlIlIlIlIlllllllllIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(o.IllIllIIIIlIIlIlllII, aa.llllIIIIlIIIlIlllIll).llllIIIIlIIIlIlllIll(lIllIlIIIllllllIIlII.IIllllIIIlIIIIIIllIl, false);
    }
    
    public IIIIIIIIIlllIllIlIlI(final boolean b) {
        this(b, 4, IIIIIIIIIlllIllIlIlI.llllIIIIlIIIlIlllIll, IIIIIIIIIlllIllIlIlI.IlIlIlIlIlllllllllIl, false);
    }
    
    public IIIIIIIIIlllIllIlIlI(final boolean b, final int llIllIIIIIllIlIIIIlI, final llIIlIIIlIIIllIlIIIl ilIlIIIllIllIIIIIllI, final llIIlIIIlIIIllIlIIIl illIIlllIIIIlllIIlIl, final boolean ilIIIlIlIIIllIlIlIIl) {
        super(b);
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIlIIIllIllIIIIIllI = ilIlIIIllIllIIIIIllI;
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = random.nextInt(3) + this.llIllIIIIIllIlIIIIlI;
        boolean b = true;
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 1 || ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n + 1 > 256) {
            return false;
        }
        for (int i = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); i <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 + n; ++i) {
            int n2 = 1;
            if (i == ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()) {
                n2 = 0;
            }
            if (i >= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1 + n - 2) {
                n2 = 2;
            }
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
            for (int n3 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n2; n3 <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n2 && b; ++n3) {
                for (int n4 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n2; n4 <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n2 && b; ++n4) {
                    if (i >= 0 && i < 256) {
                        if (!this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(n3, i, n4)).llIllIIIIIllIlIIIIlI())) {
                            b = false;
                        }
                    }
                    else {
                        b = false;
                    }
                }
            }
        }
        if (!b) {
            return false;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI();
        if ((llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllIIlllIIIlIlllII) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 256 - n - 1) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
            final int n5 = 3;
            final int n6 = 0;
            for (int j = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - n5 + n; j <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n; ++j) {
                final int n7 = j - (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n);
                for (int n8 = n6 + 1 - n7 / 2, k = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n8; k <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n8; ++k) {
                    final int n9 = k - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                    for (int l = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n8; l <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n8; ++l) {
                        final int n10 = l - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                        if (Math.abs(n9) != n8 || Math.abs(n10) != n8 || (random.nextInt(2) != 0 && n7 != 0)) {
                            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(k, j, l);
                            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
                            if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl || llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, this.IllIIlllIIIIlllIIlIl);
                            }
                        }
                    }
                }
            }
            for (int n11 = 0; n11 < n; ++n11) {
                final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n11)).llIllIIIIIllIlIIIIlI();
                if (llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl || llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIlIlIIIllIIllIIIllI) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n11), this.IlIlIIIllIllIIIIIllI);
                    if (this.IlIIIlIlIIIllIlIlIIl && n11 > 0) {
                        if (random.nextInt(3) > 0 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-1, n11, 0))) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-1, n11, 0), dk.IlllIIIIlIIIlIlIlIIl);
                        }
                        if (random.nextInt(3) > 0 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, n11, 0))) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(1, n11, 0), dk.llIllIlIlIIIIIIIllII);
                        }
                        if (random.nextInt(3) > 0 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, n11, -1))) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, n11, -1), dk.lllIllIIIllllllIllll);
                        }
                        if (random.nextInt(3) > 0 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, n11, 1))) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(0, n11, 1), dk.IIllllIIIlIIIIIIllIl);
                        }
                    }
                }
            }
            if (this.IlIIIlIlIIIllIlIlIIl) {
                for (int n12 = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() - 3 + n; n12 <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n; ++n12) {
                    final int n13 = 2 - (n12 - (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + n)) / 2;
                    final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new llllIIIlIlllIlIIIIIl();
                    for (int n14 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n13; n14 <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n13; ++n14) {
                        for (int n15 = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n13; n15 <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n13; ++n15) {
                            llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(n14, n12, n15);
                            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) {
                                final IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI = llllIIIlIlllIlIIIIIl2.IlIlIIIllIllIIIIIllI();
                                final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llllIIIlIlllIlIIIIIl2.IllIIlllIIIIlllIIlIl();
                                final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI4 = llllIIIlIlllIlIIIIIl2.llIllIIIIIllIlIIIIlI();
                                final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl = llllIIIlIlllIlIIIIIl2.IlIIIlIlIIIllIlIlIIl();
                                if (random.nextInt(4) == 0 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIIIllIllIIIIIllI).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                    this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIIIllIllIIIIIllI, dk.IlllIIIIlIIIlIlIlIIl);
                                }
                                if (random.nextInt(4) == 0 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(illIIlllIIIIlllIIlIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                    this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, illIIlllIIIIlllIIlIl, dk.llIllIlIlIIIIIIIllII);
                                }
                                if (random.nextInt(4) == 0 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI4).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                    this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI4, dk.lllIllIIIllllllIllll);
                                }
                                if (random.nextInt(4) == 0 && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                                    this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIIIlIlIIIllIlIlIIl, dk.IIllllIIIlIIIIIIllIl);
                                }
                            }
                        }
                    }
                }
                if (random.nextInt(5) == 0 && n > 5) {
                    for (int n16 = 0; n16 < 2; ++n16) {
                        for (final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
                            if (random.nextInt(4 - n16) == 0) {
                                final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll ilIlIIIllIllIIIIIllI2 = lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI();
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random.nextInt(3), ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI2.lIIIIlIIIIIlllIllIII(), n - 5 + n16, ilIlIIIllIllIIIIIllI2.llIIlIIIlIIIllIlIIIl()), lllIllIIIllllllIllll);
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.IlllllllIIIlIIIlIlII.lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.R.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.IIIIIIIIIlllIllIlIlI, n).llllIIIIlIIIlIlllIll(IIIllllllIllIIIlllIl.IlllIIIIlIIIlIlIlIIl, lllIllIIIllllllIllll));
    }
    
    private void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.r.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, true));
    }
    
    private void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2) {
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        int n;
        for (n = 4, ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(); illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && n > 0; ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), --n) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
        }
    }
}
