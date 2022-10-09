package net.optifine.llIllIIIIIllIlIIIIlI;

import net.optifine.shaders.IlIlIlIlIlllllllllIl.*;
import net.optifine.shaders.llllIIIIlIIIlIlllIll.*;
import net.minecraft.IIllIIllIIIlIlIIIIlI.*;
import net.optifine.*;
import net.optifine.util.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;
import java.util.*;

public class lllIIIIlllllIlIIllIl extends IIlllIIlIllIllIlIIll
{
    @Override
    public String[] llllIIIIlIIIlIlllIll(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl, final int n) {
        if (!(ilIIIlIlIIIllIlIlIIl instanceof llIllIIIIIllIlIIIIlI)) {
            return null;
        }
        return this.llllIIIIlIIIlIlllIll(((llIllIIIIIllIlIIIIlI)ilIIIlIlIIIllIlIlIIl).llIllIIIIIllIlIIIIlI(), n);
    }
    
    private String[] llllIIIIlIIIlIlllIll(final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll, final int n) {
        final String ilIlIIIllIIllIlllllI = iiiIlllIIIIIIlIIIlll.IlIlIIIllIIllIlllllI();
        final String[] ilIlIlIlIlllllllllIl = this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII(iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI()).trim());
        final net.minecraft.client.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll c = llllIIIIlIIIlIlllIll.c();
        String string = null;
        if (!ilIlIIIllIIllIlllllI.equals(iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll()) && c.IIIlIIlIIIIlllIlllII) {
            string = "Åò8" + IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.general.id") + ": " + iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll();
        }
        String string2 = null;
        if (iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII() != null && c.IIIlIIlIIIIlllIlllII) {
            string2 = "Åò8" + IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.general.from") + ": " + llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.lIIIlllIIIllIIIllIII());
        }
        String string3 = null;
        if (iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI() != null && c.IIIlIIlIIIIlllIlllII) {
            string3 = "Åò8" + IlIIlIlIIIlIIlIlIlII.IllIIlllIIIIlllIIlIl() + ": " + (iiiIlllIIIIIIlIIIlll.llIIlIIIlIIIllIlIIIl() ? iiiIlllIIIIIIlIIIlll.IlIIIlIlIIIllIlIlIIl(iiiIlllIIIIIIlIIIlll.IlIlIIIllIllIIIIIllI()) : IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll("of.general.ambiguous"));
        }
        final ArrayList<String> list = new ArrayList<String>();
        list.add(ilIlIIIllIIllIlllllI);
        list.addAll((Collection<?>)Arrays.asList(ilIlIlIlIlllllllllIl));
        if (string != null) {
            list.add(string);
        }
        if (string2 != null) {
            list.add(string2);
        }
        if (string3 != null) {
            list.add(string3);
        }
        return this.llllIIIIlIIIlIlllIll(n, list);
    }
    
    private String[] IlIlIlIlIlllllllllIl(String ilIIIlIlIIIllIlIlIIl) {
        if (ilIIIlIlIIIllIlIlIIl.length() <= 0) {
            return new String[0];
        }
        ilIIIlIlIIIllIlIlIIl = IIIllllllIllIIIlllIl.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl, "//");
        final String[] split = ilIIIlIlIIIllIlIlIIl.split("\\. ");
        for (int i = 0; i < split.length; ++i) {
            split[i] = "- " + split[i].trim();
            split[i] = IIIllllllIllIIIlllIl.IlIlIIIllIllIIIIIllI(split[i], ".");
        }
        return split;
    }
    
    private String[] llllIIIIlIIIlIlllIll(final int n, final List list) {
        final FontRenderer lIlIlIIIllIIllIIIllI = llllIIIIlIIIlIlllIll.lIIIIlIlIllllIIlIllI().lIlIlIIIllIIllIIIllI;
        final ArrayList<String> list2 = new ArrayList<String>();
        for (int i = 0; i < list.size(); ++i) {
            final String s = list.get(i);
            if (s != null && s.length() > 0) {
                final Iterator iterator = lIlIlIIIllIIllIIIllI.llIllIIIIIllIlIIIIlI(s, n).iterator();
                while (iterator.hasNext()) {
                    list2.add(iterator.next());
                }
            }
        }
        return list2.toArray(new String[list2.size()]);
    }
}
