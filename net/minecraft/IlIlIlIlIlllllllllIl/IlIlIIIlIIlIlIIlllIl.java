package net.minecraft.IlIlIlIlIlllllllllIl;

import net.minecraft.IlllllllIIIlIIIlIlII.*;
import net.minecraft.lIIIIlIIIIIlllIllIII.*;
import java.util.*;

public class IlIlIIIlIIlIlIIlllIl extends llllIIIIlIIIlIlllIll
{
    @Override
    public String llIllIIIIIllIlIIIIlI() {
        return "help";
    }
    
    @Override
    public int llllIIIIlIIIlIlllIll() {
        return 0;
    }
    
    @Override
    public String llIllIIIIIllIlIIIIlI(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        return "commands.help.usage";
    }
    
    @Override
    public List IlIlIlIlIlllllllllIl() {
        return Arrays.asList("?");
    }
    
    @Override
    public void llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array) {
        final List ilIIIlIlIIIllIlIlIIl = this.IlIIIlIlIIIllIlIlIIl(illIlIIllIllIIlIllII);
        final int n = (ilIIIlIlIIIllIlIlIIl.size() - 1) / 7;
        int n2;
        try {
            n2 = ((array.length == 0) ? 0 : (net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array[0], 1, n + 1) - 1));
        }
        catch (lIIlIIIlIllIlIllIIIl liIlIIIlIllIlIllIIIl) {
            final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll = this.IlIIIlIlIIIllIlIlIIl().get(array[0]);
            if (llIlIIIIIlIIlIlIIlll != null) {
                throw new llllIllllIllllIlIlII(llIlIIIIIlIIlIlIIlll.llIllIIIIIllIlIIIIlI(illIlIIllIllIIlIllII), new Object[0]);
            }
            if (llIllIIlllllllllllll.llllIIIIlIIIlIlllIll(array[0], -1) != -1) {
                throw liIlIIIlIllIlIllIIIl;
            }
            throw new IIlIIIIlllIlllllIlII();
        }
        final int min = Math.min((n2 + 1) * 7, ilIIIlIlIIIllIlIlIIl.size());
        final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI = new IIllIIllIIIlIlIIIIlI("commands.help.header", new Object[] { n2 + 1, n + 1 });
        illIIllIIIlIlIIIIlI.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llIllIIIIIllIlIIIIlI);
        illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI);
        for (int i = n2 * 7; i < min; ++i) {
            final llIlIIIIIlIIlIlIIlll llIlIIIIIlIIlIlIIlll2 = ilIIIlIlIIIllIlIlIIl.get(i);
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI2 = new IIllIIllIIIlIlIIIIlI(llIlIIIIIlIIlIlIIlll2.llIllIIIIIllIlIIIIlI(illIlIIllIllIIlIllII), new Object[0]);
            illIIllIIIlIlIIIIlI2.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(new net.minecraft.lIIIIlIIIIIlllIllIII.llllIIIIlIIIlIlllIll(IlIlIlIlIlllllllllIl.IlIlIIIllIllIIIIIllI, "/" + llIlIIIIIlIIlIlIIlll2.llIllIIIIIllIlIIIIlI() + " "));
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI2);
        }
        if (n2 == 0 && illIlIIllIllIIlIllII instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll) {
            final IIllIIllIIIlIlIIIIlI illIIllIIIlIlIIIIlI3 = new IIllIIllIIIlIlIIIIlI("commands.help.footer", new Object[0]);
            illIIllIIIlIlIIIIlI3.llllIIIlIlllIlIIIIIl().llllIIIIlIIIlIlllIll(IlllIIIIlIIIlIlIlIIl.llIllIlIIIIllIlIIllI);
            illIlIIllIllIIlIllII.llllIIIIlIIIlIlllIll(illIIllIIIlIlIIIIlI3);
        }
    }
    
    protected List IlIIIlIlIIIllIlIlIIl(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII) {
        final List llllIIIIlIIIlIlllIll = net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIllllIIIlIIIIIIllIl().llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII);
        Collections.sort((List<Comparable>)llllIIIIlIIIlIlllIll);
        return llllIIIIlIIIlIlllIll;
    }
    
    protected Map IlIIIlIlIIIllIlIlIIl() {
        return net.minecraft.IlIlIIIIIIlllIlIllIl.llllIIIIlIIIlIlllIll.IIIIIllIIIIlIIIIllIl().IIllllIIIlIIIIIIllIl().llllIIIIlIIIlIlllIll();
    }
    
    @Override
    public List llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final String[] array, final net.minecraft.IlllllllIIIlIIIlIlII.IlIlIlIlIlllllllllIl ilIlIlIlIlllllllllIl) {
        if (array.length == 1) {
            final Set keySet = this.IlIIIlIlIIIllIlIlIIl().keySet();
            return net.minecraft.IlIlIlIlIlllllllllIl.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(array, (String[])keySet.toArray(new String[keySet.size()]));
        }
        return null;
    }
}
