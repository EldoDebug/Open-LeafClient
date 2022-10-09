package net.minecraft.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import com.google.common.collect.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import java.util.*;

public class IllIIlllIIIIlllIIlIl implements IlIIIlIlIIIllIlIlIIl
{
    private lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII, final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII) {
        this.llllIIIIlIIIlIlllIll = null;
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++i) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(i);
            if (lIlIlIIIllIIllIIIllI != null) {
                if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI) {
                    ++n2;
                }
                else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ag) {
                    ++n4;
                }
                else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.a) {
                    ++n3;
                }
                else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.llllllIIIIIIIlllIIll) {
                    ++n;
                }
                else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.lIIlIIIIIIIlIIlIlIIl) {
                    ++n5;
                }
                else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII) {
                    ++n5;
                }
                else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.P) {
                    ++n6;
                }
                else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll) {
                    ++n6;
                }
                else if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.B) {
                    ++n6;
                }
                else {
                    if (lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll() != IIllIIllIIIlIlIIIIlI.ab) {
                        return false;
                    }
                    ++n6;
                }
            }
        }
        final int n7 = n5 + n3 + n6;
        if (n2 > 3 || n > 1) {
            return false;
        }
        if (n2 >= 1 && n == 1 && n7 == 0) {
            this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.af);
            if (n4 > 0) {
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new IIIIlllIIIIIIlIIIlll();
                final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new IIIIlllIIIIIIlIIIlll();
                final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl();
                for (int j = 0; j < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++j) {
                    final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI2 = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(j);
                    if (lIlIlIIIllIIllIIIllI2 != null && lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ag && lIlIlIIIllIIllIIIllI2.IIIIlllIIIIIIlIIIlll() && lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll().IlIlIlIlIlllllllllIl("Explosion", 10)) {
                        ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI2.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("Explosion"));
                    }
                }
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Explosions", ilIlIIIlIIlIlIIlllIl);
                iiiIlllIIIIIIlIIIlll2.llllIIIIlIIIlIlllIll("Flight", (byte)n2);
                iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("Fireworks", iiiIlllIIIIIIlIIIlll2);
                this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll);
            }
            return true;
        }
        if (n2 == 1 && n == 0 && n4 == 0 && n3 > 0 && n6 <= 1) {
            this.llllIIIIlIIIlIlllIll = new lllIIIIlIlIllIIlIIIl(IIllIIllIIIlIlIIIIlI.ag);
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll3 = new IIIIlllIIIIIIlIIIlll();
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll4 = new IIIIlllIIIIIIlIIIlll();
            byte b = 0;
            final ArrayList arrayList = Lists.newArrayList();
            for (int k = 0; k < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++k) {
                final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI3 = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(k);
                if (lIlIlIIIllIIllIIIllI3 != null) {
                    if (lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.a) {
                        arrayList.add(IllIllIIIIlIIlIlllII.llllIIIlIlllIlIIIIIl[lIlIlIIIllIIllIIIllI3.lIIIIlIIIIIlllIllIII() & 0xF]);
                    }
                    else if (lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.lIIlIIIIIIIlIIlIlIIl) {
                        iiiIlllIIIIIIlIIIlll4.llllIIIIlIIIlIlllIll("Flicker", true);
                    }
                    else if (lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.lIIIlllIIIllIIIllIII) {
                        iiiIlllIIIIIIlIIIlll4.llllIIIIlIIIlIlllIll("Trail", true);
                    }
                    else if (lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.P) {
                        b = 1;
                    }
                    else if (lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.IIlIIIIIllIlIIIlIIll) {
                        b = 4;
                    }
                    else if (lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.B) {
                        b = 2;
                    }
                    else if (lIlIlIIIllIIllIIIllI3.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ab) {
                        b = 3;
                    }
                }
            }
            final int[] array = new int[arrayList.size()];
            for (int l = 0; l < array.length; ++l) {
                array[l] = (int)arrayList.get(l);
            }
            iiiIlllIIIIIIlIIIlll4.llllIIIIlIIIlIlllIll("Colors", array);
            iiiIlllIIIIIIlIIIlll4.llllIIIIlIIIlIlllIll("Type", b);
            iiiIlllIIIIIIlIIIlll3.llllIIIIlIIIlIlllIll("Explosion", iiiIlllIIIIIIlIIIlll4);
            this.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll3);
            return true;
        }
        if (n2 != 0 || n != 0 || n4 != 1 || n3 <= 0 || n3 != n7) {
            return false;
        }
        final ArrayList arrayList2 = Lists.newArrayList();
        for (int n8 = 0; n8 < illlIIIlIlllIIlllII.lIIIlllIIIllIIIllIII(); ++n8) {
            final lllIIIIlIlIllIIlIIIl lIlIlIIIllIIllIIIllI4 = illlIIIlIlllIIlllII.lIlIlIIIllIIllIIIllI(n8);
            if (lIlIlIIIllIIllIIIllI4 != null) {
                if (lIlIlIIIllIIllIIIllI4.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.a) {
                    arrayList2.add(IllIllIIIIlIIlIlllII.llllIIIlIlllIlIIIIIl[lIlIlIIIllIIllIIIllI4.lIIIIlIIIIIlllIllIII() & 0xF]);
                }
                else if (lIlIlIIIllIIllIIIllI4.llllIIIIlIIIlIlllIll() == IIllIIllIIIlIlIIIIlI.ag) {
                    this.llllIIIIlIIIlIlllIll = lIlIlIIIllIIllIIIllI4.llIIlIIIlIIIllIlIIIl();
                    this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl = 1;
                }
            }
        }
        final int[] array2 = new int[arrayList2.size()];
        for (int n9 = 0; n9 < array2.length; ++n9) {
            array2[n9] = (int)arrayList2.get(n9);
        }
        if (this.llllIIIIlIIIlIlllIll == null || !this.llllIIIIlIIIlIlllIll.IIIIlllIIIIIIlIIIlll()) {
            return false;
        }
        final IIIIlllIIIIIIlIIIlll ilIlIIIllIIllIlllllI = this.llllIIIIlIIIlIlllIll.llllIIllllIlIlIIIIll().IlIlIIIllIIllIlllllI("Explosion");
        if (ilIlIIIllIIllIlllllI == null) {
            return false;
        }
        ilIlIIIllIIllIlllllI.llllIIIIlIIIlIlllIll("FadeColors", array2);
        return true;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll(final IIlllIIIlIlllIIlllII illlIIIlIlllIIlllII) {
        return this.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl();
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 10;
    }
    
    @Override
    public lllIIIIlIlIllIIlIIIl IlIlIlIlIlllllllllIl() {
        return this.llllIIIIlIIIlIlllIll;
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
