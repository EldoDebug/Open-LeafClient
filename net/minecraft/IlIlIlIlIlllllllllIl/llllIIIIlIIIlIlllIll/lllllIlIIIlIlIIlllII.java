package net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;

public class lllllIlIIIlIlIIlllII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "testforblock";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.testforblock.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 4) {
            throw new llllIllllIllllIlIlII("commands.testforblock.usage", new Object[0]);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 0);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 0, false);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll2 = net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[3]);
        if (llllIIIIlIIIlIlllIll2 == null) {
            throw new lIIlIIIlIllIlIllIIIl("commands.setblock.notFound", new Object[] { array[3] });
        }
        int llllIIIIlIIIlIlllIll3 = -1;
        if (array.length >= 5) {
            llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[4], -1, 15);
        }
        final IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        if (!k_.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.testforblock.outOfWorld", new Object[0]);
        }
        net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll4 = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        boolean b = false;
        if (array.length >= 6 && llllIIIIlIIIlIlllIll2.IIIIlllIIIIIIlIIIlll()) {
            final String liiiIlIIIIIlllIllIII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 5).lIIIIlIIIIIlllIllIII();
            try {
                llllIIIIlIIIlIlllIll4 = IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII);
                b = true;
            }
            catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.setblock.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
            }
        }
        final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl = k_.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
        final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llIllIIIIIllIlIIIIlI = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI();
        if (llIllIIIIIllIlIIIIlI != llllIIIIlIIIlIlllIll2) {
            throw new IIIIlllIIIIIIlIIIlll("commands.testforblock.failed.tile", new Object[] { llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(), llIllIIIIIllIlIIIIlI.lllllIlIIIlIlIIlllII(), llllIIIIlIIIlIlllIll2.lllllIlIIIlIlIIlllII() });
        }
        if (llllIIIIlIIIlIlllIll3 > -1) {
            final int llIllIIIIIllIlIIIIlI2 = ilIlIlIlIlllllllllIl.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl);
            if (llIllIIIIIllIlIIIIlI2 != llllIIIIlIIIlIlllIll3) {
                throw new IIIIlllIIIIIIlIIIlll("commands.testforblock.failed.data", new Object[] { llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl(), llIllIIIIIllIlIIIIlI2, llllIIIIlIIIlIlllIll3 });
            }
        }
        if (b) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll5 = k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
            if (llllIIIIlIIIlIlllIll5 == null) {
                throw new IIIIlllIIIIIIlIIIlll("commands.testforblock.failed.tileEntity", new Object[] { llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() });
            }
            final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
            llllIIIIlIIIlIlllIll5.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
            if (!IlIlIllllllllIIIIlII.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll4, iiiIlllIIIIIIlIIIlll, true)) {
                throw new IIIIlllIIIIIIlIIIlll("commands.testforblock.failed.nbt", new Object[] { llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl() });
            }
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 1);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.testforblock.success", llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(), llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII(), llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length > 0 && array.length <= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 0, ilIlIlIlIlllllllllIl) : ((array.length == 4) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) : null);
    }
}
