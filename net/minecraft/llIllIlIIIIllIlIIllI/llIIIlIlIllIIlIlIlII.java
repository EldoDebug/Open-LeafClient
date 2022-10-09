package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import java.util.*;

public class llIIIlIlIllIIlIlIlII extends IlIIIlIlIIIllIlIlIIl
{
    public llIIIlIlIllIIlIlIlII() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (lllIllIIIllllllIllll == lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll) {
            return false;
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl) ? ilIlIlIlIlllllllllIl : ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll();
        if ((!illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl2) && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2)) | (!illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2) && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2))) {
            return false;
        }
        final double n4 = ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII();
        final double n5 = ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII();
        final double n6 = ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl();
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(null, net.minecraft.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(n4, n5, n6, n4 + 1.0, n5 + 2.0, n6 + 1.0)).size() > 0) {
            return false;
        }
        if (!illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(ilIlIlIlIlllllllllIl2);
            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2);
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll3 = new net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, n4 + 0.5, n5, n6 + 0.5);
            llllIIIIlIIIlIlllIll3.IlIlIlIlIlllllllllIl(n4 + 0.5, n5, n6 + 0.5, llIllIIlllllllllllll.IlIIIlIlIIIllIlIlIIl((llIllIIlllllllllllll.llllIIIlIlllIlIIIIIl(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll - 180.0f) + 22.5f) / 45.0f) * 45.0f, 0.0f);
            this.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3, illlllllIIIlIIIlIlII.llllIIllllIlIlIIIIll);
            final IIIIlllIIIIIIlIIIlll llllIIllllIlIlIIIIll = lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll();
            if (llllIIllllIlIlIIIIll != null && llllIIllllIlIlIIIIll.IlIlIlIlIlllllllllIl("EntityTag", 10)) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                llllIIIIlIIIlIlllIll3.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll);
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIllllIlIlIIIIll.IlIlIIIllIIllIlllllI("EntityTag"));
                llllIIIIlIIIlIlllIll3.IllIIlllIIIIlllIIlIl(iiiIlllIIIIIIlIIIlll);
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
        }
        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        return true;
    }
    
    private void llllIIIIlIIIlIlllIll(final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final Random random) {
        final net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl lllIIIIlllllIlIIllIl = llllIIIIlIIIlIlllIll.lllIIIIlllllIlIIllIl();
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl(lllIIIIlllllIlIIllIl.IlIlIlIlIlllllllllIl() + random.nextFloat() * 5.0f, lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI() + (random.nextFloat() * 20.0f - 10.0f), lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl()));
        final net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl ilIlIIIIIIlllIlIllIl = llllIIIIlIIIlIlllIll.IlIlIIIIIIlllIlIllIl();
        llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(new net.minecraft.IlllllllIIIlIIIlIlII.lllIIIIlIlIllIIlIIIl(ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl(), ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI() + (random.nextFloat() * 10.0f - 5.0f), ilIlIIIIIIlllIlIllIl.IlIIIlIlIIIllIlIlIIl()));
    }
}
