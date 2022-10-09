package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IIIlIIlIIIIlllIlllII.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IIIlIIlIIIIlllIlllII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "particle";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.particle.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 8) {
            throw new llllIllllIllllIlIlII("commands.particle.usage", new Object[0]);
        }
        boolean b = false;
        IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll = null;
        IlIllllIIlIIlIlIlIll[] values;
        for (int length = (values = IlIllllIIlIIlIlIlIll.values()).length, i = 0; i < length; ++i) {
            final IlIllllIIlIIlIlIlIll ilIllllIIlIIlIlIlIll2 = values[i];
            if (ilIllllIIlIIlIlIlIll2.IllIIlllIIIIlllIIlIl()) {
                if (array[0].startsWith(ilIllllIIlIIlIlIlIll2.IlIlIlIlIlllllllllIl())) {
                    b = true;
                    ilIllllIIlIIlIlIlIll = ilIllllIIlIIlIlIlIll2;
                    break;
                }
            }
            else if (array[0].equals(ilIllllIIlIIlIlIlIll2.IlIlIlIlIlllllllllIl())) {
                b = true;
                ilIllllIIlIIlIlIlIll = ilIllllIIlIIlIlIlIll2;
                break;
            }
        }
        if (!b) {
            throw new IIIIlllIIIIIIlIIIlll("commands.particle.notFound", new Object[] { array[0] });
        }
        final String s = array[0];
        final e j_ = illIlIIllIllIIlIllII.j_();
        final double n = (float)net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(j_.llllIIIIlIIIlIlllIll, array[1], true);
        final double n2 = (float)net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(j_.IlIlIlIlIlllllllllIl, array[2], true);
        final double n3 = (float)net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(j_.llIllIIIIIllIlIIIIlI, array[3], true);
        final double n4 = (float)net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(array[4]);
        final double n5 = (float)net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(array[5]);
        final double n6 = (float)net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(array[6]);
        final double n7 = (float)net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llIllIIIIIllIlIIIIlI(array[7]);
        int llllIIIIlIIIlIlllIll = 0;
        if (array.length > 8) {
            llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[8], 0);
        }
        boolean b2 = false;
        if (array.length > 9 && "force".equals(array[9])) {
            b2 = true;
        }
        final IlllllllIIIlIIIlIlII k_ = illIlIIllIllIIlIllII.k_();
        if (k_ instanceof IIIllllllIllIIIlllIl) {
            final IIIllllllIllIIIlllIl iiIllllllIllIIIlllIl = (IIIllllllIllIIIlllIl)k_;
            final int[] array2 = new int[ilIllllIIlIIlIlIlIll.IlIIIlIlIIIllIlIlIIl()];
            if (ilIllllIIlIIlIlIlIll.IllIIlllIIIIlllIIlIl()) {
                final String[] split = array[0].split("_", 3);
                for (int j = 1; j < split.length; ++j) {
                    try {
                        array2[j - 1] = Integer.parseInt(split[j]);
                    }
                    catch (NumberFormatException ex) {
                        throw new IIIIlllIIIIIIlIIIlll("commands.particle.notFound", new Object[] { array[0] });
                    }
                }
            }
            iiIllllllIllIIIlllIl.llllIIIIlIIIlIlllIll(ilIllllIIlIIlIlIlIll, b2, n, n2, n3, llllIIIIlIIIlIlllIll, n4, n5, n6, n7, array2);
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.particle.success", s, Math.max(llllIIIIlIIIlIlllIll, 1));
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, IlIllllIIlIIlIlIlIll.llllIIIIlIIIlIlllIll()) : ((array.length > 1 && array.length <= 4) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 1, ilIlIlIlIlllllllllIl) : ((array.length == 10) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "normal", "force") : null));
    }
}
