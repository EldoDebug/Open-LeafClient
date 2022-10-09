package net.minecraft.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public class IllIIlllllIIllIIllIl extends IlIIlllIIlIlllllIIlI
{
    int IIIIIIIIIlllIllIlIlI;
    
    protected IllIIlllllIIllIIllIl(final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        super(ilIlIlIlIlllllllllIl);
    }
    
    private void IllIIlllIIIIlllIIlIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, IlIIlllIIlIlllllIIlI.IlIlIlIlIlllllllllIl(this.llllllIllIllIlIllllI).lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IllIIlllllIIllIIllIl.IIllllIIIlIIIIIIllIl, llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll(IllIIlllllIIllIIllIl.IIllllIIIlIIIIIIllIl)), 2);
    }
    
    @Override
    public void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll, final Random random) {
        int intValue = (int)llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IllIIlllllIIllIIllIl.IIllllIIIlIIIIIIllIl);
        int n = 1;
        if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII && !illlllllIIIlIIIlIlII.IlIllIlIlIIIlIlIlIII.IIIIlllIIIIIIlIIIlll()) {
            n = 2;
        }
        int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII);
        if (intValue > 0) {
            int ilIlIlIlIlllllllllIl2 = -100;
            this.IIIIIIIIIlllIllIlIlI = 0;
            final Iterator iterator = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
            while (iterator.hasNext()) {
                ilIlIlIlIlllllllllIl2 = this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(iterator.next()), ilIlIlIlIlllllllllIl2);
            }
            int n2 = ilIlIlIlIlllllllllIl2 + n;
            if (n2 >= 8 || ilIlIlIlIlllllllllIl2 < 0) {
                n2 = -1;
            }
            if (this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll()) >= 0) {
                final int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll());
                if (ilIlIIIllIllIIIIIllI >= 8) {
                    n2 = ilIlIIIllIllIIIIIllI;
                }
                else {
                    n2 = ilIlIIIllIllIIIIIllI + 8;
                }
            }
            if (this.IIIIIIIIIlllIllIlIlI >= 2 && this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                if (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()) {
                    n2 = 0;
                }
                else if (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == this.llllllIllIllIlIllllI && (int)ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(IllIIlllllIIllIIllIl.IIllllIIIlIIIIIIllIl) == 0) {
                    n2 = 0;
                }
            }
            if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII && intValue < 8 && n2 < 8 && n2 > intValue && random.nextInt(4) != 0) {
                llllIIIIlIIIlIlllIll2 *= 4;
            }
            if (n2 == intValue) {
                this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
            }
            else if ((intValue = n2) < 0) {
                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl);
            }
            else {
                llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IllIIlllllIIllIIllIl.IIllllIIIlIIIIIIllIl, n2);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll, 2);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, llllIIIIlIIIlIlllIll2);
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, this);
            }
        }
        else {
            this.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
        if (this.lIIIIlIIIIIlllIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl4)) {
            if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
                illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll());
                this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl());
                return;
            }
            if (intValue >= 8) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl4, intValue);
            }
            else {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl4, intValue + 8);
            }
        }
        else if (intValue >= 0 && (intValue == 0 || this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl4))) {
            final Set llIIlIIIlIIIllIlIIIl = this.llIIlIIIlIIIllIlIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
            int n3 = intValue + n;
            if (intValue >= 8) {
                n3 = 1;
            }
            if (n3 >= 8) {
                return;
            }
            for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : llIIlIIIlIIIllIlIIIl) {
                this.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll)), n3);
            }
        }
    }
    
    private void IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl, final int n) {
        if (this.lIIIIlIIIIIlllIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
            if (llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                if (this.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
                    this.lIIIlllIIIllIIIllIII(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
                }
                else {
                    llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl, 0);
                }
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IllIIlllllIIllIIllIl.IIllllIIIlIIIIIIllIl, n), 3);
        }
    }
    
    private int llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n, final lllIllIIIllllllIllll lllIllIIIllllllIllll) {
        int n2 = 1000;
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll2 : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            if (lllIllIIIllllllIllll2 != lllIllIIIllllllIllll) {
                final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll2);
                final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
                if (this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2) || (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() == this.llllllIllIllIlIllllI && (int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IllIIlllllIIllIIllIl.IIllllIIIlIIIIIIllIl) <= 0)) {
                    continue;
                }
                if (!this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), ilIlIlIlIlllllllllIl2)) {
                    return n;
                }
                if (n >= 4) {
                    continue;
                }
                final int llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, n + 1, lllIllIIIllllllIllll2.IlIlIIIllIllIIIIIllI());
                if (llllIIIIlIIIlIlllIll2 >= n2) {
                    continue;
                }
                n2 = llllIIIIlIIIlIlllIll2;
            }
        }
        return n2;
    }
    
    private Set llIIlIIIlIIIllIlIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        int n = 1000;
        final EnumSet<lllIllIIIllllllIllll> none = EnumSet.noneOf(lllIllIIIllllllIllll.class);
        for (final lllIllIIIllllllIllll lllIllIIIllllllIllll : IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll) {
            final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            if (!this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl2) && (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl() != this.llllllIllIllIlIllllI || (int)ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(IllIIlllllIIllIIllIl.IIllllIIIlIIIIIIllIl) > 0)) {
                int llllIIIIlIIIlIlllIll2;
                if (this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(), illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()))) {
                    llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, 1, lllIllIIIllllllIllll.IlIlIIIllIllIIIIIllI());
                }
                else {
                    llllIIIIlIIIlIlllIll2 = 0;
                }
                if (llllIIIIlIIIlIlllIll2 < n) {
                    none.clear();
                }
                if (llllIIIIlIIIlIlllIll2 > n) {
                    continue;
                }
                none.add(lllIllIIIllllllIllll);
                n = llllIIIIlIIIlIlllIll2;
            }
        }
        return none;
    }
    
    private boolean llllIIIlIlllIlIIIIIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        return llIllIIIIIllIlIIIIlI instanceof llIlIIIIIlIIlIlIIlll || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlllllIllIllIlIlIII || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIllIlIllIllllI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lIllllIllIllIIllllll || llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlllIIlllIIllIllI || llIllIIIIIllIlIIIIlI.llllllIllIllIlIllllI.IlIIIlIlIIIllIlIlIIl();
    }
    
    protected int IlIlIlIlIlllllllllIl(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final int n) {
        int ilIlIIIllIllIIIIIllI = this.IlIlIIIllIllIIIIIllI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
        if (ilIlIIIllIllIIIIIllI < 0) {
            return n;
        }
        if (ilIlIIIllIllIIIIIllI == 0) {
            ++this.IIIIIIIIIlllIllIlIlI;
        }
        if (ilIlIIIllIllIIIIIllI >= 8) {
            ilIlIIIllIllIIIIIllI = 0;
        }
        return (n >= 0 && ilIlIIIllIllIIIIIllI >= n) ? n : ilIlIIIllIllIIIIIllI;
    }
    
    private boolean lIIIIlIIIIIlllIllIII(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llIIlIIIlIIIllIlIIIl.llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
        return illIIlllIIIIlllIIlIl != this.llllllIllIllIlIllllI && illIIlllIIIIlllIIlIl != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII && !this.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl);
    }
    
    @Override
    public void llIllIIIIIllIlIIIIlI(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIIlIIIlIIIllIlIIIl) {
        if (!this.IlIlIIIllIllIIIIIllI(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, llIIlIIIlIIIllIlIIIl)) {
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, this, this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII));
        }
    }
}
