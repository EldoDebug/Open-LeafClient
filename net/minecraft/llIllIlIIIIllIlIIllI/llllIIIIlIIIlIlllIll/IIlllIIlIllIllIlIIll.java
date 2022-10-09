package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;

public class IIlllIIlIllIllIlIIll implements IlIIIlIlIIIllIlIlIIl
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        int n = 0;
        lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.h) {
                    if (lllIIIIlIlIllIIlIIIl != null) {
                        return false;
                    }
                    lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
                }
                else {
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.Z) {
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
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.h) {
                    if (lllIIIIlIlIllIIlIIIl != null) {
                        return null;
                    }
                    lllIIIIlIlIllIIlIIIl = lIlIlIIIllIIllIIIllI;
                }
                else {
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.Z) {
                        return null;
                    }
                    ++n;
                }
            }
        }
        if (lllIIIIlIlIllIIlIIIl != null && n >= 1) {
            final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl2 = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.h, n + 1, lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII());
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
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().llIllIlIIIIllIlIIllI()) {
                array[i] = new lllIIIIlIlIllIIlIIIl(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll().llIIlIIIlIIIllIlIIIl());
            }
        }
        return array;
    }
}
