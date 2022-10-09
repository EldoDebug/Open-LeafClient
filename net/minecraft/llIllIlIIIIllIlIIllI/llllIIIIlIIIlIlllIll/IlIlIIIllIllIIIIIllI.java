package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IlIlIIIllIllIIIIIllI implements IlIIIlIlIIIllIlIlIIl
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        int n = 0;
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.R) {
                    if (lllIIIIlIlIllIIlIIIl != null) {
                        return false;
                    }
                    lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
                }
                else {
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.Q) {
                        return false;
                    }
                    ++n;
                }
            }
        }
        return lllIIIIlIlIllIIlIIIl != null && n > 0;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        int n = 0;
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.R) {
                    if (lllIIIIlIlIllIIlIIIl != null) {
                        return null;
                    }
                    lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
                }
                else {
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.Q) {
                        return null;
                    }
                    ++n;
                }
            }
        }
        if (lllIIIIlIlIllIIlIIIl != null && n >= 1 && IlIllllIIlIIlIlIlIll.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl) < 2) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.R, n);
            lllIIIIlIlIllIIlIIIl2.IlIIIlIlIIIllIlIlIIl((IIIIlllIIIIIIlIIIlll)lllIIIIlIlIllIIlIIIl.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl());
            lllIIIIlIlIllIIlIIIl2.llllIIllllIlIlIIIIll().llllIIIIlIIIlIlllIll("generation", IlIllllIIlIIlIlIlIll.llIllIlIIIIllIlIIllI(lllIIIIlIlIllIIlIIIl) + 1);
            if (lllIIIIlIlIllIIlIIIl.IlIlIIIIIIlllIlIllIl()) {
                lllIIIIlIlIllIIlIIIl2.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl.IIlllIIlIllIllIlIIll());
            }
            return lllIIIIlIlIllIIlIIIl2;
        }
        return null;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 9;
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
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() instanceof IlIllllIIlIIlIlIlIll) {
                array[i] = lIlIlIIIllIIllIIIllI;
                break;
            }
        }
        return array;
    }
}
