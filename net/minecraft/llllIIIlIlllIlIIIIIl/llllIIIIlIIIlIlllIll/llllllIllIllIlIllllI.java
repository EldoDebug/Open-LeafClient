package net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;

class llllllIllIllIlIllllI implements Predicate
{
    final /* synthetic */ IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll;
    private final /* synthetic */ Predicate IlIlIlIlIlllllllllIl;
    
    llllllIllIllIlIllllI(final IIlIIIIIllIlIIIlIIll llllIIIIlIIIlIlllIll, final Predicate ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl) {
        if (this.IlIlIlIlIlllllllllIl != null && !this.IlIlIlIlIlllllllllIl.apply((Object)lllIIIIlllllIlIIllIl)) {
            return false;
        }
        if (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll) {
            double liiiIlIIIIIlllIllIII = this.llllIIIIlIIIlIlllIll.lIIIIlIIIIIlllIllIII();
            if (lllIIIIlllllIlIIllIl.IIIIIllIIIIlIIIIllIl()) {
                liiiIlIIIIIlllIllIII *= 0.800000011920929;
            }
            if (lllIIIIlllllIlIIllIl.IIIIIIIllllIlIIIIIII()) {
                float o = ((llllIIIIlIIIlIlllIll)lllIIIIlllllIlIIllIl).o();
                if (o < 0.1f) {
                    o = 0.1f;
                }
                liiiIlIIIIIlllIllIII *= 0.7f * o;
            }
            if (lllIIIIlllllIlIIllIl.IlIIIlIlIIIllIlIlIIl(this.llllIIIIlIIIlIlllIll.IlIlIIIllIllIIIIIllI) > liiiIlIIIIIlllIllIII) {
                return false;
            }
        }
        return this.llllIIIIlIIIlIlllIll.llllIIIIlIIIlIlllIll(lllIIIIlllllIlIIllIl, false);
    }
}
