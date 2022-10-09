package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import java.util.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;

public class IIIlIIIlIlIIlllIIlll extends lllIllIIIllllllIllll
{
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        while (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl) && ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 2) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl();
        }
        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI) {
            return false;
        }
        ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(random.nextInt(4));
        final int n = random.nextInt(4) + 7;
        final int n2 = n / 4 + random.nextInt(2);
        if (n2 > 1 && random.nextInt(60) == 0) {
            ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(10 + random.nextInt(30));
        }
        for (int i = 0; i < n; ++i) {
            final float n3 = (1.0f - i / (float)n) * n2;
            for (int illIIlllIIIIlllIIlIl = llIllIIlllllllllllll.IllIIlllIIIIlllIIlIl(n3), j = -illIIlllIIIIlllIIlIl; j <= illIIlllIIIIlllIIlIl; ++j) {
                final float n4 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(j) - 0.25f;
                for (int k = -illIIlllIIIIlllIIlIl; k <= illIIlllIIIIlllIIlIl; ++k) {
                    final float n5 = llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(k) - 0.25f;
                    if (((j == 0 && k == 0) || n4 * n4 + n5 * n5 <= n3 * n3) && ((j != -illIIlllIIIIlllIIlIl && j != illIIlllIIIIlllIIlIl && k != -illIIlllIIIIlllIIlIl && k != illIIlllIIIIlllIIlIl) || random.nextFloat() <= 0.75f)) {
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(j, i, k)).llIllIIIIIllIlIIIIlI();
                        if (llIllIIIIIllIlIIIIlI.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI || llIllIIIIIllIlIIIIlI == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII) {
                            this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(j, i, k), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aF.lllIllIIIllllllIllll());
                        }
                        if (i != 0 && illIIlllIIIIlllIIlIl > 1) {
                            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(j, -i, k)).llIllIIIIIllIlIIIIlI();
                            if (llIllIIIIIllIlIIIIlI2.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll || llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl || llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI || llIllIIIIIllIlIIIIlI2 == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII) {
                                this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(j, -i, k), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aF.lllIllIIIllllllIllll());
                            }
                        }
                    }
                }
            }
        }
        int n6 = n2 - 1;
        if (n6 < 0) {
            n6 = 0;
        }
        else if (n6 > 1) {
            n6 = 1;
        }
        for (int l = -n6; l <= n6; ++l) {
            for (int n7 = -n6; n7 <= n6; ++n7) {
                IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l, -1, n7);
                int n8 = 50;
                if (Math.abs(l) == 1 && Math.abs(n7) == 1) {
                    n8 = random.nextInt(5);
                }
                while (ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() > 50) {
                    final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI3 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2).llIllIIIIIllIlIIIIlI();
                    if (llIllIIIIIllIlIIIIlI3.IllIIlllIIIIlllIIlIl() != net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll && llIllIIIIIllIlIIIIlI3 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && llIllIIIIIllIlIIIIlI3 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIIIIlllIlIIIIIIIllI && llIllIIIIIllIlIIIIlI3 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII && llIllIIIIIllIlIIIIlI3 != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aF) {
                        break;
                    }
                    this.llllIIIIlIIIlIlllIll(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.aF.lllIllIIIllllllIllll());
                    ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl();
                    if (--n8 > 0) {
                        continue;
                    }
                    ilIlIlIlIlllllllllIl2 = ilIlIlIlIlllllllllIl2.IlIlIlIlIlllllllllIl(random.nextInt(5) + 1);
                    n8 = random.nextInt(5);
                }
            }
        }
        return true;
    }
}
