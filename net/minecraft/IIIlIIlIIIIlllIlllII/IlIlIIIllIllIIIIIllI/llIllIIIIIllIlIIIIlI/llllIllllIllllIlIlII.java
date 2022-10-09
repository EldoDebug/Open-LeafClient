package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;

public class llllIllllIllllIlIlII extends IlIIlllllIIllIIlllll
{
    public llllIllllIllllIlIlII() {
    }
    
    public llllIllllIllllIlIlII(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final lllllIIlIlIIIlIlIIIl lllllIIlIlIIIlIlIIIl, final Random random) {
        super(1, lllIllIIIllllllIllll, lllllIIlIlIIIlIlIIIl, 1, 1, 1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.IIIIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll / 25 > 0) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 0, this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl()]);
        }
        if (this.IIIIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl[lllIllIIIllllllIllll.IlIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()] == null) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 4, 1, 6, 4, 6, llllIllllIllllIlIlII.llllIIIIlIIIlIlllIll);
        }
        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= 6; ++j) {
                if (random.nextInt(3) != 0) {
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, i, 2 + ((random.nextInt(4) != 0) ? 1 : 0), j, i, 3, j, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI(1), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI(1), false);
                }
            }
        }
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 0, 0, 1, 7, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 0, 7, 1, 7, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 0, 6, 1, 0, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 1, 7, 6, 1, 7, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 2, 0, 0, 2, 7, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 2, 0, 7, 2, 7, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 0, 6, 2, 0, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 2, 7, 6, 2, 7, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 3, 0, 0, 3, 7, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 3, 0, 7, 3, 7, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 0, 6, 3, 0, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 1, 3, 7, 6, 3, 7, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, llllIllllIllllIlIlII.IlIlIlIlIlllllllllIl, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 0, 1, 3, 0, 2, 4, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 3, 7, 2, 4, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 0, 4, 2, 0, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, false);
        this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 7, 4, 2, 7, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, llllIllllIllllIlIlII.llIllIIIIIllIlIIIIlI, false);
        if (this.IIIIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI[lllIllIIIllllllIllll.IlIIIlIlIIIllIlIlIIl.IlIlIlIlIlllllllllIl()]) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 3, 1, 0, 4, 2, 0, false);
        }
        return true;
    }
}
