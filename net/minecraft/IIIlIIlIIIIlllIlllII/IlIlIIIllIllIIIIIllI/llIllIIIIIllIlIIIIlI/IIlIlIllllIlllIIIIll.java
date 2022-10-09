package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;

public class IIlIlIllllIlllIIIIll extends IlIIlllllIIllIIlllll
{
    private int llllIIllllIlIlIIIIll;
    
    public IIlIlIllllIlllIIIIll() {
    }
    
    public IIlIlIllllIlllIIIIll(final lllIllIIIllllllIllll lllIllIIIllllllIllll, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl, final int n) {
        super(lllIllIIIllllllIllll, ilIlIIIlIIlIlIIlllIl);
        this.llllIIllllIlIlIIIIll = (n & 0x1);
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl) {
        if (this.llllIIllllIlIlIIIIll == 0) {
            for (int i = 0; i < 4; ++i) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10 - i, 3 - i, 20 - i, 12 + i, 3 - i, 20, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 0, 6, 15, 0, 16, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 0, 6, 6, 3, 20, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 16, 0, 6, 16, 3, 20, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 7, 7, 1, 20, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 1, 7, 15, 1, 20, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 1, 6, 9, 3, 6, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 13, 1, 6, 15, 3, 6, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 1, 7, 9, 1, 7, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 13, 1, 7, 14, 1, 7, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 0, 5, 13, 0, 5, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 10, 0, 7, 12, 0, 7, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 0, 10, 8, 0, 12, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 14, 0, 10, 14, 0, 12, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, false);
            for (int j = 18; j >= 7; j -= 3) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 6, 3, j, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 16, 3, j, ilIlIIIlIIlIlIIlllIl);
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 10, 0, 10, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 12, 0, 10, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 10, 0, 12, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 12, 0, 12, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 8, 3, 6, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 14, 3, 6, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 4, 2, 4, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 4, 1, 4, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 4, 0, 4, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 18, 2, 4, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 18, 1, 4, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 18, 0, 4, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 4, 2, 18, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 4, 1, 18, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 4, 0, 18, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 18, 2, 18, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, 18, 1, 18, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 18, 0, 18, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 9, 7, 20, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, 13, 7, 20, ilIlIIIlIIlIlIIlllIl);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 6, 0, 21, 7, 4, 21, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 15, 0, 21, 16, 4, 21, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 2, 16);
        }
        else if (this.llllIIllllIlIlIIIIll == 1) {
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 3, 18, 13, 3, 20, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 9, 0, 18, 9, 2, 18, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 13, 0, 18, 13, 2, 18, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            int n = 9;
            final int n2 = 20;
            final int n3 = 5;
            for (int k = 0; k < 2; ++k) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, n, n3 + 1, n2, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, n, n3, n2, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, n, n3 - 1, n2, ilIlIIIlIIlIlIIlllIl);
                n = 13;
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 7, 3, 7, 15, 3, 14, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
            int n4 = 10;
            for (int l = 0; l < 2; ++l) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n4, 0, 10, n4, 6, 10, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n4, 0, 12, n4, 6, 12, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, n4, 0, 10, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, n4, 0, 12, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, n4, 4, 10, ilIlIIIlIIlIlIIlllIl);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, IIlIlIllllIlllIIIIll.lIIIIlIIIIIlllIllIII, n4, 4, 12, ilIlIIIlIIlIlIIlllIl);
                n4 = 12;
            }
            int n5 = 8;
            for (int n6 = 0; n6 < 2; ++n6) {
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n5, 0, 7, n5, 2, 7, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, n5, 0, 14, n5, 2, 14, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, IIlIlIllllIlllIIIIll.IlIlIlIlIlllllllllIl, false);
                n5 = 14;
            }
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 8, 3, 8, 8, 3, 13, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 14, 3, 8, 14, 3, 13, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, IIlIlIllllIlllIIIIll.llIllIIIIIllIlIIIIlI, false);
            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIIIlIIlIlIIlllIl, 11, 5, 13);
        }
        return true;
    }
}
