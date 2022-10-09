package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlIlIIIlIIlIlIIlllIl.*;
import java.util.*;

public class llIllIIIIIllIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "blockdata";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.blockdata.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 4) {
            throw new llllIllllIllllIlIlII("commands.blockdata.usage", new Object[0]);
        }
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 0);
        final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 0, false);
        final IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        if (!k_.IllIIlllIIIIlllIIlIl(llllIIIIlIIIlIlllIll)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.blockdata.outOfWorld", new Object[0]);
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll2 = k_.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll);
        if (llllIIIIlIIIlIlllIll2 == null) {
            throw new IIIIlllIIIIIIlIIIlll("commands.blockdata.notValid", new Object[0]);
        }
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = new net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll();
        llllIIIIlIIIlIlllIll2.IlIlIlIlIlllllllllIl(iiiIlllIIIIIIlIIIlll);
        final net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll2 = (net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll)iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl();
        net.minecraft.lIlIlIIIllIIllIIIllI.IIIIlllIIIIIIlIIIlll llllIIIIlIIIlIlllIll3;
        try {
            llllIIIIlIIIlIlllIll3 = IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 3).lIIIIlIIIIIlllIllIII());
        }
        catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
            throw new IIIIlllIIIIIIlIIIlll("commands.blockdata.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
        }
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll3);
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("x", llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("y", llllIIIIlIIIlIlllIll.lIIIlllIIIllIIIllIII());
        iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll("z", llllIIIIlIIIlIlllIll.llIIlIIIlIIIllIlIIIl());
        if (iiiIlllIIIIIIlIIIlll.equals(iiiIlllIIIIIIlIIIlll2)) {
            throw new IIIIlllIIIIIIlIIIlll("commands.blockdata.failed", new Object[] { iiiIlllIIIIIIlIIIlll.toString() });
        }
        llllIIIIlIIIlIlllIll2.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll);
        llllIIIIlIIIlIlllIll2.llIIIlIlIllIIlIlIlII();
        k_.lIIIlllIIIllIIIllIII(llllIIIIlIIIlIlllIll);
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIlIlIlIlllllllllIl, 1);
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.blockdata.success", iiiIlllIIIIIIlIIIlll.toString());
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length > 0 && array.length <= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 0, ilIlIlIlIlllllllllIl) : null;
    }
}
