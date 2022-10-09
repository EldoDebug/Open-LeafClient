package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IlIlIIIllIIllIlllllI.llIllIIIIIllIlIIIIlI.IlIlIlIlIlllllllllIl.*;
import net.minecraft.IlIlIIIllIIllIlllllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class IlIlIllllllllIIIIlII extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "playsound";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.playsound.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 2) {
            throw new llllIllllIllllIlIlII(this.llIllIIIIIllIlIIIIlI(illIlIIllIllIIlIllII), new Object[0]);
        }
        int n = 0;
        final String s = array[n++];
        final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[n++]);
        final e j_ = illIlIIllIllIIlIllII.j_();
        double n2 = j_.llllIIIIlIIIlIlllIll;
        if (array.length > n) {
            n2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n2, array[n++], true);
        }
        double n3 = j_.IlIlIlIlIlllllllllIl;
        if (array.length > n) {
            n3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n3, array[n++], 0, 0, false);
        }
        double n4 = j_.llIllIIIIIllIlIIIIlI;
        if (array.length > n) {
            n4 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl(n4, array[n++], true);
        }
        double llllIIIIlIIIlIlllIll2 = 1.0;
        if (array.length > n) {
            llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n++], 0.0, 3.4028234663852886E38);
        }
        double llllIIIIlIIIlIlllIll3 = 1.0;
        if (array.length > n) {
            llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n++], 0.0, 2.0);
        }
        double llllIIIIlIIIlIlllIll4 = 0.0;
        if (array.length > n) {
            llllIIIIlIIIlIlllIll4 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[n], 0.0, 1.0);
        }
        if (llllIIIIlIIIlIlllIll.IllIIlllIIIIlllIIlIl(n2, n3, n4) > ((llllIIIIlIIIlIlllIll2 > 1.0) ? (llllIIIIlIIIlIlllIll2 * 16.0) : 16.0)) {
            if (llllIIIIlIIIlIlllIll4 <= 0.0) {
                throw new IIIIlllIIIIIIlIIIlll("commands.playsound.playerTooFar", new Object[] { llllIIIIlIIIlIlllIll.s_() });
            }
            final double n5 = n2 - llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl;
            final double n6 = n3 - llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII;
            final double n7 = n4 - llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII;
            final double sqrt = Math.sqrt(n5 * n5 + n6 * n6 + n7 * n7);
            if (sqrt > 0.0) {
                n2 = llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl + n5 / sqrt * 2.0;
                n3 = llllIIIIlIIIlIlllIll.llIIIlIlIllIIlIlIlII + n6 / sqrt * 2.0;
                n4 = llllIIIIlIIIlIlllIll.lllllIlIIIlIlIIlllII + n7 / sqrt * 2.0;
            }
            llllIIIIlIIIlIlllIll2 = llllIIIIlIIIlIlllIll4;
        }
        llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(new IllIllIlllIllllIIllI(s, n2, n3, n4, (float)llllIIIIlIIIlIlllIll2, (float)llllIIIIlIIIlIlllIll3));
        net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.playsound.success", s, llllIIIIlIIIlIlllIll.s_());
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI()) : ((array.length > 2 && array.length <= 5) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, 2, ilIlIlIlIlllllllllIl) : null);
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 1;
    }
}
