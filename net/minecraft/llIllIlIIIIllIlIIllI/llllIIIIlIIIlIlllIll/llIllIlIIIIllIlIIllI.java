package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

class llIllIlIIIIllIlIIllI implements IlIIIlIlIIIllIlIlIIl
{
    private llIllIlIIIIllIlIIllI() {
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        int n = 0;
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.aI) {
                if (n != 0) {
                    return false;
                }
                if (lIIIIlIIIIIlllIllIII.llIllIIIIIllIlIIIIlI(lIlIlIIIllIIllIIIllI) >= 6) {
                    return false;
                }
                n = 1;
            }
        }
        return n != 0 && this.llIllIIIIIllIlIIIIlI(illlIIIlIlllIIlllII) != null;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        lllIIIIlIlIllIIlIIIl llIIlIIIlIIIllIlIIIl = null;
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.aI) {
                llIIlIIIlIIIllIlIIIl = lIlIlIIIllIIllIIIllI.llIIlIIIlIIIllIlIIIl();
                llIIlIIIlIIIllIlIIIl.IlIlIlIlIlllllllllIl = 1;
                break;
            }
        }
        final lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI = this.llIllIIIIIllIlIIIIlI(illlIIIlIlllIIlllII);
        if (llIllIIIIIllIlIIIIlI != null) {
            int liiiIlIIIIIlllIllIII = 0;
            for (int j = 0; j < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++j) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI2 = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(j);
                if (lIlIlIIIllIIllIIIllI2 != null && lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.a) {
                    liiiIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII();
                    break;
                }
            }
            final IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll = llIIlIIIlIIIllIlIIIl.llllIIIIlIIIlIlllIll("BlockEntityTag", true);
            IlIlIIIlIIlIlIIlllIl llIllIIIIIllIlIIIIlI2;
            if (llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl("Patterns", 9)) {
                llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI("Patterns", 10);
            }
            else {
                llIllIIIIIllIlIIIIlI2 = new IlIlIIIlIIlIlIIlllIl();
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll("Patterns", llIllIIIIIllIlIIIIlI2);
            }
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Pattern", llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl());
            iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Color", liiiIlIIIIIlllIllIII);
            llIllIIIIIllIlIIIIlI2.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        }
        return llIIlIIIlIIIllIlIIIl;
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 10;
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
    
    private lIIIlllIIIllIIIllIII llIllIIIIIllIlIIIIlI(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        lIIIlllIIIllIIIllIII[] values;
        for (int length = (values = lIIIlllIIIllIIIllIII.values()).length, i = 0; i < length; ++i) {
            final lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII = values[i];
            if (liiIlllIIIllIIIllIII.IlIIIlIlIIIllIlIlIIl()) {
                int n = 1;
                if (liiIlllIIIllIIIllIII.IlIlIIIllIllIIIIIllI()) {
                    int n2 = 0;
                    int n3 = 0;
                    for (int n4 = 0; n4 < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII() && n != 0; ++n4) {
                        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(n4);
                        if (lIlIlIIIllIIllIIIllI != null && lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.aI) {
                            if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.a) {
                                if (n3 != 0) {
                                    n = 0;
                                    break;
                                }
                                n3 = 1;
                            }
                            else {
                                if (n2 != 0 || !lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(liiIlllIIIllIIIllIII.IllIIlllIIIIlllIIlIl())) {
                                    n = 0;
                                    break;
                                }
                                n2 = 1;
                            }
                        }
                    }
                    if (n2 == 0) {
                        n = 0;
                    }
                }
                else if (illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII() == liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI().length * liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI()[0].length()) {
                    int liiiIlIIIIIlllIllIII = -1;
                    for (int j = 0; j < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++j) {
                        if (n == 0) {
                            break;
                        }
                        final int n5 = j / 3;
                        final int n6 = j % 3;
                        final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI2 = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(j);
                        if (lIlIlIIIllIIllIIIllI2 != null && lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.aI) {
                            if (lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.a) {
                                n = 0;
                                break;
                            }
                            if (liiiIlIIIIIlllIllIII != -1 && liiiIlIIIIIlllIllIII != lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII()) {
                                n = 0;
                                break;
                            }
                            if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI()[n5].charAt(n6) == ' ') {
                                n = 0;
                                break;
                            }
                            liiiIlIIIIIlllIllIII = lIlIlIIIllIIllIIIllI2.lIIIIlIIIIIlllIllIII();
                        }
                        else if (liiIlllIIIllIIIllIII.llIllIIIIIllIlIIIIlI()[n5].charAt(n6) != ' ') {
                            n = 0;
                            break;
                        }
                    }
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    return liiIlllIIIllIIIllIII;
                }
            }
        }
        return null;
    }
}
