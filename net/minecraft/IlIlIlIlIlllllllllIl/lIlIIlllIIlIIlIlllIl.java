package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.lllIIIIlllllIlIIllIl.*;

class lIlIIlllIIlIIlIlllIl implements Predicate
{
    private final /* synthetic */ String llllIIIIlIIIlIlllIll;
    private final /* synthetic */ boolean IlIlIlIlIlllllllllIl;
    
    lIlIIlllIIlIIlIlllIl(final String llllIIIIlIIIlIlllIll, final boolean ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!(llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl)) {
            return false;
        }
        final IlIlIIIllIIllIlllllI w = ((lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI).w();
        return ((w == null) ? "" : w.llllIIIIlIIIlIlllIll()).equals(this.llllIIIIlIIIlIlllIll) ^ this.IlIlIlIlIlllllllllIl;
    }
}
