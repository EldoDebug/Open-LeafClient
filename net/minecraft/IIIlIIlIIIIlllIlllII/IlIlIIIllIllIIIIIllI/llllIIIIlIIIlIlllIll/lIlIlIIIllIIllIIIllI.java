package net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llllIIIIlIIIlIlllIll;

import org.apache.logging.log4j.*;
import com.google.common.collect.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.lIIIlllIIIllIIIllIII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import java.util.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;

public class lIlIlIIIllIIllIIIllI extends lllIllIIIllllllIllll
{
    private static final Logger llllIIIIlIIIlIlllIll;
    private static final String[] IlIlIlIlIlllllllllIl;
    private static final List llIllIIIIIllIlIIIIlI;
    
    static {
        llllIIIIlIIIlIlllIll = LogManager.getLogger();
        IlIlIlIlIlllllllllIl = new String[] { "Skeleton", "Zombie", "Zombie", "Spider" };
        llIllIIIIIllIlIIIIlI = Lists.newArrayList((Object[])new k[] { new k(IIllIIllIIIlIlIIIIlI.IIllIIIlIIIIlIIlIIII, 0, 1, 1, 10), new k(IIllIIllIIIlIlIIIIlI.llIIlIIIlIIIllIlIIIl, 0, 1, 4, 10), new k(IIllIIllIIIlIlIIIIlI.llIllIlIlIIIIIIIllII, 0, 1, 1, 10), new k(IIllIIllIIIlIlIIIIlI.lllIllIIIllllllIllll, 0, 1, 4, 10), new k(IIllIIllIIIlIlIIIIlI.llllllIllIllIlIllllI, 0, 1, 4, 10), new k(IIllIIllIIIlIlIIIIlI.IIlllIIIlIlllIIlllII, 0, 1, 4, 10), new k(IIllIIllIIIlIlIIIIlI.IllllIIlIlIllIIIllII, 0, 1, 1, 10), new k(IIllIIllIIIlIlIIIIlI.llllIllllIllllIlIlII, 0, 1, 1, 1), new k(IIllIIllIIIlIlIIIIlI.IIIIIIIllllIlIIIIIII, 0, 1, 4, 10), new k(IIllIIllIIIlIlIIIIlI.au, 0, 1, 1, 4), new k(IIllIIllIIIlIlIIIIlI.av, 0, 1, 1, 4), new k(IIllIIllIIIlIlIIIIlI.as, 0, 1, 1, 10), new k(IIllIIllIIIlIlIIIIlI.ap, 0, 1, 1, 2), new k(IIllIIllIIIlIlIIIIlI.ao, 0, 1, 1, 5), new k(IIllIIllIIIlIlIIIIlI.aq, 0, 1, 1, 1) });
    }
    
    @Override
    public boolean llllIIIIlIIIlIlllIll(final IlllllllIIIlIIIlIlII illlllllIIIlIIIlIlII, final Random random, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        final int n = random.nextInt(2) + 2;
        final int n2 = -n - 1;
        final int n3 = n + 1;
        final int n4 = random.nextInt(2) + 2;
        final int n5 = -n4 - 1;
        final int n6 = n4 + 1;
        int n7 = 0;
        for (int i = n2; i <= n3; ++i) {
            for (int j = -1; j <= 4; ++j) {
                for (int k = n5; k <= n6; ++k) {
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(i, j, k);
                    final boolean ilIlIlIlIlllllllllIl2 = illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl();
                    if (j == -1 && !ilIlIlIlIlllllllllIl2) {
                        return false;
                    }
                    if (j == 4 && !ilIlIlIlIlllllllllIl2) {
                        return false;
                    }
                    if ((i == n2 || i == n3 || k == n5 || k == n6) && j == 0 && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll) && illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll())) {
                        ++n7;
                    }
                }
            }
        }
        if (n7 >= 1 && n7 <= 5) {
            for (int l = n2; l <= n3; ++l) {
                for (int n8 = 3; n8 >= -1; --n8) {
                    for (int n9 = n5; n9 <= n6; ++n9) {
                        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = ilIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(l, n8, n9);
                        if (l != n2 && n8 != -1 && n9 != n5 && l != n3 && n8 != 4 && n9 != n6) {
                            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl) {
                                illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2);
                            }
                        }
                        else if (llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII() >= 0 && !illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl()).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()) {
                            illlllllIIIlIIIlIlII.lIIIIlIIIIIlllIllIII(llllIIIIlIIIlIlllIll2);
                        }
                        else if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl() && illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll2).llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl) {
                            if (n8 == -1 && random.nextInt(4) != 0) {
                                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IIlIIIlllIllIllIlIII.lllIllIIIllllllIllll(), 2);
                            }
                            else {
                                illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll2, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI.lllIllIIIllllllIllll(), 2);
                            }
                        }
                    }
                }
            }
            for (int n10 = 0; n10 < 2; ++n10) {
                for (int n11 = 0; n11 < 3; ++n11) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + random.nextInt(n * 2 + 1) - n, ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + random.nextInt(n4 * 2 + 1) - n4);
                    if (illlllllIIIlIIIlIlII.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl3)) {
                        int n12 = 0;
                        final Iterator iterator = IllIllIIIIlIIlIlllII.llllIIIIlIIIlIlllIll.iterator();
                        while (iterator.hasNext()) {
                            if (illlllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3.llllIIIIlIIIlIlllIll(iterator.next())).llIllIIIIIllIlIIIIlI().IllIIlllIIIIlllIIlIl().IlIlIlIlIlllllllllIl()) {
                                ++n12;
                            }
                        }
                        if (n12 == 1) {
                            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl.IllIIlllIIIIlllIIlIl(illlllllIIIlIIIlIlII, ilIlIlIlIlllllllllIl3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.lllllIIIIIlIlIIIIIIl.lllIllIIIllllllIllll()), 2);
                            final List llllIIIIlIIIlIlllIll3 = k.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI, IIllIIllIIIlIlIIIIlI.ah.llllIIIIlIIIlIlllIll(random));
                            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll4 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3);
                            if (llllIIIIlIIIlIlllIll4 instanceof IlIlIIIllIIllIlllllI) {
                                k.llllIIIIlIIIlIlllIll(random, llllIIIIlIIIlIlllIll3, (llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll4, 8);
                                break;
                            }
                            break;
                        }
                    }
                }
            }
            illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llIIIlIlllIllIIlIllI.lllIllIIIllllllIllll(), 2);
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll5 = illlllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
            if (llllIIIIlIIIlIlllIll5 instanceof IIlllIlIIllIlIlIlIIl) {
                ((IIlllIlIIllIlIlIlIIl)llllIIIIlIIIlIlllIll5).IlIlIlIlIlllllllllIl().llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll(random));
            }
            else {
                lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll.error("Failed to fetch mob spawner entity at (" + ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + ", " + ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + ", " + ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + ")");
            }
            return true;
        }
        return false;
    }
    
    private String llllIIIIlIIIlIlllIll(final Random random) {
        return lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl[random.nextInt(lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.length)];
    }
}
