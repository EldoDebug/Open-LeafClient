package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;

public class IIIlIIIlIlIIlllIIlll implements IlIIIlIlIIIllIlIlIIl
{
    private final int llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    private final lllIIIIlIlIllIIlIIIl[] llIllIIIIIllIlIIIIlI;
    private final lllIIIIlIlIllIIlIIIl IlIIIlIlIIIllIlIlIIl;
    private boolean IlIlIIIllIllIIIIIllI;
    
    public IIIlIIIlIlIIlllIIlll(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl, final lllIIIIlIlIllIIlIIIl[] llIllIIIIIllIlIIIIlI, final lllIIIIlIlIllIIlIIIl ilIIIlIlIIIllIlIlIIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
        this.IlIIIlIlIIIllIlIlIIl = ilIIIlIlIIIllIlIlIIl;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl() {
        return this.IlIIIlIlIIIllIlIlIIl;
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
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        for (int i = 0; i <= 3 - this.llllIIIIlIIIlIlllIll; ++i) {
            for (int j = 0; j <= 3 - this.IlIlIlIlIlllllllllIl; ++j) {
                if (this.llllIIIIlIIIlIlllIll(illlIIIlIlllIIlllII, i, j, true)) {
                    return true;
                }
                if (this.llllIIIIlIIIlIlllIll(illlIIIlIlllIIlllII, i, j, false)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final int n, final int n2, final boolean b) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                final int n3 = i - n;
                final int n4 = j - n2;
                lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = null;
                if (n3 >= 0 && n4 >= 0 && n3 < this.llllIIIIlIIIlIlllIll && n4 < this.IlIlIlIlIlllllllllIl) {
                    if (b) {
                        lllIIIIlIlIllIIlIIIl = this.llIllIIIIIllIlIIIIlI[this.llllIIIIlIIIlIlllIll - n3 - 1 + n4 * this.llllIIIIlIIIlIlllIll];
                    }
                    else {
                        lllIIIIlIlIllIIlIIIl = this.llIllIIIIIllIlIIIIlI[n3 + n4 * this.llllIIIIlIIIlIlllIll];
                    }
                }
                final lllIIIIlIlIllIIlIIIl llIllIIIIIllIlIIIIlI = illlIIIlIlllIIlllII.llIllIIIIIllIlIIIIlI(i, j);
                if (llIllIIIIIllIlIIIIlI != null || lllIIIIlIlIllIIlIIIl != null) {
                    if ((llIllIIIIIllIlIIIIlI == null && lllIIIIlIlIllIIlIIIl != null) || (llIllIIIIIllIlIIIIlI != null && lllIIIIlIlIllIIlIIIl == null)) {
                        return false;
                    }
                    if (lllIIIIlIlIllIIlIIIl.llllIIIIlIIIlIlllIll() != llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll()) {
                        return false;
                    }
                    if (lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() != 32767 && lllIIIIlIlIllIIlIIIl.lIIIIlIIIIIlllIllIII() != llIllIIIIIllIlIIIIlI.lIIIIlIIIIIlllIllIII()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        final lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = this.IlIlIlIlIlllllllllIl().llIIlIIIlIIIllIlIIIl();
        if (this.IlIlIIIllIllIIIIIllI) {
            for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
                if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll()) {
                    llIIlIIIlIIIllIlIIIl.IlIIIlIlIIIllIlIlIIl((IIIIlllIIIIIIlIIIlll)lIlIlIIIllIIllIIIllI.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl());
                }
            }
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return this.llllIIIIlIIIlIlllIll * this.IlIlIlIlIlllllllllIl;
    }
}
