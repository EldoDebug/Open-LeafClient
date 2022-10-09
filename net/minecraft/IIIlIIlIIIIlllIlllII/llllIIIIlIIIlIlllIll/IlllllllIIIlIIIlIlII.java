package net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;

public class IlllllllIIIlIIIlIlII extends llIIlIIIlIIIllIlIIIl
{
    private net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl[] IIlllIIIllIllIIlIlIl;
    private long llIlllIlllllIIllIIII;
    private IIllIIllIIIlIlIIIIlI lllllIlIlIlllIlllIlI;
    private IIllIIllIIIlIlIIIIlI IlIllllIIlIllIlIlIll;
    private IIllIIllIIIlIlIIIIlI lllIlIIIIIlIlllllIlI;
    private boolean llIlIIIIllIlIIlIlIII;
    private boolean IIIIIlllIlIIIIIIIllI;
    
    public IlllllllIIIlIIIlIlII(final int n, final boolean llIlIIIIllIlIIlIlIII, final boolean iiiiIlllIlIIIIIIIllI) {
        super(n);
        this.llIlIIIIllIlIIlIlIII = llIlIIIIllIlIIlIlIII;
        this.IIIIIlllIlIIIIIIIllI = iiiiIlllIlIIIIIIIllI;
        this.IlIlIlIlIlllllllllIl();
        this.llllIIIIlIIIlIlllIll(2.0f, 0.0f);
        this.lllllIIllIlIllIllllI.clear();
        this.IIlllIIlllIIIlIlllII = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(bl.IIIIIIIIIlllIllIlIlI, bm.IlIlIlIlIlllllllllIl);
        this.IlIIlllllIIllIIlllll = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll();
        this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = -999;
        this.IIllIIIlIIlIlIlIIIII.lIllllllIIllIlIlIlII = 20;
        this.IIllIIIlIIlIlIlIIIII.IIlllIIIlIlllIIlllII = 3;
        this.IIllIIIlIIlIlIlIIIII.IIlIIIIIllIlIIIlIIll = 5;
        this.IIllIIIlIIlIlIlIIIII.llIIIlIlIllIIlIlIlII = 0;
        this.lllllIIllIlIllIllllI.clear();
        if (iiiiIlllIlIIIIIIIllI) {
            this.IIllIIIlIIlIlIlIIIII.IIlllIlIIllIlIlIlIIl = 5;
        }
    }
    
    @Override
    public net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll(final Random random) {
        return this.IIllIIIlIIIIlIIlIIII;
    }
    
    @Override
    public int llIllIIIIIllIlIIIIlI(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return 10387789;
    }
    
    @Override
    public int IlIlIlIlIlllllllllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return 9470285;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, random, ilIlIlIlIlllllllllIl);
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl, final int n, final int n2, final double n3) {
        if (this.IIlllIIIllIllIIlIlIl == null || this.llIlllIlllllIIllIIII != illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII()) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII());
        }
        if (this.lllllIlIlIlllIlllIlI == null || this.IlIllllIIlIllIlIlIll == null || this.llIlllIlllllIIllIIII != illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII()) {
            final Random random2 = new Random(this.llIlllIlllllIIllIIII);
            this.lllllIlIlIlllIlllIlI = new IIllIIllIIIlIlIIIIlI(random2, 4);
            this.IlIllllIIlIllIlIlIll = new IIllIIllIIIlIlIIIIlI(random2, 1);
        }
        this.llIlllIlllllIIllIIII = illlllllIIIlIIIlIlII.IIlIIIIlllIlllllIlII();
        double n4 = 0.0;
        if (this.llIlIIIIllIlIIlIlIII) {
            final int n5 = (n & 0xFFFFFFF0) + (n2 & 0xF);
            final int n6 = (n2 & 0xFFFFFFF0) + (n & 0xF);
            final double min = Math.min(Math.abs(n3), this.lllllIlIlIlllIlllIlI.llllIIIIlIIIlIlllIll(n5 * 0.25, n6 * 0.25));
            if (min > 0.0) {
                final double n7 = 0.001953125;
                final double abs = Math.abs(this.IlIllllIIlIllIlIlIll.llllIIIIlIIIlIlllIll(n5 * n7, n6 * n7));
                double n8 = min * min * 2.5;
                final double n9 = Math.ceil(abs * 50.0) + 14.0;
                if (n8 > n9) {
                    n8 = n9;
                }
                n4 = n8 + 64.0;
            }
        }
        final int n10 = n & 0xF;
        final int n11 = n2 & 0xF;
        final int ilIlIIIlIIlIlIIlllIl = illlllllIIIlIIIlIlII.IlIlIIIlIIlIlIIlllIl();
        net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll();
        net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl2 = this.IlIIlllllIIllIIlllll;
        final int n12 = (int)(n3 / 3.0 + 3.0 + random.nextDouble() * 0.25);
        final boolean b = Math.cos(n3 / 3.0 * 3.141592653589793) > 0.0;
        int n13 = -1;
        boolean b2 = false;
        for (int i = 255; i >= 0; --i) {
            if (illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && i < (int)n4) {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll());
            }
            if (i <= random.nextInt(5)) {
                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII.lllIllIIIllllllIllll());
            }
            else {
                final net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll = illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10);
                if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                    n13 = -1;
                }
                else if (llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) {
                    if (n13 == -1) {
                        b2 = false;
                        if (n12 <= 0) {
                            llIIlIIIlIIIllIlIIIl = null;
                            llIIlIIIlIIIllIlIIIl2 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll();
                        }
                        else if (i >= ilIlIIIlIIlIlIIlllIl - 4 && i <= ilIlIIIlIIlIlIIlllIl + 1) {
                            llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll();
                            llIIlIIIlIIIllIlIIIl2 = this.IlIIlllllIIllIIlllll;
                        }
                        if (i < ilIlIIIlIIlIlIIlllIl && (llIIlIIIlIIIllIlIIIl == null || llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll)) {
                            llIIlIIIlIIIllIlIIIl = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.lllIllIIIllllllIllll();
                        }
                        n13 = n12 + Math.max(0, i - ilIlIIIlIIlIlIIlllIl);
                        if (i < ilIlIIIlIIlIlIIlllIl - 1) {
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, llIIlIIIlIIIllIlIIIl2);
                            if (llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay) {
                                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, llIIlIIIlIIIllIlIIIl2.llIllIIIIIllIlIIIIlI().lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl));
                            }
                        }
                        else if (this.IIIIIlllIlIIIIIIIllI && i > 86 + n12 * 2) {
                            if (b) {
                                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IllIllIIIIlIIlIlllII.IIIIIIIIIlllIllIlIlI, net.minecraft.llllIIIIlIIIlIlllIll.IlIllllIIlIIlIlIlIll.IlIlIlIlIlllllllllIl));
                            }
                            else {
                                illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll());
                            }
                        }
                        else if (i <= ilIlIIIlIIlIlIIlllIl + 3 + n12) {
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, this.IIlllIIlllIIIlIlllII);
                            b2 = true;
                        }
                        else {
                            net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl3;
                            if (i >= 64 && i <= 127) {
                                if (b) {
                                    llIIlIIIlIIIllIlIIIl3 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aD.lllIllIIIllllllIllll();
                                }
                                else {
                                    llIIlIIIlIIIllIlIIIl3 = this.llllIIIIlIIIlIlllIll(n, i, n2);
                                }
                            }
                            else {
                                llIIlIIIlIIIllIlIIIl3 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl);
                            }
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, llIIlIIIlIIIllIlIIIl3);
                        }
                    }
                    else if (n13 > 0) {
                        --n13;
                        if (b2) {
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl));
                        }
                        else {
                            illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll(n11, i, n10, this.llllIIIIlIIIlIlllIll(n, i, n2));
                        }
                    }
                }
            }
        }
    }
    
    private void llllIIIIlIIIlIlllIll(final long n) {
        Arrays.fill(this.IIlllIIIllIllIIlIlIl = new net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl[64], net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aD.lllIllIIIllllllIllll());
        final Random random = new Random(n);
        this.lllIlIIIIIlIlllllIlI = new IIllIIllIIIlIlIIIIlI(random, 1);
        for (int i = 0; i < 64; ++i) {
            i += random.nextInt(5) + 1;
            if (i < 64) {
                this.IIlllIIIllIllIIlIlIl[i] = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl);
            }
        }
        for (int n2 = random.nextInt(4) + 2, j = 0; j < n2; ++j) {
            for (int n3 = random.nextInt(3) + 1, nextInt = random.nextInt(64), n4 = 0; nextInt + n4 < 64 && n4 < n3; ++n4) {
                this.IIlllIIIllIllIIlIlIl[nextInt + n4] = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI);
            }
        }
        for (int n5 = random.nextInt(4) + 2, k = 0; k < n5; ++k) {
            for (int n6 = random.nextInt(3) + 2, nextInt2 = random.nextInt(64), n7 = 0; nextInt2 + n7 < 64 && n7 < n6; ++n7) {
                this.IIlllIIIllIllIIlIlIl[nextInt2 + n7] = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI);
            }
        }
        for (int n8 = random.nextInt(4) + 2, l = 0; l < n8; ++l) {
            for (int n9 = random.nextInt(3) + 1, nextInt3 = random.nextInt(64), n10 = 0; nextInt3 + n10 < 64 && n10 < n9; ++n10) {
                this.IIlllIIIllIllIIlIlIl[nextInt3 + n10] = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIllllIlIlIIIIll);
            }
        }
        final int n11 = random.nextInt(3) + 3;
        int n12 = 0;
        for (int n13 = 0; n13 < n11; ++n13) {
            final int n14 = 1;
            n12 += random.nextInt(16) + 4;
            for (int n15 = 0; n12 + n15 < 64 && n15 < n14; ++n15) {
                this.IIlllIIIllIllIIlIlIl[n12 + n15] = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll);
                if (n12 + n15 > 1 && random.nextBoolean()) {
                    this.IIlllIIIllIllIIlIlIl[n12 + n15 - 1] = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII);
                }
                if (n12 + n15 < 63 && random.nextBoolean()) {
                    this.IIlllIIIllIllIIlIlIl[n12 + n15 + 1] = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.ay.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(net.minecraft.llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI.IIIIIIIIIlllIllIlIlI, net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII);
                }
            }
        }
    }
    
    private net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        return this.IIlllIIIllIllIIlIlIl[(n2 + (int)Math.round(this.lllIlIIIIIlIlllllIlI.llllIIIIlIIIlIlllIll(n * 1.0 / 512.0, n * 1.0 / 512.0) * 2.0) + 64) % 64];
    }
    
    @Override
    protected llIIlIIIlIIIllIlIIIl IlIIIlIlIIIllIlIlIIl(final int n) {
        final boolean b = this.lIIIIIlIlIIIlIIIIlIl == net.minecraft.IIIlIIlIIIIlllIlllII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl.llIIIIIIlIllIIlIIIll.lIIIIIlIlIIIlIIIIlIl;
        final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII = new IlllllllIIIlIIIlIlII(n, b, this.IIIIIlllIlIIIIIIIllI);
        if (!b) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl);
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(String.valueOf(this.lIlIIlllIIlIIlIlllIl) + " M");
        }
        else {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(String.valueOf(this.lIlIIlllIIlIIlIlllIl) + " (Bryce)");
        }
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(this.llIIIllIlIllIllIIIIl, true);
        return illlllllIIIlIIIlIlII;
    }
}
