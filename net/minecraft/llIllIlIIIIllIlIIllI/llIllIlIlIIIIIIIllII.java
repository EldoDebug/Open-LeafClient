package net.minecraft.llIllIlIIIIllIlIIllI;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;

public class llIllIlIlIIIIIIIllII extends IlIIIlIlIIIllIlIlIIl
{
    private llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl;
    
    public llIllIlIlIIIIIIIllII(final llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl) {
        this.llllIIIlIlllIlIIIIIl = llllIIIlIlllIlIIIIIl;
        this.llllIIIIlIIIlIlllIll(net.minecraft.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl, final net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final float n, final float n2, final float n3) {
        if (lllIllIIIllllllIllll != lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl) {
            return false;
        }
        if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
            llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll);
        }
        if (!llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll, lllIIIIlIlIllIIlIIIl)) {
            return false;
        }
        if (!this.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2)) {
            return false;
        }
        llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll2, lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.IIlIIIIIllIlIIIlIIll), this.llllIIIlIlllIlIIIIIl);
        --lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl;
        return true;
    }
    
    public static void llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl, final lllIllIIIllllllIllll lllIllIIIllllllIllll, final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.IllIIlllIIIIlllIIlIl());
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(lllIllIIIllllllIllll.llllIIIlIlllIlIIIIIl());
        final int n = (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII() + illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) ? 1 : 0;
        final int n2 = (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII() + illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI().lIIIIlIIIIIlllIllIII()) ? 1 : 0;
        final boolean b = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3).llIllIIIIIllIlIIIIlI() == llllIIIIlIIIlIlllIll || illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI() == llllIIIIlIIIlIlllIll;
        final boolean b2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI() == llllIIIIlIIIlIlllIll || illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll()).llIllIIIIIllIlIIIIlI() == llllIIIIlIIIlIlllIll;
        boolean b3 = false;
        if ((b && !b2) || n2 > n) {
            b3 = true;
        }
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll4 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll5 = llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll().llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IIIIIIIIIlllIllIlIlI, lllIllIIIllllllIllll).llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.IlllIIIIlIIIlIlIlIIl, b3 ? IllIlIIllIllIIlIllII.IlIlIlIlIlllllllllIl : IllIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII, IlIIlIlIIIlIIlIlIlII.IlIlIlIlIlllllllllIl), 2);
        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(llIlIIIIIlIIlIlIIlll.llIllIlIlIIIIIIIllII, IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll), 2);
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, llllIIIIlIIIlIlllIll);
        illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll4, llllIIIIlIIIlIlllIll);
    }
}
