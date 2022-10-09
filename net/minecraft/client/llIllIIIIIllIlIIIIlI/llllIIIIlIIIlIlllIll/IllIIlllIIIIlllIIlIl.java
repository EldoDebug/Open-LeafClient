package net.minecraft.client.llIllIIIIIllIlIIIIlI.llllIIIIlIIIlIlllIll;

import java.util.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.IIIlIIIlIlIIlllIIlll.*;

class IllIIlllIIIIlllIIlIl implements Comparator
{
    final /* synthetic */ IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll;
    
    IllIIlllIIIIlllIIlIl(final IlIlIIIllIllIIIIIllI llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public int llllIIIIlIIIlIlllIll(final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI, final lIlIlIIIllIIllIIIllI lIlIlIIIllIIllIIIllI2) {
        final int llllIIIIlIIIlIlllIll = IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI.llllIIIIlIIIlIlllIll());
        final int llllIIIIlIIIlIlllIll2 = IlIIIlIlIIIllIlIlIIl.llllIIIIlIIIlIlllIll(lIlIlIIIllIIllIIIllI2.llllIIIIlIIIlIlllIll());
        net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl = null;
        net.minecraft.IIIlIIIlIlIIlllIIlll.IllIIlllIIIIlllIIlIl illIIlllIIIIlllIIlIl2 = null;
        if (this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII == 2) {
            illIIlllIIIIlllIIlIl = IIIIlllIIIIIIlIIIlll.lIIIIlIlIllllIIlIllI[llllIIIIlIIIlIlllIll];
            illIIlllIIIIlllIIlIl2 = IIIIlllIIIIIIlIIIlll.lIIIIlIlIllllIIlIllI[llllIIIIlIIIlIlllIll2];
        }
        else if (this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII == 0) {
            illIIlllIIIIlllIIlIl = IIIIlllIIIIIIlIIIlll.llIIIlIlllIllIIlIllI[llllIIIIlIIIlIlllIll];
            illIIlllIIIIlllIIlIl2 = IIIIlllIIIIIIlIIIlll.llIIIlIlllIllIIlIllI[llllIIIIlIIIlIlllIll2];
        }
        else if (this.llllIIIIlIIIlIlllIll.IIlIIIIlllIlllllIlII == 1) {
            illIIlllIIIIlllIIlIl = IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[llllIIIIlIIIlIlllIll];
            illIIlllIIIIlllIIlIl2 = IIIIlllIIIIIIlIIIlll.IlIIllIIllIIllIIlIIl[llllIIIIlIIIlIlllIll2];
        }
        if (illIIlllIIIIlllIIlIl != null || illIIlllIIIIlllIIlIl2 != null) {
            if (illIIlllIIIIlllIIlIl == null) {
                return 1;
            }
            if (illIIlllIIIIlllIIlIl2 == null) {
                return -1;
            }
            final int llllIIIIlIIIlIlllIll3 = this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl);
            final int llllIIIIlIIIlIlllIll4 = this.llllIIIIlIIIlIlllIll.IIlllIlIIllIlIlIlIIl.llIllIlIIIIllIlIIllI.llllIIIIlIIIlIlllIll(illIIlllIIIIlllIIlIl2);
            if (llllIIIIlIIIlIlllIll3 != llllIIIIlIIIlIlllIll4) {
                return (llllIIIIlIIIlIlllIll3 - llllIIIIlIIIlIlllIll4) * this.llllIIIIlIIIlIlllIll.IIIlIIlIIIIlllIlllII;
            }
        }
        return llllIIIIlIIIlIlllIll - llllIIIIlIIIlIlllIll2;
    }
}
