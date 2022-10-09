package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class llIllIlIlIIIIIIIllII extends lllIllIIIllllllIllll
{
    private final List llllIIIIlIIIlIlllIll;
    private final int IlIlIlIlIlllllllllIl;
    
    public llIllIlIlIIIIIIIllII(final List llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI;
        while (((llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI()).IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 1) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 1) {
            return false;
        }
        ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll();
        for (int i = 0; i < 4; ++i) {
            final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(4) - random.nextInt(4), random.nextInt(3) - random.nextInt(3), random.nextInt(4) - random.nextInt(4));
            if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl())) {
                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl.lllIllIIIllllllIllll(), 2);
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
                if (llllIIIIlIIIlIlllIll2 instanceof IlIlIIIllIIllIlllllI) {
                    k.llllIIIIlIIIlIlllIll(random, this.llllIIIIlIIIlIlllIll, (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll2, this.IlIlIlIlIlllllllllIl);
                }
                final IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl();
                final IlIlIlIlIlllllllllIl ilIlIIIllIllIIIIIllI = llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI();
                final IlIlIlIlIlllllllllIl llIllIIIIIllIlIIIIlI2 = llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI();
                final IlIlIlIlIlllllllllIl ilIIIlIlIIIllIlIlIIl = llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl();
                if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIIIllIllIIIIIllI) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIllIllIIIIIllI.IlIlIlIlIlllllllllIl())) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIIIllIllIIIIIllI, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll(), 2);
                }
                if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(illIIlllIIIIlllIIlIl) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl())) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll(), 2);
                }
                if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llIllIIIIIllIlIIIIlI2) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, llIllIIIIIllIlIIIIlI2.IlIlIlIlIlllllllllIl())) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llIllIIIIIllIlIIIIlI2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll(), 2);
                }
                if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl) && IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl())) {
                    illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIIIIlIllIIlIIIll.lllIllIIIllllllIllll(), 2);
                }
                return true;
            }
        }
        return false;
    }
}
