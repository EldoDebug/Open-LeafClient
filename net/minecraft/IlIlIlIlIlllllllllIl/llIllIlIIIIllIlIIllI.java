package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIllllIlIlIIIIll.*;
import net.minecraft.IlllllllIIIlIIIlIlII.*;
import java.util.*;

public class llIllIlIIIIllIlIIllI extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "effect";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 2;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.effect.usage";
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        if (array.length < 2) {
            throw new llllIllllIllllIlIlII("commands.effect.usage", new Object[0]);
        }
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, array[0], lllIIIIlllllIlIIllIl.class);
        if (array[1].equals("clear")) {
            if (lllIIIIlllllIlIIllIl.L().isEmpty()) {
                throw new IIIIlllIIIIIIlIIIlll("commands.effect.failure.notActive.all", new Object[] { lllIIIIlllllIlIIllIl.s_() });
            }
            lllIIIIlllllIlIIllIl.K();
            net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.effect.success.removed.all", lllIIIIlllllIlIIllIl.s_());
        }
        else {
            int n;
            try {
                n = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1], 1);
            }
            catch (lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl) {
                final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[1]);
                if (llllIIIIlIIIlIlllIll == null) {
                    throw liIlIIIlIllIlIllIIIl;
                }
                n = llllIIIIlIIIlIlllIll.llllllIllIllIlIllllI;
            }
            int n2 = 600;
            int llllIIIIlIIIlIlllIll2 = 30;
            int llllIIIIlIIIlIlllIll3 = 0;
            if (n < 0 || n >= net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll.length || net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[n] == null) {
                throw new lIIlIIIlIllIlIllIIIl("commands.effect.notFound", new Object[] { n });
            }
            final net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll llllIIIIlIIIlIlllIll4 = net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll[n];
            if (array.length >= 3) {
                llllIIIIlIIIlIlllIll2 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[2], 0, 1000000);
                if (llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI()) {
                    n2 = llllIIIIlIIIlIlllIll2;
                }
                else {
                    n2 = llllIIIIlIIIlIlllIll2 * 20;
                }
            }
            else if (llllIIIIlIIIlIlllIll4.llIllIIIIIllIlIIIIlI()) {
                n2 = 1;
            }
            if (array.length >= 4) {
                llllIIIIlIIIlIlllIll3 = net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[3], 0, 255);
            }
            boolean b = true;
            if (array.length >= 5 && "true".equalsIgnoreCase(array[4])) {
                b = false;
            }
            if (llllIIIIlIIIlIlllIll2 > 0) {
                final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = new IlIIIlIlIIIllIlIlIIl(n, n2, llllIIIIlIIIlIlllIll3, false, b);
                lllIIIIlllllIlIIllIl.llllIIIIlIIIlIlllIll(ilIIIlIlIIIllIlIlIIl);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.effect.success", new IIllIIllIIIlIlIIIIlI(ilIIIlIlIIIllIlIlIIl.IllIIlllIIIIlllIIlIl(), new Object[0]), n, llllIIIIlIIIlIlllIll3, lllIIIIlllllIlIIllIl.s_(), llllIIIIlIIIlIlllIll2);
            }
            else {
                if (!lllIIIIlllllIlIIllIl.IlIlIIIllIIllIlllllI(n)) {
                    throw new IIIIlllIIIIIIlIIIlll("commands.effect.failure.notActive", new Object[] { new IIllIIllIIIlIlIIIIlI(llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl(), new Object[0]), lllIIIIlllllIlIIllIl.s_() });
                }
                lllIIIIlllllIlIIllIl.llllIIllllIlIlIIIIll(n);
                net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, this, "commands.effect.success.removed", new IIllIIllIIIlIlIIIIlI(llllIIIIlIIIlIlllIll4.IlIIIlIlIIIllIlIlIIl(), new Object[0]), lllIIIIlllllIlIIllIl.s_());
            }
        }
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        return (array.length == 1) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, this.IlIIIlIlIIIllIlIlIIl()) : ((array.length == 2) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, net.minecraft.llllIIllllIlIlIIIIll.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll()) : ((array.length == 5) ? net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, "true", "false") : null));
    }
    
    protected String[] IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().llllllIllIllIlIllllI();
    }
    
    @Override
    public boolean IlIlIlIlIlllllllllIl(final String[] array, final int n) {
        return n == 0;
    }
}
