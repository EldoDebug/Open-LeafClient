package net.minecraft.IIIlIIlIIIIlllIlllII.IllIIlllIIIIlllIIlIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IIIIlllIIIIIIlIIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    private boolean IllIIlllIIIIlllIIlIl;
    private boolean llllIIIlIlllIlIIIIIl;
    private boolean lIIIIlIIIIIlllIllIII;
    private boolean lIIIlllIIIllIIIllIII;
    private boolean llIIlIIIlIIIllIlIIIl;
    
    @Override
    public void llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        super.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llIllIIIIIllIlIIIIlI);
        this.llIIlIIIlIIIllIlIIIl = this.lIIIIlIIIIIlllIllIII;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll() {
        super.llllIIIIlIIIlIlllIll();
        this.lIIIIlIIIIIlllIllIII = this.llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        int llIllIIIIIllIlIIIIlI2;
        if (this.lIIIlllIIIllIIIllIII && llIllIIIIIllIlIIIIlI.llIIIlIlllIllIIlIllI()) {
            llIllIIIIIllIlIIIIlI2 = (int)llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl;
            final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl), llIllIIIIIllIlIIIIlI2, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII));
            for (net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI(); llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII || llllIIIIlIIIlIlllIll == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl; llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI()) {
                ++llIllIIIIIllIlIIIIlI2;
                llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IIlllIlIIllIlIlIlIIl), llIllIIIIIllIlIIIIlI2, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII));
            }
            this.lIIIIlIIIIIlllIllIII = false;
        }
        else {
            llIllIIIIIllIlIIIIlI2 = llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl + 0.5);
        }
        return this.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll), llIllIIIIIllIlIIIIlI2, llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().llIllIIIIIllIlIIIIlI));
    }
    
    @Override
    public lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final double n, final double n2, final double n3) {
        return this.llllIIIIlIIIlIlllIll(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n - llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII / 2.0f), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n2), llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(n3 - llIllIIIIIllIlIIIIlI.IllIllIIIIlIIlIlllII / 2.0f));
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lIIIIlIIIIIlllIllIII[] array, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII, final lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII2, final float n) {
        int n2 = 0;
        int n3 = 0;
        if (this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl + 1, liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI) == 1) {
            n3 = 1;
        }
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI + 1, n3);
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll - 1, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI, n3);
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll + 1, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI, n3);
        final lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, liiiIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll, liiiIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl, liiiIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI - 1, n3);
        if (llllIIIIlIIIlIlllIll != null && !llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2) < n) {
            array[n2++] = llllIIIIlIIIlIlllIll;
        }
        if (llllIIIIlIIIlIlllIll2 != null && !llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2) < n) {
            array[n2++] = llllIIIIlIIIlIlllIll2;
        }
        if (llllIIIIlIIIlIlllIll3 != null && !llllIIIIlIIIlIlllIll3.lIIIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2) < n) {
            array[n2++] = llllIIIIlIIIlIlllIll3;
        }
        if (llllIIIIlIIIlIlllIll4 != null && !llllIIIIlIIIlIlllIll4.lIIIlllIIIllIIIllIII && llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII2) < n) {
            array[n2++] = llllIIIIlIIIlIlllIll4;
        }
        return n2;
    }
    
    private lIIIIlIIIIIlllIllIII llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, int i, final int n2, final int n3) {
        lIIIIlIIIIIlllIllIII liiiIlIIIIIlllIllIII = null;
        final int llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, i, n2);
        if (llllIIIIlIIIlIlllIll == 2) {
            return this.llllIIIIlIIIlIlllIll(n, i, n2);
        }
        if (llllIIIIlIIIlIlllIll == 1) {
            liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(n, i, n2);
        }
        if (liiiIlIIIIIlllIllIII == null && n3 > 0 && llllIIIIlIIIlIlllIll != -3 && llllIIIIlIIIlIlllIll != -4 && this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, i + n3, n2) == 1) {
            liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(n, i + n3, n2);
            i += n3;
        }
        if (liiiIlIIIIIlllIllIII != null) {
            int n4 = 0;
            int llllIIIIlIIIlIlllIll2 = 0;
            while (i > 0) {
                llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI, n, i - 1, n2);
                if (this.lIIIIlIIIIIlllIllIII && llllIIIIlIIIlIlllIll2 == -1) {
                    return null;
                }
                if (llllIIIIlIIIlIlllIll2 != 1) {
                    break;
                }
                if (n4++ >= llIllIIIIIllIlIIIIlI.llIlIIIIllIlIIlIlIII()) {
                    return null;
                }
                if (--i <= 0) {
                    return null;
                }
                liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll(n, i, n2);
            }
            if (llllIIIIlIIIlIlllIll2 == -2) {
                return null;
            }
        }
        return liiiIlIIIIIlllIllIII;
    }
    
    private int llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final int n2, final int n3) {
        return llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, n, n2, n3, this.llIllIIIIIllIlIIIIlI, this.IlIIIlIlIIIllIlIlIIl, this.IlIlIIIllIllIIIIIllI, this.lIIIIlIIIIIlllIllIII, this.llllIIIlIlllIlIIIIIl, this.IllIIlllIIIIlllIIlIl);
    }
    
    public static int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final net.minecraft.llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final boolean b2, final boolean b3) {
        boolean b4 = false;
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(llIllIIIIIllIlIIIIlI);
        final llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new llllIIIlIlllIlIIIIIl();
        for (int i = n; i < n + n4; ++i) {
            for (int j = n2; j < n2 + n5; ++j) {
                for (int k = n3; k < n3 + n6; ++k) {
                    llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(i, j, k);
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI();
                    if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
                        if (llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.h && llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aA) {
                            if (llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII && llIllIIIIIllIlIIIIlI2 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl) {
                                if (!b3 && llIllIIIIIllIlIIIIlI2 instanceof llIlIIIIIlIIlIlIIlll && llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl) {
                                    return 0;
                                }
                            }
                            else {
                                if (b) {
                                    return -1;
                                }
                                b4 = true;
                            }
                        }
                        else {
                            b4 = true;
                        }
                        if (llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl).llIllIIIIIllIlIIIIlI() instanceof ao) {
                            if (!(llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() instanceof ao) && !(llIllIIIIIllIlIIIIlI.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI() instanceof ao)) {
                                return -3;
                            }
                        }
                        else if (!llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI, llllIIIlIlllIlIIIIIl) && (!b2 || !(llIllIIIIIllIlIIIIlI2 instanceof llIlIIIIIlIIlIlIIlll) || llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.IlIIIlIlIIIllIlIlIIl)) {
                            if (llIllIIIIIllIlIIIIlI2 instanceof IIlllllIllIllIlIlIII || llIllIIIIIllIlIIIIlI2 instanceof llllIllllIllllIlIlII || llIllIIIIIllIlIIIIlI2 instanceof dl) {
                                return -3;
                            }
                            if (llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.h || llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aA) {
                                return -4;
                            }
                            if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                                return 0;
                            }
                            if (!llIllIIIIIllIlIIIIlI.llIIIllIlIllIllIIIIl()) {
                                return -2;
                            }
                        }
                    }
                }
            }
        }
        return b4 ? 2 : 1;
    }
    
    public void llllIIIIlIIIlIlllIll(final boolean illIIlllIIIIlllIIlIl) {
        this.IllIIlllIIIIlllIIlIl = illIIlllIIIIlllIIlIl;
    }
    
    public void IlIlIlIlIlllllllllIl(final boolean llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
    }
    
    public void llIllIIIIIllIlIIIIlI(final boolean liiiIlIIIIIlllIllIII) {
        this.lIIIIlIIIIIlllIllIII = liiiIlIIIIIlllIllIII;
    }
    
    public void IlIIIlIlIIIllIlIlIIl(final boolean liiIlllIIIllIIIllIII) {
        this.lIIIlllIIIllIIIllIII = liiIlllIIIllIIIllIII;
    }
    
    public boolean IlIlIlIlIlllllllllIl() {
        return this.IllIIlllIIIIlllIIlIl;
    }
    
    public boolean llIllIIIIIllIlIIIIlI() {
        return this.lIIIlllIIIllIIIllIII;
    }
    
    public boolean IlIIIlIlIIIllIlIlIIl() {
        return this.lIIIIlIIIIIlllIllIII;
    }
}
