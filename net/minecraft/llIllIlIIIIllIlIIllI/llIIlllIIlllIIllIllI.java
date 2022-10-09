package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IlIIIlIlIIIllIlIlIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llIIlllIIlllIIllIllI extends IlIIIlIlIIIllIlIlIIl
{
    public llIIlllIIlllIIllIllI() {
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (illlllllIIIlIIIlIlII.IlIlIllllllllIIIIlII) {
            return true;
        }
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            return false;
        }
        final boolean llllIIIIlIIIlIlllIll3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2);
        if (!llllIIIIlIIIlIlllIll3) {
            llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll();
        }
        final lllIllIIIllllllIllll ilIlIlIlIlllllllllIl = lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl(llIllIIlllllllllllll.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll * 4.0f / 360.0f + 0.5) & 0x3);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl) || !llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        final boolean llllIIIIlIIIlIlllIll5 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll4);
        final boolean b = llllIIIIlIIIlIlllIll3 || illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll2);
        final boolean b2 = llllIIIIlIIIlIlllIll5 || illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll4);
        if (b && b2 && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl()) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl())) {
            final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll6 = net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIllllIIIlIIIIIIllIl, false).llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IlllIIIIlIIIlIlIlIIl, ilIlIlIlIlllllllllIl).llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI, IIllIIllIIIlIlIIIIlI.IlIlIlIlIlllllllllIl);
            if (illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, llllIIIIlIIIlIlllIll6, 3)) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll6.llllIIIIlIIIlIlllIll(IlIlIIIIIIlllIlIllIl.IIIIIIIIIlllIllIlIlI, IIllIIllIIIlIlIIIIlI.llllIIIIlIIIlIlllIll), 3);
            }
            --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
            return true;
        }
        return false;
    }
}
