package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IllIIlllIIIIlllIIlIl.*;
import java.util.*;

public class IllIllIIIIlIIlIlllII extends IlIIIlIlIIIllIlIlIIl
{
    public static final int[] llllIIIlIlllIlIIIIIl;
    
    static {
        llllIIIlIlllIlIIIIIl = new int[] { 1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320 };
    }
    
    public IllIllIIIIlIIlIlllII() {
        this.llllIIIIlIIIlIlllIll(true);
        this.IlIIIlIlIIIllIlIlIIl(0);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI);
    }
    
    @Override
    public String IlIlIlIlIlllllllllIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        return String.valueOf(super.lIIIIlIIIIIlllIllIII()) + "." + net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()).IlIIIlIlIIIllIlIlIIl();
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
        if (llllIIIIlIIIlIlllIll3 == net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            if (llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
                if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(2005, llllIIIIlIIIlIlllIll2, 0);
                }
                return true;
            }
        }
        else if (llllIIIIlIIIlIlllIll3 == net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.IlIlIIIllIIllIlllllI) {
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
            if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl && ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(z.IIIIIIIIIlllIllIlIlI) == aa.IlIIIlIlIIIllIlIlIIl) {
                if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
                    return false;
                }
                if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
                    return false;
                }
                llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
                if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2)) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.R.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, n, n2, n3, 0, llllIIIIlIIIlIlllIll), 2);
                    if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public static boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl);
        if (ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() instanceof dt) {
            final dt dt = (dt)ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI();
            if (dt.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII)) {
                if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                    if (dt.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2)) {
                        dt.IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2);
                    }
                    --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                }
                return true;
            }
        }
        return false;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, int n) {
        if (n == 0) {
            n = 15;
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll) {
            llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI((lIlIlIIIllIIllIIIllI)illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl);
            for (int i = 0; i < n; ++i) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(IlIllllIIlIIlIlIlIll.IlIlIIIlIIlIlIIlllIl, ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI.nextFloat(), ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI.nextFloat() * llIllIIIIIllIlIIIIlI.IIIlIIIlIlIIlllIIlll(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI.nextFloat(), IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI.nextGaussian() * 0.02, IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI.nextGaussian() * 0.02, IllIllIIIIlIIlIlllII.llIllIIIIIllIlIIIIlI.nextGaussian() * 0.02, new int[0]);
            }
        }
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (lllIIIIlllllIlIIllIl instanceof IIIlIIIlIlIIlllIIlll) {
            final IIIlIIIlIlIIlllIIlll iiIlIIIlIlIIlllIIlll = (IIIlIIIlIlIIlllIIlll)lllIIIIlllllIlIIllIl;
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.llIllIlIIIIllIlIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
            if (!iiIlIIIlIlIIlllIIlll.ar() && iiIlIIIlIlIIlllIIlll.aq() != llllIIIIlIIIlIlllIll2) {
                iiIlIIIlIlIIlllIIlll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        for (int i = 0; i < 16; ++i) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, i));
        }
    }
}
