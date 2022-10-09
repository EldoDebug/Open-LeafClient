package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIlIIIIIllIlIIIlIIll extends IlIIIlIlIIIllIlIlIIl
{
    public IIlIIIIIllIlIIIlIIll() {
        this.IlIIIlIlIIIllIlIlIIl = 1;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI);
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final float n = 1.0f;
        final float n2 = llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI + (llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI - llllIIIIlIIIlIlllIll.IlIIIlIIIllllIlIlIlI) * n;
        final float n3 = llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl + (llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll - llllIIIIlIIIlIlllIll.IIIllllllIllIIIlllIl) * n;
        final e e = new e(llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII + (llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl - llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII) * n, llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII + (llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII - llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII) * n + llllIIIIlIIIlIlllIll.llllIlIllllIIlIIlIlI(), llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII + (llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII - llllIIIIlIIIlIlllIll.IlIlIllllllllIIIIlII) * n);
        final float ilIlIlIlIlllllllllIl = llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(-n3 * 0.017453292f - 3.1415927f);
        final float llllIIIIlIIIlIlllIll2 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(-n3 * 0.017453292f - 3.1415927f);
        final float n4 = -llIllIIlllllllllllll.IlIlIlIlIlllllllllIl(-n2 * 0.017453292f);
        final float llllIIIIlIIIlIlllIll3 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(-n2 * 0.017453292f);
        final float n5 = llllIIIIlIIIlIlllIll2 * n4;
        final float n6 = ilIlIlIlIlllllllllIl * n4;
        final double n7 = 5.0;
        final llIlllIlllllIIllIIII llllIIIIlIIIlIlllIll4 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(e, e.IlIlIlIlIlllllllllIl(n5 * n7, llllIIIIlIIIlIlllIll3 * n7, n6 * n7), true);
        if (llllIIIIlIIIlIlllIll4 == null) {
            return lllIIIIlIlIllIIlIIIl;
        }
        final e llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n);
        boolean b = false;
        final float n8 = 1.0f;
        final List ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll.IlIIlllIIlIlllllIIlI().llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll * n7, llllIIIIlIIIlIlllIll5.IlIlIlIlIlllllllllIl * n7, llllIIIIlIIIlIlllIll5.llIllIIIIIllIlIIIIlI * n7).IlIlIlIlIlllllllllIl(n8, n8, n8));
        for (int i = 0; i < ilIlIlIlIlllllllllIl2.size(); ++i) {
            final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl2.get(i);
            if (llIllIIIIIllIlIIIIlI.IIlllIIlllIIIlIlllII()) {
                final float lllllIIllIlIllIllllI = llIllIIIIIllIlIIIIlI.lllllIIllIlIllIllllI();
                if (llIllIIIIIllIlIIIIlI.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(lllllIIllIlIllIllllI, lllllIIllIlIllIllllI, lllllIIllIlIllIllllI).llllIIIIlIIIlIlllIll(e)) {
                    b = true;
                }
            }
        }
        if (b) {
            return lllIIIIlIlIllIIlIIIl;
        }
        if (llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll == lllllIlIlIlllIlllIlI.IlIlIlIlIlllllllllIl) {
            net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll();
            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllIlIIIIIlIlllllIlI) {
                ilIlIlIlIlllllllllIl3 = ilIlIlIlIlllllllllIl3.IlIlIlIlIlllllllllIl();
            }
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4 = new IlIlIlIlIlllllllllIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl3.lIIIIlIIIIIlllIllIII() + 0.5f, ilIlIlIlIlllllllllIl3.lIIIlllIIIllIIIllIII() + 1.0f, ilIlIlIlIlllllllllIl3.llIIlIIIlIIIllIlIIIl() + 0.5f);
            ilIlIlIlIlllllllllIl4.IIlIIIIIllIlIIIlIIll = (float)(((llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll * 4.0f / 360.0f + 0.5) & 0x3) - 1) * 90);
            if (!illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, ilIlIlIlIlllllllllIl4.IlIIlllIIlIlllllIIlI().IlIlIlIlIlllllllllIl(-0.1, -0.1, -0.1)).isEmpty()) {
                return lllIIIIlIlIllIIlIIIl;
            }
            if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4);
            }
            if (!llllIIIIlIIIlIlllIll.K.IlIIIlIlIIIllIlIlIIl) {
                --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            }
            llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(this)]);
        }
        return lllIIIIlIlIllIIlIIIl;
    }
}
