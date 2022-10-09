package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IlIllIlIlIIIlIlIlIII implements Predicate
{
    final /* synthetic */ llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll;
    
    IlIllIlIlIIIlIlIlIII(final llllIIllllIlIlIIIIll llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!(llIllIIIIIllIlIIIIlI instanceof llllIIIIlIIIlIlllIll)) {
            return false;
        }
        if (((llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).K.llllIIIIlIIIlIlllIll) {
            return false;
        }
        double liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
        if (llIllIIIIIllIlIIIIlI.IIIIIllIIIIlIIIIllIl()) {
            liiiIlIIIIIlllIllIII *= 0.800000011920929;
        }
        if (llIllIIIIIllIlIIIIlI.IIIIIIIllllIlIIIIIII()) {
            float o = ((llllIIIIlIIIlIlllIll)llIllIIIIIllIlIIIIlI).o();
            if (o < 0.1f) {
                o = 0.1f;
            }
            liiiIlIIIIIlllIllIII *= 0.7f * o;
        }
        return llIllIIIIIllIlIIIIlI.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl) <= liiiIlIIIIIlllIllIII && IlIIlIlIIIlIIlIlIlII.llllIIIIlIIIlIlllIll(this.llllIIIIlIIIlIlllIll.IlIlIlIlIlllllllllIl, (lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI, false, true);
    }
}
