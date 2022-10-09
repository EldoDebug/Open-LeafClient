package net.minecraft.IlllllllIIIlIIIlIlII;

import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.IlIlIlIlIlllllllllIl.*;
import java.util.*;

public class IlIlIIIllIIllIlllllI
{
    public static llIIIIIIlIllIIlIIIll llllIIIIlIIIlIlllIll(final IllIlIIllIllIIlIllII illIlIIllIllIIlIllII, final llIIIIIIlIllIIlIIIll llIIIIIIlIllIIlIIIll, final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        llIIIIIIlIllIIlIIIll ilIlIlIlIlllllllllIl2;
        if (llIIIIIIlIllIIlIIIll instanceof IIIIlllIIIIIIlIIIlll) {
            final IIIIlllIIIIIIlIIIlll iiiIlllIIIIIIlIIIlll = (IIIIlllIIIIIIlIIIlll)llIIIIIIlIllIIlIIIll;
            String s = iiiIlllIIIIIIlIIIlll.llllIIIIlIIIlIlllIll();
            if (lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(s)) {
                final List ilIlIlIlIlllllllllIl = lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, s, llIllIIIIIllIlIIIIlI.class);
                if (ilIlIlIlIlllllllllIl.size() != 1) {
                    throw new IlIllllIIlIIlIlIlIll();
                }
                s = ilIlIlIlIlllllllllIl.get(0).s_();
            }
            ilIlIlIlIlllllllllIl2 = ((llIllIIIIIllIlIIIIlI != null && s.equals("*")) ? new IIIIlllIIIIIIlIIIlll(llIllIIIIIllIlIIIIlI.s_(), iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl()) : new IIIIlllIIIIIIlIIIlll(s, iiiIlllIIIIIIlIIIlll.IlIlIlIlIlllllllllIl()));
            ((IIIIlllIIIIIIlIIIlll)ilIlIlIlIlllllllllIl2).llllIIIIlIIIlIlllIll(iiiIlllIIIIIIlIIIlll.llIllIIIIIllIlIIIIlI());
        }
        else if (llIIIIIIlIllIIlIIIll instanceof llllIIllllIlIlIIIIll) {
            ilIlIlIlIlllllllllIl2 = lIlIlIlllIIlIlIlllIl.IlIlIlIlIlllllllllIl(illIlIIllIllIIlIllII, ((llllIIllllIlIlIIIIll)llIIIIIIlIllIIlIIIll).llllIIIIlIIIlIlllIll());
            if (ilIlIlIlIlllllllllIl2 == null) {
                ilIlIlIlIlllllllllIl2 = new IlIlIIIIIIlllIlIllIl("");
            }
        }
        else if (llIIIIIIlIllIIlIIIll instanceof IlIlIIIIIIlllIlIllIl) {
            ilIlIlIlIlllllllllIl2 = new IlIlIIIIIIlllIlIllIl(((IlIlIIIIIIlllIlIllIl)llIIIIIIlIllIIlIIIll).llllIIIIlIIIlIlllIll());
        }
        else {
            if (!(llIIIIIIlIllIIlIIIll instanceof IIllIIllIIIlIlIIIIlI)) {
                return llIIIIIIlIllIIlIIIll;
            }
            final Object[] llIIlIIIlIIIllIlIIIl = ((IIllIIllIIIlIlIIIIlI)llIIIIIIlIllIIlIIIll).llIIlIIIlIIIllIlIIIl();
            for (int i = 0; i < llIIlIIIlIIIllIlIIIl.length; ++i) {
                final Object o = llIIlIIIlIIIllIlIIIl[i];
                if (o instanceof llIIIIIIlIllIIlIIIll) {
                    llIIlIIIlIIIllIlIIIl[i] = llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, (llIIIIIIlIllIIlIIIll)o, llIllIIIIIllIlIIIIlI);
                }
            }
            ilIlIlIlIlllllllllIl2 = new IIllIIllIIIlIlIIIIlI(((IIllIIllIIIlIlIIIIlI)llIIIIIIlIllIIlIIIll).IlIIIlIlIIIllIlIlIIl(), llIIlIIIlIIIllIlIIIl);
        }
        final IlIlIIIlIIlIlIIlllIl llllIIIlIlllIlIIIIIl = llIIIIIIlIllIIlIIIll.llllIIIlIlllIlIIIIIl();
        if (llllIIIlIlllIlIIIIIl != null) {
            ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIlIlllIlIIIIIl.lIlIlIIIllIIllIIIllI());
        }
        final Iterator<llIIIIIIlIllIIlIIIll> iterator = (Iterator<llIIIIIIlIllIIlIIIll>)llIIIIIIlIllIIlIIIll.IllIIlllIIIIlllIIlIl().iterator();
        while (iterator.hasNext()) {
            ilIlIlIlIlllllllllIl2.llllIIIIlIIIlIlllIll(llllIIIIlIIIlIlllIll(illIlIIllIllIIlIllII, iterator.next(), llIllIIIIIllIlIIIIlI));
        }
        return ilIlIlIlIlllllllllIl2;
    }
}
