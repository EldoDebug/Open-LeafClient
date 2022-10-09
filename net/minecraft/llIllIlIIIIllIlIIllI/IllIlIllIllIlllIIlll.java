package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IllIlIllIllIlllIIlll extends IlIIIlIlIIIllIlIlIIl
{
    public IllIlIllIllIlllIIlll() {
        this.llllIIIIlIIIlIlllIll(true);
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl);
    }
    
    @Override
    public String llllIIIlIlllIlIIIIIl(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl) {
        String s = new StringBuilder().append(lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll(String.valueOf(this.lIIIIlIIIIIlllIllIII()) + ".name")).toString().trim();
        final String ilIlIlIlIlllllllllIl = IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
        if (ilIlIlIlIlllllllllIl != null) {
            s = String.valueOf(s) + " " + lIIlllIlllllIIlllIll.llllIIIIlIIIlIlllIll("entity." + ilIlIlIlIlllllllllIl + ".name");
        }
        return s;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final int n) {
        final llllIIllllIlIlIIIIll llllIIllllIlIlIIIIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.get(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
        return (llllIIllllIlIlIIIIll != null) ? ((n == 0) ? llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl : llllIIllllIlIlIIIIll.llIllIIIIIllIlIIIIlI) : 16777215;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll), lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2);
        if (ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI) {
            final net.minecraft.IlIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll3 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2);
            if (llllIIIIlIIIlIlllIll3 instanceof IIlllIlIIllIlIlIlIIl) {
                ((IIlllIlIIllIlIlIlIIl)llllIIIIlIIIlIlllIll3).IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII()));
                llllIIIIlIIIlIlllIll3.llIIIlIlIllIIlIlIlII();
                illlllllIIIlIIIlIlII.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll2);
                if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                    --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                }
                return true;
            }
        }
        llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        double n4 = 0.0;
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl && ilIlIlIlIlllllllllIl instanceof IIlllllIllIllIlIlIII) {
            n4 = 0.5;
        }
        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII() + 0.5, llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() + n4, llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl() + 0.5);
        if (llllIIIIlIIIlIlllIll4 != null) {
            if (llllIIIIlIIIlIlllIll4 instanceof lllIIIIlllllIlIIllIl && lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
                llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
            }
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
        }
        return true;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return lllIIIIlIlIllIIlIIIl;
        }
        final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll2 = this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll, true);
        if (llllIIIIlIIIlIlllIll2 == null) {
            return lllIIIIlIlIllIIlIIIl;
        }
        if (llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
            if (!illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll3)) {
                return lllIIIIlIlIllIIlIIIl;
            }
            if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl, lllIIIIlIlIllIIlIIIl)) {
                return lllIIIIlIlIllIIlIIIl;
            }
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI() instanceof IlIIlllIIlIlllllIIlI) {
                final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll3.lIIIIlIIIIIlllIllIII() + 0.5, llllIIIIlIIIlIlllIll3.lIIIlllIIIllIIIllIII() + 0.5, llllIIIIlIIIlIlllIll3.llIIlIIIlIIIllIlIIIl() + 0.5);
                if (llllIIIIlIIIlIlllIll4 != null) {
                    if (llllIIIIlIIIlIlllIll4 instanceof lllIIIIlllllIlIIllIl && lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
                        ((IlIllIlIlIIIlIlIlIII)llllIIIIlIIIlIlllIll4).IlIIIlIlIIIllIlIlIIl(lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
                    }
                    if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
                    }
                    llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(net.minecraft.IIIlIIIlIlIIlllIIlll.IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
                }
            }
        }
        return lllIIIIlIlIllIIlIIIl;
    }
    
    public static llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final int n, final double n2, final double n3, final double n4) {
        if (!IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.containsKey(n)) {
            return null;
        }
        llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = null;
        for (int i = 0; i < 1; ++i) {
            llllIIIIlIIIlIlllIll = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(n, illlllllIIIlIIIlIlII);
            if (llllIIIIlIIIlIlllIll instanceof lllIIIIlllllIlIIllIl) {
                final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = (IlIllIlIlIIIlIlIlIII)llllIIIIlIIIlIlllIll;
                llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n2, n3, n4, llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll.nextFloat() * 360.0f), 0.0f);
                ilIllIlIlIIIlIlIlIII.lIIlllIlllllIIlllIll = ilIllIlIlIIIlIlIlIII.IIlIIIIIllIlIIIlIIll;
                ilIllIlIlIIIlIlIlIII.lIllIlIIIllllllIIlII = ilIllIlIlIIIlIlIlIII.IIlIIIIIllIlIIIlIIll;
                ilIllIlIlIIIlIlIlIII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII.lIllllllIIllIlIlIlII(new IlIlIlIlIlllllllllIl(ilIllIlIlIIIlIlIlIII)), null);
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                ilIllIlIlIIIlIlIlIII.IlIIIlIIIllllIlIlIlI();
            }
        }
        return llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final List list) {
        final Iterator<llllIIllllIlIlIIIIll> iterator = IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll.values().iterator();
        while (iterator.hasNext()) {
            list.add(new lllIIIIlIlIllIIlIIIl(ilIIIlIlIIIllIlIlIIl, 1, iterator.next().llllIIIIlIIIlIlllIll));
        }
    }
}
