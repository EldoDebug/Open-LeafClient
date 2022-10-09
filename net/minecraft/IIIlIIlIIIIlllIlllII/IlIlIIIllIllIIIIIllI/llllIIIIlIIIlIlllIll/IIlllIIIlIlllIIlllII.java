package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class IIlllIIIlIlllIIlllII extends IIIIIIIIIlllIllIlIlI
{
    private final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll;
    private final llIIlIIIlIIIllIlIIIl IlIlIlIlIlllllllllIl;
    
    public IIlllIIIlIlllIIlllII(final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llllIIIIlIIIlIlllIll) {
        super(false);
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
        while (((llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI()).IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 0) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl, this.IlIlIlIlIlllllllllIl);
            for (int i = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); i <= ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 2; ++i) {
                for (int n = 2 - (i - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII()), j = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() - n; j <= ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + n; ++j) {
                    final int n2 = j - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII();
                    for (int k = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() - n; k <= ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + n; ++k) {
                        final int n3 = k - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl();
                        if (Math.abs(n2) != n || Math.abs(n3) != n || random.nextInt(2) != 0) {
                            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(j, i, k);
                            if (!illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll()) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, this.llllIIIIlIIIlIlllIll);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
