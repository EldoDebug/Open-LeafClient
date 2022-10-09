package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;

public class llllIIIlIlllIlIIIIIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "testforblocks";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.compare.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 9) {
            throw new llllIllllIllllIlIlII("commands.compare.usage", new Object[0]);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 0);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 0, false);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 3, false);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 6, false);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = new IlIlIIIlIIlIlIIlllIl(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl()));
        final int n = ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI() * ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl() * ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI();
        if (n > 524288) {
            throw new IIIIlllIIIIIIlIIIlll("commands.compare.tooManyBlocks", new Object[] { n, 524288 });
        }
        if (ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl < 0 || ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI >= 256 || ilIlIIIlIIlIlIIlllIl2.IlIlIlIlIlllllllllIl < 0 || ilIlIIIlIIlIlIIlllIl2.IlIlIIIllIllIIIIIllI >= 256) {
            throw new IIIIlllIIIIIIlIIIlll("commands.compare.outOfWorld", new Object[0]);
        }
        final IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        if (k_.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl) && k_.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl2)) {
            boolean b = false;
            if (array.length > 9 && array[9].equals("masked")) {
                b = true;
            }
            int n2 = 0;
            final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl2.llllIIIIlIIIlIlllIll - ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll, ilIlIIIlIIlIlIIlllIl2.IlIlIlIlIlllllllllIl - ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl, ilIlIIIlIIlIlIIlllIl2.llIllIIIIIllIlIIIIlI - ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI);
            final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
            final net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl llllIIIlIlllIlIIIIIl2 = new net.minecraft.IlllllllIIIlIIIlIlII.llllIIIlIlllIlIIIIIl();
            for (int i = ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI; i <= ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl; ++i) {
                for (int j = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl; j <= ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI; ++j) {
                    for (int k = ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll; k <= ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl; ++k) {
                        llllIIIlIlllIlIIIIIl.IlIlIlIlIlllllllllIl(k, j, i);
                        llllIIIlIlllIlIIIIIl2.IlIlIlIlIlllllllllIl(k + ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(), j + ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), i + ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl());
                        boolean b2 = false;
                        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl2 = k_.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl);
                        if (!b || ilIlIlIlIlllllllllIl2.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                            if (ilIlIlIlIlllllllllIl2 == k_.IlIlIlIlIlllllllllIl(llllIIIlIlllIlIIIIIl2)) {
                                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll4 = k_.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl);
                                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll5 = k_.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl2);
                                if (llllIIIIlIIIlIlllIll4 != null && llllIIIIlIIIlIlllIll5 != null) {
                                    final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                                    llllIIIIlIIIlIlllIll4.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
                                    iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("x");
                                    iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("y");
                                    iiiIlllIIIIIIlIIIlll.llllIIllllIlIlIIIIll("z");
                                    final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                                    llllIIIIlIIIlIlllIll5.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll2);
                                    iiiIlllIIIIIIlIIIlll2.llllIIllllIlIlIIIIll("x");
                                    iiiIlllIIIIIIlIIIlll2.llllIIllllIlIlIIIIll("y");
                                    iiiIlllIIIIIIlIIIlll2.llllIIllllIlIlIIIIll("z");
                                    if (!iiiIlllIIIIIIlIIIlll.equals(iiiIlllIIIIIIlIIIlll2)) {
                                        b2 = true;
                                    }
                                }
                                else if (llllIIIIlIIIlIlllIll4 != null) {
                                    b2 = true;
                                }
                            }
                            else {
                                b2 = true;
                            }
                            ++n2;
                            if (b2) {
                                throw new IIIIlllIIIIIIlIIIlll("commands.compare.failed", new Object[0]);
                            }
                        }
                    }
                }
            }
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, n2);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.compare.success", n2);
            return;
        }
        throw new IIIIlllIIIIIIlIIIlll("commands.compare.outOfWorld", new Object[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length > 0 && array.length <= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 0, ilIlIlIlIlllllllllIl) : ((array.length > 3 && array.length <= 6) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 3, ilIlIlIlIlllllllllIl) : ((array.length > 6 && array.length <= 9) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 6, ilIlIlIlIlllllllllIl) : ((array.length == 10) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "masked", "all") : null)));
    }
}
