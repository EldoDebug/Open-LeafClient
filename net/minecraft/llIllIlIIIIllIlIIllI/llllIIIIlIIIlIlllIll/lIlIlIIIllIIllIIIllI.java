package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

class lIlIlIIIllIIllIIIllI implements IlIIIlIlIIIllIlIlIIl
{
    private lIlIlIIIllIIllIIIllI() {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = null;
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.aI) {
                    return false;
                }
                if (lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl2 != null) {
                    return false;
                }
                final int ilIlIlIlIlllllllllIl = lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(lIlIlIIIllIIllIIIllI);
                final boolean b = lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI) > 0;
                if (lllIIIIlIlIllIIlIIIl != null) {
                    if (b) {
                        return false;
                    }
                    if (ilIlIlIlIlllllllllIl != lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl)) {
                        return false;
                    }
                    lllIIIIlIlIllIIlIIIl2 = lIlIlIIIllIIllIIIllI;
                }
                else if (lllIIIIlIlIllIIlIIIl2 != null) {
                    if (!b) {
                        return false;
                    }
                    if (ilIlIlIlIlllllllllIl != lIIIIlIIIIIlllIllIII.IlIlIlIlIlllllllllIl(lllIIIIlIlIllIIlIIIl2)) {
                        return false;
                    }
                    lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
                }
                else if (b) {
                    lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
                }
                else {
                    lllIIIIlIlIllIIlIIIl2 = lIlIlIIIllIIllIIIllI;
                }
            }
        }
        return lllIIIIlIlIllIIlIIIl != null && lllIIIIlIlIllIIlIIIl2 != null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null && lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI) > 0) {
                final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
                llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = 1;
                return llIIlIIIlIIIllIlIIIl;
            }
        }
        return null;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl() {
        return null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl[] IlIlIlIlIlllllllllIl(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        final lllIIIIlIlIllIIlIIIl[] array = new lllIIIIlIlIllIIlIIIl[illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII()];
        for (int i = 0; i < array.length; ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().llIllIlIIIIllIlIIllI()) {
                    array[i] = new lllIIIIlIlIllIIlIIIl(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl());
                }
                else if (lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll() && lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI) > 0) {
                    array[i] = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
                    array[i].IlIlIlIlIlllllllllIl = 1;
                }
            }
        }
        return array;
    }
}
