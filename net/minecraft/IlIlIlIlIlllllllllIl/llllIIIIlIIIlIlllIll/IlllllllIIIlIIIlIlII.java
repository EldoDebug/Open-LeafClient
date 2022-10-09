package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.llIIlIIIlIIIllIlIIIl.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

public class IlllllllIIIlIIIlIlII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "setblock";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.setblock.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 4) {
            throw new llllIllllIllllIlIlII("commands.setblock.usage", new Object[0]);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 0);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 0, false);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(illIlIIllIllIIlIllII, array[3]);
        int llllIIIIlIIIlIlllIll2 = 0;
        if (array.length >= 5) {
            llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[4], 0, 15);
        }
        final net.minecraft.IIIlIIlIIIIlllIlllII.IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        if (!k_.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.setblock.outOfWorld", new Object[0]);
        }
        net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll3 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        boolean b = false;
        if (array.length >= 7 && llllIIIlIlllIlIIIIIl.IIIIlllIIIIIIlIIIlll()) {
            final String liiiIlIIIIIlllIllIII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 6).lIIIIlIIIIIlllIllIII();
            try {
                llllIIIIlIIIlIlllIll3 = IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
                b = true;
            }
            catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.setblock.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
            }
        }
        if (array.length >= 6) {
            if (array[5].equals("destroy")) {
                k_.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll, true);
                if (llllIIIlIlllIlIIIIIl == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) {
                    net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.setblock.success", new Object[0]);
                    return;
                }
            }
            else if (array[5].equals("keep") && !k_.IlIIIlIlIIIllIlIlIIl(llllIIIIlIIIlIlllIll)) {
                throw new IIIIlllIIIIIIlIIIlll("commands.setblock.noChange", new Object[0]);
            }
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll4 = k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll4 != null) {
            if (llllIIIIlIIIlIlllIll4 instanceof llIIIlIlIllIIlIlIlII) {
                ((llIIIlIlIllIIlIlIlII)llllIIIIlIIIlIlllIll4).lIllllllIIllIlIlIlII();
            }
            k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.lllIllIIIllllllIllll(), (llllIIIlIlllIlIIIIIl == net.minecraft.lIIIlllIIIllIIIllIII.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll) ? 2 : 4);
        }
        final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI = llllIIIlIlllIlIIIIIl.llIllIIIIIllIlIIIIlI(llllIIIIlIIIlIlllIll2);
        if (!k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI, 2)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.setblock.noChange", new Object[0]);
        }
        if (b) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll5 = k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll5 != null) {
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("x", llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("y", llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII());
                llllIIIIlIIIlIlllIll3.llllIIIIlIIIlIlllIll("z", llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
                llllIIIIlIIIlIlllIll5.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
            }
        }
        k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll, llIllIIIIIllIlIIIIlI.llIllIIIIIllIlIIIIlI());
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 1);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.setblock.success", new Object[0]);
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length > 0 && array.length <= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 0, ilIlIlIlIlllllllllIl) : ((array.length == 4) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) : ((array.length == 6) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "replace", "destroy", "keep") : null));
    }
}
