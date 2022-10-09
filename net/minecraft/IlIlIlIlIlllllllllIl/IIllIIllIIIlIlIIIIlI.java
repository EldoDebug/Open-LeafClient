package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.lIlIlIIIllIIllIIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import java.util.*;

public class IIllIIllIIIlIlIIIIlI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "give";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.give.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 2) {
            throw new llllIllllIllllIlIlII("commands.give.usage", new Object[0]);
        }
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[0]);
        final net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl illIIlllIIIIlllIIlIl = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(illIlIIllIllIIlIllII, array[1]);
        final int n = (array.length >= 3) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], 1, 64) : 1;
        final lllIIIIlIlIllIIlIIIl lllIIIIlIlIllIIlIIIl = new lllIIIIlIlIllIIlIIIl(illIIlllIIIIlllIIlIl, n, (array.length >= 4) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[3]) : 0);
        if (array.length >= 5) {
            final String liiiIlIIIIIlllIllIII = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array, 4).lIIIIlIIIIIlllIllIII();
            try {
                lllIIIIlIlIllIIlIIIl.IlIIIlIlIIIllIlIlIIl(IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll(liiiIlIIIIIlllIllIII));
            }
            catch (lIIIlllIIIllIIIllIII liiIlllIIIllIIIllIII) {
                throw new IIIIlllIIIIIIlIIIlll("commands.give.tagError", new Object[] { liiIlllIIIllIIIllIII.getMessage() });
            }
        }
        final boolean llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl);
        if (llllIIIIlIIIlIlllIll2) {
            llllIIIIlIIIlIlllIll.IlllllllIIIlIIIlIlII.llllIIIIlIIIlIlllIll((llIllIIIIIllIlIIIIlI)llllIIIIlIIIlIlllIll, "random.pop", 0.2f, ((llllIIIIlIIIlIlllIll.B().nextFloat() - llllIIIIlIIIlIlllIll.B().nextFloat()) * 0.7f + 1.0f) * 2.0f);
            llllIIIIlIIIlIlllIll.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI();
        }
        if (llllIIIIlIIIlIlllIll2 && lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl <= 0) {
            lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl = 1;
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, n);
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll3 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, false);
            if (llllIIIIlIIIlIlllIll3 != null) {
                llllIIIIlIIIlIlllIll3.IlllllllIIIlIIIlIlII();
            }
        }
        else {
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(lIllllllIIllIlIlIlII.IlIIIlIlIIIllIlIlIIl, n - lllIIIIlIlIllIIlIIIl.IlIlIlIlIlllllllllIl);
            final net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII llllIIIIlIIIlIlllIll4 = llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlIlIllIIlIIIl, false);
            if (llllIIIIlIIIlIlllIll4 != null) {
                llllIIIIlIIIlIlllIll4.IIlllIIlIllIllIlIIll();
                llllIIIIlIIIlIlllIll4.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll.s_());
            }
        }
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.give.success", lllIIIIlIlIllIIlIIIl.lllllIlIIIlIlIIlllII(), n, llllIIIIlIIIlIlllIll.s_());
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl()) : ((array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llIllIlIIIIllIlIIllI.IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI()) : null);
    }
    
    protected String[] IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
