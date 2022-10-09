package net.minecraft.IlIlIlIlIlllllllllIl;

import com.google.common.base.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.*;

class IllIIlllllIIllIIllIl implements Predicate
{
    private final /* synthetic */ int llllIIIIlIIIlIlllIll;
    private final /* synthetic */ int IlIlIlIlIlllllllllIl;
    
    IllIIlllllIIllIIllIl(final int llllIIIIlIIIlIlllIll, final int ilIlIlIlIlllllllllIl) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
        this.IlIlIlIlIlllllllllIl = ilIlIlIlIlllllllllIl;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!(llIllIIIIIllIlIIIIlI instanceof IlIIIlIlIIIllIlIlIIl)) {
            return false;
        }
        final IlIIIlIlIIIllIlIlIIl ilIIIlIlIIIllIlIlIIl = (IlIIIlIlIIIllIlIlIIl)llIllIIIIIllIlIIIIlI;
        return (this.llllIIIIlIIIlIlllIll <= -1 || ilIIIlIlIIIllIlIlIIl.L >= this.llllIIIIlIIIlIlllIll) && (this.IlIlIlIlIlllllllllIl <= -1 || ilIIIlIlIIIllIlIlIIl.L <= this.IlIlIlIlIlllllllllIl);
    }
}
