package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import com.google.common.collect.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;

public class IIlllIIlIllIllIlIIll extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "fill";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.fill.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 7) {
            throw new llllIllllIllllIlIlII("commands.fill.usage", new Object[0]);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 0);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 0, false);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 3, false);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(illIlIIllIllIIlIllII, array[6]);
        int llllIIIIlIIIlIlllIll3 = 0;
        if (array.length >= 8) {
            llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[7], 0, 15);
        }
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(Math.min(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII()), Math.min(llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII()), Math.min(llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(), llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl()));
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(Math.max(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll2.lIIIIlIIIIIlllIllIII()), Math.max(llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll2.lIIIlllIIIllIIIllIII()), Math.max(llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(), llllIIIIlIIIlIlllIll2.llIIlIIIlIIIllIlIIIl()));
        final int n = (ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() - ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() + 1) * (ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() + 1) * (ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() - ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() + 1);
        if (n > 32768) {
            throw new IIIIlllIIIIIIlIIIlll("commands.fill.tooManyBlocks", new Object[] { n, 32768 });
        }
        if (ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() < 0 || ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() >= 256) {
            throw new IIIIlllIIIIIIlIIIlll("commands.fill.outOfWorld", new Object[0]);
        }
        final IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        for (int i = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(); i < ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl() + 16; i += 16) {
            for (int j = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(); j < ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() + 16; j += 16) {
                if (!k_.IllIIlllIIIIlllIIlIl(new IlIlIlIlIlllllllllIl(j, ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() - ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(), i))) {
                    throw new IIIIlllIIIIIIlIIIlll("commands.fill.outOfWorld", new Object[0]);
                }
            }
        }
        net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll4 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        boolean b = false;
        if (array.length >= 10 && llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll()) {
            final String liiiIlIIIIIlllIllIII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 9).lIIIIlIIIIIlllIllIII();
            try {
                llllIIIIlIIIlIlllIll4 = net.minecraft.lIlIlIIIllIIllIIIllI.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
                b = true;
            }
            catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.fill.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
            }
        }
        final ArrayList arrayList = Lists.newArrayList();
        int n2 = 0;
        for (int k = ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl(); k <= ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl(); ++k) {
            for (int l = ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII(); l <= ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII(); ++l) {
                for (int liiiIlIIIIIlllIllIII2 = ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII(); liiiIlIIIIIlllIllIII2 <= ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII(); ++liiiIlIIIIIlllIllIII2) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl3 = new IlIlIlIlIlllllllllIl(liiiIlIIIIIlllIllIII2, l, k);
                    if (array.length >= 9) {
                        if (!array[8].equals("outline") && !array[8].equals("hollow")) {
                            if (array[8].equals("destroy")) {
                                k_.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3, true);
                            }
                            else if (array[8].equals("keep")) {
                                if (!k_.IlIIIlIlIIIllIlIlIIl(ilIlIlIlIlllllllllIl3)) {
                                    continue;
                                }
                            }
                            else if (array[8].equals("replace") && !llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll()) {
                                if (array.length > 9 && k_.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3).llIllIIIIIllIlIIIIlI() != net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(illIlIIllIllIIlIllII, array[9])) {
                                    continue;
                                }
                                if (array.length > 10) {
                                    final int llllIIIIlIIIlIlllIll5 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[10]);
                                    final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl4 = k_.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3);
                                    if (ilIlIlIlIlllllllllIl4.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl4) != llllIIIIlIIIlIlllIll5) {
                                        continue;
                                    }
                                }
                            }
                        }
                        else if (liiiIlIIIIIlllIllIII2 != ilIlIlIlIlllllllllIl.lIIIIlIIIIIlllIllIII() && liiiIlIIIIIlllIllIII2 != ilIlIlIlIlllllllllIl2.lIIIIlIIIIIlllIllIII() && l != ilIlIlIlIlllllllllIl.lIIIlllIIIllIIIllIII() && l != ilIlIlIlIlllllllllIl2.lIIIlllIIIllIIIllIII() && k != ilIlIlIlIlllllllllIl.llIIlIIIlIIIllIlIIIl() && k != ilIlIlIlIlllllllllIl2.llIIlIIIlIIIllIlIIIl()) {
                            if (array[8].equals("hollow")) {
                                k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 2);
                                arrayList.add(ilIlIlIlIlllllllllIl3);
                            }
                            continue;
                        }
                    }
                    final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll6 = k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3);
                    if (llllIIIIlIIIlIlllIll6 != null) {
                        if (llllIIIIlIIIlIlllIll6 instanceof llIIIlIlIllIIlIlIlII) {
                            ((llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll6).lIllllllIIllIlIlIlII();
                        }
                        k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az.lllIllIIIllllllIllll(), (llllIIIlIlllIlIIIIIl == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az) ? 2 : 4);
                    }
                    if (k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3, llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll3), 2)) {
                        arrayList.add(ilIlIlIlIlllllllllIl3);
                        ++n2;
                        if (b) {
                            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll7 = k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl3);
                            if (llllIIIIlIIIlIlllIll7 != null) {
                                llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("x", ilIlIlIlIlllllllllIl3.lIIIIlIIIIIlllIllIII());
                                llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("y", ilIlIlIlIlllllllllIl3.lIIIlllIIIllIIIllIII());
                                llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll("z", ilIlIlIlIlllllllllIl3.llIIlIIIlIIIllIlIIIl());
                                llllIIIIlIIIlIlllIll7.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4);
                            }
                        }
                    }
                }
            }
        }
        for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl5 : arrayList) {
            k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl5, k_.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl5).llIllIIIIIllIlIIIIlI());
        }
        if (n2 <= 0) {
            throw new IIIIlllIIIIIIlIIIlll("commands.fill.failed", new Object[0]);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, n2);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.fill.success", n2);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length > 0 && array.length <= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 0, ilIlIlIlIlllllllllIl) : ((array.length > 3 && array.length <= 6) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 3, ilIlIlIlIlllllllllIl) : ((array.length == 7) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) : ((array.length == 9) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "replace", "destroy", "keep", "hollow", "outline") : ((array.length == 10 && "replace".equals(array[8])) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) : null))));
    }
}
