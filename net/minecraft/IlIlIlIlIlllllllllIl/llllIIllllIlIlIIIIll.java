package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

public class llllIIllllIlIlIIIIll extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "execute";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.execute.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 5) {
            throw new llllIllllIllllIlIlII("commands.execute.usage", new Object[0]);
        }
        final llIllIIIIIllIlIIIIlI llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[0], llIllIIIIIllIlIIIIlI.class);
        final double ilIlIlIlIlllllllllIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl, array[1], false);
        final double ilIlIlIlIlllllllllIl2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII, array[2], false);
        final double ilIlIlIlIlllllllllIl3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII, array[3], false);
        final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl4 = new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl3);
        int n = 4;
        if ("detect".equals(array[4]) && array.length > 10) {
            final IlllllllIIIlIIIlIlII k_ = llllIIIIlIIIlIlllIll.k_();
            final double ilIlIlIlIlllllllllIl5 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl, array[5], false);
            final double ilIlIlIlIlllllllllIl6 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl2, array[6], false);
            final double ilIlIlIlIlllllllllIl7 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl3, array[7], false);
            final net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll llllIIIlIlllIlIIIIIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIlIlllIlIIIIIl(illIlIIllIllIIlIllII, array[8]);
            final int llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[9], -1, 15);
            final llIIlIIIlIIIllIlIIIl ilIlIlIlIlllllllllIl8 = k_.IlIlIlIlIlllllllllIl(new IlIlIlIlIlllllllllIl(ilIlIlIlIlllllllllIl5, ilIlIlIlIlllllllllIl6, ilIlIlIlIlllllllllIl7));
            if (ilIlIlIlIlllllllllIl8.llIllIIIIIllIlIIIIlI() != llllIIIlIlllIlIIIIIl || (llllIIIIlIIIlIlllIll2 >= 0 && ilIlIlIlIlllllllllIl8.llIllIIIIIllIlIIIIlI().llIllIIIIIllIlIIIIlI(ilIlIlIlIlllllllllIl8) != llllIIIIlIIIlIlllIll2)) {
                throw new IIIIlllIIIIIIlIIIlll("commands.execute.failed", new Object[] { "detect", llllIIIIlIIIlIlllIll.s_() });
            }
            n = 10;
        }
        final String llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, n);
        final IlIllIlIlIIIlIlIlIII ilIllIlIlIIIlIlIlIII = new IlIllIlIlIIIlIlIlIII(this, llllIIIIlIIIlIlllIll, illIlIIllIllIIlIllII, ilIlIlIlIlllllllllIl4, ilIlIlIlIlllllllllIl, ilIlIlIlIlllllllllIl2, ilIlIlIlIlllllllllIl3);
        final IlIIlIlIIIlIIlIlIlII iIllllIIIlIIIIIIllIl = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIllllIIIlIIIIIIllIl();
        try {
            if (iIllllIIIlIIIIIIllIl.llllIIIIlIIIlIlllIll(ilIllIlIlIIIlIlIlIII, llllIIIIlIIIlIlllIll3) < 1) {
                throw new IIIIlllIIIIIIlIIIlll("commands.execute.allInvocationsFailed", new Object[] { llllIIIIlIIIlIlllIll3 });
            }
        }
        catch (Throwable t) {
            throw new IIIIlllIIIIIIlIIIlll("commands.execute.failed", new Object[] { llllIIIIlIIIlIlllIll3, llllIIIIlIIIlIlllIll.s_() });
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI()) : ((array.length > 1 && array.length <= 4) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 1, ilIlIlIlIlllllllllIl) : ((array.length > 5 && array.length <= 8 && "detect".equals(array[4])) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 5, ilIlIlIlIlllllllllIl) : ((array.length == 9 && "detect".equals(array[4])) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) : null)));
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
