package net.minecraft.llllIIIlIlllIlIIIIIl.IlIlIIIllIllIIIIIllI;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class IIIlIIlIIIIlllIlllII implements Predicate
{
    final /* synthetic */ IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Predicate IlIlIlIlIlllllllllIl;
    private final /* synthetic */ llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI;
    
    IIIlIIlIIIIlllIlllII(final IIlIIIIlllIlllllIlII llllIIIIlIIIlIlllIll, final Predicate ilIlIlIlIlllllllllIl, final llIIlIIIlIIIllIlIIIl llIllIIIIIllIlIIIIlI) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
        this.llIllIIIIIllIlIIIIlI = llIllIIIIIllIlIIIIlI;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (this.IlIlIlIlIlllllllllIl != null && !this.IlIlIlIlIlllllllllIl.apply((Object)lllIIIIlllllIlIIllIl)) {
            return false;
        }
        if (lllIIIIlllllIlIIllIl instanceof IlIIIlIlIIIllIlIlIIl) {
            return false;
        }
        if (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll) {
            double llllIIIIlIIIlIlllIll = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
            if (lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl()) {
                llllIIIIlIIIlIlllIll *= 0.800000011920929;
            }
            if (lllIIIIlllllIlIIllIl.IIIIIIIllllIlIIIIIII()) {
                float o = ((llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl).o();
                if (o < 0.1f) {
                    o = 0.1f;
                }
                llllIIIIlIIIlIlllIll *= 0.7f * o;
            }
            if (lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(this.llIllIIIIIllIlIIIIlI) > llllIIIIlIIIlIlllIll) {
                return false;
            }
        }
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, false);
    }
}
