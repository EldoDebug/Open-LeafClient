package net.minecraft.IlllllllIIIlIIIlIlII;

import com.google.common.base.*;
import net.minecraft.llIllIlIIIIllIlIIllI.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.*;
import net.minecraft.llllIIIlIlllIlIIIIIl.IlIIIlIlIIIllIlIlIIl.*;

public class IIllllIIIlIIIIIIllIl implements Predicate
{
    private final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll;
    
    public IIllllIIIlIIIIIIllIl(final lllIIIIlIlIllIIlIIIl llllIIIIlIIIlIlllIll) {
        this.llllIIIIlIIIlIlllIll = llllIIIIlIIIlIlllIll;
    }
    
    public boolean llllIIIIlIIIlIlllIll(final llIllIIIIIllIlIIIIlI llIllIIIIIllIlIIIIlI) {
        if (!llIllIIIIIllIlIIIIlI.llllIllllIllllIlIlII()) {
            return false;
        }
        if (!(llIllIIIIIllIlIIIIlI instanceof lllIIIIlllllIlIIllIl)) {
            return false;
        }
        final lllIIIIlllllIlIIllIl lllIIIIlllllIlIIllIl = (lllIIIIlllllIlIIllIl)llIllIIIIIllIlIIIIlI;
        return lllIIIIlllllIlIIllIl.llIllIIIIIllIlIIIIlI(IlIllIlIlIIIlIlIlIII.IlIlIlIlIlllllllllIl(this.llllIIIIlIIIlIlllIll)) == null && ((lllIIIIlllllIlIIllIl instanceof IlIllIlIlIIIlIlIlIII) ? ((IlIllIlIlIIIlIlIlIII)lllIIIIlllllIlIIllIl).q() : (lllIIIIlllllIlIIllIl instanceof llllIIIIlIIIlIlllIll || lllIIIIlllllIlIIllIl instanceof net.minecraft.llllIIIlIlllIlIIIIIl.llllIIIlIlllIlIIIIIl.llllIIIIlIIIlIlllIll));
    }
}
