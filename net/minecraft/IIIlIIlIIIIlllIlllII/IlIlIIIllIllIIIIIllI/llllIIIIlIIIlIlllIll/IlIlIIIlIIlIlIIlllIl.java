package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import net.minecraft.llllIIIIlIIIlIlllIll.*;
import java.util.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;

public class IlIlIIIlIIlIlIIlllIl extends lllIllIIIllllllIllll
{
    private llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll;
    
    public IlIlIIIlIIlIlIIlllIl(final llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        for (ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(-8, 0, -8); ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() > 5 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl); ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl()) {}
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() <= 4) {
            return false;
        }
        ilIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl.IlIlIlIlIlllllllllIl(4);
        final boolean[] array = new boolean[2048];
        for (int n = random.nextInt(4) + 4, i = 0; i < n; ++i) {
            final double n2 = random.nextDouble() * 6.0 + 3.0;
            final double n3 = random.nextDouble() * 4.0 + 2.0;
            final double n4 = random.nextDouble() * 6.0 + 3.0;
            final double n5 = random.nextDouble() * (16.0 - n2 - 2.0) + 1.0 + n2 / 2.0;
            final double n6 = random.nextDouble() * (8.0 - n3 - 4.0) + 2.0 + n3 / 2.0;
            final double n7 = random.nextDouble() * (16.0 - n4 - 2.0) + 1.0 + n4 / 2.0;
            for (int j = 1; j < 15; ++j) {
                for (int k = 1; k < 15; ++k) {
                    for (int l = 1; l < 7; ++l) {
                        final double n8 = (j - n5) / (n2 / 2.0);
                        final double n9 = (l - n6) / (n3 / 2.0);
                        final double n10 = (k - n7) / (n4 / 2.0);
                        if (n8 * n8 + n9 * n9 + n10 * n10 < 1.0) {
                            array[(j * 16 + k) * 8 + l] = true;
                        }
                    }
                }
            }
        }
        for (int n11 = 0; n11 < 16; ++n11) {
            for (int n12 = 0; n12 < 16; ++n12) {
                for (int n13 = 0; n13 < 8; ++n13) {
                    if (!array[(n11 * 16 + n12) * 8 + n13] && ((n11 < 15 && array[((n11 + 1) * 16 + n12) * 8 + n13]) || (n11 > 0 && array[((n11 - 1) * 16 + n12) * 8 + n13]) || (n12 < 15 && array[(n11 * 16 + n12 + 1) * 8 + n13]) || (n12 > 0 && array[(n11 * 16 + (n12 - 1)) * 8 + n13]) || (n13 < 7 && array[(n11 * 16 + n12) * 8 + n13 + 1]) || (n13 > 0 && array[(n11 * 16 + n12) * 8 + (n13 - 1)]))) {
                        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl illIIlllIIIIlllIIlIl = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n11, n13, n12)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl();
                        if (n13 >= 4 && illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll()) {
                            return false;
                        }
                        if (n13 < 4 && !illIIlllIIIIlllIIlIl.IlIlIlIlIlllllllllIl() && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n11, n13, n12)).llIllIIIIIllIlIIIIlI() != this.llllIIIIlIIIlIlllIll) {
                            return false;
                        }
                    }
                }
            }
        }
        for (int n14 = 0; n14 < 16; ++n14) {
            for (int n15 = 0; n15 < 16; ++n15) {
                for (int n16 = 0; n16 < 8; ++n16) {
                    if (array[(n14 * 16 + n15) * 8 + n16]) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n14, n16, n15), (n16 >= 4) ? net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll() : this.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
                    }
                }
            }
        }
        for (int n17 = 0; n17 < 16; ++n17) {
            for (int n18 = 0; n18 < 16; ++n18) {
                for (int n19 = 4; n19 < 8; ++n19) {
                    if (array[(n17 * 16 + n18) * 8 + n19]) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n17, n19 - 1, n18);
                        if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIIIlIlIIIllIlIlIIl && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll, ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n17, n19, n18)) > 0) {
                            if (illlllllIIIlIIIlIlII.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll).IIlllIIlllIIIlIlllII.llIllIIIIIllIlIIIIlI() == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A) {
                                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.A.lllIllIIIllllllIllll(), 2);
                            }
                            else {
                                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.lllIllIIIllllllIllll(), 2);
                            }
                        }
                    }
                }
            }
        }
        if (this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII) {
            for (int n20 = 0; n20 < 16; ++n20) {
                for (int n21 = 0; n21 < 16; ++n21) {
                    for (int n22 = 0; n22 < 8; ++n22) {
                        if (!array[(n20 * 16 + n21) * 8 + n22] && ((n20 < 15 && array[((n20 + 1) * 16 + n21) * 8 + n22]) || (n20 > 0 && array[((n20 - 1) * 16 + n21) * 8 + n22]) || (n21 < 15 && array[(n20 * 16 + n21 + 1) * 8 + n22]) || (n21 > 0 && array[(n20 * 16 + (n21 - 1)) * 8 + n22]) || (n22 < 7 && array[(n20 * 16 + n21) * 8 + n22 + 1]) || (n22 > 0 && array[(n20 * 16 + n21) * 8 + (n22 - 1)])) && (n22 < 4 || random.nextInt(2) != 0) && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n20, n22, n21)).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n20, n22, n21), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lllIllIIIllllllIllll(), 2);
                        }
                    }
                }
            }
        }
        if (this.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl() == net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII) {
            for (int n23 = 0; n23 < 16; ++n23) {
                for (int n24 = 0; n24 < 16; ++n24) {
                    final int n25 = 4;
                    if (illlllllIIIlIIIlIlII.IIIlIIIlIlIIlllIIlll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n23, n25, n24))) {
                        illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(n23, n25, n24), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIlIIIIllIlIIlIlIII.lllIllIIIllllllIllll(), 2);
                    }
                }
            }
        }
        return true;
    }
}
