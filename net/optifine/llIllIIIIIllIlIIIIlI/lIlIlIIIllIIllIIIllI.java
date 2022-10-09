package net.optifine.llIllIIIIIllIlIIIIlI;

import java.util.*;
import net.minecraft.client.llIllIIIIIllIlIIIIlI.*;

public class lIlIlIIIllIIllIIIllI extends lIIllIIIllllIlllIllI
{
    protected void IlIlIlIlIlllllllllIl(final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl) {
    }
    
    @Override
    protected void llllIIIIlIIIlIlllIll(final int n, final int n2, final int n3) {
        super.llllIIIIlIIIlIlllIll(n, n2, n3);
        if (n3 == 1) {
            final IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll(n, n2, this.IIlllIIlIllIllIlIIll);
            if (llllIIIIlIIIlIlllIll != null && llllIIIIlIIIlIlllIll.lIlIlIIIllIIllIIIllI) {
                llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(this.IlIlIIIllIIllIlllllI.IlIIlIlIIIlIIlIlIlII());
                this.IlIlIlIlIlllllllllIl(llllIIIIlIIIlIlllIll);
            }
        }
    }
    
    public static IlIIIlIlIIIllIlIlIIl llllIIIIlIIIlIlllIll(final int n, final int n2, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = list.get(i);
            if (ilIIIlIlIIIllIlIlIIl.IlIlIIIllIIllIlllllI) {
                final int llIllIIIIIllIlIIIIlI = llllIlIllllIIlIIlIlI.llIllIIIIIllIlIIIIlI(ilIIIlIlIIIllIlIlIIl);
                final int ilIIIlIlIIIllIlIlIIl2 = llllIlIllllIIlIIlIlI.IlIIIlIlIIIllIlIlIIl(ilIIIlIlIIIllIlIlIIl);
                if (n >= ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII && n2 >= ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII && n < ilIIIlIlIIIllIlIlIIl.lIIIIlIIIIIlllIllIII + llIllIIIIIllIlIIIIlI && n2 < ilIIIlIlIIIllIlIlIIl.lIIIlllIIIllIIIllIII + ilIIIlIlIIIllIlIlIIl2) {
                    return ilIIIlIlIIIllIlIlIIl;
                }
            }
        }
        return null;
    }
}
