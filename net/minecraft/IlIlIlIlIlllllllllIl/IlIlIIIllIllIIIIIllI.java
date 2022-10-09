package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.IlIlIIIllIllIIIIIllI.llIllIIIIIllIlIIIIlI.*;
import com.google.common.collect.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;

public class IlIlIIIllIllIIIIIllI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "clone";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.clone.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 9) {
            throw new llllIllllIllllIlIlII("commands.clone.usage", new Object[0]);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 0);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 0, false);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 3, false);
        final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 6, false);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl = new IlIlIIIlIIlIlIIlllIl(llllIIIIlIIIlIlllIll, llllIIIIlIIIlIlllIll2);
        final IlIlIIIlIIlIlIIlllIl ilIlIIIlIIlIlIIlllIl2 = new IlIlIIIlIIlIlIIlllIl(llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl()));
        final int n = ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI() * ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl() * ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI();
        if (n > 32768) {
            throw new IIIIlllIIIIIIlIIIlll("commands.clone.tooManyBlocks", new Object[] { n, 32768 });
        }
        boolean b = false;
        net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = null;
        int llllIIIIlIIIlIlllIll4 = -1;
        if ((array.length < 11 || (!array[10].equals("force") && !array[10].equals("move"))) && ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl2)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.clone.noOverlap", new Object[0]);
        }
        if (array.length >= 11 && array[10].equals("move")) {
            b = true;
        }
        if (ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl < 0 || ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI >= 256 || ilIlIIIlIIlIlIIlllIl2.IlIlIlIlIlllllllllIl < 0 || ilIlIIIlIIlIlIIlllIl2.IlIlIIIllIllIIIIIllI >= 256) {
            throw new IIIIlllIIIIIIlIIIlll("commands.clone.outOfWorld", new Object[0]);
        }
        final IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        if (!k_.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl) || !k_.llllIIIIlIIIlIlllIll(ilIlIIIlIIlIlIIlllIl2)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.clone.outOfWorld", new Object[0]);
        }
        boolean b2 = false;
        if (array.length >= 10) {
            if (array[9].equals("masked")) {
                b2 = true;
            }
            else if (array[9].equals("filtered")) {
                if (array.length < 12) {
                    throw new llllIllllIllllIlIlII("commands.clone.usage", new Object[0]);
                }
                llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(illIlIIllIllIIlIllII, array[11]);
                if (array.length >= 13) {
                    llllIIIIlIIIlIlllIll4 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[12], 0, 15);
                }
            }
        }
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList();
        final ArrayList arrayList3 = Lists.newArrayList();
        final LinkedList linkedList = Lists.newLinkedList();
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl = new IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl2.llllIIIIlIIIlIlllIll - ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll, ilIlIIIlIIlIlIIlllIl2.IlIlIlIlIlllllllllIl - ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl, ilIlIIIlIIlIlIIlllIl2.llIllIIIIIllIlIIIIlI - ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI);
        for (int i = ilIlIIIlIIlIlIIlllIl.llIllIIIIIllIlIIIIlI; i <= ilIlIIIlIIlIlIIlllIl.IllIIlllIIIIlllIIlIl; ++i) {
            for (int j = ilIlIIIlIIlIlIIlllIl.IlIlIlIlIlllllllllIl; j <= ilIlIIIlIIlIlIIlllIl.IlIlIIIllIllIIIIIllI; ++j) {
                for (int k = ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll; k <= ilIlIIIlIIlIlIIlllIl.IlIIIlIlIIIllIlIlIIl; ++k) {
                    final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl2 = new IlIlIlIlIlllllllllIl(k, j, i);
                    final IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll5 = ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl);
                    final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl3 = k_.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2);
                    if ((!b2 || ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() != net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) && (llllIIIlIlllIlIIIIIl == null || (ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI() == llllIIIlIlllIlIIIIIl && (llllIIIIlIIIlIlllIll4 < 0 || ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl3) == llllIIIIlIIIlIlllIll4)))) {
                        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll6 = k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl2);
                        if (llllIIIIlIIIlIlllIll6 != null) {
                            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
                            llllIIIIlIIIlIlllIll6.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
                            arrayList2.add(new IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll5, ilIlIlIlIlllllllllIl3, iiiIlllIIIIIIlIIIlll));
                            linkedList.addLast(ilIlIlIlIlllllllllIl2);
                        }
                        else if (!ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().llllIIIIlIIIlIlllIll() && !ilIlIlIlIlllllllllIl3.llIllIIIIIllIlIIIIlI().llIIlIIIlIIIllIlIIIl()) {
                            arrayList3.add(new IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll5, ilIlIlIlIlllllllllIl3, null));
                            linkedList.addFirst(ilIlIlIlIlllllllllIl2);
                        }
                        else {
                            arrayList.add(new IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll5, ilIlIlIlIlllllllllIl3, null));
                            linkedList.addLast(ilIlIlIlIlllllllllIl2);
                        }
                    }
                }
            }
        }
        if (b) {
            for (final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4 : linkedList) {
                final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll7 = k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4);
                if (llllIIIIlIIIlIlllIll7 instanceof llIIIlIlIllIIlIlIlII) {
                    ((llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll7).lIllllllIIllIlIlIlII();
                }
                k_.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl4, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az.lllIllIIIllllllIllll(), 2);
            }
            final Iterator<IlIlIlIlIlllllllllIl> iterator2 = linkedList.iterator();
            while (iterator2.hasNext()) {
                k_.llllIIIIlIIIlIlllIll(iterator2.next(), net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), 3);
            }
        }
        final ArrayList arrayList4 = Lists.newArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        final List reverse = Lists.reverse((List)arrayList4);
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl : reverse) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll8 = k_.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll8 instanceof llIIIlIlIllIIlIlIlII) {
                ((llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll8).lIllllllIIllIlIlIlII();
            }
            k_.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl.llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.az.lllIllIIIllllllIllll(), 2);
        }
        int n2 = 0;
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl2 : arrayList4) {
            if (k_.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl2.llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl2.IlIlIlIlIlllllllllIl, 2)) {
                ++n2;
            }
        }
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl3 : arrayList2) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll9 = k_.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl3.llllIIIIlIIIlIlllIll);
            if (illIIlllIIIIlllIIlIl3.llIllIIIIIllIlIIIIlI != null && llllIIIIlIIIlIlllIll9 != null) {
                illIIlllIIIIlllIIlIl3.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("x", illIIlllIIIIlllIIlIl3.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
                illIIlllIIIIlllIIlIl3.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("y", illIIlllIIIIlllIIlIl3.llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII());
                illIIlllIIIIlllIIlIl3.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll("z", illIIlllIIIIlllIIlIl3.llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
                llllIIIIlIIIlIlllIll9.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl3.llIllIIIIIllIlIIIIlI);
                llllIIIIlIIIlIlllIll9.llIIIlIlIllIIlIlIlII();
            }
            k_.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl3.llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl3.IlIlIlIlIlllllllllIl, 2);
        }
        for (final IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl4 : reverse) {
            k_.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl4.llllIIIIlIIIlIlllIll, illIIlllIIIIlllIIlIl4.IlIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI());
        }
        final List ilIlIlIlIlllllllllIl5 = k_.IlIlIlIlIlllllllllIl(ilIlIIIlIIlIlIIlllIl, false);
        if (ilIlIlIlIlllllllllIl5 != null) {
            for (final IlIlIIIIIIlllIlIllIl ilIlIIIIIIlllIlIllIl : ilIlIlIlIlllllllllIl5) {
                if (ilIlIIIlIIlIlIIlllIl.llllIIIIlIIIlIlllIll(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll)) {
                    k_.IlIlIlIlIlllllllllIl(ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(ilIlIlIlIlllllllllIl), ilIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll(), (int)(ilIlIIIIIIlllIlIllIl.IlIlIlIlIlllllllllIl - k_.lIllllllIIllIlIlIlII().IllIIlllIIIIlllIIlIl()), ilIlIIIIIIlllIlIllIl.llIllIIIIIllIlIIIIlI);
                }
            }
        }
        if (n2 <= 0) {
            throw new IIIIlllIIIIIIlIIIlll("commands.clone.failed", new Object[0]);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, n2);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.clone.success", n2);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length > 0 && array.length <= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 0, ilIlIlIlIlllllllllIl) : ((array.length > 3 && array.length <= 6) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 3, ilIlIlIlIlllllllllIl) : ((array.length > 6 && array.length <= 9) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 6, ilIlIlIlIlllllllllIl) : ((array.length == 10) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "replace", "masked", "filtered") : ((array.length == 11) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "normal", "force", "move") : ((array.length == 12 && "filtered".equals(array[9])) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) : null)))));
    }
}
